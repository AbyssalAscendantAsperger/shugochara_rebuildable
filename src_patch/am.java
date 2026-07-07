import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

public final class am implements PlayerListener {
   private static final int c = av.P.length;
   private static am d = null;
   private static Player e;
   public static int a;
   public static boolean b = false;
   private static String[] f = null;
   private static Player g = null;
   private static short h = 100;

   public am() {
      a = -1;
      d = this;
   }

   public static final boolean a() {
      return g == null;
   }

   private static String a(String var0) {
      if (var0.endsWith("amr")) {
         return "audio/amr";
      } else if (var0.endsWith("mid")) {
         return "audio/midi";
      } else if (var0.endsWith("wav")) {
         return "audio/wav";
      } else if (var0.endsWith("aac")) {
         return "audio/3gp";
      } else {
         return var0.endsWith("mp3") ? "audio/mpeg" : "";
      }
   }

   public static final void a(String[] var0) {
      f = var0;
   }

   public static final Player a(int var0) {
      try {
         g = Manager.createPlayer(f[var0].getClass().getResourceAsStream(f[var0]), a(f[var0]));
         g.realize();
         g.addPlayerListener(d);
         g.setLoopCount(-1);
         g.prefetch();
         return g;
      } catch (Exception var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public static final void b(int var0) {
      h = 100;
      a(var0, -1);
      c(h);
   }

   public static final void c(int var0) {
      Object var1 = null;
      VolumeControl var2;
      if ((var2 = (VolumeControl)e.getControl("VolumeControl")) != null) {
         var2.setLevel(var0);
      }
   }

   public static final void b() {
      if (e != null) {
         if (e.getState() == 400) {
            try {
               e.stop();
               a = -1;
            } catch (IllegalStateException var1) {
               var1.printStackTrace();
            } catch (MediaException var2) {
               var2.printStackTrace();
            }

            e.close();
         }

         e = null;
      }
   }

   public static final boolean c() {
      return f == null;
   }

   public static final void d() {
      b(0);
   }

   public static final void a(int var0, int var1) {
      if (0 <= var0 && var0 <= c - 1) {
         try {
            if (e == null || var0 != a || e.getState() != 400) {
               if (e != null && var0 != a) {
                  b();
               }

               e = a(var0);
               a = var0;
               e.setLoopCount(var1);
               e.getControls();
               boolean var3 = false;
               c(h);
               e.start();
            }
         } catch (Exception var4) {
            var4.printStackTrace();
         }
      }
   }

   public static final void a(String var0, int var1) {
      try {
         try {
            g = Manager.createPlayer(var0.getClass().getResourceAsStream(var0), a(var0));
            g.realize();
            g.addPlayerListener(d);
            g.setLoopCount(-1);
            g.prefetch();
         } catch (Exception var4) {
            var4.printStackTrace();
         }

         e = g;
         a = -1;
         e.setLoopCount(var1);
         h = 100;
         e.getControls();
         boolean var3 = false;
         c(h);
         e.start();
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   public static final void e() {
      h = 0;
      a(0, -1);
      c(h);
   }

   public final void playerUpdate(Player var1, String var2, Object var3) {
      if (var2.equals("endOfMedia") || var2.equals("stopped")) {
         try {
            var1.setMediaTime(0L);
            return;
         } catch (Exception var5) {
         }
      }
   }

   static {
      String[][] var10000 = new String[][]{{"mid", "audio/midi"}, {"amr", "audio/amr"}, {"wav", "audio/x-wav"}, {"aac", "audio/3gp"}};
   }
}
