// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import c2.i;
import c2.e0;
import mj2.c0;
import c2.t;
import c2.r;
import u2.d;
import ah2.f;
import androidx.compose.ui.node.LayoutNodeWrapper;
import c2.u;
import zg2.l;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.platform.q0;

public final class UnspecifiedConstraintsModifier extends q0 implements a
{
    public final float g;
    public final float h;
    
    public UnspecifiedConstraintsModifier() {
        throw null;
    }
    
    public UnspecifiedConstraintsModifier(final float g, final float h, final l l) {
        super(l);
        this.g = g;
        this.h = h;
    }
    
    public final int c(final u u, final LayoutNodeWrapper layoutNodeWrapper, int s0) {
        f.f((Object)u, "<this>");
        f.f((Object)layoutNodeWrapper, "measurable");
        final int u2 = ((i)layoutNodeWrapper).u(s0);
        if (!d.a(this.h, Float.NaN)) {
            s0 = u.s0(this.h);
        }
        else {
            s0 = 0;
        }
        int n = u2;
        if (u2 < s0) {
            n = s0;
        }
        return n;
    }
    
    public final boolean equals(final Object o) {
        final boolean b = o instanceof UnspecifiedConstraintsModifier;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final float g = this.g;
        final UnspecifiedConstraintsModifier unspecifiedConstraintsModifier = (UnspecifiedConstraintsModifier)o;
        boolean b3 = b2;
        if (d.a(g, unspecifiedConstraintsModifier.g)) {
            b3 = b2;
            if (d.a(this.h, unspecifiedConstraintsModifier.h)) {
                b3 = true;
            }
        }
        return b3;
    }
    
    public final int h(final u u, final LayoutNodeWrapper layoutNodeWrapper, int s0) {
        f.f((Object)u, "<this>");
        f.f((Object)layoutNodeWrapper, "measurable");
        final int c = ((i)layoutNodeWrapper).C(s0);
        if (!d.a(this.h, Float.NaN)) {
            s0 = u.s0(this.h);
        }
        else {
            s0 = 0;
        }
        int n = c;
        if (c < s0) {
            n = s0;
        }
        return n;
    }
    
    public final int hashCode() {
        return Float.hashCode(this.h) + Float.hashCode(this.g) * 31;
    }
    
    public final int k(final u u, final LayoutNodeWrapper layoutNodeWrapper, int s0) {
        f.f((Object)u, "<this>");
        f.f((Object)layoutNodeWrapper, "measurable");
        final int d = ((i)layoutNodeWrapper).D(s0);
        if (!u2.d.a(this.g, Float.NaN)) {
            s0 = u.s0(this.g);
        }
        else {
            s0 = 0;
        }
        int n = d;
        if (d < s0) {
            n = s0;
        }
        return n;
    }
    
    public final t u(final u u, final r r, final long n) {
        f.f((Object)u, "$this$measure");
        f.f((Object)r, "measurable");
        final boolean a = d.a(this.g, Float.NaN);
        final int n2 = 0;
        int j;
        if (!a && u2.a.j(n) == 0) {
            final int s0 = u.s0(this.g);
            final int h = u2.a.h(n);
            int n3;
            if ((n3 = s0) > h) {
                n3 = h;
            }
            if ((j = n3) < 0) {
                j = 0;
            }
        }
        else {
            j = u2.a.j(n);
        }
        final int h2 = u2.a.h(n);
        int i;
        if (!d.a(this.h, Float.NaN) && u2.a.i(n) == 0) {
            final int s2 = u.s0(this.h);
            final int g = u2.a.g(n);
            if ((i = s2) > g) {
                i = g;
            }
            if (i < 0) {
                i = n2;
            }
        }
        else {
            i = u2.a.i(n);
        }
        final e0 k = r.I(c0.a(j, h2, i, u2.a.g(n)));
        return u.E0(u, k.f, k.g, (l)new UnspecifiedConstraintsModifier$measure.UnspecifiedConstraintsModifier$measure$1(k));
    }
    
    public final int y(final u u, final LayoutNodeWrapper layoutNodeWrapper, int s0) {
        f.f((Object)u, "<this>");
        f.f((Object)layoutNodeWrapper, "measurable");
        final int f = ((i)layoutNodeWrapper).F(s0);
        if (!d.a(this.g, Float.NaN)) {
            s0 = u.s0(this.g);
        }
        else {
            s0 = 0;
        }
        int n = f;
        if (f < s0) {
            n = s0;
        }
        return n;
    }
}
