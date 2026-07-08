Goi Viet hoa sct_dialogue KHONG DAU

Da dich 163/163 dong trong res/bin/sct.bin sang tieng Viet khong dau.
Da check ASCII: non_ascii_count = 0.
Da check strict limit: over_soft_limit = 0.
Da import sct thanh cong:
  res/bin/sct_vi_nodau.bin: 18197 bytes, nho hon goc 3454 bytes.
Da build JAR SAFE thanh cong:
  jar/shugochara_vi_nodau_sct.jar

File de test ngay:
  jar/shugochara_vi_nodau_sct.jar

File can ghi de vao du an moi:
  overwrite_project/res/bin/sct.bin
  overwrite_project/translations/sct_dialogue_vi_nodau.csv
  overwrite_project/tools/make_sct_vi_nodau.py
  overwrite_project/build_safe.sh

Lenh da chay:
  python3 tools/make_sct_vi_nodau.py
  python3 tools/sct_tool.py check res/bin/sct.bin --csv translations/sct_dialogue_vi_nodau.csv --fail-on-long
  python3 tools/sct_tool.py import res/bin/sct.bin translations/sct_dialogue_vi_nodau.csv res/bin/sct_vi_nodau.bin --strict-limits
  ./build_safe.sh res/bin/sct_vi_nodau.bin release_safe/shugochara_vi_nodau_sct.jar

Chu y:
  build_safe.sh da duoc cap nhat de khong dua cac file trung gian sct_vi*.bin / sct_rebuilt*.bin vao JAR.
