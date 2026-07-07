import java.io.DataInputStream;

public final class ac extends x {
   private static short l;
   private static short m;
   private static short n;
   private static short o;
   private static short[] p;
   public static short[] a;
   private static short[] q;
   private static x r;
   private static ac s;
   private static boolean t = false;
   private static byte u = 0;
   public static int b = 10;
   public static boolean c = false;
   private static boolean v;
   private static short w = -1;
   private static short x = -1;
   private static short y = -1;
   private static short z = -1;
   private static short A = 0;
   private static x B;
   private boolean aJ = true;
   public byte[] d;
   public static short e = 0;
   public static short[] f = new short[]{-120, -160, 360, 480};
   public static short[] g = new short[]{-16, -16, 256, 336};
   public static x h;
   public static short i;
   public static short j;
   public static short k;

   public final void a() {
      super.W = new int[20];
      super.W[16] = super.V[20];
      super.W[17] = super.V[21];
      super.W[18] = super.V[22];
      super.W[19] = super.V[23];
      super.a();
      this.d = new byte[4];
      this.d[1] = (byte)super.V[18];
      this.d[0] = (byte)super.V[19];
      this.d[2] = (byte)super.V[16];
      this.d[3] = (byte)super.V[17];
      e = (short)(j.b() - 160);
   }

   public final boolean d() {
      if (this.aJ) {
         if (super.W[17] >= 0 && ai.e[super.W[17]] > 0) {
            this.f();
            return this.aJ;
         }

         if (r == null || !this.aJ) {
            a(null, false);
         } else if (s != this && this.b(r)) {
            a(this, false);
            a(r, false);
            if (super.W[16] > -1) {
               ai.e[super.W[16]] = 1;
            }
         } else if (s == this && !this.b(r)) {
            a(null, false);
         }
      }

      return true;
   }

   public final void f() {
      this.aJ = false;
      a(null, false);
   }

   public static final void a(short var0, short var1, short var2, short var3) {
      l = var0;
      m = var1;
      n = var2;
      o = var3;
      a = new short[4];
      a[0] = l;
      a[1] = m;
      a[2] = (short)(l + n);
      a[3] = (short)(m + o);
      p = new short[4];
      s = null;
   }

   public static final void a(int var0, int var1, int var2, int var3) {
      p[0] = (short)var0;
      p[1] = (short)var1;
      p[2] = (short)(var0 + var2);
      p[3] = (short)(var1 + var3);
   }

   public static final void a(ac var0, boolean var1) {
      s = var0;
      Object var2 = null;
      Object var3 = null;
      short[] var8;
      byte[] var9;
      if (s == null) {
         var8 = p;
         var9 = new byte[]{1, 1, 1, 1};
      } else {
         var8 = s.M();
         var9 = s.d;
      }

      short var4 = 0;
      if (var9[1] == 1) {
         var4 = var8[0];
      } else {
         var4 = p[0];
      }

      short var5 = 0;
      if (var9[2] == 1) {
         var5 = var8[1];
      } else {
         var5 = p[1];
      }

      short var6 = 0;
      if (var9[0] == 1) {
         var6 = var8[2];
      } else {
         var6 = p[2];
      }

      short var7 = 0;
      if (var9[3] == 1) {
         var7 = var8[3];
      } else {
         var7 = p[3];
      }

      if (s != null) {
         var4 = (short)(var4 - s.W[18]);
         var5 = (short)(var5 - s.W[19]);
         var6 = (short)(var6 + s.W[18]);
         var7 = (short)(var7 + s.W[19]);
      }

      a(new short[]{var4, var5, var6, var7}, var1);
   }

   public static final void a(x var0, short var1, short var2, short var3) {
      v = true;
      B = var0;
      var2 = var2 > e ? var2 : e;
      w = (short)(var1 - 120);
      x = (short)(var2 - 160);
      y = -1;
      z = -1;
      A = var3;
   }

   public static final boolean g() {
      if (!v) {
         return true;
      } else {
         boolean var0 = false;
         int var1 = l;
         int var2 = m;
         if (var1 == y && var2 == z) {
            var0 = true;
         } else if (o.f(w - var1, x - var2) < A) {
            var0 = true;
            var1 = w;
            var2 = x;
         } else {
            y = (short)var1;
            z = (short)var2;
            int var5 = o.c(w - var1, -(x - var2));
            int var3 = o.d(A, var5);
            int var4 = -o.e(A, var5);
            var1 += var3;
            var2 += var4;
         }

         b((short)var1, (short)var2);
         if (var0) {
            B.av = false;
            w = -1;
            x = -1;
            b = A;
            A = 0;
            B = null;
            v = false;
         }

         return var0;
      }
   }

