import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public abstract class h extends p {
   private byte j_;
   public boolean c = false;
   public boolean d = false;
   public short e = 0;
   public byte f;
   public byte g;
   public byte h = 0;
   public byte i = 0;
   private boolean k_ = false;
   public h j = null;
   public h k = null;
   public h l = null;
   private Hashtable l_ = new Hashtable(0);
   public boolean[] m = new boolean[4];
   public int[] n = new int[4];
   public Vector o = new Vector();
   private static Image m_ = null;
   private static Image n_ = null;
   private static Image aO = null;
   private static byte aP = 0;
   private static final short[] aQ = new short[]{1};
   private static final short[] aR = new short[]{1, 1, 1, 2, 2, 2, 3};
   private n aS = null;
   private static boolean aT = false;
   private n aU = null;
   private static boolean aV = false;

   public final boolean l() {
      return super.V[3] == 6;
   }

   public final void a(byte var1) {
      this.j_ |= var1;
   }

   public final boolean b(byte var1) {
      return (this.j_ & var1) != 0;
   }

   public final boolean m() {
      int var1;
      return (var1 = this.t()) < 1 ? false : o.a(var1);
   }

   public void a(short var1) {
      aT = false;
      switch(var1) {
         case 0:
            this.l(x.Q | x.P);
            break;
         case 6:
            super.aF = true;
            aT = true;
            break;
         case 8:
            this.b((short)0);
      }

      super.a(var1);
   }

   public i a(Graphics var1, int var2, int var3) {
      i var4 = super.a(var1, var2, var3);
      if (!this.m(x.Q) && av.H != 2) {
         this.b(var1, var2, var3);
         this.c(var1, var2, var3 - 50);
         this.d(var1, var2, var3 - 50);
      }

      return var4;
   }

   public boolean d() {
      boolean var1;
      if (!(var1 = super.d())) {
         if (this.h > 0) {
            --this.h;
         }

         if (this.e > 0) {
            --this.e;
         }

         if (super.V[3] != 8 && super.V[3] != 6 && super.W[5] <= 0) {
            super.W[5] -= 10;
            this.a((short)8);
         }

         if (av.H == 2 && super.V[3] != 1) {
            this.a((short)1);
         } else {
            switch(super.V[3]) {
               case 5:
                  this.n();
                  return true;
               case 6:
                  this.o();
                  return true;
               case 7:
                  this.p();
                  return true;
               case 8:
                  this.k();
                  return true;
               case 9:
                  return true;
            }
         }
      }

      return var1;
   }

   public void n() {
      if (av.D != 4) {
         this.a((short)0);
      }
   }

   public boolean a(h var1) {
      return o.a(this.z(), var1.ae()) ? var1.b(this) : false;
   }

   public void o() {
      if (this.X()) {
         this.j_ = 0;
         this.g = 0;
      }
   }

   public void p() {
      if (this.X()) {
         this.a((short)0);
      }
   }

   public void k() {
      super.k();
      ai.b = true;
      if (this.X()) {
         if (this.k != null && this.k instanceof aa) {
            this.k.j = null;
            int var1;
            var1 = (var1 = this.k.W[9] - super.W[9] >> 1) > 0 ? var1 : 1;
            int var2;
            if ((var2 = super.W[34] / (aj.q[1][1] * var1)) > 0) {
               aj.a(this.k, this, var2, (byte)1, 1);
            }

            if ((var2 = super.W[40] / aj.q[0][1]) > 0) {
               aj.a(this.k, this, var2, (byte)0, 1);
            }
         }

         this.E();
         if (this.i > 0) {
            this.l(x.I);
            this.a(true);
         } else {
            this.l(x.P);
            this.k(x.Q);
            this.l(x.H);
            this.l(x.I);
         }

         if (super.W[29] > -1) {
            ++ai.e[super.W[29]];
         }

         if (super.W[30] > -1) {
            ++ai.f[super.W[30]];
         }

         ai.b = false;
      }
   }

   public final void a(int var1) {
      super.W[55] = var1;
   }

   public final void b(int var1) {
      super.W[56] = var1;
   }

   public final void c(int var1) {
      super.W[57] = var1;
   }

   public final void q() {
      super.q();
      super.W[55] = 0;
      super.W[56] = 0;
      super.W[57] = 0;
   }

   public int r() {
      return this.c ? 0 : super.W[22] + super.W[24] + super.W[55];
   }

   public final int s() {
      return this.d ? 0 : super.W[23] + super.W[25] + super.W[56];
   }

   public final int t() {
      return super.W[32] + super.W[33] + super.W[57];
   }

   public boolean b(h var1) {
      this.j_ = 0;
      if (!this.o(38)) {
         return false;
      } else {
         int var2 = var1.r();
         int var3 = this.s();
         if (this.a(var2, var3, var1) > 0) {
            this.a((byte)1);
            this.h = 3;
            this.c(var1);
            this.k = var1;
         }

         return this.j_ != 0;
      }
   }

   public void c(h var1) {
      if (super.W[5] <= 0) {
         this.k(x.P);
      }

      if (this.m(x.P) && super.aE == 0) {
         av.t.d(this);
         this.g = 0;
         this.a((short)8);
      } else {
         int var2 = 0;
         var2 = var1.A();
         if (this.o(6) && this.g != 2 && super.W[5] > 0) {
            this.g = (byte)var2;
         }

         if (this.k != null) {
            this.k.V();
         }

         this.a((short)6);
      }
   }

   public int a(int var1, int var2, h var3) {
      int var8;
      boolean var4 = false;
      int var5 = var1 / 10;
      int var6 = this.S();
      label49:
      switch(super.W[28]) {
         case 1:
            var8 = var6 / var2;
            break;
         case 2:
            switch(var3.W[26]) {
               case 1:
                  var8 = var1 * (100 - (var2 >> 1)) / 100;
                  break label49;
               case 2:
                  var8 = var6 * var1 * (100 - var2) / 10000;
                  break label49;
               default:
                  var8 = (var1 + o.b(-var5, var5)) * (100 - var2) / 100;
                  break label49;
            }
         case 3:
            var8 = 0;
            break;
         default:
            switch(var3.W[26]) {
               case 1:
                  var8 = var1;
                  break;
               case 2:
                  var8 = var6 * var1 / 100;
                  break;
               default:
                  var8 = var1 + o.b(-var5, var5) - var2;
            }
      }

      if (var8 < 0) {
         var8 = 1;
      }

      if (var8 > 0) {
         if (var3.W[31] > 1 && var3.m()) {
            var8 *= var3.W[31];
            this.a((byte)2);
         }

         int var7 = 0;
         if (this.o(32)) {
            var7 = 3;
         } else {
            var7 = this.b((byte)2) ? 2 : 1;
         }

         if (this instanceof aa) {
            var8 = var8 * (100 - super.W[103]) / 100;
         }

         this.a(var3, -var8);
         this.d(-var8);
         this.a(-var8, null, (byte)var7);
      } else if (var8 == 0) {
         var3.a(var8, null);
      }

      return var8;
   }

   public final void a(h var1, int var2) {
      Object var3;
      if ((var3 = this.l_.get(var1)) == null) {
         var3 = new int[]{var2};
      } else {
         ((int[])var3)[0] += var2;
      }

      this.l_.put(var1, var3);
   }

   public final void u() {
      this.v();
      this.w();
   }

   public final void v() {
      if (super.W[5] < 0) {
         super.W[5] = 0;
      } else {
         if (super.W[5] > this.S()) {
            super.W[5] = this.S();
         }
      }
   }

   public final void w() {
      if (super.W[7] < 0) {
         super.W[7] = 0;
      } else {
         if (super.W[7] > this.T()) {
            super.W[7] = this.T();
         }
      }
   }

   public final void d(int var1) {
      super.W[5] += var1;
      if (super.V[3] != 6 && super.W[5] <= 0) {
         this.k(x.P);
         if (this instanceof v) {
            this.b((short)0);
         }
      }

      this.v();
   }

   public final void e(int var1) {
      super.W[7] += var1;
      this.w();
   }

   public final void x() {
      short var1;
      if ((var1 = (short)this.C()) != false) {
         super.r = var1;
         this.i(this.V());
         this.H();
      }
   }

   public final void y() {
      if (super.aF) {
         this.c(super.V[6], super.V[7]);
         if (super.aE == 0 && super.aB != 0 && !this.m(x.P)) {
            super.aE = super.V[9];
         }

         super.aF = false;
      }
   }

   public final void a(x var1, int var2) {
      this.g = (byte)var2;
      this.a((short)6);
   }

   public final short[] z() {
      return this.a(super.V[6], super.V[7], super.al[0], super.V[8], super.V[9]);
   }

   public final short[] a(short var1, short var2, short var3, short var4, short var5) {
      short[] var6;
      if ((var6 = l.e[var1].a((byte)2, var2, var3))[0] == false && var6[1] == false && var6[2] == false && var6[3] == false) {
         return null;
      } else {
         if ((var6[0] != 0 || var6[0] != var6[2]) && super.W[4] == 1) {
            short var7 = (short)(-var6[0]);
            var6[0] = (short)(-var6[2]);
            var6[2] = var7;
         }

         o.a(var6, var4, var5);
         return var6;
      }
   }

   public final int A() {
      return l.e[super.V[6]].b(super.V[7], super.al[0]);
   }

   public final int B() {
      return l.e[super.V[6]].c(super.V[7], super.al[0]);
   }

   public final int C() {
      return l.e[super.V[6]].d(super.V[7], super.al[0]);
   }

   public final void D() {
      if (!this.m[0] || (this.n[0] & 1) != 0 || super.V[3] == 8) {
         super.D();
      }
   }

   public final void a(int var1, String var2) {
      this.a(var1, var2, (byte)0);
   }

   public final void a(int var1, String var2, byte var3) {
      aP = var3;
      if (var2 == null) {
         var2 = (var1 > 0 ? "+" : "") + String.valueOf(var1);
      }

      int var4 = 0;
      if (this.o.size() > 0) {
         var4 = Integer.parseInt(((String[])this.o.elementAt(this.o.size() - 1))[1]);
      }

      this.o.addElement(new String[]{var2, String.valueOf(var4)});
   }

   public final void b(Graphics var1, int var2, int var3) {
      if (this.o.size() > 0) {
         int var5 = 0;
         boolean var6 = false;
         Image var7 = null;
         byte var8 = 1;
         switch(aP) {
            case 0:
            case 1:
            case 2:
               if (m_ == null) {
                  m_ = o.a("normal_attack_num");
               }

               var8 = 3;
               var7 = m_;
               break;
            case 3:
               if (n_ == null) {
                  n_ = o.a("hero_hurt_num");
               }

               var8 = 1;
               var7 = n_;
               break;
            case 4:
               if (aO == null) {
                  aO = o.a("heal_num");
               }

               var8 = 1;
               var7 = aO;
         }

         for(int var9 = 0; var9 < this.o.size(); ++var9) {
            String[] var4;
            var5 = Integer.parseInt((var4 = (String[])this.o.elementAt(var9))[1]);
            ++var5;
            if (var7 == null) {
               return;
            }

            if (var4[0].startsWith("-")) {
               o.a(var1, var7, String.valueOf(var4[0]), var2, var3 - 50 - (var5 << 2), 33, var8, var5 / 4, 11);
            } else if (var4[0].startsWith("+")) {
               o.a(var1, var7, String.valueOf(var4[0]), var2, var3 - 50 - (var5 << 2), 33, var8, var5 / 4, 11);
            } else if (var4[0].startsWith("0")) {
               if (av.I == null) {
                  av.I = o.a("miss");
               }

               if (var5 > 30) {
                  av.I = null;
               } else {
                  var1.drawImage(av.I, var2 - (av.I.getWidth() >> 1), var3 - 50 - (var5 << 2), 0);
               }
            } else if (var5 > 0) {
               o.a(var1, var4[0], var2, var3 - 40 - (var5 << 2), 33, 15776265, 0);
            }

            if (var5 < 5) {
               var4[1] = String.valueOf(var5);
               this.o.setElementAt(var4, var9);
            } else {
               var6 = true;
            }

            if (var6) {
               this.o.removeElementAt(0);
            }
         }
      }
   }

   public final void E() {
      if (!this.k_) {
         int var1 = super.V[8] + 1;
         int var2 = super.V[9] + 1;
         int var3 = ai.e[72] + 1;
         boolean var4 = false;
         an var5;
         if (super.W[52] > -1 && o.a(super.W[53] * var3 + 0) && (var5 = an.a((byte)0, super.W[52])) != null) {
            var5.d((short)var1, (short)var2);
         }

         if (super.W[48] > -1 && o.a(super.W[49] * var3 + 0)) {
            int var9 = o.a(aQ);

            for(int var6 = 0; var6 < var9; ++var6) {
               an var7;
               if ((var7 = an.a((byte)1, super.W[48])) != null) {
                  var7.d((short)var1, (short)var2);
               }
            }
         }

         if (super.W[50] > -1 && o.a(super.W[51] * var3 + 0)) {
            int var10 = o.a(aQ);

            for(int var12 = 0; var12 < var10; ++var12) {
               an var14;
               if ((var14 = an.a((byte)1, super.W[50])) != null) {
                  var14.d((short)var1, (short)var2);
               }
            }
         }

         if (super.W[46] > 0 && o.a(super.W[47] * var3 + 0)) {
            int var11 = o.a(aR);

            for(int var13 = 0; var13 < var11; ++var13) {
               int var8 = o.b(3, super.W[46]);
               an var15;
               if ((var15 = an.a((byte)2, var8)) != null) {
                  var15.d((short)var1, (short)var2);
               }
            }
         }

         this.k_ = true;
      }
   }

   public final h F() {
      h var1 = null;
      if (this.l_ != null && this.l_.size() > 0) {
         int var2 = 0;
         Enumeration var3 = this.l_.keys();

         while(var3.hasMoreElements()) {
            Object var4 = var3.nextElement();
            int var5;
            if ((var5 = ((int[])this.l_.get(var4))[0]) > var2) {
               var2 = var5;
               var1 = (h)var4;
            }
         }
      }

      return var1;
   }

   public final void f(int var1) {
      if (var1 >= 0) {
         if (this.aS == null) {
            this.aS = new n();
         }

         aT = true;
         this.aS.c = 61;
         this.aS.d = var1;
         short[] var2 = this.ae();
         this.aS.a(var2[0] + (var2[2] - var2[0] >> 1), var2[1] + (var2[3] - var2[1] >> 1));
         this.g(4);
      }
   }

   public void i() {
      super.i();
      if (this.aS != null && aT) {
         this.aS.a();
         aT = !this.aS.b();
      } else if (this.aS != null) {
         this.aS = null;
      }

      this.G();
   }

   public final void g(int var1) {
      if (var1 >= 0) {
         if (this.aU == null) {
            this.aU = new n();
         }

         aV = true;
         this.aU.c = 61;
         this.aU.d = var1;
         short[] var2 = this.ae();
         this.aU.a(var2[0] + (var2[2] - var2[0] >> 1), var2[1] + (var2[3] - var2[1] >> 1));
      }
   }

   public final void G() {
      if (this.aU != null && aV) {
         this.aU.a();
         aV = !this.aU.b();
      } else {
         if (this.aU != null) {
            this.aU = null;
         }
      }
   }

   static {
      byte[] var10000 = new byte[]{24, 24, 24, 24};
   }
}
