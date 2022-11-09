// 
// Decompiled by Procyon v0.6.0
// 

package m0;

import d2.e;
import androidx.compose.foundation.FocusedBoundsKt;
import d2.d;
import ah2.f;
import zg2.l;
import d2.c;
import d2.b;

public final class j implements b, c<l<? super c2.l, ? extends pg2.j>>, l<c2.l, pg2.j>
{
    public final l<c2.l, pg2.j> f;
    public l<? super c2.l, pg2.j> g;
    public c2.l h;
    
    public j(final l<? super c2.l, pg2.j> f) {
        ah2.f.f((Object)f, "handler");
        this.f = (l<c2.l, pg2.j>)f;
    }
    
    @Override
    public final void C0(final d2.d d) {
        ah2.f.f((Object)d, "scope");
        final l g = (l)d.a((e)FocusedBoundsKt.a);
        if (!ah2.f.a((Object)g, (Object)this.g)) {
            this.g = (l<? super c2.l, pg2.j>)g;
        }
    }
    
    @Override
    public final e<l<c2.l, pg2.j>> getKey() {
        return FocusedBoundsKt.a;
    }
    
    @Override
    public final Object getValue() {
        return this;
    }
    
    public final Object invoke(final Object o) {
        final c2.l h = (c2.l)o;
        this.h = h;
        this.f.invoke((Object)h);
        final l<? super c2.l, pg2.j> g = this.g;
        if (g != null) {
            g.invoke((Object)h);
        }
        return pg2.j.a;
    }
}
