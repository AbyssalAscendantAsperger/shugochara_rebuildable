import java.io.DataInputStream;
import java.io.DataOutputStream;

public final class m {
   private static n m = null;
   public static final String[] a = new String[]{
      "血瓶",
      "魔瓶",
      "生命之水",
      "怒气石",
      "攻击石",
      "防御石",
      "宠物饲料",
      "鲜花",
      "魔魂石",
      "重修书",
      "技能书",
      "蟹钳",
      "星光",
      "海螺壳",
      "青蛙心",
      "魂石",
      "刀刃",
      "蛇胆",
      "魔刃",
      "冰晶",
      "魔心",
      "炙热之心",
      "通天眼",
      "冰晶锁",
      "封魔印",
      "金钱"
   };
   public static final String[] b = new String[]{
      "回复HP30%。",
      "回复MP30%。",
      "死亡后使用可满状态复活。",
      "使用后怒气全满。",
      "使用后攻击永久+2。",
      "使用后防御永久+1。",
      "使用后宠物经验提升20。",
      "使用后劳拉的好感度+10。",
      "升级宠物所需的灵石。",
      "可还原技能点，重修技能。",
      "使用后技能点+1。",
      "变异蟹的钳子，非常坚硬。",
      "海星星掉落的外壳，有特殊用途。",
      "海螺的外壳，常作为打造的材料。",
      "青蛙的心，具有明目的作用。",
      "鬼魂的结晶。",
      "幻灵界的刀刃，升级武器的材料。",
      "蛇胆。",
      "魔兔的武器，锋利无比。",
      "极寒的冰石，具有神秘的能量。",
      "灯笼怪掉落的灯芯，充满魔之力。",
      "扎昆的心脏，充满强大的力量。",
      "进入夜色岛所必需的任务物品，可看穿幻灵的所有伪装。",
      "进入扎昆山脉所必需的任务物品，可防止酷热熔岩造成的伤害。",
      "进入地下王宫所必需的任务物品。"
   };
   public static final String[] c = new String[]{
      "打造 通天眼 & 进入夜色岛所必需的任务物品，可看穿幻灵的所有伪装。 & 需要材料  星光20 海螺壳20 青蛙心20 魔刃2 金钱2000",
      "打造 冰晶锁 & 进入扎昆山脉所必需的任务物品，可防止酷热熔岩造成的伤害。 & 需要材料 冰晶5 刀刃4 蛇胆3 金钱1000",
      "打造 封魔印 & 进入地下王宫所必需的任务物品。 & 需要材料  魔心50 刀刃5 蛇胆5 金钱5000"
   };
   public static final short[] d = new short[]{5, 7, 75, 22, 23, -1, -1, 58};
   public static final String[] e = new String[]{"生命+ ", "魔法+ ", ""};
   public static final short[][] f = new short[][]{
      {0, 300, 0, 30, 8},
      {0, 200, 1, 30, 8},
      {0, 1000, -1, 0, 0},
      {0, 200, 2, 100, 8},
      {0, 1000, 3, 2, 0},
      {0, 1000, 4, 1, 0},
      {0, 1500, 5, 1, 0},
      {0, 1000, -1, 0, 0},
      {0, 300, 6, 50, 6},
      {0, 3000, -1, 0, 0},
      {0, 0, 7, 5, 0},
      {1, 0, -1, 0, 0},
      {1, 0, -1, 0, 0},
      {1, 0, -1, 0, 0},
      {1, 0, -1, 0, 0},
      {1, 0, -1, 0, 0},
      {1, 0, -1, 0, 0},
      {1, 0, -1, 0, 0},
      {1, 3000, -1, 0, 0},
      {1, 4000, -1, 0, 0},
      {1, 5000, -1, 0, 0},
      {1, 0, -1, 0, 0},
      {2, 0, -1, 0, 0},
      {2, 0, -1, 0, 0},
      {2, 0, -1, 0, 0}
   };
   public short g = -1;
   public short[] h = null;
   public String i = null;
   public String j = null;
   public int k = 1;
   public byte l = -1;

   private m() {
   }

   public final void a(DataOutputStream var1) throws Exception {
      o.a(this.h, var1);
      var1.writeShort(this.g);
      var1.writeByte(this.l);
      var1.writeInt(this.k);
   }

   public final void a(DataInputStream var1) throws Exception {
      this.h = o.b(var1);
      this.g = var1.readShort();
      this.l = var1.readByte();
      this.k = var1.readInt();
      this.i = a[this.g];
      this.j = b[this.g];
   }

   public static final m a(int var0) {
      if (var0 >= 0 && var0 < f.length) {
         m var1;
         (var1 = new m()).g = (short)var0;
         var1.i = a[var0];
         var1.j = b[var0];
         var1.h = new short[5];

         for(int var2 = 0; var2 < f[var0].length; ++var2) {
            var1.h[var2] = f[var0][var2];
         }

         var1.l = (byte)var1.h[0];
         var1.k = 1;
         return var1;
      } else {
         System.out.println("error:Drug->produceDrug(int id):id is error!");
         return null;
      }
   }

