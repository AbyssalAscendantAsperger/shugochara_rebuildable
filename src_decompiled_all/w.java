import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Enumeration;
import java.util.Vector;

public final class w {
   public aa a = null;
   public static int b = 0;
   public static Vector c = new Vector();
   public static Vector d = new Vector();
   public static Vector e = new Vector();
   public static Vector f = new Vector();
   public static Vector g = new Vector();
   public static m h = null;
   public static m i = null;

   public w(aa var1) {
      this.a = var1;
   }

   public final boolean a(int var1) {
      av.t.W[12] += var1;
      if (av.t.W[12] > 999999) {
         av.t.W[12] = 999999;
      } else if (av.t.W[12] < 0) {
         av.t.W[12] = 0;
      }

      if (av.t.W[12] >= 100000 && !av.t.b.c(32)) {
         t.f[32] = 1;
         av.t.b.b(32);
         g.a("获得称号: " + t.a[0][32]);
         g.e = true;
         g.f = false;
      }

      return true;
   }

   public final void b(int var1) {
      t var2 = t.a(this.a.be, var1);
      this.a(var2);
   }

   public final void a(t var1) {
      if (!this.b(var1)) {
         switch(var1.n) {
            case 0:
               d.addElement(var1);
               return;
            case 1:
               c.addElement(var1);
               return;
            case 2:
               e.addElement(var1);
               return;
            case 3:
               f.addElement(var1);
         }
      }
   }

   public final boolean b(t var1) {
      Object var2 = null;
      Enumeration var4 = this.c(var1).elements();

      while(var4.hasMoreElements()) {
         if (((t)var4.nextElement()).j == var1.j) {
            return true;
         }
      }

      return false;
   }

   public final boolean c(int var1) {
      Object var2 = null;
      Enumeration var4 = this.e(var1).elements();

      while(var4.hasMoreElements()) {
         if (((t)var4.nextElement()).j == var1) {
            return true;
         }
      }

      return false;
   }

   public final int d(int var1) {
      Vector var2 = this.e(var1);

      for(int var3 = 0; var3 < var2.size(); ++var3) {
         if (((t)var2.elementAt(var3)).j == var1) {
            return var3;
         }
      }

      return -1;
   }

   public final Vector c(t var1) {
      Vector var2 = null;
      switch(var1.n) {
         case 0:
            var2 = d;
            break;
         case 1:
            var2 = c;
            break;
         case 2:
            var2 = e;
            break;
         case 3:
            var2 = f;
      }

      return var2;
   }

   public final Vector e(int var1) {
      Vector var2 = null;
      if (var1 < 7) {
         var2 = d;
      } else if (var1 < 13) {
         var2 = c;
      } else if (var1 < 19) {
         var2 = e;
      } else {
         var2 = f;
      }

      return var2;
   }

   private void a(Vector var1, DataOutputStream var2) throws Exception {
      var2.writeInt(var1.size());

      for(int var4 = 0; var4 < var1.size(); ++var4) {
         Object var3;
         if ((var3 = var1.elementAt(var4)) != null) {
            if (var3 instanceof m) {
               var2.writeByte(1);
               var2.writeShort(((m)var3).g);
               ((m)var3).a(var2);
            } else if (var3 instanceof t) {
               var2.writeByte(2);
               var2.writeShort(((t)var3).j);
               ((t)var3).a(var2);
            }
         } else {
            var2.writeByte(0);
         }
      }
   }

   private void a(Vector var1, DataInputStream var2) throws Exception {
      int var5 = var2.readInt();

      for(int var6 = 0; var6 < var5; ++var6) {
         switch(var2.readByte()) {
            case 0:
            default:
               break;
            case 1:
               m var3;
               (var3 = m.a(var2.readShort())).a(var2);
               var1.addElement(var3);
               break;
            case 2:
               t var4;
               (var4 = t.a(this.a.be, var2.readShort())).a(var2);
               var1.addElement(var4);
         }
      }
   }

   public final void a(DataOutputStream var1) throws Exception {
      this.a(d, var1);
      this.a(c, var1);
      this.a(e, var1);
      this.a(f, var1);
   }

   public final void a(DataInputStream var1) throws Exception {
      this.a(d, var1);
      this.a(c, var1);
      this.a(e, var1);
      this.a(f, var1);
   }

   public static final void a(int var0, int var1) {
      m var2;
      if ((var2 = f(var0)) != null) {
         var2.k += var1;
      } else {
         (var2 = m.a(var0)).k = var1;
         g.addElement(var2);
      }

      if (var2.k > 0) {
         if (var2.g == 0) {
            h = var2;
         } else if (var2.g == 1) {
            i = var2;
         }
      } else if (var2.g == 0) {
         h = null;
      } else if (var2.g == 1) {
         i = null;
      }

      if (var2.k == 0) {
         g.removeElement(var2);
      }
   }

   public static final void a(m var0, int var1) {
      a(var0.g, var1);
   }

   public static final m f(int var0) {
      m var1 = null;
      Enumeration var2 = g.elements();

      while(var2.hasMoreElements()) {
         if ((var1 = (m)var2.nextElement()).g == var0) {
            return var1;
         }
      }

      return null;
   }

   public static final int g(int var0) {
      Vector var1 = g;

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         if (((m)var1.elementAt(var2)).g == var0) {
            return var2;
         }
      }

      return -1;
   }

   public static final boolean h(int var0) {
      m var1;
      return (var1 = f(var0)) != null && var1.k > 0;
   }

   public static final boolean a(m var0) {
      aa var1 = av.t;
      if (av.t.C(var0.g) > 0) {
         if (!d.a) {
            var1.a(-1, "物品未就绪");
         }

         return false;
      } else {
         m var2;
         if ((var2 = f(var0.g)) != null) {
            if (--var2.k == 0) {
               g.removeElement(var2);
            }

            if (var2.l == 0) {
               if (var2.g == 9) {
                  var1.a.a();
               }

               if (var2.g != 7) {
                  var2.b(var1);
               }
            }
         }

         return true;
      }
   }

   public static final void i(int var0) {
      Object var1 = null;
      Enumeration var2 = g.elements();

      while(var2.hasMoreElements()) {
         m var3;
         if ((var3 = (m)var2.nextElement()).g == var0) {
            a(var3);
            return;
         }
      }
   }

   public static final void b(DataOutputStream var0) throws Exception {
      var0.writeInt(b);
      var0.writeInt(g.size());

      for(int var2 = 0; var2 < g.size(); ++var2) {
         Object var1;
         if ((var1 = g.elementAt(var2)) != null) {
            if (var1 instanceof m) {
               var0.writeByte(1);
               var0.writeShort(((m)var1).g);
               ((m)var1).a(var0);
            }
         } else {
            var0.writeByte(0);
         }
      }
   }

   public static final void b(DataInputStream var0) throws Exception {
      b = var0.readInt();
      int var2 = var0.readInt();
      g.removeAllElements();

      for(int var3 = 0; var3 < var2; ++var3) {
         switch(var0.readByte()) {
            case 1:
               m var1;
               (var1 = m.a(var0.readShort())).a(var0);
               g.addElement(var1);
               break;
            case 0:
         }
      }

      a(0, 0);
      a(1, 0);
   }
}
