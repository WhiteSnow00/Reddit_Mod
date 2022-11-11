// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class 0a5
{
    @c(LIZ = "enable_live_audio")
    public boolean LIZ;
    @c(LIZ = "enable_live_third_party")
    public boolean LIZIZ;
    @c(LIZ = "enable_live_screenshot")
    public boolean LIZJ;
    @c(LIZ = "toast")
    public a LIZLLL;
    
    static {
        Covode.recordClassIndex(5478);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof 0a5) {
            final boolean liz = this.LIZ;
            final 0a5 0a5 = (0a5)o;
            if (liz == 0a5.LIZ && this.LIZIZ == 0a5.LIZIZ && this.LIZJ == 0a5.LIZJ) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return super.hashCode();
    }
    
    public static final class a
    {
        @c(LIZ = "new_anchor")
        public boolean LIZ;
        
        static {
            Covode.recordClassIndex(5479);
        }
    }
}
