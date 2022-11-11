// 
// Decompiled by Procyon v0.6.0
// 

package m0;

import androidx.compose.foundation.lazy.layout.PinnableParentKt;
import sg2.e;
import d2.d;
import hg2.j;
import s0.k;
import rg2.l;
import d2.b;

public final class q implements b
{
    public final l<k, j> f;
    
    public q(final l<? super k, j> f) {
        this.f = (l<k, j>)f;
    }
    
    public final void F0(final d d) {
        e.f((Object)d, "scope");
        this.f.invoke((k)d.a((d2.e)PinnableParentKt.a));
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof q && e.a((Object)((q)o).f, (Object)this.f);
    }
    
    @Override
    public final int hashCode() {
        return this.f.hashCode();
    }
}
