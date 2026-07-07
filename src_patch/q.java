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

      b[0] = "只需4元，即可激活正版（您需要发送2条短信完成支付，信息费2元/条，不含通信费）";
      b[1] = "钱不够花，仅需2元，就可立即获得1000金币。";
      b[2] = "打怪升级太慢，仅需2元，就可开启双倍经验。";
      b[3] = "想原地复活，并且满血满魔吗？仅需1元就可以实现你的愿望。";
      d[0] = 40;
      d[1] = 20;
      d[2] = 20;
      d[3] = 10;
   }
}
