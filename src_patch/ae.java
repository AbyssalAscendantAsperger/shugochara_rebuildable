import javax.microedition.lcdui.Font;

public final class ae {
   public static int a = 60;
   public static int b = 16;
   public static final Font c = Font.getFont(0, 0, 8);
   public static final Font d = Font.getFont(0, 1, 0);
   public static final Font e = Font.getFont(64, 1, 16);
   public static final short f = (short)(c.getHeight() - 1);
   public static final short g = (short)c.stringWidth("宽");
   private static final short j = (short)c.getBaselinePosition();
   public static final short h = (short)(j - (f >> 1));
   public static String i = " ";

   static {
      short[] var10000 = new short[]{0, 0, 240, 320};
      var10000 = new short[]{0, 0, 240, 160};
      String[] var1 = new String[]{"Game mới", "Chơi tiếp", "Giới thiệu", "Trợ giúp", "Thoát game"};
   }
}
