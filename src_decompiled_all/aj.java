import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class aj {
   private x r;
   public int a;
   public int b;
   public int c;
   public int d;
   public int e;
   public int f;
   public int g;
   public int h;
   public int i;
   public int j;
   public int k;
   public int l;
   public boolean m;
   public int n = 0;
   public boolean o;
   public static Vector p = new Vector();
   public static final short[][] q = new short[][]{{5, 1, 6}, {7, 1, 8}};

   public aj(x var1, int var2, int var3, int var4, int var5, int var6) {
      this.r = var1;
      this.a = 0;
      this.c = 400;
      this.b = 300;
      this.d = var2;
      this.h = var5;
      this.i = var6;
      this.e = 0;
      this.f = 0;
      this.g = 0;
      this.l = 0;
      this.n = var3;
      this.m = true;
      if (this.j < this.h) {
         this.o = true;
      } else {
         this.o = false;
      }
   }

   private int a(int var1) {
      return var1 < 0 ? -var1 : var1;
   }

   public final boolean a(Graphics var1) {
      ++this.a;
      if (this.a > this.b && this.a < this.c && this.a % 10 > 5) {
         return true;
      } else if (this.a > this.c) {
         return false;
      } else {
         this.j = this.r.V[8] - 13;
         this.k = this.r.V[9] - 30;
         int var2 = ac.h();
         int var3 = ac.j();
         if (this.e != 2) {
            switch(this.d) {
               case 0:
                  var1.drawImage(ak.b, this.h - var2, this.e == 1 && this.m ? this.i - var3 - this.l : this.i - var3, 0);
                  break;
               case 1:
                  var1.drawImage(ak.a, this.h - var2, this.e == 1 && this.m ? this.i - var3 - this.l : this.i - var3, 0);
            }
         }

         this.m = true;
         if (this.e == 0) {
            this.i -= 5 + this.f;
            ++this.f;
            if (this.f == 7) {
               this.e = 1;
               this.f = 0;
            }
         } else if (this.e == 1) {
            if (this.g % 2 == 0) {
               int var4;
               if ((var4 = o.a.nextInt()) < 0) {
                  var4 = -var4;
               }

               var4 = var4 % 3 - 1;
               this.h += var4;
               if ((var4 = o.a.nextInt()) < 0) {
                  var4 = -var4;
               }

               var4 = var4 % 3 - 1;
               this.i += var4;
            }

            ++this.g;
         } else if (this.e == 2) {
            ++this.f;
            if (this.f == 3) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean c() {
      int var3 = o.c((this.j - this.h) * (this.j - this.h) + (this.k - this.i) * (this.k - this.i)) + 1;
      boolean var4 = false;
      int var1 = 12 * (this.j - this.h) / var3;
      int var2;
      int var5 = -(var2 = 12 * (this.k - this.i) / var3);
      int var6 = var1;
      int var7;
      if ((var7 = var5 * var2 - var1 * var1) > 0 && this.o || var7 < 0 && !this.o) {
         var5 = -var5;
         var6 = -var1;
      }

      int var8 = var1 + var5;
      int var9 = var2 + var6;
      this.h += var8;
      this.i += var9;
      if (this.a(this.h - this.j) <= 15 && this.a(this.i - this.k) <= 15) {
         this.e = 2;
         this.f = 0;
      }

      return true;
   }

   public static final void a(x var0, x var1, int var2, byte var3, int var4) {
      aj var5 = new aj(var0, var3, var2, var4, var1.ab() + o.b(-20, 20), var1.ac() + o.b(-20, 20));
      p.addElement(var5);
   }

   public static final void a() {
      for(int var0 = 0; var0 < p.size(); ++var0) {
         aj var1;
         if ((var1 = (aj)p.elementAt(var0)).e == 1) {
            var1.l = 0;
            var1.m = false;
            var1.c();
            p.setElementAt(var1, var0);
         }
      }
   }

   public static final void b(Graphics var0) {
      if (p.size() > 0) {
         for(int var2 = 0; var2 < p.size(); ++var2) {
            aj var3;
            if (!(var3 = (aj)p.elementAt(var2)).a(var0)) {
               p.removeElementAt(var2);
               --var2;
               if (q[var3.d][2] >= 0) {
                  int var4 = var3.r.W[q[var3.d][0]] + var3.n;
                  var3.r.W[q[var3.d][0]] = var4 > var3.r.W[q[var3.d][2]] ? var3.r.W[q[var3.d][2]] : var4;
               } else {
                  var3.r.W[q[var3.d][0]] += var3.n;
               }

               ai.b = false;
            }
         }
      }
   }

   public static final void b() {
      p.removeAllElements();
   }
}
