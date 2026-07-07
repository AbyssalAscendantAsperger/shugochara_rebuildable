import java.io.DataInputStream;
import java.io.DataOutputStream;

public final class m {
   private static n m = null;
   public static final String[] a = new String[]{
      "Bình máu",
      "Bình ma lực",
      "Nước sự sống",
      "Đá nộ khí",
      "Đá tấn công",
      "Đá phòng thủ",
      "Thức ăn thú cưng",
      "Hoa tươi",
      "Đá ma hồn",
      "Sách tẩy điểm",
      "Sách kỹ năng",
      "Càng cua",
      "Ánh sao",
      "Vỏ ốc biển",
      "Tim ếch",
      "Hồn thạch",
      "Lưỡi dao",
      "Mật rắn",
      "Ma nhận",
      "Băng tinh",
      "Ma tâm",
      "Tim rực lửa",
      "Thông thiên nhãn",
      "Khóa băng tinh",
      "Phong ma ấn",
      "Tiền vàng"
   };
   public static final String[] b = new String[]{
      "Hồi 30% HP.",
      "Hồi 30% MP.",
      "Dùng khi chết để hồi sinh đầy trạng thái.",
      "Dùng hồi đầy 100% nộ khí.",
      "Dùng tăng vĩnh viễn +2 Tấn công.",
      "Dùng tăng vĩnh viễn +1 Phòng thủ.",
      "Dùng tăng 20 kinh nghiệm thú cưng.",
      "Dùng tăng +10 độ hảo cảm của Laura.",
      "Linh thạch cần để nâng cấp thú cưng.",
      "Tẩy điểm kỹ năng để cộng lại từ đầu.",
      "Dùng nhận ngay +1 điểm kỹ năng.",
      "Càng của cua đột biến, cực kỳ cứng chắc.",
      "Vỏ rơi ra từ sao biển, có công dụng đặc biệt.",
      "Vỏ ốc biển, thường dùng làm nguyên liệu chế tạo.",
      "Tim ếch, có tác dụng làm sáng mắt.",
      "Kết tinh của u hồn.",
      "Lưỡi dao Ảo Linh Giới, nguyên liệu nâng cấp vũ khí.",
      "Mật rắn.",
      "Vũ khí của ma thỏ, vô cùng sắc bén.",
      "Băng thạch cực hàn, mang năng lượng thần bí.",
      "Tim đèn rơi từ quái lồng đèn, tràn đầy ma lực.",
      "Trái tim của Zakum, chứa đựng sức mạnh vô biên.",
      "Vật phẩm nhiệm vụ vào Đảo Dạ Sắc, nhìn thấu mọi ngụy trang của Ảo Linh.",
      "Vật phẩm nhiệm vụ vào Dãy núi Zakum, chống sát thương từ dung nham nóng rực.",
      "Vật phẩm nhiệm vụ cần để vào Vương cung dưới lòng đất."
   };
   public static final String[] c = new String[]{
      "Chế tạo Thông thiên nhãn & Vật phẩm vào Đảo Dạ Sắc, nhìn thấu ngụy trang Ảo Linh. & Yêu cầu: Ánh sao 20, Vỏ ốc biển 20, Tim ếch 20, Ma nhận 2, Tiền vàng 2000",
      "Chế tạo Khóa băng tinh & Vật phẩm vào Dãy núi Zakum, chống sát thương dung nham. & Yêu cầu: Băng tinh 5, Lưỡi dao 4, Mật rắn 3, Tiền vàng 1000",
      "Chế tạo Phong ma ấn & Vật phẩm cần để vào Vương cung dưới lòng đất. & Yêu cầu: Ma tâm 50, Lưỡi dao 5, Mật rắn 5, Tiền vàng 5000"
   };
   public static final short[] d = new short[]{5, 7, 75, 22, 23, -1, -1, 58};
   public static final String[] e = new String[]{"HP + ", "MP + ", ""};
   public static final short[][] f = new short[][]{
      {0, 300, 0, 30, 8},
      {0, 200, 1, 30, 8},
      {0, 1000, -1, 0, 0},
      {0, 200, 2, 100, 8},
      {0, 1000, 3, 2, 0},
      {0, 1000, 4, 1, 0},
      {0, 1500, 5, 1, 0},
      {0, 1000, -1, 0, 0},
      {0, 300, 6, 50, 6},
      {0, 3000, -1, 0, 0},
      {0, 0, 7, 5, 0},
      {1, 0, -1, 0, 0},
      {1, 0, -1, 0, 0},
      {1, 0, -1, 0, 0},
      {1, 0, -1, 0, 0},
      {1, 0, -1, 0, 0},
      {1, 0, -1, 0, 0},
      {1, 0, -1, 0, 0},
      {1, 3000, -1, 0, 0},
      {1, 4000, -1, 0, 0},
      {1, 5000, -1, 0, 0},
      {1, 0, -1, 0, 0},
      {2, 0, -1, 0, 0},
      {2, 0, -1, 0, 0},
      {2, 0, -1, 0, 0}
   };
   public short g = -1;
   public short[] h = null;
   public String i = null;
   public String j = null;
   public int k = 1;
   public byte l = -1;

