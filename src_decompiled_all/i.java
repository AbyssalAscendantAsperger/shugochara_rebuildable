import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;

public final class i {
   private static short[] f = new short[4];
   private static short[] g = new short[4];
   private short[] h;
   private short[] i;
   private static aq[] j;
   public short a;
   private short[] k;
   private short[][] l;
   private short[][] m;
   private short n;
   private int[] o;
   private short p;
   private byte[] q;
   private byte[] r;
   private short[] s;
   private short t;
   private int[] u;
   public short b;
   private byte[] v;
   public byte[] c;
   public short[] d;
   private short w;
   public short[] e;
   private short x;
   private short y;
   private short[] z;
   private short[] A;
   private short B;
   private byte[] C;
   private short[] D = new short[2];
   private boolean E = false;

   public final byte[] a(int var1) {
      byte[] var2 = this.C;
      int var3 = this.v[var1] * 5;
      byte[] var4 = new byte[4];
      System.arraycopy(var2, var3, var4, 0, var4.length);
      return var4;
   }

   public static final void a(aq[] var0) {
      j = var0;
   }

   public static final aq[] a() {
      return j;
   }

   public final void a(Graphics var1, int var2, short[] var3, int var4, int var5, boolean var6, short[] var7) {
      this.a(var1, var2, var3[0], var4, var5, var6, var7);
   }

   public final void a(Graphics var1, int var2, short[] var3, int var4, int var5, boolean var6) {
      this.a(var1, var2, var3[0], var4, var5, var6);
      this.a((short)var2, var3);
   }

   public final void a(Graphics var1, int var2, short[] var3, int var4, int var5, int var6, int var7, boolean var8) {
      this.a(var1, var2, var3[0], var4, var5, var6, var7, var8);
      this.a((short)var2, var3);
   }

   public final void a(Graphics var1, int var2, int var3, int var4, int var5, boolean var6, short[] var7) {
      short[] var8 = var7 == null ? this.i : var7;

      for(int var11 = 0; var11 < this.a; ++var11) {
         int var9 = var8[var11] >> 8 & 0xFF;
         int var10 = var8[var11] & 255;
         this.h[var11] = var9 == 0 ? this.k[var11] : this.m[var11][var9 - 1];
         j[this.h[var11]].a(j[this.k[var11]], var10);
      }

      this.a(var1, var2, var3, var4, var5, var6);
   }

   public final void a(Graphics var1, int var2, int var3, int var4, int var5, boolean var6) {
      this.a(var1, var2, var3, var4, var5, -1, -1, var6);
   }

   public final void a(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      int var17;
      if ((var17 = this.d[var2] + (var3 << 1)) < this.e.length) {
         int var18 = this.e[var17] >> 0 & 1023;

         for(int var19 = 0; var19 < this.r[var18]; ++var19) {
            int var10 = this.s[var18] + var19;
            int var11 = this.u[var10] >> 18 & 1023;
            int var12 = this.u[var10] >> 9 & 511;
            int var13 = this.u[var10] & 511;
            int var14 = this.u[var10] >> 28 & 7;
            if ((var12 & 256) != 0) {
               var12 |= -512;
            }

            if ((var13 & 256) != 0) {
               var13 |= -512;
            }

            int var15 = this.o[var11] >> 16 & 65535;
            int var16 = this.o[var11] & 65535;
            aq var9 = this.c(var15);
            if (var8) {
               if ((var14 = var14 == 0 ? 4 : (var14 == 4 ? 0 : (var14 == 2 ? 5 : (var14 == 5 ? 2 : (var14 == 1 ? 6 : (var14 == 3 ? 7 : var14)))))) != 6
                  && var14 != 7) {
                  var12 = -var12 - var9.b(var16);
               } else {
                  var12 = -var12 - var9.c(var16);
               }
            }

            var9.a(var1, var16, var4 + var12, var5 + var13, var6, var7, 20, var14);
         }
      }
   }

