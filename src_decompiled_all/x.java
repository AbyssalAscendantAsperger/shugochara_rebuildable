import java.io.DataOutputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public abstract class x {
   public static n C = null;
   public static byte D = 0;
   public static final int E = 1 << D++;
   public static final int F = 1 << D++;
   public static final int G = 1 << D++;
   public static final int H = 1 << D++;
   public static final int I = 1 << D++;
   public static final int J = 1 << D++;
   public static final int K = 1 << D++;
   public static final int L = 1 << D++;
   public static final int M = 1 << D++;
   public static final int N = 1 << D++;
   public static final int O = 1 << D++;
   public static final int P = 1 << D++;
   public static final int Q = 1 << D++;
   public short[][] R = (short[][])null;
   public int S;
   public int T;
   public short U;
   public short[] V;
   public int[] W;
   public short[] X;
   public int Y = 0;
   public boolean Z = false;
   public short aa;
   public short ab;
   public short ac = 0;
   public short ad = 0;
   public short ae = 0;
   public short af = 0;
   public short ag = 0;
   public short ah = 0;
   public short ai;
   public short aj = 0;
   public short ak = 0;
   public short[] al = new short[2];
   public short[] am = new short[2];
   public short[] an = new short[4];
   public int ao = -1;
   public int ap = 0;
   public byte[][] aq;
   public byte[][] ar;
   public short as;
   public short at = 0;
   public byte[] au;
   public boolean av;
   public Vector aw = new Vector();
   public i ax = null;
   public int ay;
   public int az = 0;
   private n d_ = null;
   private int e_ = 0;
   private int f_ = 0;
   private boolean g_;
   private short h_;
   private short[] i_ = new short[2];
   public int aA;
   public int aB;
   public int aC;
   public int aD;
   public short aE;
   public boolean aF;
   public short[] aG;
   public boolean aH = true;
   public static short[] aI = new short[4];

   public void i() {
      if (this.W != null && this.W[13] >= 0 && this.m(I)) {
         this.r(this.W[13]);
      }
   }

   public final void a(short[] var1) {
      this.V = var1;
      this.V[3] = 0;
      ai.a(this);
      this.a();
      this.ac = this.V[8];
      this.ad = this.V[9];
      this.ae = this.V[10];
      this.af = this.V[11];
      this.ag = this.V[12];
      this.ah = this.V[13];
   }

   public final void L() {
      this.aw.removeAllElements();
   }

   public void a(DataOutputStream var1) throws Exception {
      o.a(this.V, var1);
      o.a(this.W, var1);
   }

   public final void k(int var1) {
      this.V[2] = (short)(this.V[2] | var1);
   }

   public final void l(int var1) {
      this.V[2] = (short)(this.V[2] & ~var1);
   }

   public final boolean m(int var1) {
      return (this.V[2] & var1) != 0;
   }

   public final boolean n(int var1) {
      return (this.V[2] & var1) == var1;
   }

   public final boolean o(int var1) {
      return (av.h[this.V[0]] & var1) != 0;
   }

   public final boolean p(int var1) {
      return (av.h[this.V[0]] & var1) == var1;
   }

   public final short[] M() {
      this.an[0] = this.V[10];
      this.an[1] = this.V[11];
      this.an[2] = this.V[12];
      this.an[3] = this.V[13];
      return this.an;
   }

   public final boolean N() {
      if (this.V[5] > -1 && !this.av) {
         ai.c(this);
         this.O();
         if (this.av) {
            return true;
         }
      }

      return false;
   }

   public final void O() {
      this.S = -1;
      this.T = -1;
   }

   public final void b(short var1) {
      this.V[4] = var1;
   }

   public final void P() {
      if (this.ag()) {
         n.d(1, 300);
      }

      if (this.ah() && !n.a(24)) {
         n.k();
         n.a(8, 0, 1);
      }

      av.ac = this.ai();
   }

   public boolean d() {
      this.P();
      if (this.ap-- <= 0 && !this.N()) {
         this.ap = 0;
         ++this.aj;
         this.aj();
         switch(this.V[3]) {
            case 0:
               this.e();
               return true;
            case 1:
               this.Q();
               return true;
            case 2:
               return true;
            default:
               return false;
         }
      } else {
         return true;
      }
   }

   public void c() {
      if (this.m(H) || !this.ak() || !this.N()) {
         ;
      }
   }

   public void e() {
   }

   public void Q() {
   }

   public final void R() {
      byte[] var3;
      int var4 = (var3 = av.ap[av.ai][this.ay]).length / 9;

      int var1;
      while(true) {
         var1 = this.az * 9;
         byte var2 = var3[var1 + 8];
         if (av.aj == av.a(var3[var1 + 0], var3[var1 + 0 + 1])) {
            if (av.ak % 3 == 0) {
               if ((var2 & 2) != 2 && (var2 & 4) != 4) {
                  this.k(I);
               } else {
                  this.l(I);
                  this.l(H);
               }

               if ((var2 & 1) == 1) {
                  this.v(0);
               } else {
                  this.v(3);
               }

               if ((var2 & 8) == 8) {
                  this.ay = -1;
                  return;
               }

               int var5 = var3[var1 + 2] & 255;
               this.V[8] = av.a(var3[var1 + 4], var3[var1 + 4 + 1]);
               this.V[9] = av.a(var3[var1 + 6], var3[var1 + 6 + 1]);
               boolean var6 = false;
               boolean var7 = false;
               this.d((short)var5);
            }
            break;
         }

         if (av.aj > av.a(var3[var3.length - 9 + 0], var3[var3.length - 9 + 0 + 1])
            || av.aj > av.a(var3[var1 + 0], var3[var1 + 0 + 1]) && av.aj < av.a(var3[var1 + 9 + 0], var3[var1 + 9 + 0 + 1])) {
            break;
         }

         if (av.aj < av.a(var3[var1 + 0], var3[var1 + 0 + 1])) {
            --this.az;
            if (this.az < 0) {
               this.l(I);
               this.az = 0;
               return;
            }
         } else if (av.aj >= av.a(var3[var1 + 9 + 0], var3[var1 + 9 + 0 + 1])) {
            ++this.az;
         }
      }

      if (this.az < var4 - 1) {
         short var11 = av.a(var3[var1 + 4], var3[var1 + 4 + 1]);
         short var12 = av.a(var3[var1 + 6], var3[var1 + 6 + 1]);
         short var13 = av.a(var3[var1 + 4 + 9], var3[var1 + 4 + 9 + 1]);
         short var8 = av.a(var3[var1 + 6 + 9], var3[var1 + 6 + 9 + 1]);
         int var9 = (av.a(var3[var1 + 9 + 0], var3[var1 + 9 + 0 + 1]) - av.a(var3[var1 + 0], var3[var1 + 0 + 1])) * 3;
         int var10 = av.ak - av.a(var3[var1 + 0], var3[var1 + 0 + 1]) * 3;
         this.V[8] = (short)(var11 + (var13 - var11) * var10 / var9);
         this.V[9] = (short)(var12 + (var8 - var12) * var10 / var9);
      }
   }

   public final void a(n var1, int var2, int var3) {
      if (var1 == null && this.d_ != null) {
         this.d_.h();
         this.d_ = null;
      } else {
         this.d_ = var1;
      }

      this.e_ = var2;
      this.f_ = var3;
   }

   private void a(Graphics var1) {
      if (this.d_ != null) {
         n.a(var1);
         this.d_.c(this.e_, this.f_);
      }
   }

   public final i a(Graphics var1, int var2, int var3, int var4) {
      i var5 = null;

      try {
         if (var2 < 0) {
            return null;
         }

         if ((var5 = l.e[var2]) == null) {
            var5 = l.a("amn.bin", new int[]{var2}, l.e, l.f)[var2];
         }

         if (this.W != null) {
            if (!this.o(32)) {
               var5.a(var1, this.V[7], this.al[0], var3, var4, this.W[4] == 1);
            } else if (av.H != 1) {
               var5.a(var1, this.V[7], this.al[0], var3, var4, this.W[4] == 1, this.X);
            } else {
               var5.a(var1, this.V[7], this.al[0], var3, var4, this.W[4] == 1, null);
            }
         } else {
            System.out.println("[Error]:: ActorID = " + this.Y + "'s property is null!!!");
         }

         this.a(var1);
      } catch (Exception var7) {
         var7.printStackTrace();
      }

      return var5;
   }

   public i a(Graphics var1, int var2, int var3) {
      n.a(var1);
      return this.a(var1, this.V[6], var2, var3);
   }

   public void k() {
      this.W[13] = -1;
   }

   public final void q(int var1) {
      if (this.ao != var1) {
         this.ao = var1;
      }
   }

   public final void c(Graphics var1, int var2, int var3) {
      if (this.ao != -1) {
         av.a(var1, this.ao, var2, var3);
      }
   }

   public final void r(int var1) {
      if (C == null) {
         C = new n();
      }

      C.c = 62;
      C.d = var1;
      short[] var2;
      if ((var2 = this.ae()) != null) {
         C.b(var2[0] - ac.h() + (var2[2] - var2[0] >> 1), var2[1] - ac.j() - 10 - 27);
      }
   }

   public final void s(int var1) {
      this.W[13] = var1;
   }

   public final int S() {
      return this.W[6] + this.W[14];
   }

   public final int T() {
      return this.W[8] + this.W[15];
   }

   public final void t(int var1) {
      this.g_ = true;
      this.i_[0] = 0;
      this.i_[1] = 0;
   }

   public final void d(Graphics var1, int var2, int var3) {
      if (this.g_) {
         boolean var4 = false;
         i var5;
         (var5 = l.e[2]).a(this.h_, this.i_);
         var5.a(var1, this.h_, this.i_[0], var2, var3, false);
         if (this.i_[0] == 0 && this.i_[1] == 0) {
            this.g_ = false;
         }
      }
   }

   public void a() {
      this.V[3] = this.w(this.V[7]);
      this.v(this.x(this.V[7]));
      this.Z = this.o(64);
      if (this.W != null) {
         this.W[13] = -1;
      }

      this.aE = 0;
      this.aF = false;
   }

   public final void c(int var1, int var2) {
      byte[] var3 = l.e[var1].a(var2);
      this.aA = var3[0];
      this.aB = var3[1];
      this.aC = var3[2];
      this.aD = var3[3];
      if (this.W[4] == 1) {
         this.aA = -this.aA;
         this.aC = -this.aC;
      }
   }

   public final boolean b(short[] var1) {
      o.a(this.aG, aI, this.V[8], this.V[9]);
      return o.a(var1, aI);
   }

   public final boolean c(short var1) {
      return this.V[3] == var1;
   }

   public void a(short var1) {
      if (this.ai != this.V[3]) {
         this.ai = this.V[3];
      }

      this.V[3] = var1;
      this.b();
      this.S = var1;
      this.T = this.ai;
      this.aj = 0;
   }

   public final void u(int var1) {
      this.U = this.V[15];
      this.V[15] = (short)var1;
   }

   public final void v(int var1) {
      this.u(var1);
      this.b();
   }

   public final void a(x var1) {
      this.v(this.b(var1, 0));
   }

   public final int U() {
      return this.V[15];
   }

   public final int V() {
      switch(this.V[15]) {
         case 0:
         case 4:
         case 6:
         case 8:
         case 10:
         case 12:
         case 14:
            this.W[4] = 0;
            break;
         case 1:
         case 5:
         case 7:
         case 9:
         case 11:
         case 13:
         case 15:
            this.W[4] = 1;
         case 2:
         case 3:
      }

      return this.W[4];
   }

   public void b() {
      if (this.R != null) {
         if (this.V[3] < 0) {
            this.d(this.V[7]);
         } else {
            this.d(this.R[this.V[3]][this.V()]);
         }

         this.W().b();
      }
   }

   public final void d(short var1) {
      if (this.m(O)) {
         this.l(O);
      }

      this.V[7] = var1;
      this.al[1] = 0;
      this.al[0] = 0;
      this.am[0] = -1;
      this.am[1] = -1;
   }

   public final void a(boolean var1) {
      i var2;
      int var3 = (var2 = this.W()).b(this.V[7]);
      this.a((short)(var3 - 1), (short)(var2.f(this.V[7], var3 - 1) - 1));
      if (var1) {
         this.k(O);
      }
   }

   public final void a(short var1, short var2) {
      this.al[0] = var1;
      this.al[1] = var2;
   }

   public final i W() {
      i var1 = null;

      try {
         short var2;
         if ((var2 = this.V[6]) < 0) {
            return null;
         }

         if ((var1 = l.e[var2]) == null) {
            System.out
               .println(
                  ">>getAnimation(): Cant paint! maybe you don't set \"Pack Anim?\" to \"No\"!! Or you dont select this animation into this scene! Or has error in load animation\n\tactorID="
                     + this.V[1]
                     + "\n\tclassIdx="
                     + this.V[0]
               );
            return null;
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      return var1;
   }

   public final boolean X() {
      return this.al[0] == 0 && this.al[1] == 0;
   }

   public final boolean Y() {
      return l.e[this.V[6]].a(this.V[7], this.al);
   }

   public final void d(int var1, int var2) {
      this.V[8] = (short)var1;
      this.V[9] = (short)var2;
   }

   public final int Z() {
      return this.V[8] - ac.h();
   }

   public final int aa() {
      return this.V[9] - ac.j();
   }

   public final short ab() {
      return this.V[8];
   }

   public final short ac() {
      return this.V[9];
   }

   public void D() {
      if (this.ap <= 0 && !this.m(O)) {
         short var1 = this.V[6];
         short var2 = this.V[7];
         if (var1 >= 0 && var2 >= 0) {
            this.ax = l.e[var1];
            if (this.ax != null) {
               this.ax.a(var2, this.al);
               this.am[0] = this.al[0];
               this.am[1] = this.al[1];
            }
         }
      }
   }

   public final byte a(int var1, int var2, int var3) {
      int var4 = var1 - this.V[8];
      int var5 = var2 - this.V[9];
      return z.a(var4, var5, var3);
   }

   public final byte b(x var1, int var2) {
      return var1 == null ? z.b(var2) : this.a(var1.V[8], var1.V[9], var2);
   }

   public final byte ad() {
      return z.a(this.V[15]);
   }

   public final short[] ae() {
      i var1;
      if ((var1 = l.e[this.V[6]]) == null) {
         return null;
      } else {
         short[] var2;
         if ((var2 = var1.a((byte)1, this.V[7], this.al[0])) == null) {
            return null;
         } else {
            if ((var2[0] != 0 || var2[0] != var2[2]) && this.W != null && this.W[4] == 1) {
               short var3 = (short)(-var2[0]);
               var2[0] = (short)(-var2[2]);
               var2[2] = var3;
            }

            o.a(var2, this.V[8], this.V[9]);
            return var2;
         }
      }
   }

   public final boolean af() {
      boolean var1 = l.e[this.V[6]].a(this.V[7], this.al[0]);
      return this.al[1] == 0 && var1;
   }

   public final boolean ag() {
      if (this.V[6] >= 0 && l.e[this.V[6]] != null) {
         return (l.e[this.V[6]].e(this.V[7], this.al[0]) & 2) != 0;
      } else {
         return false;
      }
   }

   public final boolean ah() {
      if (this.V[6] >= 0 && l.e[this.V[6]] != null) {
         return (l.e[this.V[6]].e(this.V[7], this.al[0]) & 4) != 0;
      } else {
         return false;
      }
   }

   public final boolean ai() {
      if (this.V[6] >= 0 && l.e[this.V[6]] != null) {
         return (l.e[this.V[6]].e(this.V[7], this.al[0]) & 8) != 0;
      } else {
         return false;
      }
   }

   public final void aj() {
      int var1 = this.V[8] - this.ac;
      int var2 = this.V[9] - this.ad;
      this.V[10] = (short)(this.ae + var1);
      this.V[12] = (short)(this.ag + var1);
      this.V[11] = (short)(this.af + var2);
      this.V[13] = (short)(this.ah + var2);
   }

   public final boolean b(x var1) {
      short[] var2 = this.M();
      return o.a(var1.V[8], var1.V[9], var2[0], var2[1], var2[2], var2[3]);
   }

   public final boolean ak() {
      return o.a(ac.l(), this.M());
   }

   public final short w(int var1) {
      if (this.R != null) {
         for(int var2 = 0; var2 < this.R.length; ++var2) {
            for(int var3 = 0; var3 < this.R[var2].length; ++var3) {
               if (this.R[var2][var3] == var1) {
                  return (short)var2;
               }
            }
         }
      }

      return -1;
   }

   public final short x(int var1) {
      if (this.R != null) {
         for(int var2 = 0; var2 < this.R.length; ++var2) {
            for(int var3 = 0; var3 < this.R[var2].length; ++var3) {
               if (this.R[var2][var3] == var1) {
                  if (this.m(E)) {
                     return (short)(var3 + 1);
                  }

                  return (short)var3;
               }
            }
         }
      }

      return 0;
   }

   static {
      ++D;
      byte[] var10000 = new byte[]{2, 3, 4, 7, 8, 9, 15};
   }
}
