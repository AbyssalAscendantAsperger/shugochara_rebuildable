#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")"
python3 tools/make_resources_v5.py
python3 tools/make_resources_v6.py
python3 tools/make_resources_v7.py
python3 tools/make_resources_v8.py
python3 tools/make_resources_v8_uihotfix.py
./build_safe_all_classes.sh res/bin/sct_vi_nodau.bin release_safe/shugochara_vi_nodau_v8_uihotfix.jar config/class_string_map_safe_vi_ascii_v8_ui_exact.json
