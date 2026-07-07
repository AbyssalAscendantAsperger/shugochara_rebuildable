#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")"
rm -rf build_all
mkdir -p build_all/classes
find src_decompiled_all -name '*.java' | sort > build_all/sources_all.txt
java -jar lib/ecj-4.6.1.jar -encoding UTF-8 -1.4 -target cldc1.1 \
  -bootclasspath lib/cldc-1.1-stub-1.0.1.jar:lib/midp-2.0-stub-1.0.jar \
  -classpath base_classes:lib/optional-stubs.jar \
  -d build_all/classes @build_all/sources_all.txt | tee build_all/compile_all.log
