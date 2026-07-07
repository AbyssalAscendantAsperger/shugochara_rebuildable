import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;

public final class ad {
   private static final Font a = Font.getFont(0, 0, 8);
   private static final short b = (short)(a.getHeight() + 2);
   private static final short c = (short)a.stringWidth("道");
   private static boolean d = false;
   private static boolean e = true;
   private static boolean f = false;
   private static byte g = 0;
   private static short[] h = new short[4];
   private static short i = -1;
   private static int j = 0;
   private static boolean k = false;
   private static String[][] l = (String[][])null;
   private static short m;
   private static short n = 0;
   private static short o = 0;
   private static short p = 0;
   private static final short q = (short)((320 - 4 * b) / b);
   private static final short r = (short)(240 / c - 3);
   private static String s = "";
   private static String t = "";
   private static final char[] u = new char[]{'&', '@', '-', '.', '—'};
   private static String v = null;
   private static String w = "";
   private static Image x = null;
   private static Image y = null;
   private static Image z = null;
   private static short A = 0;
   private static boolean B = false;
   private static Image[] C = null;
   private static Image D = null;
   private static final short[] E = new short[]{67, 119, 171};
   private static final short[] F = new short[]{158, 170, 173, 150, 147};
   private static final short[][] G = new short[][]{
      {800, 2, 0, 1, 0, 0, 0},
      {200, 2, 0, 1, 1, 1, 1},
      {40, 6, 5, 7, 0, 0, 0},
      {40, 5, 7, 6, 0, 0, 0},
      {40, 7, 6, 5, 0, 0, 0},
      {40, 3, 2, 4, 2, 0, 4},
      {40, 3, 2, 4, 1, 3, 2},
      {40, 3, 2, 4, 0, 0, 1},
      {40, 3, 2, 4, 3, 0, 0},
      {40, 3, 2, 4, 0, 0, 3},
      {40, 3, 2, 4, 0, 0, 0},
      {1000, 3, 2, 4, 0, 0, 0}
   };
   private static byte H = 0;
   private static byte I = 0;
   private static MIDlet J = null;
   private static boolean K = false;
   private static Image L = null;
   private static final String[] M = new String[]{"继续游戏", "帮助", "返回主菜单"};
   private static byte N = 0;
   private static short[] O = null;

   private ad() {
   }

   public static final boolean a() {
      return f;
   }

   private static final void c() {
      d = true;
      a(true);
      b(false);
   }

   public static final boolean b() {
      return d;
   }

   private static final boolean d() {
      boolean var0 = e;
      if (e) {
         a(false);
      }

      return var0;
   }

   public static final void a(boolean var0) {
      e = var0;
   }

   private static final void e() {
      a(false);
      b(true);
      g = 0;
      d = false;
   }

   private static void f() {
      for(int var0 = 3; var0 >= 0; --var0) {
         h[var0] = -2;
      }
   }

   private static void b(short var0) {
      h[g++] = var0;
   }

   private static short g() {
      return h[--g];
   }

   public static final void a(short var0) {
      if (-1 != var0) {
         if (!b()) {
            f();
            b((short)-1);
            c(var0);
         } else {
            if (i != var0) {
               b(i);
               c(var0);
            }
         }
      }
   }

   private static void c(short var0) {
      switch(i) {
         case 0:
            l();
            break;
         case 1:
         case 2:
            o();
            break;
         case 3:
            r();
            break;
         case 4:
            u();
         case 5:
         case 6:
         case 7:
         default:
            break;
         case 8:
            A();
            break;
         case 9:
            F();
      }

      i = var0;
      h();
      switch(i) {
         case -1:
            e();
            return;
         case 0:
            j();
            break;
         case 1:
            w = "帮助";
            a(t);
            break;
         case 2:
            w = "关于";
            a(s);
            break;
         case 3:
            p();
            break;
         case 4:
            s();
         case 5:
         case 6:
         case 7:
         default:
            break;
         case 8:
            y();
            break;
         case 9:
            D();
      }

      c();
   }

