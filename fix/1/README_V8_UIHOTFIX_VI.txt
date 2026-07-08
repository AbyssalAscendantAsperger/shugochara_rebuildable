V8 UI hotfix - va thang vao JAR V8 da test

Ket luan sau khi doi chieu voi JAR user gui:
- JAR user test SHA256 trung 100% voi JAR V8 da build trong repo.
- Ly do ban V8 truoc khong thay doi tren may: nhom chu con sot KHONG nam o class string hay qtr/dcn, ma nam trong image atlas ben trong res/bin/uires.bin.

Da patch thang image atlas AQ #3 trong uires.bin:
- Main menu / submenu UI
- Thuoc tinh
- Trang bi
- Ky nang
- He thong / mot so menu lien quan

Ban nay da sua them:
1) logic hover/select cua main menu:
   - Thuoc tinh khi noi khong con nhay thanh VL
   - Tui do khi noi khong con nhay thanh Tro ve
   - Danh hieu khi noi khong con nhay thanh OK
2) readability pass:
   - VL -> Vat lieu
   - VP -> Vat pham
   - VK -> Vu khi
   - TS -> Tr.suc
   - DH -> Danh
   - mot so nhan ngan khac duoc doi cho de hieu hon

Cach build:
  chmod +x build_safe_vi_nodau_v8_uihotfix.sh
  ./build_safe_vi_nodau_v8_uihotfix.sh

File chinh:
- overwrite_project/res/bin/uires.bin
- overwrite_project/tools/make_resources_v8_uihotfix.py
- overwrite_project/build_safe_vi_nodau_v8_uihotfix.sh
- jar/shugochara_vi_nodau_v8_uihotfix.jar

Ghi chu:
- Day la patch UI image, nen mau va bo cuc goc duoc giu tuong doi.
- Chu thay the dung theo bo atlas cua github hien tai va JAR user gui test.
