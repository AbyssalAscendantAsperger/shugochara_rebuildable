# Dự án mới SAFE - Shugo Chara Việt hóa

Gói này là bản dự án sạch để bạn có thể **xóa dự án cũ**, giải nén ZIP này và tiếp tục Việt hóa theo hướng an toàn.

## Cách build ngay

```bash
chmod +x build_safe.sh
./build_safe.sh res/bin/sct.bin release_safe/shugochara_safe_vi.jar
```

JAR sẽ nằm ở:

```text
release_safe/shugochara_safe_vi.jar
```

## Nếu đã dịch `sct_dialogue_export.csv`

Dịch cột `translated` trong:

```text
translations/sct_dialogue_export.csv
```

Import lại:

```bash
python3 tools/sct_tool.py import res/bin/sct.bin translations/sct_dialogue_export.csv res/bin/sct_vi.bin --strict-limits
```

Build:

```bash
./build_safe.sh res/bin/sct_vi.bin release_safe/shugochara_vi.jar
```

## Nguyên tắc của bản SAFE

- Không compile `src_patch/*.java`.
- Không sửa trực tiếp `base_classes/`.
- Copy class gốc sang `_safe_work/jarroot/` rồi patch chữ trong constant pool.
- Verify `sct.bin` trước và sau khi đóng gói JAR.

## Thư mục quan trọng

```text
base_classes/       class gốc, không sửa trực tiếp
res/                tài nguyên game
tools/              tool sct và patch class
build_tools/        make_jar.py
config/             map chuỗi menu Trung -> Việt ASCII
translations/       CSV lời thoại để dịch
backups/            backup sct gốc
class_compare/      class gốc để so sánh khi cần
release_safe/       output build, tự sinh
_safe_work/         thư mục tạm, tự sinh, có thể xóa
```

## Không có trong gói này

Các thư mục cũ không cần cho SAFE build đã bị loại bỏ:

```text
.git/
src_patch/
src_decompiled_all/
lib/
build/
dist/
```

Nếu cần nghiên cứu source decompiled, giữ riêng ở một bản archive khác, không dùng để build phát hành.