   private m() {
   }

   public final void a(DataOutputStream var1) throws Exception {
      o.a(this.h, var1);
      var1.writeShort(this.g);
      var1.writeByte(this.l);
      var1.writeInt(this.k);
   }

   public final void a(DataInputStream var1) throws Exception {
      this.h = o.b(var1);
      this.g = var1.readShort();
      this.l = var1.readByte();
      this.k = var1.readInt();
      this.i = a[this.g];
      this.j = b[this.g];
   }

   public static final m a(int var0) {
      if (var0 >= 0 && var0 < f.length) {
         m var1;
         (var1 = new m()).g = (short)var0;
         var1.i = a[var0];
         var1.j = b[var0];
         var1.h = new short[5];

         for(int var2 = 0; var2 < f[var0].length; ++var2) {
            var1.h[var2] = f[var0][var2];
         }

         var1.l = (byte)var1.h[0];
         var1.k = 1;
         return var1;
      } else {
         System.out.println("error:Drug->produceDrug(int id):id is error!");
         return null;
      }
   }

   public final int a() {
      return this.h[1];
   }

   public final void a(aa var1) {
      var1.a(0, this.i + "+1");
      w.a(this, 1);
      if (ai.f[12] >= 50 && ai.f[12] < 99 && this.g == 11) {
         w.a(11, -50);
         ai.a(12, (byte)99, 1);
      } else if (ai.f[12] > 0 && ai.f[12] < 99 && this.g == 11) {
         ai.a(12, (byte)1, 0);
      } else if (ai.f[13] >= 3 && ai.f[13] < 99 && this.g == 20) {
         w.a(20, -3);
         ai.a(13, (byte)99, 1);
      } else if (ai.f[13] > 0 && ai.f[13] < 99 && this.g == 20) {
         ai.a(13, (byte)1, 0);
      } else if (ai.f[16] >= 50 && ai.f[16] < 99 && this.g == 15) {
         w.a(15, -50);
         ai.a(16, (byte)99, 1);
      } else if (ai.f[16] > 0 && ai.f[16] < 99 && this.g == 15) {
         ai.a(16, (byte)1, 0);
      } else if (ai.f[21] >= 3 && ai.f[21] < 99 && this.g == 18) {
         w.a(18, -3);
         ai.a(21, (byte)99, 1);
      } else if (ai.f[21] > 0 && ai.f[21] < 99 && this.g == 18) {
         ai.a(21, (byte)1, 0);
      } else if (ai.f[25] >= 20 && ai.f[25] < 99 && this.g == 13) {
         w.a(13, -20);
         ai.a(25, (byte)99, 1);
      } else if (ai.f[25] > 0 && ai.f[25] < 99 && this.g == 13) {
         ai.a(25, (byte)1, 0);
      } else if (ai.f[27] >= 20 && ai.f[27] < 99 && this.g == 17) {
         w.a(17, -20);
         ai.a(27, (byte)99, 1);
      } else if (ai.f[27] > 0 && ai.f[27] < 99 && this.g == 17) {
         ai.a(27, (byte)1, 0);
      } else if (ai.f[29] >= 3 && ai.f[29] < 99 && this.g == 19) {
         w.a(19, -3);
         ai.a(29, (byte)99, 1);
      } else {
         if (ai.f[29] > 0 && ai.f[29] < 99 && this.g == 19) {
            ai.a(29, (byte)1, 0);
         }
      }
   }

