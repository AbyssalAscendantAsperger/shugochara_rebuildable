public final class z {
   public static final byte a(int var0, int var1, int var2) {
      return a(o.c(var0, var1), var2);
   }

   public static final byte a(int var0, int var1) {
      switch(var1) {
         case 0:
            if (var0 > 64 && var0 <= 192) {
               return 1;
            }

            return 0;
         case 1:
            if (32 <= var0 && var0 <= 96) {
               return 3;
            } else if (96 < var0 && var0 <= 160) {
               return 1;
            } else {
               if (160 < var0 && var0 <= 224) {
                  return 2;
               }

               return 0;
            }
         case 2:
            if (16 < var0 && var0 <= 48) {
               return 6;
            } else if (48 < var0 && var0 <= 80) {
               return 3;
            } else if (80 < var0 && var0 <= 112) {
               return 7;
            } else if (112 < var0 && var0 <= 144) {
               return 1;
            } else if (144 < var0 && var0 <= 176) {
               return 5;
            } else if (176 < var0 && var0 <= 208) {
               return 2;
            } else {
               if (208 < var0 && var0 <= 240) {
                  return 4;
               }

               return 0;
            }
         case 3:
            if (8 < var0 && var0 <= 24) {
               return 12;
            } else if (24 < var0 && var0 <= 40) {
               return 6;
            } else if (40 < var0 && var0 <= 56) {
               return 10;
            } else if (56 < var0 && var0 <= 72) {
               return 3;
            } else if (72 < var0 && var0 <= 88) {
               return 15;
            } else if (88 < var0 && var0 <= 104) {
               return 7;
            } else if (104 < var0 && var0 <= 120) {
               return 13;
            } else if (120 < var0 && var0 <= 136) {
               return 1;
            } else if (136 < var0 && var0 <= 152) {
               return 9;
            } else if (152 < var0 && var0 <= 168) {
               return 5;
            } else if (168 < var0 && var0 <= 184) {
               return 11;
            } else if (184 < var0 && var0 <= 200) {
               return 2;
            } else if (200 < var0 && var0 <= 216) {
               return 14;
            } else if (216 < var0 && var0 <= 232) {
               return 4;
            } else {
               if (232 < var0 && var0 <= 248) {
                  return 8;
               }

               return 0;
            }
         default:
            return -1;
      }
   }

   public static final byte a(int var0) {
      switch(var0) {
         case 0:
            return 1;
         case 1:
            return 0;
         case 2:
            return 3;
         case 3:
            return 2;
         case 4:
            return 7;
         case 5:
            return 6;
         case 6:
            return 5;
         case 7:
            return 4;
         case 8:
            return 13;
         case 9:
            return 12;
         case 10:
            return 11;
         case 11:
            return 10;
         case 12:
            return 9;
         case 13:
            return 8;
         case 14:
            return 15;
         case 15:
            return 14;
         default:
            return -1;
      }
   }

   public static final byte a(byte var0) {
      switch(var0) {
         case 0:
         case 8:
         case 12:
            return 8;
         case 1:
         case 9:
         case 13:
            return 4;
         case 2:
         case 11:
         case 14:
            return 1;
         case 3:
         case 10:
         case 15:
            return 2;
         case 4:
            return 9;
         case 5:
            return 5;
         case 6:
            return 10;
         case 7:
            return 6;
         default:
            return -1;
      }
   }

   private z() {
   }

   public static final byte b(int var0) {
      int var1 = 0;
      switch(var0) {
         case 0:
            o.b(0, 1);
         case 1:
            o.b(0, 3);
         case 2:
            o.b(0, 7);
         case 3:
            var1 = o.b(0, 15);
         default:
            return (byte)var1;
      }
   }

   static {
      short[] var10000 = new short[]{0, 128, 192, 64, 224, 160, 32, 96, 240, 144, 48, 176, 16, 112, 208, 80};
   }
}
