#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Liet ke CONSTANT_Utf8 trong Java .class de doi chieu truoc/sau patch."""
from __future__ import annotations
import argparse, re, struct
from pathlib import Path


def mutf8_decode(data: bytes) -> str:
    units = []
    i = 0
    while i < len(data):
        b = data[i]
        if b < 0x80:
            units.append(b); i += 1
        elif (b & 0xE0) == 0xC0:
            units.append(((b & 0x1F) << 6) | (data[i + 1] & 0x3F)); i += 2
        elif (b & 0xF0) == 0xE0:
            units.append(((b & 0x0F) << 12) | ((data[i + 1] & 0x3F) << 6) | (data[i + 2] & 0x3F)); i += 3
        else:
            raise UnicodeDecodeError('mutf8', data, i, i + 1, 'bad byte')
    return b''.join(struct.pack('>H', u) for u in units).decode('utf-16-be', 'surrogatepass')


def list_utf8(path: Path):
    data = path.read_bytes()
    if data[:4] != b'\xCA\xFE\xBA\xBE':
        raise ValueError(f'{path}: not .class')
    cp_count = struct.unpack_from('>H', data, 8)[0]
    pos = 10
    idx = 1
    while idx < cp_count:
        tag = data[pos]; pos += 1
        if tag == 1:
            ln = struct.unpack_from('>H', data, pos)[0]; pos += 2
            raw = data[pos:pos+ln]; pos += ln
            try:
                s = mutf8_decode(raw)
            except Exception:
                s = '<decode-error>'
            yield idx, ln, s
        elif tag in (3, 4):
            pos += 4
        elif tag in (5, 6):
            pos += 8; idx += 1
        elif tag in (7, 8):
            pos += 2
        elif tag in (9, 10, 11, 12):
            pos += 4
        else:
            raise ValueError(f'{path}: unsupported cp tag {tag} at index {idx}')
        idx += 1


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument('class_file')
    ap.add_argument('--cjk-only', action='store_true')
    ap.add_argument('--contains')
    args = ap.parse_args()
    cjk = re.compile(r'[\u3400-\u9fff]')
    count = 0
    for idx, ln, s in list_utf8(Path(args.class_file)):
        if args.cjk_only and not cjk.search(s):
            continue
        if args.contains and args.contains not in s:
            continue
        print(f'{idx:5d} len={ln:5d} {s}')
        count += 1
    print(f'TOTAL_PRINTED={count}')

if __name__ == '__main__':
    main()
