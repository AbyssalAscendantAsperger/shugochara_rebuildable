import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class aa extends h {
   public e a = null;
   public w b = null;
   public static int aJ;
   public static boolean aK = true;
   public static boolean aL = true;
   public static final int aM = 1 << ((x)null).D + 0;
   public static final int aN = 1 << ((x)null).D + 1;
   public static final int aW = 1 << ((x)null).D + 2;
   public static final int aX = 1 << ((x)null).D + 3;
   public static final short[][] aY = new short[][]{
      {0, 0},
      {0, 0},
      {0, 0},
      {1, 1, 1, 1, 1, 1},
      {1, 1, 1, 1, 1, 1},
      {6, 6, 7, 7, 8, 8, 9, 9, 25, 25, 26, 26, 18, 18, 19, 19, 20, 20},
      {14, 14, 15, 15, 16, 16},
      {0, 0},
      {17, 17},
      {1, 1},
      {2, 2},
      {4, 4},
      {3, 3},
      {24, 24},
      {0, 0},
      {21, 21},
      {22, 22},
      {23, 23},
      {5, 5},
      {10, 10, 11, 11, 12, 12, 13, 13}
   };
   public int aZ;
   public static int ba = 0;
   private static int bv = 0;
   private short bw;
   private short bx;
   private int by = -1;
   public int bb;
   public static boolean bc;
   public static boolean bd = false;
   public byte be = 0;
   public t[] bf = new t[4];
   public static int bg = 0;
   private short[] bz = new short[2];
   public byte bh = 0;
   private static boolean bA = false;
   private static short bB = 0;
   private static int bC = 0;
   private static Image bD = null;
   private static Image bE = null;
   private static Image bF = null;
   private static final int[] bG = new int[]{14286848, 16745728, 9752064, 27597, 9274879};
   private static final int bH = bG.length;
   private static Image bI = null;
   private static Image bJ = null;
   private static n bK = null;
   public static boolean bi = false;
   private int bL = -1;
   public boolean bj = false;
   private short[] bM = new short[15];
   private byte bN;
   private byte bO;
   public static final int[] bk = new int[]{32, 64, 512, 16};
   public static boolean[] bl = new boolean[]{true, true, true, true};
   public static int[] bm = new int[]{0, 1, 2, 3};
   private int[] bP = new int[4];
   private int[] bQ = new int[2];
   private n bR = null;
   public boolean bn = false;
   public short[][] bo = new short[4][2];
   public short[] bp = new short[4];
   public short[] bq = new short[4];
   public short[][] br = new short[4][5];
   public static final short[] bs = new short[]{-1, -1, -1, -1};
   public static byte bt = 0;
   public static boolean bu = false;
   private n bS = null;
   private static boolean bT = false;

   public aa(byte var1) {
      super.R = aY;
      this.be = var1;
      this.a = new e(this.be);
      this.b = new w(this);
   }

   public final void a() {
      super.W = new int[106];
      super.a();
      super.W[16] = super.V[16];
      this.a(super.W[16], true);
      super.W[68] = super.V[17];
      super.W[10] = 0;
      super.W[1] = super.V[26];
      super.W[2] = super.V[27];
      super.W[5] = super.W[6] = super.V[18];
      super.W[7] = super.W[8] = super.V[19];
      super.W[75] = 100;
      super.W[76] = 100;
      super.W[22] = super.V[20];
      super.W[23] = super.V[21];
      super.W[32] = super.V[22];
      super.W[14] = 0;
      super.W[15] = 0;
      super.W[54] = 10;
      super.W[62] = -1;
      super.W[63] = -1;
      super.W[64] = -1;
      super.W[65] = 0;
      super.W[66] = 0;
      super.W[67] = 0;
      super.W[72] = 100;
      super.W[34] = 0;
      super.W[35] = 0;
      super.W[36] = 0;
      super.W[40] = 0;
      super.W[41] = 0;
      super.W[42] = 0;
      super.W[37] = 0;
      super.W[38] = 0;
      super.W[39] = 0;
      super.W[45] = 0;
      super.W[43] = 0;
      super.W[44] = 0;
      super.W[80] = super.W[82] = 3;
      super.W[93] = 0;
      super.W[103] = 0;
      super.W[60] = 0;
      super.W[59] = 7;
      super.W[61] = 13;
      this.y(super.W[60]);
      this.y(super.W[59]);
      this.y(super.W[61]);
      ((w)null).f.removeAllElements();
      ((w)null).c.removeAllElements();
      ((w)null).d.removeAllElements();
      ((w)null).e.removeAllElements();
      ((w)null).a(2, 1);
      ((w)null).a(0, 5);
      ((w)null).a(1, 5);
      this.aL();
      super.W[69] = super.V[23];
      super.W[70] = 0;
      super.W[71] = 15;
      super.W[73] = 0;
      super.W[74] = -1;
      super.W[94] = 4;
      super.W[95] = 0;
      super.W[13] = super.V[25];
      super.aH = true;
      this.B(1);
      super.W[105] = -1;
   }

   public final void y(int var1) {
      t var2 = ((t)null).a(this.be, var1);
      this.a(var2);
   }

   public final void a(t var1) {
      switch(var1.n) {
         case 0:
            super.W[60] = var1.j;
            break;
         case 1:
            super.W[59] = var1.j;
            break;
         case 2:
            super.W[61] = var1.j;
            break;
         case 3:
            super.W[63] = var1.j;
      }

      if (this.bf[var1.n] != null) {
         this.bf[var1.n].c(this);
      }

      var1.b(this);
      this.bf[var1.n] = var1;
      this.b.a(var1);
   }

   public final void z(int var1) {
      if (var1 < 0 && super.W[104] > 0) {
         var1 -= var1 * super.W[104] / 100;
      }

      super.W[75] += var1;
      this.h();
   }

   public final void g() {
      ++this.aZ;
      if (this.aZ % ((ae)null).b == 0) {
         this.d(super.W[65]);
         this.e(super.W[66]);
         super.W[75] += super.W[67];
         this.h();
      }
   }

   public final void h() {
      if (super.W[75] < 0) {
         super.W[75] = 0;
      } else {
         if (super.W[75] > super.W[76]) {
            super.W[75] = super.W[76];
         }
      }
   }

   public final void j() {
      this.bb = ((p)null).a(super.V[6], 4);
   }

   public final void A(int var1) {
      super.W[74] = var1;
   }

   public final i a(Graphics var1, int var2, int var3) {
      if (super.W[74] >= 0) {
         i var4;
         (var4 = ((l)null).e[4]).a((short)super.W[74], this.bz);
         if (this.bz[0] == 0 && this.bz[1] == 0) {
            super.W[74] = -1;
         } else {
            var4.a(var1, super.W[74], this.bz[0], var2, var3, false);
         }
      }

      if (super.W[70] == 2) {
         ++this.bO;
         this.bM[this.bN + 0] = super.V[7];
         this.bM[this.bN + 1] = super.al[0];
         this.bM[this.bN + 2] = super.V[8];
         this.bM[this.bN + 3] = super.V[9];
         this.bM[this.bN + 4] = super.V[15];
         this.bN = (byte)(this.bN + 5);
         if (this.bN == this.bM.length) {
            this.bN = 0;
         }

         for(int var5 = 0; var5 < this.bM.length; var5 += 5) {
            if (this.bM[var5] != -1) {
               ((l)null).e[super.V[6]]
                  .a(var1, this.bM[var5 + 0], this.bM[var5 + 1], this.bM[var5 + 2] - ((ac)null).h(), this.bM[var5 + 3] - ((ac)null).j(), this.bM[var5 + 4] == 0, super.X);
            }
         }
      }

      if (this.m(aM)) {
         this.e(var1, var2, var3);
      }

      i var6 = super.a(var1, var2, var3);
      if (!this.m(aM)) {
         this.e(var1, var2, var3);
      }

      if (bA) {
         this.r(10);
      }

      return var6;
   }

   public final int a(int var1, int var2, h var3) {
      if (this.c((short)15)) {
         this.bh = 0;
         this.a((short)16);
         return 0;
      } else {
         return super.a(var1, var2, var3);
      }
   }

   public final boolean b(h var1) {
      if ((super.V[3] != 5 || super.f < 6) && super.V[3] != 17 && super.V[3] != 16 && super.V[3] != 14) {
         if (!this.c((short)8)) {
            int var2 = 0;
            if ((super.V[2] & aM) != aM) {
               int var3 = var1.r();
               int var4 = this.s();
               if ((var2 = this.a(var3, var4, var1)) <= 0) {
                  return false;
               }

               ((av)null).c(var2, 3);
               if (this.m(((x)null).P)) {
                  this.a((short)8);
               } else {
                  bt = (byte)var1.A();
                  this.a(var1, bt);
               }
            }

            if (super.W[75] < super.W[76]) {
               super.W[75] += 10;
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public final void a(short var1) {
      if (((n)null).r > 0) {
         ((n)null).l();
      }

      this.bj = false;
      switch(var1) {
         case 0:
            this.bh = 0;
         case 5:
         default:
            break;
         case 10:
            int[] var2 = ((p)null).a(super.V[15], super.V[8], super.V[9], ((p)null).a(super.V[6], 2));
            super.p = var2[0];
            super.q = var2[1];
            break;
         case 11:
            this.j();
            int[] var3 = ((p)null).a(super.V[15], super.V[8], super.V[9], this.bb);
            super.p = var3[0];
            super.q = var3[1];
      }

      if (var1 != 8) {
         this.b((short)50);
      }

      super.a(var1);
   }

   public final void b() {
      int var1 = 0;
      switch(super.V[3]) {
         case 3:
            var1 = super.t;
         case 4:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         default:
            break;
         case 5:
            var1 = super.f;
            break;
         case 6:
            var1 = super.g;
            break;
         case 16:
            var1 = this.bh;
            break;
         case 17:
            var1 = this.bh - 1;
      }

      if (!bc) {
         if (super.V[3] < 0) {
            this.d(super.V[7]);
            return;
         }

         if (aY[super.V[3]].length <= 0) {
            return;
         }

         this.d(aY[super.V[3]][(var1 << 1) + this.V()]);
      }
   }

   public final void c(byte var1) {
      this.bx = this.bw;
      this.bw = (short)var1;
   }

   public final void a(byte var1, short var2) {
      this.c(var1);
      this.u(var2);
   }

   public final void al() {
      this.bx = this.bw;
      this.bw = -1;
      super.t = 0;
      this.bh = 0;
   }

   public final void am() {
      for(int var1 = 0; var1 < this.bP.length; ++var1) {
         if (this.bP[var1] > 0) {
            this.bP[var1]--;
         }
      }

      for(int var2 = 0; var2 < this.bQ.length; ++var2) {
         if (this.bQ[var2] > 0) {
            this.bQ[var2]--;
         }
      }
   }

   public final void c() {
      super.c();
   }

   public final boolean d() {
      ((aj)null).a();
      if (super.ap <= 0) {
         this.am();
         if (!this.m(((x)null).P | ((x)null).Q)) {
            this.g();
            if (((av)null).D == 4 && !this.m(aN) && !this.c((short)13) && !super.m[2]) {
               this.ar();
            }
         }

         if (!this.bj && bv++ > 12) {
            ba = 0;
         }
      }

      if (bB == 100 && !((av)null).t.b.c(27)) {
         ((t)null).f[27] = 1;
         ((av)null).t.b.b(27);
         ((g)null).a("Nhận danh hiệu: " + ((t)null).a[0][27]);
         ((g)null).e = true;
         ((g)null).f = false;
      }

      if (((av)null).H == 27 && !((av)null).t.b.c(29)) {
         ((t)null).f[29] = 1;
         ((av)null).t.b.b(29);
         ((g)null).a("Nhận danh hiệu: " + ((t)null).a[0][29]);
         ((g)null).e = true;
         ((g)null).f = false;
      }

      if (((t)null).f[35] == 0 && ((av)null).t.b.c(5) && ((av)null).t.b.c(4) && ((av)null).t.b.c(3) && ((av)null).t.b.c(2) && ((av)null).t.b.c(1)) {
         ((t)null).f[35] = 1;
         ((av)null).t.b.b(35);
         ((g)null).a("Nhận danh hiệu: " + ((t)null).a[0][35]);
         ((g)null).e = true;
         ((g)null).f = false;
      }

      if (((av)null).t.W[5] <= 0) {
         this.k();
      }

      this.ap();
      boolean var1 = false;
      if (super.d()) {
         var1 = true;
      } else {
         switch(super.V[3]) {
            case 10:
               this.an();
               break;
            case 11:
               this.aC();
               var1 = true;
               break;
            case 12:
               this.aG();
               break;
            case 13:
               this.aA();
               break;
            case 14:
               this.aB();
               break;
            case 15:
               this.ax();
               break;
            case 16:
               this.ay();
               break;
            case 17:
               this.az();
               break;
            case 18:
               this.aE();
               break;
            case 19:
               this.aD();
         }
      }

      if (((ai)null).b && this.Y() && this.bL == super.V[3]) {
         ((ai)null).b = false;
         ((ai)null).a = false;
         this.bL = -1;
      }

      return var1;
   }

   private void ax() {
      if (this.Y()) {
         this.a((short)0);
         ((a)null).a();
      }
   }

   private void ay() {
      bA = true;
      if (this.Y()) {
         this.a((short)0);
         ((a)null).a();
         bA = false;
      } else {
         if (((a)null).e(16384)) {
            bA = false;
            if (this.bh > 0) {
               this.v(this.ad());
            }

            if (this.bh++ < 2 && ((av)null).t.bf[0].j != 5 && ((av)null).t.bf[0].j != 6) {
               if (super.W[75] >= 33) {
                  this.z(-this.a.a(3, 16));
               } else {
                  if (super.W[75] < 16) {
                     this.a(-1, "Không đủ nộ khí");
                     this.a((short)0);
                     return;
                  }

                  this.z(-this.a.a(3, 16));
               }
            }

            this.a((short)17);
         }
      }
   }

   private void az() {
      if (this.Y()) {
         ((av)null).c(1, 5);
         if (++bB > 100) {
            bB = 100;
         }

         this.a((short)0);
         ((a)null).a();
      } else {
         if (this.af()) {
            int var1;
            if ((var1 = this.C() * 30) >= 120) {
               if (this.V() == 1 && this.ab() < var1) {
                  var1 = this.ab() - 10;
               } else if (this.V() == 0 && ((j)null).a() - this.ab() < var1) {
                  var1 = ((j)null).a() - this.ab() - 10;
               }

               int var2 = 1;

               for(int var3 = var1 >> 3; var2 <= var3; ++var2) {
                  int var4 = var2 << 3;
                  int var5 = this.V() == 1 ? -var4 : var4;
                  int var6 = super.V[8] + var5;
                  short var7 = super.V[9];
                  if (((j)null).a(var6, var7) > 0 || super.A != null && super.A.b && !super.A.a(this, var6, var7)) {
                     System.out.println("step = " + var4);
                     var1 = var4 - 10;
                     break;
                  }
               }

               this.d(this.ab() + (this.V() == 1 ? -var1 : var1), this.ac());
            }

            super.W[32] = 100;
            super.W[31] = ((av)null).t.a.c(3) * 2;
            this.aq();
            super.W[32] = super.V[22];
         }
      }
   }

   private void aA() {
      if (this.X()) {
         this.a((short)0);
      }
   }

   private void aB() {
      if (this.X()) {
         this.a((short)0);
      }
   }

   public final void k() {
      if (this.X()) {
         ((av)null).j();
      }
   }

   public final void e() {
      if (bc && this.bw != 1 && this.bw != 3) {
         this.bw = -1;
      }
   }

   public final void an() {
      if (this.af() && (super.V[15] == 1 || super.V[15] == 0)) {
         this.b(super.V[15], this.C(), super.p, super.q);
      }

      if (this.Y()) {
         this.a((short)0);
      }
   }

   public final void f() {
      if (super.V[3] == 3) {
         this.i(super.V[15]);
      }
   }

   public final h ao() {
      Object var1 = null;
      h var2 = null;
      int var3 = 999999;

      for(int var4 = 0; var4 < ((av)null).z; ++var4) {
         x var6;
         if ((var6 = ((av)null).d(((av)null).A[var4])) != null && var6.o(1) && var6.m(((x)null).H) && !var6.m(((x)null).P | ((x)null).Q) && var6 instanceof h && this.c(var6)) {
            int var5 = Math.abs(var6.V[8] - super.V[8]);
            if (var3 > var5) {
               var3 = var5;
               var2 = (h)var6;
            }
         }
      }

      return var2;
   }

   public final boolean c(x var1) {
      int var2;
      if ((var2 = this.V()) != 0 && var1.V[8] < super.V[8] || var2 == 0 && var1.V[8] > super.V[8]) {
         return Math.abs(var1.V[9] - super.V[9]) < 80;
      } else {
         return false;
      }
   }

   private void aC() {
      if (this.af()) {
         this.b(super.V[15], this.C(), super.p, super.q);
         this.aq();
      }

      if (this.Y()) {
         this.a((short)0);
      }
   }

   private void aD() {
      boolean var1 = false;
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;
      if (((a)null).b(256)) {
         ++bC;
      }

      if (this.af()) {
         this.aq();
      }

      if (super.V[7] == 11) {
         if (bC > 24) {
            this.d((short)13);
         }

         if (this.Y()) {
            this.d((short)11);
         }

         if (!((a)null).b(256)) {
            if (bC < 9) {
               this.d((short)12);
            } else {
               this.d((short)13);
            }
         }
      }

      if (this.Y() && super.V[7] == 10) {
         if (bC > 2) {
            this.d((short)11);
         } else {
            this.d((short)12);
         }
      }

      if (this.Y() && (super.V[7] == 12 || super.V[7] == 13)) {
         this.a((short)0);
      }
   }

   private void aE() {
      if (this.af()) {
         this.b(super.V[15], this.C(), super.p, super.q);
         this.aq();
      }

      if (this.Y()) {
         this.a((short)0);
      }
   }

   private void aF() {
      if (!this.m(aW) && !this.bj) {
         switch(this.bw) {
            case 4:
               return;
            case 5:
            default:
               break;
            case 6:
               if (!this.m(aW) && !bc) {
                  super.f = 6;
                  this.a((short)5);
                  return;
               }
               break;
            case 7:
               if (!this.m(aW) && !bc) {
                  super.f = 7;
                  this.a((short)5);
                  return;
               }
               break;
            case 8:
               if (!this.m(aW) && !bc) {
                  super.f = 8;
                  this.a((short)5);
                  return;
               }
         }
      }
   }

   public final void n() {
      if (bc) {
         this.a((short)0);
      } else {
         this.bj = super.f >= 6;
         this.aF();
         if (this.af()) {
            super.j = this.ao();
            if (((o)null).b(0, 99) < super.W[32]) {
               super.W[31] = 2;
            } else {
               super.W[31] = 1;
            }

            this.x();
            if (this.bj) {
               super.W[31] = 2;
            }

            int var2;
            if (this.aq() > 0 && (var2 = this.B()) > 0) {
               super.ap = var2;
            }
         }

         if (this.Y()) {
            if (this.bj) {
               this.bj = false;
               this.by = -1;
               this.a((short)0);
            } else if (this.bw != 4 && !bi) {
               this.a((short)0);
            } else {
               bi = false;
               if (++super.f >= super.W[94]) {
                  ((a)null).a();
                  super.f = 0;
                  this.a((short)0);
               } else {
                  this.a((short)5);
               }
            }
         }

         super.n();
      }
   }

   public final void o() {
      this.y();
      if (super.aE != 0) {
         if (super.aE >= super.V[9]) {
            super.V[8] = (short)(super.V[8] + super.aA);
            if (super.V[8] < 8 || super.V[8] > ((j)null).a() - 8 || ((j)null).a(super.V[8], super.aE) != 0) {
               super.V[8] = (short)(super.V[8] - super.aA);
               super.aA = -super.aA;
            }

            super.V[9] = (short)(super.V[9] + super.aB);
            super.aB += super.aD;
         }

         if (super.aE < super.V[9]) {
            super.V[9] = super.aE;
            super.aE = 0;
            return;
         }
      } else {
         if (this.X()) {
            if (super.g == 2) {
               this.a((short)12);
            } else {
               this.a((short)0);
            }

            super.g = 0;
            super.f = 0;
         }

         super.o();
      }
   }

   private void aG() {
      if (this.Y()) {
         this.a((short)0);
      }
   }

   public final int ap() {
      if (super.W[9] >= 99) {
         return -1;
      } else {
         int var1 = super.W[9];

         while(super.W[10] >= super.W[11]) {
            ++var1;
            super.V[15] = 0;
            this.a(0, "Lên cấp " + var1 + "");
            this.B(var1);
            if (super.V[3] != 13) {
               this.a((short)13);
            }
         }

         if (((av)null).H <= 9 && ((av)null).H != 2) {
            return var1;
         } else {
            if (var1 >= 4) {
               if (!((av)null).t.b.c(19)) {
                  ((t)null).f[19] = 1;
                  ((av)null).t.b.b(19);
                  ((g)null).a("Nhận danh hiệu: " + ((t)null).a[0][19]);
                  ((g)null).e = true;
                  ((g)null).f = false;
               } else if (var1 >= 10) {
                  if (!((av)null).t.b.c(20)) {
                     ((t)null).f[20] = 1;
                     ((av)null).t.b.b(20);
                     ((g)null).a("Nhận danh hiệu: " + ((t)null).a[0][20]);
                     ((g)null).e = true;
                     ((g)null).f = false;
                  } else if (var1 >= 20) {
                     if (!((av)null).t.b.c(21)) {
                        ((t)null).f[21] = 1;
                        ((av)null).t.b.b(21);
                        ((g)null).a("Nhận danh hiệu: " + ((t)null).a[0][21]);
                        ((g)null).e = true;
                        ((g)null).f = false;
                     } else if (var1 >= 30) {
                        if (!((av)null).t.b.c(22)) {
                           ((t)null).f[22] = 1;
                           ((av)null).t.b.b(22);
                           ((g)null).a("Nhận danh hiệu: " + ((t)null).a[0][22]);
                           ((g)null).e = true;
                           ((g)null).f = false;
                        } else if (var1 >= 40 && !((av)null).t.b.c(23)) {
                           ((t)null).f[23] = 1;
                           ((av)null).t.b.b(23);
                           ((g)null).a("Nhận danh hiệu: " + ((t)null).a[0][23]);
                           ((g)null).e = true;
                           ((g)null).f = false;
                        }
                     }
                  }
               }
            }

            return var1;
         }
      }
   }

   public final void B(int var1) {
      if (super.W[9] < 99) {
         int var2 = var1 - super.W[9];
         super.W[9] = var1;
         super.W[6] += 12 * var2;
         super.W[8] += 7 * var2;
         super.W[5] = this.S();
         super.W[7] = this.T();
         super.W[22] += 3 * var2;
         super.W[23] += var2;
         super.W[11] = (10 * var1 + 80) * var1;
         super.W[58] += (var1 - 1) / 5 + 1;
      }
   }

   public final int aq() {
      short[] var1;
      if ((var1 = this.z()) == null) {
         return 0;
      } else {
         int var2 = 0;
         Object var3 = null;

         for(int var4 = 0; var4 < ((av)null).x; ++var4) {
            short[] var5;
            x var7;
            if ((var7 = ((av)null).w[((av)null).y[var4]]) != null
               && var7.m(((x)null).I)
               && var7.m(((x)null).H | ((x)null).K)
               && (((av)null).h[var7.V[0]] & 1) == 1
               && !var7.m(((x)null).P)
               && !var7.m(((x)null).Q)
               && (var5 = var7.ae()) != null
               && var7.o(1)
               && ((o)null).a(var1, var5)
               && ((o)null).a(var7.ab(), var7.ac(), ((ac)null).a)
               && var7 instanceof h) {
               super.j = (h)var7;
               if (super.j.b(this)) {
                  ++var2;
                  bu = super.j.b((byte)2);
                  if (var7.m(((x)null).P)) {
                     super.W[75] += 5;
                     super.W[75] = Math.min(super.W[75], super.W[76]);
                  } else {
                     int var6 = 0;
                     var6 = ((o)null).b(0, 100) > 50 ? 1 : 2;
                     super.j.f(var6);
                  }
               }
            }
         }

         if (var2 > 0) {
            if (bv < 12) {
               ba += var2;
            }

            bv = 0;
            if (super.f < 6 && super.W[75] < super.W[76]) {
               this.z(3);
            }
         }

         return var2;
      }
   }

   public final void b(Graphics var1) {
      if (bD == null) {
         bD = ((o)null).a("moshui");
      }

      if (bE == null) {
         bE = ((o)null).a("ji");
      }

      if (bF == null) {
         bF = ((o)null).a("num5");
      }

      if (ba > 0) {
         boolean var2 = false;
         boolean var3 = false;
         var1.drawImage(bD, 248, 110, 40);
         var1.drawImage(bE, 238, 100, 40);
         ((o)null).a(var1, bF, String.valueOf(ba), 238 - bE.getWidth() - 4, 98, 40, 1, 0, 10);
         if (((av)null).g(2) < ba) {
            ((av)null).b(ba, 2);
         }

         ((av)null).c(1, 1);
         if (((av)null).g(2) < ba) {
            ((av)null).b(ba, 2);
         }

         if (!((av)null).t.b.c(24) && ((av)null).g(2) >= 100) {
            ((t)null).f[24] = 1;
            ((av)null).t.b.b(24);
            ((g)null).a("Nhận danh hiệu: " + ((t)null).a[0][24]);
            ((g)null).e = true;
            ((g)null).f = false;
            return;
         }

         if (!((av)null).t.b.c(25) && ((av)null).g(2) >= 200) {
            ((t)null).f[25] = 1;
            ((av)null).t.b.b(25);
            ((g)null).a("Nhận danh hiệu: " + ((t)null).a[0][25]);
            ((g)null).e = true;
            ((g)null).f = false;
         }
      }
   }

   public final void c(Graphics var1) {
      if (super.j != null && !super.j.m(((x)null).Q) && super.j.aH && super.j.o(6)) {
         Object var2 = null;
         boolean var3;
         int var4 = (var3 = super.j.o(4)) ? 4 : 8;
         ((k)null).a(var1, 2, var4);
         v var5;
         int var6;
         if (super.j instanceof v && (var6 = (var5 = (v)super.j).W[81]) >= 0) {
            if (bK == null) {
               bK = new n();
            }

            bK.c = 59;
            bK.d = 0;
            bK.e = var6;
            short[] var11 = ((k)null).a((short)2, (short)(var3 ? 1 : 2));
            bK.b(var11[0] + (var11[2] >> 1), var11[1] + (var11[3] >> 1));
         }

         short[] var12 = ((k)null).a((short)2, (short)(var3 ? 5 : 14));
         int var13 = var3 ? 2000 : 1000;
         if (super.j.W[6] < var13) {
            var13 = super.j.W[6];
         }

         var6 = super.j.W[5] / var13;
         int var7;
         int var16;
         int var8 = var16 = (var7 = super.j.W[5] % var13) > 0 && var6 > 0 ? ++var6 : var6;
         if (var16 > 1) {
            var8 = (var16 - 1) % bH;
            ((o)null).a(var1, var12, bG[var8 > 0 ? var8 - 1 : bH - 1]);
         }

         if (var7 > 0) {
            ((o)null).a(var1, var12[0], var12[1], var12[2] * var7 / var13, var12[3], bG[var8]);
         } else if (super.j.W[5] > 0) {
            ((o)null).a(var1, var12, bG[var8]);
         }

         if (var16 > 1) {
            if (bI == null) {
               bI = ((o)null).a("num2");
            }

            if (bJ == null) {
               bJ = ((o)null).a("num1");
            }

            Image var9 = var3 ? bJ : bI;
            short[] var10 = ((k)null).a((short)2, (short)(var3 ? 6 : 17));
            ((o)null).a(var1, var9, "x" + var16, var10[0] + var10[2], var10[1] + var10[3], 40, 1, 0, 11);
         }
      }
   }

   private final boolean aH() {
      if (aK && (super.V[3] == 0 || super.V[3] == 3 || super.V[3] == 10)) {
         if (((a)null).d(1)) {
            this.a((byte)2, (short)2);
         } else if (((a)null).d(2)) {
            this.a((byte)2, (short)3);
         } else if (((a)null).d(4)) {
            this.a((byte)2, (short)1);
         } else if (((a)null).d(8)) {
            this.a((byte)2, (short)0);
         } else if (((a)null).d(5)) {
            this.a((byte)2, (short)5);
         } else if (((a)null).d(6)) {
            this.a((byte)2, (short)7);
         } else if (((a)null).d(9)) {
            this.a((byte)2, (short)4);
         } else if (((a)null).d(10)) {
            this.a((byte)2, (short)6);
         }

         if (this.bw == 2) {
            this.aJ();
            this.al();
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public final void ar() {
      if (aJ > 0) {
         if (((d)null).k || !((a)null).c()) {
            return;
         }

         if (!((a)null).e(aJ)) {
            ((d)null).a("Hãy nhấn " + ((a)null).g(aJ) + "!", "Đồng ý", null, 1);
            return;
         }

         aJ = -999;
      }

      if (((ai)null).e[10] == 1) {
         ((av)null).u();
         ++((ai)null).e[10];
      } else if (((ai)null).e[10] > 1 && ((ai)null).e[10] < 99) {
         ((av)null).v();
      } else {
         if (((ai)null).e[10] == 99) {
            ((d)null).a(17);
            return;
         }

         if (((ai)null).e[10] == 100 && ((av)null).H == 2) {
            ((ai)null).e[10] = 0;
            return;
         }
      }

      if (((a)null).e(1024)) {
         ((w)null).i(0);
      } else if (((a)null).e(2048)) {
         ((w)null).i(1);
      } else {
         if (super.V[3] == 11 && ((a)null).e(16384)) {
            this.a((short)18);
         }

         if (!this.aH() && super.V[3] != 11 && super.V[3] != 15 && super.V[3] != 10 && super.V[3] != 16 && super.V[3] != 17) {
            int var1;
            if ((var1 = this.au()) < 0) {
               this.al();
               if (((a)null).e(256)) {
                  if (super.W[75] >= 20) {
                     this.z(-20);
                     this.c((byte)12);
                     bC = 0;
                  } else {
                     this.a(-1, "Không đủ nộ khí");
                  }
               }

               switch(super.V[3]) {
                  case 0:
                     if (((a)null).e(16384)) {
                        this.aI();
                     } else {
                        this.aK();
                     }
                  case 1:
                  case 2:
                  case 4:
                  case 7:
                  case 8:
                  case 9:
                  case 10:
                  case 12:
                  case 13:
                  case 14:
                  case 15:
                  case 16:
                  case 17:
                  default:
                     break;
                  case 3:
                     if (super.j == null || !this.b(super.j.ae()) || !((a)null).b(((z)null).a(this.b(super.j, 2)))) {
                        if (((a)null).e(16384)) {
                           this.aI();
                        } else {
                           this.aK();
                        }
                     }
                     break;
                  case 5:
                     this.a((byte)3, super.V[15]);
                     if (((a)null).e(16384) || ((a)null).b(16384)) {
                        bi = true;
                        this.d((byte)0);
                        this.a((byte)4, super.V[15]);
                     }

                     if (super.V[15] != super.V[15] && super.V[15] != -1) {
                        short var2 = super.al[1];
                        short var3 = super.al[0];
                        this.v(super.V[15]);
                        super.al[1] = var2;
                        super.al[0] = var3;
                     }
                     break;
                  case 6:
                     this.c((byte)9);
                     break;
                  case 11:
                     this.c((byte)2);
                     break;
                  case 18:
                     this.c((byte)11);
                     break;
                  case 19:
                     this.c((byte)12);
                     break;
                  case 20:
                     this.c((byte)13);
               }

               this.aJ();
               if (aJ == -999) {
                  this.bL = super.V[3];
               }
            } else if (((av)null).H != 2 && ((av)null).H != 1) {
               this.F(var1);
            } else {
               this.a((short)1);
            }
         }
      }
   }

   private void aI() {
      if (aK) {
         this.by = -1;
         this.a((byte)3, super.V[15]);
      }
   }

   private void aJ() {
      switch(this.bw) {
         case -1:
         case 0:
            if (this.bx != 1 && this.bx != 2) {
               if (!this.c((short)0)) {
                  this.a((short)0);
               }
            } else if (super.A != null && super.A.W[32] == 2 && (super.V[15] == 1 || super.V[15] == 0)) {
               if (!this.c((short)10)) {
                  this.a((short)10);
               }
            } else if (!this.c((short)0)) {
               this.a((short)0);
            }
            break;
         case 1:
            if (!this.c((short)3)) {
               this.a((short)3);
            }
            break;
         case 2:
            if (!this.c((short)11)) {
               this.a((short)11);
            }
            break;
         case 3:
            if (!this.m(aW) && !this.c((short)5) && !bc) {
               super.f = 0;
               this.a((short)5);
            }
            break;
         case 4:
            if (!this.m(aW) && !this.c((short)5) && !bc) {
               super.f = 1;
               this.a((short)5);
            }
            break;
         case 5:
            if (!this.m(aW) && !bc) {
               super.f = 6;
               this.a((short)5);
            }
            break;
         case 6:
            if (!this.m(aW) && !bc) {
               super.f = 7;
               this.D(3);
               this.a((short)5);
            }
            break;
         case 7:
            if (!this.m(aW) && !bc) {
               super.f = 8;
               this.a((short)5);
            }
            break;
         case 8:
            if (!this.m(aW) && !bc) {
               super.f = 9;
               this.a((short)5);
            }
         case 9:
         case 10:
         default:
            break;
         case 11:
            if (!this.c((short)18)) {
               this.a((short)18);
            }
            break;
         case 12:
            if (!this.c((short)19)) {
               this.a((short)19);
            }
            break;
         case 13:
            if (!this.c((short)20)) {
               this.a((short)20);
            }
            break;
         case 14:
            if (!this.c((short)15)) {
               this.a((short)15);
            }
      }

      if (this.U() != super.U) {
         this.b();
         this.u(this.U());
      }
   }

   private void d(byte var1) {
      switch(var1) {
         case 0:
            if (((a)null).c(4) || ((a)null).c(6) || ((a)null).c(5)) {
               this.u(1);
               return;
            }

            if (((a)null).c(8) || ((a)null).c(10) || ((a)null).c(9)) {
               this.u(0);
               return;
            }
            break;
         case 1:
            if (((a)null).c(1)) {
               this.u(2);
               return;
            }

            if (((a)null).c(2)) {
               this.u(3);
               return;
            }

            if (((a)null).c(4) || ((a)null).c(6) || ((a)null).c(5)) {
               this.u(1);
               return;
            }

            if (((a)null).c(8) || ((a)null).c(10) || ((a)null).c(9)) {
               this.u(0);
               return;
            }
            break;
         case 2:
            if (((a)null).c(1)) {
               this.u(2);
               return;
            }

            if (((a)null).c(2)) {
               this.u(3);
               return;
            }

            if (((a)null).c(4)) {
               this.u(1);
               return;
            }

            if (((a)null).c(8)) {
               this.u(0);
               return;
            }

            if (((a)null).c(32) || ((a)null).c(5)) {
               this.u(5);
               return;
            }

            if (((a)null).c(256) || ((a)null).c(6)) {
               this.u(7);
               return;
            }

            if (((a)null).c(64) || ((a)null).c(9)) {
               this.u(4);
               return;
            }

            if (((a)null).c(512) || ((a)null).c(10)) {
               this.u(6);
            }
      }
   }

   private void aK() {
      if (this.bw != 2 && aL) {
         if (((a)null).c(5)) {
            this.a((byte)1, (short)5);
         } else if (((a)null).c(9)) {
            this.a((byte)1, (short)4);
         } else if (((a)null).c(6)) {
            this.a((byte)1, (short)7);
         } else if (((a)null).c(10)) {
            this.a((byte)1, (short)6);
         } else if (((a)null).c(1)) {
            this.a((byte)1, (short)2);
         } else if (((a)null).c(2)) {
            this.a((byte)1, (short)3);
         } else if (((a)null).c(4)) {
            this.a((byte)1, (short)1);
         } else {
            if (((a)null).c(8)) {
               this.a((byte)1, (short)0);
            }
         }
      }
   }

   private void F(int var1) {
      if (!this.bj && super.aE == 0) {
         if (!this.a.e(var1)) {
            this.c((byte)0);
         } else if (this.m(aW)) {
            this.a(-1, "Bản đồ này không thể tấn công");
         } else {
            if (this.G(var1)) {
               this.by = var1;
               super.e = (short)(this.a.a((byte)var1, 13) * ((ae)null).b);
               switch(var1) {
                  case 0:
                     this.bw = 5;
                     this.z(-this.a.a(var1, 16));
                     break;
                  case 1:
                     this.bw = 6;
                     super.W[7] -= this.a.f((byte)var1);
                     break;
                  case 2:
                     this.bw = 7;
                     super.W[7] -= this.a.f((byte)var1);
                     break;
                  case 3:
                     this.bw = 14;
               }

               this.bP[var1] = super.e;
               ((av)null).c(1, 6);
            }

            this.aJ();
         }
      }
   }

   private final boolean G(int var1) {
      if (this.bP[var1] > 0) {
         this.a(-1, "Kỹ năng chưa sẵn sàng");
         return false;
      } else {
         switch(var1) {
            case 0:
               if (super.W[75] < this.a.a(var1, 16)) {
                  this.a(0, "Không đủ nộ khí");
                  return false;
               }
            case 1:
            case 2:
            case 3:
               if (super.W[7] < this.a.f((byte)var1)) {
                  this.a(0, "Không đủ ma lực (MP)");
                  return false;
               }
            default:
               return true;
         }
      }
   }

   public final void d(x var1) {
      int var2 = super.W[9] - var1.W[9];
      int var3 = var1.W[10];
      if (var2 > 0) {
         var3 = (var3 / (var2 + 1) * 3 >> 1) + 1;
      }

      var3 = (((ai)null).e[72] + 2) * (var3 >> 1);
      if (bd) {
         var3 <<= 1;
      }

      super.W[10] += var3 * 4 / 5;
      this.ap();
   }

   public final void a(DataOutputStream var1) throws Exception {
      ((o)null).a(super.V, var1);
      ((o)null).a(super.W, var1);
      var1.writeInt(this.aZ);
      ((o)null).a(((d)null).i, var1);
      ((o)null).a(((t)null).h, var1);
      ((o)null).a(((t)null).f, var1);
      this.b.a(var1);
      ((w)null).b(var1);
      this.a(this.bf, var1);
      ((o)null).a(this.a.f, var1);
      this.b(var1);
      ((o)null).a(this.bo, var1);
      ((o)null).a(this.bp, var1);
      ((o)null).a(this.bq, var1);
      ((o)null).a(this.br, var1);
      ((o)null).a(this.bP, var1);
      ((o)null).a(this.bQ, var1);
      var1.writeBoolean(bc);
   }

   public final void a(DataInputStream var1) throws Exception {
      super.t = 0;
      aJ = -1;
      super.V = ((o)null).b(var1);
      super.W = ((o)null).c(var1);
      this.aZ = var1.readInt();
      ((d)null).i = ((o)null).c(var1);
      ((t)null).h = ((o)null).b(var1);
      ((t)null).f = ((o)null).b(var1);
      this.b.a(var1);
      ((w)null).b(var1);
      this.a(this.bf, var1);
      this.a.f = ((o)null).e(var1);
      this.b(var1);
      this.bo = ((o)null).e(var1);
      this.bp = ((o)null).b(var1);
      this.bq = ((o)null).b(var1);
      this.br = ((o)null).e(var1);
      this.bP = ((o)null).c(var1);
      this.bQ = ((o)null).c(var1);
      bc = var1.readBoolean();
      if (super.W[5] <= 0) {
         this.d(100);
      }

      this.a((short)0);
      this.k(((x)null).H);
      this.k(((x)null).I);
   }

   public final void a(Object[] var1, DataOutputStream var2) throws Exception {
      for(int var4 = 0; var4 < var1.length; ++var4) {
         Object var3;
         if ((var3 = var1[var4]) != null) {
            if (var3 instanceof m) {
               var2.writeByte(1);
               var2.writeShort(((m)var3).g);
               ((m)var3).a(var2);
            } else if (var3 instanceof t) {
               var2.writeByte(2);
               var2.writeShort(((t)var3).j);
               ((t)var3).a(var2);
            }
         } else {
            var2.writeByte(0);
         }
      }
   }

   public final void a(Object[] var1, DataInputStream var2) throws Exception {
      for(int var5 = 0; var5 < var1.length; ++var5) {
         switch(var2.readByte()) {
            case 0:
               var1[var5] = null;
               break;
            case 1:
               m var3;
               (var3 = ((m)null).a(var2.readShort())).a(var2);
               var1[var5] = var3;
               break;
            case 2:
               t var4;
               (var4 = ((t)null).a(this.be, var2.readShort())).a(var2);
               var1[var5] = var4;
         }

         if (var1[var5] != null) {
            this.a((t)var1[var5]);
         }
      }
   }

   private void aL() {
      for(int var1 = 0; var1 < this.bM.length; ++var1) {
         this.bM[var1] = -1;
      }
   }

   public final boolean as() {
      switch(super.V[3]) {
         case 0:
         case 2:
         case 3:
         case 4:
         case 11:
            return true;
         case 1:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         default:
            return false;
      }
   }

   public final int r() {
      return super.r() + (this.by >= 0 ? this.a.a(this.by, 12) : 0);
   }

   public final void at() {
      for(int var1 = 0; var1 < bm.length; ++var1) {
         bm[var1] = -1;
      }
   }

   private void b(DataOutputStream var1) throws Exception {
      ((o)null).a(bm, var1);
      ((o)null).a(bl, var1);
   }

   private void b(DataInputStream var1) throws Exception {
      this.at();
      bm = ((o)null).c(var1);
      bl = ((o)null).d(var1);
   }

   public final int au() {
      if (this.bj) {
         return -1;
      } else {
         boolean var1 = false;

         for(int var2 = 0; var2 < bk.length; ++var2) {
            if (bl[var2] && ((a)null).e(bk[var2]) && bm[var2] >= 0) {
               return bm[var2];
            }
         }

         return -1;
      }
   }

   public final void a(Graphics var1, int var2, short[] var3) {
      if (this.bP[var2] > 0) {
         int var4;
         if ((var4 = this.a.a(var2, 13) * ((ae)null).b) <= 0) {
            return;
         }

         int var5 = this.bP[var2];
         var3[3] = (short)(var3[3] + 4);
         var3[1] = (short)(var3[1] + (var3[3] - 4 - (var3[3] - 4) * var5 / var4));
         var3[3] = (short)((var3[3] - 4) * var5 / var4);
         ((o)null).b(var1, var3, -1879048192);
      }
   }

   public final void b(Graphics var1, int var2, short[] var3) {
      if (var2 < this.bQ.length) {
         if (this.bQ[var2] > 0) {
            int var4;
            if ((var4 = ((m)null).b(var2)) <= 0) {
               return;
            }

            int var5 = this.bQ[var2];
            var3[3] = (short)(var3[3] + 2);
            var3[0] = (short)(var3[0] + 2);
            var3[1] = (short)(var3[1] + (2 + (var3[3] - 4) - (var3[3] - 4) * var5 / var4));
            var3[2] = (short)(var3[2] - 4);
            var3[3] = (short)((var3[3] - 4) * var5 / var4);
            ((o)null).b(var1, var3, -1879048192);
         }
      }
   }

   public final void e(int var1, int var2) {
      if (var1 < this.bQ.length) {
         this.bQ[var1] = var2;
      }
   }

   public final int C(int var1) {
      return var1 >= this.bQ.length ? -1 : this.bQ[var1];
   }

   public final void D(int var1) {
      if (var1 >= 0) {
         this.bn = true;
         if (this.bR == null) {
            this.bR = new n();
         }

         this.bR.c = 61;
         this.bR.d = var1;
      }
   }

   public final void av() {
      if (this.bn && this.bR != null) {
         this.bR.b(120, 160);
         this.bn = !this.bR.b();
      }
   }

   public final void e(Graphics var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.bp.length; ++var4) {
         if (this.bp[var4] > 0) {
            if (bs[var4] != -1) {
               i var5;
               (var5 = ((l)null).e[4]).a(bs[var4], this.bo[var4]);
               var5.a(var1, bs[var4], this.bo[var4][0], var2, var3, false);
            }

            --this.bp[var4];
            if (this.bp[var4] == 0) {
               this.aL();
               this.E(var4);
            }
         }
      }

      for(int var6 = 0; var6 < this.bq.length; ++var6) {
         if (this.bq[var6] > 0) {
            --this.bq[var6];
         }
      }
   }

   public final void E(int var1) {
      if (var1 == 3 && this.m(aM)) {
         this.l(aM);
         this.a(0, "Hết hiệu ứng vô địch");
      }

      if (this.bp[var1] >= 0) {
         this.bp[var1] = 0;
         super.W[32] -= this.br[var1][4];
         super.W[68] -= this.br[var1][3];
         super.W[16] -= this.br[var1][2];
         super.W[22] -= this.br[var1][0];
         super.W[23] -= this.br[var1][1];
         super.W[70] = 0;
      }
   }

   public final void aw() {
      if (bu) {
         bT = true;
      }

      if (bT) {
         if (bu) {
            bu = false;
         }

         if (((x)null).C == null) {
            ((x)null).C = new n();
         }

         if (this.bS == null) {
            this.bS = new n();
         }

         ((x)null).C.c = 61;
         ((x)null).C.d = 5;
         this.bS.c = 61;
         this.bS.d = 0;
         ((x)null).C.b(120, 160);
         if (!this.bS.b()) {
            this.bS.b(120, 160);
         }

         if (((x)null).C.b()) {
            bT = false;
            ((x)null).C.d();
            this.bS.d();
         }
      }
   }

   public final void i() {
      super.i();
      this.aw();
      this.av();
   }

   static {
      short[] var10000 = new short[]{4, 5};
      new Vector();
      int[][] var0 = new int[][]{{5, 1, 4, 0}, {1, 2, 3, 3}};
      short[][] var1 = new short[][]{{0, 4, 2, 1, 3}, {4}, {2}, {3}};
   }
}
