import java.io.DataInputStream;

public abstract class l {
   public static int[] a;
   public static short b;
   public static short c;
   public static short[][] d;
   public static i[] e;
   public static aq[] f;
   public static i[] g = new i[20];
   public static aq[] h = new aq[20];

   public static final i[] a(String var0, int[] var1, i[] var2, aq[] var3) {
      try {
         DataInputStream var4;
         (var4 = o.c(var0)).readByte();
         long[] var5 = new long[(var3.length >> 6) + 1];
         short var6 = var4.readShort();
         short var7 = var4.readShort();
         int[] var8 = new int[var6 + 1];

         for(int var9 = 0; var9 < var8.length; ++var9) {
            var8[var9] = var4.readInt();
         }

         o.a(var1);
         int var13 = 0;

         for(int var10 = 0; var10 < var2.length; ++var10) {
            if (var1.length > 0 && var10 == var1[var13]) {
               var2[var10] = i.a(var4);
               if (++var13 >= var1.length - 1) {
                  var13 = var1.length - 1;
               }
            } else if (var10 < var6) {
               var4.skip((long)(var8[var10 + 1] - var8[var10]));
            }
         }

         var8 = new int[var7 + 1];

         for(int var14 = 0; var14 < var8.length; ++var14) {
            var8[var14] = var4.readInt();
         }

         for(int var15 = 0; var15 < var2.length; ++var15) {
            if (var2[var15] != null) {
               var2[var15].a(var5);
            }
         }

         for(int var16 = 0; var16 < var3.length && var16 < var8.length - 1; ++var16) {
            if ((var5[var16 >> 6] & 1L << var16 % 64) != 0L && var3[var16] == null) {
               var3[var16] = aq.a(var4);
            } else {
               var4.skip((long)(var8[var16 + 1] - var8[var16]));
            }
         }

         var4.close();
      } catch (Exception var11) {
         var11.printStackTrace();
         --av.ad;
      }

      return var2;
   }

   public static final void a(int var0, int var1) {
      Object var2 = null;
      Object var3 = null;
      long[] var7 = new long[(b >> 6) + 1];

      for(int var4 = 0; var4 < var7.length; ++var4) {
         var7[var4] = 0L;
      }

      int var8 = var0;

      for(int var5 = d[var0].length - 1; var5 >= 0; --var5) {
         short var6;
         if ((var6 = d[var8][var5]) != -1) {
            var7[var6 >> 6] |= 1L << var6 % 64;
         }
      }

      if (var1 != -1) {
         for(int var9 = d[var1].length - 1; var9 >= 0; --var9) {
            short var12;
            if ((var12 = d[var1][var9]) != -1 && (var7[var12 >> 6] & 1L << var12 % 64) != 0L) {
               var7[var12 >> 6] &= ~(1L << var12 % 64);
            }
         }
      }

      int var10 = 0;

      for(int var13 = 0; var13 < b; ++var13) {
         if ((var7[var13 >> 6] & 1L << var13 % 64) != 0L) {
            ++var10;
         }
      }

      a = new int[var10];
      var10 = 0;

      for(int var14 = 0; var14 < b; ++var14) {
         if ((var7[var14 >> 6] & 1L << var14 % 64) != 0L) {
            a[var10] = var14;
            ++var10;
         } else if (var10 >= a.length) {
            return;
         }
      }
   }

   public static final void a(int[] var0, i[] var1, aq[] var2) {
      long[] var3 = new long[(var2.length >> 6) + 1];

      for(int var4 = 0; var4 < var0.length; ++var4) {
         if (var1[var0[var4]] != null) {
            var1[var0[var4]].a(var3);
            var1[var0[var4]].d();
            var1[var0[var4]] = null;
         }
      }

      long[] var6 = new long[(var2.length >> 6) + 1];

      for(int var5 = 0; var5 < var1.length; ++var5) {
         if (var1[var5] != null) {
            var1[var5].a(var6);
         }
      }

      for(int var7 = 0; var7 < var2.length; ++var7) {
         if ((var6[var7 >> 6] & 1L << var7 % 64) != 0L) {
            var3[var7 >> 6] &= ~(1L << var7 % 64);
         }
      }

      for(int var8 = 0; var8 < var2.length; ++var8) {
         if ((var3[var8 >> 6] & 1L << var8 % 64) != 0L && var2[var8] != null) {
            var2[var8].a();
            var2[var8] = null;
         }
      }
   }
}
