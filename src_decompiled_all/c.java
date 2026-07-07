public final class c extends h {
   public static final short[][] a = new short[][]{
      {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {1, 1, 1, 1}, new short[0], new short[0], {1, 1, 1, 1}, new short[0], {2, 2, 2, 2}
   };
   private int b;

   public c(int var1) {
      this.b = var1;
      switch(var1) {
         case 0:
            super.R = a;
            return;
         case 1:
            super.R = a;
      }
   }

   public final void a() {
      super.W = new int[61];
      super.a();
      switch(this.b) {
         case 0:
            super.W[5] = super.W[6] = 10;
            super.W[46] = super.V[16];
            super.W[58] = super.V[17];
            super.W[59] = super.V[18];
            super.W[29] = super.V[19];
            super.W[30] = super.V[20];
            super.W[13] = super.V[21];
            super.W[60] = 1;
            this.a((short)0);
            super.Z = super.W[58] == 1;
            if (super.V[17] == 0) {
               this.b((short)0);
               return;
            }

            this.b((short)50);
            return;
         case 1:
            super.W[5] = super.W[6] = 10;
            super.W[52] = super.V[22];
            super.W[53] = super.V[23];
            super.W[48] = super.V[16] - 1;
            super.W[49] = super.V[17];
            super.W[50] = super.V[18] - 1;
            super.W[51] = super.V[19];
            super.W[46] = super.V[20];
            super.W[47] = super.V[21];
            super.W[58] = super.V[24];
            super.W[59] = super.V[25];
            super.W[60] = super.V[29];
            super.W[29] = super.V[26];
            super.W[30] = super.V[27];
            super.W[13] = super.V[28];
            this.a((short)0);
            super.Z = super.W[58] == 1;
            if (super.V[24] == 0) {
               this.b((short)0);
               return;
            } else {
               this.b((short)50);
            }
      }
   }

   public final void c() {
      super.c();
      if (!this.m(x.I) && this.ak()) {
         this.k(x.H);
         this.k(x.I);
      }
   }

   public final void o() {
      if (this.X()) {
         super.W[59] = super.W[59] > 0 ? super.W[59] - 1 : 0;
         if (super.W[59] > 0) {
            this.a((short)0);
            return;
         }

         this.a((short)8);
      }
   }

   public final void k() {
      if (this.X()) {
         switch(this.b) {
            case 0:
               if (super.V[17] == 0) {
                  this.b((short)0);
               } else {
                  this.b((short)50);
               }

               ai.b = true;
               if (this.X()) {
                  if (super.W[29] > -1) {
                     ++ai.e[super.W[29]];
                  }

                  if (super.W[30] > -1) {
                     ++ai.f[super.W[30]];
                  }

                  ai.b = false;
               }

               this.l(x.H);
               return;
            case 1:
               this.b((short)0);
               super.k();
               this.k(x.Q);
               this.l(x.H);
         }
      }
   }

   public final boolean b(h var1) {
      super.k = var1;
      if (super.V[3] != 3 && super.V[3] != 8 && super.W[59] > 0 && super.W[60] != 0) {
         switch(this.b) {
            case 0:
               if (super.W[46] > 0) {
                  av.t.b.a(super.W[46]);
                  av.t.a(0, "金" + super.W[46]);
               }

               this.a((short)6);
            case 1:
               this.a((short)6);
            default:
               return true;
         }
      } else {
         return false;
      }
   }
}
