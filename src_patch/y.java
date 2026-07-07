import java.io.DataInputStream;

public final class y {
   public static short a;
   public static y[] b;
   public byte c;
   public String d;
   public short e;
   public byte[] f = new byte[15];

   public y() {
      this.e = 0;

      for(int var1 = 0; var1 < 15; ++var1) {
         this.f[var1] = -1;
      }
   }

   public static final void a(DataInputStream var0) throws Exception {
      b = new y[10];
      short var1;
      if ((var1 = var0.readShort()) > 10) {
         throw new Exception(">>CẢNH BÁO: Số lượng nhóm nhiệm vụ vượt giới hạn! Giới hạn: 10, Hiện tại: " + var1);
      } else {
         for(int var2 = 0; var2 < var1; ++var2) {
            y var3;
            (var3 = b[a++] = new y()).c = var0.readByte();
            var3.d = var0.readUTF();
            var0.readUTF();
            short var4;
            if ((var4 = var0.readShort()) > 15) {
               throw new Exception(">>CẢNH BÁO: Số lượng nhiệm vụ vượt giới hạn nhóm! Giới hạn: 15, Hiện tại: " + var4 + "; Nhóm id=" + var3.c + ", Tên nhóm=" + var3.d);
            }

            for(int var5 = 0; var5 < var4; ++var5) {
               var3.f[var3.e++] = var0.readByte();
            }
         }
      }
   }
}
