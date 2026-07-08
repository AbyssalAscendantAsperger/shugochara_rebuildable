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
   public static final String[] b = new String[]{"Thuộc tính", "Hành trang", "Trang bị", "Kỹ năng", "Nhiệm vụ", "Danh hiệu", "Hệ thống"};
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
   private static final String[] ai = new String[]{"Âm thanh", "Lưu game", "Trợ giúp", "Menu chính"};
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

      ((a)null).a();
   }

   public static final void c() {
      ax = -1;
      a = false;
   }

   private static void c(int var0) {
      a = true;
      ((k)null).a();
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
      if (((av)null).H >= 2) {
         if (B == null) {
            B = ((o)null).a("num4");
         }

         if (C == null) {
            C = ((o)null).a("num6");
         }

         if (D == null) {
            D = ((o)null).a("hp");
         }

         if (E == null) {
            E = ((o)null).a("mp");
         }

         if (F == null) {
            F = ((o)null).a("anger");
         }

         int var2 = 0;
         ay = ((k)null).a((short)2, (short)11);
         int var3 = ((av)null).t.S();
         var2 = ay[2] * ((av)null).t.W[5] / var3;
         var0.setClip(ay[0], ay[1], var2, ay[3]);
         var0.drawImage(D, ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3);
         ay = ((k)null).a((short)2, (short)12);
         --ay[0];
         --ay[1];
         var3 = ((av)null).t.T();
         var2 = ay[2] * ((av)null).t.W[7] / var3;
         var0.setClip(ay[0], ay[1], var2, ay[3]);
         var0.drawImage(E, ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3);
         ay = ((k)null).a((short)2, (short)13);
         --ay[1];
         var3 = ((av)null).t.W[76];
         var2 = ay[2] * ((av)null).t.W[75] / var3;
         var0.setClip(ay[0], ay[1], var2, ay[3]);
         var0.drawImage(F, ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3);
         var0.setClip(0, 0, 240, 320);
         ((k)null).c(var0, 2, 7);
         if (((av)null).t.l()) {
            ((k)null).c(var0, 2, 26);
         }

         ay = ((k)null).a((short)2, (short)23);
         ay[1] = (short)(ay[1] + 2);
         ((o)null).a(var0, C, ((av)null).t.W[5] + "/" + ((av)null).t.W[6], ay[0], ay[1], 20, 1, 0, 10);
         ay = ((k)null).a((short)2, (short)24);
         ((o)null).a(var0, C, ((av)null).t.W[7] + "/" + ((av)null).t.W[8], ay[0], ay[1], 20, 1, 0, 10);
         ay = ((k)null).a((short)2, (short)25);
         ((o)null).a(var0, C, ((av)null).t.W[75] + "/" + ((av)null).t.W[76], ay[0], ay[1], 20, 1, 0, 10);
         ay = ((k)null).a((short)2, (short)10);
         --ay[0];
         ((o)null).a(var0, B, String.valueOf(((av)null).t.W[9]), ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 10);
         ay = ((k)null).a((short)2, (short)3);
         ((o)null).a(var0, ay, 1647660);
         ((k)null).a(var0, 2, 9);
         if (H == null) {
            H = new n();
         }

         for(int var4 = 0; var4 < 3; ++var4) {
            H.c = 58;
            H.d = 2;
            H.e = var4 + 2;
            ay = ((k)null).g(2, 19 + var4);
            H.b(ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1));
            if (var4 < 2) {
               ((av)null).t.a(var0, var4, ay);
            }
         }

         if (((av)null).t.a.e(2)) {
            H.c = 58;
            H.d = 2;
            H.e = 5;
            ay = ((k)null).g(2, 22);
            H.b(ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1));
            ((av)null).t.a(var0, 2, ay);
         }

         m var11 = ((w)null).h;
         if (((w)null).h != null) {
            H.c = 58;
            H.d = 2;
            H.e = 0;
            ay = ((k)null).a((short)2, (short)15);
            H.b(ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1));
            ((o)null).a(var0, B, String.valueOf(var11.k), ay[0] + ay[2] - 6, ay[1] + ay[3] - 4, 40, 1, 0, 11);
            ((av)null).t.b(var0, var11.g, ay);
         }

         m var5 = ((w)null).i;
         if (((w)null).i != null) {
            H.c = 58;
            H.d = 2;
            H.e = 1;
            ay = ((k)null).a((short)2, (short)16);
            H.b(ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1) - 1);
            ((o)null).a(var0, B, String.valueOf(var5.k), ay[0] + ay[2] - 6, ay[1] + ay[3] - 4, 40, 1, 0, 11);
            ((av)null).t.b(var0, var5.g, ay);
         }
      }

      switch(((ai)null).e[73]) {
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
      if (((a)null).e(8192)) {
         b();
         ((a)null).a();
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
      if (((av)null).H != 1) {
         ((av)null).t.a(((av)null).t.bf[0]);
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
         ((a)null).a();
      } else {
         if (var0 == -2) {
            b();
            ((a)null).a();
         }
      }
   }

   public static final void b(Graphics var0) {
      ((av)null).c(var0);
      ay = ((k)null).a((short)0, (short)1);
      var0.setClip(0, 0, 240, 320);
      ((k)null).a(var0, 0, 1);

      for(int var1 = 0; var1 < b.length; ++var1) {
         if (var1 == I) {
            ((k)null).a(var0, 0, 2 + var1);
         }
      }
   }

   public static final void h() {
      if (c) {
         System.out.println("searchTask");
         c = false;

         for(int var0 = 0; var0 < 37; ++var0) {
            if (((ai)null).f[var0] == 99) {
               ((ai)null).a(var0, (byte)100, 1);
               if (var0 < 10) {
                  i[0] = ((g)null).b();
                  i[0]++;
               } else {
                  for(int var1 = 1; var1 < 4; ++var1) {
                     if (i[var1] == var0) {
                        i[var1] = 0;
                        --j;
                     }
                  }
               }

               ((g)null).a("Trả nhiệm vụ: " + ((g)null).c(var0).c);
               ((g)null).e = true;
               ((g)null).f = true;
               if (var0 >= 11 && var0 <= 16) {
                  ((av)null).t.b.a(1000);
                  ((g)null).a("Phần thưởng: Tiền vàng x1000");
                  ((g)null).e = false;
               } else if (var0 >= 17 && var0 <= 27 && var0 != 19 && var0 != 22) {
                  if (var0 == 17 || var0 == 20) {
                     ((w)null).a(10, 1);
                     ((g)null).a("Phần thưởng: Sách kỹ năng x1");
                     ((g)null).e = false;
                  }

                  ((av)null).t.b.a(2000);
                  ((g)null).a("Phần thưởng: Tiền vàng x2000");
                  ((g)null).e = false;
               } else if (var0 >= 28 && var0 <= 34 && var0 != 32) {
                  if (var0 == 30 || var0 == 33) {
                     ((w)null).a(10, 2);
                     ((g)null).a("Phần thưởng: Sách kỹ năng x2");
                     ((g)null).e = false;
                  }

                  ((av)null).t.b.a(3000);
                  ((g)null).a("Phần thưởng: Tiền vàng x3000");
                  ((g)null).e = false;
               } else if (var0 == 35) {
                  ((av)null).t.b.a(4000);
                  ((g)null).a("Phần thưởng: Tiền vàng x4000");
                  ((g)null).e = false;
               } else if (var0 == 36) {
                  ((g)null).a("Phần thưởng: Trái tim cầu vồng x1");
                  ((g)null).e = false;
                  ((av)null).t.b.b(18);
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

            if (var4 < var5 && var4 < ((u)null).e[var3].length) {
               boolean var6 = false;

               for(int var7 = 0; var7 < ((u)null).e[var3][var4][0]; ++var7) {
                  if (((ai)null).f[((u)null).e[var3][var4][var7 + 1]] < 99) {
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

      ((ai)null).e[73] = 11;
      j = 0;

      for(int var8 = 1; var8 < 4; ++var8) {
         if (i[var8] != 0) {
            ++j;
         }
      }

      System.out.println("task_take_info" + j);
   }

   private static final void v() {
      if (i[0] == 4 && ((w)null).f(23) != null && ((ai)null).e[0] == 31 || i[0] == 6 && ((w)null).f(22) != null && ((ai)null).e[0] == 40 || i[0] == 8 && ((av)null).t.b.c(15) && ((ai)null).e[0] == 45) {
         ++((ai)null).e[0];
      }

      if (((ai)null).f[12] > 0 && ((ai)null).f[12] < 99 && ((w)null).f(11) != null && ((w)null).f(11).k >= 50) {
         ((w)null).a(11, -50);
         ((ai)null).a(12, (byte)99, 1);
      } else if (((ai)null).f[13] > 0 && ((ai)null).f[13] < 99 && ((w)null).f(12) != null && ((w)null).f(12).k >= 3) {
         ((w)null).a(20, -3);
         ((ai)null).a(13, (byte)99, 1);
      } else if (((ai)null).f[16] > 0 && ((ai)null).f[16] < 99 && ((w)null).f(13) != null && ((w)null).f(13).k >= 50) {
         ((w)null).a(15, -50);
         ((ai)null).a(16, (byte)99, 1);
      } else if (((ai)null).f[21] > 0 && ((ai)null).f[21] < 99 && ((w)null).f(18) != null && ((w)null).f(18).k >= 3) {
         ((w)null).a(18, -3);
         ((ai)null).a(21, (byte)99, 1);
      } else if (((ai)null).f[25] > 0 && ((ai)null).f[25] < 99 && ((w)null).f(13) != null && ((w)null).f(13).k >= 20) {
         ((w)null).a(13, -20);
         ((ai)null).a(25, (byte)99, 1);
      } else if (((ai)null).f[27] > 0 && ((ai)null).f[27] < 99 && ((w)null).f(17) != null && ((w)null).f(17).k >= 20) {
         ((w)null).a(17, -20);
         ((ai)null).a(27, (byte)99, 1);
      } else if (((ai)null).f[29] > 0 && ((ai)null).f[29] < 99 && ((w)null).f(19) != null && ((w)null).f(19).k >= 3) {
         ((w)null).a(19, -3);
         ((ai)null).a(29, (byte)99, 1);
      }

      a(x);
      i();
      if (!((av)null).t.b.c(28)) {
         int var0 = 0;

         for(int var1 = 11; var1 < 37; ++var1) {
            if (((ai)null).f[var1] >= 99) {
               ++var0;
            }
         }

         if (var0 >= 20) {
            ((t)null).f[28] = 1;
            ((av)null).t.b.b(28);
            ((g)null).a("Nhận danh hiệu: " + ((t)null).a[0][28]);
            ((g)null).e = true;
            ((g)null).f = false;
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
                  ((ai)null).a(L[x[0]][O + P], (byte)1, 1);
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
         ((ai)null).e[73] = 11;
      } else if (!((a)null).e(4) && !((a)null).e(8)) {
         if (((a)null).e(20480)) {
            if (L[x[0]][O + P] != 0) {
               for(int var1 = 1; var1 < 4; ++var1) {
                  if (i[var1] == L[x[0]][O + P]) {
                     a("Đã nhận nhiệm vụ này", "Đồng ý", null, 1);
                     J = true;
                     K = true;
                     return;
                  }
               }

               if (((ai)null).f[L[x[0]][O + P]] >= 99) {
                  a("Nhiệm vụ này đã hoàn thành", "Đồng ý", null, 1);
                  J = true;
                  K = true;
               } else if (j >= 3) {
                  a("Chỉ được nhận tối đa 3 nhiệm vụ phụ", "Đồng ý", null, 1);
                  J = true;
                  K = true;
               } else {
                  a("Nhận nhiệm vụ?", "Đồng ý", "Hủy", 1);
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
      ((av)null).c(var0);
      var0.setClip(0, 0, 240, 320);
      ((k)null).a(var0, 16, 1);

      for(int var1 = 0; var1 < 3; ++var1) {
         int var2 = 2 + var1;
         if (P == var1) {
            ((k)null).a(var0, 16, var2);
            w = var2;
         }

         if (L[x[0]][O + var1] < 37 && L[x[0]][O + var1] > 0) {
            switch(((ai)null).f[L[x[0]][O + var1]]) {
               case 0:
                  ((k)null).c(var0, 16, 9 + var1);
                  break;
               case 99:
               case 100:
                  ((k)null).a(var0, 16, 16 + var1);
                  break;
               default:
                  ((k)null).b(var0, 16, 9 + var1);
            }

            ay = ((k)null).g(16, 12 + var1);
            boolean var3 = true;
            if (((ai)null).f[L[x[0]][O + var1]] >= 99) {
               var0.setColor(16777215);
               var0.drawString("Đã hoàn thành", ay[0] + (ay[2] >> 1), ay[1] - 2, 17);
               var3 = false;
            }

            if (var3) {
               var0.setColor(16764672);
               var0.setClip(ay[0] + 2, ay[1] - 3, ay[2], ay[3] + 6);
               if (P == var1) {
                  int var10002 = ay[0] + 2;
                  int var10003 = ay[1] - 2;
                  short var10004 = ay[2];
                  ((o)null).a(var0, ((g)null).c(L[x[0]][O + var1]).c, var10002, var10003, var10004, ay[3] + 6);
               } else {
                  int var5 = ay[0] + 2;
                  var0.drawString(((g)null).c(L[x[0]][O + var1]).c, var5, ay[1] - 2, 20);
               }
            }

            if (L[x[0]][O + P] != 0) {
               ((k)null).b(var0, ((g)null).c(L[x[0]][O + P]).d, 16, 15, 65535, 0, 20);
            }
         }
      }

      b(var0, 16, w);
      var0.setClip(0, 0, 240, 320);

      for(int var4 = 0; var4 < 4; ++var4) {
         if (x[0] == var4) {
            ((k)null).a(var0, 16, 5 + var4);
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

      ((ai)null).e[72] = 0;
   }

   private static final void y() {
      M.h();
      N.h();
   }

   private static final void z() {
      if (((a)null).e(2)) {
         if (++((ai)null).e[72] > 3) {
            ((ai)null).e[72] = 0;
            return;
         }
      } else if (((a)null).e(1)) {
         if (--((ai)null).e[72] < 0) {
            ((ai)null).e[72] = 3;
            return;
         }
      } else if (((a)null).e(20480)) {
         b();
      }
   }

   private static final void h(Graphics var0) {
      boolean var1 = false;
      var0.setColor(65535);
      ((o)null).a(var0, "Chọn độ khó game:", 120, 115, 33, 16755828, 9766440);
      if (M != null) {
         M.c = 60;
         M.d = 2;
         M.b(120, 150);
      }

      if (N != null) {
         N.c = 60;
         N.d = 1;
         N.e = ((ai)null).e[72];
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
      z = ((o)null).a("num4");
      if (d != 2) {
         if (V == null) {
            V = new t[T[((aa)null).bg][d].length];
         }

         U = T[((aa)null).bg][d].length;
         int var0 = 0;

         for(int var1 = U; var0 < var1; ++var0) {
            V[var0] = ((t)null).a(((aa)null).bg, T[((aa)null).bg][d][var0]);
         }
      } else {
         if (W == null) {
            W = new m[T[((aa)null).bg][d].length];
         }

         U = T[((aa)null).bg][d].length;
         int var2 = 0;

         for(int var3 = U; var2 < var3; ++var2) {
            W[var2] = ((m)null).a(T[((aa)null).bg][d][var2]);
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
      if (((av)null).t.b.c(5) && ((t)null).f[34] == 0) {
         ((t)null).f[34] = 1;
         ((av)null).t.b.b(34);
         ((g)null).a("Nhận danh hiệu: " + ((t)null).a[0][34]);
         ((g)null).e = true;
         ((g)null).f = false;
      }

      if (d != 2) {
         ((t)null).a();
         int var2 = 0;

         for(int var3 = V.length; var2 < var3; ++var2) {
            V[var2] = null;
         }

         V = null;
      } else {
         ((m)null).b();
         int var0 = 0;

         for(int var1 = W.length; var0 < var1; ++var0) {
            W[var0] = null;
         }

         W = null;
      }
   }

   private static final void C() {
      aa var0 = ((av)null).t;
      if (X && l) {
         X = false;
         if (m == 1) {
            switch(d) {
               case 0:
               case 1:
                  var0.b.b(T[((aa)null).bg][d][G]);
                  var0.W[12] -= V[G].b();
                  break;
               case 2:
                  ((w)null).a(T[((aa)null).bg][d][G], 1);
                  var0.W[12] -= W[G].a();
            }
         }

         l = false;
      } else {
         if (t()) {
            if (((av)null).H == 2) {
               switch(d) {
                  case 0:
                     ((ai)null).e[73] = 22;
                     break;
                  case 1:
                     ((ai)null).e[73] = 33;
                     break;
                  case 2:
                     ((ai)null).e[73] = 44;
               }

               return;
            }
         } else {
            if (((a)null).e(20480)) {
               switch(d) {
                  case 0:
                  case 1:
                     if (var0.W[12] >= V[G].b() && !var0.b.b(V[G])) {
                        a("Xác nhận mua", "Đồng ý", "Hủy", 1);
                        X = true;
                     } else if (var0.b.b(V[G])) {
                        a("Đã hết hàng", "Đồng ý", null, 1);
                     } else {
                        a("Không đủ tiền", "Đồng ý", null, 1);
                     }
                     break;
                  case 2:
                     if (var0.W[12] >= W[G].a()) {
                        a("Xác nhận mua", "Đồng ý", "Hủy", 1);
                        X = true;
                     } else {
                        a("Không đủ tiền", "Đồng ý", null, 1);
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
      aa var1 = ((av)null).t;
      ((k)null).a(var0, 15, 1);
      ay = ((k)null).a((short)15, (short)17);
      ay[1] = (short)(ay[1] + 9);
      ay[3] = (short)((O + P) * (ay[3] / R) * 2);
      ((k)null).a(var0, 15, 18, ay);

      for(int var2 = 0; var2 < 4; ++var2) {
         if (P == var2) {
            w = 5 + var2;
            ((k)null).a(var0, 15, w);
         }
      }

      if (d != 2) {
         int var5 = 0;

         for(int var3 = V.length; var5 < var3 && var5 < 4; ++var5) {
            V[var5 + O].a(((k)null).g(15, 5 + var5));
            var0.setColor(65535);
            short[] var4 = ((k)null).g(15, 9 + var5);
            var0.setClip(var4[0], var4[1] - 3, var4[2], var4[3] + 3);
            if (var1.b.b(V[var5 + O])) {
               if (var5 + O == G) {
                  ((o)null).a(var0, "Đã bán hết", var4[0] + 2, var4[1] - 2, var4[2], var4[3] + 3);
               } else {
                  var0.drawString("Đã bán hết", var4[0] + (var4[2] >> 1), var4[1] - 2, 17);
               }
            } else if (var5 + O == G) {
               ((o)null).a(var0, V[var5 + O].p, var4[0] + 2, var4[1] - 2, var4[2], var4[3] + 3);
            } else {
               var0.drawString(V[var5 + O].p, var4[0] + (var4[2] >> 1), var4[1] - 2, 17);
            }

            var0.setClip(0, 0, 240, 320);
            ay = ((k)null).g(15, 13 + var5);
            ((o)null).a(var0, z, V[var5 + O].b() + "", ay[0] + (ay[2] >> 1) - 3, ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
         }
      } else {
         int var6 = 0;

         for(int var7 = W.length; var6 < var7 && var6 < 4; ++var6) {
            W[var6 + O].a(((k)null).g(15, 5 + var6));
            var0.setColor(65535);
            short[] var8 = ((k)null).g(15, 9 + var6);
            var0.setClip(var8[0], var8[1] - 3, var8[2], var8[3] + 3);
            if (var6 + O == G) {
               ((o)null).a(var0, W[var6 + O].i, var8[0] + 2, var8[1] - 2, var8[2], var8[3] + 3);
            } else {
               var0.drawString(W[var6 + O].i, var8[0] + (var8[2] >> 1), var8[1] - 2, 17);
            }

            var0.setClip(0, 0, 240, 320);
            ay = ((k)null).g(15, 13 + var6);
            ((o)null).a(var0, z, W[var6 + O].a() + "", ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
         }
      }

      switch(d) {
         case 0:
            ((k)null).a(var0, 15, 3);
            break;
         case 1:
            ((k)null).a(var0, 15, 4);
            break;
         case 2:
            ((k)null).a(var0, 15, 2);
      }

      if (d != 2) {
         ((k)null).b(var0, V[G].q, 15, 19, 1479075, 0, 20);
      } else {
         ((k)null).b(var0, W[G].j, 15, 19, 1479075, 0, 20);
      }

      b(var0, 15, w);
      if (z != null) {
         ay = ((k)null).a((short)5, (short)21);
         ((o)null).a(var0, z, String.valueOf(var1.W[12]), ay[0] + (ay[2] >> 1) - 5, ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
      }
   }

   private static final void D() {
      Y = false;
      ab = ((av)null).t();
      aa = 0;
      int var5 = ((av)null).t.W[5];
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
      switch(((ai)null).e[72]) {
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
      z = ((o)null).a("num7");
      A = ((o)null).a("num3");
      e = 0;
      ac = 0;
      ae = false;
   }

   private static final void E() {
      z = null;
      A = null;
      Y = false;
      if (!((av)null).t.b.c(26) && ac == 4) {
         ((t)null).f[26] = 1;
         ((av)null).t.b.b(26);
         ((g)null).a("Nhận danh hiệu: " + ((t)null).a[0][26]);
         ((g)null).e = true;
         ((g)null).f = false;
      }
   }

   private static final void F() {
      Object var0 = null;
      if (Y && !ae) {
         if (((a)null).c()) {
            ((ai)null).e[10] = 100;
            b();
            ((a)null).a();
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
      ((av)null).c(var0);
      Object var1 = null;
      if (e <= 30) {
         ((k)null).a(var0, 19, 1);
         if (z != null) {
            ay = ((k)null).a((short)19, (short)2);
            ((o)null).a(
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
            ay = ((k)null).a((short)19, (short)3);
            ((o)null).a(var0, z, ab[1] + "", ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
            ay = ((k)null).a((short)19, (short)4);
            ((o)null).a(var0, z, ab[2] + "", ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
            ay = ((k)null).a((short)19, (short)5);
            ((o)null).a(var0, z, ab[3] + "", ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
            ay = ((k)null).a((short)19, (short)6);
            ((o)null).a(var0, z, ab[4] + "", ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
            ay = ((k)null).a((short)19, (short)7);
            ((o)null).a(var0, z, ab[6] + "", ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
            ay = ((k)null).a((short)19, (short)8);
            ((o)null).a(var0, z, ab[5] + "", ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
         }

         if (A != null) {
            ay = ((k)null).a((short)19, (short)9);
            ((o)null).a(var0, A, aa + "", ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 10);
         }

         if (aa == Z) {
            ay = ((k)null).a((short)19, (short)10);
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

            ((k)null).b(var0, 19, 14 - ac, ay, -1, -1, -1, -1);
            return;
         }
      } else {
         ((k)null).a(var0, 20, 1);
         ((k)null).b(var0, "Điểm đánh giá càng cao, phần thưởng ngẫu nhiên càng tốt", 20, 3, 15513698, 0, 20);
         if (e < 60) {
            ad = ((o)null).b(0, 25);
         } else if (!Y) {
            int var2 = ((o)null).b(0, 100);
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
            ay = ((k)null).a((short)20, (short)2);
            var0.setColor(26550);
            var0.fillRect(ay[0] + 3, ay[1] + 3, ay[2] - 6, ay[3] - 6);
            H.b(ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1));
            if (af > 1) {
               ((o)null).a(var0, B, String.valueOf(af), ay[0] + ay[2] - 6, ay[1] + ay[3] - 4, 40, 1, 0, 11);
            }
         }

         if (Y) {
            var0.setColor(15513698);
            ay = ((k)null).a((short)20, (short)4);
            ((o)null).a(var0, "Nhận được: " + ((m)null).a[ad] + " x " + af, ay[0] + 2, ay[1] + (ay[3] >> 2), ay[2], ay[3] + 3);
            if (ae) {
               ((w)null).a(ad, af);
               ae = false;
            }
         }
      }
   }

   private static final void G() {
      z = ((o)null).a("num4");
      f = 0;
      if (V == null) {
         V = new t[19];
      }

      Enumeration var0 = ((w)null).d.elements();

      while(var0.hasMoreElements()) {
         V[f++] = (t)var0.nextElement();
      }

      var0 = ((w)null).c.elements();

      while(var0.hasMoreElements()) {
         V[f++] = (t)var0.nextElement();
      }

      var0 = ((w)null).e.elements();

      while(var0.hasMoreElements()) {
         V[f++] = (t)var0.nextElement();
      }

      if (W == null) {
         W = new m[14];
      }

      int var4 = 0;

      for(boolean var1 = false; var4 < 14; ++var4) {
         if (((w)null).h(var4 + 11)) {
            W[var4] = (m)((w)null).g.elementAt(((w)null).g(var4 + 11));
         } else {
            W[var4] = ((m)null).a(11 + var4);
            W[var4].k = 0;
         }
      }

      a(f + 3, 1);
      a(3, f + 3, 1);
      G = 0;
   }

   private static final void H() {
      Object var0 = null;
      if (i[0] == 4 && ((w)null).f(22) != null && ((ai)null).e[0] == 24 || i[0] == 6 && ((w)null).f(23) != null && ((ai)null).e[0] == 40 || i[0] == 8 && ((w)null).f(24) != null && ((ai)null).e[0] == 45) {
         ++((ai)null).e[0];
      }

      z = null;
      ((t)null).a();
      int var1 = 0;

      for(int var2 = V.length; var1 < var2; ++var1) {
         V[var1] = null;
      }

      V = null;
      ((m)null).b();
      var1 = 0;

      for(int var4 = W.length; var1 < var4; ++var1) {
         W[var1] = null;
      }

      W = null;
      a(x);
      i();
   }

   private static final void I() {
      aa var0 = ((av)null).t;
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
                     ((w)null).a(W[11].g, 1);
                     ((w)null).a(W[1], -20);
                     ((w)null).a(W[2], -20);
                     ((w)null).a(W[3], -20);
                     ((w)null).a(W[7], -2);
                     var0.b.a(-2000);
                     break;
                  case 1:
                     ((w)null).a(W[12].g, 1);
                     ((w)null).a(W[8], -5);
                     ((w)null).a(W[5], -4);
                     ((w)null).a(W[6], -3);
                     var0.b.a(-1000);
                     break;
                  case 2:
                     ((w)null).a(W[13].g, 1);
                     ((w)null).a(W[1], -5);
                     ((w)null).a(W[6], -5);
                     ((w)null).a(W[9], -50);
                     var0.b.a(-5000);
               }
            } else {
               if (V[G].m == 1) {
                  for(int var6 = 0; var6 < 10; ++var6) {
                     if (V[G].var_o[13 + var6] > 0) {
                        ((w)null).a(W[var6].g, -V[G].var_o[13 + var6]);
                     }
                  }
               } else if (V[G].m == 2) {
                  for(int var5 = 0; var5 < 10; ++var5) {
                     if (V[G].var_o[13 + var5] > 0) {
                        ((w)null).a(W[var5].g, -V[G].var_o[23 + var5]);
                     }
                  }
               }

               var0.W[12] -= V[G].var_o[4];
               V[G].d();
            }
         }

         l = false;
      } else if (t()) {
         ((ai)null).e[73] = 55;
      } else if (!((a)null).e(20480)) {
         n();
         j();
         G = x[0];
      } else {
         if (G >= f) {
            if (((w)null).f(W[G - f + 11].g) != null) {
               a("Đã chế tạo", "Đồng ý", null, 1);
               ag = true;
               ah = true;
            }

            switch(G - f) {
               case 0:
                  if (W[1].k >= 20 && W[2].k >= 20 && W[3].k >= 20 && W[7].k >= 2) {
                     if (var0.W[12] < 2000) {
                        a("Không đủ tiền", "Đồng ý", null, 1);
                        ag = true;
                        ah = true;
                     } else {
                        a("Chế tạo thành công!", "Đồng ý", null, 1);
                        ag = false;
                        ah = true;
                     }
                  } else {
                     a("Không đủ nguyên liệu", "Đồng ý", null, 1);
                     ag = true;
                     ah = true;
                  }
                  break;
               case 1:
                  if (W[8].k >= 5 && W[5].k >= 4 && W[6].k >= 3) {
                     if (var0.W[12] < 1000) {
                        a("Không đủ tiền", "Đồng ý", null, 1);
                        ag = true;
                        ah = true;
                     } else {
                        a("Chế tạo thành công!", "Đồng ý", null, 1);
                        ag = false;
                        ah = true;
                        ((ai)null).f[6] = 99;
                        ((ai)null).f[4] = 100;
                        ((ai)null).f[5] = 100;
                        ((ai)null).e[0] = 30;
                     }
                  } else {
                     a("Không đủ nguyên liệu", "Đồng ý", null, 1);
                     ag = true;
                     ah = true;
                  }
                  break;
               case 2:
                  if (W[1].k >= 5 && W[6].k >= 5 && W[9].k >= 50) {
                     if (var0.W[12] < 5000) {
                        a("Không đủ tiền", "Đồng ý", null, 1);
                        ag = true;
                        ah = true;
                     } else {
                        a("Chế tạo thành công!", "Đồng ý", null, 1);
                        ag = false;
                        ah = true;
                     }
                  } else {
                     a("Không đủ nguyên liệu", "Đồng ý", null, 1);
                     ag = true;
                     ah = true;
                  }
            }
         } else if (V[G].c()) {
            if (V[G].m == 1) {
               for(int var3 = 0; var3 < 10; ++var3) {
                  if (V[G].var_o[13 + var3] > W[var3].k) {
                     a("Không đủ nguyên liệu", "Đồng ý", null, 1);
                     ag = true;
                     ah = true;
                     return;
                  }
               }
            } else if (V[G].m == 2) {
               for(int var1 = 0; var1 < 10; ++var1) {
                  if (V[G].var_o[23 + var1] > W[var1].k) {
                     a("Không đủ nguyên liệu", "Đồng ý", null, 1);
                     ag = true;
                     ah = true;
                     return;
                  }
               }
            }

            if (var0.W[12] < V[G].var_o[4]) {
               a("Không đủ tiền", "Đồng ý", null, 1);
               ag = true;
               ah = true;
               return;
            }

            a("Nâng cấp thành công!", "Đồng ý", null, 1);
            ag = false;
            ah = true;
         } else {
            a("Đã đạt cấp tối đa", "Đồng ý", null, 1);
            ag = true;
            ah = true;
         }

         int var4 = 0;

         for(boolean var2 = false; var4 < 11; ++var4) {
            if (((w)null).f(W[var4].g) != null) {
               W[var4].k = ((w)null).f(W[var4].g).k;
            } else {
               W[var4].k = 0;
            }
         }
      }
   }

   private static final void k(Graphics var0) {
      aa var1 = ((av)null).t;
      ((k)null).a(var0, 18, 1);
      ay = ((k)null).a((short)18, (short)23);
      ay[1] = (short)(ay[1] + 13);
      ay[3] = (short)((O + P - 1) * (ay[3] / R) * 2);
      ((k)null).a(var0, 18, 24, ay);

      for(int var2 = 0; var2 < 3; ++var2) {
         if (P == var2) {
            w = 2 + var2;
            ((k)null).a(var0, 18, w);
         }

         if (O + var2 < f) {
            V[var2 + O].a(((k)null).g(18, 2 + var2));
            if (V[var2 + O].m == 0) {
               ay = ((k)null).g(18, 5 + var2 * 2);
               ((o)null).a(var0, z, String.valueOf(V[var2 + O].m + 1), ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
               ay = ((k)null).g(18, 5 + var2 * 2 + 1);
               ((o)null).a(var0, z, String.valueOf(V[var2 + O].m + 1), ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
            } else if (V[var2 + O].m == 3) {
               ay = ((k)null).g(18, 5 + var2 * 2);
               ((o)null).a(var0, z, String.valueOf(V[var2 + O].m), ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
               ay = ((k)null).g(18, 5 + var2 * 2 + 1);
               ((o)null).a(var0, z, String.valueOf(V[var2 + O].m), ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
            } else {
               ay = ((k)null).g(18, 5 + var2 * 2);
               ((o)null).a(var0, z, String.valueOf(V[var2 + O].m), ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
               ay = ((k)null).g(18, 5 + var2 * 2 + 1);
               ((o)null).a(var0, z, String.valueOf(V[var2 + O].m + 1), ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
            }
         } else {
            W[O + var2 - f + 11].a(((k)null).g(18, 2 + var2));
            ay = ((k)null).g(18, 5 + var2 * 2);
            ((o)null).a(var0, z, String.valueOf(1), ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
            ay = ((k)null).g(18, 5 + var2 * 2 + 1);
            ((o)null).a(var0, z, String.valueOf(1), ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
         }
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         ay = ((k)null).g(18, 12 + var3);
         ((o)null).a(var0, z, W[var3].k + "", ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
      }

      if (G >= f) {
         ((k)null).b(var0, ((m)null).c[G - f], 18, 11, 1479075, 0, 20);
      } else if (V[G].m < 3) {
         ((k)null).b(var0, ((t)null).c[V[G].j][V[G].m], 18, 11, 1479075, 0, 20);
      } else {
         ((k)null).b(var0, "Đã đạt cấp tối đa", 18, 11, 1479075, 0, 20);
      }

      b(var0, 18, w);
      if (z != null) {
         ay = ((k)null).a((short)5, (short)21);
         ((o)null).a(var0, z, String.valueOf(var1.W[12]), ay[0] + (ay[2] >> 1) - 5, ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
      }
   }

   public static final void k() {
      g = 260;
   }

   public static final void l() {
      g = 0;
   }

   public static final void m() {
      if (((a)null).e(8192) || ((a)null).e(32768)) {
         b();
         ((a)null).a();
      }
   }

   public static final void c(Graphics var0) {
      ((o)null).a(var0, 592136);
      a(var0, 2, 2, 234, 314, 4211247);
      var0.setColor(16777215);
      int var1;
      if ((
            var1 = ((o)null).a(
               var0,
               "<Giới Thiệu Game>&Hai mươi tư năm trước, tôi đã tạo nên huyền thoại về Colles. Tôi là ai? Trước cầu Nại Hà, kiếp trước kiếp này, 24 năm sau tôi lại kể một câu chuyện khác về Colles và Ellen trong ký ức của mình. Còn tôi, vẫn là kiếm sĩ năm ấy.&&<Hướng Dẫn Điều Khiển>&Phím Trái/Số 4:&Di chuyển trái;&Phím Phải/Số 6:&Di chuyển phải;&Phím Lên/Số 2:&Di chuyển lên;&Phím Xuống/Số 8:&Di chuyển xuống;&Nhấp đúp Trái/Số 4:&Lướt nhanh sang trái;&Nhấp đúp Phải/Số 6:&Lướt nhanh sang phải;&Nhấp đúp Lên/Số 2:&Lướt nhanh lên trên;&Nhấp đúp Xuống/Số 8:&Lướt nhanh xuống dưới;&Phím 1: Kỹ năng 1;&Phím 3: Kỹ năng 2;&Phím 5: Tấn công/Đối thoại;&Phím 7: Kỹ năng 3;&Phím 9: Kỹ năng 4 (Cần nâng cấp mới có thể dùng);&Mẹo: Phím 0 phòng thủ thành công, nhấn phím 5 tung đòn Nhất Kiếm Phá, dùng tốt có thể không tốn HP!&* Phím *: Bình máu;&Phím #: Bình ma lực;&Phím mềm trái: Đồng ý/Menu;&Phím mềm phải: Hủy/Trở về/Nhiệm vụ;&",
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

      var0.drawString("Trở về", 236, 316, 40);
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
            if (((a)null).e(20480)) {
               ((am)null).b = !((am)null).b;
               if (((am)null).b) {
                  ((am)null).b(((av)null).m);
               } else {
                  ((am)null).e();
               }

               ((a)null).a();
               return;
            }
            break;
         case 1:
            if (((a)null).e(20480)) {
               if (((av)null).H != 2 && ((av)null).H != 1) {
                  a("Khu vực này không thể lưu game.", "Đồng ý", null, 1);
               } else {
                  c();
                  a(111);
               }

               ((a)null).a();
               return;
            }
            break;
         case 2:
            if (((a)null).e(20480)) {
               ((ad)null).a((short)1);
               return;
            }
            break;
         case 3:
            if (aj && l) {
               aj = false;
               l = false;
               if (m == 1 || m == 3) {
                  ((av)null).a((byte)2);
                  c();
               }

               return;
            }

            if (((a)null).e(20480)) {
               a("Trở về menu chính?", "Đồng ý", "Hủy", 1);
               aj = true;
            }
      }
   }

   private static final void l(Graphics var0) {
      ((av)null).c(var0);
      var0.setClip(0, 0, 240, 320);
      ((k)null).a(var0, 6, 1);

      for(int var1 = 0; var1 < 4; ++var1) {
         if (x[0] == var1) {
            if (var1 == 0) {
               if (((am)null).b) {
                  ((k)null).c(var0, 6, 2);
               } else {
                  ((k)null).b(var0, 6, 2);
               }
            } else {
               ((k)null).a(var0, 6, 2 + var1);
            }
         }
      }
   }

   private static final void L() {
      z = ((o)null).a("num4");
   }

   private static final void M() {
      z = null;
   }

   private static final void N() {
      t();
   }

   private static final void m(Graphics var0) {
      ((k)null).a(var0, 10, 1);
      aa var1 = ((av)null).t;
      var0.setColor(255);
      ay = ((k)null).a((short)10, (short)2);
      if (var1.bf[3] == null) {
         var0.drawString("Tân thủ", ay[0] + (ay[2] >> 1), ay[1] + ay[3] + 2, 33);
      } else {
         var0.drawString(var1.bf[3].p, ay[0] + (ay[2] >> 1), ay[1] + ay[3], 33);
      }

      for(int var2 = 0; var2 < 9; ++var2) {
         ay = ((k)null).g(10, 3 + var2);
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
            ((o)null).a(var0, z, var3, ay[0], ay[1], 6, 1, 0, 11);
         }
      }
   }

   private static void O() {
      Object var0 = null;
      a(3, 1);
      ak = false;
      z = ((o)null).a("num4");
      A = ((o)null).a("num2");
      w = 3;
      if (W == null) {
         W = new m[11];
      }

      int var1 = 0;
      int var2 = 0;

      for(boolean var3 = false; var1 < 11; ++var1) {
         if (((w)null).h(var1)) {
            W[var2++] = (m)((w)null).g.elementAt(((w)null).g(var1));
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
      aa var0 = ((av)null).t;
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
                  ((w)null).i(W[G].g);
                  W = null;
                  W = new m[11];
                  int var1 = 0;
                  int var2 = 0;

                  for(boolean var3 = false; var1 < 11; ++var1) {
                     if (((w)null).h(var1)) {
                        W[var2++] = (m)((w)null).g.elementAt(((w)null).g(var1));
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
            if (((a)null).e(8192)) {
               ak = false;
               G = 0;
               return;
            }

            if (((a)null).e(20480)) {
               if (x[0] == 0 && W[G] != null) {
                  switch(W[G].g) {
                     case 0:
                     case 1:
                     case 3:
                        if (var0.C(G) > 0) {
                           a("Vật phẩm chưa sẵn sàng", "Đồng ý", null, 1);
                           break;
                        }
                     case 4:
                     case 5:
                     case 7:
                     case 9:
                     case 10:
                        a("Sử dụng?", "Đồng ý", "Hủy", 1);
                     case 2:
                     default:
                        break;
                     case 6:
                     case 8:
                        a("Vui lòng dùng tại giao diện thú cưng", "Đồng ý", null, 1);
                  }

                  al = true;
                  return;
               }
            } else if (((a)null).e(4)) {
               if (--G < 0) {
                  G = 11;
                  return;
               }
            } else if (((a)null).e(8)) {
               if (++G > 11) {
                  G = 0;
                  return;
               }
            } else {
               if (((a)null).e(1)) {
                  if (G < 4) {
                     G += 8;
                     return;
                  }

                  G -= 4;
                  return;
               }

               if (((a)null).e(2)) {
                  if (G >= 12) {
                     G -= 8;
                     return;
                  }

                  G += 4;
                  return;
               }
            }
         } else {
            if (((a)null).e(20480)) {
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
      ((k)null).a(var0, 5, 2);
      aa var1 = ((av)null).t;

      for(int var2 = 0; var2 < 3; ++var2) {
         if (x[0] == var2) {
            w = 3 + var2;
            ((k)null).a(var0, 5, w);
         }
      }

      if (ak) {
         if (G < W.length && W[G] != null) {
            ((k)null).b(var0, W[G].i + "&" + W[G].j, 5, 20, 16777215, 0, 20);
         }

         ((o)null).b(var0, ((k)null).a((short)5, (short)19), 1342177280);

         for(int var5 = 0; var5 < 12; ++var5) {
            if (G == var5) {
               w = 6 + var5;
               ((k)null).a(var0, 5, w);
            }
         }

         for(int var6 = 0; var6 < W.length; ++var6) {
            if (W[var6] != null) {
               ay = ((k)null).g(5, 6 + var6);
               W[var6].a(ay);
               ((o)null).a(var0, A, String.valueOf(((w)null).f(W[var6].g).k), ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1) + (ay[3] >> 2), 3, 1, 0, 11);
            }
         }
      } else {
         switch(x[0]) {
            case 0:
               int var9 = 0;
               int var12 = 0;

               for(boolean var14 = false; var9 < 11; ++var9) {
                  if (((w)null).h(var9)) {
                     W[var12++] = (m)((w)null).g.elementAt(((w)null).g(var9));
                  }
               }
               break;
            case 1:
               int var8 = 0;
               int var11 = 0;

               for(boolean var13 = false; var8 < 11; ++var8) {
                  if (((w)null).h(var8 + 11)) {
                     W[var11++] = (m)((w)null).g.elementAt(((w)null).g(var8 + 11));
                  }
               }
               break;
            case 2:
               int var7 = 0;
               int var3 = 0;

               for(boolean var4 = false; var7 < 3; ++var7) {
                  if (((w)null).h(var7 + 22)) {
                     W[var3++] = (m)((w)null).g.elementAt(((w)null).g(var7 + 22));
                  }
               }
         }

         for(int var10 = 0; var10 < W.length; ++var10) {
            if (W[var10] != null) {
               ay = ((k)null).g(5, 6 + var10);
               W[var10].a(ay);
               ((o)null).a(var0, A, String.valueOf(((w)null).f(W[var10].g).k), ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1) + (ay[3] >> 2), 3, 1, 0, 11);
            }
         }

         ((o)null).b(var0, ((k)null).a((short)5, (short)18), 1342177280);
      }

      if (z != null) {
         ay = ((k)null).a((short)5, (short)21);
         ((o)null).a(var0, z, String.valueOf(var1.W[12]), ay[0] + (ay[2] >> 1) - 5, ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
      }

      b(var0, 5, w);
   }

   private static void R() {
      a(3, 1);
      ak = false;
      z = ((o)null).a("num4");
      A = ((o)null).a("num4H");
      B = ((o)null).a("num4L");
      w = 0;
      G = 0;
      if (V == null) {
         V = new t[6];
      }

      U = 6;
      int var0 = 0;
      int var1 = 0;

      for(int var2 = U; var0 < var2; ++var0) {
         if (((av)null).t.b.c(T[((aa)null).bg][3][var0])) {
            V[var1++] = (t)((w)null).d.elementAt(((av)null).t.b.d(T[((aa)null).bg][3][var0]));
         }
      }
   }

   private static void S() {
      z = null;
      A = null;
      B = null;
      a(x);
      ((t)null).a();
      int var0 = 0;

      for(int var1 = V.length; var0 < var1; ++var0) {
         V[var0] = null;
      }

      V = null;
   }

   private static void T() {
      aa var0 = ((av)null).t;
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
            if (((a)null).e(8192)) {
               ak = false;
               G = 0;
               return;
            }

            if (((a)null).e(20480)) {
               if (V[G] != null && var0.b.b(V[G])) {
                  if (V[G] != var0.bf[x[0]]) {
                     a("Trang bị?", "Đồng ý", "Hủy", 1);
                     am = true;
                     return;
                  }

                  a("Đã trang bị", "Đồng ý", null, 1);
                  an = true;
                  return;
               }
            } else if (((a)null).e(4) || ((a)null).e(1)) {
               if (--G < 0) {
                  G = 5;
                  return;
               }
            } else if ((((a)null).e(8) || ((a)null).e(2)) && ++G > 5) {
               G = 0;
               return;
            }
         } else {
            if (((a)null).e(20480)) {
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
      aa var1 = ((av)null).t;
      ((k)null).a(var0, 11, 1);

      for(int var2 = 0; var2 < 3; ++var2) {
         if (x[0] == var2) {
            w = 2 + var2;
            ((k)null).a(var0, 11, w);
         }
      }

      if (ak) {
         for(int var5 = 0; var5 < 6; ++var5) {
            if (G == var5) {
               w = 8 + var5;
               ((k)null).a(var0, 11, w);
            }
         }

         switch(x[0]) {
            case 0:
               int var8 = 0;

               for(; var8 < 6; ++var8) {
                  if (V[var8] != null && var1.b.b(V[var8])) {
                     V[var8].a(((k)null).g(11, 8 + var8));
                  }
               }

               if (V[G] != null && var1.b.b(V[G])) {
                  ((k)null).b(var0, V[G].q, 11, 14, 1479075, 0, 20);
               }
               break;
            case 1:
               for(int var7 = 0; var7 < 6; ++var7) {
                  if (V[var7] != null && var1.b.b(V[var7])) {
                     V[var7].a(((k)null).g(11, 8 + var7));
                  }
               }

               if (V[G] != null && var1.b.b(V[G])) {
                  ((k)null).b(var0, V[G].q, 11, 14, 1479075, 0, 20);
               }
               break;
            case 2:
               for(int var6 = 0; var6 < 6; ++var6) {
                  if (V[var6] != null && var1.b.b(V[var6])) {
                     V[var6].a(((k)null).g(11, 8 + var6));
                  }
               }

               if (V[G] != null && var1.b.b(V[G])) {
                  ((k)null).b(var0, V[G].q, 11, 14, 1479075, 0, 20);
               }
         }

         var0.setColor(65535);
         short[] var9 = ((k)null).a((short)11, (short)5);
         short[] var3 = ((k)null).a((short)11, (short)6);
         short[] var4 = ((k)null).a((short)11, (short)7);
         if (var1.bf[0] != null) {
            var0.setClip(var9[0], var9[1] - 3, var9[2], var9[3] + 6);
            if (x[0] == 0) {
               ((o)null).a(var0, var1.bf[0].p, var9[0] + 2, var9[1] - 3, var9[2], var9[3] + 6);
            } else {
               var0.drawString(var1.bf[0].p, var9[0], var9[1] - 3, 20);
            }

            var0.setClip(0, 0, 240, 320);
         }

         if (var1.bf[1] != null) {
            var0.setClip(var3[0], var3[1] - 3, var3[2], var3[3] + 6);
            if (x[0] == 1) {
               ((o)null).a(var0, var1.bf[1].p, var3[0] + 2, var3[1] - 3, var3[2], var3[3] + 6);
            } else {
               var0.drawString(var1.bf[1].p, var3[0], var3[1] - 3, 20);
            }

            var0.setClip(0, 0, 240, 320);
         }

         if (var1.bf[2] != null) {
            var0.setClip(var4[0], var4[1] - 3, var4[2], var4[3] + 6);
            if (x[0] == 2) {
               ((o)null).a(var0, var1.bf[2].p, var4[0] + 2, var4[1] - 3, var4[2], var4[3] + 6);
            } else {
               var0.drawString(var1.bf[2].p, var4[0], var4[1] - 3, 20);
            }

            var0.setClip(0, 0, 240, 320);
         }
      } else {
         switch(x[0]) {
            case 0:
               U = T[((aa)null).bg][3].length;
               int var12 = 0;
               int var17 = 0;
               int var21 = U;

               for(; var12 < var21; ++var12) {
                  if (((av)null).t.b.c(T[((aa)null).bg][3][var12])) {
                     V[var17++] = (t)((w)null).d.elementAt(((av)null).t.b.d(T[((aa)null).bg][3][var12]));
                  }
               }

               if (var1.bf[0] != null) {
                  ((k)null).b(var0, var1.bf[0].q, 11, 14, 1479075, 0, 20);
               }
               break;
            case 1:
               U = T[((aa)null).bg][4].length;
               int var11 = 0;
               int var16 = 0;

               for(int var20 = U; var11 < var20; ++var11) {
                  if (((av)null).t.b.c(T[((aa)null).bg][4][var11])) {
                     V[var16++] = (t)((w)null).c.elementAt(((av)null).t.b.d(T[((aa)null).bg][4][var11]));
                  }
               }

               if (var1.bf[1] != null) {
                  ((k)null).b(var0, var1.bf[1].q, 11, 14, 1479075, 0, 20);
               }
               break;
            case 2:
               U = T[((aa)null).bg][5].length;
               int var10 = 0;
               int var15 = 0;

               for(int var19 = U; var10 < var19; ++var10) {
                  if (((av)null).t.b.c(T[((aa)null).bg][5][var10])) {
                     V[var15++] = (t)((w)null).e.elementAt(((av)null).t.b.d(T[((aa)null).bg][5][var10]));
                  }
               }

               if (var1.bf[2] != null) {
                  ((k)null).b(var0, var1.bf[2].q, 11, 14, 1479075, 0, 20);
               }
         }

         for(int var13 = 0; var13 < 6; ++var13) {
            if (V[var13] != null && var1.b.b(V[var13])) {
               V[var13].a(((k)null).g(11, 8 + var13));
            }
         }

         var0.setColor(65535);
         short[] var14 = ((k)null).a((short)11, (short)5);
         short[] var18 = ((k)null).a((short)11, (short)6);
         short[] var22 = ((k)null).a((short)11, (short)7);
         if (var1.bf[0] != null) {
            var0.setClip(var14[0], var14[1] - 3, var14[2], var14[3] + 6);
            if (x[0] == 0) {
               ((o)null).a(var0, var1.bf[0].p, var14[0] + 2, var14[1] - 3 + ao, var14[2], var14[3] + 6);
            } else {
               var0.drawString(var1.bf[0].p, var14[0], var14[1] - 3 + ao, 20);
            }

            var0.setClip(0, 0, 240, 320);
         }

         if (var1.bf[1] != null) {
            var0.setClip(var18[0], var18[1] - 3, var18[2], var18[3] + 6);
            if (x[0] == 1) {
               ((o)null).a(var0, var1.bf[1].p, var18[0] + 2, var18[1] - 3 + ao, var18[2], var18[3] + 6);
            } else {
               var0.drawString(var1.bf[1].p, var18[0], var18[1] - 3 + ao, 20);
            }

            var0.setClip(0, 0, 240, 320);
         }

         if (var1.bf[2] != null) {
            var0.setClip(var22[0], var22[1] - 3, var22[2], var22[3] + 6);
            if (x[0] == 2) {
               ((o)null).a(var0, var1.bf[2].p, var22[0] + 2, var22[1] - 3 + ao, var22[2], var22[3] + 6);
            } else {
               var0.drawString(var1.bf[2].p, var22[0], var22[1] - 3 + ao, 20);
            }

            var0.setClip(0, 0, 240, 320);
         }
      }

      b(var0, 11, w);
   }

   private static final void U() {
      z = ((o)null).a("num3");
      A = ((o)null).a("num4");
      G = 0;
   }

   private static final void V() {
      z = null;
      A = null;

      for(int var0 = 0; var0 < 8; ++var0) {
         if (!((av)null).t.a.d(var0)) {
            return;
         }
      }

      if (!((av)null).t.b.c(36)) {
         ((t)null).f[36] = 1;
         ((av)null).t.b.b(36);
         ((g)null).a("Nhận danh hiệu: " + ((t)null).a[0][36]);
         ((g)null).e = true;
         ((g)null).f = false;
      }
   }

   private static final void W() {
      if (!t()) {
         if (((a)null).e(4)) {
            G -= 4;
            if (G < 0) {
               G += 8;
               return;
            }
         } else if (((a)null).e(8)) {
            G += 4;
            if (G > 7) {
               G -= 8;
               return;
            }
         } else if (((a)null).e(1)) {
            if (--G < 0) {
               G = 7;
               return;
            }
         } else if (((a)null).e(2)) {
            if (++G > 7) {
               G = 0;
               return;
            }
         } else if (((a)null).e(20480)) {
            int var0;
            if ((var0 = ((av)null).t.a.a(G, ((av)null).t.a.c(G), 17) - ((av)null).t.W[58]) > 0) {
               a("Không đủ điểm kỹ năng, cần thêm " + var0 + " điểm.", "Đồng ý", null, 1);
               return;
            }

            ((av)null).t.W[85] += ((av)null).t.a.a(G, ((av)null).t.a.c(G), 17);
            ((av)null).t.W[58] = Math.abs(var0);
            if (((av)null).t.a.a((byte)G) == 1) {
               a("Đã đạt cấp tối đa!", "Đồng ý", null, 1);
               return;
            }

            a("Nâng cấp thành công!", "Đồng ý", null, 1);
         }
      }
   }

   private static final void p(Graphics var0) {
      ((k)null).a(var0, 4, 1);

      for(int var1 = 0; var1 < 8; ++var1) {
         if (G == var1) {
            w = 2 + var1;
            ((k)null).a(var0, 4, w);
         }

         if (z != null) {
            ay = ((k)null).g(4, 10 + var1);
         }

         ((o)null).a(var0, z, String.valueOf(((av)null).t.a.c(var1)), ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 10);
      }

      ay = ((k)null).a((short)4, (short)19);
      ((o)null).a(var0, A, String.valueOf(((av)null).t.W[58]), ay[0] + (ay[2] >> 1), ay[1] + (ay[3] >> 1), 3, 1, 0, 11);
      ((k)null).b(var0, ((av)null).t.a.a(G), 4, 18, 16777215, 0, 20);
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
         if (((w)null).h(var0 + 11)) {
            W[var0] = (m)((w)null).g.elementAt(((w)null).g(var0 + 11));
         } else {
            W[var0] = ((m)null).a(var0 + 11);
            W[var0].k = 0;
         }
      }

      for(int var2 = 0; var2 < 10; ++var2) {
         if (((ai)null).f[var2] < 99) {
            ((g)null).d(var2);
            i[0] = ((g)null).b();
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
               ((ai)null).a(i[y[0] + 1], (byte)0, 1);
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
            if (((a)null).e(8192)) {
               ak = false;
               return;
            }
         } else if (((a)null).e(20480)) {
            if (x[0] == 0 && y[0] == 0) {
               a("Không thể hủy nhiệm vụ chính tuyến", "Đồng ý", null, 1);
               ap = true;
               return;
            }

            if (x[0] == 1 && i[y[0] + 1] != 0) {
               a("Hủy nhiệm vụ này?", "Đồng ý", "Hủy", 1);
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
      ((k)null).a(var0, 13, 1);

      for(int var1 = 0; var1 < 3; ++var1) {
         if (y[0] == var1) {
            w = 2 + var1;
            ((k)null).a(var0, 13, w);
         }
      }

      if (x[0] == 0) {
         if (((ai)null).f[i[0]] != 0) {
            switch(((g)null).c(i[0]).a) {
               case 0:
                  ((k)null).c(var0, 13, 12);
                  break;
               case 99:
               case 100:
                  ((k)null).a(var0, 13, 9);
                  break;
               default:
                  ((k)null).b(var0, 13, 12);
            }

            ay = ((k)null).a((short)13, (short)5);
            var0.setColor(16764672);
            var0.setClip(ay[0] + 2, ay[1] - 3, ay[2], ay[3] + 6);
            if (y[0] == 0) {
               int var10002 = ay[0] + 2;
               int var10003 = ay[1] - 2;
               short var10004 = ay[2];
               short var10005 = ay[3];
               ((o)null).a(var0, ((g)null).c(i[0]).c, var10002, var10003, var10004, var10005 + 6);
            } else {
               int var4 = ay[0] + 2;
               var0.drawString(((g)null).c(i[0]).c, var4, ay[1] - 2, 20);
            }

            if (y[0] == 0) {
               ((k)null).b(var0, ((g)null).c(i[0]).d, 13, 8, 1479075, 0, 17);
            }
         }
      } else {
         for(int var2 = 0; var2 < 3; ++var2) {
            if (i[var2 + 1] != 0) {
               switch(((g)null).c(i[var2 + 1]).a) {
                  case 0:
                     ((k)null).c(var0, 13, 12 + var2);
                     break;
                  case 99:
                  case 100:
                     ((k)null).a(var0, 13, 9 + var2);
                     break;
                  default:
                     ((k)null).b(var0, 13, 12 + var2);
               }

               ay = ((k)null).g(13, 5 + var2);
               var0.setColor(16764672);
               var0.setClip(ay[0] + 2, ay[1] - 3, ay[2], ay[3] + 6);
               if (y[0] == var2) {
                  int var5 = ay[0] + 2;
                  int var7 = ay[1] - 2;
                  short var8 = ay[2];
                  short var9 = ay[3];
                  ((o)null).a(var0, ((g)null).c(i[var2 + 1]).c, var5, var7, var8, var9 + 6);
               } else {
                  int var6 = ay[0] + 2;
                  var0.drawString(((g)null).c(i[var2 + 1]).c, var6, ay[1] - 2, 20);
               }

               if (i[y[0] + 1] != 0) {
                  ((k)null).b(var0, ((g)null).c(i[y[0] + 1]).d, 13, 8, 1479075, 0, 17);
               }
            }
         }
      }

      b(var0, 13, w);
      var0.setClip(0, 0, 240, 320);

      for(int var3 = 0; var3 < 2; ++var3) {
         if (x[0] == var3) {
            ((k)null).a(var0, 13, 15 + var3);
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
         if (((av)null).t.b.c(var1 + 19)) {
            V[var1] = (t)((w)null).f.elementAt(((av)null).t.b.d(var1 + 19));
         }

         if (V[var1] == null) {
            V[var1] = ((t)null).a(((aa)null).bg, var1 + 19);
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
      aa var0 = ((av)null).t;
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
         if (((a)null).e(20480)) {
            if (V[G] != null && var0.b.b(V[G])) {
               a("Trang bị?", "Đồng ý", "Hủy", 1);
               aq = true;
               ar = false;
            } else {
               a("Chưa nhận được danh hiệu này", "Đồng ý", null, 1);
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
      aa var1 = ((av)null).t;
      ((k)null).a(var0, 14, 1);
      ay = ((k)null).a((short)14, (short)5);
      ay[1] = (short)(ay[1] + 3);
      ay[3] = (short)((O + P) * (ay[3] / R) * 2);
      ((k)null).a(var0, 14, 6, ay);

      for(int var2 = 0; var2 < 3; ++var2) {
         if (P == var2) {
            w = 2 + var2;
            ay = ((k)null).g(14, w);
            var0.setColor(16764672);
            var0.drawRect(ay[0], ay[1], ay[2], ay[3]);
         }

         ay = ((k)null).g(14, 2 + var2);
         ay[1] = (short)(ay[1] - 3);
         if (V[O + var2].m == 0) {
            var0.setColor(16777215);
            var0.drawString("Chưa có", ay[0] + 5, ay[1] + 3, 20);
         } else if (var1.bf[3] == V[O + var2]) {
            var0.setColor(16764672);
            var0.drawString(V[O + var2].p + "(Đeo)", ay[0] + 5, ay[1] + 3, 20);
         } else {
            var0.setColor(16764672);
            var0.drawString(V[O + var2].p, ay[0] + 5, ay[1] + 3, 20);
         }
      }

      var0.setColor(16777215);
      if (V[G].m == 0 && V[G].j == 30) {
         ((k)null).b(var0, ((t)null).d[V[G].j - 19] + "& Tiến độ " + ((t)null).h[0] + "/150", 14, 7, 16777215, 0, 20);
      } else {
         ((k)null).b(var0, ((t)null).d[V[G].j - 19], 14, 7, 16777215, 0, 20);
      }

      ay = ((k)null).a((short)14, (short)8);
      if (V[G].m == 0) {
         var0.setColor(16777215);
         var0.drawString("Chưa biết", ay[0] + 5, ay[1], 20);
      } else {
         ((o)null).a(var0, V[G].q, ay[0] + 2, ay[1] - 3, ay[2], ay[3] + 3);
      }

      b(var0, 14, w);
   }

   public static final void a(byte[] var0, int var1, int var2) {
      ((a)null).a();
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
      if (var0[2] == 0 && ((a)null).e(4) || var0[2] == 1 && ((a)null).e(1)) {
         var0[0] = (byte)(--var0[0] < 0 ? var0[1] - 1 : var0[0]);
         if (var0[2] == 0) {
            var1 = -7;
         }

         if (var0[2] == 1) {
            var1 = -4;
         }
      }

      if (var0[2] == 0 && ((a)null).e(8) || var0[2] == 1 && ((a)null).e(2)) {
         var0[0] = ++var0[0] > var0[1] - 1 ? 0 : var0[0];
         if (var0[2] == 0) {
            var1 = -6;
         }

         if (var0[2] == 1) {
            var1 = -5;
         }
      }

      if (var0[2] == 0 && ((a)null).e(1) || var0[2] == 1 && ((a)null).e(4)) {
         if (var0[2] == 0) {
            var1 = -4;
         }

         if (var0[2] == 1) {
            var1 = -7;
         }
      }

      if (var0[2] == 0 && ((a)null).e(2) || var0[2] == 1 && ((a)null).e(8)) {
         if (var0[2] == 0) {
            var1 = -5;
         }

         if (var0[2] == 1) {
            var1 = -6;
         }
      }

      if (((a)null).e(20480)) {
         var1 = -1;
      } else if (((a)null).e(8192) || ((a)null).e(32768)) {
         var1 = -2;
      }

      return var1;
   }

   public static final int n() {
      return b(x);
   }

   public static final void a(String var0, String var1, String var2, int var3) {
      ((a)null).a();
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
            ((o)null).a(var0, at, 120, 150, 17, 15975757, 3289650);
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

      if (((a)null).e(20480) && au != null && au != "") {
         m = 1;
         k = false;
         l = true;
         ((a)null).a();
      } else if (((a)null).e(8192) && av != null && av != "") {
         m = 2;
         k = false;
         l = true;
         ((a)null).a();
      } else {
         if (((a)null).e(16384) && n != 3) {
            m = 3;
            k = false;
            l = true;
            ((a)null).a();
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
      ((av)null).m();
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
      } else if (((a)null).e(20480)) {
         if (((av)null).as[aF]) {
            if (!((av)null).b("DNFP_RMS_GAME", aF + 1)) {
               q = true;
               a("Lỗi đọc dữ liệu lưu!", "Đồng ý", null, 1);
            } else {
               b();
               ((av)null).b(((av)null).H);
            }
         } else {
            b();
            ((av)null).a((byte)2);
            p = true;
         }

         ((a)null).a();
      } else if (((a)null).e(8192)) {
         b();
         ((av)null).a((byte)2);
         ((a)null).a();
      } else if (((a)null).e(8)) {
         aF = 1;
         ((a)null).a();
      } else {
         if (((a)null).e(4)) {
            aF = 0;
            ((a)null).a();
         }
      }
   }

   public static final void e(Graphics var0) {
      a(var0, "Tải dữ liệu đã lưu?");
   }

   public static final void a(Graphics var0, int var1, int var2) {
      byte var3 = 0;
      byte var4 = 1;
      var3 = 1;
      boolean var5 = false;
      if (var1 == 131584 || var1 == 131585) {
         var3 = 2;
         ay = ((k)null).a((short)1, (short)2);
         az = ((k)null).a((short)1, (short)4);
      } else if (var1 == 131587) {
         var4 = 3;
         var3 = 2;
         ay = ((k)null).a((short)3, (short)2);
      } else if (var1 == 131586) {
         var3 = 1;
         ay = ((k)null).a((short)1, (short)1);
      }

      ((k)null).a(var0, var4, var3);
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

         if (var6 >= 0 && var6 <= ((l)null).e.length) {
            i var7;
            if ((var7 = ((l)null).e[var6]) == null) {
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
      ((av)null).f(var0);
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
            } else if (((av)null).a("DNFP_RMS_GAME", aF + 1)) {
               b(aF + 1);
               aB = false;
               aE = true;
               a("Lưu game thành công!", "Đồng ý", null, 1);
               b();
            } else {
               aC = true;
               a("Xảy ra lỗi khi lưu game!", "Đồng ý", null, 1);
            }
         } else if (aC) {
            if (m > 0) {
               aC = false;
            }
         } else {
            if (((a)null).e(8)) {
               aF = 1;
               ((a)null).a();
            }

            if (((a)null).e(4)) {
               aF = 0;
               ((a)null).a();
            }

            if (((a)null).e(20480)) {
               if (((ai)null).e[60] == 0) {
                  if (((av)null).a("DNFP_RMS_GAME", 1)) {
                     b(1);
                     Object var0 = null;
                     String var1 = "Lưu game thành công!";
                     a("Lưu game thành công!", "Đồng ý", null, 1);
                  } else {
                     a("Xảy ra lỗi khi lưu game!", "Đồng ý", null, 1);
                  }
               }

               b();
               ((a)null).a();
            } else {
               if (((a)null).e(8192) || ((a)null).e(32768)) {
                  b();
               }
            }
         }
      }
   }

   public static final void f(Graphics var0) {
      ((av)null).c(var0);
      if (((av)null).as[aF]) {
         a(var0, "Ghi đè dữ liệu cũ?");
      } else {
         a(var0, "Lưu game?");
      }
   }

   public static final void a(Graphics var0, String var1) {
      a(var0, var1, "Có", "Không");
   }

   public static final void a(Graphics var0, String var1, String var2, String var3) {
      ay = ((k)null).a((short)3, (short)2);
      var0.setClip(0, 0, 240, 320);
      ((o)null).b(var0, ay[0] + 3, ay[1] + 3, ay[2] - 6, ay[3] - 6, -585681064);
      b(var0, 131587);
      var0.setClip(0, 0, 240, 320);
      ((k)null).b(var0, var1, 3, 3, 16777215, 7424823, 17);
      int var4 = ay[1] + ay[3] - 25;
      if (var2 != null) {
         ((o)null).a(var0, var2, ay[0] + 15, var4, 20, 16777215, 7424823);
      }

      if (var3 != null) {
         ((o)null).a(var0, var3, ay[0] + ay[2] - 20, var4, 24, 16777215, 7424823);
      }
   }

   private static void b(Graphics var0, int var1, int var2) {
      ay = ((k)null).g(var1, var2);
      ((n)null).a(var0, ay[0] + ay[2] - 10, ay[1] + ay[3] - 10);
   }

   static {
      short[] var10000 = new short[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
      String[] var0 = new String[]{"Mua vào", "Bán ra"};
      int[] var1 = new int[]{0, 0, 0, 0, 0, 0};
      var10000 = new short[]{0, 0, 240, 320};
      var10000 = new short[]{191, 133, 9, 9};
      var10000 = new short[]{191, 195, 9, 9};
      var10000 = new short[]{0, 270, 50, 50};
      var10000 = new short[]{190, 270, 50, 50};
      String[] var7 = new String[]{"Vật Phẩm", "Nhiệm Vụ"};
      String[] var8 = new String[]{"Dùng", "Phím tắt", "Vứt"};
      String[] var9 = new String[]{"Dùng", "Gộp", "Gán phím", "Chi tiết", "Vứt"};
      String[] var10 = new String[]{"Dùng", "Chi tiết", "Vứt"};
      String[] var11 = new String[]{"Dùng", "Gộp", "Chi tiết", "Vứt"};
      String[] var12 = new String[]{"Chi tiết", "Vứt"};
   }
}
