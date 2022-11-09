// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public class 00r<T>
{
    public volatile boolean LIZ;
    public volatile boolean LIZIZ;
    public volatile T LIZJ;
    
    static {
        Covode.recordClassIndex(80);
    }
    
    private T LIZJ() {
        if (this.LIZIZ) {
            return this.LIZJ;
        }
        synchronized (this) {
            if (this.LIZIZ) {
                return this.LIZJ;
            }
            this.LIZJ = this.LIZ();
            this.LIZIZ = true;
            return this.LIZJ;
        }
    }
    
    public T LIZ() {
        return null;
    }
    
    public final void LIZ(final T lizj) {
        this.LIZJ = lizj;
        this.LIZ = true;
    }
    
    public final T LIZIZ() {
        if (this.LIZJ != null) {
            return this.LIZJ;
        }
        return this.LIZJ();
    }
}
