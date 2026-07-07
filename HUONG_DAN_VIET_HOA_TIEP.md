# Hướng dẫn việt hóa nốt phần còn lại — ShugoChara J2ME

> **Tóm tắt:** Dự án dùng workflow: sửa file Java trong `src_patch/` → build bằng `build.sh` → ra JAR mới trong `dist/`.  
> File CSV (`java_chinese_phrases_for_translation.csv`) liệt kê **toàn bộ chuỗi tiếng Trung** còn nằm trong code Java, kèm tên file và số dòng chính xác.

---

## 1. Những gì đã làm được
- Workspace đã chuẩn bị sẵn: `src_patch/`, `base_classes/`, `res/`, `lib/`, `build.sh`
- Một số file `.java` đã nằm trong `src_patch/` (a, ad, ae, ak, al, am, ao, aq, ar, as, at, e, l, m, o, q, s, u, y, CMIDlet…) — tức là đã xác nhận compile được
- File CSV đã có cột `vi_vn` (hiện phần lớn vẫn trống)

---

## 2. Phần còn lại cần làm

### 2A. Điền bản dịch vào CSV (đã xong — xem file kèm theo)

File `java_chinese_phrases_translated.csv` trong workspace này đã dịch **toàn bộ 539 chuỗi** sang tiếng Việt.  
→ Copy nội dung đó ghi đè lên `java_chinese_phrases_for_translation.csv` trong repo của bạn.

### 2B. Áp dụng bản dịch vào từng file `.java` trong `src_patch/`

Với **mỗi dòng trong CSV**, tra cột `occurrences` để biết **file nào, dòng bao nhiêu**.  
Ví dụ:
```
JAVA_ZH_0016,怒气不足,Không đủ nộ khí,...,aa.java:545; aa.java:1176; aa.java:1500
```
→ Mở `src_decompiled_all/aa.java`, tìm dòng 545/1176/1500, sao chép file đó sang `src_patch/aa.java`, rồi thay `"怒气不足"` → `"Không đủ nộ khí"`.

#### Danh sách file Java cần sửa (theo CSV):

| File | Cần trong src_patch? | Ghi chú |
|------|---------------------|---------|
| `a.java` | ✅ Đã có | Phím điều khiển (ZH_0001–0014) |
| `aa.java` | ❌ Chưa có | Nhiều chuỗi quan trọng: nộ khí, level up, v.v. |
| `ad.java` | ✅ Đã có | Menu tạm dừng, thoát game |
| `ae.java` | ✅ Đã có | Độ khó (初入江湖/再征沙场/卸甲归田) |
| `af.java` | ❌ Chưa có | Hệ thống thanh toán (có thể bỏ qua nếu không cần) |
| `ai.java` | ❌ Chưa có | Script sự kiện, nhiệm vụ |
| `an.java` | ❌ Chưa có | Loại vật phẩm rơi |
| `as.java` | ✅ Đã có | Màn hình đăng nhập/lưu |
| `av.java` | ❌ Chưa có | **File quan trọng nhất** — menu chính, tips, bản đồ, dialog v.v. |
| `b.java` | ❌ Chưa có | Lỗi hoạt ảnh (debug, thấp ưu tiên) |
| `c.java` | ❌ Chưa có | Chữ Vàng (金) |
| `d.java` | ❌ Chưa có | **File lớn nhất** — toàn bộ UI: menu, shop, kỹ năng, nhiệm vụ, lưu game |
| `e.java` | ✅ Đã có | Kỹ năng, mô tả kỹ năng |
| `g.java` | ❌ Chưa có | Nút Xác nhận |
| `j.java` | ❌ Chưa có | Lỗi bản đồ (debug) |
| `k.java` | ❌ Chưa có | Lỗi UI (debug) |
| `m.java` | ✅ Đã có | **Tên và mô tả vật phẩm** — rất quan trọng |
| `o.java` | ✅ Đã có | Ngũ hành (Kim/Mộc/Thủy/Hỏa/Thổ) |
| `q.java` | ✅ Đã có | Quảng cáo mua game |
| `t.java` | ❌ Chưa có | **Toàn bộ tên vũ khí/giáp/nhẫn + mô tả + upgrade** |
| `u.java` | ✅ Đã có | Nhãn stats nhân vật |
| `v.java` | ❌ Chưa có | Danh hiệu, phòng thủ |
| `w.java` | ❌ Chưa có | Vật phẩm chưa sẵn sàng, danh hiệu |
| `y.java` | ✅ Đã có | Warning nhóm nhiệm vụ |

---

## 3. Thứ tự ưu tiên

### 🔴 Ưu tiên cao (người chơi thấy trực tiếp)

