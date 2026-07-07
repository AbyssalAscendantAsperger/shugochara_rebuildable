import javax.microedition.lcdui.Graphics;

public final class v extends ag {
   private int aW = 0;
   private int aX = 0;
   public static final short[][] a = new short[][]{
      {0, 0},
      {0, 0},
      {0, 0},
      {1, 1},
      {1, 1},
      {4, 4, 5, 5, 6, 6},
      {7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13},
      {0, 0},
      {15, 15},
      {1, 1},
      {1, 1},
      {2, 2},
      {3, 3},
      {1, 1},
      {1, 1},
      {15, 15},
      {14, 14},
      {16, 16}
   };
   private int aY = 0;
   private int aZ = 0;
   private static n ba = null;

   public v() {
      super.R = a;
   }

   public final void a() {
      super.W = new int[82];
      super.a();
      super.W[9] = super.V[25];
      super.W[81] = super.V[30];
      super.W[22] = super.V[37];
      super.W[23] = super.V[38];
      super.W[69] = super.V[44] + 30;
      super.W[70] = super.V[43];
      super.W[67] = super.V[42];
      super.W[68] = super.V[41];
      super.W[16] = super.V[26];
      super.W[1] = super.V[61];
      super.W[72] = super.V[39];
      super.W[75] = super.V[40];
      super.W[71] = super.V[46];
      super.W[74] = super.V[59];
      super.W[73] = super.V[60];
      super.W[34] = super.V[49];
      super.W[40] = super.V[50];
      super.W[35] = super.V[64];
      super.W[41] = super.V[65];
      super.W[36] = super.V[66];
      super.W[42] = super.V[67];
      super.W[5] = super.W[6] = super.V[28];
      super.W[10] = super.V[29];
      super.W[44] = super.V[73];
      super.W[43] = super.V[68];
      super.W[45] = super.V[69];
      super.W[78] = super.V[58];
      super.W[76] = super.V[57];
      super.W[77] = super.V[56];
      super.W[79] = super.V[55];
      super.W[80] = super.V[45];
      super.W[52] = super.V[53];
      super.W[53] = super.V[54];
      super.W[48] = super.V[47] - 1;
      super.W[49] = super.V[48];
      super.W[50] = super.V[62] - 1;
      super.W[51] = super.V[63];
      super.W[46] = super.V[51];
      super.W[47] = super.V[52];
      super.W[27] = super.V[33];
      super.W[28] = super.V[32];
      super.W[26] = super.V[31];
      super.W[29] = super.V[35];
      super.W[30] = super.V[36];
      super.W[13] = super.V[34];
      super.W[17] = super.V[27];
      this.a(super.V[26], true);
      int var1 = ai.e[72] + 2;
      super.W[22] = var1 * (super.W[22] >> 1);
      super.W[5] = super.W[6] = var1 * (super.W[5] >> 1);
   }

   public final void b() {
      int var1 = this.V();
      switch(super.V[3]) {
         case 5:
            var1 += super.f << 1;
            break;
         case 6:
            var1 += super.g << 1;
      }

      if (super.V[3] < a.length && super.V[3] >= 0) {
         if (super.V[3] < 0 && super.V[7] > 0) {
            this.d(super.V[7]);
         } else if (var1 < a[super.V[3]].length) {
            this.d(a[super.V[3]][var1]);
         } else {
            System.out
               .println(
                  "Error: XEnemy: "
                     + super.Y
                     + "动画状态列表出界！baseInfo[INFO_OBJ_STATE] = "
                     + super.V[3]
                     + " (id << 1) + baseInfo[INFO_OBJ_DIR] = "
                     + ((var1 << 1) + super.V[15])
               );
         }
      }
   }

   public final void a(short var1) {
      if (var1 == 8 && this.o(4)) {
         n.k();
         n.d(4, 300);
      }

      if (!this.m(x.K) || this.m(x.H) || var1 == 6 || var1 == 0 || var1 == 8 || var1 == 4 || var1 == 3) {
         super.a(var1);
      }
   }

   public final void c() {
      super.c();
      if (!this.m(x.H) && this.m(x.K)) {
         if (!this.c((short)6) && !this.c((short)0) && !this.c((short)3) && !this.c((short)8) && !this.c((short)4)) {
            this.a((short)0);
            return;
         }

         this.d();
      }

      switch(super.V[3]) {
         case 11:
            this.ar();
      }
   }

   public final boolean d() {
      if (super.V[3] != 8 && super.V[3] != 6 && super.W[5] <= 0) {
         this.a((short)8);
      }

      if (this.aW > 0 && super.aj % ae.b == 0) {
         --this.aW;
      }

      --this.aZ;
      if (!super.d()) {
         switch(super.V[3]) {
            case 11:
               this.ar();
               break;
            case 12:
               this.as();
               break;
            case 13:
               this.aq();
               return true;
            case 14:
               return true;
            case 15:
               this.au();
               return true;
            case 16:
               this.av();
               return true;
            case 17:
         }
      }

      return false;
   }

