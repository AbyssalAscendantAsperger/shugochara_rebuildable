import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;

public final class ap {
   public static boolean a = false;
   private static int c = 40000;
   private String d;
   private String e;
   private Hashtable f;
   private byte[] g;
   public static HttpConnection b = null;
   private static OutputStream h = null;
   private static InputStream i = null;

   private ap(String var1, String var2, byte[] var3, Hashtable var4, int var5) {
      this.d = var1;
      this.e = var2.toUpperCase();
      this.g = null;
      this.f = var4;
      c = var5;
   }

   public ap(String var1, String var2, String var3, Hashtable var4, int var5) {
      this.d = var1;
      this.e = var2.toUpperCase();
      if (var3 != null && !var3.equals("")) {
         if ("GET".equals(this.e)) {
            if (var1.indexOf("?") >= 0) {
               this.d = this.d + "&" + var3;
            } else {
               this.d = this.d + "?" + var3;
            }
         } else {
            try {
               this.g = var3.getBytes("UTF-8");
            } catch (Exception var6) {
               this.g = var3.getBytes();
            }
         }
      }

      this.f = var4;
      c = var5;
   }

   public static final Hashtable a(ap var0, boolean var1, String var2) {
      if (var0 == null) {
         return null;
      } else {
         String var3 = var0.d;
         if (var0.d != null && !"".equals(var3.trim())) {
            String var4 = var0.e;
            Hashtable var5 = var0.f;
            byte[] var6 = var0.g;
            String var8 = null;
            if (var3.toLowerCase().startsWith("http://")) {
               var8 = var3.substring(7);
            }

            int var7;
            if ((var7 = var8.indexOf(47)) > 0) {
               var8.substring(var7);
               var8 = var8.substring(0, var7);
            } else {
               var8 = var8;
            }

            if ((var7 = var8.indexOf(":")) >= 0) {
               var8.substring(var7 + 1);
               var8.substring(0, var7);
            }

            a = true;
            new ar(c).start();
            if ("POST".equals(var4)) {
               b = (HttpConnection)Connector.open(var3, 3, true);
            } else {
               b = (HttpConnection)Connector.open(var3, 1, true);
            }

            b.setRequestMethod(var4);
            b.setRequestProperty("Connection", "close");
            if (var5 != null) {
               Enumeration var30 = var5.keys();

               while(var30.hasMoreElements()) {
                  var3 = (String)var30.nextElement();
                  String var27 = (String)var5.get(var3);
                  b.setRequestProperty(var3, var27);
               }
            }

            if (var2 != null && !"".equals(var2.trim())) {
               b.setRequestProperty("Referer", var2);
            }

            if ("POST".equals(var4) && var6 != null) {
               b.setRequestProperty("Content-Length", String.valueOf(var6.length));
               (h = b.openOutputStream()).write(var6);
               h.close();
            }

            int var22 = b.getResponseCode();
            Hashtable var20;
            (var20 = new Hashtable()).put("respCode", new Integer(var22));
            String var28;
            if ((var28 = b.getHeaderField("Content-Type")) != null) {
               var20.put("contType", var28);
            }

            if (var22 != 200 && var22 != 302 && var22 != 301) {
               if (b != null) {
                  try {
                     b.close();
                  } catch (Exception var9) {
                     var9.printStackTrace();
                  }
               }

               a = false;
               return var20;
            } else if (var22 != 302 && var22 != 301) {
               try {
                  i = b.openInputStream();
                  var8 = b.getHeaderField("content-length");

                  try {
                     var18 = Integer.parseInt(var8);
                  } catch (Exception var14) {
                     var18 = -1;
                  }

                  ByteArrayOutputStream var19 = new ByteArrayOutputStream();
                  int var23;
                  if (var18 > 0) {
                     for(int var24 = 0; var24 < var18 && (var22 = i.read()) >= 0; ++var24) {
                        var19.write(var22);
                     }
                  } else {
                     while((var23 = i.read()) != -1) {
                        var19.write((byte)var23);
                     }
                  }

                  byte[] var25 = var19.toByteArray();
                  var20.put("data", var25);
                  a = false;
                  var19.close();
                  if (i != null) {
                     try {
                        i.close();
                     } catch (Exception var13) {
                     }
                  }

                  if (b != null) {
                     try {
                        b.close();
                     } catch (Exception var12) {
                     }
                  }
               } catch (Exception var16) {
                  var16.printStackTrace();
                  return null;
               }

               if (i != null) {
                  try {
                     i.close();
                  } catch (Exception var11) {
                  }
               }

               if (b != null) {
                  try {
                     b.close();
                  } catch (Exception var10) {
                  }
               }

               return var20;
            } else if ((var8 = b.getHeaderField("Location")) != null && !"".equals(var8.trim())) {
               Hashtable var17 = a(new ap(var8, "GET", null, var0.f, c), var1, var0.d);
               if (b != null) {
                  try {
                     b.close();
                  } catch (Exception var15) {
                  }
               }

               return var17;
            } else {
               throw new Exception("WapPay.sendHttpRequest() " + var22 + " Jump==> conn.getRequestProperty(\"Location\") ==null ");
            }
         } else {
            return null;
         }
      }
   }
}
