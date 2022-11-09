// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class 0GJ
{
    public final AtomicBoolean LIZ;
    public final 0GE LIZIZ;
    public volatile 168 LIZJ;
    
    static {
        Covode.recordClassIndex(1726);
    }
    
    public 0GJ(final 0GE liziz) {
        this.LIZ = new AtomicBoolean(false);
        this.LIZIZ = liziz;
    }
    
    private 168 LIZJ() {
        return this.LIZIZ.LIZ(this.LIZ());
    }
    
    public abstract String LIZ();
    
    public final void LIZ(final 168 168) {
        if (168 == this.LIZJ) {
            this.LIZ.set(false);
        }
    }
    
    public final 168 LIZIZ() {
        this.LIZIZ.LIZJ();
        168 168;
        if (this.LIZ.compareAndSet(false, true)) {
            if (this.LIZJ == null) {
                this.LIZJ = this.LIZJ();
            }
            168 = this.LIZJ;
        }
        else {
            168 = this.LIZJ();
        }
        return 168;
    }
}
