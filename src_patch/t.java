import java.io.DataInputStream;
import java.io.DataOutputStream;

public final class t {
   private static n s = null;
   public static final String[][] a = new String[][]{
      {
            "Kiếm Dũng Sĩ",
            "Kiếm Bạc Thật",
            "Kiếm Bá Vương",
            "Kiếm Mạ Vàng",
            "Kiếm Hàng Long",
            "Kiếm Chớp Giật",
            "Thánh Kiếm Khắc Kim",
            "Áo Phiêu Lưu",
            "Quân Phục Dũng Sĩ",
            "Giáp Sĩ Quan",
            "Giáp Tử Kim",
            "Giáp Kim Loại",
            "Giáp Cương Ngọc",
            "Nhẫn Sinh Mệnh",
            "Nhẫn Chí Mạng",
            "Vòng Tay Long Nha",
            "Dây Chuyền Tử Quang",
            "Khóa Hộ Tâm",
            "Trái Tim Cầu Vồng",
            "Dũng Sĩ Tập Sự",
            "Dũng Sĩ Chính Thức",
            "Dũng Sĩ Kiên Định",
            "Dũng Sĩ Cuồng Nhiệt",
            "Dũng Sĩ Tối Thượng",
            "Chuyên Gia Liên Kích",
            "Vua Liên Kích",
            "Kỵ Sĩ Toàn Năng",
            "Chuyên Gia Phòng Thủ",
            "Học Giả",
            "Nhà Thám Hiểm",
            "Kẻ Săn Mồi",
            "Đáng Yêu",
            "Đại Phú Ông",
            "Vua Băng Giá",
            "Lôi Thần",
            "Bậc Thầy Vũ Khí",
            "Võ Thần"
      },
      new String[0]
   };
   public static final String[][] b = new String[][]{
      {"Kiếm Dũng Sĩ1 Cấp &Kiếm thường dùng của dũng sĩ.Tấn công +10", "Kiếm Dũng Sĩ2 Cấp &Kiếm thường dùng của dũng sĩ.Tấn công +20", "Kiếm Dũng Sĩ3 Cấp &Kiếm thường dùng của dũng sĩ.Tấn công +30"},
      {"Kiếm Bạc Thật1 Cấp &锋利的Kiếm Bạc Thật，能提高Di chuyển Tốc độ 。Tấn công +20，Tốc độ +1", "Kiếm Bạc Thật2 Cấp &锋利的Kiếm Bạc Thật，能提高Di chuyển Tốc độ 。Tấn công +40，Tốc độ +1", "Kiếm Bạc Thật3 Cấp &锋利的Kiếm Bạc Thật，能提高Di chuyển Tốc độ 。Tấn công +60，Tốc độ +2"},
      {"Kiếm Bá Vương1 Cấp &Kiếm bản rộng, 10% tỷ lệ gây thêm 50% sát thương.Tấn công +20", "Kiếm Bá Vương2 Cấp &Kiếm bản rộng, 10% tỷ lệ gây thêm 50% sát thương.Tấn công +40，", "Kiếm Bá Vương3 Cấp &Kiếm bản rộng, 10% tỷ lệ gây thêm 50% sát thương.Tấn công +60"},
      {"Kiếm Mạ Vàng1 Cấp &神奇的Kiếm Mạ Vàng，Tấn công 有10%Tỷ lệ 造成100%额外伤害。Tấn công +30", "Kiếm Mạ Vàng2 Cấp &神奇的Kiếm Mạ Vàng，Tấn công 有20%Tỷ lệ 造成100%额外伤害。Tấn công +60", "Kiếm Mạ Vàng3 Cấp &神奇的Kiếm Mạ Vàng，Tấn công 有30%Tỷ lệ 造成100%额外伤害。Tấn công +90"},
      {"Kiếm Hàng Long1 Cấp &Thánh kiếm trừ yêu, 10% tỷ lệ gây x5 sát thương.Tấn công +40", "Kiếm Hàng Long2 Cấp &Thánh kiếm trừ yêu, 20% tỷ lệ gây x5 sát thương.Tấn công +80", "Kiếm Hàng Long3 Cấp &Thánh kiếm trừ yêu, 30% tỷ lệ gây x5 sát thương.Tấn công +120"},
      {
            "Kiếm Chớp Giật1 Cấp &Thánh kiếm cổ xưa, dùng Nhất Kiếm Phá không tốn nộ, 10% tỷ lệ gây x10 sát thương.Tấn công +50",
            "Thánh Kiếm Bóng Tối2 Cấp &Thánh kiếm cổ xưa, dùng Nhất Kiếm Phá không tốn nộ, 20% tỷ lệ gây x10 sát thương.Tấn công +100",
            "Thánh Kiếm Bóng Tối3 Cấp &Thánh kiếm cổ xưa, dùng Nhất Kiếm Phá không tốn nộ, 30% tỷ lệ gây x10 sát thương.Tấn công +150"
      },
      {
            "Thánh Kiếm Khắc Kim1 Cấp &Thánh kiếm của Thượng Cổ Thần, dùng Nhất Kiếm Phá không tốn nộ, 10% tỷ lệ gây x10 sát thương, bỏ qua phòng thủ.Tấn công +60",
            "Thánh Kiếm Khắc Kim2 Cấp &Thánh kiếm của Thượng Cổ Thần, dùng Nhất Kiếm Phá không tốn nộ, 20% tỷ lệ gây x10 sát thương, bỏ qua phòng thủ.Tấn công +120",
            "Thánh Kiếm Khắc Kim3 Cấp &Thánh kiếm của Thượng Cổ Thần, dùng Nhất Kiếm Phá không tốn nộ, 30% tỷ lệ gây x10 sát thương, bỏ qua phòng thủ.Tấn công +180"
      },
      {"Áo Phiêu Lưu1 Cấp &Trang bị phòng thủ cơ bản của dũng sĩ.Phòng thủ +2", "Áo Phiêu Lưu2 Cấp &Trang bị phòng thủ cơ bản của dũng sĩ.Phòng thủ +4", "Áo Phiêu Lưu3 Cấp &Trang bị phòng thủ cơ bản của dũng sĩ.Phòng thủ +6"},
      {"Quân Phục Dũng Sĩ1 Cấp &曾经流行在勇士岛的Quân Phục Dũng Sĩ。Phòng thủ +4", "Quân Phục Dũng Sĩ2 Cấp &曾经流行在勇士岛的Quân Phục Dũng Sĩ。Phòng thủ +8", "Quân Phục Dũng Sĩ3 Cấp &曾经流行在勇士岛的Quân Phục Dũng Sĩ。Phòng thủ +12"},
      {"Giáp Sĩ Quan1 Cấp &Giáp được phù phép của tinh anh Đảo Dũng Sĩ.Phòng thủ +6", "Giáp Sĩ Quan2 Cấp &Giáp được phù phép của tinh anh Đảo Dũng Sĩ.Phòng thủ +12", "Giáp Sĩ Quan3 Cấp &Giáp được phù phép của tinh anh Đảo Dũng Sĩ.Phòng thủ +18"},
      {"Giáp Tử Kim1 Cấp &Giáp của nhân loại vương giả thời cổ đại.Phòng thủ +8", "Giáp Tử Kim2 Cấp &Giáp của nhân loại vương giả thời cổ đại.Phòng thủ +16", "Giáp Tử Kim3 Cấp &Giáp của nhân loại vương giả thời cổ đại.Phòng thủ +24"},
      {"Giáp Kim Loại1 Cấp &Giáp mang năng lượng gia trì của Chiến Thần.Phòng thủ +10", "Giáp Kim Loại2 Cấp &Giáp mang năng lượng gia trì của Chiến Thần.Phòng thủ +20", "Giáp Kim Loại3 Cấp &Giáp mang năng lượng gia trì của Chiến Thần.Phòng thủ +30"},
      {"Giáp Cương Ngọc1 Cấp &Giáp bí ẩn, mang sức mạnh của Ma Thần.Phòng thủ +14", "Giáp Cương Ngọc2 Cấp &Giáp bí ẩn, mang sức mạnh của Ma Thần.Phòng thủ +28", "Giáp Cương Ngọc3 Cấp &Giáp bí ẩn, mang sức mạnh của Ma Thần.Phòng thủ +42"},
      {"Nhẫn Sinh Mệnh1 Cấp &Nhẫn mà dũng sĩ trên đảo thường đeo.HP tối đa +50", "Nhẫn Sinh Mệnh2 Cấp &Nhẫn mà dũng sĩ trên đảo thường đeo.HP tối đa +100", "Nhẫn Sinh Mệnh3 Cấp &Nhẫn mà dũng sĩ trên đảo thường đeo.HP tối đa +150"},
      {"Nhẫn Chí Mạng1 Cấp &Nhẫn đeo giúp tăng tỷ lệ chí mạng.Tỷ lệ chí mạng +3", "Nhẫn Chí Mạng2 Cấp &Nhẫn đeo giúp tăng tỷ lệ chí mạng.Tỷ lệ chí mạng +6", "Nhẫn Chí Mạng3 Cấp &Nhẫn đeo giúp tăng tỷ lệ chí mạng.Tỷ lệ chí mạng +10"},
      {"Vòng Tay Long Nha1 Cấp &Vòng tay làm từ răng rồng.Tấn công +10", "Vòng Tay Long Nha2 Cấp &Vòng tay làm từ răng rồng.Tấn công +20", "Vòng Tay Long Nha3 Cấp &Vòng tay làm từ răng rồng.Tấn công +30"},
      {"Dây Chuyền Tử Quang1 Cấp &Dây chuyền phát ra ánh sáng tím kỳ diệu.MP tối đa +50", "Dây Chuyền Tử Quang2 Cấp &Dây chuyền phát ra ánh sáng tím kỳ diệu.MP tối đa +100", "Dây Chuyền Tử Quang3 Cấp &Dây chuyền phát ra ánh sáng tím kỳ diệu.MP tối đa +150"},
      {"Khóa Hộ Tâm1 Cấp &黄金打造的Khóa Hộ Tâm。Phòng thủ +4", "Khóa Hộ Tâm2 Cấp &黄金打造的Khóa Hộ Tâm。Phòng thủ +8", "Khóa Hộ Tâm3 Cấp &黄金打造的Khóa Hộ Tâm。Phòng thủ +12"},
      {"Trái Tim Cầu Vồng &Vật phẩm bí ẩn, khi đeo giúp giảm nửa tiêu hao nộ khí."},
      {"HP tối đa +10，MP +5"},
      {"HP tối đa +50，MP +25"},
      {"HP tối đa +100，MP +50"},
      {"HP tối đa +150，MP +75"},
      {"HP tối đa +200，MP +100"},
      {"Tấn công +10"},
      {"Tấn công +10，Di chuyển Tốc độ +2"},
      {"Tấn công +20，Chí mạng +10"},
      {"Phòng thủ +20"},
      {"HP tối đa +300，MP +200"},
      {"Phòng thủ +10，Di chuyển Tốc độ +2"},
      {"Tấn công +10，Chí mạng +5"},
      {"HP +100，MP +50"},
      {"HP tối đa +200，MP +100"},
      {"Tấn công +10，Phòng thủ +10"},
      {"使用Kiếm Chớp Giật爆破的Tỷ lệ +5%"},
      {"Chí mạng +10"},
      {"Chí mạng +10，Di chuyển +2"}
   };
   public static final String[][] c = new String[][]{
      {"Kiếm Dũng Sĩ1 Cấp Kiếm thường dùng của dũng sĩ.Tấn công +10", "Kiếm Dũng Sĩ  1 Cấp→2 Cấp  Tấn công 10→20 & Yêu cầu:  Càng cua 10 Ánh sao 10 Vỏ ốc biển 5 Tiền vàng 500", "Kiếm Dũng Sĩ  2 Cấp→3 Cấp  Tấn công 20→30 & Yêu cầu:  Càng cua 20 Ánh sao 20 Vỏ ốc biển 10 Tiền vàng 500"},
      {"Kiếm Bạc Thật1 Cấp  锋利的Kiếm Bạc Thật，能提高Di chuyển Tốc độ 。Tấn công +20，Tốc độ +1", "Kiếm Bạc Thật  1 Cấp→2 Cấp  Tấn công 20→40 Di chuyển 1→1 & Yêu cầu:   Ánh sao 20 Vỏ ốc biển 10 Băng tinh 3 Tiền vàng 3000", "Kiếm Bạc Thật  2 Cấp→3 Cấp  Tấn công 40→60 Di chuyển 1→2 & Yêu cầu:   Ánh sao 40 Vỏ ốc biển 20 Băng tinh 5 Tiền vàng 3000"},
      {
            "Kiếm Bá Vương1 Cấp  Kiếm bản rộng, 10% tỷ lệ gây thêm 50% sát thương.Tấn công +30",
            "Kiếm Bá Vương  1 Cấp→2 Cấp  Tấn công 20→40 Tỷ lệ nổ 10%→20% & Yêu cầu:   Vỏ ốc biển 20 Băng tinh 3 Ma nhận 1 Tiền vàng 3000",
            "Kiếm Bá Vương  2 Cấp→3 Cấp  Tấn công 40→60 Tỷ lệ nổ 20%→30% & Yêu cầu:   Vỏ ốc biển 40 Băng tinh 5 Ma nhận 3 Tiền vàng 3000"
      },
      {
            "Kiếm Mạ Vàng1 Cấp  神奇的Kiếm Mạ Vàng，Tấn công 有10%的Tỷ lệ 造成100%的额外伤害。Tấn công +30",
            "Kiếm Mạ Vàng  1 Cấp→2 Cấp  Tấn công 20→40 冰冻率10%→20% & Yêu cầu:   Hồn thạch 20 Ma nhận 10 Mật rắn 3 Tiền vàng 3000",
            "Kiếm Mạ Vàng  2 Cấp→3 Cấp  Tấn công 40→60 冰冻率20%→30% & Yêu cầu:   Hồn thạch 40 Ma nhận 20 Mật rắn 5 Tiền vàng 3000"
      },
      {
            "Kiếm Hàng Long1 Cấp  Thánh kiếm trừ yêu, 10% tỷ lệ gây x5 sát thương.Tấn công +40",
            "Kiếm Hàng Long  1 Cấp→2 Cấp  Tấn công 40→80 Tỷ lệ 10%→20% & Yêu cầu:   Băng tinh 5 Mật rắn 5 Ma tâm 20 Tiền vàng 3000",
            "Kiếm Hàng Long  2 Cấp→3 Cấp  Tấn công 80→120 Tỷ lệ 20%→30% & Yêu cầu:   Băng tinh 10 Mật rắn 10 Ma tâm 40 Tiền vàng 3000"
      },
      {
            "Kiếm Chớp Giật1 Cấp Thánh kiếm cổ xưa, dùng Nhất Kiếm Phá không tốn nộ, 10% tỷ lệ gây x10 sát thương.Tấn công +50",
            "Kiếm Chớp Giật  1 Cấp→2 Cấp  Tấn công 50→100 Tỷ lệ chí mạng 10%→20% & Yêu cầu:   Tiền vàng 30000",
            "Kiếm Chớp Giật  2 Cấp→3 Cấp  Tấn công 100→150 Tỷ lệ chí mạng 20%→30% & Yêu cầu:   Tiền vàng 50000"
      },
      {
            "Thánh Kiếm Khắc Kim1 Cấp Thánh kiếm của Thượng Cổ Thần, dùng Nhất Kiếm Phá không tốn nộ, 10% tỷ lệ gây x10 sát thương, bỏ qua phòng thủ.Tấn công +60",
            "Thánh Kiếm Khắc Kim  1 Cấp→2 Cấp  Tấn công 60→120 Tỷ lệ chí mạng 10%→20% & Yêu cầu:  Băng tinh 10 Lưỡi dao 10 Ma nhận 50 Ma tâm 50 Tiền vàng 30000",
            "Thánh Kiếm Khắc Kim  2 Cấp→3 Cấp  Tấn công 120→180 Tỷ lệ chí mạng 20%→30% & Yêu cầu:  Băng tinh 20 Lưỡi dao 20 Ma nhận 100 Ma tâm 100 Tiền vàng 30000"
      },
      {"Áo Phiêu Lưu1 Cấp Trang bị phòng thủ cơ bản của dũng sĩ.Phòng thủ +2", "Áo Phiêu Lưu  1 Cấp→2 Cấp  Phòng thủ 2→4  & Yêu cầu:  Ánh sao 5 Vỏ ốc biển 5  Tiền vàng 500", "Áo Phiêu Lưu  2 Cấp→3 Cấp  Phòng thủ 4→6  & Yêu cầu:  Ánh sao 10 Vỏ ốc biển 10  Tiền vàng 500"},
      {"Quân Phục Dũng Sĩ1 Cấp 曾经流行在勇士岛的Quân Phục Dũng Sĩ。Phòng thủ +4", "Quân Phục Dũng Sĩ  1 Cấp→2 Cấp  Phòng thủ 4→8  & Yêu cầu:  Vỏ ốc biển 10 Tim ếch 10 Ma nhận 1 Tiền vàng 1000", "Quân Phục Dũng Sĩ  2 Cấp→3 Cấp  Phòng thủ 8→12  & Yêu cầu:  Vỏ ốc biển 20 Tim ếch 20 Ma nhận 3 Tiền vàng 1000"},
      {"Giáp Sĩ Quan1 Cấp Giáp được phù phép của tinh anh Đảo Dũng Sĩ.Phòng thủ +6", "Giáp Sĩ Quan  1 Cấp→2 Cấp  Phòng thủ 6→12  & Yêu cầu:  Tim ếch 10 Hồn thạch 10 Lưỡi dao 2 Tiền vàng 2000", "Giáp Sĩ Quan  2 Cấp→3 Cấp  Phòng thủ 12→18  & Yêu cầu:  Tim ếch 20 Hồn thạch 20 Lưỡi dao 3 Tiền vàng 2000"},
      {"Giáp Tử Kim1 Cấp Giáp của nhân loại vương giả thời cổ đại.Phòng thủ +8", "Giáp Tử Kim  1 Cấp→2 Cấp  Phòng thủ 8→16  & Yêu cầu:  Ma nhận 10 Vỏ ốc biển 20 Lưỡi dao 1 Tiền vàng 2000", "Giáp Tử Kim  2 Cấp→3 Cấp  Phòng thủ 16→24  & Yêu cầu:  Ma nhận 20 Vỏ ốc biển 40 Lưỡi dao 3 Tiền vàng 2000"},
      {"Giáp Kim Loại1 Cấp Giáp mang năng lượng gia trì của Chiến Thần.Phòng thủ +10", "Giáp Kim Loại  1 Cấp→2 Cấp  Phòng thủ 10→20  & Yêu cầu:  Ma nhận 20 Hồn thạch 10 Ma tâm 10 Tiền vàng 3000", "Giáp Kim Loại  2 Cấp→3 Cấp  Phòng thủ 20→30  & Yêu cầu:  Ma nhận 40 Hồn thạch 20 Ma tâm 20 Tiền vàng 3000"},
      {"Giáp Cương Ngọc1 Cấp Giáp bí ẩn, mang sức mạnh của Ma Thần.Phòng thủ +14", "Giáp Cương Ngọc  1 Cấp→2 Cấp  Phòng thủ 14→28  & Yêu cầu:  Băng tinh 5 Mật rắn 5 Lưỡi dao 5 Ma nhận 50 Tiền vàng 3000", "Giáp Cương Ngọc  2 Cấp→3 Cấp  Phòng thủ 28→42  & Yêu cầu:  Băng tinh 10 Mật rắn 10 Lưỡi dao 10 Ma nhận 100 Tiền vàng 3000"},
      {"Nhẫn Sinh Mệnh1 Cấp Nhẫn mà dũng sĩ trên đảo thường đeo.HP tối đa +50", "Nhẫn Sinh Mệnh  1 Cấp→2 Cấp  HP tối đa 50→100  & Yêu cầu:  Hồn thạch 10 Lưỡi dao 1 Tiền vàng 500", "Nhẫn Sinh Mệnh  2 Cấp→3 Cấp  HP tối đa 100→150  & Yêu cầu:  Hồn thạch 20 Lưỡi dao 3 Tiền vàng 500"},
      {"Nhẫn Chí Mạng1 Cấp Nhẫn đeo giúp tăng tỷ lệ chí mạng.Tỷ lệ chí mạng +3", "Nhẫn Chí Mạng  1 Cấp→2 Cấp  Tỷ lệ chí mạng 3→6 & Yêu cầu:  Ánh sao 10 Ma nhận 3 Tiền vàng 1000", "Nhẫn Chí Mạng  2 Cấp→3 Cấp  Tỷ lệ chí mạng 6→10 & Yêu cầu:  Ánh sao 20 Ma nhận 5 Tiền vàng 1000"},
      {"Vòng Tay Long Nha1 Cấp Vòng tay làm từ răng rồng.Tấn công +10", "Vòng Tay Long Nha  1 Cấp→2 Cấp  Tấn công 10→20 & Yêu cầu:  Băng tinh 5 Lưỡi dao 5 Mật rắn 5 Tiền vàng 2000", "Vòng Tay Long Nha  2 Cấp→3 Cấp  Tấn công 20→30 & Yêu cầu:  Băng tinh 10 Lưỡi dao 10 Mật rắn 10 Tiền vàng 2000"},
      {"Dây Chuyền Tử Quang1 Cấp Dây chuyền phát ra ánh sáng tím kỳ diệu.MP tối đa +50", "Dây Chuyền Tử Quang  1 Cấp→2 Cấp  MP tối đa 50→100 & Yêu cầu:  Vỏ ốc biển 10 Tim ếch 10 Băng tinh 1 Tiền vàng 2000", "Dây Chuyền Tử Quang  2 Cấp→3 Cấp  MP tối đa 100→150 & Yêu cầu:  Vỏ ốc biển 20 Tim ếch 20 Băng tinh 3 Tiền vàng 2000"},
      {"Khóa Hộ Tâm1 Cấp 黄金打造的Khóa Hộ Tâm。MP tối đa +50", "Khóa Hộ Tâm  1 Cấp→2 Cấp  MP tối đa 50→100 & Yêu cầu:  Ma nhận 10 Hồn thạch 10 Ma tâm 10 Tiền vàng 2000", "Khóa Hộ Tâm  2 Cấp→3 Cấp  MP tối đa 100→150 & Yêu cầu:  Ma nhận 20 Hồn thạch 20 Ma tâm 30 Tiền vàng 2000"},
      {"Vật phẩm bí ẩn, khi đeo giúp giảm nửa tiêu hao nộ khí."}
   };
   public static final String[] d = new String[]{
      "Đạt cấp 4",
      "Đạt cấp 10",
      "Đạt cấp 20",
      "Đạt cấp 30",
      "Đạt cấp 40",
      "Liên kích tối đa đạt 100",
      "Liên kích tối đa đạt 200",
      "Vượt hầm ngục Vương Giả đạt hạng SS",
      "Dùng phản công phòng thủ đạt 100 lần",
      "Hoàn thành 20 nhiệm vụ phụ",
      "Khám phá toàn bộ bản đồ",
      "Tự tay tiêu diệt 150 quái vật",
      "Thu thập toàn bộ thú cưng",
      "Nhận 100,000 vàng từ nhiệm vụ hoặc đánh quái",
      "Tiêu diệt Vua Băng Vạn Năm cấp Vương Giả",
      "Sở hữu Kiếm Chớp Giật",
      "Sở hữu toàn bộ vũ khí",
      "Luyện toàn bộ kỹ năng lên cấp tối đa"
   };
   public static final short[][][] e = new short[][][]{
      {
            {0, 1, 500, 3, 500, 3, 10, 10, 10, -1, 0, 0, 0, 10, 10, 5, -1, -1, -1, -1, -1, -1, -1, 20, 20, 10, -1, -1, -1, -1, -1, -1, -1},
            {0, 1, 0, 3, 3000, 3, 20, 20, 20, 6, 1, 0, 1, -1, 20, 10, -1, -1, -1, -1, -1, 3, -1, -1, 40, 20, -1, -1, -1, -1, -1, 5, -1},
            {0, 1, 0, 3, 3000, 3, 20, 20, 20, -1, 0, 0, 0, -1, -1, 20, -1, -1, -1, -1, 1, 3, -1, -1, -1, 40, -1, -1, -1, -1, 3, 5, -1},
            {0, 1, 0, 3, 3000, 3, 20, 20, 20, -1, 0, 0, 0, -1, -1, -1, -1, 20, -1, 3, 10, -1, -1, -1, -1, -1, -1, 40, -1, 5, 20, -1, -1},
            {0, 1, 0, 3, 3000, 3, 20, 20, 20, -1, 0, 0, 0, -1, -1, -1, -1, -1, -1, 5, -1, 5, 20, -1, -1, -1, -1, -1, -1, 10, -1, 10, 40},
            {0, 1, 30000, 3, 30000, 3, 50, 50, 50, -1, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {0, 1, 0, 3, 3000, 3, 60, 60, 60, -1, 0, 0, 0, -1, -1, -1, -1, -1, 10, -1, 50, 10, 50, -1, -1, -1, -1, -1, 20, -1, 100, 20, 100},
            {1, 1, 0, 3, 500, 4, 2, 2, 2, -1, 0, 0, 0, -1, 5, 5, -1, -1, -1, -1, -1, -1, -1, -1, 10, 10, -1, -1, -1, -1, -1, -1, -1},
            {1, 1, 2500, 3, 1000, 4, 4, 4, 4, -1, 0, 0, 0, -1, -1, 10, 10, -1, -1, -1, 1, -1, -1, -1, -1, 20, 20, -1, -1, -1, 3, -1, -1},
            {1, 1, 5000, 3, 2000, 4, 6, 6, 6, -1, 0, 0, 0, -1, -1, -1, 10, 10, 2, -1, -1, -1, -1, -1, -1, -1, 20, 20, 3, -1, -1, -1, -1},
            {1, 1, 7500, 3, 2000, 4, 8, 8, 8, -1, 0, 0, 0, -1, -1, 20, -1, -1, 1, -1, 10, -1, -1, -1, -1, 40, -1, 3, -1, 20, -1, -1, -1},
            {1, 1, 10000, 3, 3000, 4, 10, 10, 10, -1, 0, 0, 0, -1, -1, -1, -1, 10, -1, -1, 20, -1, 10, -1, -1, -1, -1, 20, -1, -1, 40, -1, 20},
            {1, 1, 15000, 3, 3000, 4, 14, 14, 14, -1, 0, 0, 0, -1, -1, -1, -1, -1, 5, 5, 50, -1, -1, -1, -1, -1, -1, -1, 10, 10, 100, -1, -1},
            {2, 1, 0, 3, 500, 0, 50, 50, 50, -1, 0, 0, 0, -1, -1, -1, -1, 10, 1, -1, -1, -1, -1, -1, -1, -1, -1, 20, 3, -1, -1, -1, -1},
            {2, 1, 3000, 3, 1000, 5, 3, 3, 4, -1, 0, 0, 0, -1, 10, -1, -1, -1, -1, -1, 3, -1, -1, -1, 20, -1, -1, -1, -1, -1, 5, -1, -1},
            {2, 1, 0, 3, 3000, 5, 5, 5, 10, -1, 0, 0, 0, -1, -1, -1, -1, -1, 5, 5, -1, 5, -1, -1, -1, -1, -1, -1, 10, 10, -1, 10, -1},
            {2, 1, 5000, 3, 2000, 3, 10, 10, 10, -1, 0, 0, 0, -1, -1, 10, 10, -1, -1, -1, -1, 1, -1, -1, -1, 20, 20, -1, -1, -1, -1, 3, -1},
            {2, 1, 5000, 3, 2000, 1, 50, 50, 50, -1, 0, 0, 0, -1, -1, -1, -1, 10, -1, -1, 10, -1, 10, -1, -1, -1, -1, 20, -1, -1, 20, -1, 20},
            {2, 1, 0, 0, 0, 2, 50, 0, 0, -1, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {3, 1, 0, 1, 0, 0, 10, 0, 0, 1, 5, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {3, 1, 0, 1, 0, 0, 50, 0, 0, 1, 25, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {3, 1, 0, 1, 0, 0, 100, 0, 0, 1, 50, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {3, 1, 0, 1, 0, 0, 150, 0, 0, 1, 75, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {3, 1, 0, 1, 0, 0, 200, 0, 0, 1, 100, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {3, 1, 0, 1, 0, 3, 10, 0, 0, -1, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {3, 1, 0, 1, 0, 3, 10, 0, 0, 6, 2, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {3, 1, 0, 1, 0, 3, 20, 0, 0, 5, 10, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {3, 1, 0, 1, 0, 4, 20, 0, 0, -1, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {3, 1, 0, 1, 0, 0, 300, 0, 0, 1, 200, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {3, 1, 0, 1, 0, 4, 10, 0, 0, 6, 2, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {3, 1, 0, 1, 0, 3, 15, 0, 0, 5, 5, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {3, 1, 0, 1, 0, 0, 50, 0, 0, 1, 50, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {3, 1, 0, 1, 0, 0, 200, 0, 0, 1, 100, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {3, 1, 0, 1, 0, 3, 10, 0, 0, 4, 10, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {3, 1, 0, 1, 0, -1, 0, 0, 0, -1, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {3, 1, 0, 1, 0, 6, 1, 0, 0, -1, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {3, 1, 0, 1, 0, 5, 10, 0, 0, 6, 2, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}
      }
   };
   public static short[] f = new short[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   public static final short[] g = new short[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   public static short[] h = new short[]{0, 0, 0, 0};
   public static final short[] i = new short[]{6, 8, 104, 24, 25, 32, 16};
   public short j;
   public short k = -1;
   public int l = 0;
   public short m = 1;
   public short n = 1;
   public short[] var_o;
   public String p = null;
   public String q = null;
   public boolean r = false;

   public static final t a(int var0, int var1) {
      if (var1 >= 0 && var1 < e[var0].length) {
         t var2;
         (var2 = new t()).l = var0;
         var2.j = (short)var1;
         var2.k = -1;
         var2.var_o = new short[33];

         for(int var3 = 0; var3 < e[var0][var1].length; ++var3) {
            var2.var_o[var3] = e[var0][var1][var3];
         }

         var2.p = a[var0][var1];
         var2.var_o[1] = f[var2.j];
         var2.m = var2.var_o[1];
         if (var2.m - 1 >= 0) {
            var2.q = b[var1][var2.m - 1];
         } else {
            var2.q = b[var1][0];
         }

         var2.n = var2.var_o[0];
         return var2;
      } else {
         System.out.println("error:Equip->ProduceEquip(int id):id is error!");
         return null;
      }
   }

   public static final void a() {
      s.h();
   }

   private t() {
   }

   public final void b(int var1, int var2) {
      if (s == null) {
         s = new n();
      }

      s.c = 58;
      s.d = 0;
      s.e = this.j;
      if (s.d > 20) {
         System.out.println("[Error] :== the actionid is over the maximal num. actionid = " + this.j);
      } else {
         s.b(var1, var2);
      }
   }

   public final void a(short[] var1) {
      this.b(var1[0] + (var1[2] >> 1), var1[1] + (var1[3] >> 1));
   }

   public final void a(DataOutputStream var1) throws Exception {
      o.a(this.var_o, var1);
      var1.writeShort(this.j);
      var1.writeByte(this.n);
      var1.writeShort(this.m);
      var1.writeShort(this.k);
      var1.writeBoolean(this.r);
      var1.writeShort(f.length);

      for(int var2 = 0; var2 < f.length; ++var2) {
         var1.writeShort(f[var2]);
      }
   }

   public final void a(DataInputStream var1) throws Exception {
      this.var_o = o.b(var1);
      this.j = var1.readShort();
      this.n = (short)var1.readByte();
      this.m = var1.readShort();
      this.k = var1.readShort();
      this.r = var1.readBoolean();
      short var2 = var1.readShort();

      for(int var3 = 0; var3 < var2; ++var3) {
         f[var3] = var1.readShort();
      }

      this.p = a[this.l][this.j];
      this.q = b[this.j][this.m - 1];
   }

   public final int b() {
      return this.var_o[2];
   }

   public final boolean c() {
      return this.var_o[3] > this.m;
   }

   public final int d() {
      if (this.m > this.var_o[3]) {
         return 1;
      } else {
         ++this.m;
         this.q = b[this.j][this.m - 1];
         f[this.j] = this.m;
         if (av.t.bf[this.n] == this) {
            av.t.W[i[this.var_o[5]]] -= this.var_o[6];
            if (this.var_o[9] >= 0) {
               av.t.W[i[this.var_o[9]]] -= this.var_o[10];
            }
         }

         this.var_o[6] += this.var_o[6 + this.m - 1];
         if (this.var_o[9] >= 0) {
            this.var_o[10] += this.var_o[10 + this.m - 1];
         }

         if (av.t.bf[this.n] == this) {
            this.b(av.t);
         }

         return 0;
      }
   }

   public final void a(aa var1) {
      var1.b.a(this);
      var1.a(0, this.p + "x1");
   }

   public final void b(aa var1) {
      var1.W[i[this.var_o[5]]] += this.var_o[6];
      if (this.var_o[9] >= 0) {
         var1.W[i[this.var_o[9]]] += this.var_o[10];
      }

      this.r = true;
   }

   public final void c(aa var1) {
      var1.W[i[this.var_o[5]]] -= this.var_o[6];
      if (this.var_o[9] >= 0) {
         var1.W[i[this.var_o[9]]] -= this.var_o[10];
      }

      this.r = false;
   }

   static {
      String[] var10000 = new String[]{"Trang bị", "Trang sức", "Vật phẩm", "Danh hiệu"};
      (new byte[1][])[0] = new byte[]{7, 6, 6, 6};
      byte[] var0 = new byte[]{11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
      var10000 = new String[]{"HP tối đa +", "MP tối đa +", "Giảm tiêu hao nộ", "Tấn công +", "Phòng thủ +", "Chí mạng +", "Tốc độ di chuyển +"};
      int[] var2 = new int[]{16777215, 16629766, 16744448};
      int[] var3 = new int[]{16777215, 4193351, 16385816};
   }
}
