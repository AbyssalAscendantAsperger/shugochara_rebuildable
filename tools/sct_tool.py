#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Extractor/Repacker cho res/bin/sct.bin của Shugo Chara rebuildable.

Mục tiêu:
- Không sửa byte script nhị phân nếu không cần.
- Giải mã/ xuất toàn bộ lời thoại ở block text thứ 2.
- Import bản dịch, mã hóa Java DataInput.readUTF/writeUTF compatible.
- Tính lại bảng pointer của block text và bảng pointer tổng để tránh lệch offset.
- Có chế độ kiểm tra độ dài để dịch ngắn hơn offset cũ khi muốn an toàn tuyệt đối.

Định dạng sct.bin đã xác nhận từ mã Java:
  byte magic
  block1: short section_count, int offsets[count+1], section data...
  block2: short section_count, int offsets[count+1], section data...

block2/section:
  short string_count
  repeated string_count:
    short ref_count
    short refs[ref_count]
    writeUTF(text)  # u16 byte length + modified UTF-8 bytes
"""
from __future__ import annotations

import argparse
import csv
import io
import json
import shutil
import struct
import sys
import tempfile
import zipfile
from dataclasses import dataclass, asdict
from pathlib import Path
from typing import List, Tuple, Dict, Any


# ---------- Java modified UTF-8 (DataInput.readUTF / DataOutput.writeUTF) ----------

def java_mutf8_encode(s: str) -> bytes:
    """Encode giống DataOutput.writeUTF phần payload (không gồm u16 length)."""
    out = bytearray()
    # Java làm việc trên UTF-16 code units; ký tự ngoài BMP thành surrogate pair.
    utf16 = s.encode("utf-16-be")
    for i in range(0, len(utf16), 2):
        ch = (utf16[i] << 8) | utf16[i + 1]
        if 0x0001 <= ch <= 0x007F:
            out.append(ch)
        elif ch <= 0x07FF:
            out.append(0xC0 | ((ch >> 6) & 0x1F))
            out.append(0x80 | (ch & 0x3F))
        else:
            out.append(0xE0 | ((ch >> 12) & 0x0F))
            out.append(0x80 | ((ch >> 6) & 0x3F))
            out.append(0x80 | (ch & 0x3F))
    if len(out) > 0xFFFF:
        raise ValueError(f"Chuỗi quá dài cho writeUTF: {len(out)} bytes > 65535")
    return bytes(out)


def java_mutf8_decode(data: bytes) -> str:
    """Decode payload của DataInput.readUTF."""
    units: List[int] = []
    i = 0
    n = len(data)
    while i < n:
        b = data[i]
        if b >> 7 == 0:
            # Trong modified UTF-8, NUL không hợp lệ dạng 1 byte, nhưng ta vẫn nhận để cứu dữ liệu.
            units.append(b)
            i += 1
        elif (b & 0xE0) == 0xC0:
            if i + 1 >= n:
                raise UnicodeDecodeError("mutf8", data, i, n, "truncated 2-byte sequence")
            units.append(((b & 0x1F) << 6) | (data[i + 1] & 0x3F))
            i += 2
        elif (b & 0xF0) == 0xE0:
            if i + 2 >= n:
                raise UnicodeDecodeError("mutf8", data, i, n, "truncated 3-byte sequence")
            units.append(((b & 0x0F) << 12) | ((data[i + 1] & 0x3F) << 6) | (data[i + 2] & 0x3F))
            i += 3
        else:
            raise UnicodeDecodeError("mutf8", data, i, i + 1, "invalid modified UTF-8 byte")
    utf16 = bytearray()
    for u in units:
        utf16 += struct.pack(">H", u)
    return bytes(utf16).decode("utf-16-be", errors="surrogatepass")


def pack_utf(s: str) -> bytes:
    raw = java_mutf8_encode(s)
    return struct.pack(">H", len(raw)) + raw


def unpack_utf(buf: bytes, pos: int) -> Tuple[str, int, int, bytes]:
    if pos + 2 > len(buf):
        raise ValueError("EOF khi đọc UTF length")
    ln = struct.unpack_from(">H", buf, pos)[0]
    pos += 2
    raw = buf[pos:pos + ln]
    if len(raw) != ln:
        raise ValueError("EOF khi đọc UTF payload")
    return java_mutf8_decode(raw), pos + ln, ln, raw


# ---------- binary helpers ----------

def u16(buf: bytes, pos: int) -> int:
    return struct.unpack_from(">H", buf, pos)[0]


def i16(buf: bytes, pos: int) -> int:
    return struct.unpack_from(">h", buf, pos)[0]


def u32(buf: bytes, pos: int) -> int:
    return struct.unpack_from(">I", buf, pos)[0]


def pack_table(sections: List[bytes]) -> bytes:
    if len(sections) > 0x7FFF:
        raise ValueError("Quá nhiều section")
    offsets = [0]
    total = 0
    for sec in sections:
        total += len(sec)
        offsets.append(total)
    if total > 0x7FFFFFFF:
        raise ValueError("Block quá lớn")
    return struct.pack(">H", len(sections)) + b"".join(struct.pack(">I", x) for x in offsets) + b"".join(sections)


def read_table(buf: bytes, pos: int, name: str) -> Tuple[List[bytes], List[int], int, int]:
    count = u16(buf, pos)
    table_start = pos
    pos += 2
    offsets = [u32(buf, pos + i * 4) for i in range(count + 1)]
    pos += 4 * (count + 1)
    data_start = pos
    if offsets[0] != 0:
        raise ValueError(f"{name}: offset đầu phải = 0, thấy {offsets[0]}")
    if any(offsets[i] > offsets[i + 1] for i in range(count)):
        raise ValueError(f"{name}: bảng pointer không tăng dần")
    end = data_start + offsets[-1]
    if end > len(buf):
        raise ValueError(f"{name}: pointer cuối vượt EOF")
    sections = [buf[data_start + offsets[i]:data_start + offsets[i + 1]] for i in range(count)]
    return sections, offsets, data_start, end


@dataclass
class SctString:
    section: int
    index: int
    refs: List[int]
    original: str
    original_bytes: int
    soft_limit_bytes: int
    translated: str = ""


@dataclass
class SctFile:
    magic: int
    block1_sections: List[bytes]
    block1_offsets: List[int]
    block2_sections_raw: List[bytes]
    block2_offsets: List[int]
    strings: List[SctString]


def parse_sct(path: Path) -> SctFile:
    buf = path.read_bytes()
    if len(buf) < 8:
        raise ValueError("File quá ngắn")
    magic = buf[0]
    block1, off1, _data1, end1 = read_table(buf, 1, "block1/script")
    block2, off2, _data2, end2 = read_table(buf, end1, "block2/text")
    if end2 != len(buf):
        raise ValueError(f"Có dữ liệu thừa cuối file: {len(buf) - end2} bytes")

    strings: List[SctString] = []
    for sec_id, sec in enumerate(block2):
        if len(sec) < 2:
            raise ValueError(f"section {sec_id} quá ngắn")
        cnt = u16(sec, 0)
        pos = 2
        for idx in range(cnt):
            if pos + 2 > len(sec):
                raise ValueError(f"section {sec_id} EOF tại ref_count string {idx}")
            ref_count = i16(sec, pos)
            pos += 2
            if ref_count < 0:
                raise ValueError(f"section {sec_id} string {idx}: ref_count âm")
            refs = []
            for _ in range(ref_count):
                refs.append(i16(sec, pos))
                pos += 2
            text, pos, byte_len, _raw = unpack_utf(sec, pos)
            strings.append(SctString(
                section=sec_id,
                index=idx,
                refs=refs,
                original=text,
                original_bytes=byte_len,
                # Theo yêu cầu: nếu giới hạn cũ 12 thì nên dùng ~11. Trừ 1 byte để có đệm an toàn.
                soft_limit_bytes=max(0, byte_len - 1),
                translated="",
            ))
        if pos != len(sec):
            raise ValueError(f"section {sec_id}: còn dư {len(sec) - pos} bytes sau khi parse")
    return SctFile(magic, block1, off1, block2, off2, strings)


def build_block2_sections(old_sections: List[bytes], translations: Dict[Tuple[int, int], str], strict_limits: bool = False) -> List[bytes]:
    new_sections: List[bytes] = []
    for sec_id, sec in enumerate(old_sections):
        cnt = u16(sec, 0)
        pos = 2
        out = bytearray(struct.pack(">H", cnt))
        for idx in range(cnt):
            ref_count = i16(sec, pos)
            pos += 2
            refs_raw = sec[pos:pos + ref_count * 2]
            refs = [i16(sec, pos + i * 2) for i in range(ref_count)]
            pos += ref_count * 2
            original, pos2, orig_len, _raw = unpack_utf(sec, pos)
            pos = pos2
            translated = translations.get((sec_id, idx), "")
            has_translation = translated != ""
            text = translated if has_translation else original
            enc_len = len(java_mutf8_encode(text))
            # Chỉ áp dụng strict limit cho dòng thật sự có bản dịch.
            # Nếu cột translated rỗng, tool giữ nguyên câu gốc; không được fail chỉ vì
            # original_bytes tự nhiên lớn hơn soft_limit_bytes = original_bytes - 1.
            if strict_limits and has_translation and enc_len > max(0, orig_len - 1):
                raise ValueError(
                    f"Bản dịch quá dài tại section={sec_id}, index={idx}: "
                    f"{enc_len} bytes > soft_limit {max(0, orig_len - 1)}. Text={text!r}"
                )
            if ref_count != len(refs):
                raise AssertionError("refs parse mismatch")
            out += struct.pack(">h", ref_count)
            out += refs_raw
            out += pack_utf(text)
        if pos != len(sec):
            raise ValueError(f"section {sec_id} dư dữ liệu khi build")
        new_sections.append(bytes(out))
    return new_sections


# ---------- CSV / JSON ----------

def export_csv(sct: SctFile, out_path: Path) -> None:
    out_path.parent.mkdir(parents=True, exist_ok=True)
    with out_path.open("w", encoding="utf-8-sig", newline="") as f:
        w = csv.DictWriter(f, fieldnames=[
            "section", "index", "refs", "original_bytes", "soft_limit_bytes", "original", "translated"
        ])
        w.writeheader()
        for row in sct.strings:
            w.writerow({
                "section": row.section,
                "index": row.index,
                "refs": " ".join(str(x) for x in row.refs),
                "original_bytes": row.original_bytes,
                "soft_limit_bytes": row.soft_limit_bytes,
                "original": row.original,
                "translated": row.translated,
            })


def load_translations_csv(path: Path) -> Dict[Tuple[int, int], str]:
    translations: Dict[Tuple[int, int], str] = {}
    with path.open("r", encoding="utf-8-sig", newline="") as f:
        r = csv.DictReader(f)
        for line_no, row in enumerate(r, 2):
            try:
                sec = int(row["section"])
                idx = int(row["index"])
            except Exception as e:
                raise ValueError(f"CSV dòng {line_no}: thiếu/sai section,index") from e
            text = row.get("translated", "") or ""
            translations[(sec, idx)] = text
    return translations


def export_json(sct: SctFile, out_path: Path) -> None:
    data = [asdict(x) for x in sct.strings]
    out_path.write_text(json.dumps(data, ensure_ascii=False, indent=2), encoding="utf-8")


# ---------- commands ----------

def cmd_export(args: argparse.Namespace) -> None:
    sct = parse_sct(Path(args.input))
    out = Path(args.output)
    if out.suffix.lower() == ".json":
        export_json(sct, out)
    else:
        export_csv(sct, out)
    print(f"OK export: {out}")
    print(f"Magic: 0x{sct.magic:02X}; block1 sections={len(sct.block1_sections)}; block2 sections={len(sct.block2_sections_raw)}; strings={len(sct.strings)}")


def cmd_check(args: argparse.Namespace) -> None:
    sct = parse_sct(Path(args.input))
    translations = load_translations_csv(Path(args.csv)) if args.csv else {}
    too_long = 0
    changed = 0
    for row in sct.strings:
        txt = translations.get((row.section, row.index), "")
        if txt:
            changed += 1
            blen = len(java_mutf8_encode(txt))
            if blen > row.soft_limit_bytes:
                too_long += 1
                print(f"LONG section={row.section} index={row.index}: {blen}>{row.soft_limit_bytes} bytes | {txt}")
    print(f"OK parse. strings={len(sct.strings)}, translated={changed}, over_soft_limit={too_long}")
    if too_long and args.fail_on_long:
        sys.exit(1)


def cmd_import(args: argparse.Namespace) -> None:
    inp = Path(args.input)
    out = Path(args.output)
    sct = parse_sct(inp)
    translations = load_translations_csv(Path(args.csv))
    new_block2 = build_block2_sections(sct.block2_sections_raw, translations, strict_limits=args.strict_limits)
    rebuilt = bytes([sct.magic]) + pack_table(sct.block1_sections) + pack_table(new_block2)
    # Tự parse lại để đảm bảo pointer mới hợp lệ.
    tmp = out.with_suffix(out.suffix + ".tmpcheck")
    out.parent.mkdir(parents=True, exist_ok=True)
    tmp.write_bytes(rebuilt)
    try:
        parse_sct(tmp)
    finally:
        tmp.unlink(missing_ok=True)
    out.write_bytes(rebuilt)
    delta = len(rebuilt) - inp.stat().st_size
    print(f"OK import: {out} ({len(rebuilt)} bytes, delta {delta:+d})")


def cmd_patch_jar(args: argparse.Namespace) -> None:
    jar_in = Path(args.jar)
    sct_in = Path(args.sct)
    jar_out = Path(args.output)
    jar_out.parent.mkdir(parents=True, exist_ok=True)
    with zipfile.ZipFile(jar_in, "r") as zin, zipfile.ZipFile(jar_out, "w", compression=zipfile.ZIP_DEFLATED) as zout:
        names = zin.namelist()
        wrote = False
        for name in names:
            if name == "bin/sct.bin":
                zout.writestr(name, sct_in.read_bytes())
                wrote = True
            else:
                zout.writestr(name, zin.read(name))
        if not wrote:
            zout.writestr("bin/sct.bin", sct_in.read_bytes())
    print(f"OK patch jar: {jar_out}")


def cmd_build_jarroot(args: argparse.Namespace) -> None:
    """Copy repo/res + classes vào jarroot và thay sct.bin mới; tiện khi không muốn compile lại."""
    repo = Path(args.repo)
    jarroot = Path(args.jarroot)
    sct = Path(args.sct)
    if jarroot.exists():
        shutil.rmtree(jarroot)
    jarroot.mkdir(parents=True)
    shutil.copytree(repo / "res", jarroot, dirs_exist_ok=True)
    shutil.copytree(repo / "base_classes", jarroot, dirs_exist_ok=True)
    target = jarroot / "bin" / "sct.bin"
    target.parent.mkdir(parents=True, exist_ok=True)
    shutil.copy2(sct, target)
    print(f"OK jarroot: {jarroot}")
    print(f"Gợi ý pack: python3 {repo/'build_tools'/'make_jar.py'} {jarroot} dist/shugochara_vi_sct.jar")


def make_parser() -> argparse.ArgumentParser:
    p = argparse.ArgumentParser(description="Extractor/Repacker an toàn cho res/bin/sct.bin")
    sub = p.add_subparsers(dest="cmd", required=True)

    e = sub.add_parser("export", help="Xuất lời thoại ra CSV/JSON")
    e.add_argument("input", help="res/bin/sct.bin")
    e.add_argument("output", help="CSV hoặc JSON output")
    e.set_defaults(func=cmd_export)

    c = sub.add_parser("check", help="Kiểm tra CSV dịch: độ dài modified UTF-8/soft limit")
    c.add_argument("input", help="res/bin/sct.bin")
    c.add_argument("--csv", help="CSV bản dịch")
    c.add_argument("--fail-on-long", action="store_true")
    c.set_defaults(func=cmd_check)

    im = sub.add_parser("import", help="Import CSV và rebuild sct.bin với pointer mới")
    im.add_argument("input", help="sct.bin gốc")
    im.add_argument("csv", help="CSV có cột translated")
    im.add_argument("output", help="sct.bin mới")
    im.add_argument("--strict-limits", action="store_true", help="Từ chối dòng translated dài hơn original_bytes-1")
    im.set_defaults(func=cmd_import)

    pj = sub.add_parser("patch-jar", help="Thay bin/sct.bin trong JAR có sẵn")
    pj.add_argument("jar", help="JAR input")
    pj.add_argument("sct", help="sct.bin mới")
    pj.add_argument("output", help="JAR output")
    pj.set_defaults(func=cmd_patch_jar)

    br = sub.add_parser("build-jarroot", help="Tạo jarroot từ repo + sct.bin mới")
    br.add_argument("repo", help="Thư mục repo")
    br.add_argument("sct", help="sct.bin mới")
    br.add_argument("jarroot", help="Thư mục jarroot output")
    br.set_defaults(func=cmd_build_jarroot)

    return p


def main(argv: List[str] | None = None) -> int:
    args = make_parser().parse_args(argv)
    args.func(args)
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
