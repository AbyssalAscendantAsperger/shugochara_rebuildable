import com.nokia.mid.ui.DirectGraphics;
import com.nokia.mid.ui.DirectUtils;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class o {
   public static final Random a = new Random();
   private static int b = 0;
   private static String c = "";
   private static final short[] d = new short[]{
      0,
      100,
      201,
      302,
      403,
      505,
      607,
      710,
      814,
      919,
      1025,
      1133,
      1242,
      1353,
      1465,
      1580,
      1696,
      1815,
      1937,
      2061,
      2189,
      2320,
      2455,
      2593,
      2736,
      2884,
      3037,
      3196,
      3361,
      3533,
      3712,
      3899,
      4095
   };
   private static final short[] e = new short[]{
      0,
      100,
      200,
      301,
      401,
      501,
      601,
      700,
      799,
      897,
      995,
      1092,
      1189,
      1284,
      1379,
      1474,
      1567,
      1659,
      1751,
      1841,
      1930,
      2018,
      2105,
      2191,
      2275,
      2358,
      2439,
      2519,
      2598,
      2675,
      2750,
      2824,
      2896,
      2966,
      3034,
      3101,
      3166,
      3229,
      3289,
      3348,
      3405,
      3460,
      3513,
      3563,
      3612,
      3658,
      3702,
      3744,
      3784,
      3821,
      3856,
      3889,
      3919,
      3947,
      3973,
      3996,
      4017,
      4035,
      4051,
      4065,
      4076,
      4084,
      4091,
      4094,
      4096
   };
   private static final short[] f = new short[]{
      4096,
      4094,
      4091,
      4084,
      4076,
      4065,
      4051,
      4035,
      4017,
      3996,
      3973,
      3947,
      3919,
      3889,
      3856,
      3821,
      3784,
      3744,
      3702,
      3658,
      3612,
      3563,
      3513,
      3460,
      3405,
      3348,
      3289,
      3229,
      3166,
      3101,
      3034,
      2966,
      2896,
      2824,
      2750,
      2675,
      2598,
      2519,
      2439,
      2358,
      2275,
      2191,
      2105,
      2018,
      1930,
      1841,
      1751,
      1659,
      1567,
      1474,
      1379,
      1284,
      1189,
      1092,
      995,
      897,
      799,
      700,
      601,
      501,
      401,
      301,
      200,
      100,
      0
   };

   private o() {
   }

   public static final void a(byte[] var0, DataOutputStream var1) throws Exception {
      int var2 = var0.length;
      var1.writeInt(var2);

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.writeByte(var0[var3]);
      }
   }

   public static final byte[] a(DataInputStream var0) throws Exception {
      byte[] var2 = new byte[var0.readInt()];

      for(int var3 = 0; var3 < var2.length; ++var3) {
         var2[var3] = var0.readByte();
      }

      return var2;
   }

   public static final void a(short[] var0, DataOutputStream var1) throws Exception {
      int var2 = var0.length;
      var1.writeShort(var2);

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.writeShort(var0[var3]);
      }
   }

   public static final void a(int[] var0, DataOutputStream var1) throws Exception {
      int var2 = var0.length;
      var1.writeShort(var2);

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.writeInt(var0[var3]);
      }
   }

   public static final void a(boolean[] var0, DataOutputStream var1) throws Exception {
      int var2 = var0.length;
      var1.writeShort(var2);

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.writeBoolean(var0[var3]);
      }
   }

   public static final void a(short[][] var0, DataOutputStream var1) throws Exception {
      int var2 = var0.length;
      var1.writeShort(var2);

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = 0;
         if (var0[var3] != null) {
            var4 = var0[var3].length;
         }

         var1.writeShort(var4);

         for(int var5 = 0; var5 < var4; ++var5) {
            var1.writeShort(var0[var3][var5]);
         }
      }
   }

   public static final short[] b(DataInputStream var0) throws Exception {
      short var1;
      short[] var2 = new short[var1 = var0.readShort()];

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = var0.readShort();
      }

      return var2;
   }

   public static final int[] c(DataInputStream var0) throws Exception {
      short var1;
      int[] var2 = new int[var1 = var0.readShort()];

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = var0.readInt();
      }

      return var2;
   }

   public static final boolean[] d(DataInputStream var0) throws Exception {
      short var1;
      boolean[] var2 = new boolean[var1 = var0.readShort()];

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = var0.readBoolean();
      }

      return var2;
   }

   public static final short[][] e(DataInputStream var0) throws Exception {
      short var1;
      short[][] var2 = new short[var1 = var0.readShort()][];

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = new short[var0.readShort()];

         for(int var4 = 0; var4 < var2[var3].length; ++var4) {
            var2[var3][var4] = var0.readShort();
         }
      }

      return var2;
   }

   public static final int a(byte[] var0, int var1, int var2) {
      int var3 = 0;
      int var4 = 0;

      for(int var5 = var2 - 1; var5 >= 0; --var5) {
         var4 = var2 - var5 - 1 << 3;
         var3 |= var0[var1 + var5] << var4 & 255 << var4;
      }

      return var3;
   }

   public static final boolean a(int var0) {
      return a(var0, 100);
   }

   public static final boolean a(int var0, int var1) {
      if (var0 <= 0) {
         return false;
      } else if (var0 >= var1) {
         return true;
      } else {
         return Math.abs(a.nextInt()) % var1 <= var0;
      }
   }

   public static final int b(int var0) {
      return var0 == 0 ? 0 : Math.abs(a.nextInt()) % var0;
   }

   public static final int b(int var0, int var1) {
      return Math.abs(a.nextInt()) % (var1 - var0 + 1) + var0;
   }

   public static final int a(short[] var0) {
      return var0[b(0, var0.length - 1)];
   }

   public static final void a(int[] var0) {
      for(int var2 = 1; var2 < var0.length; ++var2) {
         for(int var3 = var0.length - 1; var3 >= var2; --var3) {
            if (var0[var3] < var0[var3 - 1]) {
               int var1 = var0[var3 - 1];
               var0[var3 - 1] = var0[var3];
               var0[var3] = var1;
            }
         }
      }
   }

   public static final Image a(String var0) {
      Image var1 = null;

      try {
         String var2 = "/bin/";
         var1 = Image.createImage(var2 + var0 + ".png");
      } catch (Exception var3) {
      }

      return var1;
   }

   public static final void a(Graphics var0, String var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var0.getColor();
      if (var4 == 65) {
         var3 += ae.h;
      }

      var0.setColor(var6);
      var0.drawString(var1, var2 - 1, var3, var4);
      var0.drawString(var1, var2 + 1, var3, var4);
      var0.drawString(var1, var2, var3 - 1, var4);
      var0.drawString(var1, var2, var3 + 1, var4);
      var0.setColor(var5);
      var0.drawString(var1, var2, var3, var4);
      var0.setColor(var7);
   }

   public static final void a(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
      var0.setColor(var5);
      var0.fillRect(var1, var2, var3, var4);
   }

   public static final void a(Graphics var0, short[] var1, int var2) {
      a(var0, var1[0], var1[1], var1[2], var1[3], var2);
   }

   public static final void b(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
      int[] var6 = new int[]{var1, var1 + var3, var1 + var3, var1};
      int[] var7 = new int[]{var2, var2, var2 + var4, var2 + var4};
      DirectUtils.getDirectGraphics(var0).fillPolygon(var6, 0, var7, 0, 4, var5);
   }

   public static final void b(Graphics var0, short[] var1, int var2) {
      b(var0, var1[0], var1[1], var1[2], var1[3], var2);
   }

   public static final void a(short[] var0, int var1, int var2) {
      if (var0 != null) {
         var0[0] = (short)(var0[0] + var1);
         var0[1] = (short)(var0[1] + var2);
         var0[2] = (short)(var0[2] + var1);
         var0[3] = (short)(var0[3] + var2);
      }
   }

   public static final boolean a(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var2 > var4) {
         if (var0 > var2 || var0 < var4) {
            return false;
         }
      } else if (var0 < var2 || var0 > var4) {
         return false;
      }

      if (var3 > var5) {
         if (var1 > var3 || var1 < var5) {
            return false;
         }
      } else if (var1 < var3 || var1 > var5) {
         return false;
      }

      return true;
   }

   public static final boolean a(short[] var0, short[] var1) {
      if (var0 != null && var1 != null) {
         return var0[0] <= var1[2] && var1[0] <= var0[2] && var0[1] <= var1[3] && var1[1] <= var0[3];
      } else {
         return false;
      }
   }

   public static final void a(Graphics var0, Image var1, String var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = var1.getWidth() / var8;
      int var10 = var1.getHeight() / var6;
      int var11;
      int var15;
      int var10000 = (var15 = (var11 = var6 - 1) - var7) < 0 ? 0 : var15;
      var7 = var10000;
      var7 = var10000 >= var11 ? var11 : var7;
      switch(var5) {
         case 3:
            int var18 = var2.length() >> 1;
            var3 -= var18 == 0 ? var9 >> 1 : var9 * var18;
            var4 -= var10 >> 1;
            break;
         case 24:
            var3 -= var9 * var2.length();
            break;
         case 33:
            int var12 = var2.length() >> 1;
            var3 -= var12 == 0 ? var9 >> 1 : var9 * var12;
            var4 -= var10;
            break;
         case 36:
            var4 -= var10;
            break;
         case 40:
            var3 -= var9 * var2.length();
            var4 -= var10;
      }

      int var19 = 0;

      for(int var13 = var2.length(); var19 < var13; ++var19) {
         int var14 = 0;
         switch(var2.charAt(var19)) {
            case '+':
            case '-':
            case '/':
            case 'x':
               var14 = 10;
               break;
            default:
               var14 = var2.charAt(var19) - '0';
         }

         var0.setClip(var3 + var19 * var9, var4, var9, var10);
         var0.drawImage(var1, var3 + var19 * var9 - var14 * var9, var4 - var7 * var10, 20);
      }

      var0.setClip(0, 0, 240, 320);
   }

   public static final void a(Graphics var0, String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null && var1 != "") {
         if (!c.equals(var1)) {
            b = 0;
            c = var1;
         }

         var0.setClip(var2, var3, var4 - 3, var5);
         var0.drawString(var1, var2 - b, var3, 20);
         b += 3;
         if (b > ae.c.stringWidth(var1)) {
            b = -var4;
         }

         var0.setClip(0, 0, 240, 320);
      }
   }

   public static final int c(int var0, int var1) {
      if (var0 == 0 && var1 == 0) {
         return 0;
      } else {
         int var2 = var0 >= 0 ? var0 : -var0;
         int var3 = var1 >= 0 ? var1 : -var1;
         int var4;
         if (var2 >= var3) {
            var4 = d((var3 << 12) / var2);
         } else {
            var4 = d((var2 << 12) / var3);
            var4 = 64 - var4;
         }

         if (var0 >= 0) {
            return var1 >= 0 ? var4 : 256 - var4;
         } else {
            return var1 >= 0 ? 128 - var4 : 128 + var4;
         }
      }
   }

   private static final int d(int var0) {
      int var1 = 0;
      int var2 = 32;
      int var3 = 16;
      int var4 = 16;

      while(var4 > 0) {
         var4 >>= 1;
         if (d[var3] > var0) {
            var2 = var3;
            var3 -= var4;
         } else {
            var1 = var3;
            var3 += var4;
         }
      }

      return d[var2] - var0 < var0 - d[var1] ? var2 : var1;
   }

   public static final int d(int var0, int var1) {
      int var2 = var1;
      if (var1 >= 128) {
         var2 = 256 - var1;
      }

      if (var2 > 64) {
         var2 = 128 - var2;
      }

      int var3 = var0 * f[var2] >> 12;
      return var1 > 64 && var1 < 192 ? -var3 : var3;
   }

   public static final int e(int var0, int var1) {
      int var2 = var1;
      if (var1 >= 128) {
         var2 = 256 - var1;
      }

      if (var2 > 64) {
         var2 = 128 - var2;
      }

      int var3 = var0 * e[var2] >> 12;
      return var1 <= 128 ? var3 : -var3;
   }

   public static final int f(int var0, int var1) {
      int var2 = var0 >= 0 ? var0 : -var0;
      int var3 = var1 >= 0 ? var1 : -var1;
      int var4 = var2 > var3 ? var3 : var2;
      return var2 + var3 - (var4 >> 1) - (var4 >> 2) + (var4 >> 3);
   }

   public static final int c(int var0) {
      if (var0 <= 0) {
         return 0;
      } else {
         int var1 = var0;

         int var2;
         do {
            var2 = var1;
         } while((var1 = var1 + var0 / var1 >> 1) < var2 && var1 > 0);

         return var1;
      }
   }

   public static final void b(short[] var0, int var1, int var2) {
      short var3 = var0[var1];
      var0[var1] = var0[var2];
      var0[var2] = var3;
   }

   public static final int a(Graphics var0, String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      String var10 = null;
      int var11 = 0;
      int var12 = var3;
      int var13 = var4;
      int var14 = var5;
      boolean var15 = false;
      int var16 = 0;
      boolean var17 = false;
      boolean var18 = false;
      int var19 = 0;
      int var20 = 0;
      int var21 = 0;

      for(int var22 = var1.length(); var21 < var22; ++var21) {
         var11 += var0.getFont().charWidth(var1.charAt(var21));
         if (var1.charAt(var21) == '&') {
            var20 = var21 - 1;
            var10 = var1.substring(var19, var20 + 1);
            var19 = var21 + 1;
            var11 = 0;
         } else if (var11 > var14) {
            var10 = var1.substring(var19, --var21 + 1);
            var11 = 0;
            var19 = var21 + 1;
         } else if (var21 == var1.length() - 1) {
            var10 = var1.substring(var19, var21 + 1);
            var11 = 0;
         }

         if (var10 != null) {
            var0.setClip(var3, var4, var5, var6);
            switch(var7) {
               case 17:
                  var12 = var3 + (var5 >> 1);
               case 20:
               default:
                  break;
               case 33:
                  var12 = var3 + (var5 >> 1);
                  var13 = var4 + var6;
                  break;
               case 36:
                  var13 = var4 + var6;
                  break;
               case 40:
                  var12 = var3 + var5;
                  var13 = var4 + var6;
            }

            a(var0, var10, var12, var13 + var2, var7, var8, var9);
            var16 = var13 += var0.getFont().getHeight() + 2;
            var10 = null;
            var0.setClip(0, 0, 240, 320);
         }
      }

      return var16 - var4;
   }

   public static final int a(Graphics var0, String var1, int var2, short[] var3, int var4, int var5, int var6) {
      return a(var0, var1, var2, var3[0], var3[1], var3[2], var3[3], var4, var5, var6);
   }

   public static final boolean a(int var0, int var1, short[] var2) {
      return a(var0, var1, var2[0], var2[1], var2[2], var2[3]);
   }

   public static final void a(short[] var0, short[] var1, int var2, int var3) {
      if (var0 != null && var1 != null && var0.length == var1.length) {
         var1[0] = (short)(var0[0] + var2);
         var1[1] = (short)(var0[1] + var3);
         var1[2] = (short)(var0[2] + var2);
         var1[3] = (short)(var0[3] + var3);
      }
   }

   public static final DataInputStream b(String var0) throws Exception {
      return new DataInputStream(var0.getClass().getResourceAsStream("/" + var0));
   }

   public static final DataInputStream c(String var0) throws Exception {
      return b("bin/" + var0);
   }

   public static final void a(Graphics var0, Image var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      DirectGraphics var10 = DirectUtils.getDirectGraphics(var0);
      switch(var9) {
         case 0:
            var0.setClip(var6, var7, var4, var5);
            var0.drawImage(var1, var6 - var2, var7 - var3, var8);
            break;
         case 1:
            var0.setClip(var6, var7, var5, var4);
            var10.drawImage(var1, var6 - var3, var7 - (var1.getWidth() - var2 - var4), var8, 90);
            break;
         case 2:
            var0.setClip(var6, var7, var4, var5);
            var10.drawImage(var1, var6 - (var1.getWidth() - var2 - var4), var7 - (var1.getHeight() - var3 - var5), var8, 180);
            break;
         case 3:
            var0.setClip(var6, var7, var5, var4);
            var10.drawImage(var1, var6 - (var1.getHeight() - var3 - var5), var7 - var2, var8, 270);
            break;
         case 4:
            var0.setClip(var6, var7, var4, var5);
            var10.drawImage(var1, var6 - (var1.getWidth() - var2 - var4), var7 - var3, var8, 8192);
            break;
         case 5:
            var0.setClip(var6, var7, var4, var5);
            var10.drawImage(var1, var6 - var2, var7 - (var1.getHeight() - var3 - var5), var8, 16384);
            break;
         case 6:
            var0.setClip(var6, var7, var5, var4);
            var10.drawImage(var1, var6 - (var1.getHeight() - var3 - var5), var7 - (var1.getWidth() - var2 - var4), var8, 8282);
            break;
         case 7:
            var0.setClip(var6, var7, var5, var4);
            var10.drawImage(var1, var6 - var3, var7 - var2, var8, 8462);
      }

      var0.setClip(0, 0, 240, 320);
   }

   public static final void a(Graphics var0, int var1) {
      var0.setColor(var1);
      var0.setClip(0, 0, 240, 320);
      var0.fillRect(0, 0, 240, 320);
   }

   static {
      String[] var10000 = new String[]{"(Kim)", "(Mộc)", "(Thủy)", "(Hỏa)", "(Thổ)"};
      byte[][] var0 = new byte[][]{{1, 3, 2, 4}, {4, 0, 3, 2}, {3, 4, 1, 0}, {0, 2, 4, 1}, {2, 1, 0, 3}};
      new Vector(1);
      int[] var1 = new int[]{0, 6, 3, 5, 2, 1, 7, 4};
      int[] var2 = new int[]{0, 90, 180, 270, 8192, 16384, 8282, 8462};
   }
}