   public final int a() {
      return this.h[1];
   }

   public final void a(aa var1) {
      var1.a(0, this.i + "+1");
      w.a(this, 1);
      if (ai.f[12] >= 50 && ai.f[12] < 99 && this.g == 11) {
         w.a(11, -50);
         ai.a(12, (byte)99, 1);
      } else if (ai.f[12] > 0 && ai.f[12] < 99 && this.g == 11) {
         ai.a(12, (byte)1, 0);
      } else if (ai.f[13] >= 3 && ai.f[13] < 99 && this.g == 20) {
         w.a(20, -3);
         ai.a(13, (byte)99, 1);
      } else if (ai.f[13] > 0 && ai.f[13] < 99 && this.g == 20) {
         ai.a(13, (byte)1, 0);
      } else if (ai.f[16] >= 50 && ai.f[16] < 99 && this.g == 15) {
         w.a(15, -50);
         ai.a(16, (byte)99, 1);
      } else if (ai.f[16] > 0 && ai.f[16] < 99 && this.g == 15) {
         ai.a(16, (byte)1, 0);
      } else if (ai.f[21] >= 3 && ai.f[21] < 99 && this.g == 18) {
         w.a(18, -3);
         ai.a(21, (byte)99, 1);
      } else if (ai.f[21] > 0 && ai.f[21] < 99 && this.g == 18) {
         ai.a(21, (byte)1, 0);
      } else if (ai.f[25] >= 20 && ai.f[25] < 99 && this.g == 13) {
         w.a(13, -20);
         ai.a(25, (byte)99, 1);
      } else if (ai.f[25] > 0 && ai.f[25] < 99 && this.g == 13) {
         ai.a(25, (byte)1, 0);
      } else if (ai.f[27] >= 20 && ai.f[27] < 99 && this.g == 17) {
         w.a(17, -20);
         ai.a(27, (byte)99, 1);
      } else if (ai.f[27] > 0 && ai.f[27] < 99 && this.g == 17) {
         ai.a(27, (byte)1, 0);
      } else if (ai.f[29] >= 3 && ai.f[29] < 99 && this.g == 19) {
         w.a(19, -3);
         ai.a(29, (byte)99, 1);
      } else {
         if (ai.f[29] > 0 && ai.f[29] < 99 && this.g == 19) {
            ai.a(29, (byte)1, 0);
         }
      }
   }

   public final void b(aa var1) {
      if (this.l == 0 && this.h[2] >= 0) {
         if (this.h[2] < 2) {
            this.h[3] = this.h[2] == 0 ? (short)(av.t.W[6] * 3 / 10) : (short)(av.t.W[8] * 3 / 10);
            var1.a(0, e[this.h[2]] + this.h[3]);
            av.c(1, 4);
         }

         var1.W[d[this.h[2]]] += this.h[3];
         var1.e(this.g, b(this.g));
         var1.u();
         var1.h();
      }
   }

   public static final int b(int var0) {
      return f[var0][4] * ae.b;
   }

   public final void a(int var1, int var2) {
      if (m == null) {
         m = new n();
      }

      m.c = 58;
      m.d = 1;
      m.e = this.g;
      if (m.e > 25) {
         System.out.println("[Error] :== the actionid is over the maximal num. actionid = " + this.g);
      } else {
         m.b(var1, var2);
      }
   }

   public final void a(short[] var1) {
      this.a(var1[0] + (var1[2] >> 1), var1[1] + (var1[3] >> 1));
   }

   public static final void b() {
      if (m != null) {
         m.h();
      }
   }

   static {
      short[][][] var10000 = new short[][][]{
         {{50, 3}, {50, 6}, {50, 9}, {50, 14}},
         {{2, 15}, {5, 30}, {10, 50}, {15, 80}},
         {{0, 2}, {0, 3}, {0, 5}, {0, 8}},
         {{0, -2}, {0, -4}, {0, -6}, {0, -11}},
         {{-1, -8}, {-3, -15}, {-6, -30}, {-10, -60}},
         {{0, -1}, {0, -2}, {0, -3}, {0, -6}}
      };
      String[] var0 = new String[]{
         "降低50%的速度，持续3秒",
         "降低50%的速度，持续6秒",
         "降低50%的速度，持续9秒",
         "降低50%的速度，持续14秒",
         "使主角眩晕2秒",
         "使主角眩晕3秒",
         "使主角眩晕5秒",
         "使主角眩晕8秒",
         "使主角每秒中毒2点血，持续15秒",
         "使主角每秒中毒5点血，持续30秒",
         "使主角每秒中毒10点血，持续50秒",
         "使主角每秒中毒15点血，持续80秒",
         "原效果减2点时间",
         "原效果减4点时间",
         "原效果减6点时间",
         "原效果减11点时间",
         "原效果减1点时间",
         "原效果减2点时间",
         "原效果减3点时间",
         "原效果减6点时间",
         "原效果减1点伤害，6点时间",
         "原效果减3点伤害，15点时间",
         "原效果减6点伤害，30点时间",
         "原效果减10点伤害，60点时间"
      };
   }
}