   public static final boolean b(boolean var0) {
      if (c) {
         return false;
      } else {
         int var1 = 0;
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         if (r != null && !v) {
            var3 = l;
            var1 = l;
            var4 = m;
            var2 = m;
            short var5 = 0;
            short var6 = 0;
            if (r != null) {
               var5 = r.V[8];
               var6 = r.V[9];
            }

            if (r != null) {
               short var7;
               u = z.a(var7 = r.V[15]);
               switch(var7) {
                  case 0:
                     var1 = var5 - n / 3 * 1;
                     var2 = var6 - (o >> 1);
                     break;
                  case 1:
                     var1 = var5 - n / 3 * 2;
                     var2 = var6 - (o >> 1);
                     break;
                  case 2:
                     var2 = var6 - o / 2 * 1;
                     var1 = var5 - (n >> 1);
                     break;
                  case 3:
                     var2 = var6 - o / 2 * 1;
                     var1 = var5 - (n >> 1);
                     break;
                  case 4:
                     var2 = var6 - o / 2 * 1;
                     var1 = var5 - n / 3 * 1;
                     break;
                  case 5:
                     var2 = var6 - o / 2 * 1;
                     var1 = var5 - n / 3 * 2;
                     break;
                  case 6:
                     var1 = var5 - n / 2 * 1;
                     var2 = var6 - o / 3 * 1;
                     break;
                  case 7:
                     var2 = var6 - o / 2 * 1;
                     var1 = var5 - n / 3 * 2;
               }
            }

            short var15 = q[0];
            short var8 = q[1];
            int var9 = q[2] - q[0];
            int var10 = q[3] - q[1];
            if (var9 <= n) {
               var1 = var15 + (var9 >> 1) - (n >> 1);
            } else if (var1 < var15) {
               var1 = var15;
            } else if (var1 + n > var15 + var9) {
               var1 = var15 + var9 - n;
            }

            if (var10 <= o) {
               var2 = var8 + (var10 >> 1) - (o >> 1);
            } else if (var2 < var8) {
               var2 = var8;
            } else if (var2 + o > var8 + var10) {
               var2 = var8 + var10 - o;
            }

            t = var3 != var1 || var4 != var2;
            if (!var0) {
               if (var3 > var1) {
                  if ((var3 -= b) < var1) {
                     var3 = var1;
                  }
               } else if (var3 < var1 && (var3 += b) > var1) {
                  var3 = var1;
               }

               if (var4 > var2) {
                  if ((var4 -= b) < var2) {
                     var4 = var2;
                  }
               } else if (var4 < var2 && (var4 += b) > var2) {
                  var4 = var2;
               }
            } else {
               var3 = var1;
               var4 = var2;
            }

            b((short)var3, (short)var4);
            return var3 == var1 && var4 == var2;
         } else {
            return g();
         }
      }
   }

   public static final void b(short var0, short var1) {
      l = var0;
      m = var1;
      if (l < 0) {
         l = 0;
      }

      if (m < 0) {
         m = 0;
      }

      a[0] = l;
      a[1] = m;
      a[2] = (short)(l + n);
      a[3] = (short)(m + o);
   }

   public static final int h() {
      return l;
   }

   public static final int j() {
      return m;
   }

   public static final short[] l() {
      return a;
   }

   public static final boolean a(x var0, boolean var1) {
      if (var0 != r) {
         r = var0;
      }

      if (var1) {
         b(true);
         return true;
      } else {
         return false;
      }
   }

   public static final boolean a(short[] var0, boolean var1) {
      q = var0;
      if (var1) {
         b(true);
         return true;
      } else {
         return false;
      }
   }

   public static final void a(DataInputStream var0) throws Exception {
      var0.readBoolean();
      i = var0.readShort();
      j = var0.readShort();
   }

   public static final void m() {
      h = null;
   }

   public static final byte n() {
      return u;
   }

   public static final boolean o() {
      return t;
   }
}
