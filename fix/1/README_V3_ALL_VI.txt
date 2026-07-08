Goi V3 - Viet hoa khong dau phan con lai

Da lam theo yeu cau:
- t.class: trang bi, vat pham, danh hieu, mo ta item
- av.class: map name, hint, pause, end game
- u.class: ten chi so HP, MP, ATK, DEF...
- ad.class: pause/exit/channel text
- giu d.class V2 va sct_dialogue khong dau da chay tot

Khong xoa file cu:
- Map V1/V2 duoc luu trong reference_old/maps/
- Jar V1/V2 neu co duoc luu trong reference_old/jars/
- Map moi la file rieng: config/class_string_map_safe_vi_ascii_v3_all_remaining.json
- Wrapper build moi: build_safe_vi_nodau_v3_all.sh

JAR test ngay:
  jar/shugochara_vi_nodau_v3_all.jar

Lenh build V3 trong du an:
  ./build_safe_vi_nodau_v3_all.sh

Hoac:
  ./build_safe_vi_nodau_v3_all.sh res/bin/sct_vi_nodau.bin release_safe/shugochara_vi_nodau_v3_all.jar

Ket qua kiem tra CJK sau patch:
  t.class: 193 -> 0
  av.class: 55 -> 0
  u.class: 12 -> 0
  ad.class: 19 -> 0
  d.class: 81 -> 0
  g.class: 1 -> 0

Chu y:
  ae.class con 1 chu Trung "宽". Chu nay la string dung de tinh do rong font trong code Font.stringWidth("宽"), khong phai text hien thi; giu lai de tranh lech layout.
  k.class/o.class con vai chu debug/element, chua xu ly vi khong nam trong yeu cau nay va co the la debug/noi bo.

Bao cao day du:
  reports/v3_all_remaining_check_report.txt
  reports/v3_all_remaining_summary.json
