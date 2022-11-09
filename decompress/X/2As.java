// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 2As extends F2X
{
    public final 0C4 LIZ;
    
    static {
        Covode.recordClassIndex(1221);
    }
    
    public 2As() {
        this.LIZ = new 0C4();
    }
    
    public final void dispatch(final F2r f2r, final Runnable runnable) {
        CTM.LIZ((Object)f2r, (Object)runnable);
        final 0C4 liz = this.LIZ;
        CTM.LIZ((Object)runnable);
        final EVx liz2 = EiD.LIZIZ.LIZ();
        if (((F2X)liz2).isDispatchNeeded((F2r)F2s.INSTANCE)) {
            ((F2X)liz2).dispatch((F2r)F2s.INSTANCE, (Runnable)new 0C3(liz, runnable));
            return;
        }
        liz.LIZ(runnable);
    }
}
