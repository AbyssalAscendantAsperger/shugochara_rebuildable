import java.io.DataOutputStream;
import java.io.IOException;

public final class q implements Runnable {
   private static boolean[] a = new boolean[10];
   private static String[] b;
   private static String[] c;
   private static int[] d;
   private static int e;

   public q() {
      new Thread(this).start();
   }

   public static final void a(DataOutputStream var0) throws IOException {
      for(int var1 = 0; var1 < a.length; ++var1) {
         var0.writeBoolean(a[var1]);
      }
   }

   public static final boolean a(int var0) {
      return a[var0];
   }

   public static final String b(int var0) {
      return b[var0];
   }

   public static final int c(int var0) {
      return d[var0];
   }

   public static final void d(int var0) {
      e = var0;
   }

   public static final int a() {
      return e;
   }

   public final void run() {
      if (!af.a(CMIDlet.a, CMIDlet.b, b(e), "225", "21", "03", "01", c(e))) {
         if (a() == 0) {
            av.a((byte)2);
         } else {
            av.a(av.C);
         }
      } else {
         if (a() == 0 || a() == 2) {
            a[e] = true;
         }

         if (a() == 1 || a() == 3) {
            af.a(c[e], 0);
         }

         av.a((byte)4);
         av.a("SMS_GAME");
      }
   }

   static {
      for(int var0 = 0; var0 < a.length; ++var0) {
         a[var0] = false;
      }

      b = new String[10];

      for(int var1 = 0; var1 < b.length; ++var1) {
         b[var1] = "";
      }

      c = new String[10];

      for(int var2 = 0; var2 < c.length; ++var2) {
         c[var2] = "0" + var2;
      }

      d = new int[10];

      for(int var3 = 0; var3 < d.length; ++var3) {
         d[var3] = 0;
      }

      b[0] = "Chỉ với 4 tệ, mở khóa bản quyền (Gửi 2 tin nhắn SMS để hoàn tất, phí 2 tệ/tin, không phí mạng)";
      b[1] = "Thiếu tiền? Chỉ với 2 tệ, nhận ngay 1000 vàng.";
      b[2] = "Luyện cấp chậm? Chỉ với 2 tệ, bật ngay x2 kinh nghiệm.";
      b[3] = "Muốn hồi sinh tại chỗ, đầy máu và ma lực? Chỉ với 1 tệ ước nguyện sẽ thành hiện thực.";
      d[0] = 40;
      d[1] = 20;
      d[2] = 20;
      d[3] = 10;
   }
}
