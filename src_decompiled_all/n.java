import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class n {
   private static Graphics u;
   private static short[][][] v;
   public static short a = 1;
   public static short b = 10;
   public int c = -1;
   public int d = -1;
   public int e = -1;
   private static i[] w;
   private static aq[] x;
   private int y = 0;
   private int z = 0;
   public boolean f = false;
   public static int g;
   public static int h;
   public static int i;
   public static int j;
   public static int k;
   public static int l;
   public static int m;
   private static boolean A;
   public static int n;
   public static int o;
   public static int p;
   public static x[] q;
   public static int r;
   public static boolean s;
   public static byte t;
   private static short[] B;
   private static boolean C;
   private static int D;
   private static int[][] E;
   private static Image F;
   private static int[][] G;
   private static Image H;
   private static int[][] I;

   public final void a(int var1, int var2) {
      this.y = var1 - ac.h();
      this.z = var2 - ac.j();
   }

   public final void b(int var1, int var2) {
      this.y = var1;
      this.z = var2;
      this.f();
      aq[] var3 = i.a();
      i.a(x);
      if (this.c > -1 && this.d > -1) {
         if (this.e == -1) {
            w[this.c].a(u, this.d, v[this.c][this.d], var1, var2, this.f);
         } else {
            w[this.c].a(u, this.d, this.e, var1, var2, this.f);
         }
      }

      i.a(var3);
   }

   public final void c(int var1, int var2) {
      this.b(var1 - ac.h(), var2 - ac.j());
   }

   public final void a() {
      this.b(this.y, this.z);
   }

   public final boolean b() {
      return w[this.c].a(this.d, this.c());
   }

   public final short[] c() {
      this.f();
      return v[this.c][this.d];
   }

   public final void a(short[] var1) {
      var1[0] = 1;
      var1[0] = 0;
   }

   public final void d() {
      this.a(this.c());
      this.e().e();
   }

   public final i e() {
      return w[this.c];
   }

   public final void f() {
      if (this.c > -1 && w[this.c] == null) {
         l.a("amn.bin", new int[]{this.c}, w, x);
         v[this.c] = new short[w[this.c].b][2];

         for(int var1 = 0; var1 < v[this.c].length; ++var1) {
            v[this.c][var1][0] = 0;
            v[this.c][var1][1] = 0;
         }
      }
   }

   public static final void g() {
      if (d.u > -1 && w[d.u] == null) {
         l.a("amn.bin", new int[]{d.u}, w, x);
         v[d.u] = new short[w[d.u].b][2];

         for(int var0 = 0; var0 < v[d.u].length; ++var0) {
            v[d.u][var0][0] = 0;
            v[d.u][var0][1] = 0;
         }
      }
   }

   public final void h() {
      l.a(new int[]{this.c}, w, x);
   }

   public static final void i() {
      g = 0;
      l = 0;
      m = 0;
      i = 0;
   }

   public static final boolean a(int var0) {
      return (g & var0) != 0;
   }

   public static final void a(Graphics var0) {
      u = var0;
   }

   public static final void b(int var0) {
      g |= var0;
   }

   public static final void a(int var0, int var1, int var2) {
      j = 255 * ae.a / var2;
      i = var0 == 8 ? 0 : 255;
      g &= ~(var0 == 8 ? 16 : 8);
      g |= var0;
      if ((g & 8) != 0) {
         k = var1;
      }
   }

   public static final boolean c(int var0) {
      boolean var1 = false;
      if ((g & 8) != 0) {
         if (i < 255) {
            i += j;
         }

         if (i >= 255) {
            o.a(u, 0, var0, 240, 320 - (var0 << 1), k);
            i = 255;
            var1 = true;
         }
      } else if ((g & 16) != 0 && i > 0) {
         i -= j;
         if (i <= 0) {
            g &= -17;
            var1 = true;
         }
      }

      if (i > 0 && i < 255) {
         o.b(u, 0, var0, 240, 320 - (var0 << 1), i << 24 | k);
      }

      n();
      if (var1 && r > 0) {
         l();
      }

      return var1;
   }

   public static final void d(int var0, int var1) {
      if (var0 != 0) {
         l = var0;
      }

      if (var1 != 0) {
         m = var1 / ae.a;
      }
   }

   public static final void j() {
      if (m > 0) {
         o = 0;
         n = o.b(-3, 3);
         p = n * l;
         A = !A;
         --m;
      }
   }

   public static final void k() {
      if (r <= 0) {
         q[0] = av.t;
         Object var0 = null;
         r = 1;

         for(int var1 = 0; var1 < av.z; ++var1) {
            x var2;
            if ((var2 = av.w[av.A[var1]]) != null && var2.o(38)) {
               q[++r] = var2;
            }
         }
      }
   }

   public static final void l() {
      r = 0;

      for(int var0 = 0; var0 < q.length; ++var0) {
         q[var0] = null;
      }

      g &= -9;
      i = 0;
   }

   public static final void m() {
      if ((g & 2) != 0 || (g & 4) != 0) {
         if ((g & 2) != 0) {
            h += 2;
            if (h >= 26) {
               g &= -3;
            }
         } else {
            h -= 2;
            if (h <= 0) {
               g &= -5;
            }
         }
      }

      if (h > 0) {
         u.setColor(0);
         u.fillRect(0, 0, 240, h);
         u.fillRect(0, 320 - h, 240, h);
      }
   }

   public static final void n() {
      x var0 = null;
      if (r > 0 && q != null) {
         for(int var1 = r; var1 >= 0; --var1) {
            if ((var0 = q[var1]) != null && var0.m(x.I)) {
               var0.a(u, var0.V[8] - ac.h(), var0.V[9] - ac.j());
            }
         }
      }
   }

   public static final al[] a(int var0, short[] var1) {
      al[] var2 = new al[var0];

      for(int var3 = 0; var3 < var0; ++var3) {
         var2[var3] = new al(var1);
      }

      return var2;
   }

   public static final void a(Graphics var0, al[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         var1[var2].a(var0);
      }
   }

   public static final void a(byte var0) {
      t = var0;
      s = true;

      for(int var1 = 0; var1 < 10; ++var1) {
         B[var1] = (short)(var0 == 1 ? -(10 - var1 << 2) : -(var1 << 2));
      }
   }

   public static final void b(Graphics var0) {
      if (s) {
         u.setColor(0);
         int var1 = 0;
         int var2 = 0;
         short var3 = 0;
         int var4 = 0;

         for(int var5 = 0; var5 < 10; ++var5) {
            if ((var3 = B[var5] = (short)(B[var5] + 4)) > 0) {
               var4 = var3 >> 1;

               for(int var6 = 0; var6 < 10; ++var6) {
                  var1 = (var5 << 5) - var4 + 16;
                  var2 = (var6 << 5) - var4 + 16;
                  var0.fillRect(var1, var2, var3, var3);
               }
            }
         }

         s = (t != 1 || B[0] < 32) && (t != 0 || B[7] < 32);
      }
   }

   public static final void o() {
      if (C) {
         if (D-- % 4 == 0) {
            u.setColor(16711680);
            u.drawRect(0, 0, 240, 320);
            u.drawRect(1, 1, 238, 318);
            u.setColor(13369344);
            u.drawRect(2, 2, 236, 316);
            u.setColor(10027008);
            u.drawRect(3, 3, 234, 314);
            u.setColor(6684672);
            u.drawRect(4, 4, 232, 312);
         }

         C = D >= 0;
      }
   }

   public static final void p() {
      if (F == null) {
         F = o.a("xue");
      }

      E = new int[40][7];

      for(int var0 = 0; var0 < E.length; ++var0) {
         d(var0);
      }

      int var2 = 0;

      for(boolean var1 = false; var2 < 30; ++var2) {
         q();
      }
   }

   public static final void d(int var0) {
      E[var0][0] = Math.abs(o.a.nextInt() % 240);
      E[var0][1] = -Math.abs(o.a.nextInt() % 40);
      E[var0][2] = o.a.nextInt() % 6;
      if (E[var0][2] == 0) {
         E[var0][2]++;
      }

      E[var0][3] = Math.abs(o.a.nextInt() % 6) + 1;
      E[var0][4] = Math.abs(o.a.nextInt() % 2) + 1;
      E[var0][5] = 0;
      E[var0][6] = E[var0][4];
   }

   public static final void q() {
      if (E != null) {
         for(int var0 = 0; var0 < E.length; ++var0) {
            E[var0][0] += E[var0][2];
            E[var0][1] += E[var0][3];
            E[var0][5]++;
            if (E[var0][5] >= 10) {
               if (Math.abs(o.a.nextInt() % 3) == 0 && E[var0][6] >= 1) {
                  E[var0][6]--;
               }

               E[var0][5] = 0;
               E[var0][2] = o.a.nextInt() % 6;
               if (E[var0][2] == 0) {
                  E[var0][2]++;
               }

               E[var0][3] = Math.abs(o.a.nextInt() % 6) + 1;
            }

            if (E[var0][0] < -10 || E[var0][0] > 260 || E[var0][1] > 340) {
               d(var0);
            }
         }
      }
   }

   public static final void c(Graphics var0) {
      for(int var1 = 0; var1 < E.length; ++var1) {
         if (Math.abs(o.a.nextInt() % 20) > 0) {
            switch(E[var1][6]) {
               case 0:
                  o.a(var0, F, 4, 0, 1, 1, E[var1][0], E[var1][1], 0, 0);
                  break;
               case 1:
                  o.a(var0, F, 0, 0, 3, 3, E[var1][0], E[var1][1], 0, 0);
                  break;
               case 2:
                  o.a(var0, F, 3, 0, 4, 3, E[var1][0], E[var1][1], 0, 0);
            }
         }
      }
   }

   private static void e(int var0) {
      G[var0][0] = o.b(10, 20);
      G[var0][1] = o.b(260);
      G[var0][2] = -o.b(5, 20);
      G[var0][3] = G[var0][1] + 3;
      G[var0][4] = G[var0][2] - G[var0][0];
      G[var0][5] = -2;
      G[var0][6] = o.b(0, 15);
      G[var0][7] = o.b(160, 280);
      G[var0][8] = 0;
      G[var0][9] = 5;
      G[var0][10] = 3;
   }

   public static final void r() {
      G = new int[45][11];

      for(int var0 = 0; var0 < 45; ++var0) {
         e(var0);
      }

      for(int var1 = 0; var1 < 35; ++var1) {
         s();
      }
   }

   public static final void s() {
      for(int var0 = 0; var0 < 45; ++var0) {
         if (G[var0][2] > G[var0][7]) {
            G[var0][8] = 1;
         }

         switch(G[var0][8]) {
            case 0:
               G[var0][1] += G[var0][5];
               G[var0][3] += G[var0][5];
               G[var0][6]++;
               G[var0][2] += G[var0][6];
               G[var0][4] += G[var0][6];
               break;
            case 1:
               if (G[1][9] > 11) {
                  e(var0);
               } else if (G[1][9]++ % 2 == 0) {
                  G[1][10]++;
               }
         }
      }
   }

   public static final void d(Graphics var0) {
      var0.setColor(11661706);

      for(int var1 = 0; var1 < 45; ++var1) {
         switch(G[var1][8]) {
            case 0:
               var0.drawLine(G[var1][1], G[var1][2], G[var1][3], G[var1][4]);
               break;
            case 1:
               var0.drawRoundRect(G[var1][1], G[var1][2], G[1][9], G[1][10], G[1][9], G[1][10]);
         }
      }
   }

   public static final void a(Graphics var0, int var1, int var2) {
      if (H == null) {
         H = o.a("mouse");
      }

      int var3 = H.getWidth() >> 2;
      int var4 = H.getHeight();

      for(int var5 = 3; var5 >= 0; --var5) {
         if (Math.abs(I[0][1] - var2) < 3 && Math.abs(I[0][0] - var1) < 3 && Math.abs(I[3][1] - I[0][1]) < 8 && Math.abs(I[3][0] - I[0][0]) < 8) {
            var0.setClip(I[0][0], I[0][1], var3, var4);
            var0.drawImage(H, I[0][0], I[0][1], 0);
         } else {
            I[var5][0] += (var1 - I[var5][0]) / (var5 + 2);
            I[var5][1] += (var2 - I[var5][1]) / (var5 + 2);
            var0.setClip(I[var5][0], I[var5][1], var3, var4);
            var0.drawImage(H, I[var5][0] - var5 * var3, I[var5][1], 0);
         }
      }
   }

   static {
      try {
         DataInputStream var0;
         a = (var0 = o.c("amn.bin")).readShort();
         b = var0.readShort();
         w = new i[a];
         x = new aq[b];
         v = new short[a][][];
         var0.close();
      } catch (Exception var1) {
         var1.printStackTrace();
      }

      k = 0;
      l = 5;
      m = 0;
      A = false;
      n = 1;
      o = 0;
      p = 0;
      q = new x[30];
      r = 0;
      s = false;
      t = 0;
      B = new short[10];
      C = false;
      D = 0;
      H = null;
      I = new int[][]{{120, 120}, {120, 120}, {120, 120}, {120, 120}};
   }
}
