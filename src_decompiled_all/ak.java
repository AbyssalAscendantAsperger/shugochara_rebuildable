import javax.microedition.lcdui.Image;

public final class ak {
   public static Image a = null;
   public static Image b = null;

   public static final void a() {
      if (a == null) {
         try {
            a = Image.createImage("/bin/blue.png");
         } catch (Exception var1) {
         }
      }

      if (b == null) {
         try {
            b = Image.createImage("/bin/red.png");
            return;
         } catch (Exception var2) {
         }
      }
   }
}
