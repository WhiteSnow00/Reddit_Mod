// 
// Decompiled by Procyon v0.6.0
// 

package m0;

import androidx.compose.foundation.FocusedBoundsKt;
import d2.d;
import sg2.e;
import hg2.j;
import rg2.l;
import d2.c;
import d2.b;

public final class i implements b, c<l<? super c2.l, ? extends j>>, l<c2.l, j>
{
    public final l<c2.l, j> f;
    public l<? super c2.l, j> g;
    public c2.l h;
    
    public i(final l<? super c2.l, j> f) {
        e.f((Object)f, "handler");
        this.f = (l<c2.l, j>)f;
    }
    
    public final void F0(final d2.d d) {
        e.f((Object)d, "scope");
        final l g = (l)d.a(FocusedBoundsKt.a);
        if (!e.a((Object)g, (Object)this.g)) {
            this.g = g;
        }
    }
    
    public final d2.e<l<c2.l, j>> getKey() {
        return FocusedBoundsKt.a;
    }
    
    public final Object getValue() {
        return this;
    }
    
    public final Object invoke(final Object o) {
        final c2.l h = (c2.l)o;
        this.h = h;
        this.f.invoke(h);
        final l<? super c2.l, j> g = this.g;
        if (g != null) {
            g.invoke(h);
        }
        return j.a;
    }
}
