#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""V6 resource patcher.

Muc tieu:
- qtr.bin: dich phan text nhiem vu con sot sang tieng Viet khong dau.
- dcn.bin: Viet hoa/noi dung canh bao SMS cu theo huong an toan.
- gameData.bin: CHI patch exact-match cac nhan user yeu cau neu thuc su tim thay,
  de tranh sua bua. Neu khong tim thay exact string trong file hien tai, giu nguyen.

Luu y:
- Khong tao file *.bak trong res/ de tranh lot vao JAR.
- Backup lan dau vao backups_v6/.
- Ghi bao cao vao reports/v6_resources_validation.json.
"""
from __future__ import annotations
from pathlib import Path
import json, hashlib, re, shutil

ROOT = Path('.')
BACKUP_DIR = ROOT / 'backups_v6'
REPORT_DIR = ROOT / 'reports'

GAME_EXACT_MAP = {
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

QTR_MAP = {
    '初入勇士岛': 'Den dao Dung Si',
    '来到了一个陌生的岛屿，前往勇士村落打探情况。': 'Den mot dao la. Hay toi lang Dung Si hoi tham tinh hinh.',
    '变异蟹的烦恼': 'Noi lo cua cua bien di',
    '外滩上的变异蟹是我们目前最大的威胁，许多岛民都遭受过他们的伤害，前往东方的外滩，清除那里的变异蟹。': 'Cua bien di o bai Dong la de doa lon nhat hien nay. Nhieu dan dao da bi chung tan cong. Den bai Dong va tieu diet cua bien di o do.',
    '冰山融化': 'Bang son tan',
    '勇士村落的水位正在上升，怀疑是北方的冰山在融化，前往查看！（与村长姜旁边的热气球对话可以传到大地图。）': 'Muc nuoc o lang Dung Si dang tang. Co le bang son phia Bac dang tan. Den kiem tra! (Noi chuyen voi khinh khi cau ben truong lang de ra dai ban do.)',
    '艾尔森林': 'Rung Aier',
    '前往大地图下方的艾尔森林去寻找少女詹德下落。': 'Den Rung Aier o phia duoi dai ban do de tim tung tich co gai Zhan De.',
    '打造通天眼': 'Ren Thong Thien Nhan',
    '寻找打造通天眼的材料，并在铁匠桑坤处锻造。需要星光20 ，海螺壳20，青蛙心20，魔刃2。（杀死海星星有一定机率爆出星光，杀死冰海螺有一定机率爆出海螺壳，杀死青蛙有一定机率爆出青蛙心，杀死魔兔将领有一定机率爆出魔刃，选择的难度越高机率越大。）': 'Tim vat lieu ren Thong Thien Nhan, roi den tho ren Sangkun de che tao. Can: Anh sao 20, Vo oc 20, Tim ech 20, Ma nhan 2. (Diet sao bien co ti le roi Anh sao; diet oc bang co ti le roi Vo oc; diet ech co ti le roi Tim ech; diet tuong ma tho co ti le roi Ma nhan; do kho cang cao, ti le cang lon.)',
    '夜色岛之战': 'Tran chien dao Dem',
    '带上通天眼前往中部的夜色岛查看幻灵所在。': 'Mang theo Thong Thien Nhan den dao Dem o khu trung tam de tim noi cua ao linh.',
    '打造冰晶锁': 'Ren Khoa Bang Tinh',
    '寻找打造冰晶锁的材料，并在铁匠桑坤处锻造。需要冰晶5 ，刀刃4，蛇胆3。（杀死万年冰王有一定机率爆出冰晶，杀死幻灵将领有一定机率爆出刀刃，杀死双头蛇有一定机率爆出蛇胆，选择的难度越高机率越大。）': 'Tim vat lieu ren Khoa Bang Tinh, roi den tho ren Sangkun de che tao. Can: Bang tinh 5, Luoi dao 4, Mat ran 3. (Diet Bang Vuong Van Nien co ti le roi Bang tinh; diet tuong ao linh co ti le roi Luoi dao; diet ran hai dau co ti le roi Mat ran; do kho cang cao, ti le cang lon.)',
    '扎昆之死': 'Diet Zakun',
    '前往南方的扎昆山脉，杀死炎魔之王扎昆。': 'Den day nui Zakun phia Nam, giet vua viem ma Zakun.',
    '打造封魔印': 'Ren An Phong Ma',
    '寻找打造封魔印的材料，并在铁匠桑坤处锻造。需要魔心50，刀刃5，蛇胆5。（杀死扎昆山脉的灯笼怪有一定机率爆出魔心，杀死幻灵将领有一定机率爆出刀刃，杀死双头蛇有一定机率爆出蛇胆，选择的难度越高机率越大。）': 'Tim vat lieu ren An Phong Ma, roi den tho ren Sangkun de che tao. Can: Ma tam 50, Luoi dao 5, Mat ran 5. (Diet quai long den o nui Zakun co ti le roi Ma tam; diet tuong ao linh co ti le roi Luoi dao; diet ran hai dau co ti le roi Mat ran; do kho cang cao, ti le cang lon.)',
    '地下宫殿': 'Cung ngam',
    '前往天下宫殿，处决哈斯曼陛下。': 'Den cung ngam va xu trum Hasman.',
    '调查勇士村落': 'Khao sat lang Dung Si',
    '通关勇士村落所有地图。任务奖励：1000金。': 'Pha dao tat ca map o lang Dung Si. Thuong: 1000 Gold.',
    '收集蟹钳': 'Thu thap cang cua',
    '收集50片蟹钳（杀死变异蟹有一定几率暴蟹钳，难度越高机率越大）。任务奖励：1000金。': 'Thu thap 50 cang cua (diet cua bien di co ti le roi; do kho cang cao, ti le cang lon). Thuong: 1000 Gold.',
    '收集星光': 'Thu thap anh sao',
    '收集3个星光（杀死勇士村落外滩的异型星星有一定几率爆星光，难度越大机率越大。）。任务奖励：1000金': 'Thu thap 3 Anh sao (diet sao la o bai bien lang Dung Si co ti le roi; do kho cang cao, ti le cang lon). Thuong: 1000 Gold.',
    '清理变异蟹': 'Don dep cua bien di',
    '杀死30只变异蟹（要求难度在冒险或以上）。任务奖励：1000金。': 'Diet 30 cua bien di (yeu cau do kho Phieu luu tro len). Thuong: 1000 Gold.',
    '探索冰原': 'Kham pha bang nguyen',
    '通关冰封雪域。任务奖励：1000金。': 'Pha man Bang phong Tuyet vuc. Thuong: 1000 Gold.',
    '收集海螺壳': 'Thu thap vo oc',
    '收集海螺壳50片（杀死海螺有一定几率暴海螺壳，难度越高机率越大。）。任务奖励：1000金。': 'Thu thap 50 vo oc (diet oc bien co ti le roi; do kho cang cao, ti le cang lon). Thuong: 1000 Gold.',
    '勇者试炼': 'Thu luyen dung gia',
    '通关勇士外滩王者级。任务奖励：2000金，技能书1本。': 'Pha man bai bien Dung Si cap Vuong gia. Thuong: 2000 Gold, 1 sach ky nang.',
    '试炼一': 'Thu luyen 1',
    '使用一闪（防御反击）杀死万年冰王（要求难度在勇士或以上）。任务奖励：2000金。': 'Dung Nhat kich (phan kich DEF) giet Bang Vuong Van Nien (do kho Dung si tro len). Thuong: 2000 Gold.',
    '收集冰晶': 'Thu thap bang tinh',
    '收集3个冰晶（杀死万年冰王有一定机率爆出冰晶，难度越高机率越大。）任务奖励：2000金。': 'Thu thap 3 Bang tinh (diet Bang Vuong Van Nien co ti le roi; do kho cang cao, ti le cang lon). Thuong: 2000 Gold.',
    '冰原激战': 'Ac chien bang nguyen',
    '通关冰峰雪域王者级。任务奖励：2000金，技能书1本。': 'Pha man Bang phong Tuyet vuc cap Vuong gia. Thuong: 2000 Gold, 1 sach ky nang.',
    '迈向森林': 'Tien vao rung',
    '通关艾尔森林。任务奖励：2000金。': 'Pha man Rung Aier. Thuong: 2000 Gold.',
    '收集青蛙心': 'Thu thap tim ech',
    '收集20颗青蛙心（杀死青蛙有一定机率爆出青蛙心，难度越高机率越大。）任务奖励：2000金。': 'Thu thap 20 Tim ech (diet ech co ti le roi; do kho cang cao, ti le cang lon). Thuong: 2000 Gold.',
    '清理森林': 'Don dep rung',
    '在艾尔森林杀死30只青蛙。（要求难度在冒险或以上。）任务奖励：2000金。': 'Diet 30 con ech trong Rung Aier (yeu cau do kho Phieu luu tro len). Thuong: 2000 Gold.',
    '森林激战': 'Ac chien trong rung',
    '通关艾尔森林王者级。任务奖励：2000金，技能书一本。': 'Pha man Rung Aier cap Vuong gia. Thuong: 2000 Gold, 1 sach ky nang.',
    '收集石料': 'Thu thap da',
    '收集20块石料（杀死岩石巨人有一定几率暴石料，难度越高几率越大）。任务奖励：2000金。': 'Thu thap 20 vien da (diet nguoi da khong lo co ti le roi; do kho cang cao, ti le cang lon). Thuong: 2000 Gold.',
    '进军沼泽': 'Tien quan dam lay',
    '通关迪迦沼泽。任务奖励：2000金。': 'Pha man Dam lay Diga. Thuong: 2000 Gold.',
    '挑战龙族': 'Thu thach long toc',
    '收集30个龙魄（杀死小黑龙有一定几率暴龙魄，难度越高几率越大）。任务奖励：2000金。': 'Thu thap 30 Long pho (diet hac long con co ti le roi; do kho cang cao, ti le cang lon). Thuong: 2000 Gold.',
    '并肩作战一': 'Sat canh chien 1',
    '带领艾琳通过拉普拉塔草原噩梦级（艾琳死亡则任务失败）。任务奖励：3000金。': 'Dan Ailin vuot dong co Lapulata cap Ac mong (Ailin chet la that bai). Thuong: 3000 Gold.',
    '寻找冰心': 'Tim bang tam',
    '收集3块冰晶。（杀死冰封晶王有一定几率暴冰晶，难度越高几率越大）。任务奖励：3000金。': 'Thu thap 3 Bang tinh (diet Bang Vuong Ket Tinh co ti le roi; do kho cang cao, ti le cang lon). Thuong: 3000 Gold.',
    '征服雪峰': 'Chinh phuc tuyet son',
    '通关巴吉尼亚雪山噩梦级。任务奖励：3000金，技能书2本。': 'Pha man nui tuyet Baginia cap Ac mong. Thuong: 3000 Gold, 2 sach ky nang.',
    '试炼二': 'Thu luyen 2',
    '使用一闪（即防御反击技）杀死冰封晶王（要求难度在地狱或以上）。任务奖励：3000金。': 'Dung Nhat kich (phan kich DEF) giet Bang Vuong Ket Tinh (do kho Dia nguc tro len). Thuong: 3000 Gold.',
    '捕获敌将': 'Bat tuong dich',
    '捕获魔族将领·厉（接受此任务方可在王者级巴吉尼亚雪山遇到魔族将领·厉，不可与其他捕获任务同时领取）': 'Bat tuong ma toc Li (nhan NV nay moi gap duoc Li o cap Vuong gia tai nui tuyet Baginia; khong nhan cung luc voi NV bat giu khac).',
    '穿越沼泽': 'Xuyen qua dam lay',
    '通关迪迦沼泽噩梦级。任务奖励：3000金，技能书2本。': 'Pha man Dam lay Diga cap Ac mong. Thuong: 3000 Gold, 2 sach ky nang.',
    '封龙印': 'An phong long',
    '打造封龙印 需要3个逆鳞（杀死黑龙王有一定几率暴逆鳞，难度越高几率越大）\r\n\r\n\r\n任务奖励：3000金': 'Ren An phong long can 3 Nguoc lanh (diet Hac Long Vuong co ti le roi Nguoc lanh; do kho cang cao, ti le cang lon)\r\n\r\n\r\nThuong: 3000 Gold',
    '并肩作战二': 'Sat canh chien 2',
    '保护艾琳通关迪加沼泽噩梦级（艾琳死亡则任务失败）。任务奖励：彩虹之心。': 'Bao ve Ailin pha man Dam lay Diga cap Ac mong (Ailin chet la that bai). Thuong: Trai tim cau vong.',
    '捕获黑龙王': 'Bat Hac Long Vuong',
    '捕获黑龙王 需要封龙印（接受此任务方可在王者级迪迦沼泽捕获黑龙王，不可与其他捕获任务同时领取）': 'Bat Hac Long Vuong can An phong long (nhan NV nay moi bat duoc Hac Long Vuong o cap Vuong gia tai Dam lay Diga; khong nhan cung luc voi NV bat giu khac).',
}

TARGET_FILES = [
    'res/bin/gameData.bin',
    'res/bin/qtr.bin',
    'res/bin/dcn.bin',
]


def sha256_bytes(data: bytes) -> str:
    return hashlib.sha256(data).hexdigest()


def sha256_file(path: Path) -> str:
    return sha256_bytes(path.read_bytes())


def pack_utf(s: str) -> bytes:
    raw = s.encode('utf-8')
    if len(raw) > 0xFFFF:
        raise ValueError(f'UTF-8 string too long: {len(raw)} bytes')
    return len(raw).to_bytes(2, 'big') + raw


def ensure_backup(path: Path) -> None:
    BACKUP_DIR.mkdir(parents=True, exist_ok=True)
    dst = BACKUP_DIR / path.name
    if not dst.exists():
        shutil.copy2(path, dst)


def replace_len_prefixed_utf8(blob: bytes, mapping: dict[str, str], maxlen: int = 800):
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


def patch_gamedata(path: Path):
    data = path.read_bytes()
    n = data[0]
    offs = [int.from_bytes(data[1 + i * 4:1 + (i + 1) * 4], 'big') for i in range(n + 1)]
    base = 1 + 4 * (n + 1)
    if base + offs[-1] != len(data):
        raise ValueError('gameData.bin section table mismatch')
    sections = [data[base + offs[i]: base + offs[i + 1]] for i in range(n)]
    new_sections = []
    all_hits = []
    for si, sec in enumerate(sections):
        new_sec, hits = replace_len_prefixed_utf8(sec, GAME_EXACT_MAP, maxlen=64)
        for h in hits:
            h['section'] = si
        new_sections.append(new_sec)
        all_hits.extend(hits)
    new_offs = [0]
    total = 0
    for sec in new_sections:
        total += len(sec)
        new_offs.append(total)
    header = bytes([n]) + b''.join(x.to_bytes(4, 'big') for x in new_offs)
    return header + b''.join(new_sections), all_hits


def patch_qtr(path: Path):
    data = path.read_bytes()
    patched, hits = replace_len_prefixed_utf8(data, QTR_MAP, maxlen=800)
    return patched, hits


def patch_dcn(path: Path):
    text = path.read_text(encoding='utf-8')
    new_desc = 'DJSMSDesc1:Noi dung SMS cu khong con ho tro. Bam Ve de quay lai, se khong tru phi. CSKH goc: 01082335566.'
    new_text = re.sub(r'^DJSMSDesc1:.*$', new_desc, text, flags=re.M)
    new_text = new_text.replace('返回', 'Ve').replace('继续', 'Tiep tuc').replace('信息费', 'Phi SMS')
    changed = text != new_text
    return new_text.encode('utf-8'), ([{'line': 'DJSMSDesc1', 'new': new_desc}] if changed else [])


def scan_cjk_len_prefixed_strings(blob: bytes, maxlen: int = 800):
    rows = []
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
            if any('\u4e00' <= ch <= '\u9fff' for ch in s):
                rows.append((i, s))
                i += 2 + l
                continue
        i += 1
    return rows


def load_class_map_status():
    p = ROOT / 'config' / 'class_string_map_safe_vi_ascii_v4_all_classes.json'
    if not p.exists():
        return {'exists': False, 'target_keys_present': []}
    mp = json.loads(p.read_text(encoding='utf-8'))
    keys = [k for k in GAME_EXACT_MAP if k in mp and mp[k] == GAME_EXACT_MAP[k]]
    return {'exists': True, 'target_keys_present': keys, 'target_key_count': len(keys)}


def base_bytes_for(rel_path: str) -> bytes:
    cur = ROOT / rel_path
    bak = BACKUP_DIR / cur.name
    return bak.read_bytes() if bak.exists() else cur.read_bytes()


def main():
    REPORT_DIR.mkdir(exist_ok=True)
    for rel in TARGET_FILES:
        ensure_backup(ROOT / rel)

    report = {
        'version': 'v6',
        'targets': {},
        'class_map_status': load_class_map_status(),
        'note': 'gameData.bin chi patch exact-match de tranh sua bua; qtr.bin va dcn.bin da Viet hoa theo V6.',
    }

    # gameData: report based on pristine backup if available, write current patched result.
    gpath = ROOT / 'res/bin/gameData.bin'
    g_base = base_bytes_for('res/bin/gameData.bin')
    g_base_path = BACKUP_DIR / 'gameData.bin' if (BACKUP_DIR / 'gameData.bin').exists() else gpath
    g_from_base, g_hits = patch_gamedata(g_base_path)
    g_current_after, _ = patch_gamedata(gpath)
    gpath.write_bytes(g_current_after)
    (REPORT_DIR / 'v6_gamedata_hits.txt').write_text(
        '\n'.join(f"section {h['section']} @0x{h['offset']:x}: {h['old']} -> {h['new']}" for h in g_hits) or 'NO EXACT MATCH FOUND',
        encoding='utf-8'
    )
    report['targets']['res/bin/gameData.bin'] = {
        'base_size': len(g_base),
        'after_size': len(g_current_after),
        'base_sha256': sha256_bytes(g_base),
        'after_sha256': sha256_bytes(g_current_after),
        'replacement_count_from_base': len(g_hits),
        'exact_labels_requested': GAME_EXACT_MAP,
    }

    # qtr
    qpath = ROOT / 'res/bin/qtr.bin'
    q_base = base_bytes_for('res/bin/qtr.bin')
    q_base_path = BACKUP_DIR / 'qtr.bin' if (BACKUP_DIR / 'qtr.bin').exists() else qpath
    q_from_base, q_hits = patch_qtr(q_base_path)
    q_current_after, _ = patch_qtr(qpath)
    qpath.write_bytes(q_current_after)
    (REPORT_DIR / 'v6_qtr_rows.txt').write_text(
        '\n'.join(f"@0x{h['offset']:x}: {h['old']} -> {h['new']}" for h in q_hits),
        encoding='utf-8'
    )
    report['targets']['res/bin/qtr.bin'] = {
        'base_size': len(q_base),
        'after_size': len(q_current_after),
        'base_sha256': sha256_bytes(q_base),
        'after_sha256': sha256_bytes(q_current_after),
        'replacement_count_from_base': len(q_hits),
        'remaining_cjk_strings': len(scan_cjk_len_prefixed_strings(q_current_after)),
    }

    # dcn
    dpath = ROOT / 'res/bin/dcn.bin'
    d_base = base_bytes_for('res/bin/dcn.bin')
    d_base_path = BACKUP_DIR / 'dcn.bin' if (BACKUP_DIR / 'dcn.bin').exists() else dpath
    d_from_base, d_hits = patch_dcn(d_base_path)
    d_current_after, _ = patch_dcn(dpath)
    dpath.write_bytes(d_current_after)
    (REPORT_DIR / 'v6_dcn_rows.txt').write_text(
        '\n'.join(str(x) for x in d_hits) or 'NO CHANGE',
        encoding='utf-8'
    )
    report['targets']['res/bin/dcn.bin'] = {
        'base_size': len(d_base),
        'after_size': len(d_current_after),
        'base_sha256': sha256_bytes(d_base),
        'after_sha256': sha256_bytes(d_current_after),
        'replacement_count_from_base': len(d_hits),
        'remaining_cjk': bool(re.search(r'[\u3400-\u9fff]', d_current_after.decode('utf-8', errors='ignore'))),
    }

    (REPORT_DIR / 'v6_resources_validation.json').write_text(
        json.dumps(report, ensure_ascii=False, indent=2),
        encoding='utf-8'
    )
    print(json.dumps(report, ensure_ascii=False, indent=2))


if __name__ == '__main__':
    main()
