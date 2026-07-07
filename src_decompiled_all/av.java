import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreFullException;
import javax.microedition.rms.RecordStoreNotFoundException;

public final class av extends Canvas implements Runnable {
   public static int a = ae.a;
   public static byte b;
   public static int[] c;
   public static short d;
   public static short[] e;
   public static short[] f;
   public static byte[] g;
   public static byte[] h;
   public static byte[] i;
   public static String[] j;
   public static short k;
   private static short aw;
   public static short[][] l;
   public static int m = 0;
   public static int n = 0;
   public static int o = 0;
   public static int p;
   public static long[] q;
   public static aa[] r = new aa[1];
   public static short[][] s = new short[1][];
   public static aa t;
   public static short u = 2;
   public static short v;
   public static x[] w;
   public static short x;
   public static short[] y = new short[80];
   public static short z;
   public static short[] A = new short[80];
   private static int ax;
   private static short[] ay = new short[80];
   private static av az = null;
   public static boolean B;
   private static boolean aA = false;
   public static byte C;
   public static byte D;
   public static byte E;
   public static int F;
   public static int G;
   public static int H;
   public static Image I;
   public static short J;
   public static boolean K;
   public static boolean L;
   public static int M;
   public static int N;
   public static int O;
   public static final String[] P = new String[]{
      "/bin/0.mid", "/bin/0.mid", "/bin/2.mid", "/bin/2.mid", "/bin/3.mid", "/bin/3.mid", "/bin/3.mid", "/bin/3.mid", "/bin/2.mid", "/bin/tiger.mid"
   };
   private static int aB;
   private static int[] aC;
   public static boolean Q;
   public static String[] R;
   public static String S = "/bin/80.bin";
   public static Graphics T;
   public static int U = -1;
   private static int aD;
   private static int aE;
   private static int aF;
   private static int aG;
   private static x aH = null;
   private static boolean aI = false;
   private static Image aJ;
   private static Image aK;
   private static Image aL;
   public static final String[] V = new String[]{"新游戏", "继续游戏", "更多游戏", "音乐", "帮助", "关于", "退出"};
   public static boolean W = true;
   public static int X = 0;
   public static boolean Y = false;
   public static boolean Z = false;
   private static boolean aM = false;
   private static n aN;
   private static n aO;
   private static n aP;
   private static Image aQ;
   private static boolean aR;
   private static int aS = 0;
   private static int aT = 0;
   private static boolean aU = false;
   private static al[] aV = null;
   private static al[] aW = null;
   private static al[] aX = null;
   private static String aY = null;
   public static byte aa;
   private static final String[] aZ = new String[]{"", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
   public static final byte[][] ab = new byte[][]{
      {0},
      {1},
      {2},
      {3},
      {4},
      {5},
      {6},
      {7},
      {8},
      {9},
      {10},
      {11},
      {12},
      {13},
      {14},
      {15},
      {16},
      {17},
      {18},
      {19},
      {20},
      {21},
      {22},
      {23},
      {24},
      {25},
      {26},
      {27},
      {28},
      {29},
      {30},
      {31},
      {32},
      {33},
      {34},
      {35},
      {36},
      {37},
      {38},
      {39},
      {40},
      {41},
      {42},
      {43},
      {44},
      {45},
      {46},
      {47},
      {48},
      {49},
      {50},
      {51},
      {52},
      {53},
      {54},
      {55},
      {56},
      {57},
      {58},
      {59},
      {60}
   };
   private static byte ba;
   private static short[] bb = null;
   private static n bc = null;
   private static n bd = null;
   private static n be = null;
   private static Thread bf = null;
   private static final String[] bg = new String[]{
      "支线任务是重要的金钱来源", "铁匠铺可以升级装备，打造任务物品", "生命之水可以让你重生。", "关卡有难度选择，难度越高收益越多", "关掉音乐可以更加流畅", "技能可在技能栏里升级。", "升级获得技能点，用来升级技能可以大幅增加战斗力"
   };
   private static int bh = 0;
   private static short[] bi = new short[]{60, 125, 120, 160};
   private static int bj;
   private static Image bk = null;
   private static Image bl = null;
   private static boolean bm = false;
   private static m bn = null;
   private static int bo = 0;
   private static int bp = 0;
   private static long bq = 0L;
   private static short[][] br;
   public static boolean ac;
   public static int ad;
   private static int bs;
   public static byte[][] ae;
   public static byte[][] af;
   public static int ag;
   public static int ah;
   public static int ai;
   public static int aj;
   public static int ak;
   public static int al;
   public static short[] am;
   public static byte[] an;
   public static short[][] ao;
   public static byte[][][] ap;
   public static x aq;
   private static boolean bt = false;
   private static int bu = -1;
   private static Hashtable bv = new Hashtable();
   public static byte[][] ar = new byte[2][12];
   public static boolean[] as = new boolean[2];
   public static final byte[][] at = new byte[][]{
      {52, 52, 54, 54, 50, 50, 56, 56, 52, 52, 54, 54, 50, 50, 56, 56},
      {52, 52, 52, 52, 54, 54, 54, 54, 52, 52, 52, 52, 54, 54, 54, 54},
      {50, 56, 52, 54, 50, 56, 52, 54, 50, 56, 52, 54, 50, 56, 52, 54},
      {50, 56, 52, 54, 52, 54, 50, 56, 50, 56, 52, 54, 52, 54, 50, 56}
   };
   public static short[][] au = new short[6][5];
   public static int av;
   private static int[] bw;

   private av() {
      B = true;
      E = -1;
      D = -1;
      C = -1;
      ai.e();
      ad();
      ai.i();
      ai.j();
      new k();
      this.a();
      ad.a(
         "<游戏简介>&二十四年前，我促成了科勒斯和她的神话，而我到底是谁，前世今身，奈何桥下，二十四年后的我用我的故事讲述了另一个我记忆中的科勒斯和爱伦的故事。而我，依然是那个剑士。&&<主菜单操作>&方向键左/数字键4:&向左移动；&方向键右/数字键6:&向右移动；&方向键上/数字键2:&向上移动；&方向键下/数字键8:&向下移动；&双击方向键左/数字键4:&向左冲刺；&双击方向键右/数字键6:&向右冲刺；&双击方向键上/数字键2:&向上冲刺；&双击方向键下/数字键8:&向下冲刺；&数字键1:技能1；&数字键3:技能2；&数字键5:攻击/对话；&数字键7:技能3；&数字键9：技能4（需用技能点升级后才能使用）；提示：0键格挡成功后，按5键可以发动一闪，使用得当，可以无伤通关&*键：血药；&#键：蓝药；&左软键:确定/游戏菜单；&右软键:取消/返回/任务菜单；&",
         ae.i
      );
      n.g();
      am.a(P);
      if (Q) {
         ad.a((short)3);
         a((byte)2);
      } else {
         a((byte)0);
      }

      this.setFullScreenMode(true);
      new Thread(this).start();
   }

   public final void a() {
      DataInputStream var1 = new DataInputStream(this.getClass().getResourceAsStream(S));

      try {
         aB = var1.readByte();
         aC = new int[aB];

         for(int var2 = 0; var2 < aB; ++var2) {
            aC[var2] = var1.readByte();
         }

         if (aC[2] == 1) {
            Q = true;
         }

         byte var5;
         R = new String[var5 = var1.readByte()];

         for(int var3 = 0; var3 < var5; ++var3) {
            R[var3] = var1.readUTF();
         }

         ae.i = R[0];

         for(int var6 = 1; var6 < R.length; ++var6) {
            ae.i = ae.i + "&" + R[var6];
         }

         var1.close();
      } catch (Exception var4) {
         b();
         System.out.println("非法操作->>" + var4.getMessage());
      }
   }

   public final void run() {
      long var1 = 0L;

      while(B) {
         var1 = System.currentTimeMillis() + (long)ae.a;
         a.b();
         this.repaint();
         this.serviceRepaints();
         if (ad.a()) {
            break;
         }

         while(var1 > System.currentTimeMillis()) {
            Thread.yield();
         }
      }

      CMIDlet.a.notifyDestroyed();
   }

   public final void paint(Graphics var1) {
      try {
         var1.setFont(ae.c);
         T = var1;
         T.setFont(ae.c);
         if (aA) {
            T();
            l(T);
         } else if (ad.b()) {
            ad.a(T);
         } else {
            if (D == 4 || D == 12 || D == 5) {
               ++N;
            }

            ++O;
            if (ai.a) {
               f();
               ai.a(T);
               g.a(T);
            } else if (d.a) {
               d.a();
               d.a(T);
               g.a(T);
            } else {
               switch(D) {
                  case 0:
                     F();
                     if (0 == D) {
                        f(T);
                     }
                     break;
                  case 1:
                     G();
                     if (1 == D) {
                        g(T);
                     }
                     break;
                  case 2:
                     J();
                     if (2 == D) {
                        h(T);
                     }
                     break;
                  case 3:
                     S();
                     if (3 == D) {
                        k(T);
                     }
                     break;
                  case 4:
                     n.a(T);
                     f();
                     W();
                     if (4 == D) {
                        m(T);
                     }
                     break;
                  case 5:
                     ab();
                     if (5 == D) {
                        o(T);
                     }
                     break;
                  case 6:
                     ac();
                     if (6 == D) {
                        p(T);
                     }
                     break;
                  case 10:
                     y();
                     if (10 == D) {
                        e(T);
                     }
                     break;
                  case 12:
                     Z();
                     if (12 == D) {
                        n(T);
                     }
                     break;
                  case 13:
                     i();
                     if (13 == D) {
                        b(T);
                     }
                     break;
                  case 14:
                     P();
                     if (14 == D) {
                        j(T);
                     }
                     break;
                  case 110:
                     p();
                     if (110 == D) {
                        d(T);
                     }
               }
            }

            if (d.k) {
               d.d(T);
            }
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public static final void a(byte var0) {
      ai.a = false;
      O = 0;
      F = 0;
      C = D;
      switch(C) {
         case 0:
            E();
         case 1:
         case 6:
         case 10:
         case 13:
         case 20:
         case 110:
         case 111:
         default:
            break;
         case 2:
            I();
            break;
         case 3:
            R();
            break;
         case 4:
            V();
            break;
         case 5:
            aa();
            break;
         case 12:
            Y();
            break;
         case 14:
            O();
      }

      E = var0;
      switch(E) {
         case 0:
            D();
         case 1:
         case 6:
         case 10:
         case 111:
         default:
            break;
         case 2:
            H();
            break;
         case 3:
            Q();
            break;
         case 4:
            U();
            break;
         case 5:
            j();
            break;
         case 12:
            X();
            break;
         case 13:
            h();
            break;
         case 14:
            N();
            break;
         case 20:
            C();
            break;
         case 110:
            o();
      }

      D = E;
   }

   public final void hideNotify() {
      if (am.b) {
         am.e();
      }

      r();
   }

   public final void showNotify() {
   }

   public static final void b() {
      a("DNFP_RMS_CHARGE", 1);
      a("DNFP_RMS_SUPER_VARIATES", 1);
      a("DNFP_RMS_CONFIG", 1);
      am.e();
      ab.j();
      B = false;
   }

   public static final void c() {
      if (r != null) {
         for(int var0 = 0; var0 < 1; ++var0) {
            r[var0] = null;
         }
      }

      t = null;
      ac.m();
      j.c(-1);
      if (l.e != null) {
         for(int var1 = l.e.length - 1; var1 >= 0; --var1) {
            if (l.e[var1] != null) {
               l.e[var1].d();
               l.e[var1] = null;
            }
         }
      }

      if (w != null) {
         for(int var2 = w.length - 1; var2 >= 0; --var2) {
            w[var2] = null;
         }

         w = null;
      }

      j = null;
      q = null;
      ai.c();
      am = null;
      an = null;
      ao = (short[][])null;
      ap = (byte[][][])null;
      aq = null;
      ab.j();
   }

   public final void keyPressed(int var1) {
      if (ad.b() && !aA) {
         ad.a(var1);
      } else {
         var1 = Math.abs(var1);
         a.a |= a.f(var1);
         if (d.k) {
            a.b();
            d.o();
         }
      }
   }

   public final void keyReleased(int var1) {
      var1 = Math.abs(var1);
      a.a &= ~a.f(var1);
   }

   public final void pointerPressed(int var1, int var2) {
      ag = var1;
      ah = var2;
      U = -1;
   }

   public final void pointerReleased(int var1, int var2) {
      ag = var1;
      ah = var2;
      a.a = 0;
   }

   private static void y() {
      if (!n.s) {
         if (n.t == 1) {
            j(aD);
            return;
         }

         z();
      }
   }

   private static void e(Graphics var0) {
      n.b(var0);
   }

   private static void z() {
      j.e(H);
      d();
   }

   public static final void a(int var0) {
      ai.a();
      w.g.removeAllElements();

      for(int var1 = 0; var1 < 4; ++var1) {
         d.i[var1] = 0;
         d.j = 0;
         t.h[var1] = 0;
      }

      g.a();
      ai.e();
      t.f = t.g;
      if (t.f[19] == 1) {
         t.f[19] = 0;
      }

      aa = 0;
      j(var0);
   }

   public static final void b(int var0) {
      aa = 1;
      a((byte)3);
   }

   public static final void a(int var0, int var1, int var2, int var3, boolean var4) {
      aE = var1;
      aF = var2;
      aG = var3;
      aa = 2;
      aD = var0;
      n.a((byte)1);
      a((byte)10);
      ab.j();
      d.c = true;
   }

   public static final void d() {
      ak.a();
      aj.b();
      n.l();
      switch(aa) {
         case 0:
            t = null;

            for(int var0 = 0; var0 < 1; ++var0) {
               r[var0] = null;
               r[var0] = new aa((byte)var0);
               r[var0].a(s[var0]);
            }

            t = r[0];
            g.a();
            ai.a();
            break;
         case 1:
            t = r[0];
            t.V[6] = s[0][6];
            break;
         case 2:
            t = r[0];
            t.V[6] = s[0][6];
            if (aE < 0 && aF < 0) {
               t.d(s[0][8], s[0][9]);
            } else {
               t.d((short)aE, (short)aF);
            }

            if (aG < 0) {
               t.v(s[0][15]);
            } else {
               t.v((short)aG);
            }

            t.W[69] = M;
      }

      t.al();
      if (H >= 0) {
         t.H();
         t.k(x.H);
         t.k(x.I);
         t.a(null, -1, -1);
      } else {
         t.l(x.H);
         t.l(x.I);
      }

      a((byte)4);
      ac = false;
      if (t != null) {
         t.a(t.V[3]);
         t.o.removeAllElements();
      }

      if (J > 0) {
         t.X = l.e[t.V[6]].c();
         t.a(t.bf[0]);
      }

      if (aa != 1) {
         if (K) {
            t.l(aa.aW);
         } else {
            t.k(aa.aW);
         }

         if (L) {
            t.l(aa.aX);
         } else {
            t.k(aa.aX);
         }
      }

      ai.b();
      n.i();
      j.d = 0;
      a.a();
      ab.a(0, 0, j.a(), j.b());
      ac.a(0, 0, j.a(), j.b());
      ac.a(null, true);
      ac.a(d(ac.k), true);
      k();
      Object var3 = null;
      x var1 = null;

      for(int var2 = 0; var2 < w.length; ++var2) {
         x var4;
         if ((var4 = w[var2]) != null && var4 instanceof ag && var4.V[20] != -1 && (var1 = d(var4.V[20])) != null && var1 instanceof ab) {
            ((ab)var1).c(var4);
         }
      }

      if (am.b) {
         am.b(m);
      }

      e();
      if (H == 2) {
         a("DNFP_RMS_GAME", 1);
      }
   }

   public static final void c(int var0) {
      o = var0;
      switch(o) {
         case 1:
            n.p();
            return;
         case 2:
            n.r();
      }
   }

   public static final void e() {
      switch(n) {
         case 0:
            c(0);
            return;
         case 1:
            c(1);
            return;
         case 2:
            c(2);
            return;
         case 3:
            if (o.a(50)) {
               c(1);
               return;
            }

            c(0);
            return;
         case 4:
            if (o.a(50)) {
               c(2);
               return;
            }

            c(0);
            return;
         case 5:
            c(o.a(new short[]{0, 1, 2}));
      }
   }

   public static final void f() {
      switch(o) {
         case 1:
            n.q();
            return;
         case 2:
            n.s();
      }
   }

   public static final void a(Graphics var0) {
      switch(o) {
         case 1:
            n.c(var0);
            return;
         case 2:
            n.d(var0);
      }
   }

   private static void j(int var0) {
      G = H;
      H = var0;
      a((byte)3);
   }

   public static final long a(short[] var0) {
      long var1 = 0L;
      int var3 = j.a() - 1 >> 8;
      int var4 = j.b() - 1 >> 8;
      int var5;
      if ((var5 = var0[2] >> 8) > var3) {
         var5 = var3;
      }

      int var6;
      if ((var6 = var0[3] >> 8) > var4) {
         var6 = var4;
      }

      int var7;
      if ((var7 = var0[1] >> 8) < 0) {
         var7 = 0;
      }

      int var8;
      if ((var8 = var0[0] >> 8) < 0) {
         var8 = 0;
      }

      int var9 = var3 + 1;

      for(long var10 = 1L << var7 * var9; var7 <= var6; ++var7) {
         for(int var12 = var8; var12 <= var5; ++var12) {
            var1 |= var10 << var12;
         }

         var10 <<= var9;
      }

      return var1;
   }

   private static void A() {
      aI = aj >= 0 && ai >= 0;
      g();
      B();
   }

   public static final void g() {
      for(int var0 = bu >= 0 ? bu : 0; var0 < x; ++var0) {
         aH = w[y[var0]];
         if (aH != null) {
            if (aH.m(x.G)) {
               aH.c();
            }

            if (aH.m(x.I)) {
               aH.D();
            }

            if (aH.m(x.H) && ((t.V[2] & aa.aN) != aa.aN || aH.V[3] == 6 || aH.V[3] == 8)) {
               if (aI && aH.ay >= 0) {
                  aH.R();
               } else {
                  aH.d();
               }

               if (ai.a) {
                  bu = var0;
                  return;
               }
            }
         }
      }

      aH = null;
      bu = -1;
   }

   private static void B() {
      if (r != null) {
         for(int var0 = 0; var0 < 1; ++var0) {
            if (r[var0] != null) {
               if (r[var0].m(x.G)) {
                  r[var0].c();
               }

               if (r[var0].m(x.H)) {
                  r[var0].D();
                  if (aI) {
                     if (r[var0].ay >= 0) {
                        r[var0].R();
                     }
                  } else {
                     r[var0].d();
                  }
               }
            }
         }
      }
   }

   private static void C() {
      new q();
   }

   public static final void a(String var0) {
      RecordStore var1 = null;

      try {
         var1 = RecordStore.openRecordStore(var0, false);
      } catch (Exception var9) {
      }

      if (var1 == null) {
         try {
            (var1 = RecordStore.openRecordStore(var0, true)).addRecord(new byte[100], 0, 1);
         } catch (RecordStoreFullException var6) {
         } catch (RecordStoreNotFoundException var7) {
         } catch (RecordStoreException var8) {
         }
      }

      try {
         ByteArrayOutputStream var2 = new ByteArrayOutputStream();
         DataOutputStream var3;
         q.a(var3 = new DataOutputStream(var2));
         byte[] var4 = var2.toByteArray();
         var1.setRecord(1, var4, 0, var4.length);
         var3.close();
         var2.close();
         var1.closeRecordStore();
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   private static void D() {
      aJ = null;
      F = 0;
      if (aC[0] == 1) {
         aK = o.a("sp");
      } else {
         aK = null;
      }

      if (aC[1] == 1) {
         aL = o.a("cp");
      } else {
         aL = null;
      }
   }

   private static void E() {
      aJ = null;
      aK = null;
      aL = null;
   }

   private static void F() {
      ++F;
      if (F < 20 && aK != null) {
         if (aJ != aK) {
            aJ = aK;
            return;
         }
      } else if (F < 40 && aL != null) {
         if (aJ != aL) {
            aJ = aL;
            return;
         }
      } else {
         a((byte)1);
      }
   }

   private static void f(Graphics var0) {
      o.a(var0, 16777215);
      if (aJ != null) {
         var0.drawImage(aJ, 120, 160, 3);
      }
   }

   private static void G() {
      if (aN == null) {
         aN = new n();
      }

      if (aO == null) {
         aO = new n();
      }

      if (aP == null) {
         aP = new n();
      }

      if (bc == null) {
         bc = new n();
      }

      if (bd == null) {
         bd = new n();
      }

      if (be == null) {
         be = new n();
      }

      if (a.e(20480)) {
         am.b(0);
         am.b = true;
         a((byte)2);
      } else {
         if (a.e(8192)) {
            am.e();
            am.b = false;
            a((byte)2);
         }
      }
   }

   private static void g(Graphics var0) {
      o.a(var0, 0);
      var0.setColor(16562763);
      var0.setFont(ae.c);
      var0.drawString("是否开启声音?", 120, 160, 33);
      var0.drawString("是", 0, 320, 36);
      var0.drawString("否", 240, 320, 40);
   }

   private static void H() {
      N = 0;
      H = -1;
      G = -1;
      aQ = o.a("fengmian");
      if (aQ != null) {
         aR = true;
      } else {
         aR = false;
         if (aN == null) {
            aN = new n();
         }
      }

      bv.clear();
      a.a();
      c();
      Y = false;
      Z = false;
      aM = false;
      L();
      if (aO == null) {
         aO = new n();
      }

      if (aP == null) {
         aP = new n();
      }

      m();
      if (C != 14 && C != 13) {
         for(int var0 = 0; var0 < as.length; ++var0) {
            if (as[var0]) {
               W = false;
            }
         }

         if (!W) {
            X = 1;
         } else {
            X = 0;
         }
      }

      ac.a((short)0, (short)0, (short)240, (short)320);
      d.d();
   }

   private static void I() {
      if (aR) {
         aQ = null;
      } else {
         aN.h();
         aN = null;
      }

      M();
   }

   private static void J() {
      if (aU || aR) {
         if (aM && d.l) {
            if (d.m == 1) {
               b();
            } else {
               if (d.m == 2) {
                  d.l = false;
                  aM = false;
               }
            }
         } else if (Y) {
            if (a.e(16384) || a.e(4096) || U == 4096 || U == 16384) {
               Y = false;
               a.a();
            }
         } else if (Z) {
            if (a.e(8192) || U == 32768 || U == 8192 || a.e(32768)) {
               Z = false;
               a.a();
            }
         } else if (!a.e(16384) && !a.e(4096) && U != 4096 && U != 16384) {
            if (a.e(4) || a.e(1)) {
               --X;
               if (!Q && X == 2) {
                  --X;
               }

               if (X < 0) {
                  X = V.length - 1;
                  return;
               }
            } else if (a.e(8) || a.e(2)) {
               ++X;
               if (!Q && X == 2) {
                  ++X;
               }

               if (X >= V.length) {
                  X = 0;
               }
            }
         } else {
            switch(X) {
               case 0:
                  a(0);
                  break;
               case 1:
                  a((byte)13);
                  break;
               case 2:
                  ad.a((short)11);
                  break;
               case 3:
                  a((byte)14);
                  break;
               case 4:
                  ad.a((short)1);
                  break;
               case 5:
                  ad.a((short)2);
                  break;
               case 6:
                  if (Q) {
                     ad.a((short)7);
                  } else {
                     d.a("是否确定退出游戏？", "确定", "返回", 1);
                     aM = true;
                  }
            }

            a.a();
         }
      }
   }

   private static void K() {
      ++aT;
      if (aT % 4 == 0) {
         ++aS;
         if (aS > 2) {
            aS = 0;
            aT = 0;
         }
      }
   }

   private static void h(Graphics var0) {
      o.a(var0, 0);
      K();
      n.a(var0);
      if (aQ != null) {
         var0.drawImage(aQ, 120, 160, 3);
      }

      boolean var1 = false;
      boolean var2 = false;
      o.a(var0, "<<", 80, 273, 17, 16708687, 0);
      o.a(var0, ">>", 160, 273, 17, 16708687, 0);
      o.a(var0, V[X], 120, 273, 17, X != 2 ? 16708687 : 16711680, 0);
      if (d.p) {
         d.a("没有有效的存档！", "确认", null, 1);
         d.p = false;
      }

      if (Z) {
         o.a(var0, 592136);
         d.a(var0, 2, 2, 234, 314, 4211247);
         var0.setColor(16777215);
         var0.drawString("返回", 236, 316, 40);
      }

      i(var0);
   }

   private static void L() {
      aV = n.a(3, new short[]{188, 45, 50, 60});
      aW = n.a(6, new short[]{0, 176, 62, 100});
      aX = n.a(5, new short[]{176, 244, 64, 56});
   }

   private static void M() {
      aV = null;
      aW = null;
      aX = null;
   }

   private static void i(Graphics var0) {
      n.a(var0, aV);
      n.a(var0, aW);
      n.a(var0, aX);
   }

   public static final void h() {
      d.a(12);
   }

   public static final void i() {
      d.a();
   }

   public static final void b(Graphics var0) {
      d.a(var0);
   }

   private static void N() {
      aY = "音乐|" + (am.b ? "开" : "关");
   }

   private static void O() {
      aY = null;
   }

   private static void P() {
      if (a.e(20480)) {
         am.b = !am.b;
         if (am.b) {
            am.b(0);
         } else {
            am.e();
         }

         aY = "音乐|" + (am.b ? "开" : "关");
      } else {
         if (a.e(8192)) {
            a(C);
         }
      }
   }

   private static void j(Graphics var0) {
      d.a(var0, aY, "切换", "返回");
   }

   private static void Q() {
      ad = 0;
      bs = 0;
      F = 0;
      ba = 1;
      bh = o.b(bg.length);
      aa.ba = 0;
      if (G != -1) {
         for(int var0 = 0; var0 < ab[G].length; ++var0) {
            if (ab[G][var0] == H) {
               ba = 0;
               break;
            }
         }
      }

      if (bc == null) {
         bc = new n();
      }

      if (be == null) {
         be = new n();
      }

      bb = new short[4];
      if (bf == null) {
         bf = new s();
      }

      bf.start();
      switch(ba) {
         case 1:
            bj = 0;
            o.b(aZ.length);
         case 0:
      }
   }

   private static void R() {
      if (bf != null && bf.isAlive()) {
         try {
            bf.join();
         } catch (InterruptedException var1) {
            var1.printStackTrace();
         }
      }

      bf = null;
      bb = null;
      be.h();
   }

   private static void S() {
      if (bs < ad || bs < 100) {
         bs += 2;
      }

      if (bs >= 100 && ad >= 100) {
         n.a((byte)0);
         a((byte)10);
      }
   }

   private static void k(Graphics var0) {
      o.a(var0, 7391231);
      if (ba == 1) {
         bb[0] = 110;
         bb[1] = 310;
         bb[2] = 30;
         bb[3] = 40;
         boolean var1 = false;
         if (bc != null) {
            bc.c = 60;
            bc.d = 2;
            bc.b(120, 150);
         }

         var0.setColor(65535);
         o.a(var0, "友情提示", 120, 115, 33, 16755828, 9766440);
         o.a(var0, bg[bh], 1, bi, 17, 5893631, 4325631);
         if (be != null) {
            be.c = 60;
            be.d = 0;
            be.e = bs / 4 + 3;
            be.b(bb[0] + 3, bb[1] + 2);
         }
      }
   }

   private static void T() {
      if (a.e(16384)) {
         s();
         if (am.b) {
            am.b(0);
         }
      }
   }

   private static void l(Graphics var0) {
      o.b(var0, 0, 0, 240, 320, -1728053248);
      var0.setFont(ae.c);
      var0.setColor(65535);
      var0.drawString("游戏暂停", 120, 140, 33);
      o.a(var0, "请按导航键中键或按5键返回游戏", 20, 160, 200, 40);
   }

   private static void U() {
      a.a();
   }

   private static void V() {
      a.a();
   }

   private static void W() {
      if (ai.f[4] == 100 && ai.e[0] <= 25) {
         ai.e[0] = 26;
         if (!t.b.c(3)) {
            t.b.b(3);
         }

         if (w.f(22) == null) {
            w.a(22, 1);
         }
      }

      if (!q.a(0) && H == 5) {
         q.d(0);
         a((byte)20);
      }

      if (ai.i) {
         ai.f();
      }

      if (t.f != 5 || !t.bn) {
         if (ac) {
            t.D();
            t.d();
         } else {
            ++F;
            k();
            ag();
            A();
            ac.b(false);
            l();
            if (bm) {
               ab();
            } else if (ai >= 0 && D != 12) {
               a((byte)12);
            } else if (a.e(8192)) {
               d.a(5);
            } else {
               if (a.e(4096)) {
                  a.a();
                  d.a(13);
               }
            }
         }
      }
   }

   private static void m(Graphics var0) {
      c(var0);
      if (bm) {
         o(var0);
      }

      g.a(var0);
   }

   public static final void c(Graphics var0) {
      if (n.m == 0) {
         o.a(var0, 0);
      }

      n.a(var0);
      j.a(var0, ac.h(), ac.j());
      a(var0);
      n.j();
      n.o();
      if (D == 4 && n.h <= 0 && n.i <= 0 && H > -1) {
         d.a(var0, 0);
      }

      if (t != null) {
         t.c(var0);
         t.b(var0);
         aj.b(var0);
      }

      n.m();
      n.c(0);
      n.b(var0);
   }

   private static void X() {
      ae.a = a;
      ax = 0;
      x var0 = null;

      for(short var1 = 0; var1 < w.length; ++var1) {
         if ((var0 = w[var1]) != null) {
            var0.ay = -1;
         }
      }

      for(int var5 = 0; var5 < 1; ++var5) {
         if (r[var5] != null) {
            r[var5].ay = -1;
         }
      }

      aj = 0;
      ak = 0;

      for(int var6 = 0; var6 < an[ai]; ++var6) {
         short var2;
         x var3;
         if ((var3 = d(var2 = ao[ai][var6])) == null) {
            System.out.println("InitCurrentTrailer():actor=null, actorID=" + var2);
         } else {
            if (var2 >= u) {
               ay[ax++] = (short)var2;
            }

            var3.k(x.H);
            var3.k(x.I);
            var3.ay = var6;
            var3.az = 0;
            var3.R();
         }
      }
   }

   private static void Y() {
      ae.a = 60;
      ax = 0;
      ai = -1;
      aj = -1;
      aq.k(x.Q);
      aq.l(x.H);
      aq.l(x.I);
      aq = null;
      if (t.ay >= 0) {
         t.a((short)0);
      }
   }

   private static void Z() {
      k();
      ag();
      A();
      ak += 3;
      ++aj;
      if (aj >= am[ai]) {
         a(C);
      }

      l();
   }

   private static void n(Graphics var0) {
      c(var0);
   }

   public static final void j() {
      bq = 0L;
      if (bk == null) {
         bk = o.a("num5");
      }

      if (bl == null) {
         bl = o.a("num1");
      }

      if (aN == null) {
         aN = new n();
      }

      bm = true;
      t.l(x.I);
      t.l(x.H);
      bo = 0;
      bp = 15;
   }

   private static void aa() {
      bm = false;
      n.l();
      bk = null;
      bl = null;
      t.k(x.I);
      t.k(x.H);
      bp = 0;
      aN.h();
      aN = null;
   }

   private static void ab() {
      ++bq;
      if (bq % 15L == 0L) {
         --bp;
      }

      if (t != null) {
         bn = w.f(2);
         bo = 0;
         if (bn != null) {
            bo = bn.k;
         }
      }

      if (bo > 0) {
         if (a.e(1024) && w.h(2)) {
            t.l(x.P);
            t.d(t.S());
            t.e(t.T());
            t.a((short)14);
            t.l(x.Q);
            t.l(x.P);
            w.i(2);
            aa();
            return;
         }
      } else if (a.e(1024)) {
         d.d = 2;
         d.a(11);
         return;
      }

      if (a.e(2048) || bp <= 0) {
         aa();
         c();
         a((byte)2);
      }
   }

   private static void o(Graphics var0) {
      i var1;
      (var1 = l.e[t.V[6]]).a(var0, 17, var1.b(17) - 1, t.Z(), t.aa(), false, t.X);
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      o.a(var0, bk, String.valueOf(bp), 120, 130, 33, 1, 0, 10);
      var0.setColor(12303291);
      o.b(var0, 30, 140, 180, 100, -1728053248);
      var0.drawRoundRect(30, 140, 180, 100, 5, 5);
      var0.drawRoundRect(29, 139, 182, 102, 6, 6);
      var0.setColor(0);
      var0.drawRoundRect(28, 138, 184, 104, 10, 10);
      if (bo > 0) {
         var0.setColor(16755828);
         o.a(var0, "请按“*”键使用", 120, 160, 33, 16755828, 9766440);
         o.a(var0, "生命之水", 120, 190, 33, 5893631, 4325631);
      } else {
         o.a(var0, "生命之水不足", 120, 190, 33, 5893631, 4325631);
         var0.setColor(16755828);
         o.a(var0, "请按“*”键前往商店购买", 30, 140, 180, 100);
      }

      if (aN != null) {
         aN.c = 58;
         aN.d = 1;
         aN.e = 2;
         aN.b(98, 200);
      }

      if (bl != null) {
         o.a(var0, bl, "x" + String.valueOf(bo), 128, 210, 33, 1, 0, 11);
      }

      o.a(var0, "按#键返回主菜单", 240, 0, 24, 15975757, 592136);
   }

   private static void ac() {
      if (a.c()) {
         c();
         a((byte)2);
         a.a();
      }
   }

   private static void p(Graphics var0) {
      o.a(var0, 0);
      var0.setColor(65535);
      var0.drawString("恭喜通关！", 120, 160, 17);
   }

   public static final void a(Graphics var0, int var1, int var2, int var3) {
      if (var1 >= 0) {
         short var4;
         if ((var4 = e[1]) >= 0 && var4 <= l.e.length) {
            i var5;
            if ((var5 = l.e[var4]) == null) {
               System.out
                  .println(
                     ">>drawPublicFrame(): Cant paint! maybe you don't set \"Pack Anim?\" to \"No\"!! Or you dont select this animation into this scene! Or has error in load animation"
                  );
            } else {
               if (br == null) {
                  br = new short[var5.b][2];
               }

               var5.a((short)var1, br[var1]);
               var5.a(var0, var1, br[var1][0], var2, var3, false);
            }
         }
      }
   }

   public static final boolean a(x var0) {
      aa var1 = t;
      short[] var2 = var0.M();
      boolean var3 = o.a(var1.V[8], var1.V[9], var2[0], var2[1], var2[2], var2[3]);
      if (var0.p(16)) {
         return var3;
      } else if (Math.abs(var0.V[8] - var1.V[8]) + Math.abs(var0.V[9] - var1.V[9]) < j.c() * 3) {
         return true;
      } else {
         int var4 = var2[2] - var2[0];
         int var5 = var2[3] - var2[1];
         short var6 = var0.V[8];
         short var7 = var0.V[9];
         return o.a(var1.V[8], var1.V[9], var6 - (var4 >> 1), var7 - (var5 >> 1), var6 + (var4 >> 1), var7 + (var5 >> 1));
      }
   }

   public static final boolean a(x var0, x var1) {
      if (var0.o(16) && var1.o(16)) {
         return o.a(var0.M(), var1.M());
      } else if (var0.o(16)) {
         short[] var3 = var0.M();
         return o.a(var1.V[8], var1.V[9], var3[0], var3[1], var3[2], var3[3]);
      } else if (var1.o(16)) {
         short[] var2 = var1.M();
         return o.a(var0.V[8], var0.V[9], var2[0], var2[1], var2[2], var2[3]);
      } else {
         return Math.abs(var0.V[8] - var1.V[8]) + Math.abs(var0.V[9] - var1.V[9]) < j.c() * 3;
      }
   }

   public static final x d(int var0) {
      if (var0 < 0) {
         return null;
      } else {
         Object var1 = null;
         if (var0 == 1) {
            var1 = t;
         } else {
            var1 = w[var0];
         }

         return (x)var1;
      }
   }

   private static void ad() {
      DataInputStream var0 = null;

      try {
         (var0 = o.c("cfg.bin")).readByte();
         b = var0.readByte();
         j.a(b);
         c = new int[b + 1];

         for(int var1 = 0; var1 < c.length; ++var1) {
            c[var1] = var0.readInt();
         }

         d.a(var0);
         l.b = var0.readShort();
         if (l.e == null) {
            l.e = new i[l.b];
         }

         j.a = var0.readShort();
         l.c = var0.readShort();
         if (l.f == null) {
            l.f = new aq[l.c];
         }

         j.f = new aq[j.a];
         l.d = new short[b][];

         for(int var9 = 0; var9 < b; ++var9) {
            l.d[var9] = new short[var0.readShort()];

            for(int var2 = 0; var2 < l.d[var9].length; ++var2) {
               l.d[var9][var2] = var0.readShort();
            }
         }

         d = (short)var0.readByte();
         e = new short[d];
         f = new short[d];
         g = new byte[d];
         h = new byte[d];
         i = new byte[d];

         for(int var10 = 0; var10 < d; ++var10) {
            e[var10] = var0.readShort();
            f[var10] = var0.readShort();
            g[var10] = var0.readByte();
            h[var10] = var0.readByte();
            i[var10] = var0.readByte();
         }

         var0.close();
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         ;
      }
   }

   private static void k(int var0) {
      DataInputStream var1 = null;
      l = (short[][])null;

      try {
         (var1 = o.c("scs.bin")).skip((long)c[var0]);
         k = var1.readShort();
         p = var1.readShort();
         var1.readInt();
         a = var1.readShort();
         aw = var1.readShort();
         int[] var2 = new int[aw + 1];

         for(int var3 = 0; var3 < var2.length; ++var3) {
            var2[var3] = var1.readInt();
         }

         l = new short[aw][];

         for(int var11 = 0; var11 < l.length; ++var11) {
            l[var11] = new short[(var2[var11 + 1] - var2[var11] >> 1) + 1];

            for(int var4 = 0; var4 < l[var11].length; ++var4) {
               if (var4 == 15) {
                  l[var11][var4] = 0;
               } else {
                  l[var11][var4] = var1.readShort();
               }
            }
         }

         d(var1);
         var1.readByte();
         l(k);
         if (p >= 0) {
            a.h(p);
         }

         var1.close();
      } catch (Exception var8) {
         var8.printStackTrace();
         --ad;
      } finally {
         ;
      }
   }

   private static int ae() {
      if (ad == 0) {
         e(H, G);
      } else if (ad == 10) {
         j.b(H);
      } else if (ad != 15) {
         if (ad == 20) {
            l.a(H, G);
            l.a("amn.bin", l.a, l.e, l.f);
         } else if (ad == 70) {
            k(H);
         } else if (ad == 85) {
            ai.a(H);
         } else if (ad != 90 && ad == 99) {
            i.a(l.f);
            af();
            j.d(H);
         }
      }

      return ad++;
   }

   private static void af() {
      v = aw;
      aw = (short)(aw + 20);
      q = new long[aw];
      w = new x[aw];
      if (f[l[0][0]] == 81) {
         J = l[0][20];
         if (l[0][16] == 1) {
            K = true;
         } else {
            K = false;
         }

         if (l[0][17] == 1) {
            L = true;
         } else {
            L = false;
         }

         n = l[0][21];
         m = l[0][18];
         ac.k = l[0][19];
      }

      if (f[l[1][0]] == 2) {
         M = l[1][23];
      }

      for(int var0 = 0; var0 < 1; ++var0) {
         s[var0] = l[var0 + 1];
      }

      u = (short)(s.length + 1);

      for(short var1 = u; var1 < aw - 20; ++var1) {
         if ((l[var1][2] & x.F) == x.F) {
            w[var1] = a(l[var1][0], var1);
            if (w[var1] != null) {
               w[var1].a(l[var1]);
               q[var1] = a(w[var1].M());
            }
         }
      }

      l = (short[][])null;
   }

   private static void e(int var0, int var1) {
      j.c(var0);
      long[] var2 = new long[(l.b >> 6) + 1];
      if (var1 != -1) {
         for(int var3 = l.d[var1].length - 1; var3 >= 0; --var3) {
            short var4 = l.d[var1][var3];
            var2[var4 >> 6] |= 1L << var4 % 64;
         }
      }

      for(int var10 = 0; var10 < ab[var0].length; ++var10) {
         byte var12 = ab[var0][var10];

         for(int var5 = l.d[var12].length - 1; var5 >= 0; --var5) {
            short var6;
            int var7 = (var6 = l.d[var12][var5]) >> 6;
            long var8 = 1L << var6 % 64;
            if ((var2[var7] & var8) != 0L) {
               var2[var7] &= ~var8;
            }
         }
      }

      int[] var11 = new int[l.b];
      int var13 = 0;

      for(int var14 = 0; var14 < l.b; ++var14) {
         int var16 = var14 >> 6;
         int var17 = var14 % 64;
         if ((var2[var16] & 1L << var17) != 0L) {
            var11[var13++] = var14;
         }
      }

      int[] var15 = new int[var13];
      System.arraycopy(var11, 0, var15, 0, var13);
      l.a(var15, l.e, l.f);
      ai.c();
      bu = -1;
   }

   public static final void a(DataInputStream var0, int var1, boolean var2) throws Exception {
      short var5;
      byte[][][] var3 = new byte[var5 = var0.readShort()][][];
      byte[][][] var4 = new byte[var5][][];

      for(int var6 = 0; var6 < var5; ++var6) {
         a(var0);
         var3[var6] = ae;
         var4[var6] = af;
         ae = (byte[][])null;
         af = (byte[][])null;
      }

      ai.a(var3, var4);
   }

   private static void a(DataInputStream var0) throws Exception {
      short var1;
      ae = new byte[var1 = var0.readShort()][];
      af = new byte[var1][];

      for(int var2 = 0; var2 < var1; ++var2) {
         ae[var2] = c(var0);
      }

      for(int var3 = 0; var3 < var1; ++var3) {
         af[var3] = b(var0);
      }
   }

   private static byte[] b(DataInputStream var0) throws Exception {
      byte[] var2 = new byte[var0.readInt() + 1];
      var0.read(var2);
      return var2;
   }

   private static byte[] c(DataInputStream var0) throws Exception {
      byte[] var2 = new byte[var0.readInt() + 2];
      var0.read(var2);
      return var2;
   }

   private static void d(DataInputStream var0) throws IOException {
      al = var0.readByte();
      am = new short[al];
      an = new byte[al];
      ao = new short[al][];
      ap = new byte[al][][];

      for(int var1 = 0; var1 < al; ++var1) {
         am[var1] = var0.readShort();
         byte var2 = var0.readByte();
         an[var1] = (byte)var2;
         ao[var1] = new short[var2];
         ap[var1] = new byte[var2][];

         for(int var3 = 0; var3 < var2; ++var3) {
            ao[var1][var3] = var0.readShort();
            int var5 = var0.readByte() * 9;
            ap[var1][var3] = new byte[var5];
            var0.read(ap[var1][var3]);
         }
      }

      ai = -1;
      aj = -1;
      aq = null;
   }

   public static final int e(int var0) {
      for(int var1 = 0; var1 < al; ++var1) {
         for(int var2 = 0; var2 < an[var1]; ++var2) {
            if (ao[var1][var2] == var0) {
               return var1;
            }
         }
      }

      return -1;
   }

   private static void l(int var0) {
      DataInputStream var1 = null;

      try {
         (var1 = o.c("stg.bin")).readByte();
         int[] var3 = new int[var1.readShort() + 1];

         for(int var4 = 0; var4 < var3.length; ++var4) {
            var3[var4] = var1.readInt();
         }

         if (var0 >= 0) {
            var1.skip((long)var3[var0]);
         }

         j = new String[var1.readShort()];

         for(int var5 = 0; var5 < j.length; ++var5) {
            j[var5] = var1.readUTF();
         }

         var1.close();
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }

   public static final short a(byte var0, byte var1) {
      return (short)(var0 << 8 | var1 & 255);
   }

   public static final void k() {
      if (w != null) {
         x = 0;
         z = 0;

         for(int var1 = w.length - 1; var1 >= u; --var1) {
            x var0;
            if ((var0 = w[var1]) != null) {
               var0.aH = false;
               if (var0.m(x.Q)) {
                  if (var1 >= w.length - 20) {
                     w[var1] = null;
                     continue;
                  }

                  if (!bt || !var0.p(2)) {
                     continue;
                  }

                  var0.a();
                  var0.l(x.Q);
                  var0.k(x.I);
                  var0.k(x.H);
               }

               if (var0.m(x.G) || o.a(var0.V[8] - ac.h(), var0.V[9] - ac.j(), ac.f[0], ac.f[1], ac.f[2], ac.f[3])) {
                  c(var0);
               }
            }
         }
      }
   }

   private static void c(x var0) {
      if (x < y.length) {
         y[x++] = var0.V[1];
      }

      var0.aH = o.a(var0.V[8] - ac.h(), var0.V[9] - ac.j(), ac.g[0], ac.g[1], ac.g[2], ac.g[3]) || f[var0.V[0]] == 96;
      if (var0.aH) {
         d(var0);
      }
   }

   private static void d(x var0) {
      if (z < A.length) {
         A[z++] = var0.V[1];
      }
   }

   private static final void ag() {
      int var0 = ax;

      while(--var0 >= 0) {
         boolean var1 = false;
         int var2 = x;

         while(--var2 >= 0) {
            if (ay[var0] == y[var2]) {
               var1 = true;
               break;
            }
         }

         if (!var1) {
            c(w[ay[var0]]);
         }
      }
   }

   public static final void l() {
      for(int var2 = 80; var2 >= 0; --var2) {
         j.b[var2] = 0;
      }

      for(int var15 = j.d - 1; var15 >= 0; --var15) {
         j.a((byte)2, j.e[var15], (byte)-1);
      }

      j.d = 0;
      x var16 = null;

      for(byte var3 = 0; var3 < x; ++var3) {
         if ((var16 = w[y[var3]]) != null && var16.m(x.I) && !var16.p(16)) {
            short var0 = var16.V[8];
            short var1 = var16.aE != 0 ? var16.aE : var16.V[9];
            if (var0 >= 0 && var1 >= 0 && var0 <= j.a() && var1 <= j.b()) {
               int var4;
               if ((var4 = j.a((byte)2, var0, var1)) <= -1) {
                  if (-83 < var4 && var4 <= -2) {
                     var4 = -var4 + -2;
                  } else {
                     j.e[j.d++] = j.a((byte)2, var0, var1, (byte)(-var3 + -2));
                     var4 = var3;
                  }

                  if (j.b[var4] < 5) {
                     j.c[var4 * 5 + j.b[var4]] = (short)var3;
                     ++j.b[var4];
                  }
               }
            } else {
               var16.l(x.I);
               var16.l(x.H);
            }
         }
      }

      if (r != null) {
         for(int var20 = 0; var20 < 1; ++var20) {
            if (r[var20] != null && r[var20].m(x.I)) {
               byte var18 = (byte)(80 + var20);
               short var13 = r[var20].V[8];
               short var14 = r[var20].aE != 0 ? r[var20].aE : r[var20].V[9];
               int var5 = 0;
               boolean var6 = false;
               boolean var7 = false;
               int var8 = 0;
               if ((var5 = j.a((byte)2, var13, var14)) == -82) {
                  var5 = -1;
               }

               if (-83 < var5 && var5 <= -2) {
                  var5 = -var5 + -2;
               } else {
                  j.e[j.d++] = j.a((byte)2, var13, var14, (byte)(-var18 + -2));
                  var5 = var18;
               }

               if (j.b[var5] < 5) {
                  var8 = (var8 = var5 * 5) + j.b[var5];
                  j.c[var8] = (short)var18;
                  ++j.b[var5];
               }
            }
         }
      }

      Object var29 = null;
      Object var9 = null;

      for(int var10 = j.b.length - 1; var10 >= 0; --var10) {
         int var21;
         int var24 = (var21 = var10 * 5) + j.b[var10];

         for(int var11 = var21; var11 < var24; ++var11) {
            int var12 = var11;
            if (var11 > var21) {
               short var25;
               if ((var25 = j.c[var11 - 1]) < 80) {
                  var29 = w[y[var25]];
               } else {
                  var29 = r[var25 - 80];
               }

               short var26;
               if ((var26 = j.c[var11]) < 80) {
                  var9 = w[y[var26]];
               } else {
                  var9 = r[var26 - 80];
               }

               while(var12 > var21 && g[((x)var29).V[0]] > g[((x)var9).V[0]]) {
                  o.b(j.c, var12, var12 - 1);
                  --var12;
               }
            }
         }
      }
   }

   private static final int a(int var0, int var1, int var2) {
      return (var0 & 3) << 30 | (var1 & 63) << 24 | var2 & 16777215;
   }

   private static final void a(int var0, int var1, byte[] var2) {
      bv.put(String.valueOf(a(var0, var1, 0)), var2);
   }

   public static final void a(int var0, int var1, int var2, int var3, byte[] var4) {
      bv.put(String.valueOf(a(var0, var1, (var2 & 4095) << 12 | var3 & 4095)), var4);
   }

   private static final void m(int var0) {
      ByteArrayOutputStream var4 = new ByteArrayOutputStream();
      DataOutputStream var5 = new DataOutputStream(var4);

      try {
         for(int var6 = w.length - 1; var6 >= 0; --var6) {
            x var1 = w[var6];
            System.out.println("obj" + var1);
            if (var1 != null && var1.m(x.J) && !(var1 instanceof f)) {
               var1.a(var5);
            }

            var4.close();
            var5.close();
         }
      } catch (Exception var7) {
         var7.printStackTrace();
      }

      byte[] var3 = var4.toByteArray();
      a(0, var0, var3);
   }

   private static byte[] a(String var0, int var1, ByteArrayOutputStream var2, DataOutputStream var3) throws Exception {
      byte[] var4;
      if (var0.equals("DNFP_RMS_GAME")) {
         System.out.println("-------write DB_NAME_GAME--------");
         var3.writeInt(N);
         var3.writeInt(H);

         for(int var5 = 0; var5 < r.length; ++var5) {
            r[var5].a(var3);
         }

         ai.a(var3);
         m(H);
         var3.writeInt(bv.size());
         Enumeration var7 = bv.keys();

         while(var7.hasMoreElements()) {
            String var6 = (String)var7.nextElement();
            var3.writeUTF(var6);
            o.a((byte[])bv.get(var6), var3);
         }

         if (ac.h == null) {
            var3.writeBoolean(true);
         } else {
            var3.writeBoolean(false);
         }

         var3.writeShort(ac.i);
         var3.writeShort(ac.j);
         o.a(d.h, var3);
         System.out.println("-------write end--------");
         System.arraycopy(var4 = var2.toByteArray(), 0, ar[var1 - 1], 0, ar[var1 - 1].length);
      } else if (var0.equals("DNFP_RMS_CONFIG")) {
         var3.writeBoolean(am.b);
         var4 = var2.toByteArray();
      } else if (var0.equals("DNFP_RMS_PASS")) {
         var4 = null;
      } else if (var0.equals("DNFP_RMS_JOIN")) {
         var4 = null;
      } else if (var0.equals("DNFP_RMS_SUPER_VARIATES")) {
         ai.b(var3);
         System.out.println("-------write end--------");
         var4 = var2.toByteArray();
      } else if (var0.equals("DNFP_RMS_CHARGE")) {
         System.out.println("-------write DB_NAME_CHARGE--------");
         var3.writeBoolean(aa.bd);
         var3.writeBoolean(d.v);
         System.out.println("-------write end--------");
         var4 = var2.toByteArray();
      } else {
         var4 = null;
      }

      return var4;
   }

   private static boolean a(String var0, int var1, DataInputStream var2) throws Exception {
      if (var0.equals("DNFP_RMS_GAME")) {
         System.out.println("-------read DB_NAME_GAME--------");
         N = var2.readInt();
         G = -1;
         H = var2.readInt();

         for(int var3 = 0; var3 < r.length; ++var3) {
            if (r[var3] == null) {
               r[var3] = new aa((byte)var3);
            }

            r[var3].a(var2);
         }

         ai.a(var2);
         bv.clear();
         int var6 = var2.readInt();

         for(int var4 = 0; var4 < var6; ++var4) {
            String var5 = var2.readUTF();
            bv.put(var5, o.a(var2));
         }

         ac.a(var2);
         d.h = o.e(var2);
         System.out.println("-------read end--------");
      } else if (var0.equals("DNFP_RMS_CONFIG")) {
         am.b = var2.readBoolean();
      } else if (!var0.equals("DNFP_RMS_PASS") && !var0.equals("DNFP_RMS_JOIN")) {
         if (var0.equals("DNFP_RMS_SUPER_VARIATES")) {
            ai.b(var2);
         } else if (var0.equals("DNFP_RMS_CHARGE")) {
            System.out.println("-------read DB_NAME_CHARGE--------");
            aa.bd = var2.readBoolean();
            d.v = var2.readBoolean();
            System.out.println("-------read end--------");
         }
      }

      return true;
   }

   public static final boolean[] m() {
      f(1);
      return as;
   }

   public static final boolean[] f(int var0) {
      byte[] var1 = c("DNFP_RMS_GAME", var0);
      int var2 = var0 - 1;
      if (var1 != null && var1.length >= ar[var2].length) {
         as[var2] = true;
         System.arraycopy(var1, 0, ar[var2], 0, ar[var2].length);
      } else {
         as[var2] = false;
      }

      return as;
   }

   public static final boolean a(String var0, int var1) {
      try {
         ByteArrayOutputStream var2 = new ByteArrayOutputStream();
         byte[] var3 = a(var0, var1, var2, new DataOutputStream(var2));
         a(var0, var1, var3);
         var2.close();
         return true;
      } catch (Exception var4) {
         var4.printStackTrace();
         return false;
      }
   }

   public static final boolean b(String var0, int var1) {
      try {
         byte[] var2;
         if ((var2 = c(var0, var1)) == null) {
            return false;
         } else {
            DataInputStream var3 = new DataInputStream(new ByteArrayInputStream(var2));
            a(var0, var1, var3);
            var3.close();
            return true;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         return false;
      }
   }

   private static boolean a(String var0, int var1, byte[] var2) {
      try {
         RecordStore var3;
         if ((var3 = RecordStore.openRecordStore(var0, true)) == null) {
            return false;
         } else {
            while(var3.getNumRecords() < var1) {
               var3.addRecord(new byte[]{0}, 0, 1);
            }

            var3.setRecord(var1, var2, 0, var2.length);
            var3.closeRecordStore();
            return true;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         return false;
      }
   }

   private static byte[] c(String var0, int var1) {
      try {
         RecordStore var2;
         if ((var2 = RecordStore.openRecordStore(var0, true)) != null && var2.getNumRecords() >= var1) {
            byte[] var3 = var2.getRecord(var1);
            var2.closeRecordStore();
            return var3;
         } else {
            return null;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static final int n() {
      for(short var0 = (short)(w.length - 20); var0 < w.length; ++var0) {
         if (w[var0] == null) {
            v = var0;
            return v;
         }
      }

      return -1;
   }

   public static final x b(x var0) {
      int var1;
      if ((var1 = n()) == -1) {
         return null;
      } else {
         w[var1] = a(var0.V[0], var1);
         if (w[var1] != null) {
            short[] var2 = new short[var0.V.length];
            System.arraycopy(var0.V, 0, var2, 0, var2.length);
            w[var1].a(var2);
            w[var1].V[1] = (short)var1;
            q[var1] = a(w[var1].M());
            System.arraycopy(var0.W, 0, w[var1].W, 0, var0.W.length);
         }

         return w[var1];
      }
   }

   public static final x a(int var0, int var1) {
      short var2 = f[var0];
      Object var3 = null;
      switch(var2) {
         case 33:
            var3 = new c(1);
            break;
         case 34:
            var3 = new c(0);
            break;
         case 51:
            var3 = new v();
            break;
         case 52:
            var3 = new ah();
            break;
         case 82:
            var3 = new r(0);
            break;
         case 83:
            var3 = new r(1);
            break;
         case 95:
            var3 = new ac();
            break;
         case 98:
            var3 = new ab();
            break;
         case 103:
            var3 = new au();
            break;
         case 110:
            var3 = new b();
            break;
         default:
            var3 = new f();
      }

      ((x)var3).Y = var1;
      return (x)var3;
   }

   public static final void o() {
      d.a(111);
   }

   public static final void p() {
      d.a();
   }

   public static final void d(Graphics var0) {
      d.a(var0);
   }

   public static final av q() {
      if (az == null) {
         az = new av();
      }

      return az;
   }

   public static final void r() {
      aA = true;
      a.a();
   }

   public static final void s() {
      aA = false;
      ad.a(true);
      a.a();
   }

   public static final void b(int var0, int var1) {
      if (var1 >= 0 && var1 < 7) {
         bw[var1] = var0;
         if (var0 <= 0) {
            return;
         }
      }
   }

   public static final int g(int var0) {
      return bw[var0];
   }

   public static final void c(int var0, int var1) {
      if (var1 >= 0 && var1 < 7) {
         if (var0 <= 0) {
            bw[var1] -= var0;
            return;
         }

         bw[var1] += var0;
      }
   }

   public static final int[] t() {
      return bw;
   }

   public static final void u() {
      for(int var0 = 0; var0 < bw.length; ++var0) {
         bw[var0] = 0;
      }
   }

   public static final void v() {
      if (bw[0] >= 0) {
         bw[0]++;
      }
   }

   public static final byte w() {
      return ba;
   }

   public static final int x() {
      return ae();
   }

   public static final void d(int var0, int var1) {
      e(var0, var1);
   }

   public static final void h(int var0) {
      k(var0);
   }

   public static final int i(int var0) {
      bs = var0;
      return var0;
   }

   static {
      new Hashtable();
      int[] var10000 = new int[]{1, 1, 2, 2, 4, 8, 4, 8, 16, 16};
      var10000 = new int[]{32, 64, 256, 512, 1024};
      var10000 = new int[]{65280, 255, 16711680, 16776960, 65535, 16711935};
      String[] var3 = new String[]{
         "", "", "", "议会厅", "墓地", "拉斯特城", "城外", "拉斯特森林", "邪恶洞穴", "地牢入口", "地牢二层", "拉斯特沼泽", "圣尔兰", "地牢三层", "囚禁室", "底层宫殿入口", "底层宫殿", "", ""
      };
      String[] var4 = new String[]{"", "", "", "", "", "", "", "", "", "", "", "", ""};
      int[][] var5 = new int[][]{
         {0, 10},
         {1, 8},
         {0, 10},
         {1, 20480},
         {0, 10},
         {2, 0},
         {0, 10},
         {2, 1},
         {0, 10},
         {1, 8},
         {0, 10},
         {1, 2},
         {0, 10},
         {1, 4},
         {0, 10},
         {1, 1},
         {0, 10},
         {2, 2},
         {0, 10},
         {1, 20480},
         {0, 10},
         {2, 3},
         {1, 8},
         {0, 10},
         {1, 20480},
         {0, 10},
         {2, 4},
         {0, 10},
         {1, 20480},
         {0, 2},
         {1, 20480},
         {0, 10},
         {2, 5},
         {0, 10},
         {1, 20480},
         {0, 10},
         {2, 6},
         {0, 10},
         {2, 7},
         {0, 10},
         {1, 20480},
         {0, 2},
         {1, 20480},
         {0, 10},
         {1, 20480},
         {0, 10},
         {1, 8},
         {0, 10},
         {2, 8},
         {0, 10},
         {1, 20480},
         {0, 2},
         {1, 20480},
         {0, 10},
         {1, 20480},
         {0, 10},
         {2, 9},
         {0, 10},
         {1, 8},
         {0, 10},
         {1, 20480},
         {0, 2},
         {1, 20480},
         {0, 10},
         {1, 2},
         {0, 10},
         {1, 20480},
         {0, 10},
         {2, 10},
         {0, 10},
         {2, 11},
         {0, 10},
         {2, 12},
         {0, 10},
         {2, 13},
         {1, 8192},
         {0, 1},
         {1, 8192}
      };

      for(int var0 = 0; var0 < au.length; ++var0) {
         if (var0 == 0) {
            au[var0][0] = 95;
            au[var0][1] = 299;
            au[var0][2] = 20;
            au[var0][3] = 20;
         } else if (1 <= var0 && var0 <= 3) {
            au[var0][0] = 111;
            au[var0][1] = (short)(247 + (var0 - 1) * 17);
            au[var0][2] = 16;
            au[var0][3] = 16;
         } else if (4 <= var0 && var0 <= 5) {
            au[var0][0] = (short)(93 + (var0 - 4) * 36);
            au[var0][1] = 264;
            au[var0][2] = 16;
            au[var0][3] = 16;
         }
      }

      short[] var6 = new short[]{220, 0, 20, 20};
      String[] var7 = new String[]{"寒风撩乱发", "冷星照薄裳", "挥袖乘风去", "空留满地霜"};
      av = 40;
      bw = new int[7];
   }
}
