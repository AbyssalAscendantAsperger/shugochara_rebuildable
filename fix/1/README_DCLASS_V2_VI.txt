Goi update Viet hoa khong dau - d.class V2

Muc tieu:
- Khong xoa/huy cac file cu.
- Them map moi: config/class_string_map_safe_vi_ascii_v2_dclass.json
- Them wrapper build moi: build_safe_vi_nodau_v2_dclass.sh
- Giu map v1 trong reference_old de doi chieu.

Ket qua kiem tra d.class:
- base_classes/d.class truoc patch: 81 CONSTANT_Utf8 co chu Trung.
- _safe_work/jarroot/d.class sau patch V2: 0 chu Trung.
- d.class changed: 81 constants.

JAR test ngay:
  jar/shugochara_vi_nodau_sct_dclass_v2.jar

Lenh build V2 trong du an:
  ./build_safe_vi_nodau_v2_dclass.sh

Hoac chi dinh file/output:
  ./build_safe_vi_nodau_v2_dclass.sh res/bin/sct_vi_nodau.bin release_safe/shugochara_vi_nodau_sct_dclass_v2.jar

Lenh kiem tra d.class sau build:
  python3 tools/list_class_utf8.py _safe_work/jarroot/d.class --cjk-only

Bao cao:
  reports/dclass_v2_check_report.txt
