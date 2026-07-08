#!/usr/bin/env bash
# Build JAR an toàn cho dự án Việt hóa Shugo Chara J2ME.
# Nguyên tắc:
#   - KHÔNG compile src_patch/*.java decompiled.
#   - Giữ base_classes gốc làm nguồn class chuẩn.
#   - Copy base_classes sang thư mục work rồi chỉ patch CONSTANT_Utf8 để đổi chữ.
#   - Copy res, thay bin/sct.bin nếu chỉ định.
#   - Pack JAR và verify sct.bin sau khi đóng gói.
set -euo pipefail

cd "$(dirname "$0")"

SCT_INPUT="${1:-res/bin/sct.bin}"
OUT_JAR="${2:-release_safe/shugochara_safe_vi.jar}"
MAP_JSON="${3:-config/class_string_map_safe_vi_ascii.json}"

WORK_DIR="_safe_work"
JARROOT="$WORK_DIR/jarroot"
PATCH_LOG="$WORK_DIR/patch_class_utf8.log"
VERIFY_SCT="$WORK_DIR/sct_from_jar.bin"

need_file() {
  if [ ! -f "$1" ]; then
    echo "ERROR: missing file: $1" >&2
    exit 1
  fi
}

need_dir() {
  if [ ! -d "$1" ]; then
    echo "ERROR: missing directory: $1" >&2
    exit 1
  fi
}

need_dir "base_classes"
need_dir "res"
need_file "$SCT_INPUT"
need_file "$MAP_JSON"
need_file "tools/patch_class_utf8.py"
need_file "tools/sct_tool.py"
need_file "build_tools/make_jar.py"

mkdir -p "$(dirname "$OUT_JAR")"
rm -rf "$WORK_DIR"
mkdir -p "$JARROOT"

# 1) Copy resource và class gốc. Tuyệt đối không sửa base_classes trực tiếp.
echo "[1/6] Copy res + base_classes -> $JARROOT"
cp -R res/. "$JARROOT/"
cp -R base_classes/. "$JARROOT/"
# Don rac build/dich trong res/bin de khong dua file thu nghiem vao JAR.
# Game chi can bin/sct.bin; cac ban sct_vi_*.bin, sct_rebuilt_*.bin chi la file trung gian.
rm -f "$JARROOT"/bin/sct_vi*.bin "$JARROOT"/bin/sct_rebuilt*.bin "$JARROOT"/bin/sct_from*.bin 2>/dev/null || true

# 2) Ghi đè sct.bin đã dịch/repack.
echo "[2/6] Install SCT: $SCT_INPUT -> $JARROOT/bin/sct.bin"
mkdir -p "$JARROOT/bin"
cp -f "$SCT_INPUT" "$JARROOT/bin/sct.bin"

# 3) Kiểm tra sct.bin trước khi pack.
echo "[3/6] Verify SCT before JAR"
python3 tools/sct_tool.py check "$JARROOT/bin/sct.bin"

# 4) Patch chuỗi trong class bằng constant-pool patch, không compile Java.
echo "[4/6] Patch class CONSTANT_Utf8 strings"
: > "$PATCH_LOG"
# Danh sách class có chuỗi UI/menu hay gặp. Class nào không tồn tại sẽ bỏ qua.
PATCH_CLASSES=(
  av.class
  ae.class
  ad.class
  d.class
  g.class
  k.class
  t.class
  u.class
  o.class
)
for cls in "${PATCH_CLASSES[@]}"; do
  if [ -f "$JARROOT/$cls" ]; then
    python3 tools/patch_class_utf8.py "$JARROOT/$cls" "$MAP_JSON" | tee -a "$PATCH_LOG"
  fi
done

# 5) Pack JAR. make_jar.py sẽ đặt MANIFEST.MF đầu tiên để hợp MIDP hơn.
echo "[5/6] Pack JAR -> $OUT_JAR"
python3 build_tools/make_jar.py "$JARROOT" "$OUT_JAR"

# 6) Verify JAR: có bin/sct.bin, extract và parse lại.
echo "[6/6] Verify JAR output"
python3 - <<PY
from pathlib import Path
import zipfile, hashlib, json
jar = Path('$OUT_JAR')
verify_sct = Path('$VERIFY_SCT')
with zipfile.ZipFile(jar, 'r') as z:
    names = z.namelist()
    if 'META-INF/MANIFEST.MF' not in names:
        raise SystemExit('ERROR: JAR missing META-INF/MANIFEST.MF')
    if 'bin/sct.bin' not in names:
        raise SystemExit('ERROR: JAR missing bin/sct.bin')
    data = z.read('bin/sct.bin')
verify_sct.parent.mkdir(parents=True, exist_ok=True)
verify_sct.write_bytes(data)
info = {
    'jar': str(jar),
    'jar_size': jar.stat().st_size,
    'jar_sha256': hashlib.sha256(jar.read_bytes()).hexdigest(),
    'sct_size': len(data),
    'sct_sha256': hashlib.sha256(data).hexdigest(),
    'entry_count': len(names),
    'has_manifest': 'META-INF/MANIFEST.MF' in names,
    'has_sct': 'bin/sct.bin' in names,
    'map_json': '$MAP_JSON',
    'sct_input': '$SCT_INPUT',
}
report = Path('release_safe/build_safe_validation.json')
report.parent.mkdir(parents=True, exist_ok=True)
report.write_text(json.dumps(info, ensure_ascii=False, indent=2), encoding='utf-8')
print(json.dumps(info, ensure_ascii=False, indent=2))
PY
python3 tools/sct_tool.py check "$VERIFY_SCT"

echo "DONE: $OUT_JAR"
echo "Report: release_safe/build_safe_validation.json"
echo "Patch log: $PATCH_LOG"