   public final void b() {
      this.E = false;
   }

   private aq c(int var1) {
      int var2 = 0;

      while(var2 < this.a && this.k[var2] != var1) {
         ++var2;
      }

      return j[this.h[var2]];
   }

   public final short[] c() {
      if (this.i == null) {
         this.i = new short[this.a];
      }

      short[] var1 = new short[this.a];
      System.arraycopy(this.i, 0, var1, 0, this.a);
      return var1;
   }

   public final short[] a(byte var1, int var2, int var3) {
      if (var2 >= this.d.length) {
         return null;
      } else {
         int var4 = this.e[this.d[var2] + (var3 << 1)] >> 0 & 1023;
         int var5 = 0;
         switch(var1) {
            case 1:
               var5 = (this.q[var4 << 1] & 255) << 2;
               System.arraycopy(this.z, var5, g, 0, 4);
               return g;
            case 2:
               var5 = (this.q[(var4 << 1) + 1] & 255) << 2;
               System.arraycopy(this.A, var5, f, 0, 4);
               return f;
            default:
               return null;
         }
      }
   }

   public final boolean a(int var1, int var2) {
      short var3;
      return (var3 = this.e[this.d[var1] + (var2 << 1) + 1]) != false;
   }

   public final int b(int var1, int var2) {
      short var3;
      return (var3 = this.e[this.d[var1] + (var2 << 1) + 1]) & 15;
   }

   public final int c(int var1, int var2) {
      short var3;
      return ((var3 = this.e[this.d[var1] + (var2 << 1) + 1]) & 240) >> 4;
   }

   public final int d(int var1, int var2) {
      short var3;
      return ((var3 = this.e[this.d[var1] + (var2 << 1) + 1]) & 3840) >> 8;
   }

   public final int e(int var1, int var2) {
      if (this.d.length < var1) {
         return 0;
      } else {
         int var3;
         short var4;
         return (var3 = this.d[var1] + (var2 << 1) + 1) >= this.e.length ? 0 : ((var4 = this.e[var3]) & 61440) >> 12;
      }
   }

   public final boolean a(int var1, short[] var2) {
      if (var2 == null) {
         var2 = this.D;
      }

      if (this.c == null) {
         return true;
      } else {
         return var2[0] == this.c[var1] - 1;
      }
   }

   public final int b(int var1) {
      return this.c[var1];
   }

   public final int f(int var1, int var2) {
      return this.e[this.d[var1] + (var2 << 1)] >> 10 & 31;
   }

   public final void a(short var1, short[] var2) {
      if (!this.E) {
         ++var2[1];
         if (this.d.length >= var1) {
            int var3;
            if ((var3 = this.d[var1] + (var2[0] << 1)) < this.e.length) {
               int var4;
               if ((var4 = this.e[var3] >> 10 & 31) != 0 && var2[1] >= var4) {
                  var2[1] = 0;
                  ++var2[0];
                  if (var2[0] >= this.c[var1]) {
                     var2[0] = 0;
                  }
               }
            }
         }
      }
   }

