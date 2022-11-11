// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import ej2.c0;
import lg.e0;
import lw0.b;
import c2.t;
import c2.r;
import c2.u;
import sg2.e;
import hg2.j;
import androidx.compose.ui.platform.n0;
import rg2.l;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.platform.o0;

public final class FillModifier extends o0 implements a
{
    public final Direction g;
    public final float h;
    
    public FillModifier(final Direction g, final float h, final l<? super n0, j> l) {
        e.f((Object)g, "direction");
        super(l);
        this.g = g;
        this.h = h;
    }
    
    public final boolean equals(final Object o) {
        final boolean b = o instanceof FillModifier;
        boolean b2 = true;
        if (b) {
            final Direction g = this.g;
            final FillModifier fillModifier = (FillModifier)o;
            if (g == fillModifier.g && this.h == fillModifier.h) {
                return b2;
            }
        }
        b2 = false;
        return b2;
    }
    
    public final int hashCode() {
        return Float.hashCode(this.h) + this.g.hashCode() * 31;
    }
    
    public final t v(final u u, final r r, final long n) {
        e.f((Object)u, "$this$measure");
        e.f((Object)r, "measurable");
        int n2;
        int j;
        if (u2.a.d(n) && this.g != Direction.Vertical) {
            j = (n2 = e0.v(b.k2(u2.a.h(n) * this.h), u2.a.j(n), u2.a.h(n)));
        }
        else {
            j = u2.a.j(n);
            n2 = u2.a.h(n);
        }
        int n3;
        int i;
        if (u2.a.c(n) && this.g != Direction.Horizontal) {
            i = (n3 = e0.v(b.k2(u2.a.g(n) * this.h), u2.a.i(n), u2.a.g(n)));
        }
        else {
            i = u2.a.i(n);
            n3 = u2.a.g(n);
        }
        final c2.e0 h = r.H(c0.m2(j, n2, i, n3));
        return u.U(u, h.f, h.g, (l)new FillModifier$measure.FillModifier$measure$1(h));
    }
}
