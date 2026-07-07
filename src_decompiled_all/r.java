import java.io.DataOutputStream;

public final class r extends x {
   public int a;
   public boolean b = false;

   public r(int var1) {
      this.a = var1;
   }

   public final boolean d() {
      if (this.a == 0 && this.N()) {
         return false;
      } else {
         if (this.a == 1 && av.aq != this) {
            aa var1 = av.t;
            short[] var2 = this.M();
            if (this.b || o.a(var1.V[8], var1.V[9], var2[0], var2[1], var2[2], var2[3])) {
               if (av.aq != null && av.aq != this) {
                  av.aq.ay = -1;
                  this.k(x.Q);
               }

               av.ai = av.e(super.V[1]);
               av.aq = this;
               av.aj = -1;

               for(int var3 = 0; var3 < 1; ++var3) {
                  if (av.r[var3].m(x.H)) {
                     av.r[var3].a((short)0);
                  }
               }

               a.a();
            }
         }

         return true;
      }
   }

   public final void a(DataOutputStream var1) {
   }
}
