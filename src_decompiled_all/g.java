import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class g {
   public static Vector a = new Vector();
   public static Vector b = new Vector();
   public static Vector c = new Vector();
   private static Vector g = new Vector();
   private static int h = 0;
   private static u[] i = new u[127];
   private static int j;
   public static n d = null;
   public static boolean e = false;
   public static boolean f = false;

   private g() {
   }

   public static final void a(DataInputStream var0) throws Exception {
      short var1 = var0.readShort();

      for(int var2 = 0; var2 < var1; ++var2) {
         byte var3 = var0.readByte();
         byte var4 = var0.readByte();
         u var5;
         (var5 = i[var3] = new u()).b = var4;
         var5.c = var0.readUTF();
         var5.d = var0.readUTF();
         var0.readUTF();
         var0.readUTF();
         var0.readByte();
         var0.readByte();
         if (var0.readByte() == 1) {
            var0.readShort();
            var0.readByte();
            var0.readShort();
         }

         if (var0.readByte() == 1) {
            var0.readShort();
            var0.readByte();
            var0.readShort();
         }

         if (var0.readByte() == 1) {
            var0.readShort();
            var0.readShort();
         }

         if (var0.readByte() == 1) {
            var0.readShort();
            var0.readShort();
         }
      }
   }

   public static final boolean a(int var0) {
      Enumeration var2 = a.elements();

      while(var2.hasMoreElements()) {
         if (((int[])((int[])var2.nextElement()))[0] == var0) {
            return true;
         }
      }

      return false;
   }

   public static final void b(int var0) {
      if (!a(var0)) {
         int[] var1 = new int[]{var0, i[var0].b};
         a.addElement(var1);
         if (var1[1] == 0) {
            b.addElement(var1);
         } else {
            if (var1[1] == 1) {
               c.addElement(var1);
            }
         }
      }
   }

   public static final void a() {
      a.removeAllElements();
      b.removeAllElements();
      c.removeAllElements();
   }

   public static final void a(String var0) {
      g.addElement(var0);
   }

   public static final void a(Graphics var0) {
      if (g.size() > 0) {
         if (h++ > 15) {
            g.removeElementAt(0);
            h = 0;
         } else {
            String var1 = (String)g.elementAt(0);
            if (!e) {
               d.a(var1, "确定", null, 1);
            } else if (d == null) {
               d = new n();
            } else {
               if (f) {
                  d.c = 59;
                  d.d = 1;
                  d.b(120, 160);
                  if (d.b()) {
                     d.d();
                     e = false;
                     return;
                  }
               } else {
                  d.c = 59;
                  d.d = 2;
                  d.b(120, 160);
                  if (d.b()) {
                     d.d();
                     e = false;
                  }
               }
            }
         }
      }
   }

   public static final void a(DataOutputStream var0) throws Exception {
      if (a.size() <= 0) {
         var0.writeInt(-1);
      } else {
         var0.writeInt(a.size());
         Enumeration var1 = a.elements();

         while(var1.hasMoreElements()) {
            int[] var2 = (int[])var1.nextElement();
            var0.writeInt(var2[0]);
            var0.writeInt(var2[1]);
         }
      }
   }

   public static final void b(DataInputStream var0) throws Exception {
      a.removeAllElements();
      int var1;
      if ((var1 = var0.readInt()) >= 0) {
         for(int var2 = 0; var2 < var1; ++var2) {
            int[] var3 = new int[]{var0.readInt(), var0.readInt()};
            a.addElement(var3);
            if (var3[1] == 0) {
               b.addElement(var3);
            } else if (var3[1] == 1) {
               c.addElement(var3);
            }
         }
      }
   }

   public static final u c(int var0) {
      return i[var0];
   }

   public static final void d(int var0) {
      j = var0;
   }

   public static final int b() {
      return j;
   }

   public static final u c() {
      return j < 0 ? null : i[j];
   }
}
