import javax.microedition.lcdui.Graphics;

public abstract class ag extends h {
   private int aJ = -1;
   public boolean b = false;
   private boolean aK = false;
   private boolean aL = false;
   private i aM = null;
   private int aN = 0;

   public void a() {
      super.a();
      super.W[58] = super.V[16];
      super.W[59] = super.V[17];
      super.W[60] = super.V[18];
      super.W[61] = super.V[19];
      super.W[62] = super.V[20];
      super.W[63] = super.V[21];
      super.W[64] = super.V[22];
      super.W[65] = super.V[23];
      super.W[66] = super.V[24];
   }

   public i a(Graphics var1, int var2, int var3) {
      i var4 = super.a(var1, var2, var3);
      if (this.aK) {
         this.am();
      }

      return var4;
   }

   public final void g() {
      if (!this.al()) {
         if (!this.b) {
            if (this.aJ > 0) {
               --this.aJ;
               if (this.aJ <= 0) {
                  this.b = true;
               }

               return;
            }

            switch(super.W[58]) {
               case 0:
                  this.b = true;
                  break;
               case 1:
                  ag var2;
                  if ((var2 = (ag)av.d(super.W[61])) != null && av.f[var2.V[0]] == 98 && var2.V[3] == 3) {
                     if (super.W[60] > 0) {
                        this.aJ = (short)super.W[60];
                     } else {
                        this.b = true;
                     }
                  }
                  break;
               case 2:
                  if (o.a(ac.l(), this.M())) {
                     this.b = true;
                  }
                  break;
               case 3:
                  ag var1;
                  if ((var1 = (ag)av.d(super.W[61])) != null && var1.m(x.Q)) {
                     this.b = true;
                     if (this instanceof v) {
                        if (this.ab() > av.t.ab()) {
                           super.V[8] = (short)(ac.h() + 240 + 50);
                        } else {
                           super.V[8] = (short)(ac.h() - 50);
                        }

                        this.k(x.H);
                        this.k(x.I);
                        this.k(x.G);
                        ((v)this).c((x)av.t);
                     }
                  }
                  break;
               case 4:
                  this.aJ = super.W[60];
                  break;
               case 5:
                  if (ai.e[super.W[60]] >= 0) {
                     this.b = true;
                  }
                  break;
               case 6:
                  this.b = false;
            }

            if (this.b) {
               this.h();
            }
         }
      }
   }

   private boolean al() {
      if (this.aN == 3) {
         if (super.W[59] == 1 && !this.m(x.H)) {
            this.k(x.H);
            this.a((short)0);
         }

         return true;
      } else {
         return false;
      }
   }

   public final void h() {
      this.aL = super.W[64] > -1 && super.W[65] > -1 && (this.aN & 1) == 0;
      if (!this.aL) {
         this.aN |= 1;
      }

      this.aK = super.W[63] > -1 && (this.aN & 2) == 0;
      if (this.aK) {
         this.d((short)super.W[63]);
         this.k(x.I);
      } else {
         this.aN |= 2;
      }
   }

   public final void i() {
      super.i();
      this.j();
   }

   public final void j() {
      if (this.aL) {
         if (x.C == null) {
            x.C = new n();
         }

         x.C.c = super.W[64];
         x.C.d = super.W[65];
         if (this.aM != null && this.aM.a(super.W[65], x.C.c())) {
            this.k(x.I);
            this.aL = false;
            this.aN |= 1;
            this.al();
         } else {
            x.C.b(super.V[8] - ac.h(), super.V[9] - ac.j());
            this.aM = x.C.e();
         }
      }
   }

   private void am() {
      i var1 = super.ax;
      if (super.ax != null && var1.a(super.W[63], super.al) || var1 == null) {
         this.aK = false;
         this.aN |= 2;
         this.al();
      }
   }

   public boolean d() {
      boolean var1;
      if (!(var1 = super.d())) {
         switch(super.V[3]) {
            case 10:
               var1 = true;
         }
      }

      return var1;
   }

   public void c() {
      super.c();
      this.g();
   }

   public void k() {
      super.k();
      if (this.X() && !this.b) {
         this.b = true;
         if (ab.c != null) {
            ab.c.h();
         }
      }
   }
}
