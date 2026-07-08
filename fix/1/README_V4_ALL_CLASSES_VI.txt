Goi V4 - Viet hoa khong dau tat ca class con lai

Da lam:
- Quet tat ca *.class trong base_classes.
- Patch bang CONSTANT_Utf8, khong compile Java decompiled.
- Patch tat ca class co chu Trung con lai: a, aa, ae, af, ai, an, as, b, c, e, j, k, m, o, q, v, w, y...
- Giu cac phan da chay tot tu V1/V2/V3: sct_dialogue khong dau, d.class, t.class, av.class, u.class, ad.class.

Ket qua:
- Sau patch V4: NO CJK REMAINING IN PATCHED CLASSES.
- JAR van verify sct.bin OK.

JAR test ngay:
  jar/shugochara_vi_nodau_v4_all_classes.jar

Lenh build V4 trong du an:
  ./build_safe_vi_nodau_v4_all_classes.sh

Hoac:
  ./build_safe_vi_nodau_v4_all_classes.sh res/bin/sct_vi_nodau.bin release_safe/shugochara_vi_nodau_v4_all_classes.jar

File moi can them/cap nhat:
  build_safe_all_classes.sh
  build_safe_vi_nodau_v4_all_classes.sh
  config/class_string_map_safe_vi_ascii_v4_all_classes.json
  tools/make_class_map_v4_all_classes.py
  tools/list_class_utf8.py

Khong xoa file cu:
- V1/V2/V3 map va jar duoc de trong reference_old/ de doi chieu/rollback.

Bao cao:
  reports/v4_all_classes_check_report.txt
  reports/v4_all_classes_summary.json
