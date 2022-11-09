// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 1B5 implements 0Ik
{
    public long LIZ;
    
    static {
        Covode.recordClassIndex(2170);
    }
    
    public 1B5() {
        this.LIZ = -1L;
    }
    
    @Override
    public final void LIZ() {
        if (this.LIZ == -1L) {
            this.LIZ = System.nanoTime();
            return;
        }
        throw new IllegalStateException("Timer was already started");
    }
    
    @Override
    public final void LIZIZ() {
        if (this.LIZ != -1L) {
            System.nanoTime();
            this.LIZ = -1L;
            return;
        }
        throw new IllegalStateException("Timer was not started");
    }
}