1. **`av.java`** — menu chính, tips màn hình loading, tên địa điểm, dialog hệ thống  
2. **`d.java`** — toàn bộ UI game: shop, kỹ năng, nhiệm vụ, lưu/tải  
3. **`t.java`** — tên và mô tả vũ khí/giáp/trang sức (+ công thức nâng cấp)  
4. **`aa.java`** — thông báo chiến đấu: nộ khí, kỹ năng chưa sẵn, level up

### 🟡 Ưu tiên trung bình

5. **`ai.java`** — script sự kiện, nhiệm vụ  
6. **`v.java`** — danh hiệu, phòng thủ  
7. **`w.java`** — vật phẩm, danh hiệu  
8. **`an.java`**, `c.java`, `g.java` — nhỏ lẻ

### 🟢 Thấp (chủ yếu là debug log)

9. `af.java` — hệ thống thanh toán UC (có thể xóa/bỏ qua)  
10. `b.java`, `j.java`, `k.java` — thông báo lỗi nội bộ

---

## 4. Quy trình từng bước

```bash
# 1. Lấy file cần sửa từ src_decompiled_all
cp src_decompiled_all/av.java src_patch/av.java

# 2. Sửa chuỗi Trung → Việt theo CSV (dùng editor hoặc sed)
# Ví dụ sed (cẩn thận với encoding UTF-8):
# sed -i 's/"继续游戏"/"Tiếp tục"/g' src_patch/av.java

# 3. Build thử
./build.sh

# 4. Nếu lỗi compile → xem báo lỗi, sửa tay decompile artifact
# 5. Test trên emulator J2ME (KEmulator, J2ME Loader trên Android, v.v.)
```

---

## 5. Lưu ý kỹ thuật về encoding

Game dùng **Java ME / CLDC 1.0** — chuỗi trong code là **UTF-16 literals** trong `.java`.  
Khi sửa, giữ nguyên kiểu `"chuỗi"` — không cần escape đặc biệt cho tiếng Việt có dấu,  
miễn là file `.java` lưu ở **UTF-8** và build script truyền `-encoding UTF-8` cho ECJ  
(kiểm tra `build.sh` xem đã có flag đó chưa).

### Kiểm tra build.sh có UTF-8 flag chưa:
```bash
grep -i encoding build.sh
```
Nếu chưa có, thêm vào lệnh ECJ:
```
-encoding UTF-8
```

---

## 6. Vấn đề font chữ (.bin)

Nếu sau khi dịch chữ Việt **hiển thị sai/không hiện** → game dùng **bitmap font** tự vẽ.  
Cần chỉnh file ảnh font (thường là `num*.png`, hoặc một file PNG chứa bảng chữ cái).  
Với J2ME thuần, `drawString()` dùng font hệ thống thiết bị — nếu thiết bị/emulator hỗ trợ  
Unicode thì chữ Việt sẽ hiện đúng. Nếu không, cần dùng bitmap font tự custom.

---

## 7. Script Python tự động thay thế (tùy chọn)

```python
import csv, re, shutil

# Đọc bản dịch
translations = {}
with open('java_chinese_phrases_translated.csv', encoding='utf-8') as f:
    for row in csv.DictReader(f):
        if row['vi_vn']:
            translations[row['zh_cn']] = row['vi_vn']

# Áp dụng vào một file java
def translate_file(src, dst):
    with open(src, encoding='utf-8') as f:
        content = f.read()
    for zh, vi in translations.items():
        # Thay thế chuỗi trong string literal Java
        content = content.replace(f'"{zh}"', f'"{vi}"')
    with open(dst, 'w', encoding='utf-8') as f:
        f.write(content)

# Ví dụ
translate_file('src_decompiled_all/av.java', 'src_patch/av.java')
translate_file('src_decompiled_all/d.java',  'src_patch/d.java')
translate_file('src_decompiled_all/t.java',  'src_patch/t.java')
translate_file('src_decompiled_all/aa.java', 'src_patch/aa.java')
```

> ⚠️ Script tự động có thể sai với chuỗi nối (`+`), chuỗi nhiều dòng, hoặc chuỗi xuất hiện nhiều lần với ngữ cảnh khác nhau. Luôn kiểm tra lại bằng tay và build thử.

---

## 8. Checklist hoàn thành việt hóa

- [ ] `av.java` — dịch xong & compile OK
- [ ] `d.java` — dịch xong & compile OK  
- [ ] `t.java` — dịch xong & compile OK
- [ ] `aa.java` — dịch xong & compile OK
- [ ] `ai.java` — dịch xong & compile OK
- [ ] `v.java`, `w.java`, `an.java` — dịch xong
- [ ] Test toàn bộ menu, shop, kỹ năng, nhiệm vụ trên emulator
- [ ] Kiểm tra font hiển thị đúng chữ Việt có dấu
- [ ] Build final JAR `dist/shugochara_rebuild.jar`
