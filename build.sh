#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")"

ECJ="lib/ecj-4.6.1.jar"
BOOT="lib/cldc-1.1-stub-1.0.1.jar:lib/midp-2.0-stub-1.0.jar"
CP="base_classes:lib/optional-stubs.jar"

rm -rf build dist
mkdir -p build/classes build/jarroot dist

# 1) Start from original class files. This keeps the JAR complete even when only part
#    of the decompiled source has been selected for recompilation.
cp -R base_classes/. build/classes/

# 2) Compile Java files placed in src_patch and overlay them over the base classes.
#    The included src_patch contains the decompiled classes that were verified to compile.
if find src_patch -name '*.java' | grep -q .; then
  find src_patch -name '*.java' | sort > build/sources_patch.txt
  java -jar "$ECJ" -encoding UTF-8 -1.4 -target cldc1.1 \
    -bootclasspath "$BOOT" -classpath "$CP" \
    -d build/classes @build/sources_patch.txt | tee build/compile_patch.log
fi

# 3) Build JAR root: resources + classes.
cp -R res/. build/jarroot/
cp -R build/classes/. build/jarroot/

# 4) Pack JAR. Prefer Python zip writer to avoid requiring a full JDK jar tool.
if command -v python3 >/dev/null 2>&1; then
  python3 build_tools/make_jar.py build/jarroot dist/shugochara_rebuild.jar
else
  (cd build/jarroot && jar cfm ../../dist/shugochara_rebuild.jar META-INF/MANIFEST.MF .)
fi

echo "Done: dist/shugochara_rebuild.jar"
