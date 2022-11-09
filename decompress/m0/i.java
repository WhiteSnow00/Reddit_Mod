// 
// Decompiled by Procyon v0.6.0
// 

package m0;

import d2.e;
import androidx.compose.foundation.FocusedBoundsKt;
import d2.d;
import ah2.f;
import pg2.j;
import zg2.l;
import c2.x;
import d2.b;

public final class i implements b, x
{
    public l<? super c2.l, j> f;
    public c2.l g;
    
    @Override
    public final void C(c2.l g) {
        ah2.f.f((Object)g, "coordinates");
        this.g = g;
        if (g.isAttached()) {
            g = this.g;
            if (g != null && g.isAttached()) {
                final l<? super c2.l, j> f = this.f;
                if (f != null) {
                    f.invoke((Object)this.g);
                }
            }
        }
        else {
            final l<? super c2.l, j> f2 = this.f;
            if (f2 != null) {
                f2.invoke((Object)null);
            }
        }
    }
    
    @Override
    public final void C0(final d2.d d) {
        ah2.f.f((Object)d, "scope");
        final l f = (l)d.a((e)FocusedBoundsKt.a);
        if (f == null) {
            final l<? super c2.l, j> f2 = this.f;
            if (f2 != null) {
                f2.invoke((Object)null);
            }
        }
        this.f = (l<? super c2.l, j>)f;
    }
}
