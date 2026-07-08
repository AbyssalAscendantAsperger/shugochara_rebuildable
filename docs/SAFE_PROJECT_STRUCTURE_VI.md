# Cấu trúc dự án an toàn để Việt hóa J2ME Shugo Chara

## Nguyên tắc quan trọng

Không dùng `./build.sh` gốc cho bản phát hành Việt hóa nếu chưa kiểm tra kỹ, vì script đó compile lại `src_patch/*.java` từ mã decompiled và có thể làm hỏng logic game.

Dùng script mới:

```bash
./build_safe.sh
```

Hoặc chỉ định `sct.bin` đã dịch và tên JAR output:

```bash
./build_safe.sh res/bin/sct_vi.bin release_safe/shugochara_vi.jar
```

Script này:

1. Copy `base_classes/` gốc sang thư mục work.
2. Copy `res/` sang thư mục work.
3. Ghi đè `bin/sct.bin` nếu bạn truyền file dịch.
4. Verify `sct.bin` bằng `tools/sct_tool.py`.
5. Patch chuỗi UI bằng constant-pool patch, không compile Java.
6. Pack JAR.
7. Extract `bin/sct.bin` từ JAR và parse lại để chắc chắn không hỏng pointer.

---

## Cấu trúc nên giữ cho dự án mới

```text
shugochara_project/
├── base_classes/                         # BẮT BUỘC GIỮ - class gốc sạch để build và so sánh
├── res/                                  # BẮT BUỘC GIỮ - tài nguyên game
│   ├── META-INF/MANIFEST.MF
│   ├── APISetting.ini
│   └── bin/
│       ├── sct.bin                       # file đang dùng trong build
│       └── ...
├── tools/
│   ├── sct_tool.py                       # extract/import/repack sct.bin
│   ├── patch_class_utf8.py               # patch chuỗi trong .class không đổi logic
│   └── SCT_TOOL_HUONG_DAN.md
├── build_tools/
│   └── make_jar.py                       # pack JAR tương thích MIDP
├── config/
│   └── class_string_map_safe_vi_ascii.json # map chuỗi Trung -> Việt ASCII ngắn
├── translations/
│   └── sct_dialogue_export.csv           # nên để CSV dịch ở đây
├── class_compare/                        # tùy chọn, chứa class gốc/đã patch để diff
│   ├── original/                         # copy từ base_classes khi cần so sánh
│   └── patched/                          # copy từ _safe_work/jarroot sau build khi cần so sánh
├── build_safe.sh                         # script build an toàn
└── release_safe/                         # output JAR/report, có thể xóa và build lại
```

---

## Thư mục KHÔNG nên xóa

### `base_classes/`

Không xóa, không sửa trực tiếp. Đây là class gốc chạy ổn. Nếu mất thư mục này thì mất mốc so sánh và dễ quay lại lỗi như bản compile `src_patch`.

### `res/`

Không xóa. Đây là tài nguyên game. Có thể ghi đè `res/bin/sct.bin` bằng bản đã repack, nhưng nên backup file gốc.

### `tools/`

Không xóa. Chứa tool build/repack.

### `build_tools/`

Không xóa nếu vẫn dùng `make_jar.py` để pack JAR.

### `config/`

Không xóa nếu muốn patch menu/class string tự động.

---

## Thư mục có thể xóa khỏi dự án phát hành gọn

Các thư mục/file sau chủ yếu phục vụ nghiên cứu/decompile/compile thử, không cần cho build SAFE:

```text
src_patch/
src_decompiled_all/
docs/
lib/
build/
dist/
_safe_work/
```

Giải thích:

- `src_patch/`: không dùng trong build SAFE vì compile lại có thể hỏng logic.
- `src_decompiled_all/`: chỉ để tham khảo mã decompiled.
- `docs/`: tài liệu phụ, không cần khi chỉ build.
- `lib/`: chỉ cần khi compile Java bằng ECJ; build SAFE không compile Java.
- `build/`, `dist/`, `_safe_work/`: output/intermediate, có thể xóa và build lại.

Tuy nhiên, nếu còn đang nghiên cứu sâu thì nên giữ `src_decompiled_all/` và `src_patch/` ở một nhánh/phụ lục riêng, không dùng cho build phát hành.

---

## Có nên dùng thư mục chứa class mới để build không?

Có, nhưng không đặt tên là `base_classes` và không ghi đè class gốc.

Cách đúng:

```text
base_classes/          # class gốc, không động vào
_safe_work/jarroot/    # class được copy + patch tự động, dùng để pack JAR
release_safe/          # JAR thành phẩm
```

Nếu muốn lưu lại class đã patch để so sánh:

```bash
mkdir -p class_compare/patched
cp -R _safe_work/jarroot/*.class class_compare/patched/
```

So sánh với class gốc:

```bash
cmp -l base_classes/av.class class_compare/patched/av.class | head
```

Lưu ý: class đã patch chỉ khác constant string, không khác logic bytecode.

---

## Quy trình dịch `sct.bin` an toàn

### 1. Xuất CSV

```bash
python3 tools/sct_tool.py export res/bin/sct.bin translations/sct_dialogue_export.csv
```

### 2. Dịch cột `translated`

Ưu tiên ngắn hơn `soft_limit_bytes`. Có thể dùng không dấu/viết tắt:

```text
ATK, DEF, HP, MP, Skill, Quest, Map, Item, OK, Back
```

### 3. Import với strict limit

```bash
python3 tools/sct_tool.py import res/bin/sct.bin translations/sct_dialogue_export.csv res/bin/sct_vi.bin --strict-limits
```

### 4. Build JAR SAFE

```bash
./build_safe.sh res/bin/sct_vi.bin release_safe/shugochara_vi.jar
```

---

## Khi nào mới dùng `src_patch/`?

Chỉ dùng khi bắt buộc sửa logic game, và phải test từng class một. Không compile toàn bộ `src_patch` rồi ghi đè lên JAR phát hành.

Nếu cần sửa logic, nên:

1. Chọn đúng 1 class.
2. Compile riêng class đó.
3. Test toàn bộ menu/gameplay liên quan.
4. Nếu lỗi, quay về `base_classes` ngay.

Với Việt hóa text, ưu tiên patch `.class` constant pool thay vì compile lại Java.
