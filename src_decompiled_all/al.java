import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class al {
   private static final short[] g = new short[]{1, 1, 1, 2, 2, 3, 4, 5};
   private static int h = 0;
   public Image a = null;
   public int b = 0;
   public int c = 0;
   public int d = 0;
   public int e = 0;
   public short[] f = null;

   public al(short[] var1) {
      this.f = var1;
      this.a = o.a("spark" + o.a(g));
      this.b = o.b(var1[0], var1[0] + var1[2]);
      this.c = o.b(var1[1], var1[1] + var1[3]);
   }

   public final void a(Graphics var1) {
      if (h++ % 3 == 0) {
         this.d = o.b(-1, 1);
         this.e = o.b(-2, -1);
      }

      if (this.b >= this.f[0] && this.b <= this.f[0] + this.f[2]) {
         this.b += this.d;
      } else {
         this.b = o.b(this.f[0], this.f[0] + this.f[2]);
      }

      if (this.c >= this.f[1] && this.c <= this.f[1] + this.f[3]) {
         this.c += this.e;
      } else {
         this.c = o.b(this.f[1], this.f[1] + this.f[3]);
      }

      var1.drawImage(this.a, this.b, this.c, 3);
   }
}
