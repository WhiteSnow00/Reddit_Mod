// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 1P7 extends 9Mp
{
    public String LIZ;
    public int LIZIZ;
    
    static {
        Covode.recordClassIndex(7387);
    }
    
    public 1P7(final String liz, final int liziz) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final void LIZ(final String liz) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
    }
    
    public final Object[] getObjects() {
        return new Object[] { this.LIZ, this.LIZIZ };
    }
}