   private void aq() {
      this.ap();
      boolean var1 = this.i(super.V[15]);
      if (this.X()) {
         if (super.z == 0) {
            this.v(this.b(super.j, 2));
            super.z = (byte)super.W[75];
            this.at();
         }

         if (this.aX++ > 2) {
            this.at();
            this.aX = 0;
            if (!this.an() || !var1) {
               if (o.a(45)) {
                  super.ak = 15;
                  this.a((short)0);
                  return;
               }

               this.v(this.b(av.t, 2));
               this.y(o.b(2, 8));
            }
         }
      }
   }

   private void y(int var1) {
      this.aX = var1;
      this.a((short)13);
   }

   public final void c(x var1) {
      super.j = (h)var1;
      this.aX = 100;
   }

   private void ar() {
      this.a(super.W[17], true);
      boolean var1 = this.i(this.U());
      this.I();
      if (!var1) {
         this.v(this.ad());
         super.ak = 10;
         this.a((short)0);
      } else {
         this.v(this.b(super.j, 2));
      }

      --this.aX;
      if (this.ao()) {
         this.a((short)0);
      } else {
         if (this.X() && this.aX <= 0) {
            int var2 = o.b(2);
            this.v((short)var2);
            super.ak = 10;
            this.a((short)0);
         }
      }
   }

   private void as() {
      this.a(-super.r, true);
      this.i(this.V());
      this.I();
      --this.aX;
      if (this.X() && this.aX <= 0) {
         int var2 = o.b(2);
         this.v((short)var2);
         super.ak = 10;
         this.a((short)0);
      }
   }

   public final void k() {
      super.V[4] = 100;
      j.a((byte)2, super.V[8], super.V[9], (byte)-1);
      if (ba != null) {
         ba.h();
         ba = null;
      }

      if (ai.e[72] == 3 && (ai.f[18] > 0 && ai.f[18] < 99 && av.J == 3 || ai.f[31] > 0 && ai.f[31] < 99 && av.J == 3) && this.o(4) && av.t.W[31] > 2) {
         if (av.J == 3) {
            ai.a(18, (byte)99, 1);
         } else if (av.J == 3) {
            ai.a(31, (byte)99, 1);
         }
      }

      if (ai.e[72] == 3 && av.J == 3 && this.o(4) && !av.t.b.c(33)) {
         t.f[33] = 1;
         av.t.b.b(33);
         g.a("获得称号: " + t.a[0][33]);
         g.e = true;
         g.f = false;
      }

      if (this.X()) {
         ++ai.e[71];
         System.out.println("Script.systemVariates[71]" + ai.e[71]);
         if (t.h[0] < 150) {
            ++t.h[0];
         }

         if (t.h[0] >= 150 && t.f[30] == 0) {
            t.f[30] = 1;
            av.t.b.b(30);
            g.a("获得称号: " + t.a[0][30]);
            g.e = true;
            g.f = false;
         }

         if (av.J == 1 && super.W[81] == 8 && ai.f[11] > 0 && ai.f[11] < 99) {
            ai.a(11, (byte)99, 1);
         } else if (av.J == 3 && super.W[81] == 2 && ai.f[15] > 0 && ai.f[15] < 99) {
            ai.a(15, (byte)99, 1);
         } else if (av.J == 2 && ai.f[23] > 0 && ai.f[23] < 99) {
            ai.a(23, (byte)99, 1);
         } else if (av.J == 4 && ai.f[26] > 0 && ai.f[26] < 99) {
            ai.a(26, (byte)99, 1);
         } else if (av.J == 1 && av.H == 5 && super.W[81] == 8 && ai.f[17] > 0 && ai.f[17] < 99 && ai.e[72] == 3) {
            ai.a(17, (byte)99, 1);
         } else if (av.J == 2 && ai.f[20] > 0 && ai.f[20] < 99 && ai.e[72] == 3) {
            ai.a(20, (byte)99, 1);
         } else if (av.J == 3 && ai.f[30] > 0 && ai.f[30] < 99 && ai.e[72] == 3) {
            ai.a(30, (byte)99, 1);
         } else if (av.J == 4 && ai.f[33] > 0 && ai.f[33] < 99 && ai.e[72] == 3) {
            ai.a(33, (byte)99, 1);
         }

         if (av.J == 1 && ai.f[14] >= 30 && ai.f[14] < 99 && ai.e[72] > 0 && super.W[81] == 5) {
            ai.a(14, (byte)99, 1);
         } else if (av.J == 1 && ai.f[14] > 0 && ai.f[14] < 99 && ai.e[72] > 0 && super.W[81] == 5) {
            ai.a(14, (byte)1, 0);
         } else if (av.J == 3 && ai.f[24] >= 30 && ai.f[24] < 99 && ai.e[72] > 0 && super.W[81] == 8) {
            ai.a(24, (byte)99, 1);
         } else if (av.J == 3 && ai.f[24] > 0 && ai.f[24] < 99 && ai.e[72] > 0 && super.W[81] == 8) {
            ai.a(24, (byte)1, 0);
         }
      }

      super.k();
   }

