#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""V5 resource patcher: choice.bin, stg.bin, 80.bin, APISetting.ini, MANIFEST.MF.
An toan: tao backup .v4bak neu chua co, tao named copy *_v5.bin, roi ghi de file build.
"""
from pathlib import Path
import struct, unicodedata, re, shutil

ROOT=Path('.')

def mutf8_encode(s):
    out=bytearray(); u=s.encode('utf-16-be')
    for i in range(0,len(u),2):
        ch=(u[i]<<8)|u[i+1]
        if 1<=ch<=0x7f: out.append(ch)
        elif ch<=0x7ff: out += bytes([0xC0|((ch>>6)&0x1F), 0x80|(ch&0x3F)])
        else: out += bytes([0xE0|((ch>>12)&0x0F), 0x80|((ch>>6)&0x3F), 0x80|(ch&0x3F)])
    if len(out)>65535: raise ValueError('utf too long')
    return bytes(out)

def mutf8_decode(data):
    units=[]; i=0
    while i<len(data):
        b=data[i]
        if b<0x80: units.append(b); i+=1
        elif (b&0xE0)==0xC0: units.append(((b&0x1F)<<6)|(data[i+1]&0x3F)); i+=2
        elif (b&0xF0)==0xE0: units.append(((b&0x0F)<<12)|((data[i+1]&0x3F)<<6)|(data[i+2]&0x3F)); i+=3
        else: raise UnicodeDecodeError('mutf8',data,i,i+1,'bad')
    return b''.join(struct.pack('>H',u) for u in units).decode('utf-16-be','surrogatepass')

def read_utf(buf,pos):
    ln=struct.unpack_from('>H',buf,pos)[0]; pos+=2
    raw=buf[pos:pos+ln]
    return mutf8_decode(raw), pos+ln, ln

def pack_utf(s):
    raw=mutf8_encode(s); return struct.pack('>H',len(raw))+raw

def backup(path):
    p=Path(path); b=p.with_name(p.name+'.v4bak')
    if not b.exists(): shutil.copy2(p,b)

def pack_table(sections):
    offs=[0]; total=0
    for s in sections:
        total+=len(s); offs.append(total)
    return struct.pack('>H',len(sections))+b''.join(struct.pack('>I',x) for x in offs)+b''.join(sections)

def read_table(buf,pos):
    n=struct.unpack_from('>H',buf,pos)[0]; pos+=2
    offs=[struct.unpack_from('>I',buf,pos+i*4)[0] for i in range(n+1)]; pos+=4*(n+1)
    secs=[buf[pos+offs[i]:pos+offs[i+1]] for i in range(n)]
    return secs,pos+offs[-1]

CHOICE_MAP={
 '购买材料':'Mua vat lieu','离开':'Roi di','强化装备':'Cuong hoa TB','关于师父＆杉师兄':'Ve su phu & su huynh Shan','关于师父':'Ve su phu','杉师兄':'Su huynh Shan','七夕节':'That tich','管她呢':'Ke co ay','铁匠买卖':'Tho ren mua ban','购买':'Mua','药店买卖':'Tiem thuoc','去不去成都':'Den Thanh Do?','去':'Di','不去':'Khong di','夺剑＆劝说':'Doat kiem & khuyen','夺剑':'Doat kiem','劝说':'Khuyen','按下开关':'Bam cong tac','按下':'Bam','不按':'Khong bam','听＆不听':'Nghe & khong','听':'Nghe','不听':'Khong nghe','让坐＆不让坐':'Cho ngoi & khong','让坐':'Cho ngoi','不让坐':'Khong cho','接受任务':'Nhan NV','接受':'Nhan','不接受':'Khong nhan','换酒':'Doi ruou','换':'Doi','不换':'Khong doi','数据13':'Du lieu 13','数据14':'Du lieu 14'
}

def parse_choice(path):
    buf=Path(path).read_bytes(); magic=buf[0]; secs,end=read_table(buf,1); assert end==len(buf)
    rows=[]; newsecs=[]
    for si,sec in enumerate(secs):
        pos=0; n=struct.unpack_from('>H',sec,pos)[0]; pos+=2
        refs=[struct.unpack_from('>h',sec,pos+i*2)[0] for i in range(n)]; pos+=2*n
        title,pos,_=read_utf(sec,pos)
        cn=struct.unpack_from('>H',sec,pos)[0]; pos+=2
        choices=[]
        for ci in range(cn):
            rn=struct.unpack_from('>H',sec,pos)[0]; pos+=2
            r=[struct.unpack_from('>h',sec,pos+i*2)[0] for i in range(rn)]; pos+=2*rn
            txt,pos,_=read_utf(sec,pos)
            choices.append((r,txt)); rows.append((si,ci,txt,CHOICE_MAP.get(txt,txt)))
        assert pos==len(sec)
        out=bytearray(struct.pack('>H',n)+b''.join(struct.pack('>h',x) for x in refs)+pack_utf(CHOICE_MAP.get(title,title))+struct.pack('>H',cn))
        for r,txt in choices:
            out += struct.pack('>H',len(r))+b''.join(struct.pack('>h',x) for x in r)+pack_utf(CHOICE_MAP.get(txt,txt))
        newsecs.append(bytes(out))
    return bytes([magic])+pack_table(newsecs), rows

STG_NAMES=['Daos','Anda','Habarol','Kres','Lala','Quan gia Qiman','Rez','Tuong Bit','Chris nho','Mint','Kaily','Dalton','Nguyet Linh','Dalton','Than chet','Tho dia','Bach Tinh Tinh','Nguu Ma Vuong','--------------','Imir','Tim','Tera','Haig','Sde','Tifa','Lily','Mary','Thuong nhan','Ong Hudi','Ba lao','Luke','Nana','Phu thuy giao phai','------------','Nair','Bibi','Shana','Wens','Heo rung Rus','John nho','HLV tan thu','Hughes','Martin','Thu linh','Su tu Leon','Nguoi ban ve so','Tieu dau muc','Dao tac','Nha dich','Phu xe','Tho ren Wang','Thanh nien To Chau','Tieu Tam','Tieu Nhi','Guo Furong','Thuong nhan','Ba lao giat do','Cho','Trung nien','Thuong nhan la','Lao gia','Khach','Khach nu','Chu tiem tap hoa','Chu quan tro','Tong Xiangyu','Tang nhan du lich','Nguoi Tay Vuc','Thuong nhan Tay Vuc','Thuong nhan','Chu cho nghi','Truong tran Long Mon','Thu linh ma tac','Ma tac','Dai thu linh','Pho thu linh','Thu linh ao den','Doi truong Ogre','Doi truong phan quan','Linh phan quan','Tinh linh','Soi ac','Doi truong de quoc','Canh vo quang','Thien su dich benh','Quai vat bi an','Ba tuoc Hodel','Phap su tu linh','Slime','Tho ren','Rong','————————','Chien binh xuong','Rong lua','Dao tac luu manh','Dao tac cuop','Thu linh dao tac','Zhenjian','Ma da','No le kiem','content','content','content','content','content','content','content']

def patch_stg(path):
    buf=Path(path).read_bytes(); magic=buf[0]; secs,end=read_table(buf,1); assert end==len(buf)
    newsecs=[]; rows=[]
    for si,sec in enumerate(secs):
        pos=0; cnt=struct.unpack_from('>H',sec,pos)[0]; pos+=2
        strings=[]
        for i in range(cnt):
            txt,pos,_=read_utf(sec,pos); strings.append(txt)
        assert pos==len(sec)
        out=bytearray(struct.pack('>H',cnt))
        for i,txt in enumerate(strings):
            tr=STG_NAMES[i] if i<len(STG_NAMES) else f'Name{i}'
            rows.append((i,txt,tr)); out+=pack_utf(tr)
        newsecs.append(bytes(out))
    return bytes([magic])+pack_table(newsecs), rows

BIN80=['Phat hanh: Hefei 80 Anime','Nha CC: Hefei 80 Anime','CSKH:','0551-3670637','Email:','kefu@gmail.cn']
def patch_80(path):
    buf=Path(path).read_bytes(); pos=0
    aB=buf[pos]; pos+=1; flags=buf[pos:pos+aB]; pos+=aB
    cnt=buf[pos]; pos+=1
    old=[]
    for i in range(cnt):
        txt,pos,_=read_utf(buf,pos); old.append(txt)
    assert pos==len(buf)
    vals=BIN80[:cnt]
    return bytes([aB])+flags+bytes([cnt])+b''.join(pack_utf(x) for x in vals), list(zip(old,vals))

def nodau(s):
    s=unicodedata.normalize('NFD',s)
    s=''.join(c for c in s if unicodedata.category(c)!='Mn')
    return s.replace('Đ','D').replace('đ','d')

def patch_api(path):
    text=Path(path).read_text(encoding='utf-8')
    text=nodau(text)
    text=text.replace('“','"').replace('”','"').replace('’',"'").replace('‘',"'")
    # Replace the huge Chinese SMS advert line with harmless no-diacritic message while keeping key.
    text=re.sub(r'^smstext=.*$', 'smstext=Thanh toan SMS khong ho tro.=#=Thanh toan SMS khong ho tro.', text, flags=re.M)
    # Ensure remaining Chinese removed in visible ini text. Other encoded numeric fields are kept.
    repl={
        '欢迎':'Chao mung','使用':'su dung','客服':'CSKH','电话':'DT','感谢':'Cam on','游戏':'game','支持':'ung ho',
        '出现非预期':'Xuat hien loi bat ngo','返回空':'Tra ve rong','U点':'U-Diem','联网已被':'Ket noi da bi',
        '点':'Diem','出现':'Xuat hien','非预期':'bat ngo','返回':'Tro ve','空':'rong','联网':'Ket noi','已被':'da bi',
    }
    for k,v in repl.items(): text=text.replace(k,v)
    # Final guard: strip/replace any residual CJK in API text to avoid signed/old carrier prompts.
    text=re.sub(r'[\u3400-\u9fff]+', 'X', text)
    return text

def patch_manifest(path):
    text=Path(path).read_text(encoding='utf-8')
    text=nodau(text)
    text=text.replace('Thu Ho Diem Tam - Mong Ao Tinh Duyen','Thu Ho Diem Tam - Mong Ao Tinh Duyen')
    return text

# Generate + overwrite with backups
for p in ['res/bin/choice.bin','res/bin/stg.bin','res/bin/80.bin','res/APISetting.ini','res/META-INF/MANIFEST.MF']:
    backup(p)

choice,choice_rows=parse_choice('res/bin/choice.bin.v4bak')
Path('res/bin/choice_v5.bin').write_bytes(choice); Path('res/bin/choice.bin').write_bytes(choice)
stg,stg_rows=patch_stg('res/bin/stg.bin.v4bak')
Path('res/bin/stg_v5.bin').write_bytes(stg); Path('res/bin/stg.bin').write_bytes(stg)
b80,b80_rows=patch_80('res/bin/80.bin.v4bak')
Path('res/bin/80_v5.bin').write_bytes(b80); Path('res/bin/80.bin').write_bytes(b80)
Path('res/APISetting_v5.ini').write_text(patch_api('res/APISetting.ini.v4bak'), encoding='utf-8')
Path('res/APISetting.ini').write_text(patch_api('res/APISetting.ini.v4bak'), encoding='utf-8')
Path('res/META-INF/MANIFEST_v5.MF').write_text(patch_manifest('res/META-INF/MANIFEST.MF.v4bak'), encoding='utf-8')
Path('res/META-INF/MANIFEST.MF').write_text(patch_manifest('res/META-INF/MANIFEST.MF.v4bak'), encoding='utf-8')

# Reports CSV simple
rep=Path('reports'); rep.mkdir(exist_ok=True)
(rep/'v5_choice_rows.txt').write_text('\n'.join(f'{a},{b}: {c} -> {d}' for a,b,c,d in choice_rows),encoding='utf-8')
(rep/'v5_stg_rows.txt').write_text('\n'.join(f'{i}: {o} -> {t}' for i,o,t in stg_rows),encoding='utf-8')
(rep/'v5_80_rows.txt').write_text('\n'.join(f'{o} -> {t}' for o,t in b80_rows),encoding='utf-8')
print('V5 resources written')
print('choice',len(choice),'stg',len(stg),'80',len(b80))
