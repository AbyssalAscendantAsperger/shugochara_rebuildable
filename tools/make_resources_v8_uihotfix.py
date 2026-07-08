#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""UI hotfix for V8.

Patch directly the image atlas embedded in res/bin/uires.bin.
This fixes the still-visible Chinese UI labels on the tested V8 JAR:
- main menu
- property screen
- equipment screen
- skill screen
- system menu

Approach:
- parse uires.bin
- decode AQ #3 to a PNG image
- replace the text sub-rects with Latin/VN no-dau labels
- write AQ #3 back as a direct PNG blob (f=0)
- rebuild uires.bin offsets safely
"""
from __future__ import annotations
from pathlib import Path
from PIL import Image, ImageDraw, ImageFont
import io, json, struct, zlib, hashlib, shutil

ROOT = Path('.')
RES = ROOT / 'res/bin/uires.bin'
BACKUP_DIR = ROOT / 'backups_v8_uihotfix'
REPORT_DIR = ROOT / 'reports'
FONT = '/usr/share/fonts/truetype/dejavu/DejaVuSans-Bold.ttf'
AQ_INDEX = 3

# sub-id => (replacement_text, style)
REPL = {
    0: ('Gold', 'gold'),
    2: ('Lv', 'cyan'),
    4: ('Danh', 'cyan'),
    5: ('HP', 'cyan'),
    6: ('MP', 'cyan'),
    7: ('ATK', 'cyan'),
    8: ('CRT', 'cyan'),
    9: ('SPD', 'cyan'),
    10: ('DEF', 'cyan'),
    11: ('EXP', 'cyan'),
    12: ('Tro ve', 'button'),
    13: ('NV', 'gold'),
    14: ('Vat lieu', 'gold'),
    15: ('Vat pham', 'gold'),
    16: ('Tui do', 'button'),
    17: ('OK', 'button'),
    18: ('Vat pham', 'gold'),
    20: ('NV', 'gold'),
    21: ('Phong cu', 'cyan'),
    22: ('', 'cyan'),
    23: ('Tr.suc', 'cyan'),
    24: ('Vu khi', 'cyan'),
    25: ('Trang bi', 'gold'),
    29: ('Ky nang', 'gold'),
    30: ('Diem KN', 'cyan'),
    31: ('Up', 'button'),
    32: ('VP', 'gold'),
    33: ('Dien', 'cyan'),
    34: ('NV', 'gold'),
    35: ('Ve', 'gold'),
    36: ('Pet', 'gold'),
    37: ('Tong', 'gold'),
    38: ('Chinh', 'gold'),
    39: ('Phu', 'gold'),
    40: ('Bo', 'button'),
    41: ('Chinh', 'gold'),
    42: ('Phu', 'gold'),
    43: ('Tro ve', 'button'),
    44: ('Trang bi', 'gold'),
    45: ('Thuoc', 'gold'),
    46: ('VP', 'gold'),
    47: ('Thuoc', 'gold'),
    48: ('Tui do', 'gold'),
    49: ('Pet', 'gold'),
    51: ('Tui do', 'gold'),
    52: ('Thuoc', 'gold'),
    53: ('Ky nang', 'gold'),
    54: ('Danh', 'gold'),
    55: ('He thong', 'gold'),
    56: ('Trang bi', 'gold'),
    63: ('Luu', 'button'),
    64: ('Help', 'button'),
    65: ('Ve menu', 'button'),
    66: ('Nhac', 'button'),
    67: ('Danh', 'button'),
    68: ('He thong', 'gold'),
}

STYLES = {
    'cyan':   {'fill': (130, 235, 235, 255), 'stroke': (40, 110, 120, 255), 'sw': 0, 'max': 12},
    'gold':   {'fill': (255, 225,  70, 255), 'stroke': (80,  35,  10, 255), 'sw': 1, 'max': 12},
    'button': {'fill': (255, 255, 255, 255), 'stroke': ( 0,  70, 120, 255), 'sw': 1, 'max': 10},
}


def sha256_bytes(data: bytes) -> str:
    return hashlib.sha256(data).hexdigest()


def ensure_backup(path: Path) -> None:
    BACKUP_DIR.mkdir(parents=True, exist_ok=True)
    dst = BACKUP_DIR / path.name
    if not dst.exists():
        shutil.copy2(path, dst)


def decode_png_from_palette_blob(g: bytes, palette_len: int, h: bytes) -> bytes:
    hb = bytearray(h)
    n = 8
    plte_off = plte_len = None
    while n + 8 <= len(hb):
        ln = int.from_bytes(hb[n:n+4], 'big')
        typ = bytes(hb[n+4:n+8])
        if typ == b'PLTE':
            plte_off = n + 8
            plte_len = ln
            break
        n += 8 + ln + 4
    if plte_off is None:
        raise ValueError('PLTE chunk not found in palette PNG')
    hb[plte_off:plte_off+plte_len] = g[:palette_len]
    crc = zlib.crc32(b'PLTE')
    crc = zlib.crc32(hb[plte_off:plte_off+plte_len], crc)
    hb[plte_off+plte_len:plte_off+plte_len+4] = struct.pack('>I', crc & 0xffffffff)
    return bytes(hb)


def load_aq3_image_and_rects(uires: bytes):
    fp = io.BytesIO(uires)
    fp.read(1)
    num_i = struct.unpack('>h', fp.read(2))[0]
    num_aq = struct.unpack('>h', fp.read(2))[0]
    ioffs = [struct.unpack('>i', fp.read(4))[0] for _ in range(num_i + 1)]
    base_i = fp.tell()
    fp.seek(base_i + ioffs[-1])
    aoffs = [struct.unpack('>i', fp.read(4))[0] for _ in range(num_aq + 1)]
    base_a = fp.tell()
    start = base_a + aoffs[AQ_INDEX]
    end = base_a + aoffs[AQ_INDEX + 1]
    aq_blob = uires[start:end]

    fp2 = io.BytesIO(aq_blob)
    comp_flag = fp2.read(1)[0]  # 0 means has rect table in this game
    frame_count = struct.unpack('>h', fp2.read(2))[0]
    widths_heights = [struct.unpack('>h', fp2.read(2))[0] for _ in range(frame_count * 2)]
    src_xy = [struct.unpack('>h', fp2.read(2))[0] for _ in range(frame_count * 2)]
    pal_count = fp2.read(1)[0]
    pal_bytes = struct.unpack('>h', fp2.read(2))[0]
    if pal_bytes > 0:
        g = fp2.read(pal_count * pal_bytes)
        hlen = struct.unpack('>i', fp2.read(4))[0]
        h = fp2.read(hlen)
        png = decode_png_from_palette_blob(g, pal_bytes, h)
        direct_mode = False
    else:
        hlen = struct.unpack('>i', fp2.read(4))[0]
        png = fp2.read(hlen)
        direct_mode = True

    img = Image.open(io.BytesIO(png)).convert('RGBA')
    meta = {
        'aq_blob_start': start,
        'aq_blob_end': end,
        'comp_flag': comp_flag,
        'frame_count': frame_count,
        'widths_heights': widths_heights,
        'src_xy': src_xy,
        'pal_count': pal_count,
        'pal_bytes': pal_bytes,
        'direct_mode_before': direct_mode,
        'num_i': num_i,
        'num_aq': num_aq,
        'ioffs': ioffs,
        'aoffs': aoffs,
        'base_i': base_i,
        'base_a': base_a,
    }
    return img, meta


def best_font(draw: ImageDraw.ImageDraw, text: str, w: int, h: int, maxsize: int, minsize: int, stroke: int):
    for size in range(maxsize, minsize - 1, -1):
        font = ImageFont.truetype(FONT, size=size)
        bb = draw.multiline_textbbox((0, 0), text, font=font, spacing=0, stroke_width=stroke)
        if bb[2] - bb[0] <= w and bb[3] - bb[1] <= h:
            return font, bb
    font = ImageFont.truetype(FONT, size=minsize)
    bb = draw.multiline_textbbox((0, 0), text, font=font, spacing=0, stroke_width=stroke)
    return font, bb


def patch_aq3_png(img: Image.Image, widths_heights, src_xy) -> Image.Image:
    img = img.copy()
    for idx, (text, sty) in REPL.items():
        sx, sy = src_xy[idx * 2], src_xy[idx * 2 + 1]
        w, h = widths_heights[idx * 2], widths_heights[idx * 2 + 1]
        img.paste(Image.new('RGBA', (w, h), (255, 255, 255, 0)), (sx, sy))
        if not text:
            continue
        layer = Image.new('RGBA', (w, h), (255, 255, 255, 0))
        draw = ImageDraw.Draw(layer)
        st = STYLES[sty]
        font, bb = best_font(draw, text, w, h, st['max'], 5, st['sw'])
        tw, th = bb[2] - bb[0], bb[3] - bb[1]
        x = (w - tw) // 2 - bb[0]
        y = (h - th) // 2 - bb[1]
        draw.multiline_text((x, y), text, font=font, fill=st['fill'], stroke_width=st['sw'], stroke_fill=st['stroke'], spacing=0, align='center')
        img.alpha_composite(layer, (sx, sy))
    return img


def build_direct_aq_blob(meta, patched_png_bytes: bytes) -> bytes:
    out = io.BytesIO()
    out.write(bytes([meta['comp_flag']]))
    out.write(struct.pack('>h', meta['frame_count']))
    for v in meta['widths_heights']:
        out.write(struct.pack('>h', v))
    for v in meta['src_xy']:
        out.write(struct.pack('>h', v))
    out.write(bytes([meta['pal_count']]))
    out.write(struct.pack('>h', 0))  # force direct PNG mode
    out.write(struct.pack('>i', len(patched_png_bytes)))
    out.write(patched_png_bytes)
    return out.getvalue()


def rebuild_uires(uires: bytes, new_aq_blob: bytes, meta) -> bytes:
    # Keep i section unchanged. Rebuild aq offset table and aq blobs.
    i_region = uires[:meta['base_i'] + meta['ioffs'][-1]]
    old_aq_blobs = []
    for i in range(meta['num_aq']):
        start = meta['base_a'] + meta['aoffs'][i]
        end = meta['base_a'] + meta['aoffs'][i + 1]
        old_aq_blobs.append(uires[start:end])
    old_aq_blobs[AQ_INDEX] = new_aq_blob

    aq_offsets = [0]
    total = 0
    for blob in old_aq_blobs:
        total += len(blob)
        aq_offsets.append(total)

    out = io.BytesIO()
    out.write(i_region)
    for off in aq_offsets:
        out.write(struct.pack('>i', off))
    for blob in old_aq_blobs:
        out.write(blob)
    return out.getvalue()


def main():
    REPORT_DIR.mkdir(exist_ok=True)
    ensure_backup(RES)
    before = RES.read_bytes()

    aq3_img, meta = load_aq3_image_and_rects(before)
    patched_img = patch_aq3_png(aq3_img, meta['widths_heights'], meta['src_xy'])

    png_io = io.BytesIO()
    patched_img.save(png_io, format='PNG')
    patched_png = png_io.getvalue()

    new_aq_blob = build_direct_aq_blob(meta, patched_png)
    after = rebuild_uires(before, new_aq_blob, meta)
    RES.write_bytes(after)

    (REPORT_DIR / 'v8_uihotfix_aq3_preview.png').write_bytes(patched_png)
    report = {
        'version': 'v8-uihotfix',
        'target': 'res/bin/uires.bin',
        'aq_index_patched': AQ_INDEX,
        'before_size': len(before),
        'after_size': len(after),
        'before_sha256': sha256_bytes(before),
        'after_sha256': sha256_bytes(after),
        'replaced_sub_count': len(REPL),
    }
    (REPORT_DIR / 'v8_uihotfix_validation.json').write_text(json.dumps(report, ensure_ascii=False, indent=2), encoding='utf-8')
    print(json.dumps(report, ensure_ascii=False, indent=2))


if __name__ == '__main__':
    main()
