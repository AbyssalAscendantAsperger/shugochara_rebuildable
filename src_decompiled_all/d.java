import java.io.DataInputStream;
import java.util.Enumeration;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class d {
   private static int w = 0;
   private static byte[] x = new byte[]{0, 0, 0};
   private static byte[] y = new byte[]{0, 0, 0};
   public static boolean a = false;
   private static Image z = null;
   private static Image A = null;
   private static Image B = null;
   private static Image C = null;
   private static Image D = null;
   private static Image E = null;
   private static Image F = null;
   private static int G = 0;
   public static final String[] b = new String[]{"属性", "背包", "装备", "技能", "任务", "称号", "系统"};
   private static n H;
   private static byte I = 0;
   private static boolean J = false;
   private static boolean K = false;
   public static boolean c = false;
   private static int[][] L;
   private static n M = null;
   private static n N = null;
   private static int O = 0;
   private static int P = 0;
   private static int Q = 0;
   private static int R = 0;
   private static byte[] S = new byte[]{0, 0, 0};
   private static final short[][][] T = new short[][][]{
      {{5, 8, 9, 10, 11, 12}, {14, 16, 17}, {0, 1, 2, 3, 4, 5, 9}, {0, 1, 2, 3, 4, 5}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}}
   };
   private static int U = 0;
   public static byte d = 0;
   private static t[] V = null;
   private static m[] W = null;
   private static boolean X = false;
   private static boolean Y;
   private static int Z;
   private static int aa;
   private static int[] ab = new int[7];
   public static int e;
   private static int ac;
   private static int ad = 0;
   private static boolean ae;
   private static int af = 0;
   public static int f = 0;
   private static boolean ag = false;
   private static boolean ah = false;
   public static int g;
   private static final String[] ai = new String[]{"声音", "保存", "帮助", "返回主菜单"};
   private static boolean aj = false;
   public static short[][] h = new short[][]{
      {0, 0, 100}, {0, 1, 100}, {0, 2, 50}, {0, 3, 50}, {0, 4, 50}, {0, 5, 50}, {0, 6, 50}, {0, 7, 50}, {0, 8, 50}, {0, 9, 50}
   };
   private static boolean ak = false;
   private static boolean al = false;
   private static boolean am = false;
   private static boolean an = false;
   private static int ao = 0;
   private static boolean ap;
   public static int[] i = new int[]{0, 0, 0, 0};
   public static int j = 0;
   private static boolean aq = false;
   private static boolean ar = false;
   public static boolean k;
   public static boolean l;
   public static int m;
   private static int as = 0;
   private static String at;
   private static String au;
   private static String av;
   public static int n = 0;
   public static int o;
   private static int[] aw = new int[5];
   private static int ax = -1;
   private static short[] ay;
   public static boolean p;
   public static boolean q;
   private static short[] az = null;
   public static short r;
   public static short s;
   public static short t;
   public static short u;
   private static short[][][] aA;
   private static boolean aB;
   private static boolean aC;
   private static boolean aD;
   private static boolean aE;
   private static int aF;
   public static boolean v = false;

   public static final void a() {
      e(o);
   }

   public static final void a(Graphics var0) {
      for(int var1 = 0; var1 <= ax; ++var1) {
         c(var0, aw[var1]);
      }
   }

   public static final void a(int var0) {
      boolean var1 = false;

      for(int var2 = 0; var2 <= ax; ++var2) {
         if (aw[var2] == var0) {
            var1 = true;
            ax = var2;
            o = aw[ax];
            if (ax > 0) {
            }
            break;
         }
      }

      if (!var1) {
         o = var0;
         ++ax;
         aw[ax] = o;
      }

      c(o);
   }

   public static final void b() {
      a = false;
      d(o);
      --ax;
      if (ax >= 0) {
         o = aw[ax];
         if (o >= 0) {
            c(o);
         }
      } else if (ax < -1) {
         ax = -1;
      }

      a.a();
   }

   public static final void c() {
      ax = -1;
      a = false;
   }

   private static void c(int var0) {
      a = true;
      k.a();
      switch(var0) {
         case 0:
         case 14:
            L();
            return;
         case 1:
            O();
            return;
         case 2:
            R();
            return;
         case 3:
            U();
            return;
         case 5:
            X();
            return;
         case 6:
            aa();
            return;
         case 7:
            J();
            return;
         case 8:
            k();
            return;
         case 9:
            u();
            return;
         case 10:
            G();
            return;
         case 11:
            A();
            return;
         case 12:
            p();
            return;
         case 13:
            e();
            return;
         case 15:
            x();
            return;
         case 17:
            D();
         default:
            return;
         case 111:
            r();
      }
   }

   private static void d(int var0) {
      switch(var0) {
         case 0:
         case 14:
            M();
            return;
         case 1:
            P();
            return;
         case 2:
            S();
            return;
         case 3:
            V();
            return;
         case 5:
            Y();
            return;
         case 6:
            ab();
            return;
         case 7:
            return;
         case 8:
            l();
            return;
         case 9:
            v();
            return;
         case 10:
            H();
            return;
         case 11:
            B();
            return;
         case 12:
            return;
         case 13:
            f();
            return;
         case 15:
            y();
            return;
         case 17:
            E();
         default:
            return;
         case 21:
            return;
         case 111:
      }
   }

   private static void e(int var0) {
      if (!k) {
         switch(var0) {
            case 0:
            case 14:
               N();
               return;
            case 1:
               Q();
               return;
            case 2:
               T();
               return;
            case 3:
               W();
               return;
            case 5:
               Z();
               return;
            case 6:
               ac();
               return;
            case 7:
               K();
               return;
            case 8:
               m();
               return;
            case 9:
               w();
               return;
            case 10:
               I();
               return;
            case 11:
               C();
               return;
            case 12:
               q();
               return;
            case 13:
               g();
               return;
            case 15:
               z();
               return;
            case 17:
               F();
            default:
               return;
            case 111:
               s();
         }
      }
   }

   private static void c(Graphics var0, int var1) {
      switch(var1) {
         case 0:
         case 14:
            m(var0);
            return;
         case 1:
            n(var0);
            return;
         case 2:
            o(var0);
            return;
         case 3:
            p(var0);
            return;
         case 5:
            q(var0);
            return;
         case 6:
            r(var0);
            return;
         case 7:
            l(var0);
            return;
         case 8:
            c(var0);
            return;
         case 9:
            g(var0);
            return;
         case 10:
            k(var0);
            return;
         case 11:
            i(var0);
            return;
         case 12:
            e(var0);
            return;
         case 13:
            b(var0);
            return;
         case 15:
            h(var0);
            return;
         case 17:
            j(var0);
         default:
            return;
         case 111:
            f(var0);
      }
   }

   public static final void d() {
      B = null;
      C = null;
      D = null;
      E = null;
      F = null;
   }

   public static final void a(Graphics var0, int var1) {
      if (av.H >= 2) {
         if (B == null) {
            B = o.a("num4");
         }

         if (C == null) {
            C = o.a("num6");
         }

         if (D == null) {
            D = o.a("hp");
         }

         if (E == null) {
            E = o.a("mp");
         }

         if (F == null) {
            F = o.a("anger");
         }

         int var2 = 0;
         ay = k.a((short)2, (short)11);
         int var3 = av.t.S();
         var2 = ay[2] * av.t.W[5] / var3;
         var0.setClip(ay[0], ay[1], var2, ay[3]);
         var0.drawImage(D, ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3);
         ay = k.a((short)2, (short)12);
         --ay[0];
         --ay[1];
         var3 = av.t.T();
         var2 = ay[2] * av.t.W[7] / var3;
         var0.setClip(ay[0], ay[1], var2, ay[3]);
         var0.drawImage(E, ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3);
         ay = k.a((short)2, (short)13);
         --ay[1];
         var3 = av.t.W[76];
         var2 = ay[2] * av.t.W[75] / var3;
         var0.setClip(ay[0], ay[1], var2, ay[3]);
         var0.drawImage(F, ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3);
         var0.setClip(0, 0, 240, 320);
         k.c(var0, 2, 7);
         if (av.t.l()) {
            k.c(var0, 2, 26);
         }

         ay = k.a((short)2, (short)23);
         ay[1] = (short)(ay[1] + 2);
         o.a(var0, C, av.t.W[5] + "/" + av.t.W[6], ay[0], ay[1], 20, 1, 0, 10);
         ay = k.a((short)2, (short)24);
         o.a(var0, C, av.t.W[7] + "/" + av.t.W[8], ay[0], ay[1], 20, 1, 0, 10);
         ay = k.a((short)2, (short)25);
         o.a(var0, C, av.t.W[75] + "/" + av.t.W[76], ay[0], ay[1], 20, 1, 0, 10);
         ay = k.a((short)2, (short)10);
         --ay[0];
         o.a(var0, B, String.valueOf(av.t.W[9]), ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 10);
         ay = k.a((short)2, (short)3);
         o.a(var0, ay, 1647660);
         k.a(var0, 2, 9);
         if (H == null) {
            H = new n();
         }

         for(int var4 = 0; var4 < 3; ++var4) {
            H.c = 58;
            H.d = 2;
            H.e = var4 + 2;
            ay = k.g(2, 19 + var4);
            H.b(ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1));
            if (var4 < 2) {
               av.t.a(var0, var4, ay);
            }
         }

         if (av.t.a.e(2)) {
            H.c = 58;
            H.d = 2;
            H.e = 5;
            ay = k.g(2, 22);
            H.b(ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1));
            av.t.a(var0, 2, ay);
         }

         m var11 = w.h;
         if (w.h != null) {
            H.c = 58;
            H.d = 2;
            H.e = 0;
            ay = k.a((short)2, (short)15);
            H.b(ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1));
            o.a(var0, B, String.valueOf(var11.k), ay[0] + ay[2] - 6, ay[1] + ay[3] - 4, 40, 1, 0, 11);
            av.t.b(var0, var11.g, ay);
         }

         m var5 = w.i;
         if (w.i != null) {
            H.c = 58;
            H.d = 2;
            H.e = 1;
            ay = k.a((short)2, (short)16);
            H.b(ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1) - 1);
            o.a(var0, B, String.valueOf(var5.k), ay[0] + ay[2] - 6, ay[1] + ay[3] - 4, 40, 1, 0, 11);
            av.t.b(var0, var5.g, ay);
         }
      }

      switch(ai.e[73]) {
         case 10:
            a(9);
            return;
         case 20:
            d = 0;
            a(11);
            return;
         case 30:
            d = 1;
            a(11);
            return;
         case 40:
            d = 2;
            a(11);
            return;
         case 50:
            a(10);
            return;
         case 60:
            a(16);
      }
   }

   private static boolean t() {
      if (a.e(8192)) {
         b();
         a.a();
         return true;
      } else {
         return false;
      }
   }

   public static final void e() {
      a(b.length, 1);
      x[0] = I;
      w = 0;
      G = 0;
   }

   public static final void f() {
      if (av.H != 1) {
         av.t.a(av.t.bf[0]);
      }
   }

   public static final void g() {
      int var0 = n();
      I = x[0];
      if (var0 == -1) {
         switch(I) {
            case 0:
               w = 0;
               break;
            case 1:
               w = 1;
               break;
            case 2:
               w = 2;
               break;
            case 3:
               w = 3;
               break;
            case 4:
               w = 5;
               break;
            case 5:
               w = 6;
               break;
            case 6:
               w = 7;
         }

         a(w);
         a.a();
      } else {
         if (var0 == -2) {
            b();
            a.a();
         }
      }
   }

   public static final void b(Graphics var0) {
      av.c(var0);
      ay = k.a((short)0, (short)1);
      var0.setClip(0, 0, 240, 320);
      k.a(var0, 0, 1);

      for(int var1 = 0; var1 < b.length; ++var1) {
         if (var1 == I) {
            k.a(var0, 0, 2 + var1);
         }
      }
   }

   public static final void h() {
      if (c) {
         System.out.println("searchTask");
         c = false;

         for(int var0 = 0; var0 < 37; ++var0) {
            if (ai.f[var0] == 99) {
               ai.a(var0, (byte)100, 1);
               if (var0 < 10) {
                  i[0] = g.b();
                  i[0]++;
               } else {
                  for(int var1 = 1; var1 < 4; ++var1) {
                     if (i[var1] == var0) {
                        i[var1] = 0;
                        --j;
                     }
                  }
               }

               g.a("提交任务: " + g.c(var0).c);
               g.e = true;
               g.f = true;
               if (var0 >= 11 && var0 <= 16) {
                  av.t.b.a(1000);
                  g.a("获得奖励: 金钱x1000");
                  g.e = false;
               } else if (var0 >= 17 && var0 <= 27 && var0 != 19 && var0 != 22) {
                  if (var0 == 17 || var0 == 20) {
                     w.a(10, 1);
                     g.a("获得奖励: 技能书x1");
                     g.e = false;
                  }

                  av.t.b.a(2000);
                  g.a("获得奖励: 金钱x2000");
                  g.e = false;
               } else if (var0 >= 28 && var0 <= 34 && var0 != 32) {
                  if (var0 == 30 || var0 == 33) {
                     w.a(10, 2);
                     g.a("获得奖励: 技能书x2");
                     g.e = false;
                  }

                  av.t.b.a(3000);
                  g.a("获得奖励: 金钱x3000");
                  g.e = false;
               } else if (var0 == 35) {
                  av.t.b.a(4000);
                  g.a("获得奖励: 金钱x4000");
                  g.e = false;
               } else if (var0 == 36) {
                  g.a("获得奖励: 彩虹之心x1");
                  g.e = false;
                  av.t.b.b(18);
               }
            }
         }
      }
   }

   private static final void u() {
      a(4, 0);
      a(3, 6, 1);
      w = 0;
      c = true;
      h();
      L = new int[4][11];
      int var0 = 0;
      int var1 = 0;
      int var2 = 10;

      for(int var3 = 0; var3 < 4; ++var3) {
         switch(var3) {
            case 0:
               var2 = 11;
               break;
            case 1:
               var2 = 17;
               break;
            case 2:
               var2 = 28;
               break;
            case 3:
               var2 = 35;
               break;
            case 4:
               var2 = 37;
         }

         --var2;

         for(int var4 = 0; var4 < 11; ++var4) {
            ++var2;
            byte var5 = 0;
            switch(var3 + 1) {
               case 0:
                  var5 = 11;
                  break;
               case 1:
                  var5 = 17;
                  break;
               case 2:
                  var5 = 28;
                  break;
               case 3:
                  var5 = 35;
                  break;
               case 4:
                  var5 = 37;
            }

            if (var4 < var5 && var4 < u.e[var3].length) {
               boolean var6 = false;

               for(int var7 = 0; var7 < u.e[var3][var4][0]; ++var7) {
                  if (ai.f[u.e[var3][var4][var7 + 1]] < 99) {
                     var6 = true;
                  }
               }

               if (!var6) {
                  L[var0][var1] = var2;
                  ++var1;
               }
            }
         }

         ++var0;
         var1 = 0;
      }

      ai.e[73] = 11;
      j = 0;

      for(int var8 = 1; var8 < 4; ++var8) {
         if (i[var8] != 0) {
            ++j;
         }
      }

      System.out.println("task_take_info" + j);
   }

   private static final void v() {
      if (i[0] == 4 && w.f(23) != null && ai.e[0] == 31 || i[0] == 6 && w.f(22) != null && ai.e[0] == 40 || i[0] == 8 && av.t.b.c(15) && ai.e[0] == 45) {
         ++ai.e[0];
      }

      if (ai.f[12] > 0 && ai.f[12] < 99 && w.f(11) != null && w.f(11).k >= 50) {
         w.a(11, -50);
         ai.a(12, (byte)99, 1);
      } else if (ai.f[13] > 0 && ai.f[13] < 99 && w.f(12) != null && w.f(12).k >= 3) {
         w.a(20, -3);
         ai.a(13, (byte)99, 1);
      } else if (ai.f[16] > 0 && ai.f[16] < 99 && w.f(13) != null && w.f(13).k >= 50) {
         w.a(15, -50);
         ai.a(16, (byte)99, 1);
      } else if (ai.f[21] > 0 && ai.f[21] < 99 && w.f(18) != null && w.f(18).k >= 3) {
         w.a(18, -3);
         ai.a(21, (byte)99, 1);
      } else if (ai.f[25] > 0 && ai.f[25] < 99 && w.f(13) != null && w.f(13).k >= 20) {
         w.a(13, -20);
         ai.a(25, (byte)99, 1);
      } else if (ai.f[27] > 0 && ai.f[27] < 99 && w.f(17) != null && w.f(17).k >= 20) {
         w.a(17, -20);
         ai.a(27, (byte)99, 1);
      } else if (ai.f[29] > 0 && ai.f[29] < 99 && w.f(19) != null && w.f(19).k >= 3) {
         w.a(19, -3);
         ai.a(29, (byte)99, 1);
      }

      a(x);
      i();
      if (!av.t.b.c(28)) {
         int var0 = 0;

         for(int var1 = 11; var1 < 37; ++var1) {
            if (ai.f[var1] >= 99) {
               ++var0;
            }
         }

         if (var0 >= 20) {
            t.f[28] = 1;
            av.t.b.b(28);
            g.a("获得称号: " + t.a[0][28]);
            g.e = true;
            g.f = false;
         }
      }
   }

   private static final void w() {
      if (J && l) {
         J = false;
         if (K) {
            l = false;
            K = false;
         } else if (m == 1) {
            for(int var2 = 1; var2 < 4; ++var2) {
               if (i[var2] == 0) {
                  ai.a(L[x[0]][O + P], (byte)1, 1);
                  i[var2] = L[x[0]][O + P];
                  ++j;
                  l = false;
                  return;
               }
            }

            l = false;
         } else {
            if (m == 2) {
               l = false;
            }
         }
      } else if (t()) {
         ai.e[73] = 11;
      } else if (!a.e(4) && !a.e(8)) {
         if (a.e(20480)) {
            if (L[x[0]][O + P] != 0) {
               for(int var1 = 1; var1 < 4; ++var1) {
                  if (i[var1] == L[x[0]][O + P]) {
                     a("已经接受该任务", "确定", null, 1);
                     J = true;
                     K = true;
                     return;
                  }
               }

               if (ai.f[L[x[0]][O + P]] >= 99) {
                  a("该任务已经完成", "确定", null, 1);
                  J = true;
                  K = true;
               } else if (j >= 3) {
                  a("支线任务最多接3个", "确定", null, 1);
                  J = true;
                  K = true;
               } else {
                  a("接受任务？", "确定", "取消", 1);
                  J = true;
                  K = false;
               }
            }
         } else {
            n();
            j();
         }
      } else {
         n();
         byte var0 = 0;
         switch(x[0]) {
            case 0:
               var0 = 6;
               break;
            case 1:
               var0 = 11;
               break;
            case 2:
               var0 = 7;
               break;
            case 3:
               var0 = 3;
         }

         a(3, var0, 1);
      }
   }

   private static final void g(Graphics var0) {
      av.c(var0);
      var0.setClip(0, 0, 240, 320);
      k.a(var0, 16, 1);

      for(int var1 = 0; var1 < 3; ++var1) {
         int var2 = 2 + var1;
         if (P == var1) {
            k.a(var0, 16, var2);
            w = var2;
         }

         if (L[x[0]][O + var1] < 37 && L[x[0]][O + var1] > 0) {
            switch(ai.f[L[x[0]][O + var1]]) {
               case 0:
                  k.c(var0, 16, 9 + var1);
                  break;
               case 99:
               case 100:
                  k.a(var0, 16, 16 + var1);
                  break;
               default:
                  k.b(var0, 16, 9 + var1);
            }

            ay = k.g(16, 12 + var1);
            boolean var3 = true;
            if (ai.f[L[x[0]][O + var1]] >= 99) {
               var0.setColor(16777215);
               var0.drawString("已经完成", ay[0] + (ay[2] >> 1), ay[1] - 2, 17);
               var3 = false;
            }

            if (var3) {
               var0.setColor(16764672);
               var0.setClip(ay[0] + 2, ay[1] - 3, ay[2], ay[3] + 6);
               if (P == var1) {
                  int var10002 = ay[0] + 2;
                  int var10003 = ay[1] - 2;
                  short var10004 = ay[2];
                  o.a(var0, g.c(L[x[0]][O + var1]).c, var10002, var10003, var10004, ay[3] + 6);
               } else {
                  int var5 = ay[0] + 2;
                  var0.drawString(g.c(L[x[0]][O + var1]).c, var5, ay[1] - 2, 20);
               }
            }

            if (L[x[0]][O + P] != 0) {
               k.b(var0, g.c(L[x[0]][O + P]).d, 16, 15, 65535, 0, 20);
            }
         }
      }

      b(var0, 16, w);
      var0.setClip(0, 0, 240, 320);

      for(int var4 = 0; var4 < 4; ++var4) {
         if (x[0] == var4) {
            k.a(var0, 16, 5 + var4);
         }
      }
   }

   private static final void x() {
      if (M == null) {
         M = new n();
      }

      if (N == null) {
         N = new n();
      }

      ai.e[72] = 0;
   }

   private static final void y() {
      M.h();
      N.h();
   }

   private static final void z() {
      if (a.e(2)) {
         if (++ai.e[72] > 3) {
            ai.e[72] = 0;
            return;
         }
      } else if (a.e(1)) {
         if (--ai.e[72] < 0) {
            ai.e[72] = 3;
            return;
         }
      } else if (a.e(20480)) {
         b();
      }
   }

   private static final void h(Graphics var0) {
      boolean var1 = false;
      var0.setColor(65535);
      o.a(var0, "选择游戏难度：", 120, 115, 33, 16755828, 9766440);
      if (M != null) {
         M.c = 60;
         M.d = 2;
         M.b(120, 150);
      }

      if (N != null) {
         N.c = 60;
         N.d = 1;
         N.e = ai.e[72];
         N.b(120, 160);
      }
   }

   public static final void a(int var0, int var1, int var2) {
      O = 0;
      P = 0;
      Q = var0;
      R = var1;
      a(S, var1, var2);
   }

   public static final void i() {
      O = 0;
      P = 0;
      Q = 0;
      R = 0;
   }

   public static final int j() {
      int var0;
      if ((var0 = b(S)) == -4) {
         if (P == 0 && O > 0) {
            --O;
         } else if (S[0] == R - 1) {
            if (Q > R) {
               O = S[0] - R + 1;
               P = R - 1;
            } else {
               O = S[0] - Q + 1;
               P = Q - 1;
            }
         } else {
            --P;
         }
      } else if (var0 == -5) {
         if (S[0] >= Q && O < R - Q && P >= Q - 1) {
            ++O;
         } else if (S[0] == 0) {
            O = 0;
            P = 0;
         } else {
            ++P;
         }
      }

      return var0;
   }

   private static final void A() {
      z = o.a("num4");
      if (d != 2) {
         if (V == null) {
            V = new t[T[aa.bg][d].length];
         }

         U = T[aa.bg][d].length;
         int var0 = 0;

         for(int var1 = U; var0 < var1; ++var0) {
            V[var0] = t.a(aa.bg, T[aa.bg][d][var0]);
         }
      } else {
         if (W == null) {
            W = new m[T[aa.bg][d].length];
         }

         U = T[aa.bg][d].length;
         int var2 = 0;

         for(int var3 = U; var2 < var3; ++var2) {
            W[var2] = m.a(T[aa.bg][d][var2]);
         }
      }

      a(U, 1);
      a(4, U, 1);
      G = 0;
   }

   private static final void B() {
      z = null;
      a(x);
      i();
      if (av.t.b.c(5) && t.f[34] == 0) {
         t.f[34] = 1;
         av.t.b.b(34);
         g.a("获得称号: " + t.a[0][34]);
         g.e = true;
         g.f = false;
      }

      if (d != 2) {
         t.a();
         int var2 = 0;

         for(int var3 = V.length; var2 < var3; ++var2) {
            V[var2] = null;
         }

         V = null;
      } else {
         m.b();
         int var0 = 0;

         for(int var1 = W.length; var0 < var1; ++var0) {
            W[var0] = null;
         }

         W = null;
      }
   }

   private static final void C() {
      aa var0 = av.t;
      if (X && l) {
         X = false;
         if (m == 1) {
            switch(d) {
               case 0:
               case 1:
                  var0.b.b(T[aa.bg][d][G]);
                  var0.W[12] -= V[G].b();
                  break;
               case 2:
                  w.a(T[aa.bg][d][G], 1);
                  var0.W[12] -= W[G].a();
            }
         }

         l = false;
      } else {
         if (t()) {
            if (av.H == 2) {
               switch(d) {
                  case 0:
                     ai.e[73] = 22;
                     break;
                  case 1:
                     ai.e[73] = 33;
                     break;
                  case 2:
                     ai.e[73] = 44;
               }

               return;
            }
         } else {
            if (a.e(20480)) {
               switch(d) {
                  case 0:
                  case 1:
                     if (var0.W[12] >= V[G].b() && !var0.b.b(V[G])) {
                        a("确认购买", "确定", "取消", 1);
                        X = true;
                     } else if (var0.b.b(V[G])) {
                        a("没有存货", "确定", null, 1);
                     } else {
                        a("现金不足", "确定", null, 1);
                     }
                     break;
                  case 2:
                     if (var0.W[12] >= W[G].a()) {
                        a("确认购买", "确定", "取消", 1);
                        X = true;
                     } else {
                        a("现金不足", "确定", null, 1);
                     }
               }

               return;
            }

            n();
            j();
            G = x[0];
         }
      }
   }

   private static final void i(Graphics var0) {
      aa var1 = av.t;
      k.a(var0, 15, 1);
      ay = k.a((short)15, (short)17);
      ay[1] = (short)(ay[1] + 9);
      ay[3] = (short)((O + P) * (ay[3] / R) * 2);
      k.a(var0, 15, 18, ay);

      for(int var2 = 0; var2 < 4; ++var2) {
         if (P == var2) {
            w = 5 + var2;
            k.a(var0, 15, w);
         }
      }

      if (d != 2) {
         int var5 = 0;

         for(int var3 = V.length; var5 < var3 && var5 < 4; ++var5) {
            V[var5 + O].a(k.g(15, 5 + var5));
            var0.setColor(65535);
            short[] var4 = k.g(15, 9 + var5);
            var0.setClip(var4[0], var4[1] - 3, var4[2], var4[3] + 3);
            if (var1.b.b(V[var5 + O])) {
               if (var5 + O == G) {
                  o.a(var0, "已经售完", var4[0] + 2, var4[1] - 2, var4[2], var4[3] + 3);
               } else {
                  var0.drawString("已经售完", var4[0] + (var4[2] >> 1), var4[1] - 2, 17);
               }
            } else if (var5 + O == G) {
               o.a(var0, V[var5 + O].p, var4[0] + 2, var4[1] - 2, var4[2], var4[3] + 3);
            } else {
               var0.drawString(V[var5 + O].p, var4[0] + (var4[2] >> 1), var4[1] - 2, 17);
            }

            var0.setClip(0, 0, 240, 320);
            ay = k.g(15, 13 + var5);
            o.a(var0, z, V[var5 + O].b() + "", ay[0] + (ay[2] >> 1) - 3, ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
         }
      } else {
         int var6 = 0;

         for(int var7 = W.length; var6 < var7 && var6 < 4; ++var6) {
            W[var6 + O].a(k.g(15, 5 + var6));
            var0.setColor(65535);
            short[] var8 = k.g(15, 9 + var6);
            var0.setClip(var8[0], var8[1] - 3, var8[2], var8[3] + 3);
            if (var6 + O == G) {
               o.a(var0, W[var6 + O].i, var8[0] + 2, var8[1] - 2, var8[2], var8[3] + 3);
            } else {
               var0.drawString(W[var6 + O].i, var8[0] + (var8[2] >> 1), var8[1] - 2, 17);
            }

            var0.setClip(0, 0, 240, 320);
            ay = k.g(15, 13 + var6);
            o.a(var0, z, W[var6 + O].a() + "", ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
         }
      }

      switch(d) {
         case 0:
            k.a(var0, 15, 3);
            break;
         case 1:
            k.a(var0, 15, 4);
            break;
         case 2:
            k.a(var0, 15, 2);
      }

      if (d != 2) {
         k.b(var0, V[G].q, 15, 19, 1479075, 0, 20);
      } else {
         k.b(var0, W[G].j, 15, 19, 1479075, 0, 20);
      }

      b(var0, 15, w);
      if (z != null) {
         ay = k.a((short)5, (short)21);
         o.a(var0, z, String.valueOf(var1.W[12]), ay[0] + (ay[2] >> 1) - 5, ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
      }
   }

   private static final void D() {
      Y = false;
      ab = av.t();
      aa = 0;
      int var5 = av.t.W[5];
      byte var0;
      if (ab[2] < 25) {
         var0 = 50;
      } else if (ab[2] < 50) {
         var0 = 60;
      } else if (ab[2] < 100) {
         var0 = 80;
      } else {
         var0 = 100;
      }

      byte var1;
      if (ab[3] >= 10 * var5) {
         var1 = 50;
      } else if (ab[3] >= 3 * var5) {
         var1 = 60;
      } else if (ab[3] >= var5) {
         var1 = 80;
      } else {
         var1 = 100;
      }

      byte var2;
      if (ab[4] >= 10) {
         var2 = 50;
      } else if (ab[4] >= 5) {
         var2 = 60;
      } else if (ab[4] > 0) {
         var2 = 80;
      } else {
         var2 = 100;
      }

      byte var3;
      if (ab[5] == 0) {
         var3 = 10;
      } else if (ab[5] <= 5) {
         var3 = 11;
      } else {
         var3 = 12;
      }

      byte var4;
      switch(ai.e[72]) {
         case 0:
            var4 = 10;
            break;
         case 1:
            var4 = 11;
            break;
         case 2:
            var4 = 12;
            break;
         case 3:
            var4 = 13;
            break;
         default:
            var4 = 10;
      }

      Z = (var0 + var1 + var2) * var3 * var4;
      z = o.a("num7");
      A = o.a("num3");
      e = 0;
      ac = 0;
      ae = false;
   }

   private static final void E() {
      z = null;
      A = null;
      Y = false;
      if (!av.t.b.c(26) && ac == 4) {
         t.f[26] = 1;
         av.t.b.b(26);
         g.a("获得称号: " + t.a[0][26]);
         g.e = true;
         g.f = false;
      }
   }

   private static final void F() {
      Object var0 = null;
      if (Y && !ae) {
         if (a.c()) {
            ai.e[10] = 100;
            b();
            a.a();
            return;
         }
      } else {
         if (aa / 10000 < Z / 10000) {
            aa += 10000;
         } else if (aa / 1000 < Z / 1000) {
            aa += 1000;
         } else if (aa / 100 < Z / 100) {
            aa += 100;
         } else if (aa / 10 < Z / 10) {
            aa += 10;
         } else if (aa < Z) {
            ++aa;
         }

         if (e > 0) {
            ++e;
         }
      }
   }

   private static final void j(Graphics var0) {
      av.c(var0);
      Object var1 = null;
      if (e <= 30) {
         k.a(var0, 19, 1);
         if (z != null) {
            ay = k.a((short)19, (short)2);
            o.a(
               var0,
               z,
               ab[0] / 3600 + ":" + ab[0] % 3600 / 600 + ab[0] % 600 / 100 + ":" + ab[0] % 60 / 10 + ab[0] % 10,
               ay[0] + (ay[2] >> 1),
               ay[1] + (ay[3] >> 1),
               3,
               1,
               0,
               11
            );
            ay = k.a((short)19, (short)3);
            o.a(var0, z, ab[1] + "", ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
            ay = k.a((short)19, (short)4);
            o.a(var0, z, ab[2] + "", ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
            ay = k.a((short)19, (short)5);
            o.a(var0, z, ab[3] + "", ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
            ay = k.a((short)19, (short)6);
            o.a(var0, z, ab[4] + "", ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
            ay = k.a((short)19, (short)7);
            o.a(var0, z, ab[6] + "", ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
            ay = k.a((short)19, (short)8);
            o.a(var0, z, ab[5] + "", ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
         }

         if (A != null) {
            ay = k.a((short)19, (short)9);
            o.a(var0, A, aa + "", ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 10);
         }

         if (aa == Z) {
            ay = k.a((short)19, (short)10);
            if (Z >= 36000) {
               ac = 4;
            } else if (Z >= 30000) {
               ac = 3;
            } else if (Z >= 25000) {
               ac = 2;
            } else if (Z >= 20000) {
               ac = 1;
            } else if (Z >= 0) {
               ac = 0;
            }

            k.b(var0, 19, 14 - ac, ay, -1, -1, -1, -1);
            return;
         }
      } else {
         k.a(var0, 20, 1);
         k.b(var0, "评分越高随机获得的奖励就越好", 20, 3, 15513698, 0, 20);
         if (e < 60) {
            ad = o.b(0, 25);
         } else if (!Y) {
            int var2 = o.b(0, 100);
            switch(ac) {
               case 0:
                  if (var2 < 50) {
                     ad = 0;
                     af = 3;
                  } else {
                     ad = 1;
                     af = 3;
                  }
                  break;
               case 1:
                  if (var2 < 30) {
                     ad = 0;
                     af = 5;
                  } else if (var2 < 60) {
                     ad = 1;
                     af = 5;
                  } else {
                     ad = 3;
                     af = 1;
                  }
                  break;
               case 2:
                  if (var2 < 30) {
                     ad = 3;
                     af = 1;
                  } else if (var2 < 60) {
                     ad = 2;
                     af = 1;
                  } else {
                     ad = 9;
                     af = 1;
                  }
                  break;
               case 3:
                  if (var2 < 25) {
                     ad = 4;
                     af = 1;
                  } else if (var2 < 50) {
                     ad = 5;
                     af = 1;
                  } else if (var2 < 75) {
                     ad = 10;
                     af = 1;
                  } else {
                     ad = 2;
                     af = 1;
                  }
                  break;
               case 4:
                  if (var2 < 30) {
                     ad = 4;
                     af = 2;
                  } else if (var2 < 60) {
                     ad = 5;
                     af = 2;
                  } else {
                     ad = 10;
                     af = 1;
                  }
            }

            ae = true;
            Y = true;
         }

         if (H == null) {
            H = new n();
         }

         if (e > 40) {
            H.c = 58;
            H.d = 1;
            H.e = ad;
            ay = k.a((short)20, (short)2);
            var0.setColor(26550);
            var0.fillRect(ay[0] + 3, ay[1] + 3, ay[2] - 6, ay[3] - 6);
            H.b(ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1));
            if (af > 1) {
               o.a(var0, B, String.valueOf(af), ay[0] + ay[2] - 6, ay[1] + ay[3] - 4, 40, 1, 0, 11);
            }
         }

         if (Y) {
            var0.setColor(15513698);
            ay = k.a((short)20, (short)4);
            o.a(var0, "获得：" + m.a[ad] + " x " + af, ay[0] + 2, ay[1] + (ay[3] >> 2), ay[2], ay[3] + 3);
            if (ae) {
               w.a(ad, af);
               ae = false;
            }
         }
      }
   }

   private static final void G() {
      z = o.a("num4");
      f = 0;
      if (V == null) {
         V = new t[19];
      }

      Enumeration var0 = w.d.elements();

      while(var0.hasMoreElements()) {
         V[f++] = (t)var0.nextElement();
      }

      var0 = w.c.elements();

      while(var0.hasMoreElements()) {
         V[f++] = (t)var0.nextElement();
      }

      var0 = w.e.elements();

      while(var0.hasMoreElements()) {
         V[f++] = (t)var0.nextElement();
      }

      if (W == null) {
         W = new m[14];
      }

      int var4 = 0;

      for(boolean var1 = false; var4 < 14; ++var4) {
         if (w.h(var4 + 11)) {
            W[var4] = (m)w.g.elementAt(w.g(var4 + 11));
         } else {
            W[var4] = m.a(11 + var4);
            W[var4].k = 0;
         }
      }

      a(f + 3, 1);
      a(3, f + 3, 1);
      G = 0;
   }

   private static final void H() {
      Object var0 = null;
      if (i[0] == 4 && w.f(22) != null && ai.e[0] == 24 || i[0] == 6 && w.f(23) != null && ai.e[0] == 40 || i[0] == 8 && w.f(24) != null && ai.e[0] == 45) {
         ++ai.e[0];
      }

      z = null;
      t.a();
      int var1 = 0;

      for(int var2 = V.length; var1 < var2; ++var1) {
         V[var1] = null;
      }

      V = null;
      m.b();
      var1 = 0;

      for(int var4 = W.length; var1 < var4; ++var1) {
         W[var1] = null;
      }

      W = null;
      a(x);
      i();
   }

   private static final void I() {
      aa var0 = av.t;
      if (ah && l) {
         ah = false;
         if (m == 1) {
            if (ag) {
               l = false;
               return;
            }

            if (G >= f) {
               switch(G - f) {
                  case 0:
                     w.a(W[11].g, 1);
                     w.a(W[1], -20);
                     w.a(W[2], -20);
                     w.a(W[3], -20);
                     w.a(W[7], -2);
                     var0.b.a(-2000);
                     break;
                  case 1:
                     w.a(W[12].g, 1);
                     w.a(W[8], -5);
                     w.a(W[5], -4);
                     w.a(W[6], -3);
                     var0.b.a(-1000);
                     break;
                  case 2:
                     w.a(W[13].g, 1);
                     w.a(W[1], -5);
                     w.a(W[6], -5);
                     w.a(W[9], -50);
                     var0.b.a(-5000);
               }
            } else {
               if (V[G].m == 1) {
                  for(int var6 = 0; var6 < 10; ++var6) {
                     if (V[G].o[13 + var6] > 0) {
                        w.a(W[var6].g, -V[G].o[13 + var6]);
                     }
                  }
               } else if (V[G].m == 2) {
                  for(int var5 = 0; var5 < 10; ++var5) {
                     if (V[G].o[13 + var5] > 0) {
                        w.a(W[var5].g, -V[G].o[23 + var5]);
                     }
                  }
               }

               var0.W[12] -= V[G].o[4];
               V[G].d();
            }
         }

         l = false;
      } else if (t()) {
         ai.e[73] = 55;
      } else if (!a.e(20480)) {
         n();
         j();
         G = x[0];
      } else {
         if (G >= f) {
            if (w.f(W[G - f + 11].g) != null) {
               a("已经打造", "确定", null, 1);
               ag = true;
               ah = true;
            }

            switch(G - f) {
               case 0:
                  if (W[1].k >= 20 && W[2].k >= 20 && W[3].k >= 20 && W[7].k >= 2) {
                     if (var0.W[12] < 2000) {
                        a("金钱不足", "确定", null, 1);
                        ag = true;
                        ah = true;
                     } else {
                        a("打造成功", "确定", null, 1);
                        ag = false;
                        ah = true;
                     }
                  } else {
                     a("材料不足", "确定", null, 1);
                     ag = true;
                     ah = true;
                  }
                  break;
               case 1:
                  if (W[8].k >= 5 && W[5].k >= 4 && W[6].k >= 3) {
                     if (var0.W[12] < 1000) {
                        a("金钱不足", "确定", null, 1);
                        ag = true;
                        ah = true;
                     } else {
                        a("打造成功", "确定", null, 1);
                        ag = false;
                        ah = true;
                        ai.f[6] = 99;
                        ai.f[4] = 100;
                        ai.f[5] = 100;
                        ai.e[0] = 30;
                     }
                  } else {
                     a("材料不足", "确定", null, 1);
                     ag = true;
                     ah = true;
                  }
                  break;
               case 2:
                  if (W[1].k >= 5 && W[6].k >= 5 && W[9].k >= 50) {
                     if (var0.W[12] < 5000) {
                        a("金钱不足", "确定", null, 1);
                        ag = true;
                        ah = true;
                     } else {
                        a("打造成功", "确定", null, 1);
                        ag = false;
                        ah = true;
                     }
                  } else {
                     a("材料不足", "确定", null, 1);
                     ag = true;
                     ah = true;
                  }
            }
         } else if (V[G].c()) {
            if (V[G].m == 1) {
               for(int var3 = 0; var3 < 10; ++var3) {
                  if (V[G].o[13 + var3] > W[var3].k) {
                     a("材料不足", "确定", null, 1);
                     ag = true;
                     ah = true;
                     return;
                  }
               }
            } else if (V[G].m == 2) {
               for(int var1 = 0; var1 < 10; ++var1) {
                  if (V[G].o[23 + var1] > W[var1].k) {
                     a("材料不足", "确定", null, 1);
                     ag = true;
                     ah = true;
                     return;
                  }
               }
            }

            if (var0.W[12] < V[G].o[4]) {
               a("金钱不足", "确定", null, 1);
               ag = true;
               ah = true;
               return;
            }

            a("升级成功", "确定", null, 1);
            ag = false;
            ah = true;
         } else {
            a("等级已满", "确定", null, 1);
            ag = true;
            ah = true;
         }

         int var4 = 0;

         for(boolean var2 = false; var4 < 11; ++var4) {
            if (w.f(W[var4].g) != null) {
               W[var4].k = w.f(W[var4].g).k;
            } else {
               W[var4].k = 0;
            }
         }
      }
   }

   private static final void k(Graphics var0) {
      aa var1 = av.t;
      k.a(var0, 18, 1);
      ay = k.a((short)18, (short)23);
      ay[1] = (short)(ay[1] + 13);
      ay[3] = (short)((O + P - 1) * (ay[3] / R) * 2);
      k.a(var0, 18, 24, ay);

      for(int var2 = 0; var2 < 3; ++var2) {
         if (P == var2) {
            w = 2 + var2;
            k.a(var0, 18, w);
         }

         if (O + var2 < f) {
            V[var2 + O].a(k.g(18, 2 + var2));
            if (V[var2 + O].m == 0) {
               ay = k.g(18, 5 + var2 * 2);
               o.a(var0, z, String.valueOf(V[var2 + O].m + 1), ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
               ay = k.g(18, 5 + var2 * 2 + 1);
               o.a(var0, z, String.valueOf(V[var2 + O].m + 1), ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
            } else if (V[var2 + O].m == 3) {
               ay = k.g(18, 5 + var2 * 2);
               o.a(var0, z, String.valueOf(V[var2 + O].m), ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
               ay = k.g(18, 5 + var2 * 2 + 1);
               o.a(var0, z, String.valueOf(V[var2 + O].m), ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
            } else {
               ay = k.g(18, 5 + var2 * 2);
               o.a(var0, z, String.valueOf(V[var2 + O].m), ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
               ay = k.g(18, 5 + var2 * 2 + 1);
               o.a(var0, z, String.valueOf(V[var2 + O].m + 1), ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
            }
         } else {
            W[O + var2 - f + 11].a(k.g(18, 2 + var2));
            ay = k.g(18, 5 + var2 * 2);
            o.a(var0, z, String.valueOf(1), ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
            ay = k.g(18, 5 + var2 * 2 + 1);
            o.a(var0, z, String.valueOf(1), ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
         }
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         ay = k.g(18, 12 + var3);
         o.a(var0, z, W[var3].k + "", ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
      }

      if (G >= f) {
         k.b(var0, m.c[G - f], 18, 11, 1479075, 0, 20);
      } else if (V[G].m < 3) {
         k.b(var0, t.c[V[G].j][V[G].m], 18, 11, 1479075, 0, 20);
      } else {
         k.b(var0, "已经满级", 18, 11, 1479075, 0, 20);
      }

      b(var0, 18, w);
      if (z != null) {
         ay = k.a((short)5, (short)21);
         o.a(var0, z, String.valueOf(var1.W[12]), ay[0] + (ay[2] >> 1) - 5, ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
      }
   }

   public static final void k() {
      g = 260;
   }

   public static final void l() {
      g = 0;
   }

   public static final void m() {
      if (a.e(8192) || a.e(32768)) {
         b();
         a.a();
      }
   }

   public static final void c(Graphics var0) {
      o.a(var0, 592136);
      a(var0, 2, 2, 234, 314, 4211247);
      var0.setColor(16777215);
      int var1;
      if ((
            var1 = o.a(
               var0,
               "<游戏简介>&二十四年前，我促成了科勒斯和她的神话，而我到底是谁，前世今身，奈何桥下，二十四年后的我用我的故事讲述了另一个我记忆中的科勒斯和爱伦的故事。而我，依然是那个剑士。&&<主菜单操作>&方向键左/数字键4:&向左移动；&方向键右/数字键6:&向右移动；&方向键上/数字键2:&向上移动；&方向键下/数字键8:&向下移动；&双击方向键左/数字键4:&向左冲刺；&双击方向键右/数字键6:&向右冲刺；&双击方向键上/数字键2:&向上冲刺；&双击方向键下/数字键8:&向下冲刺；&数字键1:技能1；&数字键3:技能2；&数字键5:攻击/对话；&数字键7:技能3；&数字键9：技能4（需用技能点升级后才能使用）；提示：0键格挡成功后，按5键可以发动一闪，使用得当，可以无伤通关&*键：血药；&#键：蓝药；&左软键:确定/游戏菜单；&右软键:取消/返回/任务菜单；&",
               g,
               new short[]{20, 30, 200, 260},
               17,
               6961408,
               16777215
            )
         )
         < 260) {
         g = 0;
      } else {
         g -= 2;
      }

      if (g < -var1 + 250 - 320 + 60) {
         g = 290;
      }

      var0.drawString("返回", 236, 316, 40);
   }

   private static final void J() {
      a(ai.length, 1);
      x[0] = 0;
      aj = false;
      G = 0;
   }

   private static final void K() {
      t();
      n();
      switch(x[0]) {
         case 0:
            if (a.e(20480)) {
               am.b = !am.b;
               if (am.b) {
                  am.b(av.m);
               } else {
                  am.e();
               }

               a.a();
               return;
            }
            break;
         case 1:
            if (a.e(20480)) {
               if (av.H != 2 && av.H != 1) {
                  a("当前场景不能保存。", "确定", null, 1);
               } else {
                  c();
                  a(111);
               }

               a.a();
               return;
            }
            break;
         case 2:
            if (a.e(20480)) {
               ad.a((short)1);
               return;
            }
            break;
         case 3:
            if (aj && l) {
               aj = false;
               l = false;
               if (m == 1 || m == 3) {
                  av.a((byte)2);
                  c();
               }

               return;
            }

            if (a.e(20480)) {
               a("是否返回主菜单？", "确定", "取消", 1);
               aj = true;
            }
      }
   }

   private static final void l(Graphics var0) {
      av.c(var0);
      var0.setClip(0, 0, 240, 320);
      k.a(var0, 6, 1);

      for(int var1 = 0; var1 < 4; ++var1) {
         if (x[0] == var1) {
            if (var1 == 0) {
               if (am.b) {
                  k.c(var0, 6, 2);
               } else {
                  k.b(var0, 6, 2);
               }
            } else {
               k.a(var0, 6, 2 + var1);
            }
         }
      }
   }

   private static final void L() {
      z = o.a("num4");
   }

   private static final void M() {
      z = null;
   }

   private static final void N() {
      t();
   }

   private static final void m(Graphics var0) {
      k.a(var0, 10, 1);
      aa var1 = av.t;
      var0.setColor(255);
      ay = k.a((short)10, (short)2);
      if (var1.bf[3] == null) {
         var0.drawString("新手", ay[0] + (ay[2] >> 1), ay[1] + ay[3] + 2, 33);
      } else {
         var0.drawString(var1.bf[3].p, ay[0] + (ay[2] >> 1), ay[1] + ay[3], 33);
      }

      for(int var2 = 0; var2 < 9; ++var2) {
         ay = k.g(10, 3 + var2);
         String var3 = "";
         switch(var2) {
            case 0:
               var3 = var1.W[10] + "/" + var1.W[11];
               break;
            case 1:
               var3 = var1.W[5] + "/" + var1.W[6];
               break;
            case 2:
               var3 = var1.W[7] + "/" + var1.W[8];
               break;
            case 3:
               var3 = String.valueOf(var1.r());
               break;
            case 4:
               var3 = String.valueOf(var1.t());
               break;
            case 5:
               var3 = String.valueOf(var1.W[16]);
               break;
            case 6:
               var3 = String.valueOf(var1.s());
               break;
            case 7:
               var3 = String.valueOf(var1.W[9]);
               break;
            case 8:
               var3 = String.valueOf(var1.W[12]);
         }

         if (z != null) {
            o.a(var0, z, var3, ay[0], ay[1], 6, 1, 0, 11);
         }
      }
   }

   private static void O() {
      Object var0 = null;
      a(3, 1);
      ak = false;
      z = o.a("num4");
      A = o.a("num2");
      w = 3;
      if (W == null) {
         W = new m[11];
      }

      int var1 = 0;
      int var2 = 0;

      for(boolean var3 = false; var1 < 11; ++var1) {
         if (w.h(var1)) {
            W[var2++] = (m)w.g.elementAt(w.g(var1));
         }
      }

      G = 0;
   }

   private static void P() {
      z = null;
      A = null;
      W = null;
   }

   private static void Q() {
      aa var0 = av.t;
      if (al && l) {
         al = false;
         if (m != 1) {
            if (m == 2) {
               l = false;
            }
         } else {
            switch(W[G].g) {
               case 0:
               case 1:
               case 3:
               case 4:
               case 5:
               case 7:
               case 9:
               case 10:
                  w.i(W[G].g);
                  W = null;
                  W = new m[11];
                  int var1 = 0;
                  int var2 = 0;

                  for(boolean var3 = false; var1 < 11; ++var1) {
                     if (w.h(var1)) {
                        W[var2++] = (m)w.g.elementAt(w.g(var1));
                     }
                  }
               case 2:
               default:
                  break;
               case 6:
               case 8:
                  l = false;
            }
         }
      } else {
         if (ak) {
            if (a.e(8192)) {
               ak = false;
               G = 0;
               return;
            }

            if (a.e(20480)) {
               if (x[0] == 0 && W[G] != null) {
                  switch(W[G].g) {
                     case 0:
                     case 1:
                     case 3:
                        if (var0.C(G) > 0) {
                           a("物品未就绪", "确定", null, 1);
                           break;
                        }
                     case 4:
                     case 5:
                     case 7:
                     case 9:
                     case 10:
                        a("是否使用", "确定", "取消", 1);
                     case 2:
                     default:
                        break;
                     case 6:
                     case 8:
                        a("请到宠物界面使用", "确定", null, 1);
                  }

                  al = true;
                  return;
               }
            } else if (a.e(4)) {
               if (--G < 0) {
                  G = 11;
                  return;
               }
            } else if (a.e(8)) {
               if (++G > 11) {
                  G = 0;
                  return;
               }
            } else {
               if (a.e(1)) {
                  if (G < 4) {
                     G += 8;
                     return;
                  }

                  G -= 4;
                  return;
               }

               if (a.e(2)) {
                  if (G >= 12) {
                     G -= 8;
                     return;
                  }

                  G += 4;
                  return;
               }
            }
         } else {
            if (a.e(20480)) {
               ak = true;
               return;
            }

            W = null;
            W = new m[12];
            n();
            t();
         }
      }
   }

   private static void n(Graphics var0) {
      k.a(var0, 5, 2);
      aa var1 = av.t;

      for(int var2 = 0; var2 < 3; ++var2) {
         if (x[0] == var2) {
            w = 3 + var2;
            k.a(var0, 5, w);
         }
      }

      if (ak) {
         if (G < W.length && W[G] != null) {
            k.b(var0, W[G].i + "&" + W[G].j, 5, 20, 16777215, 0, 20);
         }

         o.b(var0, k.a((short)5, (short)19), 1342177280);

         for(int var5 = 0; var5 < 12; ++var5) {
            if (G == var5) {
               w = 6 + var5;
               k.a(var0, 5, w);
            }
         }

         for(int var6 = 0; var6 < W.length; ++var6) {
            if (W[var6] != null) {
               ay = k.g(5, 6 + var6);
               W[var6].a(ay);
               o.a(var0, A, String.valueOf(w.f(W[var6].g).k), ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1) + (ay[3] >> 2), 3, 1, 0, 11);
            }
         }
      } else {
         switch(x[0]) {
            case 0:
               int var9 = 0;
               int var12 = 0;

               for(boolean var14 = false; var9 < 11; ++var9) {
                  if (w.h(var9)) {
                     W[var12++] = (m)w.g.elementAt(w.g(var9));
                  }
               }
               break;
            case 1:
               int var8 = 0;
               int var11 = 0;

               for(boolean var13 = false; var8 < 11; ++var8) {
                  if (w.h(var8 + 11)) {
                     W[var11++] = (m)w.g.elementAt(w.g(var8 + 11));
                  }
               }
               break;
            case 2:
               int var7 = 0;
               int var3 = 0;

               for(boolean var4 = false; var7 < 3; ++var7) {
                  if (w.h(var7 + 22)) {
                     W[var3++] = (m)w.g.elementAt(w.g(var7 + 22));
                  }
               }
         }

         for(int var10 = 0; var10 < W.length; ++var10) {
            if (W[var10] != null) {
               ay = k.g(5, 6 + var10);
               W[var10].a(ay);
               o.a(var0, A, String.valueOf(w.f(W[var10].g).k), ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1) + (ay[3] >> 2), 3, 1, 0, 11);
            }
         }

         o.b(var0, k.a((short)5, (short)18), 1342177280);
      }

      if (z != null) {
         ay = k.a((short)5, (short)21);
         o.a(var0, z, String.valueOf(var1.W[12]), ay[0] + (ay[2] >> 1) - 5, ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
      }

      b(var0, 5, w);
   }

   private static void R() {
      a(3, 1);
      ak = false;
      z = o.a("num4");
      A = o.a("num4H");
      B = o.a("num4L");
      w = 0;
      G = 0;
      if (V == null) {
         V = new t[6];
      }

      U = 6;
      int var0 = 0;
      int var1 = 0;

      for(int var2 = U; var0 < var2; ++var0) {
         if (av.t.b.c(T[aa.bg][3][var0])) {
            V[var1++] = (t)w.d.elementAt(av.t.b.d(T[aa.bg][3][var0]));
         }
      }
   }

   private static void S() {
      z = null;
      A = null;
      B = null;
      a(x);
      t.a();
      int var0 = 0;

      for(int var1 = V.length; var0 < var1; ++var0) {
         V[var0] = null;
      }

      V = null;
   }

   private static void T() {
      aa var0 = av.t;
      if (an && l) {
         an = false;
         l = false;
      } else if (am && l) {
         am = false;
         if (m == 1 && var0.b.b(V[G])) {
            var0.a(V[G]);
         }

         l = false;
      } else {
         if (ak) {
            if (a.e(8192)) {
               ak = false;
               G = 0;
               return;
            }

            if (a.e(20480)) {
               if (V[G] != null && var0.b.b(V[G])) {
                  if (V[G] != var0.bf[x[0]]) {
                     a("是否装备", "确定", "取消", 1);
                     am = true;
                     return;
                  }

                  a("已经装备", "确定", null, 1);
                  an = true;
                  return;
               }
            } else if (a.e(4) || a.e(1)) {
               if (--G < 0) {
                  G = 5;
                  return;
               }
            } else if ((a.e(8) || a.e(2)) && ++G > 5) {
               G = 0;
               return;
            }
         } else {
            if (a.e(20480)) {
               ak = true;
               return;
            }

            V = null;
            V = new t[6];
            n();
            t();
         }
      }
   }

   private static void o(Graphics var0) {
      aa var1 = av.t;
      k.a(var0, 11, 1);

      for(int var2 = 0; var2 < 3; ++var2) {
         if (x[0] == var2) {
            w = 2 + var2;
            k.a(var0, 11, w);
         }
      }

      if (ak) {
         for(int var5 = 0; var5 < 6; ++var5) {
            if (G == var5) {
               w = 8 + var5;
               k.a(var0, 11, w);
            }
         }

         switch(x[0]) {
            case 0:
               int var8 = 0;

               for(; var8 < 6; ++var8) {
                  if (V[var8] != null && var1.b.b(V[var8])) {
                     V[var8].a(k.g(11, 8 + var8));
                  }
               }

               if (V[G] != null && var1.b.b(V[G])) {
                  k.b(var0, V[G].q, 11, 14, 1479075, 0, 20);
               }
               break;
            case 1:
               for(int var7 = 0; var7 < 6; ++var7) {
                  if (V[var7] != null && var1.b.b(V[var7])) {
                     V[var7].a(k.g(11, 8 + var7));
                  }
               }

               if (V[G] != null && var1.b.b(V[G])) {
                  k.b(var0, V[G].q, 11, 14, 1479075, 0, 20);
               }
               break;
            case 2:
               for(int var6 = 0; var6 < 6; ++var6) {
                  if (V[var6] != null && var1.b.b(V[var6])) {
                     V[var6].a(k.g(11, 8 + var6));
                  }
               }

               if (V[G] != null && var1.b.b(V[G])) {
                  k.b(var0, V[G].q, 11, 14, 1479075, 0, 20);
               }
         }

         var0.setColor(65535);
         short[] var9 = k.a((short)11, (short)5);
         short[] var3 = k.a((short)11, (short)6);
         short[] var4 = k.a((short)11, (short)7);
         if (var1.bf[0] != null) {
            var0.setClip(var9[0], var9[1] - 3, var9[2], var9[3] + 6);
            if (x[0] == 0) {
               o.a(var0, var1.bf[0].p, var9[0] + 2, var9[1] - 3, var9[2], var9[3] + 6);
            } else {
               var0.drawString(var1.bf[0].p, var9[0], var9[1] - 3, 20);
            }

            var0.setClip(0, 0, 240, 320);
         }

         if (var1.bf[1] != null) {
            var0.setClip(var3[0], var3[1] - 3, var3[2], var3[3] + 6);
            if (x[0] == 1) {
               o.a(var0, var1.bf[1].p, var3[0] + 2, var3[1] - 3, var3[2], var3[3] + 6);
            } else {
               var0.drawString(var1.bf[1].p, var3[0], var3[1] - 3, 20);
            }

            var0.setClip(0, 0, 240, 320);
         }

         if (var1.bf[2] != null) {
            var0.setClip(var4[0], var4[1] - 3, var4[2], var4[3] + 6);
            if (x[0] == 2) {
               o.a(var0, var1.bf[2].p, var4[0] + 2, var4[1] - 3, var4[2], var4[3] + 6);
            } else {
               var0.drawString(var1.bf[2].p, var4[0], var4[1] - 3, 20);
            }

            var0.setClip(0, 0, 240, 320);
         }
      } else {
         switch(x[0]) {
            case 0:
               U = T[aa.bg][3].length;
               int var12 = 0;
               int var17 = 0;
               int var21 = U;

               for(; var12 < var21; ++var12) {
                  if (av.t.b.c(T[aa.bg][3][var12])) {
                     V[var17++] = (t)w.d.elementAt(av.t.b.d(T[aa.bg][3][var12]));
                  }
               }

               if (var1.bf[0] != null) {
                  k.b(var0, var1.bf[0].q, 11, 14, 1479075, 0, 20);
               }
               break;
            case 1:
               U = T[aa.bg][4].length;
               int var11 = 0;
               int var16 = 0;

               for(int var20 = U; var11 < var20; ++var11) {
                  if (av.t.b.c(T[aa.bg][4][var11])) {
                     V[var16++] = (t)w.c.elementAt(av.t.b.d(T[aa.bg][4][var11]));
                  }
               }

               if (var1.bf[1] != null) {
                  k.b(var0, var1.bf[1].q, 11, 14, 1479075, 0, 20);
               }
               break;
            case 2:
               U = T[aa.bg][5].length;
               int var10 = 0;
               int var15 = 0;

               for(int var19 = U; var10 < var19; ++var10) {
                  if (av.t.b.c(T[aa.bg][5][var10])) {
                     V[var15++] = (t)w.e.elementAt(av.t.b.d(T[aa.bg][5][var10]));
                  }
               }

               if (var1.bf[2] != null) {
                  k.b(var0, var1.bf[2].q, 11, 14, 1479075, 0, 20);
               }
         }

         for(int var13 = 0; var13 < 6; ++var13) {
            if (V[var13] != null && var1.b.b(V[var13])) {
               V[var13].a(k.g(11, 8 + var13));
            }
         }

         var0.setColor(65535);
         short[] var14 = k.a((short)11, (short)5);
         short[] var18 = k.a((short)11, (short)6);
         short[] var22 = k.a((short)11, (short)7);
         if (var1.bf[0] != null) {
            var0.setClip(var14[0], var14[1] - 3, var14[2], var14[3] + 6);
            if (x[0] == 0) {
               o.a(var0, var1.bf[0].p, var14[0] + 2, var14[1] - 3 + ao, var14[2], var14[3] + 6);
            } else {
               var0.drawString(var1.bf[0].p, var14[0], var14[1] - 3 + ao, 20);
            }

            var0.setClip(0, 0, 240, 320);
         }

         if (var1.bf[1] != null) {
            var0.setClip(var18[0], var18[1] - 3, var18[2], var18[3] + 6);
            if (x[0] == 1) {
               o.a(var0, var1.bf[1].p, var18[0] + 2, var18[1] - 3 + ao, var18[2], var18[3] + 6);
            } else {
               var0.drawString(var1.bf[1].p, var18[0], var18[1] - 3 + ao, 20);
            }

            var0.setClip(0, 0, 240, 320);
         }

         if (var1.bf[2] != null) {
            var0.setClip(var22[0], var22[1] - 3, var22[2], var22[3] + 6);
            if (x[0] == 2) {
               o.a(var0, var1.bf[2].p, var22[0] + 2, var22[1] - 3 + ao, var22[2], var22[3] + 6);
            } else {
               var0.drawString(var1.bf[2].p, var22[0], var22[1] - 3 + ao, 20);
            }

            var0.setClip(0, 0, 240, 320);
         }
      }

      b(var0, 11, w);
   }

   private static final void U() {
      z = o.a("num3");
      A = o.a("num4");
      G = 0;
   }

   private static final void V() {
      z = null;
      A = null;

      for(int var0 = 0; var0 < 8; ++var0) {
         if (!av.t.a.d(var0)) {
            return;
         }
      }

      if (!av.t.b.c(36)) {
         t.f[36] = 1;
         av.t.b.b(36);
         g.a("获得称号: " + t.a[0][36]);
         g.e = true;
         g.f = false;
      }
   }

   private static final void W() {
      if (!t()) {
         if (a.e(4)) {
            G -= 4;
            if (G < 0) {
               G += 8;
               return;
            }
         } else if (a.e(8)) {
            G += 4;
            if (G > 7) {
               G -= 8;
               return;
            }
         } else if (a.e(1)) {
            if (--G < 0) {
               G = 7;
               return;
            }
         } else if (a.e(2)) {
            if (++G > 7) {
               G = 0;
               return;
            }
         } else if (a.e(20480)) {
            int var0;
            if ((var0 = av.t.a.a(G, av.t.a.c(G), 17) - av.t.W[58]) > 0) {
               a("技能点不够，还需要" + var0 + "个技能点。", "确定", null, 1);
               return;
            }

            av.t.W[85] += av.t.a.a(G, av.t.a.c(G), 17);
            av.t.W[58] = Math.abs(var0);
            if (av.t.a.a((byte)G) == 1) {
               a("已到顶级！", "确定", null, 1);
               return;
            }

            a("升级成功！", "确定", null, 1);
         }
      }
   }

   private static final void p(Graphics var0) {
      k.a(var0, 4, 1);

      for(int var1 = 0; var1 < 8; ++var1) {
         if (G == var1) {
            w = 2 + var1;
            k.a(var0, 4, w);
         }

         if (z != null) {
            ay = k.g(4, 10 + var1);
         }

         o.a(var0, z, String.valueOf(av.t.a.c(var1)), ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 10);
      }

      ay = k.a((short)4, (short)19);
      o.a(var0, A, String.valueOf(av.t.W[58]), ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
      k.b(var0, av.t.a.a(G), 4, 18, 16777215, 0, 20);
      b(var0, 4, w);
   }

   private static void X() {
      a(2, 0);
      a(y, 3, 1);
      G = 0;
      if (W == null) {
         W = new m[14];
      }

      int var0 = 0;

      for(boolean var1 = false; var0 < 11; ++var0) {
         if (w.h(var0 + 11)) {
            W[var0] = (m)w.g.elementAt(w.g(var0 + 11));
         } else {
            W[var0] = m.a(var0 + 11);
            W[var0].k = 0;
         }
      }

      for(int var2 = 0; var2 < 10; ++var2) {
         if (ai.f[var2] < 99) {
            g.d(var2);
            i[0] = g.b();
            return;
         }
      }
   }

   private static void Y() {
      a(x);
      a(y);
      W = null;
   }

   private static void Z() {
      if (ap && l) {
         ap = false;
         if (m == 1) {
            if (x[0] == 0) {
               l = false;
            } else {
               ai.a(i[y[0] + 1], (byte)0, 1);
               i[y[0] + 1] = 0;
               --j;
               l = false;
            }
         } else {
            if (m == 2) {
               l = false;
            }
         }
      } else {
         if (ak) {
            if (a.e(8192)) {
               ak = false;
               return;
            }
         } else if (a.e(20480)) {
            if (x[0] == 0 && y[0] == 0) {
               a("主线任务不能放弃", "确定", null, 1);
               ap = true;
               return;
            }

            if (x[0] == 1 && i[y[0] + 1] != 0) {
               a("放弃该任务？", "确定", "取消", 1);
               ap = true;
               return;
            }
         } else {
            t();
            n();
            b(y);
         }
      }
   }

   private static void q(Graphics var0) {
      k.a(var0, 13, 1);

      for(int var1 = 0; var1 < 3; ++var1) {
         if (y[0] == var1) {
            w = 2 + var1;
            k.a(var0, 13, w);
         }
      }

      if (x[0] == 0) {
         if (ai.f[i[0]] != 0) {
            switch(g.c(i[0]).a) {
               case 0:
                  k.c(var0, 13, 12);
                  break;
               case 99:
               case 100:
                  k.a(var0, 13, 9);
                  break;
               default:
                  k.b(var0, 13, 12);
            }

            ay = k.a((short)13, (short)5);
            var0.setColor(16764672);
            var0.setClip(ay[0] + 2, ay[1] - 3, ay[2], ay[3] + 6);
            if (y[0] == 0) {
               int var10002 = ay[0] + 2;
               int var10003 = ay[1] - 2;
               short var10004 = ay[2];
               short var10005 = ay[3];
               o.a(var0, g.c(i[0]).c, var10002, var10003, var10004, var10005 + 6);
            } else {
               int var4 = ay[0] + 2;
               var0.drawString(g.c(i[0]).c, var4, ay[1] - 2, 20);
            }

            if (y[0] == 0) {
               k.b(var0, g.c(i[0]).d, 13, 8, 1479075, 0, 17);
            }
         }
      } else {
         for(int var2 = 0; var2 < 3; ++var2) {
            if (i[var2 + 1] != 0) {
               switch(g.c(i[var2 + 1]).a) {
                  case 0:
                     k.c(var0, 13, 12 + var2);
                     break;
                  case 99:
                  case 100:
                     k.a(var0, 13, 9 + var2);
                     break;
                  default:
                     k.b(var0, 13, 12 + var2);
               }

               ay = k.g(13, 5 + var2);
               var0.setColor(16764672);
               var0.setClip(ay[0] + 2, ay[1] - 3, ay[2], ay[3] + 6);
               if (y[0] == var2) {
                  int var5 = ay[0] + 2;
                  int var7 = ay[1] - 2;
                  short var8 = ay[2];
                  short var9 = ay[3];
                  o.a(var0, g.c(i[var2 + 1]).c, var5, var7, var8, var9 + 6);
               } else {
                  int var6 = ay[0] + 2;
                  var0.drawString(g.c(i[var2 + 1]).c, var6, ay[1] - 2, 20);
               }

               if (i[y[0] + 1] != 0) {
                  k.b(var0, g.c(i[y[0] + 1]).d, 13, 8, 1479075, 0, 17);
               }
            }
         }
      }

      b(var0, 13, w);
      var0.setClip(0, 0, 240, 320);

      for(int var3 = 0; var3 < 2; ++var3) {
         if (x[0] == var3) {
            k.a(var0, 13, 15 + var3);
         }
      }
   }

   private static void aa() {
      boolean var0 = false;
      a(18, 1);
      if (V == null) {
         V = new t[18];
      }

      int var1 = 0;

      for(boolean var2 = false; var1 < 18; ++var1) {
         if (av.t.b.c(var1 + 19)) {
            V[var1] = (t)w.f.elementAt(av.t.b.d(var1 + 19));
         }

         if (V[var1] == null) {
            V[var1] = t.a(aa.bg, var1 + 19);
         }
      }

      a(3, 18, 1);
      G = 0;
   }

   private static void ab() {
      V = null;
      a(x);
      i();
   }

   private static void ac() {
      aa var0 = av.t;
      if (aq && l) {
         aq = false;
         if (ar) {
            ar = false;
            l = false;
         } else {
            if (m == 1) {
               var0.a(V[G]);
            } else if (m == 2) {
               l = false;
            }

            l = false;
         }
      } else if (!t()) {
         if (a.e(20480)) {
            if (V[G] != null && var0.b.b(V[G])) {
               a("是否装备", "确定", "取消", 1);
               aq = true;
               ar = false;
            } else {
               a("尚未获得此称号", "确定", null, 1);
               aq = true;
               ar = true;
            }
         } else {
            n();
            j();
            G = x[0];
         }
      }
   }

   private static void r(Graphics var0) {
      aa var1 = av.t;
      k.a(var0, 14, 1);
      ay = k.a((short)14, (short)5);
      ay[1] = (short)(ay[1] + 3);
      ay[3] = (short)((O + P) * (ay[3] / R) * 2);
      k.a(var0, 14, 6, ay);

      for(int var2 = 0; var2 < 3; ++var2) {
         if (P == var2) {
            w = 2 + var2;
            ay = k.g(14, w);
            var0.setColor(16764672);
            var0.drawRect(ay[0], ay[1], ay[2], ay[3]);
         }

         ay = k.g(14, 2 + var2);
         ay[1] = (short)(ay[1] - 3);
         if (V[O + var2].m == 0) {
            var0.setColor(16777215);
            var0.drawString("未获得", ay[0] + 5, ay[1] + 3, 20);
         } else if (var1.bf[3] == V[O + var2]) {
            var0.setColor(16764672);
            var0.drawString(V[O + var2].p + "(装)", ay[0] + 5, ay[1] + 3, 20);
         } else {
            var0.setColor(16764672);
            var0.drawString(V[O + var2].p, ay[0] + 5, ay[1] + 3, 20);
         }
      }

      var0.setColor(16777215);
      if (V[G].m == 0 && V[G].j == 30) {
         k.b(var0, t.d[V[G].j - 19] + "& 当前完成" + t.h[0] + "/150", 14, 7, 16777215, 0, 20);
      } else {
         k.b(var0, t.d[V[G].j - 19], 14, 7, 16777215, 0, 20);
      }

      ay = k.a((short)14, (short)8);
      if (V[G].m == 0) {
         var0.setColor(16777215);
         var0.drawString("未知", ay[0] + 5, ay[1], 20);
      } else {
         o.a(var0, V[G].q, ay[0] + 2, ay[1] - 3, ay[2], ay[3] + 3);
      }

      b(var0, 14, w);
   }

   public static final void a(byte[] var0, int var1, int var2) {
      a.a();
      var0[0] = 0;
      var0[1] = (byte)var1;
      var0[2] = (byte)var2;
   }

   public static final void a(int var0, int var1) {
      a(x, var0, var1);
   }

   public static final void a(byte[] var0) {
      var0[0] = 0;
   }

   public static final int b(byte[] var0) {
      byte var1 = -3;
      if (var0[2] == 0 && a.e(4) || var0[2] == 1 && a.e(1)) {
         var0[0] = (byte)(--var0[0] < 0 ? var0[1] - 1 : var0[0]);
         if (var0[2] == 0) {
            var1 = -7;
         }

         if (var0[2] == 1) {
            var1 = -4;
         }
      }

      if (var0[2] == 0 && a.e(8) || var0[2] == 1 && a.e(2)) {
         var0[0] = ++var0[0] > var0[1] - 1 ? 0 : var0[0];
         if (var0[2] == 0) {
            var1 = -6;
         }

         if (var0[2] == 1) {
            var1 = -5;
         }
      }

      if (var0[2] == 0 && a.e(1) || var0[2] == 1 && a.e(4)) {
         if (var0[2] == 0) {
            var1 = -4;
         }

         if (var0[2] == 1) {
            var1 = -7;
         }
      }

      if (var0[2] == 0 && a.e(2) || var0[2] == 1 && a.e(8)) {
         if (var0[2] == 0) {
            var1 = -5;
         }

         if (var0[2] == 1) {
            var1 = -6;
         }
      }

      if (a.e(20480)) {
         var1 = -1;
      } else if (a.e(8192) || a.e(32768)) {
         var1 = -2;
      }

      return var1;
   }

   public static final int n() {
      return b(x);
   }

   public static final void a(String var0, String var1, String var2, int var3) {
      a.a();
      at = var0;
      au = var1;
      av = var2;
      m = 0;
      k = true;
      l = false;
      n = var3;
      as = 0;
   }

   public static final void d(Graphics var0) {
      switch(n) {
         case 0:
            o.a(var0, at, 120, 150, 17, 15975757, 3289650);
            return;
         default:
            a(var0, at, au, av);
      }
   }

   public static final void o() {
      if (n == 0 && as++ > 15) {
         m = 3;
         k = false;
      }

      if (a.e(20480) && au != null && au != "") {
         m = 1;
         k = false;
         l = true;
         a.a();
      } else if (a.e(8192) && av != null && av != "") {
         m = 2;
         k = false;
         l = true;
         a.a();
      } else {
         if (a.e(16384) && n != 3) {
            m = 3;
            k = false;
            l = true;
            a.a();
         }
      }
   }

   public static final void a(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var0.getColor();
      var0.setColor(var5);
      var0.drawRect(var1, var2, var3, var4);
      var0.setColor(var6);
   }

   public static final void p() {
      p = false;
      q = false;
      aF = 0;
      av.m();
   }

   public static final void q() {
      if (p) {
         if (m > 0) {
            p = false;
         }
      } else if (q) {
         if (m > 0) {
            q = false;
         }
      } else if (a.e(20480)) {
         if (av.as[aF]) {
            if (!av.b("DNFP_RMS_GAME", aF + 1)) {
               q = true;
               a("存档读取错误！", "确认", null, 1);
            } else {
               b();
               av.b(av.H);
            }
         } else {
            b();
            av.a((byte)2);
            p = true;
         }

         a.a();
      } else if (a.e(8192)) {
         b();
         av.a((byte)2);
         a.a();
      } else if (a.e(8)) {
         aF = 1;
         a.a();
      } else {
         if (a.e(4)) {
            aF = 0;
            a.a();
         }
      }
   }

   public static final void e(Graphics var0) {
      a(var0, "是否读取存档？");
   }

   public static final void a(Graphics var0, int var1, int var2) {
      byte var3 = 0;
      byte var4 = 1;
      var3 = 1;
      boolean var5 = false;
      if (var1 == 131584 || var1 == 131585) {
         var3 = 2;
         ay = k.a((short)1, (short)2);
         az = k.a((short)1, (short)4);
      } else if (var1 == 131587) {
         var4 = 3;
         var3 = 2;
         ay = k.a((short)3, (short)2);
      } else if (var1 == 131586) {
         var3 = 1;
         ay = k.a((short)1, (short)1);
      }

      k.a(var0, var4, var3);
      if (var2 >= 0) {
         a(var0, (byte)1, var2, az[0] + (az[2] >> 1), az[1] + az[3], false);
      }
   }

   public static final void b(Graphics var0, int var1) {
      a(var0, var1, -1);
   }

   public static final void a(DataInputStream var0) throws Exception {
      r = var0.readShort();
      s = var0.readShort();
      t = var0.readShort();
      u = var0.readShort();
   }

   public static final boolean a(Graphics var0, byte var1, int var2, int var3, int var4, boolean var5) {
      if (var2 == -1) {
         return true;
      } else {
         short var6 = -1;
         switch(var1) {
            case 0:
               var6 = r;
               break;
            case 1:
               var6 = s;
               break;
            case 2:
               var6 = t;
               break;
            case 3:
               var6 = u;
               break;
            case 4:
               var6 = -1;
               break;
            case 5:
               var6 = -1;
         }

         if (var6 >= 0 && var6 <= l.e.length) {
            i var7;
            if ((var7 = l.e[var6]) == null) {
               System.out
                  .println(
                     ">>drawPublicFrame(): Cant paint! maybe you don't set \"Pack Anim?\" to \"No\"!! Or you dont select this animation into this scene! Or has error in load animation"
                  );
               return true;
            } else {
               if (aA == null) {
                  aA = new short[6][][];
               }

               short[][] var8 = (short[][])null;
               switch(var1) {
                  case 0:
                     if (aA[0] == null) {
                        aA[0] = new short[var7.b][2];
                     }

                     var8 = aA[0];
                     break;
                  case 1:
                     if (aA[1] == null) {
                        aA[1] = new short[var7.b][2];
                     }

                     var8 = aA[1];
                     break;
                  case 2:
                     if (aA[2] == null) {
                        aA[2] = new short[var7.b][2];
                     }

                     var8 = aA[2];
                     break;
                  case 3:
                     if (aA[3] == null) {
                        aA[3] = new short[var7.b][2];
                     }

                     var8 = aA[3];
                  case 4:
                  case 5:
               }

               var7.a((short)var2, var8[var2]);
               var7.a(var0, var2, var8[var2][0], var3, var4, var5);
               return var8[var2][0] == 0 && var8[var2][1] == 0;
            }
         } else {
            return true;
         }
      }
   }

   public static final void r() {
      aF = 0;
      aB = false;
      aC = false;
      aD = false;
      aE = false;
      b(1);
   }

   public static final void b(int var0) {
      av.f(var0);
   }

   public static final void s() {
      if (!k) {
         if (aE) {
            if (m > 0) {
               aE = false;
            }
         } else if (aD) {
            if (m > 0) {
               aD = false;
            }
         } else if (aB) {
            if (m != 1 && m != 3) {
               if (m == 2) {
                  aB = false;
               }
            } else if (av.a("DNFP_RMS_GAME", aF + 1)) {
               b(aF + 1);
               aB = false;
               aE = true;
               a("保存成功！", "确定", null, 1);
               b();
            } else {
               aC = true;
               a("保存时出现错误！", "确认", null, 1);
            }
         } else if (aC) {
            if (m > 0) {
               aC = false;
            }
         } else {
            if (a.e(8)) {
               aF = 1;
               a.a();
            }

            if (a.e(4)) {
               aF = 0;
               a.a();
            }

            if (a.e(20480)) {
               if (ai.e[60] == 0) {
                  if (av.a("DNFP_RMS_GAME", 1)) {
                     b(1);
                     Object var0 = null;
                     String var1 = "保存成功！";
                     a("保存成功！", "确定", null, 1);
                  } else {
                     a("保存时出现错误！", "确认", null, 1);
                  }
               }

               b();
               a.a();
            } else {
               if (a.e(8192) || a.e(32768)) {
                  b();
               }
            }
         }
      }
   }

   public static final void f(Graphics var0) {
      av.c(var0);
      if (av.as[aF]) {
         a(var0, "是否覆盖记录？");
      } else {
         a(var0, "是否保存游戏？");
      }
   }

   public static final void a(Graphics var0, String var1) {
      a(var0, var1, "是", "否");
   }

   public static final void a(Graphics var0, String var1, String var2, String var3) {
      ay = k.a((short)3, (short)2);
      var0.setClip(0, 0, 240, 320);
      o.b(var0, ay[0] + 3, ay[1] + 3, ay[2] - 6, ay[3] - 6, -585681064);
      b(var0, 131587);
      var0.setClip(0, 0, 240, 320);
      k.b(var0, var1, 3, 3, 16777215, 7424823, 17);
      int var4 = ay[1] + ay[3] - 25;
      if (var2 != null) {
         o.a(var0, var2, ay[0] + 15, var4, 20, 16777215, 7424823);
      }

      if (var3 != null) {
         o.a(var0, var3, ay[0] + ay[2] - 20, var4, 24, 16777215, 7424823);
      }
   }

   private static void b(Graphics var0, int var1, int var2) {
      ay = k.g(var1, var2);
      n.a(var0, ay[0] + ay[2] - 10, ay[1] + ay[3] - 10);
   }

   static {
      short[] var10000 = new short[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
      String[] var0 = new String[]{"买入", "卖出"};
      int[] var1 = new int[]{0, 0, 0, 0, 0, 0};
      var10000 = new short[]{0, 0, 240, 320};
      var10000 = new short[]{191, 133, 9, 9};
      var10000 = new short[]{191, 195, 9, 9};
      var10000 = new short[]{0, 270, 50, 50};
      var10000 = new short[]{190, 270, 50, 50};
      String[] var7 = new String[]{"道 具", "任务物品"};
      String[] var8 = new String[]{"使用", "快捷", "丢弃"};
      String[] var9 = new String[]{"使用", "合并", "登录", "详细", "丢弃"};
      String[] var10 = new String[]{"使用", "详细", "丢弃"};
      String[] var11 = new String[]{"使用", "合并", "详细", "丢弃"};
      String[] var12 = new String[]{"详细", "丢弃"};
   }
}
