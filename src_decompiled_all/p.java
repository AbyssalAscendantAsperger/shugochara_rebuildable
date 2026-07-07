public abstract class p extends x {
   public int p;
   public int q;
   private int a_ = -1;
   private int b_ = -1;
   private int c_ = -1;
   public int r = 0;
   public int s = 0;
   public byte t = 0;
   public short u;
   public short v;
   public short w;
   public int x;
   public static byte y = 0;
   public byte z = 0;
   public ab A = null;
   public boolean B = false;

   public boolean d() {
      boolean var1;
      if (!(var1 = super.d())) {
         if (this.z > 0) {
            --this.z;
         }

         switch(super.V[3]) {
            case 3:
               this.f();
               return true;
         }
      }

      return var1;
   }

   public void c() {
      super.c();
      if (this.m(x.N)) {
         switch(super.V[3]) {
            case 4:
               this.J();
               return;
         }
      }
   }

   public void a(short var1) {
      super.a(var1);
      if (this.A != null && this.A.W[24] != av.H) {
         this.A = null;
      }
   }

   public void f() {
   }

   public final void H() {
      this.a(super.W[16] + super.W[20], false);
   }

   public final void I() {
      this.a(this.s, true);
   }

   public final void h(int var1) {
      super.W[21] = var1;
      this.a(this.r + var1, true);
   }

   public void q() {
      this.r -= super.W[21];
      this.a(this.r, true);
      super.W[21] = 0;
   }

   public final void a(short var1, short var2, short var3, boolean var4) {
      this.u = var1;
      this.v = var2;
      this.w = var3;
      this.x = 0;
      this.k(x.M);
      this.a((short)4);
      if (var4) {
         this.k(x.N);
         ++y;
      }

      super.V[15] = -1;
   }

   public final void J() {
      byte var1 = 0;
      if (super.V[8] < this.u) {
         var1 = 0;
      } else if (super.V[8] > this.u) {
         var1 = 1;
      } else if (super.V[9] < this.v) {
         var1 = 3;
      } else if (super.V[9] > this.v) {
         var1 = 2;
      }

      if (var1 != super.V[15]) {
         this.v(var1);
      }

      this.e(super.V[15]);
      if (this.x == 4 || super.V[8] == this.u && super.V[9] == this.v) {
         this.a((short)0);
         this.v(this.w);
         this.l(x.M);
         if (this.m(x.N)) {
            this.l(x.N);
            --y;
         }
      }
   }

   private final void e(short var1) {
      super.aa = super.V[8];
      boolean var2 = false;
      super.ab = super.V[9];
      boolean var3 = false;
      this.j(var1);
      switch(var1) {
         case 0:
            if (super.aa > this.u) {
               super.aa = this.u;
            }
            break;
         case 1:
            if (super.aa < this.u) {
               super.aa = this.u;
            }
            break;
         case 2:
            if (super.ab < this.v) {
               super.ab = this.v;
            }
            break;
         case 3:
            if (super.ab > this.v) {
               super.ab = this.v;
            }
      }

      if (j.a(super.aa, super.ab) != 0) {
         ++this.x;
         super.aa = super.V[8];
         super.ab = super.V[9];
      } else {
         super.V[8] = super.aa;
         super.V[9] = super.ab;
      }
   }

   public static final int a(int var0, int var1) {
      int var2 = 0;
      i var3;
      byte var4 = (var3 = l.e[var0]).c[var1];

      for(int var5 = 0; var5 < var4; ++var5) {
         int var6 = var3.e[var3.d[var1] + (var5 << 1)] >> 10 & 31;
         var2 += var6 * var3.d(var1, var5);
      }

      return var2;
   }

   public static final int[] a(int var0, int var1, int var2, int var3) {
      int var4 = -1;
      int var5 = -1;
      int var6 = 0;
      int var7 = 0;
      int var8 = j.c();
      int var9 = j.d();
      int[] var10 = null;
      switch(var0) {
         case 0:
            (var10 = new int[(var6 = var1 + var3) / var9 - var1 / var9 + 1])[0] = 0;

            for(int var19 = 1; var19 < var10.length; ++var19) {
               var10[var19] = j.b((var1 / var8 + var19) * var8, var2);
            }
            break;
         case 1:
            var6 = var1 - var3;
            (var10 = new int[var1 / var9 - var6 / var9 + 1])[0] = 0;

            for(int var18 = 1; var18 < var10.length; ++var18) {
               var10[var18] = j.b((var1 / var8 - var18) * var8, var2);
            }
            break;
         case 2:
            var7 = var2 - var3;
            (var10 = new int[var2 / var9 - var7 / var9 + 1])[0] = 0;

            for(int var17 = 1; var17 < var10.length; ++var17) {
               var10[var17] = j.b(var1, (var2 / var9 - var17) * var9);
            }
            break;
         case 3:
            (var10 = new int[(var7 = var2 + var3) / var9 - var2 / var9 + 1])[0] = 0;

            for(int var11 = 1; var11 < var10.length; ++var11) {
               var10[var11] = j.b(var1, (var2 / var9 + var11) * var9);
            }
      }

      int var20 = 0;
      if (var10 != null) {
         for(int var12 = 0; var12 < var10.length; ++var12) {
            if ((var10[var12] & 1) != 1) {
               var20 = var12;
            }

            if ((var10[var12] & 2) == 2 || (var10[var12] & 2) == 1) {
               break;
            }
         }
      }

      switch(var0) {
         case 0:
            var4 = (var1 / var8 + var20) * var8;
            var5 = var2;
            break;
         case 1:
            var4 = (var1 / var8 - var20) * var8;
            var5 = var2;
            break;
         case 2:
            var4 = var1;
            var5 = (var2 / var9 - var20) * var9;
            break;
         case 3:
            var4 = var1;
            var5 = (var2 / var9 + var20) * var9;
      }

      return new int[]{var4, var5};
   }

   public final boolean i(int var1) {
      short var2 = super.aa = super.V[8];
      short var3 = super.ab = super.V[9];
      int var4 = j.a((byte)2, var2, var3);
      j.a((byte)2, var2, var3, (byte)-1);
      this.j(var1);
      boolean var5 = this.b(super.aa, super.ab);
      j.a((byte)2, var2, var3, (byte)var4);
      return var5;
   }

   public final boolean b(int var1, int var2) {
      boolean var3 = true;
      if (super.V[4] != 100) {
         var3 = j.a(var1, var2) == 0;
      }

      if (!var3) {
         int[] var4;
         var1 = (short)(var4 = this.K())[0];
         var2 = (short)var4[1];
         if (var1 != super.V[8] || var2 != super.V[9]) {
            var3 = true;
         }
      }

      if (this.A != null && this.A.b && !this.A.a(this, var1, var2)) {
         var3 = false;
      }

      if (var3) {
         this.d(var1, var2);
      }

      return var3;
   }

   public final boolean b(int var1, int var2, int var3, int var4) {
      this.r = (short)var2;
      short var5 = super.aa = super.V[8];
      short var6 = super.ab = super.V[9];
      int var7 = j.a((byte)2, var5, var6);
      j.a((byte)2, var5, var6, (byte)-1);
      this.j(var1);
      boolean var8 = false;
      var8 = j.a(super.aa, super.ab) == 0;
      if (o.a(var5, var6, var3, var4, var3 + j.c(), var4 + j.d()) && !o.a(super.aa, super.ab, var3, var4, var3 + j.c(), var4 + j.d())) {
         var8 = false;
      }

      if (this.A != null && !this.A.a(this, super.aa, super.ab)) {
         var8 = false;
      }

      if (!var8) {
         super.aa = super.V[8];
         super.ab = super.V[9];
      } else {
         this.d(super.aa, super.ab);
      }

      j.a((byte)2, var5, var6, (byte)var7);
      this.H();
      return var8;
   }

   public final int[] K() {
      int[] var1 = new int[]{super.V[8], super.V[9]};
      int[] var2 = new int[]{super.V[8], super.V[9]};
      int var3 = j.c();
      short var4 = super.aa;
      short var5 = super.ab;
      switch(super.V[15]) {
         case 0:
            if (j.a(var4, var5 + var3) == 0) {
               var1[0] += this.a_;
               var1[1] += this.a_;
            } else if (j.a(var4, var5 - var3) == 0) {
               var1[0] += this.a_;
               var1[1] -= this.a_;
            }
            break;
         case 1:
            if (j.a(var4, var5 + var3) == 0) {
               var1[0] -= this.a_;
               var1[1] += this.a_;
            } else if (j.a(var4, var5 - var3) == 0) {
               var1[0] -= this.a_;
               var1[1] -= this.a_;
            }
            break;
         case 2:
            if (j.a(var4 + var3, var5) == 0) {
               var1[0] += this.a_;
               var1[1] -= this.a_;
            } else if (j.a(var4 - var3, var5) == 0) {
               var1[0] -= this.a_;
               var1[1] -= this.a_;
            }
            break;
         case 3:
            if (j.a(var4 + var3, var5) == 0) {
               var1[0] += this.a_;
               var1[1] += this.a_;
            } else if (j.a(var4 - var3, var5) == 0) {
               var1[0] -= this.a_;
               var1[1] += this.a_;
            }
            break;
         case 4:
            if (j.a(var1[0], var1[1] - var3) == 0) {
               var1[1] -= this.r;
            } else if (j.a(var1[0] + var3, var1[1]) == 0) {
               var1[0] += this.r;
            }
            break;
         case 5:
            if (j.a(var1[0], var1[1] - var3) == 0) {
               var1[1] -= this.r;
            } else if (j.a(var1[0] - var3, var1[1]) == 0) {
               var1[0] -= this.r;
            }
            break;
         case 6:
            if (j.a(var1[0], var1[1] + var3) == 0) {
               var1[1] += this.r;
            } else if (j.a(var1[0] + var3, var1[1]) == 0) {
               var1[0] += this.r;
            }
            break;
         case 7:
            if (j.a(var1[0], var1[1] + var3) == 0) {
               var1[1] += this.r;
            } else if (j.a(var1[0] - var3, var1[1]) == 0) {
               var1[0] -= this.r;
            }
            break;
         case 8:
            var1[0] += this.c_;
            var1[1] -= this.b_;
            break;
         case 9:
            var1[0] -= this.c_;
            var1[1] -= this.b_;
            break;
         case 10:
            var1[0] += this.b_;
            var1[1] += this.c_;
            break;
         case 11:
            var1[0] -= this.b_;
            var1[1] -= this.c_;
            break;
         case 12:
            var1[0] += this.c_;
            var1[1] += this.b_;
            break;
         case 13:
            var1[0] -= this.c_;
            var1[1] += this.b_;
            break;
         case 14:
            var1[0] += this.b_;
            var1[1] -= this.c_;
            break;
         case 15:
            var1[0] -= this.b_;
            var1[1] += this.c_;
      }

      return j.a(var1[0], var1[1]) == 0 ? var1 : var2;
   }

   public final void a(int var1, boolean var2) {
      this.s = this.r;
      this.r = var1;
      if (this.a_ > var1 || this.a_ <= var1 >> 1) {
         var2 = true;
      }

      if (var2) {
         this.a_ = var1 * 1000 / 1414 + 1;
         this.a_ = this.a_ > var1 ? var1 : this.a_;
      }

      if (var2) {
         this.b_ = var1 * 383 / 1000 + 1;
         this.b_ = this.b_ > var1 ? var1 : this.b_;
      }

      if (var2) {
         this.c_ = var1 * 923 / 1000 + 1;
         this.c_ = this.c_ > var1 ? var1 : this.c_;
      }
   }

   public final void j(int var1) {
      super.aa = super.V[8];
      super.ab = super.V[9];
      int var2 = this.r;
      int var3 = j.a();
      int var4 = j.b();
      this.a(this.r, false);
      int var5 = av.H == 1 ? 72 : 0;
      switch(var1) {
         case 0:
            if (super.aa < var3 - var2) {
               super.aa = (short)(super.aa + var2);
               return;
            }
            break;
         case 1:
            if (super.aa > var2) {
               super.aa = (short)(super.aa - var2);
               return;
            }
            break;
         case 2:
            if (super.ab > var2 + var5) {
               super.ab = (short)(super.ab - var2);
               return;
            }
            break;
         case 3:
            if (super.ab < var4 - var2) {
               super.ab = (short)(super.ab + var2);
               return;
            }
            break;
         case 4:
            if (super.aa < var3 - this.a_) {
               super.aa = (short)(super.aa + this.a_);
            }

            if (super.ab > this.a_ + var5) {
               super.ab = (short)(super.ab - this.a_);
               return;
            }
            break;
         case 5:
            if (super.ab > this.a_ + var5) {
               super.ab = (short)(super.ab - this.a_);
            }

            if (super.aa > this.a_) {
               super.aa = (short)(super.aa - this.a_);
               return;
            }
            break;
         case 6:
            if (super.aa < var3 - this.a_) {
               super.aa = (short)(super.aa + this.a_);
            }

            if (super.ab < var4 - this.a_) {
               super.ab = (short)(super.ab + this.a_);
               return;
            }
            break;
         case 7:
            if (super.aa > this.a_) {
               super.aa = (short)(super.aa - this.a_);
            }

            if (super.ab < var4 - this.a_) {
               super.ab = (short)(super.ab + this.a_);
               return;
            }
            break;
         case 8:
            if (super.aa < var3 - this.c_) {
               super.aa = (short)(super.aa + this.c_);
            }

            if (super.ab > var4 + this.b_) {
               super.ab = (short)(super.ab - this.b_);
               return;
            }
            break;
         case 9:
            if (super.aa > var3 + this.c_) {
               super.aa = (short)(super.aa - this.c_);
            }

            if (super.ab > var4 + this.b_) {
               super.ab = (short)(super.ab - this.b_);
            }
            break;
         case 10:
            if (super.aa < var3 - this.b_) {
               super.aa = (short)(super.aa + this.b_);
            }

            if (super.ab < var4 - this.c_) {
               super.ab = (short)(super.ab + this.c_);
               return;
            }
            break;
         case 11:
            if (super.aa > var3 + this.b_) {
               super.aa = (short)(super.aa - this.b_);
            }

            if (super.ab > var4 + this.c_) {
               super.ab = (short)(super.ab - this.c_);
               return;
            }
            break;
         case 12:
            if (super.aa < var3 - this.c_) {
               super.aa = (short)(super.aa + this.c_);
            }

            if (super.ab < var4 - this.b_) {
               super.ab = (short)(super.ab + this.b_);
               return;
            }
            break;
         case 13:
            if (super.aa > var3 + this.c_) {
               super.aa = (short)(super.aa - this.c_);
            }

            if (super.ab < var4 - this.b_) {
               super.ab = (short)(super.ab + this.b_);
               return;
            }
            break;
         case 14:
            if (super.aa < var3 - this.b_) {
               super.aa = (short)(super.aa + this.b_);
            }

            if (super.ab > var4 + this.c_) {
               super.ab = (short)(super.ab - this.c_);
               return;
            }
            break;
         case 15:
            if (super.aa > var3 + this.b_) {
               super.aa = (short)(super.aa - this.b_);
            }

            if (super.ab < var4 - this.c_) {
               super.ab = (short)(super.ab + this.c_);
               return;
            }
      }
   }

   static {
      short[] var10000 = new short[]{128, 0, 192, 64};
   }
}
