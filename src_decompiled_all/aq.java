import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class aq {
   private boolean a;
   private short b;
   private short[] c;
   private short[] d;
   private byte e;
   private short f;
   private byte[] g;
   private byte[] h;
   private Image[] i;
   private Image[] j;
   private int k;
   private Image l;
   private boolean m;
   private static int[] n;

   public final void a(int var1) {
      if (this.f > 0) {
         if (var1 != this.k) {
            if (var1 >= 0 && var1 < this.e) {
               if (var1 != this.k) {
                  this.k = var1;
                  this.l = null;
                  if (!this.m) {
                     if (this.i[this.k] != null) {
                        this.l = this.i[this.k];
                        return;
                     }

                     this.a(this.h, this.g, this.k, this.f);
                     this.l = this.i[this.k] = Image.createImage(this.h, 0, this.h.length);

                     for(int var2 = 0; var2 < this.e; ++var2) {
                        if (this.i[var2] == null) {
                           return;
                        }
                     }

                     this.g = null;
                     this.h = null;
                  }
               }
            } else {
               throw new IllegalArgumentException("ContractionMLG->setPallette():Pallette index is illegal!");
            }
         }
      }
   }

   private void a(byte[] var1, byte[] var2, int var3, int var4) {
      int var5 = 8;
      int var6 = 0;

      while(true) {
         var6 = ((var1[var5] & 255) << 24) + ((var1[var5 + 1] & 255) << 16) + ((var1[var5 + 2] & 255) << 8) + (var1[var5 + 3] & 255);
         if (var1[var5 + 4] == 80 && var1[var5 + 5] == 76 && var1[var5 + 6] == 84 && var1[var5 + 7] == 69) {
            System.arraycopy(var2, var3 * var4, var1, var5 + 4 + 4, var6);
            a(var1, var5 + 4, 4 + var6);
            return;
         }

         var5 += 8 + var6 + 4;
      }
   }

   private static void b() {
      n = new int[256];

      for(int var1 = 0; var1 < 256; ++var1) {
         int var0 = var1;

         for(int var2 = 0; var2 < 8; ++var2) {
            if ((var0 & 1) == 1) {
               var0 = -306674912 ^ var0 >>> 1;
            } else {
               var0 >>>= 1;
            }
         }

         n[var1] = var0;
      }
   }

   private static void a(byte[] var0, int var1, int var2) {
      int var3 = -1;
      int var4 = var2 + var1;
      if (n == null) {
         b();
      }

      for(int var5 = var1; var5 < var4; ++var5) {
         var3 = n[(var3 ^ var0[var5]) & 0xFF] ^ var3 >>> 8;
      }

      int var6 = ~var3;
      var0[var4] = (byte)((0xFF000000 & var6) >> 24);
      var0[var4 + 1] = (byte)((0xFF0000 & var6) >> 16);
      var0[var4 + 2] = (byte)((0xFF00 & var6) >> 8);
      var0[var4 + 3] = (byte)(0xFF & var6);
   }

   public final void a(aq var1, int var2) {
      if (!this.a) {
         this.c = var1.c;
         this.d = var1.d;
         this.a(var2);
      }
   }

   public final void a(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var5 < 0) {
         var5 = this.c[var2 << 1];
      }

      if (var6 < 0) {
         var6 = this.c[(var2 << 1) + 1];
      }

      if (this.l == null) {
         o.a(var1, this.j[var2 + this.b * this.k], 0, 0, var5, var6, var3, var4, var7, var8);
      } else {
         short var9 = this.d[var2 << 1];
         short var10 = this.d[(var2 << 1) + 1];
         o.a(var1, this.l, var9, var10, var5, var6, var3, var4, var7, var8);
      }
   }

   public final int b(int var1) {
      return this.c[var1 << 1];
   }

   public final int c(int var1) {
      return this.c[(var1 << 1) + 1];
   }

   public static final aq a(DataInputStream var0) throws Exception {
      aq var1;
      (var1 = new aq()).a = var0.readByte() == 0;
      var1.b = var0.readShort();
      if (var1.a) {
         var1.c = new short[var1.b << 1];

         for(int var2 = 0; var2 < var1.b; ++var2) {
            var1.c[var2 << 1] = var0.readShort();
            var1.c[(var2 << 1) + 1] = var0.readShort();
         }

         var1.d = new short[var1.b << 1];

         for(int var3 = 0; var3 < var1.b; ++var3) {
            var1.d[var3 << 1] = var0.readShort();
            var1.d[(var3 << 1) + 1] = var0.readShort();
         }
      }

      var1.e = var0.readByte();
      var1.i = new Image[var1.e];
      var1.f = var0.readShort();
      if (var1.f > 0) {
         var1.g = new byte[var1.e * var1.f];
         var0.read(var1.g);
         var1.h = new byte[var0.readInt()];
         var0.read(var1.h);
         var1.j = new Image[var1.b * var1.e];
         var1.k = -1;
         var1.a(0);
      } else {
         byte[] var4 = new byte[var0.readInt()];
         var0.read(var4);
         var1.l = Image.createImage(var4, 0, var4.length);
      }

      return var1;
   }

   public final void a() {
      this.c = null;
      this.d = null;
      this.g = null;
      this.h = null;
      this.i = null;
      this.j = null;
      this.g = null;
      this.h = null;
      this.l = null;
      this.j = null;
   }

   static {
      System.out.println(">>ContractionMLG format is 'draw_png'.");
   }
}
