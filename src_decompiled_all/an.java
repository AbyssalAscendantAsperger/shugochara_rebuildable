import javax.microedition.lcdui.Graphics;

public final class an extends x {
   private t b;
   private m c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private int j;
   public static final int[] a = new int[]{1, 2, 3, 4, 8, 16};
   private int k = 10000;
   private boolean l;
   private static final short[] m = new short[16];

   public static final an a(byte var0, int var1) {
      int var2;
      if ((var2 = av.n()) == -1) {
         return null;
      } else {
         an var3 = new an();
         av.w[var2] = var3;
         var3.V = new short[16];
         var3.V[0] = 4;
         var3.V[1] = (short)var2;
         var3.V[4] = 50;
         var3.V[5] = -1;
         var3.V[6] = av.e[var3.V[0]];
         var3.V[7] = 0;
         var3.V[8] = 0;
         var3.V[9] = 0;
         var3.k(x.H);
         var3.k(x.I);
         var3.l = true;
         var3.g = o.b(256);
         var3.j = a.length - 1;
         var3.h = o.d(a[var3.j], var3.g);
         var3.i = o.e(a[var3.j], var3.g);
         var3.e = var0;
         var3.f = var1;
         if (av.H <= 9 && var0 != 2) {
            return null;
         } else {
            switch(var0) {
               case -1:
                  System.out.println("你看到我说明掉落物品类型出问题了:)");
                  break;
               case 0:
                  var3.V[7] = (short)(31 + var1 * 2);
                  var3.b = t.a(av.t.be, var1);
                  break;
               case 1:
                  var3.V[7] = 24;
                  System.out.println("dropID" + var1);
                  if (var1 >= 10) {
                     ++var1;
                  }

                  var3.c = m.a(var1);
                  System.out.println("createdropID" + var1);
                  break;
               case 2:
                  var3.d = var1;
                  var3.V[7] = 26;
                  var3.j = 1;
                  if (var3.d <= 100) {
                     var3.f = 0;
                  } else if (var3.d <= 200) {
                     var3.f = 1;
                  } else {
                     var3.f = 2;
                  }
            }

            ++var3.V[7];
            var3.a((short)1);
            if (var3.W != null) {
               var3.W[13] = -1;
            }

            return var3;
         }
      }
   }

   public an() {
      this.a();
   }

   public final void e() {
      if (this.X()) {
         this.a((short)2);
      }
   }

   public final void a(short var1) {
      super.a(var1);
   }

   public final void f() {
      int var1 = super.V[8];
      int var2 = super.V[9];
      var1 += this.h;
      var2 += this.i;
      if (this.e == 2) {
         switch(this.f) {
            case 0:
               this.d((short)27);
               break;
            case 1:
               this.d((short)28);
               break;
            case 2:
               this.d((short)28);
         }
      }

      if (j.a(var1, var2) == 0) {
         super.V[8] = (short)var1;
         super.V[9] = (short)var2;
      } else {
         this.g = 128 > this.g ? 128 - this.g : this.g - 128;
      }

      --this.j;
      if (this.j < 0) {
         if (this.X()) {
            this.a((short)2);
            return;
         }
      } else {
         if (this.e == 2) {
            this.h = o.d(8, this.g);
            this.i = o.e(8, this.g);
            return;
         }

         this.h = o.d(a[this.j], this.g);
         this.i = o.e(a[this.j], this.g);
      }
   }

   public final void Q() {
      boolean var1 = false;
      boolean var2 = false;
      if (Math.abs(av.t.V[8] - super.V[8]) < j.c() && Math.abs(av.t.V[9] - super.V[9]) < j.d()) {
         var2 = true;
         switch(this.e) {
            case 0:
               if (this.b != null) {
                  this.b.a(av.t);
               }
               break;
            case 1:
               if (this.c != null) {
                  this.c.a(av.t);
               }
               break;
            case 2:
               if (var2 = av.t.b.a(this.d)) {
                  av.t.a(0, "金" + this.d);
               }
         }

         if (!var2 && this.l) {
            var1 = false;
            this.l = false;
         } else if (var2) {
            var1 = true;
         }
      }

      if (this.k-- < 0) {
         var1 = true;
      }

      if (var1) {
         av.w[super.V[1]] = null;
      }
   }

   public final boolean d() {
      switch(super.V[3]) {
         case 0:
            this.e();
            break;
         case 1:
            this.f();
            break;
         case 2:
            this.Q();
      }

      return true;
   }

   public final void a() {
      super.W = new int[16];
   }

   public final i a(Graphics var1, int var2, int var3) {
      return super.a(var1, var2, var3);
   }

   static {
      m[4] = 0;
      m[5] = -1;
      m[6] = av.e[1];
      m[7] = 0;
      m[8] = 0;
      m[9] = 0;
   }
}
