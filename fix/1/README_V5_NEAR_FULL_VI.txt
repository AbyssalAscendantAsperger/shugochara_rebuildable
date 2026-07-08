V5 gan tron ven - Viet hoa khong dau

Da gop 5 buoc resource:
1) choice.bin: dich lua chon hoi thoai/menu lua chon.
2) stg.bin: dich/Latin hoa ten NPC/quai/stage.
3) 80.bin: dich thong tin phat hanh/provider/CSKH.
4) APISetting.ini: chuyen sang ASCII khong dau, vo hieu hoa smstext SMS Trung cu.
5) MANIFEST.MF: doi MIDlet-Name/MIDlet-1 sang khong dau.

Cong them tu cac ban truoc:
- sct_dialogue da dich 163/163 dong khong dau.
- tat ca *.class trong JAR khong con CJK.

JAR test ngay:
  jar/shugochara_vi_nodau_v5_near_full.jar

Thong tin JAR:
  size: 1038560 bytes
  sha256: 2a6e10173d0df13fa447f7d9333597feb42462072207f73a28b25e3934b1dc16

File can copy vao du an:
  overwrite_project/res/bin/choice.bin
  overwrite_project/res/bin/stg.bin
  overwrite_project/res/bin/80.bin
  overwrite_project/res/APISetting.ini
  overwrite_project/res/META-INF/MANIFEST.MF
  overwrite_project/tools/make_resources_v5.py
  overwrite_project/build_safe_vi_nodau_v5_near_full.sh

Khong xoa file cu:
  reference_old/resources_v4/ chua cac resource truoc V5 de doi chieu/rollback.

Lenh build lai trong du an:
  chmod +x build_safe_vi_nodau_v5_near_full.sh
  ./build_safe_vi_nodau_v5_near_full.sh

Neu muon tao lai resource V5 tu backup .v4bak:
  python3 tools/make_resources_v5.py

Con lai sau V5:
- Ve text/code/resource dang parse duoc: gan nhu sach.
- Phan co the con la chu ve trong PNG (neu co) can kiem tra bang mat: fengmian.png, sp.png, bg*.png, cp.png...
