// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.ArrayDeque;
import com.bytedance.covode.number.Covode;
import java.util.Queue;

public final class 0C4
{
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final Queue<Runnable> LIZLLL;
    
    static {
        Covode.recordClassIndex(1258);
    }
    
    public 0C4() {
        this.LIZ = true;
        this.LIZLLL = new ArrayDeque<Runnable>();
    }
    
    public final void LIZ() {
        if (this.LIZJ) {
            return;
        }
        try {
            this.LIZJ = true;
            while ((this.LIZLLL.isEmpty() ^ true) && (this.LIZIZ || !this.LIZ)) {
                final Runnable runnable = this.LIZLLL.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        finally {
            this.LIZJ = false;
        }
    }
    
    public final void LIZ(final Runnable runnable) {
        if (this.LIZLLL.offer(runnable)) {
            this.LIZ();
            return;
        }
        throw new IllegalStateException("cannot enqueue any more runnables".toString());
    }
}
