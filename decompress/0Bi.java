// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 0Bi implements Runnable
{
    public final /* synthetic */ 15i LIZ;
    
    static {
        Covode.recordClassIndex(1225);
    }
    
    public 0Bi(final 15i liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void run() {
        final 15i liz = this.LIZ;
        if (liz.LIZIZ == 0) {
            liz.LIZJ = true;
            liz.LJFF.LIZ(0CC.a.ON_PAUSE);
        }
        this.LIZ.LIZIZ();
    }
}
