#!/usr/bin/env bash
# Build SAFE V4: patch tat ca *.class trong base_classes copy, khong compile Java decompiled.
set -euo pipefail
cd "$(dirname "$0")"

SCT_INPUT="${1:-res/bin/sct.bin}"
OUT_JAR="${2:-release_safe/shugochara_safe_all_classes.jar}"
MAP_JSON="${3:-config/class_string_map_safe_vi_ascii_v4_all_classes.json}"

WORK_DIR="_safe_work"
JARROOT="$WORK_DIR/jarroot"
PATCH_LOG="$WORK_DIR/patch_class_utf8.log"
VERIFY_SCT="$WORK_DIR/sct_from_jar.bin"

need_file(){ [ -f "$1" ] || { echo "ERROR missing file: $1" >&2; exit 1; }; }
need_dir(){ [ -d "$1" ] || { echo "ERROR missing dir: $1" >&2; exit 1; }; }

need_dir base_classes
need_dir res
need_file "$SCT_INPUT"
need_file "$MAP_JSON"
need_file tools/patch_class_utf8.py
need_file tools/sct_tool.py
need_file build_tools/make_jar.py

mkdir -p "$(dirname "$OUT_JAR")"
rm -rf "$WORK_DIR"
mkdir -p "$JARROOT"

echo "[1/6] Copy res + base_classes -> $JARROOT"
cp -R res/. "$JARROOT/"
cp -R base_classes/. "$JARROOT/"
rm -f "$JARROOT"/bin/sct_vi*.bin "$JARROOT"/bin/sct_rebuilt*.bin "$JARROOT"/bin/sct_from*.bin 2>/dev/null || true

echo "[2/6] Install SCT: $SCT_INPUT -> $JARROOT/bin/sct.bin"
mkdir -p "$JARROOT/bin"
cp -f "$SCT_INPUT" "$JARROOT/bin/sct.bin"

echo "[3/6] Verify SCT before JAR"
python3 tools/sct_tool.py check "$JARROOT/bin/sct.bin"

echo "[4/6] Patch ALL class CONSTANT_Utf8 strings"
: > "$PATCH_LOG"
while IFS= read -r cls; do
  python3 tools/patch_class_utf8.py "$cls" "$MAP_JSON" | tee -a "$PATCH_LOG"
done < <(find "$JARROOT" -maxdepth 1 -type f -name '*.class' | sort)

echo "[5/6] Pack JAR -> $OUT_JAR"
python3 build_tools/make_jar.py "$JARROOT" "$OUT_JAR"

echo "[6/6] Verify JAR output"
python3 - <<PY
from pathlib import Path
import zipfile, hashlib, json
jar = Path('$OUT_JAR')
verify_sct = Path('$VERIFY_SCT')
with zipfile.ZipFile(jar, 'r') as z:
    names = z.namelist()
    if 'META-INF/MANIFEST.MF' not in names:
        raise SystemExit('ERROR: missing manifest')
    if 'bin/sct.bin' not in names:
        raise SystemExit('ERROR: missing bin/sct.bin')
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
  'patch_mode': 'all_classes_constant_pool',
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
