import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;

public final class k {
   public static int a;
   public static int b;
   public static short[][][] c;
   public static String[] d;
   public static short[][] e;
   public static int f;
   public static i[] g;
   public static aq[] h;
   public static short i;
   public static short j;
   public static short k;
   public static short l = 35;
   public static short m = 35;
   private static short[][][] n;
   private static int o;
   private static int p;
   private static String q;

   public k() {
      a = 0;
      b = 0;
      a("uiform.bin");
      b();
   }

   public static final void a(String var0) {
      DataInputStream var1 = null;

      try {
         a(var1 = o.c(var0));
         b(var1);
         var1.close();
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   private static void a(DataInputStream var0) throws IOException {
      short var1;
      d = new String[var1 = var0.readShort()];
      e = new short[var1][];

      for(int var2 = 0; var2 < var1; ++var2) {
         short var3 = var0.readShort();
         e[var2] = new short[var3];

         for(int var4 = 0; var4 < var3; ++var4) {
            e[var2][var4] = var0.readShort();
         }

         String var5 = var0.readUTF();
         d[var2] = var5;
      }
   }

   private static void b(DataInputStream var0) throws IOException {
      short var1;
      c = new short[var1 = var0.readShort()][][];

      for(int var2 = 0; var2 < var1; ++var2) {
         short var3 = var0.readShort();
         c[var2] = new short[var3][];

         for(int var4 = 0; var4 < var3; ++var4) {
            c[var2][var4] = new short[18];

            for(int var5 = 0; var5 < 18; ++var5) {
               c[var2][var4][var5] = var0.readShort();
            }
         }
      }
   }

   public static final short a(int var0, int var1) {
      return c[var0][var1][2];
   }

   public static final short b(int var0, int var1) {
      return c[var0][var1][3];
   }

   public static final short c(int var0, int var1) {
      return c[var0][var1][4];
   }

   public static final int d(int var0, int var1) {
      return c[var0][var1][5] < 0 ? -1 : ai.p[c[var0][var1][5]];
   }

   public static final int e(int var0, int var1) {
      return c[var0][var1][6] < 0 ? -1 : ai.p[c[var0][var1][6]];
   }

   public static final short f(int var0, int var1) {
      return c[var0][var1][8];
   }

   public static final short[] g(int var0, int var1) {
      short[] var2 = new short[4];
      System.arraycopy(c[var0][var1], 9, var2, 0, 4);
      var2[0] = (short)(var2[0] + a);
      var2[1] = (short)(var2[1] + b);
      return var2;
   }

   public static final short h(int var0, int var1) {
      return (short)a(c[var0][var1][13]);
   }

   public static final short i(int var0, int var1) {
      return c[var0][var1][15];
   }

   public static final short j(int var0, int var1) {
      return c[var0][var1][16];
   }

   public static final short k(int var0, int var1) {
      return c[var0][var1][17];
   }

   public static final void a(Graphics var0, int var1, int var2, String var3) {
      short[] var4 = g(var1, var2);
      short var5 = f(var1, var2);
      short var6 = h(var1, var2);
      if (var5 < 0) {
         System.out.println("文本ID不存在");
      } else {
         String var7;
         if (var3 != null) {
            var7 = var3;
         } else {
            var7 = d[var5];
         }

         ai.a(var0, var7, e[var5], var4, f, var6);
      }
   }

   public static final void a(Graphics var0, int var1, int var2) {
      a(var0, var1, var2, -1, -1, -1, null, false);
   }

   public static final void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, String var6, boolean var7) {
      if (var2 == -1) {
         System.out.println("ui数据已经被逻辑删除");
      } else {
         a(var0, var1, var2, var3, var7);
         if (a(var1, var2) >= 0) {
            c(var0, var1, var2);
         }

         if (var6 != null) {
            a(var0, var1, var2, var6);
         } else if (f(var1, var2) != -1) {
            a(var0, var1, var2, var6);
         }

         a(var0, var1, var2, var4);
      }
   }

   private static void a(Graphics var0, int var1, int var2, int var3) {
      if (var3 != -1) {
         short[] var4 = g(var1, var2);
         int var5 = e(var1, var2);
         if (var3 != -1) {
            var5 = var3;
         }

         var0.setColor(var5);
         short var6 = var4[0];
         short var7 = var4[1];
         int var8 = var4[2] - 1;
         int var9 = var4[3] - 1;
         var0.drawRect(var6, var7, var8, var9);
      }
   }

   private static void a(Graphics var0, int var1, int var2, int var3, boolean var4) {
      short[] var5 = g(var1, var2);
      int var6;
      if (var3 == -1) {
         var6 = d(var1, var2);
      } else {
         var6 = var3;
      }

      if (var6 != -1) {
         if (var4) {
            o.b(var0, var5, var6);
         } else {
            var0.setColor(var6);
            short var7 = var5[0];
            short var8 = var5[1];
            short var9 = var5[2];
            short var10 = var5[3];
            var0.fillRect(var7, var8, var9, var10);
         }
      }
   }

   public static final void b(Graphics var0, int var1, int var2) {
      a(var0, var1, var2, -1, -1);
   }

   public static final void a(Graphics var0, int var1, int var2, int var3, int var4) {
      i = i(var1, var2);
      j = j(var1, var2);
      k = k(var1, var2);
      if (i < 0) {
         System.out.println("UIdata::drawSLAni:动画ID不存在1");
      } else {
         short[] var5;
         int var6 = (var5 = g(var1, var2))[0] + (var5[2] >> 1);
         int var7 = var5[1] + (var5[3] >> 1);
         aq[] var8 = i.a();
         i.a(h);
         if (k == -1) {
            g[i].a(var0, j, n[i][j], var6, var7, var3, var4, false);
         } else {
            g[i].a(var0, k, var6, var7, var3, var4, false);
         }

         i.a(var8);
      }
   }

   public static final void c(Graphics var0, int var1, int var2) {
      a(var0, var1, var2, g(var1, var2));
   }

   public static final void a(Graphics var0, int var1, int var2, short[] var3) {
      a(var0, var1, var2, var3, -1, -1, -1, -1);
   }

   public static final void a(Graphics var0, int var1, int var2, short[] var3, int var4, int var5, int var6, int var7) {
      i = a(var1, var2);
      if (var6 > -1) {
         j = (short)var6;
      } else {
         j = b(var1, var2);
      }

      if (var7 > -1) {
         k = (short)var7;
      } else {
         k = c(var1, var2);
      }

      if (i < 0) {
         System.out.println("UIdata::drawUIAni:动画ID不存在2");
      } else {
         int var8 = var3[0] + (var3[2] >> 1);
         int var9 = var3[1] + (var3[3] >> 1);
         aq[] var10 = i.a();
         i.a(h);
         if (k < 0) {
            g[i].a(var0, j, n[i][j], var8, var9, var4, var5, false);
         } else if (j < 0) {
            g[i].a(var0, k, var8, var9, var4, var5, false);
         } else {
            g[i].a(var0, j, k, var8, var9, var4, var5, false);
         }

         i.a(var10);
      }
   }

   public static final void b(Graphics var0, int var1, int var2, short[] var3, int var4, int var5, int var6, int var7) {
      i = a(var1, var2);
      if (var6 > -1) {
         j = (short)var6;
      } else {
         j = b(var1, var2);
      }

      if (var7 > -1) {
         k = (short)var7;
      } else {
         k = c(var1, var2);
      }

      if (i < 0) {
         System.out.println("UIdata::drawUIAni:动画ID不存在2");
      } else {
         int var8 = var3[0] + (var3[2] >> 2) - 5;
         int var9 = var3[1] + (var3[3] >> 1);
         aq[] var10 = i.a();
         i.a(h);
         if (k < 0) {
            g[i].a(var0, j, n[i][j][0], var8, var9, var4, var5, false);
            ++n[i][j][1];
            int var11;
            if ((var11 = g[i].d[j] + (n[i][j][0] << 1)) < g[i].e.length) {
               int var12;
               if ((var12 = g[i].e[var11] >> 10 & 31) != 0 && n[i][j][1] >= var12) {
                  if (d.e < 5) {
                     n[i][j][1] = 0;
                     ++n[i][j][0];
                     if (n[i][j][0] >= g[i].c[j]) {
                        n[i][j][0] = 0;
                     }
                  } else if (d.e == 30) {
                     n[i][j][0] = 0;
                  }
               } else if (d.e == 0) {
                  ++d.e;
               }
            }
         } else if (j < 0) {
            g[i].a(var0, k, var8, var9, var4, var5, false);
         } else {
            g[i].a(var0, j, k, var8, var9, var4, var5, false);
         }

         i.a(var10);
      }
   }

   public static final void a(Graphics var0, String var1, int var2, int var3, int var4, int var5, int var6) {
      short[] var7 = g(var2, var3);
      int var8 = 0;
      int var9 = 0;
      var0.setClip(var7[0] - 1, var7[1] - 2, var7[2] + 2, var7[3] + 4);
      var8 = var7[0];
      var9 = var7[1];
      switch(var4) {
         case 3:
            var8 = var7[0] + (var7[2] >> 1);
            var9 = var7[1] + (var7[3] >> 1) + (var7[3] >> 2);
            break;
         case 17:
            var8 = var7[0] + (var7[2] >> 1);
            var9 = var7[1];
         case 20:
         default:
            break;
         case 33:
            var8 = var7[0] + (var7[2] >> 1);
            var9 = var7[1] + var7[3];
            break;
         case 36:
            var9 = var7[1] + var7[3];
            break;
         case 40:
            var8 = var7[0] + var7[2];
            var9 = var7[1] + var7[3];
      }

      if (var4 == 3) {
         var4 = 33;
      }

      if (var6 >= 0) {
         var0.setColor(var6);
         var0.drawString(var1, var8 + 1, var9, var4);
         var0.drawString(var1, var8 - 1, var9, var4);
         var0.drawString(var1, var8, var9 + 1, var4);
         var0.drawString(var1, var8, var9 - 1, var4);
      }

      var0.setColor(var5);
      var0.drawString(var1, var8, var9, var4);
      var0.setClip(0, 0, 240, 320);
   }

   public static final void a() {
      p = 0;
   }

   public static final int a(Graphics var0, String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      short[] var8 = g(var2, var3);
      o = o.a(var0, var1, p, var8[0], var8[1], var8[2], var8[3], var4, var5, var6);
      if (o > var8[3]) {
         --p;
         if (p < -o + 10) {
            p = var8[3];
         }
      } else {
         p = 0;
      }

      return o;
   }

   public static final void b(Graphics var0, String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         if (var6 < 0) {
            var6 = h(var2, var3);
         }

         if (!q.equals(var1)) {
            p = 0;
         }

         a(var0, var1, var2, var3, var6, var4, var5, p);
         q = var1;
      }
   }

   public static final int a(int var0) {
      return var0;
   }

   public static final short[] a(short var0, short var1) {
      short[] var2 = new short[4];
      System.arraycopy(c[var0][var1], 9, var2, 0, 4);
      var2[0] = (short)(var2[0] + a);
      var2[1] = (short)(var2[1] + b);
      return var2;
   }

   public static final void b() {
      for(int var0 = 0; var0 < g.length; ++var0) {
         l.a("uires.bin", new int[]{var0}, g, h);
         n[var0] = new short[g[var0].b][2];

         for(int var1 = 0; var1 < n[var0].length; ++var1) {
            n[var0][var1][0] = 0;
            n[var0][var1][1] = 0;
         }
      }
   }

   static {
      try {
         DataInputStream var0;
         (var0 = o.c("uires.bin")).readByte();
         l = var0.readShort();
         m = var0.readShort();
         n = new short[l][][];
         g = new i[l];
         h = new aq[m];
         var0.close();
      } catch (Exception var1) {
         var1.printStackTrace();
      }

      q = "";
   }
}