   private static void b(Graphics var0) {
      var0.setColor(0);
      var0.fillRect(0, 0, 240, 320);
   }

   public static final void a(Graphics var0) {
      if (i()) {
         switch(i) {
            case 0:
               k();
               break;
            case 1:
               n();
               break;
            case 2:
               n();
               break;
            case 3:
               q();
               break;
            case 4:
               t();
               break;
            case 5:
            case 6:
               w();
               break;
            case 7:
               C();
               break;
            case 8:
               z();
               break;
            case 9:
               E();
               break;
            case 10:
               G();
               break;
            case 11:
               x();
         }
      }

      if (d()) {
         b(var0);
         switch(i) {
            case 0:
               c(var0);
               return;
            case 1:
               d(var0);
               return;
            case 2:
               d(var0);
               return;
            case 3:
               e(var0);
               return;
            case 4:
               f(var0);
               return;
            case 5:
            case 6:
            default:
               break;
            case 7:
               i(var0);
               return;
            case 8:
               h(var0);
               return;
            case 9:
               j(var0);
               return;
            case 10:
               k(var0);
               break;
            case 11:
               g(var0);
               return;
         }
      }
   }

   public static final void a(int var0) {
      j = Math.abs(var0);
      b(false);
   }

   private static final void h() {
      j = -100;
      b(true);
   }

   private static final void b(boolean var0) {
      k = !var0;
   }

   private static final boolean i() {
      boolean var0 = k;
      if (k) {
         b(true);
      }

      return var0;
   }

   private static boolean b(int var0) {
      boolean var1;
      if (var1 = j == var0) {
         h();
      }

      return var1;
   }

   private static void j() {
      if (!am.a()) {
         am.e();
      }
   }

   private static void k() {
      if (b(7)) {
         c(g());
      }
   }

   private static void c(Graphics var0) {
      var0.setColor(16777215);
      var0.drawString("游戏已暂停", 120, 158, 33);
      var0.drawString("按右软键继续", 120, 162, 17);
   }

   private static void l() {
      if (!am.a()) {
         am.d();
      }
   }

   public static final void a(String var0, String var1) {
      t = var0;
      s = var1;
   }

   private static void a(String var0) {
      int var1 = 0;
      int var2 = 0;
      int var4 = 0;
      Vector var5 = new Vector();
      boolean var7 = false;

      while(true) {
         int var8 = var0.indexOf(u[0]);
         var4 = r;
         String var6;
         if (var8 < 0) {
            if (var7) {
               int var10;
               n = (short)((var10 = var5.size()) / q);
               m = (short)(var10 % q);
               if (m > 0) {
                  ++n;
               }

               l = (String[][])null;
               l = new String[n][q];
               int var11 = 0;

               for(int var9 = 0; var9 < n; ++var9) {
                  for(int var14 = 0; var14 < q && var11 < var10; ++var14) {
                     l[var9][var14] = (String)var5.elementAt(var11);
                     ++var11;
                  }
               }

               if (n < 2) {
                  p = m > 0 ? m : q;
               } else {
                  p = q;
               }

               if (!b()) {
                  o = 0;
               } else {
                  p = o == n - 1 ? m : q;
               }

               --p;
               v = m();
               var5.removeAllElements();
               return;
            }

            var6 = var0;
            var7 = true;
         } else {
            var6 = var0.substring(0, var8);
            var0 = var0.substring(var8 + 1);
         }

         int var3 = var6.length();

         for(int var15 = 1; var15 < u.length; ++var15) {
            if (var6.indexOf(u[var15]) > 0) {
               var4 += var4;
               break;
            }
         }

         if (var3 <= var4) {
            var5.addElement(var6);
         } else {
            var2 = var4;

            do {
               var5.addElement(var6.substring(var1, var2));
               var2 += var4;
               var1 += var4;
               if (var2 > var3) {
                  var2 = var3;
               }
            } while(var1 < var3);

            var1 = 0;
         }
      }
   }

