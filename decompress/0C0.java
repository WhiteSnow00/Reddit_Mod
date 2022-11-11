// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 0C0 implements Runnable
{
    public final /* synthetic */ 0C2 LIZ;
    
    static {
        Covode.recordClassIndex(1256);
    }
    
    public 0C0(final 0C2 liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void run() {
        while (true) {
            if (!this.LIZ.LIZLLL.compareAndSet(false, true)) {
                return;
            }
            Object liz = null;
            boolean b = false;
            try {
                while (this.LIZ.LIZJ.compareAndSet(true, false)) {
                    liz = this.LIZ.LIZ();
                    b = true;
                }
                if (b) {
                    this.LIZ.LIZIZ.postValue((T)liz);
                }
                this.LIZ.LIZLLL.set(false);
                if (!b || !this.LIZ.LIZJ.get()) {
                    return;
                }
                continue;
            }
            finally {
                this.LIZ.LIZLLL.set(false);
            }
        }
    }
}
