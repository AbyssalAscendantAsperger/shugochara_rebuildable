#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")"
# Neu can tao lai resource V5 tu backup *.v4bak, chay: python3 tools/make_resources_v5.py
./build_safe_all_classes.sh res/bin/sct_vi_nodau.bin release_safe/shugochara_vi_nodau_v5_near_full.jar config/class_string_map_safe_vi_ascii_v4_all_classes.json
