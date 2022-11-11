// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 0K5
{
    public static final 0K5 LIZ;
    public final 04w<String, 0Kp> LIZIZ;
    
    static {
        Covode.recordClassIndex(2340);
        LIZ = new 0K5();
    }
    
    public 0K5() {
        if (!0KM.a.LIZ) {
            this.LIZIZ = new 04w<String, 0Kp>(10485760);
            return;
        }
        if (0KM.a.LJFF && 0KM.e.LIZ) {
            this.LIZIZ = new 04w<String, 0Kp>(12);
            return;
        }
        this.LIZIZ = new 04w<String, 0Kp>(20);
    }
    
    public final 0Kp LIZ(final String s) {
        if (s == null) {
            return null;
        }
        return this.LIZIZ.LIZ(s);
    }
    
    public final void LIZ(final String s, final 0Kp 0Kp) {
        if (s == null) {
            return;
        }
        this.LIZIZ.LIZ(s, 0Kp);
    }
}
