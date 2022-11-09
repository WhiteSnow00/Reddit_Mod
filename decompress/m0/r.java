// 
// Decompiled by Procyon v0.6.0
// 

package m0;

import d2.e;
import androidx.compose.foundation.lazy.layout.PinnableParentKt;
import ah2.f;
import d2.d;
import pg2.j;
import s0.k;
import zg2.l;
import d2.b;

public final class r implements b
{
    public final l<k, j> f;
    
    public r(final l<? super k, j> f) {
        this.f = (l<k, j>)f;
    }
    
    @Override
    public final void C0(final d2.d d) {
        ah2.f.f((Object)d, "scope");
        this.f.invoke(d.a((e)PinnableParentKt.a));
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof r && ah2.f.a((Object)((r)o).f, (Object)this.f);
    }
    
    @Override
    public final int hashCode() {
        return this.f.hashCode();
    }
}
