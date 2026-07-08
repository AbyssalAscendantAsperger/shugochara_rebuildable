#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")"
SCT_INPUT="${1:-res/bin/sct_vi_nodau.bin}"
OUT_JAR="${2:-release_safe/shugochara_vi_nodau_v3_all.jar}"
./build_safe.sh "$SCT_INPUT" "$OUT_JAR" config/class_string_map_safe_vi_ascii_v3_all_remaining.json
