public final class au extends x {
   public static final short[][] a = new short[][]{{2, 2, 0, 1}, {2, 2, 0, 1}, new short[0], {4}, {5}, {6}, {7}};

   public au() {
      super.R = a;
   }

   public final void b() {
      if (super.V[3] < 0) {
         this.d(super.V[7]);
      } else {
         this.d(a[super.V[3]][super.V[15]]);
      }

      this.W().b();
   }

   public final void a() {
      super.W = new int[18];
      super.W[16] = super.V[16];
      super.W[17] = super.V[17];
      super.a();
   }

   public final boolean d() {
      if (!this.b(av.t) && super.W[17] > 0) {
         this.l(x.I);
      }

      if (!super.d()) {
         switch(super.V[3]) {
            case 3:
            case 4:
            case 5:
            case 6:
               this.f();
         }
      }

      return false;
   }

   public final void c() {
      this.g();
   }

   private void f() {
      byte var1 = 0;
      if (super.V[15] != 2 && super.V[15] != 3) {
         if (super.V[8] > av.r[0].V[8]) {
            var1 = 4;
         } else {
            var1 = 3;
         }
      } else if (super.V[9] > av.r[0].V[9]) {
         var1 = 5;
      } else {
         var1 = 6;
      }

      if (super.ai != var1) {
         this.a((short)var1);
      }
   }

   private void g() {
      if (super.W[16] > 0 && ai.e[super.W[16]] > 0 || this.b(av.t)) {
         this.k(x.I);
         this.k(x.H);
      }
   }
}
