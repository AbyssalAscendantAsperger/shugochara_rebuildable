# Bộ công cụ Việt hóa `res/bin/sct.bin`

File chính: `tools/sct_tool.py`

## 1) Xuất lời thoại

```bash
python3 tools/sct_tool.py export res/bin/sct.bin sct_dialogue_export.csv
```

CSV có các cột:

- `section`, `index`: khóa định danh câu thoại.
- `refs`: dữ liệu điều kiện/trigger của game, **không sửa**.
- `original_bytes`: độ dài byte gốc theo Java `writeUTF`.
- `soft_limit_bytes`: giới hạn khuyến nghị = `original_bytes - 1`. Ví dụ gốc 12 byte thì nên dịch tối đa 11 byte.
- `original`: tiếng Trung gốc.
- `translated`: nhập bản dịch Việt/Anh ngắn vào đây.

## 2) Kiểm tra bản dịch trước khi đóng gói

```bash
python3 tools/sct_tool.py check res/bin/sct.bin --csv sct_dialogue_export.csv
```

Nếu muốn CI/build lỗi khi có câu vượt `soft_limit_bytes`:

```bash
python3 tools/sct_tool.py check res/bin/sct.bin --csv sct_dialogue_export.csv --fail-on-long
```

## 3) Import và tính lại pointer

Chế độ thường: cho phép câu dài/ngắn khác gốc, tool sẽ tính lại pointer block text.

```bash
python3 tools/sct_tool.py import res/bin/sct.bin sct_dialogue_export.csv res/bin/sct_vi.bin
```

Chế độ an toàn tuyệt đối: không cho câu vượt `original_bytes - 1`.

```bash
python3 tools/sct_tool.py import res/bin/sct.bin sct_dialogue_export.csv res/bin/sct_vi.bin --strict-limits
```

Sau khi build, tool tự parse lại file mới để chắc chắn pointer không hỏng.

## 4) Đóng gói vào JAR

Cách nhanh, thay `bin/sct.bin` trong JAR đã build:

```bash
python3 tools/sct_tool.py patch-jar dist/shugochara_rebuild.jar res/bin/sct_vi.bin dist/shugochara_vi_sct.jar
```

Hoặc thay trực tiếp `res/bin/sct.bin` bằng bản mới rồi chạy build repo:

```bash
cp res/bin/sct_vi.bin res/bin/sct.bin
./build.sh
```

## Quy tắc dịch ngắn, ít vỡ giao diện

Ưu tiên không dấu nếu cần cực ngắn. Các ký tự Việt có dấu thường tốn 2-3 byte trong UTF-8; chữ ASCII tốn 1 byte.

Gợi ý viết tắt:

| Nghĩa | Dài | Ngắn nên dùng |
|---|---|---|
| tấn công | Tấn công | ATK / Danh |
| phòng thủ | Phòng thủ | DEF / Thu |
| sinh lực | Sinh lực | HP |
| ma lực | Ma lực | MP |
| kỹ năng | Kỹ năng | Skill / KN |
| trang bị | Trang bị | Gear / TB |
| nhiệm vụ | Nhiệm vụ | Quest / NV |
| bản đồ | Bản đồ | Map / BĐ |
| xác nhận | Xác nhận | OK |
| hủy/quay lại | Quay lại | Back |
| vật phẩm | Vật phẩm | Item / VP |
| sát thương | Sát thương | DMG |

Ví dụ nếu `soft_limit_bytes=11`:

- `Tấn công` có dấu có thể vượt nhanh; dùng `ATK`.
- `Phòng thủ` dùng `DEF`.
- `Nhiệm vụ` dùng `Quest` hoặc `NV`.

Với thoại dài, có thể dùng tiếng Việt không dấu để tiết kiệm byte và giữ nghĩa:

- `Vào Map, phím 2/4/6/8 để đi.`
- `Boss da mo. Den Map de vao.`
- `Can Item de ren. Gap tho ren.`