   public final void e() {
      if (super.ak > 0) {
         --super.ak;
      } else {
         if (this.X()) {
            if (super.m[2]) {
               return;
            }

            if (!this.at()) {
               this.a((short)13);
            }
         }
      }
   }

   private boolean at() {
      if (super.e == 0) {
         if (super.W[80] > 0) {
            if (this.an()) {
               super.f = 2;
            }
         } else if (this.ao()) {
            super.f = (byte)o.b(!this.o(4) && !this.m(x.L) ? 2 : 3);
            this.a((short)5);
            return true;
         }
      }

      return false;
   }

   public final void n() {
      super.n();
      if (this.l() && this.B() > 0) {
         super.al[1] = (short)(super.al[1] + this.B());
      }

      if (this.af()) {
         this.x();
         super.j = av.t;
         if (super.j != null) {
            this.a(super.j);
         }
      }

      if (this.X()) {
         int var1 = 20 * (ai.e[72] + 1);
         if (o.b(0, 99) < var1) {
            if (!this.at()) {
               super.e = (short)super.W[72];
               super.ak = 10;
               this.a((short)0);
               return;
            }
         } else {
            super.e = (short)super.W[72];
            super.ak = 10;
            this.a((short)0);
         }
      }
   }

   public final void p() {
      if (super.aj == 1) {
         this.a(-1, "防御");
      }

      super.s = super.r;
      super.r = l.e[super.V[6]].d(super.V[7], super.al[0]);
      this.i(this.ad());
      super.r = super.s;
      if (this.X()) {
         this.a((short)0);
      }
   }

   public final void o() {
      this.y();
      if (super.aE != 0) {
         if (super.aE >= super.V[9]) {
            super.V[8] = (short)(super.V[8] + super.aA);
            if (super.V[8] < 8 || super.V[8] > j.a() - 8 || j.a(super.V[8], super.aE) != 0) {
               super.V[8] = (short)(super.V[8] - super.aA);
               super.aA = -super.aA;
            }

            super.V[9] = (short)(super.V[9] + super.aB);
            super.aB += super.aD;
         }

         if (super.aE < super.V[9]) {
            super.V[9] = super.aE;
            super.aE = 0;
            if (this.m(x.P)) {
               av.t.d(this);
               super.g = 0;
               this.a((short)8);
               return;
            }
         }
      } else {
         if (super.aj > 1 && this.X()) {
            if (super.g > 1 && super.g <= 3) {
               this.a((short)16);
            } else {
               this.a((short)0);
            }

            super.g = 0;
         }

         super.o();
      }
   }

   private void au() {
      if (this.Y()) {
         this.a((short)16);
      }
   }

   private void av() {
      if (this.Y()) {
         super.ak = (short)o.b(20);
         this.a((short)0);
      }
   }

   public final boolean an() {
      return super.j != null;
   }

   public final boolean ao() {
      if (super.j == null) {
         return false;
      } else {
         short var1 = super.V[15];
         int var2 = super.W[70] >> 1;
         short var3 = super.V[8];
         short var4 = super.V[9];
         int var5 = var1 != 2 && var1 != 3 ? (var1 != 1 && var1 != 5 && var1 != 7 ? var3 : var3 - super.W[70]) : var3 - var2;
         int var6 = var1 == 2 ? var4 - super.W[70] : (var1 == 3 ? var4 : var4 - var2);
         int var7 = var5 + super.W[70];
         int var8 = var6 + super.W[70];
         return o.a(av.t.V[8], av.t.V[9], var5, var6, var7, var8);
      }
   }

   public final boolean b(h var1) {
      if (super.V[3] != 7 && super.V[3] != 1) {
         int var2 = 0;
         if (this.b(super.j, 0) == super.V[15]) {
            var2 = super.W[73];
         } else if (this.ad() == this.b(super.j, 0)) {
            var2 = super.W[73] / 3;
         } else {
            var2 = super.W[73] / 3 << 1;
         }

         if (o.a(var2) && !super.m[2]) {
            this.v(this.b(var1, 0));
            this.a((short)7);
            return false;
         } else {
            if (super.b(var1) && super.W[5] > 0) {
               this.a(var1);
            }

            return this.l();
         }
      } else {
         return false;
      }
   }

   public final void c(h var1) {
      if (this.aW <= 0) {
         super.c(var1);
         if (this.aZ >= 0) {
            if (++this.aY > 3) {
               this.aW = 5;
            }
         } else {
            this.aY = 0;
         }

         this.aZ = 2 << ai.e[72];
      }
   }

   public final h ap() {
      super.j = this.F();
      if (super.j == null && !av.t.c((short)8)) {
         super.j = av.t;
      }

      return super.j;
   }

   public final i a(Graphics var1, int var2, int var3) {
      return super.a(var1, var2, var3);
   }
}
