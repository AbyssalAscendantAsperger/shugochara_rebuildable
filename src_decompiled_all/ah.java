public final class ah extends h {
   private boolean b;
   public static final short[][] a = new short[][]{
      {0, 0, 0, 0},
      {0, 0, 0, 0},
      {0, 0, 0, 0},
      {1, 1, 1, 1},
      new short[0],
      {2, 2, 2, 2},
      {1, 1, 1, 1},
      new short[0],
      {1, 1, 1, 1},
      new short[0],
      {3, 3, 3, 3},
      {3, 3, 3, 3}
   };

   public ah() {
      super.R = a;
   }

   public final void a() {
      super.W = new int[59];
      super.a();
      super.W[5] = super.W[6] = 10;
      super.ac = super.V[8];
      super.ad = super.V[9];
      this.b = super.V[17] == 1;
      super.W[22] = super.V[18];
      super.W[58] = super.V[19];
   }

   public final void c() {
      super.c();
      if (!this.m(x.H) && this.ak()) {
         this.k(x.H);
         this.k(x.I);
         this.a((short)10);
      }
   }

   public final boolean d() {
      boolean var1 = false;
      switch(super.V[3]) {
         case 0:
            this.e();
            break;
         case 3:
            this.f();
            break;
         case 10:
            this.g();
            var1 = true;
      }

      return var1;
   }

   private void g() {
      if (!this.m(x.I)) {
         this.k(x.H);
         this.k(x.I);
      }

      if (this.X()) {
         this.a((short)0);
      }
   }

   public final void e() {
      this.v(super.W[58]);
      super.r = super.V[16];
      if (super.r > 0 && super.V[3] != 3) {
         this.a((short)3);
      }
   }

   public final void f() {
      this.u(super.W[58]);
      super.V[8] = (short)(super.V[8] + (super.W[58] == 0 ? super.r : -super.r));
      super.j = av.t;
      if (super.j != null && this.b && this.a(super.j)) {
         this.b = false;
      }

      if (super.V[8] < 0 || super.V[8] > j.a()) {
         this.k(x.Q);
         this.l(x.H);
         this.l(x.I);
      }
   }

   public final boolean a(h var1) {
      short[] var2 = this.z();
      short[] var3 = var1.ae();
      return o.a(var2, var3) ? var1.b(this) : false;
   }
}
