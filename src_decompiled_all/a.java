import java.io.DataInputStream;
import java.io.IOException;
import java.util.Vector;

public final class a {
   private static int c;
   private static int d;
   private static int e;
   private static int f;
   private static int g;
   public static int a;
   private static int[] h = new int[6];
   private static Vector i = new Vector();
   private static boolean j;
   public static int[][] b;

   public static final void a() {
      c = 0;
      d = 0;
      e = 0;
      f = 0;
      g = 0;
      a = 0;

      for(int var0 = 0; var0 < 6; ++var0) {
         h[var0] = 0;
      }
   }

   public static final void b() {
      if (j) {
         if (i.size() == 0) {
            j = false;
            if (ai.a) {
               ai.a = false;
            }

            return;
         }

         int var1 = Integer.parseInt((String)i.elementAt(2));
         int var2 = Integer.parseInt((String)i.elementAt(1));
         int var3 = Integer.parseInt((String)i.elementAt(3));
         int var4;
         int var0 = var4 = a(Integer.parseInt((String)i.elementAt(0)));
         if (var2 == 2) {
            c &= ~var4;
         }

         if (var1 == 0) {
            var0 &= ~var4;
            if (var3 > 0) {
               a();
               --var3;
               i.removeElementAt(3);
               i.insertElementAt(String.valueOf(var3), 3);
               return;
            }

            i.removeElementAt(3);
            i.removeElementAt(2);
            i.removeElementAt(1);
            i.removeElementAt(0);
         } else if (var1 > 0) {
            --var1;
            i.removeElementAt(2);
            i.insertElementAt(String.valueOf(var1), 2);
         }

         d = ~c & var0;
         c = var0;
      } else {
         d = ~c & a;
         c = a;
      }

      ++g;
      if (d != 0) {
         if (f != 0 && g < 8 && f == d) {
            e = d;
            f = 0;
         } else {
            g = 0;
            e = 0;
            f = d;
         }
      } else {
         if (e != 0) {
            e = 0;
         }
      }
   }

   public static final int a(int var0) {
      switch(var0) {
         case 0:
            return 16;
         case 1:
            return 32;
         case 2:
            return 1;
         case 3:
            return 64;
         case 4:
            return 4;
         case 5:
            return 16384;
         case 6:
            return 8;
         case 7:
            return 256;
         case 8:
            return 2;
         case 9:
            return 512;
         case 10:
            return 1024;
         case 11:
            return 2048;
         default:
            return -1;
      }
   }

   public static final boolean b(int var0) {
      return (a & var0) != 0;
   }

   public static final boolean c(int var0) {
      return (a & var0) == var0;
   }

   public static final boolean c() {
      return d != 0;
   }

   public static final boolean d(int var0) {
      return (e & var0) != 0;
   }

   public static final boolean e(int var0) {
      if (var0 == 0 && d == 0) {
         return false;
      } else {
         return (d & var0) != 0;
      }
   }

   public static final int f(int var0) {
      if (j) {
         return 0;
      } else {
         char var1 = '\u0000';
         switch(var0) {
            case -1:
               var1 = '耀';
               break;
            case 0:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
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
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            default:
               var1 = '\u0000';
               break;
            case 1:
            case 50:
               var1 = '\u0001';
               break;
            case 2:
            case 56:
               var1 = '\u0002';
               break;
            case 3:
            case 52:
               var1 = '\u0004';
               break;
            case 4:
            case 54:
               var1 = '\b';
               break;
            case 5:
            case 53:
               var1 = '䀀';
               break;
            case 6:
               var1 = 'က';
               break;
            case 7:
               var1 = ' ';
               break;
            case 35:
               var1 = 'ࠀ';
               break;
            case 42:
               var1 = 'Ѐ';
               break;
            case 48:
               var1 = '\u0010';
               break;
            case 49:
               var1 = ' ';
               break;
            case 51:
               var1 = '@';
               break;
            case 55:
               var1 = 'Ā';
               break;
            case 57:
               var1 = 'Ȁ';
         }

         return var1;
      }
   }

   public static final String g(int var0) {
      switch(var0) {
         case 1:
            return "上方向键";
         case 2:
            return "下方向键";
         case 4:
            return "左方向键";
         case 8:
            return "右方向键";
         case 16:
            return "数字键0";
         case 32:
            return "数字键1";
         case 64:
            return "数字键3";
         case 128:
         case 16384:
            return "数字键5";
         case 256:
            return "数字键7";
         case 512:
            return "数字键9";
         case 1024:
            return " * 键";
         case 2048:
            return " # 键";
         case 4096:
            return "左软键";
         case 8192:
            return "右软键";
         default:
            return null;
      }
   }

   public static final void a(int[] var0) {
      j = true;

      for(int var1 = 0; var1 < var0.length; ++var1) {
         i.addElement(String.valueOf(var0[var1]));
      }
   }

   public static final void h(int var0) {
      try {
         DataInputStream var1 = null;
         (var1 = o.c("kay.bin")).readByte();
         int[] var3 = new int[var1.readShort() + 1];

         for(int var4 = 0; var4 < var3.length; ++var4) {
            var3[var4] = var1.readInt();
         }

         var1.skip((long)var3[var0]);
         short var11;
         b = new int[var11 = var1.readShort()][];

         for(int var5 = 0; var5 < var11; ++var5) {
            short var6 = (short)(var1.readShort() * 4);
            b[var5] = new int[var6];

            for(int var7 = 0; var7 < var6; ++var7) {
               b[var5][var7] = var1.readInt();
            }
         }

         var1.close();
      } catch (IOException var8) {
         var8.printStackTrace();
      } catch (Exception var9) {
         var9.printStackTrace();
      }
   }
}
