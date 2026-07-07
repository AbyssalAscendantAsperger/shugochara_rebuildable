#!/usr/bin/env python3
import os, sys, zipfile, pathlib
if len(sys.argv) != 3:
    print('Usage: make_jar.py <jarroot> <out.jar>')
    sys.exit(2)
root = pathlib.Path(sys.argv[1])
out = pathlib.Path(sys.argv[2])
out.parent.mkdir(parents=True, exist_ok=True)
manifest = root / 'META-INF' / 'MANIFEST.MF'
with zipfile.ZipFile(out, 'w', compression=zipfile.ZIP_DEFLATED) as z:
    # Manifest first for maximum MIDP compatibility
    if manifest.exists():
        z.writestr('META-INF/', b'')
        z.write(manifest, 'META-INF/MANIFEST.MF')
    # Add directory entries (some old phones are picky). META-INF/ is already added.
    for d in sorted([x for x in root.rglob('*') if x.is_dir()]):
        rel = d.relative_to(root).as_posix().rstrip('/') + '/'
        if rel == 'META-INF/':
            continue
        z.writestr(rel, b'')
    for p in sorted(root.rglob('*')):
        if p.is_dir():
            continue
        rel = p.relative_to(root).as_posix()
        if rel.upper() == 'META-INF/MANIFEST.MF':
            continue
        z.write(p, rel)
print(out)
