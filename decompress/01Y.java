// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public abstract class 01Y
{
    static {
        Covode.recordClassIndex(191);
    }
    
    public abstract void LIZ(final Runnable p0);
    
    public abstract void LIZIZ(final Runnable p0);
    
    public abstract boolean LIZIZ();
    
    public final void LIZJ(final Runnable runnable) {
        if (this.LIZIZ()) {
            runnable.run();
            return;
        }
        this.LIZIZ(runnable);
    }
}
