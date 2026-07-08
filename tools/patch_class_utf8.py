#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Patch CONSTANT_Utf8 trong Java .class mà không recompile source decompiled.
An toàn hơn cho J2ME: giữ nguyên bytecode/logic, chỉ đổi chuỗi hiển thị.
"""
from __future__ import annotations
import argparse, json, struct
from pathlib import Path


def mutf8_encode(s: str) -> bytes:
    out = bytearray()
    utf16 = s.encode('utf-16-be')
    for i in range(0, len(utf16), 2):
        ch = (utf16[i] << 8) | utf16[i+1]
        if 0x0001 <= ch <= 0x007F:
            out.append(ch)
        elif ch <= 0x07FF:
            out.append(0xC0 | ((ch >> 6) & 0x1F))
            out.append(0x80 | (ch & 0x3F))
        else:
            out.append(0xE0 | ((ch >> 12) & 0x0F))
            out.append(0x80 | ((ch >> 6) & 0x3F))
            out.append(0x80 | (ch & 0x3F))
    if len(out) > 65535:
        raise ValueError('CONSTANT_Utf8 too long')
    return bytes(out)


def mutf8_decode(data: bytes) -> str:
    units=[]; i=0
    while i < len(data):
        b=data[i]
        if b < 0x80:
            units.append(b); i += 1
        elif (b & 0xE0) == 0xC0:
            units.append(((b & 0x1F) << 6) | (data[i+1] & 0x3F)); i += 2
        elif (b & 0xF0) == 0xE0:
            units.append(((b & 0x0F) << 12) | ((data[i+1] & 0x3F) << 6) | (data[i+2] & 0x3F)); i += 3
        else:
            raise UnicodeDecodeError('mutf8', data, i, i+1, 'bad byte')
    return b''.join(struct.pack('>H', u) for u in units).decode('utf-16-be', 'surrogatepass')


def patch_class(data: bytes, mapping: dict[str, str]) -> tuple[bytes, int]:
    if data[:4] != b'\xCA\xFE\xBA\xBE':
        raise ValueError('not a class file')
    out = bytearray(data[:10])
    cp_count = struct.unpack_from('>H', data, 8)[0]
    pos = 10
    idx = 1
    changed = 0
    while idx < cp_count:
        tag = data[pos]; pos += 1
        out.append(tag)
        if tag == 1:  # Utf8
            ln = struct.unpack_from('>H', data, pos)[0]; pos += 2
            raw = data[pos:pos+ln]; pos += ln
            try:
                s = mutf8_decode(raw)
            except Exception:
                s = None
            if s in mapping:
                nr = mutf8_encode(mapping[s])
                out += struct.pack('>H', len(nr)) + nr
                changed += 1
            else:
                out += struct.pack('>H', ln) + raw
        elif tag in (3, 4):  # int/float
            out += data[pos:pos+4]; pos += 4
        elif tag in (5, 6):  # long/double, takes 2 cp slots
            out += data[pos:pos+8]; pos += 8; idx += 1
        elif tag in (7, 8):  # class/string
            out += data[pos:pos+2]; pos += 2
        elif tag in (9, 10, 11, 12):
            out += data[pos:pos+4]; pos += 4
        else:
            raise ValueError(f'unsupported cp tag {tag} at cp index {idx}')
        idx += 1
    out += data[pos:]
    return bytes(out), changed


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument('class_file')
    ap.add_argument('mapping_json', help='JSON object: old string -> new string')
    ap.add_argument('-o', '--output')
    args = ap.parse_args()
    p = Path(args.class_file)
    mapping = json.loads(Path(args.mapping_json).read_text(encoding='utf-8'))
    new, changed = patch_class(p.read_bytes(), mapping)
    out = Path(args.output) if args.output else p
    out.write_bytes(new)
    print(f'{p}: changed {changed} constants -> {out}')

if __name__ == '__main__':
    main()
