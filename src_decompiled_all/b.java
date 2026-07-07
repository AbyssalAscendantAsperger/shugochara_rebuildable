public final class b extends ag {
   public static final short[][] a = new short[][]{
      {0}, {0}, {0}, {1}, {0}, new short[0], new short[0], new short[0], new short[0], {0, 0}, {0, 0}, {0, 0, 0, 0}
   };
   private int aJ = 0;
   private int aK = 0;
   private int aL = 0;
   private int aM = 0;

   public b() {
      super.R = a;
   }

   public final void a() {
      super.W = new int[73];
      super.a();
      super.W[5] = super.W[6] = 10;
      super.ac = super.V[8];
      super.ad = super.V[9];
   }

   public final void b() {
      int var1 = this.V();
      switch(super.V[3]) {
         case 12:
            var1 += super.W[70] << 1;
         default:
            if (var1 < a[super.V[3]].length) {
               this.d(a[super.V[3]][var1]);
            } else {
               System.out
                  .println(
                     "Error: XNPC: "
                        + super.Y
                        + "动画状态列表出界！baseInfo[INFO_OBJ_STATE] = "
                        + super.V[3]
                        + " (id << 1) + baseInfo[INFO_OBJ_DIR] = "
                        + ((var1 << 1) + super.V[15])
                  );
            }
      }
   }

   public final void c() {
      super.c();
   }

   public final boolean d() {
      boolean var1 = false;
      if (!super.d()) {
         switch(super.V[3]) {
            case 11:
               this.am();
               var1 = true;
               break;
            case 12:
               this.an();
               var1 = true;
         }
      }

      return var1;
   }

   public final void e() {
      if (super.W[69] == 1 && this.b(av.t)) {
         this.v(this.b(av.t, 1));
         if (super.V[3] != 11) {
            this.a((short)11);
            return;
         }
      }

      if (super.ak > 0) {
         --super.ak;
      } else {
         if (super.r > 0 && super.V[3] != 3) {
            this.a((short)3);
         }
      }
   }

   public final void f() {
      if (super.r >= 1 && (super.W[69] != 1 || !this.b(av.t))) {
         this.aL = this.U();
         this.j(this.aL);
         if (Math.abs(super.aa - super.ac) >= super.W[68] || Math.abs(super.ab - super.ad) >= super.W[68]) {
            do {
               this.aL = this.al();
               this.j(this.aL);
               if (this.aM++ > 10) {
                  super.ac = super.V[8];
                  super.ad = super.V[9];
                  this.aL = this.ad();
                  this.aM = 0;
                  break;
               }
            } while(Math.abs(super.aa - super.ac) >= super.W[68] || Math.abs(super.ab - super.ad) >= super.W[68]);

            this.a((short)0);
         }

         this.u((short)this.aL);
         this.i(this.U());
         if (this.aJ++ >= this.aK && this.X()) {
            this.aK = o.b(super.W[71], super.W[72]);
            this.a((short)0);
         }
      } else {
         this.a((short)0);
      }
   }

   public final void a(short var1) {
      super.a(var1);
      if (var1 == 0) {
         super.ak = 12;
         this.aJ = 0;
      }
   }

   private int al() {
      switch(super.W[67]) {
         case 0:
         case 1:
         case 2:
            return o.b(4);
         case 3:
            return o.b(1, 0);
         case 4:
            return o.b(2, 3);
         default:
            return 0;
      }
   }

   private void am() {
      if (this.X()) {
         if (super.W[69] == 1) {
            this.a((short)12);
            return;
         }

         this.a((short)0);
      }
   }

   private void an() {
      if (this.X()) {
         if (this.b(av.t)) {
            this.v(this.b(av.t, 1));
            return;
         }

         this.a((short)0);
      }
   }
}
