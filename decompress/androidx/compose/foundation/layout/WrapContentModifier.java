// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import c2.h0;
import zd.b;
import cg.d;
import c2.w;
import c2.u;
import c2.x;
import ng2.e;
import cg2.j;
import androidx.compose.ui.platform.o0;
import mg2.l;
import u2.g;
import androidx.compose.ui.unit.LayoutDirection;
import u2.i;
import mg2.p;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.platform.p0;

public final class WrapContentModifier extends p0 implements a
{
    public final Direction g;
    public final boolean h;
    public final p<i, LayoutDirection, g> i;
    public final Object j;
    
    public WrapContentModifier(final Direction g, final boolean h, final p<? super i, ? super LayoutDirection, g> i, final Object j, final l<? super o0, j> l) {
        e.f((Object)g, "direction");
        e.f(j, "align");
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
                if (e.a(this.j, wrapContentModifier.j)) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    public final w h(final x x, final u u, final long n) {
        e.f((Object)x, "$this$measure");
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
        final h0 s0 = u.s0(cg.d.G(j, h, i, g4));
        final int x2 = zd.b.x(s0.f, u2.a.j(n), u2.a.h(n));
        final int x3 = zd.b.x(s0.g, u2.a.i(n), u2.a.g(n));
        return x.N0(x, x2, x3, (l)new WrapContentModifier$measure.WrapContentModifier$measure$1(this, x2, s0, x3, x));
    }
    
    public final int hashCode() {
        return this.j.hashCode() + (Boolean.hashCode(this.h) + this.g.hashCode() * 31) * 31;
    }
}
