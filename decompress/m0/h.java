// 
// Decompiled by Procyon v0.6.0
// 

package m0;

import androidx.compose.foundation.FocusedBoundsKt;
import d2.d;
import sg2.e;
import hg2.j;
import rg2.l;
import c2.x;
import d2.b;

public final class h implements d2.b, x
{
    public l<? super c2.l, j> f;
    public c2.l g;
    
    public final void E(c2.l g) {
        e.f((Object)g, "coordinates");
        this.g = g;
        if (g.isAttached()) {
            g = this.g;
            if (g != null && g.isAttached()) {
                final l<? super c2.l, j> f = this.f;
                if (f != null) {
                    f.invoke(this.g);
                }
            }
        }
        else {
            final l<? super c2.l, j> f2 = this.f;
            if (f2 != null) {
                f2.invoke(null);
            }
        }
    }
    
    public final void F0(final d2.d d) {
        e.f((Object)d, "scope");
        final l f = (l)d.a(FocusedBoundsKt.a);
        if (f == null) {
            final l<? super c2.l, j> f2 = this.f;
            if (f2 != null) {
                f2.invoke(null);
            }
        }
        this.f = f;
    }
}