   private static String m() {
      StringBuffer var0 = new StringBuffer();
      if (n > 1) {
         var0.append("<<  ");
      }

      var0.append(o + 1).append('/').append(n);
      if (n > 1) {
         var0.append("  >>");
      }

      return var0.toString();
   }

   private static void n() {
      if (b(7)) {
         c(g());
      }

      if (n >= 2) {
         if (!b(3) && !b(52)) {
            if (b(4) || b(54)) {
               ++o;
               o = o >= n ? 0 : o;
               p = o == n - 1 ? (m == 0 ? q : m) : q;
               --p;
               v = m();
               a(true);
            }
         } else {
            --o;
            o = (short)(o < 0 ? n - 1 : o);
            p = o == n - 1 ? (m == 0 ? q : m) : q;
            --p;
            v = m();
            a(true);
         }
      }
   }

   private static void d(Graphics var0) {
      var0.setColor(16763904);
      var0.drawString(w, 120, 10, 17);
      var0.setColor(16764023);

      for(int var1 = p; var1 >= 0; --var1) {
         var0.drawString(l[o][var1], 120, (2 + var1) * b, 17);
      }

      var0.setColor(16777215);
      var0.drawString(v, 120, 313, 33);
      var0.setColor(16763904);
      var0.drawString("返回", 233, 313, 40);
      var0.setColor(4211247);
      var0.drawRect(2, 2, 235, 315);
   }

   private static void o() {
      l = (String[][])null;
   }

   private static Image b(String var0) {
      try {
         return Image.createImage(var0);
      } catch (Exception var2) {
         var2.printStackTrace();
         return null;
      }
   }

   private static void p() {
      x = b("/bin/sndAsk.png");
      y = b("/bin/gameLogo.png");
      z = b("/bin/level.png");
   }

   private static void q() {
      if (A < 20) {
         ++A;
         b(false);
      } else if (A == 20) {
         ++A;
         a(true);
         b(false);
      } else if (b(6)) {
         am.b = true;
         B = true;
         c((short)4);
      } else {
         if (b(7)) {
            B = false;
            c((short)4);
         }
      }
   }

   private static void e(Graphics var0) {
      var0.drawImage(y, 120, 80, 3);
      var0.drawImage(z, 120, 192, 3);
      if (A >= 20) {
         var0.drawImage(x, 120, 320, 33);
      }
   }

   private static void r() {
      y = null;
      z = null;
      x = null;
   }

   private static void s() {
      C = new Image[8];

      for(int var0 = 0; var0 < C.length; ++var0) {
         C[var0] = b("/bin/logo" + var0 + ".png");
      }

      D = b("/bin/backGround.png");
      A = 0;
      H = 0;
   }

   private static void t() {
      b(false);
      if (A == 0) {
         if (B) {
            am.a("/bin/tiger.mid", 1);
         }

         ++A;
      }

      try {
         Thread.sleep((long)G[H][0]);
         ++H;
         if (H == 5 && I < 4) {
            H = 2;
            ++I;
         }

         a(true);
      } catch (InterruptedException var1) {
         var1.printStackTrace();
      }

      if (H == G.length) {
         b(true);
         a(false);
         c(g());
      }
   }

   private static void f(Graphics var0) {
      var0.drawImage(D, 120, 160, 3);

      for(int var1 = 2; var1 >= 0; --var1) {
         var0.drawImage(C[G[H][var1 + 1]], E[var1], F[G[H][var1 + 4]], 3);
      }
   }

   private static void u() {
      for(int var0 = C.length - 1; var0 >= 0; --var0) {
         C[var0] = null;
      }

      C = null;
      D = null;
      if (B) {
         if (!am.c()) {
            am.b(0);
            return;
         }
      } else {
         am.e();
      }
   }

   private static void v() {
      try {
         if (J == null) {
            CMIDlet.a.platformRequest("http://gamepie.g188.net/gamecms/go/jpgd");
         } else {
            J.platformRequest("http://gamepie.g188.net/gamecms/go/jpgd");
         }
      } catch (Exception var1) {
         var1.printStackTrace();
      }
   }

