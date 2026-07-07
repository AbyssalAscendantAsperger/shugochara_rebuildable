import java.io.DataInputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class j {
   public static short a;
   public static byte[] b = new byte[81];
   public static short[] c = new short[405];
   public static byte d;
   public static short[] e = new short[81];
   public static aq[] f;
   private static j[] j;
   public static int g = 0;
   private short k;
   private short l;
   private byte m;
   private byte n;
   private short o;
   private short p;
   private byte[] q;
   private byte[] r;
   private byte[] s;
   private byte[] t;
   private byte u;
   private byte[] v;
   private byte[] w;
   private static byte x;
   private static short[][] y;
   private static short[][][] z;
   private static byte[][] A;
   private static byte[][] B;
   private byte C;
   private byte[] D;
   private byte[][] E;
   private static byte F;
   private static short[][] G;
   private static short[][][] H;
   private static byte[][] I;
   private static byte[][][] J;
   private static int K;
   private static int L;
   private static int M;
   private static int N;
   private static int O;
   private static int P;
   private static int Q;
   private static int R;
   private static byte S;
   private static byte T;
   public static final int h = av.A.length;
   public static final int i = av.A.length + 100;
   private static short[] U = new short[h * 3];
   private static short[] V = new short[i * 3];
   private static int W;
   private static int X;
   private static long[] Y;
   private static final short[] Z = new short[]{0, 0, 240, 160};
   private static final String[] aa = new String[]{"", "", "bg4", "bg5", "bg1", "bg1", "bg1", "bg2", "bg0"};
   private static final short[][] ab = new short[][]{
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z,
      Z
   };
   private static int ac = 0;
   private static Image ad = null;
   private static int ae = 0;
   private static int af = 0;
   private static int ag = 0;
   private static int ah = 0;
   private static int ai = 0;

   public static final void a(int var0) {
      j = new j[var0];
   }

   private static void a(Graphics var0, int var1, int var2, int var3, int var4) {
      short var13 = j[g].k;
      short var14 = j[g].l;

      for(int var15 = var1; var15 < var2; ++var15) {
         if (var15 >= 0) {
            if (var15 >= var14) {
               return;
            }

            int var5 = var15 * var13;

            for(int var16 = var3; var16 < var4; ++var16) {
               if (var16 >= 0) {
                  if (var16 >= var13) {
                     break;
                  }

                  int var6 = j[g].q[var5 + var16] & 255;
                  int var11 = (var16 - var3 << 4) + O;
                  int var12 = (var15 - var1 << 4) + P;
                  if (var6 != 255) {
                     int var7 = j[g].w[var6 << 1] & 255;
                     int var8 = j[g].w[(var6 << 1) + 1] & 255;
                     var6 = var7 << 1;
                     int var9 = j[g].v[var6++] & 255;
                     int var10 = j[g].v[var6] & 255;
                     f[var9].a(var0, var10, var11, var12, -1, -1, 20, var8);
                  }
               }
            }
         }
      }
   }

   private static void a(Graphics var0) {
      if (n.r <= 0) {
         x var1 = null;
         int var8 = N;
         int var9 = M;
         X = 0;
         W = 0;
         N -= 6;
         R += 6;
         M -= 7;
         Q += 7;
         if (j != null && j[g] != null) {
            short var10 = j[g].k;
            short var11 = j[g].l;
            int var12 = 0;

            for(int var13 = N; var13 < R; ++var13) {
               if (var13 >= 0) {
                  if (var13 >= var11) {
                     break;
                  }

                  int var2 = var13 * var10;

                  for(int var14 = M; var14 < Q; ++var14) {
                     if (var14 >= 0) {
                        if (var14 >= var10) {
                           break;
                        }

                        int var3 = var2 + var14;
                        int var4 = j[g].r[var3];
                        int var6 = (var14 - var9 << 4) + O;
                        int var7 = (var13 - var8 << 4) + P;
                        if (var4 != -1) {
                           if (var4 > -1) {
                              var12 = X * 3;
                              V[var12 + 0] = (short)(-(var4 + 1));
                              V[var12 + 1] = (short)var6;
                              V[var12 + 2] = (short)var7;
                              ++X;
                              if (X >= i) {
                              }
                           } else if (var4 > -128) {
                              var4 = -var4 + -2;

                              for(int var15 = 0; var15 < b[var4]; ++var15) {
                                 short var5;
                                 if ((var5 = c[var4 * 5 + var15]) < 80) {
                                    var1 = av.w[av.y[var5]];
                                 } else {
                                    var1 = av.r[var5 - 80];
                                 }

                                 if (((x)var1).V[4] == 0) {
                                    ((x)var1).a(var0, ((x)var1).V[8] - ac.h(), ((x)var1).V[9] - ac.j());
                                 } else if (((x)var1).V[4] == 100) {
                                    var12 = W * 3;
                                    U[var12 + 0] = ((x)var1).V[1];
                                    U[var12 + 1] = (short)(((x)var1).V[8] - K);
                                    U[var12 + 2] = (short)(((x)var1).V[9] - L);
                                    ++W;
                                    if (W >= h) {
                                    }
                                 } else {
                                    var12 = X * 3;
                                    V[var12 + 0] = ((x)var1).V[1];
                                    V[var12 + 1] = (short)(((x)var1).V[8] - K);
                                    V[var12 + 2] = (short)(((x)var1).V[9] - L);
                                    ++X;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }

            for(int var26 = 0; var26 < X; ++var26) {
               var12 = var26 * 3;
               short var30;
               if ((var30 = V[var12 + 0]) < 0) {
                  a(var0, V[var12 + 1], V[var12 + 2], -(var30 + 1));
               } else {
                  if (var30 >= av.u) {
                     var1 = av.w[var30];
                  } else {
                     var1 = av.t;
                  }

                  if (var1 != null) {
                     ((x)var1).a(var0, ((x)var1).V[8] - ac.h(), ((x)var1).V[9] - ac.j());
                  }
               }
            }

            int var27 = 0;

            for(short var31 = av.z; var27 < var31; ++var27) {
               if ((var1 = av.d(av.A[var27])) != null) {
                  var1.i();
               }
            }

            var27 = 0;

            for(int var32 = av.r.length; var27 < var32; ++var27) {
               aa var19;
               if ((var19 = av.r[var27]) != null) {
                  var19.i();
               }
            }

            for(int var29 = 0; var29 < W; ++var29) {
               short var33;
               if ((var33 = U[var29 * 3 + 0]) >= av.u) {
                  var1 = av.w[var33];
               } else {
                  var1 = av.t;
               }

               if (var1.m(x.I)) {
                  var1.a(var0, var1.V[8] - ac.h(), var1.V[9] - ac.j());
               }
            }
         }
      }
   }

   private static void a(Graphics var0, int var1, int var2, int var3) {
      int var11 = j[g].E[var3].length >> 2;

      for(int var12 = 0; var12 < var11; ++var12) {
         int var4 = var12 << 2;
         byte var5 = j[g].E[var3][var4++];
         byte var6 = j[g].E[var3][var4++];
         byte var7 = j[g].E[var3][var4++];
         byte var8 = j[g].E[var3][var4];
         var4 = var5 << 1;
         byte var9 = j[g].D[var4++];
         byte var10 = j[g].D[var4];
         f[var9].a(var0, var10, var1 + var7, var2 + var8, -1, -1, 20, var6);
      }
   }

   public static final void b(int var0) {
      DataInputStream var1 = null;

      try {
         if (Y == null) {
            Y = new long[(a >> 6) + 1];
         }

         long[] var2 = new long[Y.length];
         long[] var3 = new long[Y.length];
         long[] var4 = new long[Y.length];
         (var1 = o.c("map.bin")).readByte();
         int[] var6 = new int[var1.readByte() + 1];

         for(int var7 = 0; var7 < var6.length; ++var7) {
            var6[var7] = var1.readInt();
         }

         byte var27;
         int[] var8 = new int[(var27 = var1.readByte()) + 1];

         for(int var9 = 0; var9 < var8.length; ++var9) {
            var8[var9] = var1.readInt();
         }

         int var28 = -1;
         Vector var10 = new Vector();
         Vector var11 = new Vector();

         for(int var12 = 0; var12 < av.ab[var0].length; ++var12) {
            byte var13 = av.ab[var0][var12];
            if (j[var13] == null) {
               if (var12 == 0) {
                  var1.skip((long)var8[var13]);
               } else {
                  var1.skip((long)(var8[var13] - var8[var28 + 1]));
               }

               j var14;
               (var14 = new j()).k = var1.readShort();
               var14.l = var1.readShort();
               var14.m = var1.readByte();
               var14.n = var1.readByte();
               var14.o = (short)(var14.k * var14.m);
               var14.p = (short)(var14.l * var14.n);
               var14.u = var1.readByte();
               var14.C = var1.readByte();
               var14.q = new byte[var14.k * var14.l];
               var1.read(var14.q);
               var14.r = new byte[var14.k * var14.l];
               var1.read(var14.r);
               var14.s = new byte[var14.k * var14.l];
               var1.read(var14.s);
               var14.t = new byte[var14.s.length];
               if (!var10.contains(String.valueOf(var14.u))) {
                  boolean var15 = false;
                  int var16 = var10.size();

                  for(int var17 = 0; var17 < var16; ++var17) {
                     int var18 = Integer.parseInt((String)var10.elementAt(var17));
                     if (var14.u < var18) {
                        var10.insertElementAt(String.valueOf(var14.u), var17);
                        var15 = true;
                        var10.size();
                        break;
                     }
                  }

                  if (!var15) {
                     var10.addElement(String.valueOf(var14.u));
                  }
               }

               if (!var11.contains(String.valueOf(var14.C))) {
                  boolean var36 = false;
                  int var41 = var11.size();

                  for(int var47 = 0; var47 < var41; ++var47) {
                     int var56 = Integer.parseInt((String)var11.elementAt(var47));
                     if (var14.C < var56) {
                        var11.insertElementAt(String.valueOf(var14.C), var47);
                        var36 = true;
                        var11.size();
                        break;
                     }
                  }

                  if (!var36) {
                     var11.addElement(String.valueOf(var14.C));
                  }
               }

               j[var13] = var14;
               var28 = var13;
            }
         }

         var1.skip((long)(var8[var27] - var8[var28 + 1]));
         int var31 = var1.readByte() & 255;
         if (y == null) {
            y = new short[var31][];
         }

         if (z == null) {
            z = new short[var31][][];
         }

         if (A == null) {
            A = new byte[var31][];
         }

         if (B == null) {
            B = new byte[var31][];
         }

         int[] var32 = new int[var31 + 1];

         for(int var33 = 0; var33 < var32.length; ++var33) {
            var32[var33] = var1.readInt();
         }

         var28 = -1;

         for(int var34 = 0; var34 < var31; ++var34) {
            if (var10.contains(String.valueOf(var34)) && y[var34] == null) {
               if (var34 == 0) {
                  var1.skip((long)var32[var34]);
               } else {
                  var1.skip((long)(var32[var34] - var32[var28 + 1]));
               }

               x = var1.readByte();
               y[var34] = new short[x];
               z[var34] = new short[x][];

               for(int var37 = 0; var37 < x; ++var37) {
                  y[var34][var37] = var1.readShort();
                  var2[y[var34][var37] >> 6] |= 1L << y[var34][var37] % 64;
               }

               for(int var38 = 0; var38 < x; ++var38) {
                  short var42 = var1.readShort();
                  z[var34][var38] = new short[var42];

                  for(int var48 = 0; var48 < var42; ++var48) {
                     z[var34][var38][var48] = var1.readShort();
                  }
               }

               int var39 = var1.readByte() & 255;
               A[var34] = new byte[var39 << 1];
               var1.read(A[var34]);
               int var43 = var1.readByte() & 255;
               B[var34] = new byte[var43 << 1];
               var1.read(B[var34]);
               var28 = var34;
            }
         }

         var1.skip((long)(var32[var31] - var32[var28 + 1]));
         byte var35 = var1.readByte();
         if (G == null) {
            G = new short[var35][];
         }

         if (H == null) {
            H = new short[var35][][];
         }

         if (I == null) {
            I = new byte[var35][];
         }

         if (J == null) {
            J = new byte[var35][][];
         }

         int[] var40 = new int[var35 + 1];

         for(int var44 = 0; var44 < var40.length; ++var44) {
            var40[var44] = var1.readInt();
         }

         var28 = -1;

         for(int var45 = 0; var45 < var35; ++var45) {
            if (var11.contains(String.valueOf(var45)) && G[var45] == null) {
               if (var45 == 0) {
                  var1.skip((long)var40[var45]);
               } else {
                  var1.skip((long)(var40[var45] - var40[var28 + 1]));
               }

               F = var1.readByte();
               G[var45] = new short[F];
               H[var45] = new short[F][];

               for(int var49 = 0; var49 < F; ++var49) {
                  G[var45][var49] = var1.readShort();
                  var2[G[var45][var49] >> 6] |= 1L << G[var45][var49] % 64;
               }

               for(int var50 = 0; var50 < F; ++var50) {
                  short var57 = var1.readShort();
                  H[var45][var50] = new short[var57];

                  for(int var19 = 0; var19 < var57; ++var19) {
                     H[var45][var50][var19] = var1.readShort();
                  }
               }

               byte var51 = var1.readByte();
               I[var45] = new byte[var51 << 1];
               var1.read(I[var45]);
               byte var58 = var1.readByte();
               J[var45] = new byte[var58][];

               for(int var59 = 0; var59 < var58; ++var59) {
                  byte var20 = var1.readByte();
                  J[var45][var59] = new byte[var20 << 2];
                  var1.read(J[var45][var59]);
               }

               var28 = var45;
            }
         }

         var1.skip((long)(var40[var35] - var40[var28 + 1]));
         int[] var46 = new int[a + 1];

         for(int var52 = 0; var52 < var46.length; ++var52) {
            var46[var52] = var1.readInt();
         }

         for(int var53 = 0; var53 < Y.length; ++var53) {
            var3[var53] = (Y[var53] ^ var2[var53]) & Y[var53];
            var4[var53] = (Y[var53] ^ var2[var53]) & var2[var53];
            Y[var53] |= var4[var53];
            Y[var53] &= ~var3[var53];
         }

         for(int var54 = 0; var54 < a; ++var54) {
            if ((var3[var54 >> 6] & 1L << var54 % 64) != 0L) {
               f[var54].a();
               f[var54] = null;
            }
         }

         for(int var55 = 0; var55 < a; ++var55) {
            if ((var4[var55 >> 6] & 1L << var55 % 64) != 0L) {
               f[var55] = aq.a(var1);
            } else {
               var1.skip((long)(var46[var55 + 1] - var46[var55]));
            }
         }

         var1.close();
      } catch (Exception var24) {
         var24.printStackTrace();
         --av.ad;
      } finally {
         ;
      }

      g = var0;
      e();
      f();
   }

   private static void f() {
      S = (byte)(240 / j[g].m);
      T = (byte)(320 / j[g].n);
      if (240 % j[g].m != 0) {
         ++S;
      }

      if (320 % j[g].n != 0) {
         ++T;
      }

      ++S;
      ++T;
   }

   public static final int a(byte var0, int var1, int var2) {
      j var3 = j[g];
      int var4;
      if ((var4 = (var2 >> 4) * var3.k + (var1 >> 4)) >= 0 && var4 < var3.q.length && var4 < var3.r.length && var4 < var3.s.length && var4 < var3.t.length) {
         switch(var0) {
            case 1:
               return j[g].q[var4] & 0xFF;
            case 2:
               return j[g].r[var4];
            case 3:
               return j[g].s[var4];
            case 4:
               return j[g].t[var4];
            default:
               return -1;
         }
      } else {
         return -1;
      }
   }

   public static final short a(byte var0, int var1, int var2, byte var3) {
      int var4 = 0;
      j var5 = j[g];
      if (var0 == 1) {
         var4 = var5.w.length >> 1;
      } else if (var0 == 2) {
         var4 = var5.E.length;
      }

      if ((var0 == 1 || var0 == 2) && var3 > var4 + -1) {
         String var7 = var0 == 1 ? "MAP" : (var0 == 2 ? "BUILD" : "DATA");
         System.out.println("ERROR! setLayerData():value is invalid, exceed the max index, oprate \"" + var7 + "\", value=" + var3);
         return -1;
      } else {
         int var6 = var2 / var5.m * var5.k + var1 / var5.n;
         a(var0, var3, var6);
         return (short)var6;
      }
   }

   private static void a(byte var0, byte var1, int var2) {
      j var3 = j[g];
      if (var2 >= 0 && var2 < var3.q.length && var2 < var3.r.length && var2 < var3.s.length && var2 < var3.t.length) {
         switch(var0) {
            case 1:
               var3.q[var2] = var1;
               return;
            case 2:
               var3.r[var2] = var1;
               return;
            case 3:
               var3.s[var2] = var1;
               return;
            case 4:
               if (var2 < var3.t.length) {
                  var3.t[var2] = var1;
               }
         }
      }
   }

   public static final short b(byte var0, int var1, int var2, byte var3) {
      int var4 = 0;
      if (var0 == 1) {
         var4 = j[g].w.length >> 1;
      } else if (var0 == 2) {
         var4 = j[g].E.length;
      }

      if (var3 > var4 + -1) {
         String var6 = var0 == 1 ? "MAP" : (var0 == 2 ? "BUILD" : "DATA");
         System.out.println("ERROR! setLayerData():value is invalid, exceed the max index, oprate \"" + var6 + "\", value=" + var3);
         return -1;
      } else {
         int var5 = var2 * j[g].k + var1;
         a(var0, var3, var5);
         return (short)var5;
      }
   }

   public static final short a(byte var0, short var1, byte var2) {
      a(var0, var2, var1);
      return var1;
   }

   public static final int a(int var0, int var1) {
      int var2;
      if ((var2 = var1 / j[g].m * j[g].k + var0 / j[g].n) >= 0 && var2 < j[g].q.length) {
         byte var3;
         if ((var3 = j[g].s[var2]) > 0) {
            switch(var3) {
               case 1:
                  return 3;
               case 2:
                  return 1;
               case 3:
                  return 16;
               case 4:
               case 5:
               case 6:
               case 8:
               default:
                  return 3;
               case 7:
                  return 4;
               case 9:
                  return 32;
            }
         } else {
            Object var4 = null;

            for(int var5 = 0; var5 < av.z; ++var5) {
               short[] var6;
               x var8;
               if ((var8 = av.w[av.A[var5]]) != null
                  && (var8 == null || var8.Z)
                  && var8 != null
                  && var8.n(x.I)
                  && var8.Z
                  && (var6 = var8.ae()) != null
                  && o.a(var0, var1, var6)) {
                  return 3;
               }
            }

            byte var10;
            if ((var10 = j[g].r[var2]) == -1) {
               return 0;
            } else if (var10 > -1) {
               return 1;
            } else if (var10 <= -2 && -83 < var10) {
               var10 = -var10 + -2;

               for(int var7 = 0; var7 < b[var10]; ++var7) {
                  short var12;
                  if ((var12 = c[var10 * 5 + var7]) < 80) {
                     var4 = av.w[av.y[var12]];
                  } else {
                     var4 = av.r[var12 - 80];
                  }

                  if (var4 == null || var4 != null && !((x)var4).Z) {
                     return 0;
                  }

                  if (((x)var4).V[4] != 0 && ((x)var4).V[4] != 100) {
                     return 3;
                  }
               }

               return 0;
            } else {
               return 3;
            }
         }
      } else {
         return 67;
      }
   }

   public static final int b(int var0, int var1) {
      int var2;
      if ((var2 = var1 / j[g].m * j[g].k + var0 / j[g].n) >= 0 && var2 < j[g].q.length) {
         byte var3;
         if ((var3 = j[g].s[var2]) > 0) {
            switch(var3) {
               case 1:
                  return 3;
               case 2:
                  return 1;
               case 3:
                  return 16;
               case 4:
               case 5:
               case 6:
               case 8:
               default:
                  break;
               case 7:
                  return 4;
               case 9:
                  return 3;
            }
         }

         byte var4;
         if ((var4 = j[g].r[var2]) == -1) {
            return 0;
         } else if (var4 > -1) {
            return 3;
         } else {
            return var4 <= -2 && -83 < var4 ? 0 : 3;
         }
      } else {
         return 67;
      }
   }

   public static final void c(int var0) {
      if (var0 == -1) {
         for(int var4 = 0; var4 < j.length; ++var4) {
            if (j[var4] != null) {
               j[var4].g();
               j[var4] = null;
            }
         }
      } else {
         for(int var1 = 0; var1 < j.length; ++var1) {
            boolean var2 = true;

            for(int var3 = 0; var3 < av.ab[var0].length; ++var3) {
               if (av.ab[var0][var3] == var1) {
                  var2 = false;
                  break;
               }
            }

            if (var2 && j[var1] != null) {
               j[var1].g();
               j[var1] = null;
            }
         }
      }
   }

   private void g() {
      this.q = null;
      this.r = null;
      this.s = null;
      this.t = null;
      this.v = null;
      this.w = null;
      y[this.u] = null;
      A[this.u] = null;
      B[this.u] = null;
      this.D = null;
      this.E = (byte[][])null;
      G[this.C] = null;
      I[this.C] = null;
      J[this.C] = (byte[][])null;
   }

   public static final void d(int var0) {
      ac = var0;
      String var1;
      if (!(var1 = aa[av.m]).equals("")) {
         ad = o.a(var1);
         if (ad != null) {
            ae = ad.getWidth();
            af = ad.getHeight();
            ag = ab[var0][0];
            ah = ab[var0][1];
         }
      }
   }

   private static void a(Graphics var0, byte var1) {
      if (ad != null && !aa[av.m].equals("")) {
         if (n.m == 0) {
            o.a(var0, 0);
         }

         if (ac.o()) {
            ag = ae - ac.h() % ae;
         }

         ai = (ab[ac][2] - ag + ae) / (ae + 1);
         if (ag <= -ae) {
            ag = 0;
         } else if (ag > 0) {
            ag -= ae;
         }

         if (ah <= -af) {
            ah = 0;
         } else if (ah > 0) {
            ah -= af;
         }

         for(int var2 = 0; var2 <= ai; ++var2) {
            int var3 = ag + var2 * ae;
            int var4 = ah;
            o.a(var0, ad, 0, 0, ae, af, var3, var4, 20, 0);
         }
      }
   }

   public static final void a(Graphics var0, int var1, int var2) {
      K = var1;
      L = var2;
      if (j[g] != null) {
         N = L >> 4;
         M = K >> 4;
         R = N + T;
         Q = M + S;
         P = -(L % j[g].n);
         O = -(K % j[g].m);
         if (n.m > 0) {
            var0.translate(-n.o, -n.p);
         }

         a(var0, ac.n());
         a(var0, N, R, M, Q);
         a(var0);
      }
   }

   public static final void e(int var0) {
      boolean var1 = true;

      for(int var2 = 0; var2 < av.ab[g].length; ++var2) {
         if (av.ab[g][var2] == var0) {
            var1 = false;
            break;
         }
      }

      if (var1) {
         System.out.println("地图加载错误：ID=" + var0 + "，不在当前地图缓存中!");
      } else {
         g = var0;
         byte var4 = j[g].u;
         j[g].w = B[var4];
         j[g].v = A[var4];
         byte var3 = j[g].C;
         j[g].E = J[var3];
         j[g].D = I[var3];
         f();
      }
   }

   public static final int a() {
      return j[g].o;
   }

   public static final int b() {
      return j[g].p;
   }

   public static final int c() {
      return j[g].m;
   }

   public static final int d() {
      return j[g].n;
   }

   public static final void e() {
      for(int var0 = d - 1; var0 >= 0; --var0) {
         a((byte)2, e[var0], (byte)-1);
      }
   }

   static {
      short[] var10000 = new short[]{0, 0, 240, 320};
      var10000 = new short[]{0, 0, 240, 213};
   }
}
