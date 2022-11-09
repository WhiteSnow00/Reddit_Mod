// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import c2.e0;
import mj2.c0;
import c2.t;
import c2.r;
import c2.u;
import ah2.f;
import pg2.j;
import androidx.compose.ui.platform.p0;
import zg2.l;
import u2.g;
import androidx.compose.ui.unit.LayoutDirection;
import u2.i;
import zg2.p;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.platform.q0;

public final class WrapContentModifier extends q0 implements a
{
    public final Direction g;
    public final boolean h;
    public final p<i, LayoutDirection, g> i;
    public final Object j;
    
    public WrapContentModifier(final Direction g, final boolean h, final p<? super i, ? super LayoutDirection, g> i, final Object j, final l<? super p0, j> l) {
        f.f((Object)g, "direction");
        f.f(j, "align");
        super((l)l);
        this.g = g;
        this.h = h;
        this.i = (p<i, LayoutDirection, g>)i;
        this.j = j;
    }
    
    public final boolean equals(final Object o) {
        final boolean b = o instanceof WrapContentModifier;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final Direction g = this.g;
        final WrapContentModifier wrapContentModifier = (WrapContentModifier)o;
        boolean b3 = b2;
        if (g == wrapContentModifier.g) {
            b3 = b2;
            if (this.h == wrapContentModifier.h) {
                b3 = b2;
                if (f.a(this.j, wrapContentModifier.j)) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    public final int hashCode() {
        return this.j.hashCode() + (Boolean.hashCode(this.h) + this.g.hashCode() * 31) * 31;
    }
    
    public final t u(final u u, final r r, final long n) {
        f.f((Object)u, "$this$measure");
        f.f((Object)r, "measurable");
        final Direction g = this.g;
        final Direction vertical = Direction.Vertical;
        int i = 0;
        int j;
        if (g != vertical) {
            j = 0;
        }
        else {
            j = u2.a.j(n);
        }
        final Direction g2 = this.g;
        final Direction horizontal = Direction.Horizontal;
        if (g2 == horizontal) {
            i = u2.a.i(n);
        }
        final Direction g3 = this.g;
        int g4 = Integer.MAX_VALUE;
        int h;
        if (g3 != vertical && this.h) {
            h = Integer.MAX_VALUE;
        }
        else {
            h = u2.a.h(n);
        }
        if (this.g == horizontal || !this.h) {
            g4 = u2.a.g(n);
        }
        final e0 k = r.I(c0.a(j, h, i, g4));
        final int l = yl.a.K(k.f, u2.a.j(n), u2.a.h(n));
        final int m = yl.a.K(k.g, u2.a.i(n), u2.a.g(n));
        return u.E0(u, l, m, (l)new WrapContentModifier$measure.WrapContentModifier$measure$1(this, l, k, m, u));
    }
}