   private static void w() {
      b(true);
      if (i == 6) {
         K = true;
      } else {
         K = false;
      }

      v();
      if (K) {
         B();
      } else {
         c(g());
      }
   }

   private static void x() {
      if (b(6)) {
         c((short)-1);
      } else {
         if (b(7)) {
            c((short)6);
         }
      }
   }

   private static void g(Graphics var0) {
      var0.setColor(16777215);
      var0.drawString("你确定访问游戏频道", 120, 158, 33);
      var0.drawString("并退出游戏?", 120, 162, 17);
      var0.setColor(65280);
      var0.drawString("否", 7, 313, 36);
      var0.setColor(16711680);
      var0.drawString("是", 233, 313, 40);
   }

   private static void y() {
      L = b("/bin/last.png");
   }

   private static void z() {
      if (b(6)) {
         c((short)6);
      } else {
         if (b(7)) {
            B();
         }
      }
   }

   private static void h(Graphics var0) {
      var0.drawImage(L, 120, 160, 3);
      var0.setColor(16777215);
      var0.drawString("更多精彩游戏", 120, 160 - (b >> 1) - 5, 33);
      var0.drawString("尽在游戏频道", 120, 160 - (b >> 1), 17);
      var0.drawString("wap.xjoys.com", 120, 160 - (b >> 1) + b - 3, 17);
      var0.setColor(16711680);
      var0.drawString("确认", 7, 313, 36);
      var0.setColor(65280);
      var0.drawString("退出", 233, 313, 40);
   }

   private static void A() {
      L = null;
   }

   private static void B() {
      b(true);
      f = true;
   }

   private static void C() {
      if (b(6)) {
         c(g());
      } else {
         if (b(7)) {
            if (av.Q) {
               c((short)8);
               b(false);
               a(true);
               return;
            }

            B();
         }
      }
   }

   private static void i(Graphics var0) {
      var0.setColor(16777215);
      var0.drawString("确认退出", 120, 160, 33);
      var0.setColor(16711680);
      var0.drawString("是", 233, 313, 40);
      var0.setColor(65280);
      var0.drawString("否", 7, 313, 36);
   }

   private static void D() {
      if (!b()) {
         N = 0;
      }

      O = new short[M.length + 1];
      O[M.length] = 320;
      int var0 = 0;
      int var1 = 160;
      if (M.length % 2 == 1) {
         var1 = 160 - b / 2;
      }

      var0 = var1 - M.length / 2 * b;

      for(int var2 = 0; var2 < M.length; ++var2) {
         O[var2] = (short)(var0 + var2 * b);
      }
   }

   private static void j(Graphics var0) {
      var0.setColor(16777215);

      for(int var1 = 0; var1 < M.length; ++var1) {
         var0.drawString(M[var1], 120, O[var1], 17);
      }

      var0.setColor(16711680);
      var0.drawString(M[N], 120, O[N], 17);
      var0.setColor(16777215);
      var0.drawString("返回", 233, 320, 40);
      var0.drawString("确定", 7, 320, 36);
   }

   private static void E() {
      if (b(1) || b(50)) {
         --N;
         if (N < 0) {
            N = (byte)(M.length - 1);
         }

         a(true);
      } else if (b(2) || b(56)) {
         ++N;
         if (N > M.length - 1) {
            N = 0;
         }

         a(true);
      }

      if (!b(6) && !b(53)) {
         if (b(7)) {
            c(g());
         }
      } else {
         switch(N) {
            case 0:
               c(g());
               break;
            case 1:
               a((short)1);
               break;
            case 2:
               a((short)10);
         }
      }
   }

   private static void F() {
      O = null;
   }

   private static void G() {
      if (b(7)) {
         c(g());
      } else {
         if (b(6)) {
            av.a((byte)2);
            c((short)-1);
         }
      }
   }

   private static void k(Graphics var0) {
      var0.setColor(16777215);
      var0.drawString("是否返回主菜单", 120, 160, 33);
      var0.drawString("是", 7, 313, 36);
      var0.drawString("否", 233, 313, 40);
   }
}
