import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class CMIDlet extends MIDlet {
   public static CMIDlet a;
   public static av b;

   public CMIDlet() {
      a = this;
   }

   public final void startApp() {
      if (b == null) {
         b = av.q();
      }

      Display.getDisplay(a).setCurrent(b);
   }

   public final void pauseApp() {
   }

   public final void destroyApp(boolean var1) {
      av.b();
   }
}
