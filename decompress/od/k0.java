// 
// Decompiled by Procyon v0.6.0
// 

package od;

import java.lang.ref.WeakReference;
import android.support.v4.media.b;

public final class k0 extends b
{
    public final WeakReference<l0> f;
    
    public k0(final l0 l0) {
        this.f = new WeakReference<l0>(l0);
    }
    
    public final void a1() {
        final l0 l0 = this.f.get();
        if (l0 == null) {
            return;
        }
        l0.g.lock();
        try {
            if (l0.n) {
                l0.k();
            }
        }
        finally {
            l0.g.unlock();
        }
    }
}
