import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ai {
   public static boolean a = false;
   public static boolean b = false;
   private static byte C;
   private static x D;
   private static byte[] E;
   private static Vector F = new Vector();
   private static byte G;
   private static byte H;
   private static int I;
   private static int J;
   private static int K;
   private static final int[] L = new int[]{16, 32, 64, 16384, 256, 512, 1024, 2048, 1, 2, 4, 8, 4096, 8192};
   private static int M;
   private static final byte[][] N = new byte[][]{{2, 1, 2}, {2, 1, 2}, {2, 1, 2}, {2}, {2, 1, 2}, {1, 1}, {2, 2, 1, 2}, {2, 2, 1}, {2, 1, 2}, {2, 2}};
   public static final byte[][] c = new byte[][]{
      {2, 2, 2, 1},
      {2, 2, 2, 2, 2, 2, 2},
      {1, 2, 2, 1},
      {2, 2, 2, 1},
      {2},
      {2, 1, 1, 1, 1},
      {2, 1, 2, 2},
      {1, 2, 2},
      {1, 2, 2},
      {1, 2, 2},
      {1, 2, 1, 2, 2},
      {2, 2, 1, 2},
      {2, 2, 1},
      {2, 1},
      {1},
      {2, 1, 2},
      {2, 1, 2},
      {1},
      {1},
      {1},
      {2, 2},
      {2, 2, 2},
      {1, 2},
      {2, 2, 2},
      {2},
      {2, 2},
      {2},
      {1},
      {2},
      {2},
      {2},
      {2, 2, 1, 2, 1, 1},
      {2, 1},
      {2},
      {2},
      {2}
   };
   public static byte[] d = new byte[127];
   public static short[] e = new short[127];
   public static short[] f = new short[127];
   private static short[] O = new short[127];
   public static final int[] g = new int[]{0, 16777215};
   private static byte[][][] P;
   private static byte[][][] Q;
   private static String[] R;
   private static short[][] S;
   public static boolean h = false;
   public static boolean i = false;
   private static u T = null;
   private static byte[] U;
   private static int V;
   private static int W = -1;
   private static int X = -1;
   private static int Y = -1;
   private static t[] Z = null;
   private static m[] aa = null;
   private static n ab;
   public static Vector j;
   public static short[] k;
   public static String[][] l;
   public static short[][][] m;
   public static String[] n;
   public static short[][] o;
   private static String ac;
   private static short[] ad;
   private static Vector ae = null;
   private static byte af;
   private static int ag;
   private static int[] ah;
   private static int ai;
   private static boolean aj = true;
   public static final int[] p = new int[]{16777215, 16711680, 16776960, 65535, 0, 255, 65280};
   private static short ak;
   private static short al;
   private static short am;
   private static short an;
   private static short ao;
   private static short ap;
   public static short q;
   public static short r;
   public static x s;
   private static String aq;
   private static int ar;
   private static short[] as;
   private static int at;
   private static int au;
   private static int av;
   private static int aw;
   private static short[] ax = new short[2];
   private static String[][] ay = (String[][])null;
   private static int az = 0;
   private static int aA = 0;
   private static int aB = 0;
   private static int aC = 0;
   private static int aD = 0;
   private static int aE = 0;
   private static int aF;
   private static int aG;
   private static int[] aH;
   private static boolean aI;
   private static Image aJ = null;
   private static Image aK = null;
   private static int aL = 0;
   private static short[] aM = new short[]{0, 0, 0, 0};
   public static int t = 1;
   private static Image aN;
   public static int u = 0;
   public static int v = 0;
   private static boolean aO;
   private static int aP;
   private static int aQ;
   private static int aR;
   private static int aS;
   private static int aT;
   private static byte aU;
   public static short[] w;
   private static byte aV;
   public static int x = 3;
   public static int y = 3;
   public static int z = 1;
   public static int A = 0;
   public static int B = 0;
   private static final int[] aW = new int[]{
      65535, 0, 255, 16711935, 8421504, 32768, 65280, 8388608, 128, 8421376, 8388736, 16711680, 12632256, 32896, 16777215, 16776960
   };
   private static short[][] aX;

   public static final void a() {
      for(int var0 = 0; var0 < 127; ++var0) {
         e[var0] = 0;
      }

      for(int var1 = 0; var1 < 127; ++var1) {
         f[var1] = 0;
      }

      for(int var2 = 0; var2 < 127; ++var2) {
         O[var2] = 0;
      }
   }

   public static final void b() {
      for(int var0 = 0; var0 < 127; ++var0) {
         if (d[var0] == 2) {
            e[var0] = 0;
         }
      }
   }

   public static final void a(byte[][][] var0, byte[][][] var1) {
      P = var0;
      Q = var1;
   }

   public static final void a(DataOutputStream var0) throws Exception {
      o.a(e, var0);
      o.a(f, var0);
      o.a(O, var0);
      g.a(var0);
   }

   public static final void a(DataInputStream var0) throws Exception {
      short[] var1 = o.b(var0);

      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (d[var2] != 0) {
            e[var2] = var1[var2];
         }
      }

      f = o.b(var0);
      O = o.b(var0);
      g.b(var0);
   }

   public static final void b(DataOutputStream var0) throws Exception {
      System.out.println("-------write DB_NAME_SUPER_VARIATES--------");

      for(int var1 = 0; var1 < e.length; ++var1) {
         if (d[var1] == 0) {
            var0.writeShort(e[var1]);
         }
      }

      System.out.println("-------write end--------");
   }

   public static final void b(DataInputStream var0) throws Exception {
      System.out.println("-------read DB_NAME_SUPER_VARIATES--------");

      for(int var1 = 0; var1 < e.length; ++var1) {
         if (d[var1] == 0) {
            e[var1] = var0.readShort();
         }
      }

      System.out.println("-------read end--------");
   }

   public static final void c() {
      P = (byte[][][])null;
      Q = (byte[][][])null;
      R = null;
   }

   public static final void a(Graphics var0) {
      h();
      switch(G) {
         case 0:
            g();
            if (0 == G) {
               b(var0);
               return;
            }
            break;
         case 1:
            z();
            if (1 == G) {
               f(var0);
               return;
            }
            break;
         case 2:
            B();
            if (2 == G) {
               g(var0);
               return;
            }
            break;
         case 3:
            D();
            if (3 == G) {
               h(var0);
               return;
            }
            break;
         case 4:
            q();
            if (4 == G) {
               c(var0);
               return;
            }
            break;
         case 5:
            u();
            if (5 == G) {
               e(var0);
               return;
            }
            break;
         case 6:
            G();
            if (6 == G) {
               i(var0);
            }
      }
   }

   public static final void d() {
      H = G;
      G = 0;
   }

   public static final void a(byte var0) {
      if (!b) {
         H = G;
         G = var0;
         switch(H) {
            case 0:
               m();
               break;
            case 1:
               y();
            case 2:
            case 3:
            default:
               break;
            case 4:
               p();
               break;
            case 5:
               t();
               break;
            case 6:
               F();
         }

         switch(G) {
            case 0:
               l();
               break;
            case 1:
               x();
               break;
            case 2:
               A();
               break;
            case 3:
               C();
               break;
            case 4:
               o();
               break;
            case 5:
               s();
               break;
            case 6:
               E();
         }

         a = true;
      }
   }

   public static final void a(x var0, byte[] var1) {
      if (!b) {
         C = av.D;
         D = var0;
         E = var1;
         I = 0;
         J = 0;
         K = E[J++];
         a = true;
      }
   }

   public static final void e() {
      DataInputStream var0 = null;

      try {
         for(int var1 = 0; var1 < 127; ++var1) {
            d[var1] = -1;
         }

         (var0 = o.c("qtr.bin")).readByte();
         short var11 = var0.readShort();

         for(int var2 = 0; var2 < var11; ++var2) {
            byte var3 = var0.readByte();
            byte var4 = var0.readByte();
            d[var3] = var4;
         }

         g.a(var0);
         y.a(var0);
         var0.close();
      } catch (Exception var8) {
         System.out.println(">>ERROR: loadQuestVar()");
         var8.printStackTrace();
      } finally {
         ;
      }
   }

   public static final void a(x var0) {
      short var1;
      if ((var1 = var0.V[5]) > -1) {
         var0.aq = P[var1];
         var0.ar = Q[var1];
         var0.L();
         b(var0);
      }
   }

   public static final void a(int var0, byte var1, int var2) {
      if (2 == var1) {
         O[var0] = (short)(av.H << 10 | D.V[1]);
      }

      if (var2 == 0) {
         f[var0] = (short)(f[var0] + var1);
      } else if (var2 == 1) {
         f[var0] = (short)var1;
      }

      g.c(var0).a = f[var0];
      switch(f[var0]) {
         case 0:
         case 1:
         case 2:
         default:
            break;
         case 99:
            g.a("完成: " + g.c(var0).c);
            g.e = true;
            g.f = true;
            break;
         case 100:
            i = true;
            h = true;
            g.d(var0);
      }

      T = g.c();
   }

   public static final void f() {
      h();
      switch(f[g.b()]) {
         case 1:
            if (T.b == 0) {
               if (a.c()) {
                  f[g.b()] = 2;
               }
            } else if (T.b == 1) {
               if (a.e(20480)) {
                  f[g.b()] = 2;
               } else if (a.e(8192)) {
                  f[g.b()] = 0;
               }
            }
         case 100:
         default:
            if (f[g.b()] == 2 && !g.a(g.b())) {
               g.b(g.b());
               g.a("接到: " + T.c);
            }

            i = false;
            h = false;
            a.a();
            if (!i) {
               k();
            }
      }
   }

   public static final void b(x var0) {
      int var1 = 0;
      byte var2 = 0;
      J = 0;

      for(int var3 = 0; var3 < var0.aq.length; ++var3) {
         U = var0.ar[var3];
         var1 = 0;
         V = 0;
         var2 = U[V++];
         byte var4 = 0;

         while(var1 < var2) {
            ++var1;
            switch(var4 = U[V++]) {
               case 0:
                  a(var4, 0);
                  a(var4, 1);
                  a(var4, 2);
                  a(var4, 3);
                  break;
               case 1:
                  a(var4, 0);
                  a(var4, 1);
                  a(var4, 2);
                  a(var4, 3);
                  a(var4, 4);
                  a(var4, 5);
                  a(var4, 6);
                  break;
               case 2:
                  a(var4, 0);
                  a(var4, 1);
                  a(var4, 2);
                  a(var4, 3);
                  boolean var24 = false;
                  break;
               case 3:
                  a(var4, 0);
                  a(var4, 1);
                  a(var4, 2);
                  a(var4, 3);
                  break;
               case 4:
                  a(var4, 0);
                  break;
               case 5:
                  a(var4, 0);
                  a(var4, 1);
                  a(var4, 2);
                  a(var4, 3);
                  a(var4, 4);
                  break;
               case 6:
                  a(var4, 0);
                  a(var4, 1);
                  a(var4, 2);
                  a(var4, 3);
                  break;
               case 7:
                  a(var4, 0);
                  a(var4, 1);
                  a(var4, 2);
                  break;
               case 8:
                  a(var4, 0);
                  a(var4, 1);
                  a(var4, 2);
                  break;
               case 9:
                  a(var4, 0);
                  a(var4, 1);
                  a(var4, 2);
                  break;
               case 10:
                  a(var4, 0);
                  a(var4, 1);
                  a(var4, 2);
                  a(var4, 3);
                  a(var4, 4);
                  break;
               case 11:
                  a(var4, 0);
                  a(var4, 1);
                  a(var4, 2);
                  a(var4, 3);
                  break;
               case 12:
                  a(var4, 0);
                  a(var4, 1);
                  a(var4, 2);
                  break;
               case 13:
                  a(var4, 0);
                  a(var4, 1);
                  break;
               case 14:
                  a(var4, 0);
                  break;
               case 15:
                  int var5 = a(var4, 0);
                  a(var4, 1);
                  if (a(var4, 2) == 2 && !var0.aw.contains(String.valueOf(var5))) {
                     var0.aw.addElement(String.valueOf(var5));
                  }
                  break;
               case 16:
                  a(var4, 0);
                  a(var4, 1);
                  a(var4, 2);
                  break;
               case 17:
                  a(var4, 0);
                  break;
               case 18:
                  a(var4, 0);
                  break;
               case 19:
                  a(var4, 0);
                  break;
               case 20:
                  a(var4, 0);
                  a(var4, 1);
                  break;
               case 21:
                  a(var4, 0);
                  a(var4, 1);
                  a(var4, 2);
                  break;
               case 22:
                  a(var4, 0);
                  a(var4, 1);
                  break;
               case 23:
                  a(var4, 0);
                  a(var4, 1);
                  a(var4, 2);
                  break;
               case 24:
                  a(var4, 0);
                  break;
               case 25:
                  a(var4, 0);
                  a(var4, 1);
                  break;
               case 26:
                  a(var4, 0);
                  break;
               case 27:
                  a(var4, 0);
                  break;
               case 28:
                  for(int var8 = a(var4, 0); var8 > 0; V += 2) {
                     --var8;
                  }
                  break;
               case 29:
                  int var9 = a(var4, 0);

                  while(var9 > 0) {
                     --var9;
                     a(3, 0);
                     a(3, 1);
                     a(3, 2);
                     a(3, 3);
                  }

                  av.l();
                  break;
               case 30:
                  int var10 = a(var4, 0);

                  for(E = U; var10 > 0; J += 2) {
                     --var10;
                     J += 2;
                     J += 2;
                     boolean var14 = false;
                     J += 2;
                     boolean var15 = false;
                     J += 2;
                     boolean var16 = false;
                     J += 2;
                     boolean var17 = false;
                     J += 2;
                  }
                  break;
               case 31:
                  a(var4, 0);
                  a(var4, 1);
                  a(var4, 2);
                  a(var4, 3);
                  a(var4, 4);
                  a(var4, 5);
                  break;
               case 32:
                  a(var4, 0);
                  a(var4, 1);
                  boolean var18 = false;
                  break;
               case 33:
                  a(var4, 0);
                  boolean var19 = false;
                  break;
               case 34:
                  a(var4, 0);
                  boolean var20 = false;
            }
         }
      }

      U = null;
      V = 0;
   }

   public static final void c(x var0) {
      if (!b) {
         for(int var1 = var0.as; var1 < var0.aq.length; ++var1) {
            var0.au = var0.aq[var1];
            Object var2;
            switch(var0.au[0]) {
               case 0:
                  if (!av.a(var0) || !av.t.as()) {
                     continue;
                  }
                  break;
               case 1:
                  if (!a.e(16384) || !av.a(var0) || !av.t.as()) {
                     continue;
                  }

                  if (var0 instanceof p) {
                     var0.v(var0.b(av.t, 1));
                     av.t.v(av.t.b(var0, 1));
                  }
                  break;
               case 2:
                  if (!var0.m(x.P)) {
                     continue;
                  }

                  var2 = l.e[var0.V[6]];
                  short var6 = var0.V[7];
                  byte var7 = ((i)var2).c[var6];
                  int var8 = ((i)var2).e[((i)var2).d[var6] + (var0.al[0] << 1)] >> 10 & 31;
                  if (var0.al[0] + 1 < var7 || var0.al[1] + 1 < var8) {
                     continue;
                  }
                  break;
               case 3:
                  if (var0 instanceof h && ((h)(var2 = (h)var0)).i > 0) {
                     --((h)var2).i;
                     continue;
                  }

                  if (!var0.m(x.P)) {
                     continue;
                  }

                  var2 = l.e[var0.V[6]];
                  short var3 = var0.V[7];
                  byte var4 = ((i)var2).c[var3];
                  int var5 = ((i)var2).e[((i)var2).d[var3] + (var0.al[0] << 1)] >> 10 & 31;
                  if (var0.al[0] + 1 < var4 || var0.al[1] + 1 < var5) {
                     continue;
                  }

                  var0.l(x.O);
               case 4:
               default:
                  break;
               case 5:
                  if (av.a(var0)) {
                     continue;
                  }
            }

            var0.at = 1;
            if (d(var0)) {
               var0.as = (short)((var1 + 1) % var0.aq.length);
               var0.av = true;
               a(var0, var0.ar[var1]);
               return;
            }
         }

         var0.as = 0;
      }
   }

   public static final boolean d(x var0) {
      boolean var1 = true;
      int var2 = 0;
      byte var3 = 0;
      byte var4 = var0.au[var0.at++];

      while(var1 && var2 < var4) {
         ++var2;
         switch(var3 = var0.au[var0.at++]) {
            case 0:
               int var19 = a(var0, var3, 0);
               int var26 = a(var0, var3, 1);
               int var32 = a(var0, var3, 2);
               var1 = a(f[var19], var26, var32);
               break;
            case 1:
               if (var0.W == null) {
                  var1 = false;
               } else {
                  int var18 = a(var0, var3, 0);
                  int var25 = a(var0, var3, 1);
                  int var31 = a(var0, var3, 2);
                  if (var18 < 0) {
                     var1 = a(var0.V[-var18], var25, var31);
                  } else if (var18 == 12) {
                     if (var0 instanceof aa) {
                        var1 = a(av.t.W[12], var25, var31);
                     } else {
                        var1 = a(var0.W[var18], var25, var31);
                     }
                  } else {
                     var1 = a(var0.W[var18], var25, var31);
                  }
               }
               break;
            case 2:
               int var17 = a(var0, var3, 0);
               int var24 = a(var0, var3, 1);
               int var30 = a(var0, var3, 2);
               var1 = a(e[var17], var24, var30);
               break;
            case 3:
               int var15 = a(var0, var3, 0);
               var15 = Integer.parseInt(R[var15].trim());
               if (var1 = aG == var15) {
                  aG = -1;
               }
               break;
            case 4:
               a(var0, var3, 0);
               int var23 = a(var0, var3, 1);
               int var29 = a(var0, var3, 2);
               boolean var35 = false;
               var1 = a(0, var23, var29);
               break;
            case 5:
               int var14 = a(var0, var3, 0);
               int var22 = a(var0, var3, 1);
               var1 = a.e(L[var22]);
               if (var14 == 1) {
                  var1 = !var1;
               }
               break;
            case 6:
               int var13 = a(var0, var3, 0);
               int var21 = a(var0, var3, 1);
               int var28 = a(var0, var3, 2);
               int var34 = a(var0, var3, 3);
               x var36;
               if ((var36 = av.d(var13)) != null && var36.W != null && var21 < var36.W.length) {
                  var1 = a(var36.W[var21], var28, var34);
               }
               break;
            case 7:
               int var12 = a(var0, var3, 0);
               int var20 = a(var0, var3, 1);
               int var27 = a(var0, var3, 2);
               x var33;
               if ((var33 = av.d(var12)) != null) {
                  if (var27 == 0) {
                     var1 = var33.S == var20;
                  } else {
                     var1 = var33.T == var20;
                  }
               }
               break;
            case 8:
               int var11 = a(var0, var3, 0);
               a(var0, var3, 1);
               int var7 = a(var0, var3, 2);
               x var8 = av.d(var11);
               x var9 = av.d(var7);
               if (var1 = av.a(var8, var9)) {
               }
               break;
            case 9:
               int var5 = a(var0, var3, 0);
               int var6 = a(var0, var3, 0);
               var1 = ah[var5] == var6;
         }
      }

      return var1;
   }

   private static int a(x var0, int var1, int var2) {
      byte var3 = N[var1][var2];
      int var4 = o.a(var0.au, var0.at, var3);
      var0.at = (short)(var0.at + var3);
      return var4;
   }

   public static final void a(int var0) {
      DataInputStream var1 = null;

      try {
         (var1 = o.c("sct.bin")).readByte();
         b(var1, var0);
         a(var1, var0);
         var1.close();
      } catch (Exception var6) {
         var6.printStackTrace();
         --av.ad;
      } finally {
         ;
      }
   }

   private static boolean k() {
      byte var0 = 0;

      label488:
      while(I < K && !h) {
         ++I;
         switch(var0 = E[J++]) {
            case 0:
               int var33 = b(var0, 0);
               int var56 = b(var0, 1);
               int var75 = b(var0, 2);
               int var89 = b(var0, 3);
               x var99;
               if ((var99 = av.d(var33)) != null && var56 != -1) {
                  if (var56 == 100) {
                     if (var89 == 1) {
                        var99.k(x.I);
                     } else if (var89 == 0) {
                        var99.l(x.I);
                     }
                  } else {
                     var99.a((short)var56);
                  }

                  if (var75 >= 0) {
                     var99.d((short)((byte)var75));
                  }
               }
               break;
            case 1:
               int var32 = b(var0, 0);
               int var55 = b(var0, 1);
               int var73 = b(var0, 2);
               int var87 = b(var0, 3);
               int var98 = b(var0, 4);
               int var109 = b(var0, 5);
               b(var0, 6);
               x var116;
               if ((var116 = av.d(var32)) != null) {
                  if (var55 == 1) {
                     var73 = var116.V[8] >> 4;
                     var87 = var116.V[9] >> 4;
                     switch(var109) {
                        case 0:
                           var73 += var98;
                           break;
                        case 1:
                           var73 -= var98;
                           break;
                        case 2:
                           var87 -= var98;
                           break;
                        case 3:
                           var87 += var98;
                     }
                  }

                  var73 = var73 * j.c() + (j.c() >> 1);
                  var87 = var87 * j.d() + (j.d() >> 1);
                  ((p)var116).a((short)var73, (short)var87, (short)var109, true);
                  a((byte)3);
               }

               if (I < K && E[J] == 1) {
                  break;
               }

               return false;
            case 2:
               av.t.s(-1);
               av.t.j = null;
               int var31 = b(var0, 0);
               int var53 = b(var0, 1);
               int var71 = b(var0, 2);
               short var86 = (short)b(var0, 3);
               short var54 = (short)(var53 * j.c() + (j.c() >> 1));
               short var72 = (short)(var71 * j.d() + (j.d() >> 1));
               if (var31 != av.H) {
                  av.a(var31, var54, var72, var86, true);
                  return false;
               }

               av.t.d((short)var54, (short)var72);
               av.t.v((short)var86);
               av.l();
               ac.a(av.t, true);
               break;
            case 4:
               x var50;
               if ((var50 = av.d(b(var0, 0))) != null) {
                  var50.l(x.I);
                  var50.l(x.H);
                  var50.l(x.G);
                  av.k();
                  av.l();
               }
               break;
            case 5:
               int var29 = J;
               int var49 = b(var0, 0);
               int var68 = b(var0, 1);
               int var84 = b(var0, 2);
               int var96 = b(var0, 3);
               int var107 = b(var0, 4);
               x var113;
               if ((var113 = av.d(var49)) != null) {
                  if (F.size() > 0 && ((x)F.elementAt(F.size() - 6)).Y == var113.Y) {
                     --I;
                     J = var29 - 1;
                     return false;
                  }

                  av.k();
                  av.l();
                  F.addElement(var113);
                  F.addElement(String.valueOf(var113.V[7]));
                  F.addElement(String.valueOf(var68));
                  F.addElement(String.valueOf(var96));
                  F.addElement(String.valueOf(var84));
                  F.addElement(String.valueOf(var107));
                  if (var113 instanceof ag) {
                     ((ag)var113).h();
                  }

                  var113.k(x.I);
                  h();
                  if (I < K && E[J] == 5) {
                     break;
                  }

                  return false;
               }
            case 3:
               int var30 = b(var0, 0);
               int var51 = b(var0, 1);
               int var69 = b(var0, 2);
               int var85 = b(var0, 3);
               x var97;
               if ((var97 = av.d(var30)) == null) {
                  break;
               }

               if (var97 instanceof r && ((r)var97).a == 1) {
                  r var108;
                  if (!(var108 = (r)var97).m(x.Q)) {
                     var108.b = true;
                     var108.d();
                     av.a((byte)12);
                     return false;
                  }
                  break;
               }

               if (var97 instanceof ag) {
                  ((ag)var97).h();
               } else if (!(var97 instanceof aa)) {
                  var97.a();
               }

               j.a((byte)2, var97.V[8], var97.V[9], (byte)-1);
               if ((var51 != -1 || var69 != -1) && (var51 != 65535 || var69 != 65535)) {
                  var51 = var51 * j.c() + (j.c() >> 1);
                  var69 = var69 * j.d() + (j.d() >> 1);
               } else {
                  var51 = var97.V[8];
                  var69 = var97.V[9];
               }

               var97.k(x.I);
               var97.d((short)var51, (short)var69);
               var97.v((short)var85);
               var97.aj();
               var97.ac = (short)var51;
               var97.ad = (short)var69;
               av.k();
               av.l();
               break;
            case 6:
               int var28 = b(var0, 0);
               int var48 = b(var0, 1);
               int var67 = b(var0, 2);
               int var83 = b(var0, 3);
               Object var94 = null;
               if (var83 <= 1) {
                  var94 = av.r[var83 - 1];
               } else {
                  var94 = av.d(var83);
               }

               if (var94 == null || ((x)var94).W == null || var28 >= ((x)var94).W.length) {
                  break;
               }

               switch(var48) {
                  case 0:
                     if (var28 == 19) {
                        ((x)var94).W[22] += var67;
                     } else if (var28 == 20) {
                        ((x)var94).W[23] += var67;
                     } else if (var28 == 46) {
                        var67 += ((x)var94).W[75];
                     } else if (var28 == 16) {
                        ((x)var94).W[16] += var67;
                     } else if (var28 == 9) {
                        var67 += ((x)var94).W[9];
                     } else {
                        ((x)var94).W[var28] += var67;
                     }
                     break;
                  case 1:
                     if (var28 == 19) {
                        ((x)var94).W[22] = var67;
                     } else if (var28 == 20) {
                        ((x)var94).W[23] = var67;
                     } else if (var28 == 46) {
                        var67 = ((x)var94).W[75];
                     } else if (var28 == 16) {
                        ((x)var94).W[16] = var67;
                     } else if (var28 == 9) {
                        var67 = var67;
                     } else {
                        ((x)var94).W[var28] = (short)var67;
                     }
               }

               if (var28 == 5 && ((x)var94).W[5] <= 0) {
                  ((x)var94).a((short)8);
               }

               if (var28 == 5 || var28 == 7) {
                  ((h)var94).u();
               }

               if (var28 == 75) {
                  aa var104;
                  (var104 = (aa)var94).W[75] = Math.min(var104.W[75], var104.W[76]);
               }

               if (var28 == 3) {
                  ((x)var94).t(((x)var94).W[var28]);
               }

               if (var94 instanceof aa) {
                  aa var105;
                  (var105 = (aa)var94).ap();
               }

               if (var94 instanceof aa && var28 == 9) {
                  aa var106 = (aa)var94;
                  if (var67 > 99) {
                     var67 = 99;
                  }

                  var106.B(var67);
               }
               break;
            case 7:
               b(var0, 0);
               int var47 = b(var0, 1);
               int var66 = b(var0, 2);
               aa var80 = av.t;
               if (var47 < 9) {
                  (var80 = av.r[0]).b.b(var47);
               } else if (var47 < 18) {
                  (var80 = av.r[1]).b.b(var47 - 9);
               } else if (var47 < 26) {
                  w.a(var47 - 18, var66);
               } else if (var47 == -1) {
                  var80.b.a(var66);
               }
               break;
            case 8:
               b(var0, 0);
               int var46 = b(var0, 1);
               b(var0, 2);
               av.t.b.b(var46);
               W = var46;
               break;
            case 9:
               b(var0, 0);
               int var45 = b(var0, 1);
               b(var0, 2);
               av.t.a.a((byte)var45);
               break;
            case 10:
               ak = (short)b(var0, 0);
               al = (short)b(var0, 1);
               b(var0, 2);
               am = (short)(b(var0, 3) - 1);
               an = (short)b(var0, 4);
               a((byte)1);
               return false;
            case 11:
               int var27 = b(var0, 0);
               int var44 = b(var0, 1);
               int var65 = b(var0, 2);
               int var79 = b(var0, 3);
               if (j.b((byte)var65, var27, var44, (byte)var79) != -1) {
                  ByteArrayOutputStream var93 = new ByteArrayOutputStream();
                  DataOutputStream var103 = new DataOutputStream(var93);

                  try {
                     var103.writeInt(var27);
                     var103.writeInt(var44);
                     var103.writeByte((byte)var65);
                     var103.writeByte((byte)var79);
                  } catch (IOException var14) {
                     var14.printStackTrace();
                  }

                  byte[] var112 = var93.toByteArray();
                  av.a(1, av.H, var27, var44, var112);
               }
               break;
            case 12:
               int var26 = b(var0, 0);
               int var43 = b(var0, 1);
               int var64;
               j.b((byte)(var64 = b(var0, 2)), var26, var43, (byte)(var64 == 3 ? -1 : -1));
               break;
            case 13:
               int var25 = b(var0, 0);
               int var42 = b(var0, 1);
               x var63;
               if ((var63 = av.d(var25)) != null) {
                  if (var42 == 1) {
                     var63.k(x.I);
                     if (var63 instanceof ag) {
                        ((ag)var63).h();
                     } else {
                        var63.k(x.H);
                     }
                  } else {
                     var63.l(x.H);
                  }
               }

               System.out.println("WARNING >> \tNo implement!");
               break;
            case 14:
               C = (byte)b(var0, 0);
               return true;
            case 15:
               int var24 = b(var0, 0);
               int var41 = b(var0, 1);
               int var62 = b(var0, 2);
               a(var24, (byte)var62, var41);
               break;
            case 16:
               int var23 = b(var0, 0);
               int var40 = b(var0, 1);
               int var61 = b(var0, 2);
               switch(var23) {
                  case 12:
                     av.a((byte)2);
                     continue;
                  case 13:
                  case 14:
                  case 15:
                  case 16:
                  case 22:
                  case 23:
                  case 24:
                  case 25:
                  case 26:
                  case 27:
                  case 28:
                  case 29:
                  case 30:
                  case 31:
                  case 32:
                  case 33:
                  case 34:
                  case 35:
                  case 36:
                  case 37:
                  case 38:
                  case 39:
                  case 43:
                  case 50:
                  case 53:
                  case 54:
                  case 56:
                  case 58:
                  case 59:
                  case 60:
                  case 61:
                  case 62:
                  case 63:
                  case 65:
                  case 71:
                  case 74:
                  case 75:
                  case 76:
                  case 77:
                  default:
                     if (var23 >= 0) {
                        if (var40 == 1) {
                           e[var23] = (short)var61;
                        } else if (var40 == 0) {
                           e[var23] += (short)var61;
                        } else if (var40 == 2) {
                           e[var23] = (short)o.b(var61);
                        }
                     }
                     continue;
                  case 17:
                     int var92 = 0;

                     while(true) {
                        if (var92 >= av.r.length) {
                           continue label488;
                        }

                        av.r[var92].W[94] = var61;
                        ++var92;
                     }
                  case 18:
                     aa.aK = var61 > 0;
                     continue;
                  case 19:
                     aa.bl[0] = var61 > 0;
                     continue;
                  case 20:
                     aa.bl[1] = var61 > 0;
                     continue;
                  case 21:
                     aa.aL = var61 > 0;
                     continue;
                  case 40:
                     aa.aJ = L[var61];
                     b = true;
                     av.a((byte)4);
                     return false;
                  case 41:
                  case 42:
                  case 46:
                  case 52:
                     continue;
                  case 44:
                     a((byte)2);
                     return false;
                  case 45:
                     D.q(var61);
                     continue;
                  case 47:
                     if (var61 == 0) {
                        av.t.k(aa.aW);
                     } else {
                        av.t.l(aa.aW);
                     }
                     continue;
                  case 48:
                     if (var61 != 1 && var61 != 2 && var61 != 3 && var61 != 4) {
                        e[48] = 0;
                     }
                     continue;
                  case 49:
                     if (var61 == 1) {
                        if (av.a("DNFP_RMS_GAME", 1)) {
                           e[49] = 2;
                        } else {
                           e[49] = 3;
                        }
                     } else {
                        e[49] = (short)var61;
                     }
                     continue;
                  case 51:
                     if (var61 == 1) {
                        av.a((byte)37);
                        return false;
                     }
                     continue;
                  case 55:
                     if (var61 == 1) {
                        return false;
                     }
                     continue;
                  case 57:
                     if (av.t.W[12] >= var61) {
                        av.t.b.a(-var61);
                        e[58] = 1;
                     } else {
                        e[58] = 2;
                     }
                     continue;
                  case 64:
                     if (var40 == 1) {
                        e[var23] = (short)var61;
                     } else if (var40 == 0) {
                        e[var23] += (short)var61;
                     } else if (var40 == 2) {
                        e[var23] = (short)o.b(var61);
                     }

                     aU = 0;
                     if (var61 > 0) {
                        a((byte)6);
                        return false;
                     }
                     continue;
                  case 66:
                     if (var61 >= 0 && var61 < 4) {
                        av.t.a.a((byte)var61);
                        continue;
                     }

                     System.out.println("set skill useable error !index =" + var61);
                     continue;
                  case 67:
                     e[60] = 1;
                     e[67] = -1;
                     continue;
                  case 68:
                     e[60] = 0;
                     e[68] = -1;
                     continue;
                  case 69:
                     av.a((byte)110);
                     return false;
                  case 70:
                     av.t.A(var61);
                     continue;
                  case 72:
                     if (var61 > 0) {
                        d.a(15);
                     }
                     continue;
                  case 73:
                     e[var23] = (short)var61;
                     continue;
                  case 78:
                     int var78 = g[var61 % 10];
                     n.a(8, var78, var61);
                     continue;
               }
            case 17:
               am.a(b(var0, 0), -1);
               break;
            case 18:
               System.out.println("WARNING >> \tNo implement!");
               break;
            case 19:
               am.e();
               break;
            case 20:
               int var22 = b(var0, 0);
               int var39 = b(var0, 1);
               System.out.println(">>设置标志：roleID=" + var22 + ", faceID=" + var39);
               x var60;
               if ((var60 = av.d(var22)) != null) {
                  var60.q(var39);
               }
               break;
            case 21:
               int var21 = b(var0, 0);
               int var38 = b(var0, 1);
               int var59 = b(var0, 2);
               System.out.println(">>角色重生：roleID=" + var21 + ", count=" + var38 + ", span=" + var59);
               break;
            case 22:
               int var20 = b(var0, 0);
               int var37 = b(var0, 1);
               System.out.println(">>屏幕控制：type=" + var20 + ", value=" + var37);
               switch(var20) {
                  case 0:
                     n.d(var37, 0);
                     continue;
                  case 1:
                     n.d(0, var37);
                     continue;
                  case 2:
                     n.b(2);
                     continue;
                  case 3:
                     n.b(4);
                     continue;
                  case 4:
                     n.a(8, 0, var37);
                     continue;
                  case 5:
                     n.a(16, 0, var37);
                  default:
                     continue;
               }
            case 23:
               int var19 = b(var0, 0);
               int var36 = b(var0, 1);
               int var58 = b(var0, 2);
               System.out.println(">>屏幕移至某点：x=" + var19 + ", y=" + var36 + ", sp=" + var58);
               aQ = var19 * j.c() + (j.c() >> 1);
               aR = var36 * j.d() + (j.d() >> 1);
               aP = var58;
               ac.a(D, (short)aQ, (short)aR, (short)var58);
               a((byte)3);
               return false;
            case 24:
               int var18 = b(var0, 0);
               System.out.println(">>跟随对象：roleID=" + var18);
               if (var18 == 0) {
                  ac.a(null, true);
               } else {
                  x var35;
                  if ((var35 = av.d(var18)) != null) {
                     ac.a(var35, true);
                     a((byte)3);
                  }
               }
               break;
            case 25:
               int var17 = b(var0, 0);
               int var34 = b(var0, 1);
               System.out.println(">>镜头移至角色：roleID=" + var17 + ", sp=" + var34);
               x var57;
               aQ = (var57 = av.d(var17)).V[8];
               aR = var57.V[9];
               ac.a(D, (short)aQ, (short)aR, (short)var34);
               a((byte)3);
               return false;
            case 26:
               int var16 = b(var0, 0);
               System.out.println(">>执行延时：pauseTime=" + var16);
               M = var16 / ae.a;
               return false;
            case 27:
               int var1;
               if ((var1 = b(var0, 0)) >= 0) {
                  a.a(a.b[var1]);
                  av.a((byte)4);
               }

               System.out.println("WARNING >> \tNo implement!");
               return false;
            case 28:
               for(int var2 = b(var0, 0); var2 > 0; J += 2) {
                  --var2;
                  x var77;
                  if ((var77 = av.d(o.a(E, J, 2))) != null) {
                     var77.l(x.I);
                     var77.l(x.H);
                  }
               }

               av.l();
               break;
            case 29:
               int var3 = b(var0, 0);

               while(var3 > 0) {
                  --var3;
                  int var76 = b(3, 0);
                  int var90 = b(3, 1);
                  int var101 = b(3, 2);
                  int var111 = b(3, 3);
                  x var115;
                  if ((var115 = av.d(var76)) != null) {
                     if (var115 instanceof r && ((r)var115).a == 1) {
                        r var118;
                        if (!(var118 = (r)var115).m(x.Q)) {
                           var118.b = true;
                           var118.d();
                           av.a((byte)12);
                           return false;
                        }
                        break;
                     }

                     if (var115 instanceof ag) {
                        ((ag)var115).h();
                     } else if (!(var115 instanceof aa)) {
                        var115.a();
                     }

                     j.a((byte)2, var115.V[8], var115.V[9], (byte)-1);
                     if (var90 == -1 && var101 == -1) {
                        var90 = var115.V[8];
                        var101 = var115.V[9];
                     } else {
                        var90 = var90 * j.c() + (j.c() >> 1);
                        var101 = var101 * j.d() + (j.d() >> 1);
                     }

                     var115.k(x.I);
                     var115.d((short)var90, (short)var101);
                     var115.v((short)var111);
                     var115.ac = (short)var90;
                     var115.ad = (short)var101;
                  }
               }

               av.k();
               av.l();
               break;
            case 30:
               int var4;
               boolean var5 = (var4 = b(var0, 0)) > 0;

               while(var4 > 0) {
                  --var4;
                  int var100 = o.a(E, J, 2);
                  J += 2;
                  int var110 = o.a(E, J, 2);
                  J += 2;
                  int var8 = o.a(E, J, 2);
                  J += 2;
                  int var9 = o.a(E, J, 2);
                  J += 2;
                  int var10 = o.a(E, J, 2);
                  J += 2;
                  int var11 = o.a(E, J, 2);
                  J += 2;
                  boolean var12 = false;
                  J += 2;
                  x var13;
                  if ((var13 = av.d(var100)) != null) {
                     if (var110 == 1) {
                        var8 = var13.V[8] / j.c();
                        var9 = var13.V[9] / j.d();
                        switch(var11) {
                           case 0:
                              var8 += var10;
                              break;
                           case 1:
                              var8 -= var10;
                              break;
                           case 2:
                              var9 -= var10;
                              break;
                           case 3:
                              var9 += var10;
                        }
                     }

                     var8 = var8 * j.c() + (j.c() >> 1);
                     var9 = var9 * j.d() + (j.d() >> 1);
                     ((p)var13).a((short)var8, (short)var9, (short)var11, true);
                  }
               }

               a((byte)3);
               if (var5) {
                  return false;
               }
               break;
            case 31:
               q = (short)b(var0, 0);
               r = (short)b(var0, 1);
               b(var0, 2);
               an = (short)b(var0, 3);
               ao = (short)b(var0, 4);
               ap = (short)b(var0, 5);
               if (q >= 0) {
                  l.a("res.bin", new int[]{q}, l.g, l.h);
               }

               a((byte)4);
               return false;
            case 32:
               b(var0, 0);
               boolean var6 = false;
               b(var0, 1);
               boolean var7 = false;
               break;
            case 33:
               af = (byte)b(var0, 0);
               a((byte)5);
               return false;
            case 34:
               b(var0, 0);
               a((byte)2);
               return false;
         }
      }

      return true;
   }

   private static void l() {
      if (D != null) {
         D.av = false;
      }
   }

   private static void m() {
      if (D != null) {
         D.av = false;
      }
   }

   public static final void g() {
      if (X != -1) {
         if (a.c()) {
            if (X != 25) {
               m.b();
            } else {
               ab.h();
            }

            aa = null;
            X = -1;
         }
      } else if (W != -1) {
         if (a.c()) {
            t.a();
            Z = null;
            W = -1;
         }
      } else if (p.y <= 0 && F.size() <= 0) {
         if (M <= 0) {
            if (k()) {
               if (D != null) {
                  D.av = false;
               } else {
                  System.out.println("Error: runScript() ---------> objScriptRun is null!");
               }

               if (!h) {
                  D = null;
                  E = null;
                  if (a) {
                     a = false;
                  }

                  av.a(C);
                  return;
               }

               f();
               return;
            }
         } else if (M > 0) {
            --M;
         }
      }
   }

   private static void n() {
      x var0 = null;

      for(byte var1 = 0; var1 < av.x; ++var1) {
         if ((var0 = av.w[av.y[var1]]) != null && var0.m(x.G) && var0.m(x.N)) {
            var0.c();
         }
      }

      for(int var3 = 0; var3 < 1; ++var3) {
         if (av.r[var3] != null && av.r[var3].m(x.G) && av.r[var3].m(x.N)) {
            av.r[var3].c();
         }
      }
   }

   public static final void b(Graphics var0) {
      av.c(var0);
      if (W != -1) {
         if (Z == null) {
            Z = new t[1];
            Z[0] = t.a(aa.bg, W);
         }

         short[] var1 = k.a((short)8, (short)4);
         k.c(var0, 8, 4);
         o.b(var0, var1[0] + 5, var1[1] + 6, var1[2] - 10, var1[3] - 12, -585681064);
         k.c(var0, 8, 2);
         Z[0].a(k.a((short)8, (short)2));
         k.a(var0, "获得" + Z[0].p, 8, 1, 3, 65535, 0);
      }

      if (X != -1) {
         if (aa == null) {
            aa = new m[1];
            aa[0] = m.a(X);
         }

         short[] var2 = k.a((short)8, (short)4);
         k.c(var0, 8, 4);
         o.b(var0, var2[0] + 5, var2[1] + 6, var2[2] - 10, var2[3] - 12, -585681064);
         k.c(var0, 8, 2);
         aa[0].a(k.a((short)8, (short)2));
         k.a(var0, "获得" + aa[0].i + "x" + Y, 8, 1, 3, 65535, 0);
      }
   }

   private static int a(int var0, int var1) {
      byte var2 = c[var0][var1];
      int var3 = o.a(U, V, var2);
      V += var2;
      return var3;
   }

   private static int b(int var0, int var1) {
      byte var2 = c[var0][var1];
      int var3 = o.a(E, J, var2);
      J += var2;
      return var3;
   }

   private static void a(DataInputStream var0, int var1) throws Exception {
      short var2;
      int[] var3 = new int[(var2 = var0.readShort()) + 1];

      for(int var4 = 0; var4 < var3.length; ++var4) {
         var3[var4] = var0.readInt();
      }

      var0.skip((long)var3[var1]);
      short var8;
      R = new String[var8 = var0.readShort()];
      S = new short[var8][];

      for(int var5 = 0; var5 < var8; ++var5) {
         short var6 = var0.readShort();
         S[var5] = new short[var6];

         for(int var7 = 0; var7 < var6; ++var7) {
            S[var5][var7] = var0.readShort();
         }

         String var9 = var0.readUTF();
         R[var5] = var9;
      }

      var0.skip((long)(var3[var2] - var3[var1 + 1]));
   }

   private static void b(DataInputStream var0, int var1) throws Exception {
      short var2;
      int[] var3 = new int[(var2 = var0.readShort()) + 1];

      for(int var4 = 0; var4 < var3.length; ++var4) {
         var3[var4] = var0.readInt();
      }

      var0.skip((long)var3[var1]);
      av.a(var0, var1, false);
      var0.skip((long)(var3[var2] - var3[var1 + 1]));
   }

   private static boolean a(int var0, int var1, int var2) {
      switch(var1) {
         case 0:
            if (var0 > var2) {
               return true;
            }

            return false;
         case 1:
            if (var0 >= var2) {
               return true;
            }

            return false;
         case 2:
            if (var0 == var2) {
               return true;
            }

            return false;
         case 3:
            if (var0 <= var2) {
               return true;
            }

            return false;
         case 4:
            if (var0 < var2) {
               return true;
            }

            return false;
         case 5:
            if (var0 != var2) {
               return true;
            }

            return false;
         default:
            return false;
      }
   }

   public static final void h() {
      if (F.size() > 0) {
         for(int var0 = F.size() - 6; var0 >= 0; var0 -= 6) {
            x var1 = (x)F.elementAt(var0);
            int var2;
            if ((var2 = Integer.parseInt((String)F.elementAt(var0 + 5))) >= 0) {
               if (var2 == 0) {
                  int var14 = Integer.parseInt((String)F.elementAt(var0 + 2));
                  var1.d((short)var14);
               }

               --var2;
               F.removeElementAt(var0 + 5);
               F.insertElementAt(String.valueOf(var2), var0 + 5);
            } else if (var1.Y()) {
               int var3 = Integer.parseInt((String)F.elementAt(var0 + 3)) - 1;
               F.removeElementAt(var0 + 3);
               F.insertElementAt(String.valueOf(var3), var0 + 3);
               if (var3 <= 0) {
                  if (Integer.parseInt((String)F.elementAt(var0 + 4)) == 1) {
                     var1.a((short)0);
                  }

                  int var4 = 0;

                  for(short var5 = av.z; var4 < var5; ++var4) {
                     if (av.d(av.A[var4]).Y == var1.Y) {
                        --av.z;

                        for(int var7 = var4; var7 < av.z; ++var7) {
                           av.A[var7] = av.A[var7 + 1];
                        }
                        break;
                     }
                  }

                  F.removeElementAt(var0 + 5);
                  F.removeElementAt(var0 + 4);
                  F.removeElementAt(var0 + 3);
                  F.removeElementAt(var0 + 2);
                  F.removeElementAt(var0 + 1);
                  F.removeElementAt(var0);
               }
            }
         }
      }

      int var8 = 0;

      for(short var10 = av.x; var8 < var10; ++var8) {
         x var13;
         if ((var13 = av.d(av.y[var8])) != null && (var13 == null || !var13.m(x.Q) && var13.m(x.I))) {
            var13.D();
            if (var13.o(38)) {
               var13.P();
            }
         }
      }

      for(int var9 = 0; var9 < 1; ++var9) {
         aa var11;
         if ((var11 = av.r[var9]) != null && (var11 == null || !var11.m(x.Q) && var11.m(x.I))) {
            var11.D();
            var11.P();
         }
      }
   }

   private static void o() {
      v();
      w();
      k = new short[2];
   }

   private static void p() {
      l.a(new int[]{q}, l.g, l.h);
      k = null;
   }

   private static void q() {
      if (a.e(8192)) {
         a((byte)0);
         z = 1;
      }
   }

   private static void c(Graphics var0) {
      av.c(var0);
      aq[] var1 = i.a();
      i.a(l.h);
      var0.setColor(0);
      l.g[q].a(var0, r, k, 120, 160, false, null);
      d(var0);
      i.a(var1);
   }

   private static void d(Graphics var0) {
      switch(ap) {
         case 3:
            a(var0, aq, as, new int[]{25, 28, 190, 180}, t, 2, -1, 16272);
            return;
         case 7:
            a(var0, aq, as, new int[]{25, 28, 190, 180}, t, 1, -1, 16272);
            return;
         default:
            System.out.println("绘制CG时dlgShowType选项不对");
      }
   }

   public static final void i() {
      try {
         DataInputStream var0;
         (var0 = o.c("choice.bin")).readByte();
         short var1;
         ah = new int[var1 = var0.readShort()];
         r();
         int[] var2 = new int[var1 + 1];
         n = new String[var1];
         o = new short[var1][];
         l = new String[var1][];
         m = new short[var1][][];

         for(int var3 = 0; var3 < var1 + 1; ++var3) {
            var2[var3] = var0.readInt();
         }

         for(int var11 = 0; var11 < var1; ++var11) {
            short var4 = var0.readShort();
            o[var11] = new short[var4];

            for(int var5 = 0; var5 < var4; ++var5) {
               o[var11][var5] = var0.readShort();
            }

            String var12 = var0.readUTF();
            n[var11] = var12;
            short var6 = var0.readShort();
            l[var11] = new String[var6];
            m[var11] = new short[var6][];

            for(int var7 = 0; var7 < var6; ++var7) {
               short var8 = var0.readShort();
               m[var11][var7] = new short[var8];

               for(int var9 = 0; var9 < var8; ++var9) {
                  m[var11][var7][var9] = var0.readShort();
               }

               String var13 = var0.readUTF();
               l[var11][var7] = var13;
            }
         }
      } catch (Exception var10) {
         var10.printStackTrace();
      }
   }

   private static void r() {
      if (ah != null) {
         for(int var0 = 0; var0 < ah.length; ++var0) {
            ah[var0] = -1;
         }
      }
   }

   private static void s() {
      h = true;
      ac = n[af];
      ad = o[af];
      if (ae == null) {
         ae = new Vector();
      }

      ae.removeAllElements();
      int var0 = l[af].length;

      for(int var1 = 0; var1 < var0; ++var1) {
         ae.addElement(l[af][var1]);
      }

      av = 0;
      aw = ac.length();
      ag = 0;
      a.a();
   }

   private static void t() {
      h = false;
      D.as = 0;
      ae = null;
   }

   private static void u() {
      if (a.e(1)) {
         --ag;
         if (ag == -1) {
            ag = ae.size() - 1;
         }

         a.a();
      } else if (a.e(2)) {
         ++ag;
         if (ag == ae.size()) {
            ag = 0;
         }

         a.a();
      }

      if (a.e(8)) {
         if (aw == ac.length()) {
            av = 0;
            aw = ac.length();
         } else {
            av = aw;
            aw = ac.length();
         }

         a.a();
      }

      if (a.e(16384)) {
         ah[af] = ag;
         String var0;
         if ((var0 = (String)ae.elementAt(ag)).indexOf("离开") != -1) {
            D.as = 0;
            a((byte)0);
         } else if (var0.indexOf("购买材料") != -1) {
            h = false;
            D.av = false;
            d.b();
            d.a(11);
            d();
         } else if (var0.indexOf("强化装备") != -1) {
            h = false;
            D.av = false;
            d.b();
            d.a(10);
            d();
         } else {
            h = false;
            D.as = 1;
            c(D);
            k();
         }

         a.a();
      }
   }

   private static void e(Graphics var0) {
      av.c(var0);
      d.b(var0, 131587);
   }

   private static void d(int var0) {
      ai = var0;
   }

   private static void v() {
      switch(ap) {
         case 0:
            d(0);
      }
   }

   private static void w() {
      t = ao == 0 ? 4 : 3;
      x = ae.g * 3 >> 2;
      aq = R[an];
      as = S[an];
      ar = as.length / 3;
      av = 0;
      aw = aq.length();
      at = 16777215;
   }

   private static void x() {
      aN = o.a("tg");
      aO = false;
      ax[0] = 0;
      ax[1] = 0;
      s = av.d(al);
      aq = R[an];
      as = S[an];
      ar = as.length / 3;
      av.t.a((short)0);
      av = 0;
      aw = av;
      at = 16777215;
      switch(ak) {
         case 0:
            return;
         case 1:
            aB = 0;
            aC = 160;
            aD = 213;
            int var0 = aC / ae.g;
            int var1 = aD / ae.f;
            int var2 = var0 * var1;
            if (aq.length() <= var2) {
               if (aq.length() <= var0) {
                  ay = new String[1][1];
                  ay[0][0] = aq;
                  return;
               }

               int var10 = aq.length() / var0;
               ay = new String[1][var10 + 1];

               for(int var14 = 0; var14 < var10; ++var14) {
                  ay[0][var14] = aq.substring(var14 * var0, (var14 + 1) * var0);
               }

               ay[0][var10] = aq.substring(var10 * var0);
               return;
            }

            int var9;
            ay = new String[var9 = aq.length() / var0][var1];
            String var12 = null;

            for(int var15 = 0; var15 < var9 - 1; ++var15) {
               if (aq.length() > (var15 + 1) * var2) {
                  var12 = aq.substring(var15 * var2, (var15 + 1) * var2);
               } else {
                  if (aq.length() <= var15 * var2) {
                     return;
                  }

                  var12 = aq.substring(var15 * var2, aq.length());
               }

               for(int var6 = 0; var6 < var1; ++var6) {
                  if (var12.length() >= (var6 + 1) * var0) {
                     ay[var15][var6] = var12.substring(var6 * var0, (var6 + 1) * var0);
                  } else if (var12.length() >= var6 * var0) {
                     ay[var15][var6] = var12.substring(var6 * var0, var12.length());
                  }
               }
            }

            return;
         case 2:
            aG = 1;
            aF = 1;

            for(int var7 = 0; var7 < ar; ++var7) {
               if (as[var7 * 3 + 1] == 0 || as[var7 * 3 + 1] == 6) {
                  ++aF;
               }
            }

            aH = new int[aF + 1];
            aH[aF] = aq.length();
            int var8 = 1;

            for(int var11 = 0; var11 < ar; ++var11) {
               if (as[var11 * 3 + 1] == 0 || as[var11 * 3 + 1] == 6) {
                  aH[var8++] = as[var11 * 3 + 0];
               }
            }

            if (ar != 0) {
               aI = as[1] == 6;
               return;
            }
            break;
         case 3:
            if (j.g == 0) {
               aJ = o.a("cg");
               aK = o.a("cgmaskbar");
            }

            aL = 240 - aJ.getWidth();
            boolean var3 = false;
            aM[0] = 20;
            aM[1] = 260;
            aM[2] = (short)(240 - (aM[0] << 2));
            aM[3] = 60;
            u = aM[3] - 20;
            aw = aq.length();
            v = -aw * ae.g / aM[2] * ae.f;
            int var4 = 0;

            for(int var5 = 0; var5 < ar; ++var5) {
               if (as[var4 + 1] == 0) {
                  v -= ae.f;
               }

               var4 += 3;
            }

            return;
         case 4:
            at = 7729884;
      }
   }

   private static void y() {
      aN = null;
      if (s != null) {
         s.q(-1);
         s = null;
      }

      aK = null;
      aJ = null;
      aq = null;
      ar = 0;
      as = null;
      u = 0;
      v = 0;
      aH = null;
   }

   private static void z() {
      av.l();
      ac.b(false);
      switch(ak) {
         case 1:
            aB += 4;
            if (aB > ay[aE].length * ae.f + 1 && a.e(16384)) {
               ++aE;
               aB = 0;
               if (aE >= ay.length || ay[aE][0] == null) {
                  a((byte)0);
                  aE = 0;
               }

               a.a();
            }

            if (a.e(8192)) {
               a((byte)0);
            }

            return;
         case 2:
            if (a.e(2)) {
               ++aG;
               if (aG >= aF) {
                  aG = 1;
               }

               a.a();
            } else if (a.e(1)) {
               --aG;
               if (aG <= 0) {
                  aG = aF - 1;
               }

               a.a();
            }
         case 0:
         default:
            if (a.e(24576)) {
               if (!aO) {
                  aw = aq.length();
               } else if (aw == aq.length()) {
                  if (j != null) {
                     j = null;
                  }

                  a((byte)0);
               } else {
                  av = aw;
                  aO = false;
                  ++aw;
                  at = au;
               }

               a.a();
            }

            return;
         case 3:
            if (av.N % 2 == 0) {
               if (aL < 0) {
                  ++aL;
               }

               --u;
            }

            if (!a.e(8192) && (aL < 0 || u >= v)) {
               if (a.b(20480)) {
                  u -= 2;
                  aL += 2;
               }
            } else {
               a((byte)0);
            }
      }
   }

   private static void f(Graphics var0) {
      Object var1 = null;
      av.c(var0);
      switch(ak) {
         case 0:
            var0.setClip(0, 0, 240, 320);
            d.a(var0, 131584, am);
            short[] var11 = k.a((short)1, (short)3);
            a(var0, as, 2, var11, 6961408);
            return;
         case 1:
            o.a(var0, 0);
            az = 0;
            aA = 20;
            aA += 10;
            var0.setClip(az, aA, 240, aB);
            var0.setFont(ae.c);

            for(int var2 = 0; var2 < ay[aE].length; ++var2) {
               if (ay[aE][var2] != null) {
                  o.a(var0, ay[aE][var2], 120, aA + ae.f * var2, 17, 15975757, 0);
               }
            }

            var0.setClip(0, 0, 240, 320);
            var0.drawImage(aN, 240 - aN.getWidth(), 320 - aN.getHeight(), 0);
            return;
         case 2:
            d.b(var0, 131587);
            j = new Vector();

            for(int var12 = aI ? 0 : 1; var12 < aF; ++var12) {
               if (aG == var12) {
                  var0.setColor(16711680);
                  var0.setColor(-16711681);
               } else {
                  var0.setColor(at);
               }

               aq.substring(aH[var12], aH[var12 + 1]);
            }

            return;
         case 3:
            boolean var8 = false;
            if (aJ != null) {
               var0.drawImage(aJ, aL, 20, 20);
            }

            a(var0, as, 50, aM, 6961408);
            if (aK != null) {
               var0.drawImage(aK, 0, aM[1], 20);
               int var13 = aK.getWidth();
               int var10 = aK.getHeight();
               o.a(var0, aK, 0, 0, var13, var10, 0, 320 - var10, 20, 2);
            } else {
               o.b(var0, aM[0], aM[1], aM[2], 20, 1342177280);
               o.b(var0, aM[0], aM[1] + 20, aM[2], 20, -1728053248);
               o.b(var0, aM[0], aM[1] + aM[3] - 20 - 20, aM[2], 20, -1728053248);
               o.b(var0, aM[0], aM[1] + aM[3] - 20, aM[2], 20, 1342177280);
            }

            o.a(var0, "跳过", 240, 320, 40, 65535, 0);
            return;
         case 4:
            d.b(var0, 131586);
            short[] var9 = k.a((short)1, (short)5);
            a(var0, as, 2, var9, 6961408);
      }
   }

   private static void a(Graphics var0, short[] var1, int var2, short[] var3, int var4) {
      int var8 = var3[0];
      int var9 = var3[1] + 3 + u;
      int var10 = 0;
      var0.setColor(at);
      var0.setClip(var3[0], var3[1], var3[2], var3[3]);

      for(int var11 = av; var11 < aw; ++var11) {
         boolean var6 = false;
         int var12 = 0;

         label42:
         for(int var13 = 0; var13 < ar; ++var13) {
            if (var11 == var1[var12 + 0]) {
               switch(var1[var12 + 1]) {
                  case 0:
                     var6 = true;
                     break label42;
                  case 1:
                     int var14 = var1[var12 + 2] - 1;
                     s.q(var14);
                     var1[var12 + 1] = -1;
                     break label42;
                  case 2:
                     short var15 = var1[var12 + 2];
                     var0.setColor(c(var15));
                     var0.setFont(b(var15));
                     a(var0, var0.getFont(), var15);
                     break label42;
                  case 3:
                     var0.setColor(c(0));
                     var0.setFont(b(0));
                     a(var0, var0.getFont(), 0);
                     break label42;
                  default:
                     System.out.println("matchDialogSign():no match the dialog text sign = " + var1[var13 + 1]);
                     break label42;
               }
            }

            var12 += 3;
         }

         char var5 = aq.charAt(var11);
         if (var6 || var8 + var0.getFont().charWidth(var5) > var3[0] + var3[2]) {
            ++var10;
            var8 = var3[0];
            var9 += ae.f;
            if (var10 >= var2) {
               aw = var11;
               aO = true;
               continue;
            }
         }

         au = var0.getColor();
         if (var4 >= 0) {
            var0.setColor(var4);
            var0.drawChar(var5, var8 + 1, var9, 20);
            var0.drawChar(var5, var8 - 1, var9, 20);
            var0.drawChar(var5, var8, var9 + 1, 20);
            var0.drawChar(var5, var8, var9 - 1, 20);
         }

         var0.setColor(au);
         var0.drawChar(var5, var8, var9, 20);
         var8 += var0.getFont().charWidth(var5);
         if (var11 == aq.length() - 1) {
            aw = aq.length();
            aO = true;
         }
      }

      if (!aO) {
         ++aw;
      }
   }

   private static void A() {
      a.a();
   }

   private static void B() {
      d.a();
   }

   private static void g(Graphics var0) {
      o.a(var0, 0);
      d.a(var0);
   }

   private static void C() {
      aS = ac.h() + 120;
      aT = ac.j() + 160;
      boolean var0 = false;
      if (aP <= 0) {
         aP = 5;
      }

      Math.abs(aS - aQ);
      Math.abs(aT - aR);
   }

   private static void D() {
      if (p.y > 0) {
         av.k();
         n();
         av.l();
      } else {
         a((byte)0);
      }

      ac.b(false);
   }

   private static void h(Graphics var0) {
      av.c(var0);
   }

   private static void E() {
      w = new short[2];
   }

   private static void F() {
      w = null;
   }

   private static void G() {
      if (w[0] == 0 && w[1] == 0 && av.O > 1) {
         av.a(av.C);
      }
   }

   private static void i(Graphics var0) {
      av.c(var0);
      var0.setColor(0);
      if (aV >= 0 && aV < l.e.length) {
         i var1;
         if ((var1 = l.e[aV]) == null) {
            System.out
               .println(
                  ">>paint(): Cant paint! maybe you don't set \"Pack Anim?\" to \"No\"!! Or you dont select this animation into this scene! Or has error in load animation\n\tanimationID="
                     + aV
               );
         } else {
            var1.a(var0, aU, w, 120, 160, false);
         }
      }
   }

   public static final void a(Graphics var0, String var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7) {
      int var8 = var0.getFont().charWidth('汉');
      int var9 = var0.getFont().getHeight();
      if (z <= 0) {
         z = 1;
      }

      boolean var10 = false;
      byte var11 = 24;
      int var12 = var3[0] + var3[2] + B;
      int var13 = var3[1];
      if (var4 == 4) {
         var12 = var3[0] + B;
         var11 = 20;
      }

      for(int var14 = av; var14 < z; ++var14) {
         int var15 = 0;

         label79:
         for(int var16 = 0; var16 < ar; ++var16) {
            if (var14 == var2[var15 + 0]) {
               switch(var2[var15 + 1]) {
                  case 0:
                     var10 = true;
                     break label79;
                  case 1:
                     int var17 = var2[var15 + 2] - 1;
                     s.q(var17);
                     var2[var15 + 1] = -1;
                     break label79;
                  case 2:
                     short var18 = var2[var15 + 2];
                     var0.setColor(c(var18));
                     var0.setFont(b(var18));
                     a(var0, var0.getFont(), var18);
                     break label79;
                  case 3:
                     var0.setColor(c(0));
                     var0.setFont(b(0));
                     a(var0, var0.getFont(), 0);
                     break label79;
                  default:
                     System.out.println("matchDialogSign():no match the dialog text sign = " + ad[var16 + 1]);
                     break label79;
               }
            }

            var15 += 3;
         }

         if (var10 || var13 + var9 > var3[1] + var3[3]) {
            var10 = false;
            var13 = var3[1];
            if (var4 == 3) {
               if ((var12 -= var8 + x) < var3[0] - var8) {
                  B += var8 + x;
               }
            } else if (var4 == 4 && (var12 += var8 + x) > var3[0] + var3[2] - var8) {
               B -= var8 + x;
            }
         }

         if (A >= var9 + y) {
            ++z;
            A = 0;
            if (z > aw) {
               A = 0;
               z = 1;
               B = 0;
               a((byte)0);
               break;
            }
         }

         if (var14 == z - 1 && 2 == var5) {
            if (var4 == 4) {
               var0.setClip(var12, var13, var8 + x, A);
            } else if (var4 == 3) {
               var0.setClip(var12 - var8 - x, var13, var8 + x, A);
            }
         }

         if (var7 > -1) {
            var15 = var0.getColor();
            var0.setColor(var7);
            var0.drawChar(var1.charAt(var14), var12 - 1, var13, var11);
            var0.drawChar(var1.charAt(var14), var12, var13 - 1, var11);
            var0.drawChar(var1.charAt(var14), var12 + 1, var13, var11);
            var0.drawChar(var1.charAt(var14), var12, var13 + 1, var11);
            var0.setColor(var15);
         }

         if (var6 > -1) {
            var0.setColor(var6);
         } else {
            var0.setColor(16777215);
         }

         var0.drawChar(var1.charAt(var14), var12, var13, var11);
         var13 += var9 + y;
      }

      A += 3;
   }

   public static final void a(Graphics var0, String var1, short[] var2, short[] var3, int var4, int var5) {
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = var0.getFont().stringWidth(var1);
      var8 = var3[3] / var0.getFont().getHeight();
      if (var5 == 20) {
         var9 = var3[0];
         var10 = var3[1];
      } else if (var5 == 33) {
         var9 = var3[0] + (var11 >> 1);
         var10 = var3[1] + var3[3];
      } else if (var5 == 17) {
         var9 = var3[0] + (var11 >> 1);
         var10 = var3[1];
      }

      int var12 = 0;
      var0.setColor(at);
      int var13 = 0;

      for(int var14 = var1.length(); var13 < var14; ++var13) {
         boolean var7 = false;
         int var15 = 0;

         label47:
         for(int var16 = 0; var16 < var2.length / 3; ++var16) {
            if (var13 == var2[var15 + 0]) {
               switch(var2[var15 + 1]) {
                  case 0:
                     var7 = true;
                  case 1:
                     break label47;
                  case 2:
                     short var17 = var2[var15 + 2];
                     var0.setColor(c(var17));
                     var0.setFont(b(var17));
                     break label47;
                  case 3:
                     var0.setColor(c(0));
                     var0.setFont(b(0));
                     break label47;
                  default:
                     System.out.println("matchDialogSign():no match the dialog text sign = " + var2[var16 + 1]);
                     break label47;
               }
            }

            var15 += 3;
         }

         char var6 = var1.charAt(var13);
         if (var7 || var9 + var0.getFont().charWidth(var6) > var3[0] + var3[2]) {
            ++var12;
            var9 = var3[0];
            var10 += ae.f;
            if (var12 >= var8) {
               return;
            }
         }

         au = var0.getColor();
         if (var4 >= 0) {
            var0.setColor(var4);
            var0.drawChar(var6, var9 + 1, var10, var5);
            var0.drawChar(var6, var9 - 1, var10, var5);
            var0.drawChar(var6, var9, var10 + 1, var5);
            var0.drawChar(var6, var9, var10 - 1, var5);
         }

         var0.setColor(au);
         var0.drawChar(var6, var9, var10, var5);
         var9 += var0.getFont().charWidth(var6);
      }
   }

   public static final void j() {
      try {
         DataInputStream var0;
         (var0 = o.c("css.bin")).readByte();
         aX = new short[var0.readShort()][3];

         for(int var2 = 0; var2 < aX.length; ++var2) {
            for(int var3 = 0; var3 < 3; ++var3) {
               aX[var2][var3] = var0.readShort();
            }
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   public static final Font b(int var0) {
      switch(aX[var0][1]) {
         case 0:
            return ae.c;
         case 1:
            return ae.d;
         case 2:
            return ae.e;
         default:
            return ae.c;
      }
   }

   public static final int c(int var0) {
      short var1 = aX[var0][0];
      return aW[var1];
   }

   public static final void a(Graphics var0, Font var1, int var2) {
      switch(aX[var2][2]) {
         case 0:
            var0.setStrokeStyle(0);
            return;
         case 1:
            var0.setStrokeStyle(1);
            return;
         case 2:
            var0.setStrokeStyle(2);
      }
   }

   static {
      short[] var10000 = new short[]{0, 290, 36, 30};
      var10000 = new short[]{201, 295, 38, 30};
      var10000 = new short[]{0, 0, 240, 320};
      Font[] var2 = new Font[]{ae.c, ae.d, ae.e};
      int[] var3 = new int[]{0, 1, 2};
      int[] var4 = new int[]{0, 1, 2};
      int[] var5 = new int[]{0, 1, 2};
      String[] var6 = new String[]{"/N", "/C", "/F", "/A", "/S", "/B", "/R"};
   }
}
