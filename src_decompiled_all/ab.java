import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class ab extends x {
   public byte[] a = new byte[4];
   private short[] d = new short[4];
   private static short[] e = new short[4];
   private short[] f;
   private int g = 0;
   private int h;
   public boolean b = false;
   private short i = 0;
   private Vector j = null;
   public static ab c;

   public final void a() {
      super.W = new int[33];
      super.a();
      super.W[16] = super.V[16];
      super.W[32] = super.V[17];
      super.W[17] = super.V[18];
      super.W[18] = super.V[19];
      super.W[19] = super.V[20];
      super.W[20] = super.V[21];
      super.W[22] = super.V[23];
      super.W[21] = super.V[22];
      super.W[23] = super.V[28];
      this.a[1] = (byte)super.V[26];
      this.a[0] = (byte)super.V[27];
      this.a[2] = (byte)super.V[24];
      this.a[3] = (byte)super.V[25];
      super.W[25] = super.V[32];
      super.W[26] = super.V[33];
      super.W[27] = super.V[34];
      super.W[28] = super.V[35];
      super.W[29] = super.V[29];
      super.W[31] = super.V[31];
      super.W[30] = super.V[30];
      if (this.f == null) {
         this.f = new short[10];
      }

      for(int var1 = 0; var1 < this.f.length; ++var1) {
         this.f[var1] = -1;
      }

      super.W[24] = av.H;
      this.h = 0;
   }

   public final boolean d() {
      if (!this.b) {
         if (this.b(av.t)) {
            this.l();
            av.t.A = this;
         }

         return false;
      } else {
         if (super.W[16] == 2 || super.W[16] == 3) {
            this.m();
         }

         this.h();
         return true;
      }
   }

   public final void a(ab var1) {
      if (var1 != c) {
         c = var1;
      }

      short[] var2;
      byte[] var3;
      if (c == null) {
         var2 = e;
         var3 = new byte[]{1, 1, 1, 1};
      } else {
         var2 = var1.g();
         var3 = var1.a;
      }

      short var4 = 0;
      if (var3[1] == 1) {
         var4 = var2[0];
      } else {
         var4 = e[0];
      }

      short var5 = 0;
      if (var3[2] == 1) {
         var5 = var2[1];
      } else {
         var5 = e[1];
      }

      short var6 = 0;
      if (var3[0] == 1) {
         var6 = var2[2];
      } else {
         var6 = e[2];
      }

      short var7 = 0;
      if (var3[3] == 1) {
         var7 = var2[3];
      } else {
         var7 = e[3];
      }

      this.d[0] = (short)(var4 + 18);
      this.d[1] = var5;
      this.d[2] = (short)(var6 - 18);
      this.d[3] = var7;
      if (var6 > 0 && var7 > 0) {
         ac.a(new short[]{var4, 0, var6, (short)j.b()}, false);
      }
   }

   private void l() {
      this.b = true;
      if (super.W[20] >= 0) {
         ai.e[super.W[20]] = 1;
      }

      this.a(this);

      for(int var1 = 0; var1 < this.f.length; ++var1) {
         if (this.f[var1] != -1) {
            ag var2;
            (var2 = (ag)av.d(this.f[var1])).A = this;
            if (super.W[16] != 2 && super.W[16] != 3) {
               var2.k(x.G);
            } else {
               var2.l(x.G);
               var2.l(x.H);
               var2.l(x.I);
            }
         }
      }
   }

   public final void f() {
      this.l(x.H);
      this.l(x.I);
      if (super.W[21] >= 0) {
         ai.e[super.W[21]] = 1;
      }

      if (super.W[23] >= 0) {
         ++ai.e[super.W[23]];
      }

      ac.a(null, false);
      this.a(null);
      if (super.W[16] == 1 && c == this) {
         c = null;
      }

      for(int var1 = 0; var1 < this.f.length; ++var1) {
         ag var3;
         if (this.f[var1] != -1 && av.d(this.f[var1]) instanceof ag && (var3 = (ag)av.d(this.f[var1])) != null) {
            var3.A = null;
            var3.l(x.G);
            var3.a(null, -1, -1);
         }
      }

      if (av.t.A == this) {
         av.t.A = null;
         av.t.a(null, -1, -1);
      }

      this.i = 0;
      this.g = 0;
      this.j = null;
      this.b = false;
   }

   public final short[] g() {
      return this.M();
   }

   public static final void a(int var0, int var1, int var2, int var3) {
      e[0] = (short)var0;
      e[1] = (short)var1;
      e[2] = (short)(var0 + var2);
      e[3] = (short)(var1 + var3);
   }

   public final boolean c(x var1) {
      int var2 = -1;

      for(int var3 = 0; var3 < this.f.length; ++var3) {
         if (this.f[var3] == -1 && var2 == -1) {
            var2 = var3;
         }

         if (this.f[var3] != -1 && this.f[var3] == var1.V[1]) {
            var2 = -1;
            break;
         }
      }

      if (var2 == -1) {
         return false;
      } else {
         this.f[var2] = var1.V[1];
         ++this.g;
         return true;
      }
   }

   private void m() {
      if (this.j == null) {
         this.j = new Vector();
      }

      int var1;
      if ((var1 = this.j.size()) > 0) {
         for(int var10 = 0; var10 < var1; ++var10) {
            x var11;
            if ((var11 = (x)this.j.elementAt(var10)).m(x.Q)) {
               this.j.removeElement(var11);
               --var1;
            }
         }
      } else {
         var1 = (var1 = this.i >= super.W[26] ? super.W[27] : super.W[25]) > this.f.length ? this.f.length : var1;
         int var2 = 0;
         int var3 = -1;

         for(int var4 = 0; var4 < var1; ++var4) {
            while((var2 = o.a(this.f)) == var3) {
            }

            x var5;
            if ((var5 = av.b(av.d(this.f[var4]))) != null) {
               var5.k(x.H);
               var5.k(x.I);
               if (super.W[16] == 3) {
                  short[] var6 = this.M();
                  var5.V[8] = (short)o.b(var6[0], var6[2]);
                  var5.V[9] = (short)o.b(var6[1] + 8, var6[3] - 8);
               }

               if (var5 instanceof ag) {
                  ((ag)var5).h();
               }

               this.j.addElement(var5);
               var3 = var2;
            }
         }

         ++this.i;
      }
   }

   public final void h() {
      boolean var1;
      ++this.h;
      var1 = false;
      label74:
      switch(super.W[17]) {
         case 0:
            if (!this.b(av.t)) {
               var1 = true;
            }
            break;
         case 1:
            if (super.W[19] <= -1) {
               var1 = true;
            } else {
               x var5;
               if ((var5 = av.d(super.W[19])) == null) {
                  var1 = true;
               } else if (var5.m(x.Q) || ((ag)var5).b) {
                  var1 = true;
               }
            }
            break;
         case 2:
            if (super.W[16] != 2 && super.W[16] != 3) {
               var1 = true;

               for(int var4 = 0; var4 < this.f.length; ++var4) {
                  if (this.f[var4] != -1 && !((ag)av.d(this.f[var4])).m(x.Q)) {
                     var1 = false;
                     break label74;
                  }
               }
            } else {
               var1 = this.i >= super.W[26] + super.W[28];
            }
            break;
         case 3:
            if (super.W[18] > -1 && ai.e[super.W[18]] > 0) {
               var1 = true;
               ai.e[super.W[18]] = 0;
            }
            break;
         case 4:
            int var2;
            if ((var2 = this.h / (1000 / ae.a)) >= super.W[18]) {
               var1 = true;
            }
            break;
         case 5:
            if (super.W[16] == 2 || super.W[16] == 3) {
               var1 = this.i >= super.W[26] + super.W[28];
            }
      }

      if (var1) {
         this.f();
      }
   }

   public final boolean a(p var1, int var2, int var3) {
      if (this.b(var1)) {
         if (!var1.B) {
            this.d(var1);
            var1.B = true;
         }
      } else if (var1.B) {
         var1.a(null, -1, -1);
         if (super.W[30] == 0) {
            var1.H();
         } else {
            var1.q();
         }

         var1.B = false;
         var1.t = 0;
      }

      if (this.b && super.W[22] != 4) {
         if (o.a(var1.V[8], var1.V[9], this.d[0], this.d[1], this.d[2], this.d[3])) {
            int var4 = var1.V[8];
            int var5 = var1.V[9];
            int var6 = var1.r;
            switch(var1.V[15]) {
               case 0:
                  var4 += var6;
                  break;
               case 1:
                  var4 -= var6;
                  break;
               case 2:
                  var5 -= var6;
                  break;
               case 3:
                  var5 += var6;
            }

            if (super.aa != -1) {
               var4 = var2;
            }

            if (super.ab != -1) {
               var5 = var3;
            }

            if (!o.a(var4, var5, this.d[0], this.d[1], this.d[2], this.d[3])) {
               if (var1 instanceof aa) {
                  return false;
               }

               if (super.W[22] == 0) {
                  if (var1 instanceof aa) {
                     return false;
                  }
               } else {
                  if (super.W[22] == 3) {
                     return false;
                  }

                  if (super.W[22] == 1) {
                     if (var1 instanceof ag && var1.W[62] == super.V[1]) {
                        return false;
                     }
                  } else if (super.W[22] == 2 && var1 instanceof ag && var1.W[58] == 1 && var1.W[61] == super.V[1]) {
                     return false;
                  }
               }
            }

            return true;
         } else {
            if (var1.V[8] < this.d[0]) {
               var1.V[8] = this.d[0];
            } else if (var1.V[8] > this.d[2]) {
               var1.V[8] = this.d[2];
            }

            return false;
         }
      } else {
         return true;
      }
   }

   private void d(x var1) {
      switch(super.W[29]) {
         case 0:
            if (var1.o(32)) {
               this.e(var1);
               return;
            }
            break;
         case 1:
            if (!var1.o(32)) {
               this.e(var1);
               return;
            }
            break;
         case 2:
            this.e(var1);
      }
   }

   private void e(x var1) {
      int var2;
      if ((var2 = super.W[31]) != false) {
         switch(super.W[30]) {
            case 0:
               if (var1 instanceof p) {
                  p var6;
                  (var6 = (p)var1).h(var2);
                  return;
               }
               break;
            case 1:
               if (var1 instanceof h) {
                  h var5;
                  (var5 = (h)var1).a(var2);
                  return;
               }
               break;
            case 2:
               if (var1 instanceof h) {
                  h var4;
                  (var4 = (h)var1).b(var2);
                  return;
               }
               break;
            case 3:
               if (var1 instanceof h) {
                  h var3;
                  (var3 = (h)var1).c(var2);
               }
         }
      }
   }

   public final i a(Graphics var1, int var2, int var3) {
      return super.a(var1, var2, var3);
   }

   public static final void j() {
      c = null;
   }
}