   public final void b(aa var1) {
      if (this.l == 0 && this.h[2] >= 0) {
         if (this.h[2] < 2) {
            this.h[3] = this.h[2] == 0 ? (short)(av.t.W[6] * 3 / 10) : (short)(av.t.W[8] * 3 / 10);
            var1.a(0, e[this.h[2]] + this.h[3]);
            av.c(1, 4);
         }

         var1.W[d[this.h[2]]] += this.h[3];
         var1.e(this.g, b(this.g));
         var1.u();
         var1.h();
      }
   }

   public static final int b(int var0) {
      return f[var0][4] * ae.b;
   }

   public final void a(int var1, int var2) {
      if (m == null) {
         m = new n();
      }

      m.c = 58;
      m.d = 1;
      m.e = this.g;
      if (m.e > 25) {
         System.out.println("[Error] :== the actionid is over the maximal num. actionid = " + this.g);
      } else {
         m.b(var1, var2);
      }
   }

   public final void a(short[] var1) {
      this.a(var1[0] + (var1[2] >> 1), var1[1] + (var1[3] >> 1));
   }

   public static final void b() {
      if (m != null) {
         m.h();
      }
   }

   static {
      short[][][] var10000 = new short[][][]{
         {{50, 3}, {50, 6}, {50, 9}, {50, 14}},
         {{2, 15}, {5, 30}, {10, 50}, {15, 80}},
         {{0, 2}, {0, 3}, {0, 5}, {0, 8}},
         {{0, -2}, {0, -4}, {0, -6}, {0, -11}},
         {{-1, -8}, {-3, -15}, {-6, -30}, {-10, -60}},
         {{0, -1}, {0, -2}, {0, -3}, {0, -6}}
      };
      String[] var0 = new String[]{
         "Giảm 50% tốc độ, duy trì 3 giây",
         "Giảm 50% tốc độ, duy trì 6 giây",
         "Giảm 50% tốc độ, duy trì 9 giây",
         "Giảm 50% tốc độ, duy trì 14 giây",
         "Làm choáng nhân vật trong 2 giây",
         "Làm choáng nhân vật trong 3 giây",
         "Làm choáng nhân vật trong 5 giây",
         "Làm choáng nhân vật trong 8 giây",
         "Trúng độc mất 2 HP/giây, duy trì 15 giây",
         "Trúng độc mất 5 HP/giây, duy trì 30 giây",
         "Trúng độc mất 10 HP/giây, duy trì 50 giây",
         "Trúng độc mất 15 HP/giây, duy trì 80 giây",
         "Giảm 2 giây thời gian hiệu ứng",
         "Giảm 4 giây thời gian hiệu ứng",
         "Giảm 6 giây thời gian hiệu ứng",
         "Giảm 11 giây thời gian hiệu ứng",
         "Giảm 1 giây thời gian hiệu ứng",
         "Giảm 2 giây thời gian hiệu ứng",
         "Giảm 3 giây thời gian hiệu ứng",
         "Giảm 6 giây thời gian hiệu ứng",
         "Giảm 1 sát thương, giảm 6 giây hiệu ứng",
         "Giảm 3 sát thương, giảm 15 giây hiệu ứng",
         "Giảm 6 sát thương, giảm 30 giây hiệu ứng",
         "Giảm 10 sát thương, giảm 60 giây hiệu ứng"
      };
   }
}
