// 
// Decompiled by Procyon v0.6.0
// 

package od;

import te.l;
import java.lang.ref.WeakReference;
import te.d;

public final class e0 extends d
{
    public final WeakReference<h0> a;
    
    public e0(final h0 h0) {
        this.a = new WeakReference<h0>(h0);
    }
    
    public final void M(final l l) {
        final h0 h0 = this.a.get();
        if (h0 == null) {
            return;
        }
        h0.a.i(new d0(h0, h0, l));
    }
}
