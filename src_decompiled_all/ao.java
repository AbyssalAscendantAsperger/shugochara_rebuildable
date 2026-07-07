public final class ao {
   public static final String a(String var0, String var1) {
      var1 = var1;
      int[] var2 = new int[var0.length()];
      String var3 = "";
      String var4 = "";
      int var5 = 0;

      for(int var6 = 0; var5 < var0.length(); ++var6) {
         if (var6 == var1.length()) {
            var6 = 0;
         }

         var2[var5] = var0.charAt(var5) ^ var1.charAt(var6);
         ++var5;
      }

      for(int var8 = 0; var8 < var0.length(); ++var8) {
         if (var2[var8] < 10) {
            var4 = "000" + var2[var8];
         } else if (var2[var8] < 100) {
            var4 = "00" + var2[var8];
         } else if (var2[var8] < 1000) {
            var4 = "0" + var2[var8];
         }

         var3 = var3 + var4;
      }

      return var3;
   }
}
