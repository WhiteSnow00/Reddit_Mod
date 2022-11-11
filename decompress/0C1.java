// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 0C1 implements Runnable
{
    public final /* synthetic */ 0C2 LIZ;
    
    static {
        Covode.recordClassIndex(1257);
    }
    
    public 0C1(final 0C2 liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void run() {
        final boolean hasActiveObservers = this.LIZ.LIZIZ.hasActiveObservers();
        if (this.LIZ.LIZJ.compareAndSet(false, true) && hasActiveObservers) {
            this.LIZ.LIZ.execute(this.LIZ.LJ);
        }
    }
}