   public static final i a(DataInputStream var0) throws Exception {
      i var1;
      (var1 = new i()).a = var0.readShort();
      var1.k = new short[var1.a];
      var1.h = new short[var1.a];
      var1.l = new short[var1.a][];
      var1.m = new short[var1.a][];

      for(int var2 = 0; var2 < var1.a; ++var2) {
         var1.k[var2] = var0.readShort();
         var1.h[var2] = var1.k[var2];
      }

      for(int var5 = 0; var5 < var1.a; ++var5) {
         short var3 = var0.readShort();
         var1.l[var5] = new short[var3];

         for(int var4 = 0; var4 < var3; ++var4) {
            var1.l[var5][var4] = var0.readShort();
         }
      }

      for(int var6 = 0; var6 < var1.a; ++var6) {
         byte var14 = var0.readByte();
         var1.m[var6] = new short[var14];

         for(int var15 = 0; var15 < var14; ++var15) {
            var1.m[var6][var15] = var0.readShort();
         }
      }

      var1.n = var0.readShort();
      var1.o = new int[var1.n];

      for(int var7 = 0; var7 < var1.n; ++var7) {
         var1.o[var7] = var0.readInt();
      }

      var1.p = var0.readShort();
      var1.q = new byte[var1.p << 1];
      var0.read(var1.q);
      var1.r = new byte[var1.p];
      var0.read(var1.r);
      var1.s = new short[var1.p + 1];

      for(int var8 = 0; var8 < var1.s.length; ++var8) {
         var1.s[var8] = var0.readShort();
      }

      var1.t = var0.readShort();
      var1.u = new int[var1.t];

      for(int var9 = 0; var9 < var1.t; ++var9) {
         var1.u[var9] = var0.readInt();
      }

      var1.b = var0.readShort();
      var1.v = new byte[var1.b];
      var0.read(var1.v);
      var1.c = new byte[var1.b];
      var0.read(var1.c);
      var1.d = new short[var1.b + 1];

      for(int var10 = 0; var10 < var1.d.length; ++var10) {
         var1.d[var10] = var0.readShort();
      }

      var1.w = var0.readShort();
      var1.e = new short[var1.w << 1];

      for(int var11 = 0; var11 < var1.e.length; ++var11) {
         var1.e[var11] = var0.readShort();
      }

      var1.x = var0.readShort();
      var1.y = var0.readShort();
      var1.z = new short[var1.x << 2];
      var1.A = new short[var1.y << 2];

      for(int var12 = 0; var12 < var1.z.length; ++var12) {
         var1.z[var12] = var0.readShort();
      }

      for(int var13 = 0; var13 < var1.A.length; ++var13) {
         var1.A[var13] = var0.readShort();
      }

      var1.B = var0.readShort();
      var1.C = new byte[var1.B * 5];
      var0.read(var1.C);
      var1.c();
      return var1;
   }

   public final void a(long[] var1) {
      for(int var2 = 0; var2 < this.k.length; ++var2) {
         var1[this.k[var2] >> 6] |= 1L << this.k[var2] % 64;

         for(int var3 = 0; var3 < this.m[var2].length; ++var3) {
            var1[this.m[var2][var3] >> 6] |= 1L << this.m[var2][var3] % 64;
         }
      }
   }

   public final void d() {
      this.o = null;
      this.q = null;
      this.r = null;
      this.u = null;
      this.v = null;
      this.c = null;
      this.e = null;
      this.z = null;
      this.A = null;
      this.C = null;
   }

   public final void a(Graphics var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      for(int var16 = 0; var16 < this.r[var2]; ++var16) {
         int var9 = this.s[var2] + var16;
         int var10 = this.u[var9] >> 18 & 1023;
         int var11 = this.u[var9] >> 9 & 511;
         int var12 = this.u[var9] & 511;
         int var13 = this.u[var9] >> 28 & 7;
         if ((var11 & 256) != 0) {
            var11 |= -512;
         }

         if ((var12 & 256) != 0) {
            var12 |= -512;
         }

         int var14 = this.o[var10] >> 16 & 65535;
         int var15 = this.o[var10] & 65535;
         aq var8 = this.c(var14);
         if (var7) {
            if ((var13 = var13 == 0 ? 4 : (var13 == 4 ? 0 : (var13 == 2 ? 5 : (var13 == 5 ? 2 : (var13 == 1 ? 6 : (var13 == 3 ? 7 : var13)))))) != 6
               && var13 != 7) {
               var11 = -var11 - var8.b(var15);
            } else {
               var11 = -var11 - var8.c(var15);
            }
         }

         var8.a(var1, var15, var3 + var11, var4 + var12, var5, var6, 20, var13);
      }
   }

   public final void e() {
      this.D[0] = 1;
      this.D[1] = 0;
   }
}
