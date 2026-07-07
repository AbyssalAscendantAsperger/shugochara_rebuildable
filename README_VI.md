# ShugoChara J2ME - decompile/rebuild workspace

Gói này được chuẩn bị để **việt hoá JAR Java ME/J2ME**.

## Nội dung

- `src_decompiled_all/` — toàn bộ `.java` decompile từ file JAR gốc bằng Vineflower.
- `src_patch/` — các file `.java` decompile đã kiểm tra compile được bằng ECJ Java 1.4/CLDC. Khi build, các file trong thư mục này sẽ được compile và ghi đè lên class gốc.
- `base_classes/` — class gốc dùng làm nền/fallback để JAR luôn đủ class.
- `res/` — tài nguyên gốc (`bin/*.bin`, ảnh, âm thanh, `META-INF/MANIFEST.MF`, `APISetting.ini`). Đây thường là nơi cần sửa khi việt hoá.
- `lib/` — compiler ECJ và stub API CLDC/MIDP/Nokia/WMA để compile offline.
- `dist/` — nơi sinh ra JAR sau khi build.

## Build lại JAR

Trên Linux/macOS/WSL:

```bash
cd shugochara_rebuildable
./build.sh
```

Kết quả:

```text
dist/shugochara_rebuild.jar
```

Trên Windows có JDK:

```bat
build.bat
```

## Cách dùng cho bước việt hoá

1. Sửa tài nguyên trong `res/` trước, đặc biệt là các file `.bin`, `.ini`, ảnh.
2. Nếu cần sửa code/string trong Java:
   - xem nguồn trong `src_decompiled_all/`;
   - copy file cần sửa sang `src_patch/`;
   - sửa rồi chạy `./build.sh`.
3. Nếu file mới copy sang `src_patch/` báo lỗi compile, cần chỉnh lại decompile thủ công. Một số class bị obfuscate mạnh nên decompiler chưa tạo ra Java sạch 100%.

## Ghi chú kỹ thuật

- JAR gốc là Java ME: class version `45.3`, CLDC/MIDP (`MicroEdition-Configuration: CLDC-1.0`, `MicroEdition-Profile: MIDP-1.0`).
- Build script dùng ECJ với `-1.4 -target cldc1.1` để sinh StackMap phù hợp Java ME.
- Mặc định build theo kiểu an toàn: dùng `base_classes/` làm nền rồi compile các class trong `src_patch/` đè lên. Nhờ vậy JAR build ra luôn đủ class để chạy/đóng gói.
- `build_all_experimental.sh` chỉ để thử compile toàn bộ decompile; hiện không dùng cho build mặc định vì game bị obfuscate, một số class cần sửa tay.

## Các source đã verify compile trong `src_patch/`

Xem `docs/compile_ready_sources.txt`.
