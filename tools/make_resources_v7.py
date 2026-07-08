#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""V7 resource patcher.

Sua dung cac UI label trong gameData.bin ma ban V6 chua cham toi dung cho.
Muc tieu: doi cac nhan ngan/label de giu mau sac goc nhung hien chu Viet/Anh.
Chi patch exact-match chuoi UTF-8 co prefix do dai, khong sua bua.
"""
from __future__ import annotations
from pathlib import Path
import json, hashlib, shutil

ROOT = Path('.')
BACKUP_DIR = ROOT / 'backups_v7'
REPORT_DIR = ROOT / 'reports'

GAME_LABEL_MAP = {
    # user-facing stat labels / short UI labels observed in resource
    '战斗速度': 'SPD',
    '最大hp': 'HP Max',
    '最大mp': 'MP Max',
    '物攻': 'ATK',
    '物防': 'DEF',
    '魔攻': 'MATK',
    '魔防': 'MDEF',
    '暴击率': 'CRIT',
    '闪避率': 'EVA',
    '升级经验': 'EXP',
    # keep exact terms the user explicitly asked for too, if they exist in their variant
    '称号': 'Danh hieu',
    '经验': 'EXP',
    '生命': 'HP',
    '魔法': 'MP',
    '攻击': 'ATK',
    '等级': 'Cap',
    '暴击': 'CRIT',
    '移动': 'SPD',
    '防御': 'DEF',
    '金钱': 'Gold',
}


def sha256_bytes(data: bytes) -> str:
    return hashlib.sha256(data).hexdigest()


def ensure_backup(path: Path) -> None:
    BACKUP_DIR.mkdir(parents=True, exist_ok=True)
    dst = BACKUP_DIR / path.name
    if not dst.exists():
        shutil.copy2(path, dst)


def pack_utf(s: str) -> bytes:
    raw = s.encode('utf-8')
    return len(raw).to_bytes(2, 'big') + raw


def replace_len_prefixed_utf8(blob: bytes, mapping: dict[str, str], maxlen: int = 128):
    out = bytearray()
    hits = []
    last = 0
    i = 0
    while i <= len(blob) - 2:
        l = (blob[i] << 8) | blob[i + 1]
        if 1 <= l <= maxlen and i + 2 + l <= len(blob):
            raw = blob[i + 2:i + 2 + l]
            try:
                s = raw.decode('utf-8')
            except UnicodeDecodeError:
                i += 1
                continue
            new_s = mapping.get(s)
            if new_s is not None:
                out += blob[last:i]
                out += pack_utf(new_s)
                hits.append({'offset': i, 'old': s, 'new': new_s})
                last = i + 2 + l
                i = last
                continue
        i += 1
    out += blob[last:]
    return bytes(out), hits


def patch_gamedata_from_bytes(data: bytes):
    n = data[0]
    offs = [int.from_bytes(data[1 + i * 4:1 + (i + 1) * 4], 'big') for i in range(n + 1)]
    base = 1 + 4 * (n + 1)
    if base + offs[-1] != len(data):
        raise ValueError('gameData.bin section table mismatch')
    sections = [data[base + offs[i]: base + offs[i + 1]] for i in range(n)]
    new_sections = []
    all_hits = []
    for si, sec in enumerate(sections):
        new_sec, hits = replace_len_prefixed_utf8(sec, GAME_LABEL_MAP, maxlen=128)
        for h in hits:
            h['section'] = si
        new_sections.append(new_sec)
        all_hits.extend(hits)
    new_offs = [0]
    total = 0
    for sec in new_sections:
        total += len(sec)
        new_offs.append(total)
    out = bytes([n]) + b''.join(x.to_bytes(4, 'big') for x in new_offs) + b''.join(new_sections)
    return out, all_hits


def main():
    REPORT_DIR.mkdir(exist_ok=True)
    gpath = ROOT / 'res/bin/gameData.bin'
    ensure_backup(gpath)
    base_path = BACKUP_DIR / 'gameData.bin'
    base_bytes = base_path.read_bytes() if base_path.exists() else gpath.read_bytes()
    cur_bytes = gpath.read_bytes()

    base_after, base_hits = patch_gamedata_from_bytes(base_bytes)
    cur_after, cur_hits = patch_gamedata_from_bytes(cur_bytes)
    gpath.write_bytes(cur_after)

    report = {
        'version': 'v7',
        'target': 'res/bin/gameData.bin',
        'base_size': len(base_bytes),
        'after_size': len(cur_after),
        'base_sha256': sha256_bytes(base_bytes),
        'after_sha256': sha256_bytes(cur_after),
        'replacement_count_from_base': len(base_hits),
        'replacement_count_on_current': len(cur_hits),
        'label_map': GAME_LABEL_MAP,
    }
    (REPORT_DIR / 'v7_gamedata_rows.txt').write_text(
        '\n'.join(f"section {h['section']} @0x{h['offset']:x}: {h['old']} -> {h['new']}" for h in base_hits) or 'NO MATCH',
        encoding='utf-8'
    )
    (REPORT_DIR / 'v7_gamedata_validation.json').write_text(
        json.dumps(report, ensure_ascii=False, indent=2), encoding='utf-8'
    )
    print(json.dumps(report, ensure_ascii=False, indent=2))


if __name__ == '__main__':
    main()
