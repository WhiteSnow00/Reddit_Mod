// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 084
{
    public int LIZ;
    public int LIZIZ;
    
    static {
        Covode.recordClassIndex(857);
    }
    
    public final int LIZ() {
        return this.LIZ | this.LIZIZ;
    }
    
    public final void LIZ(final int n) {
        if (n == 1) {
            this.LIZIZ = 0;
            return;
        }
        this.LIZ = 0;
    }
    
    public final void LIZ(final int n, final int n2) {
        if (n2 == 1) {
            this.LIZIZ = n;
            return;
        }
        this.LIZ = n;
    }
}
