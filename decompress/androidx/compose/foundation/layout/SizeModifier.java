// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import c2.i;
import c2.e0;
import c2.t;
import c2.r;
import ah2.f;
import androidx.compose.ui.node.LayoutNodeWrapper;
import c2.u;
import mj2.c0;
import u2.d;
import u2.b;
import zg2.l;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.platform.q0;

public final class SizeModifier extends q0 implements a
{
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final boolean k;
    
    public SizeModifier() {
        throw null;
    }
    
    public SizeModifier(final float g, final float h, final float i, final float j, final boolean k, final l l) {
        super(l);
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public final long b(final b b) {
        final boolean a = d.a(this.i, Float.NaN);
        final int n = 0;
        int s0;
        if (!a) {
            final d d = new d(this.i);
            final d d2 = new d(0);
            d d3 = d;
            if (d.compareTo(d2) < 0) {
                d3 = d2;
            }
            s0 = b.s0(d3.f);
        }
        else {
            s0 = Integer.MAX_VALUE;
        }
        int s2;
        if (!d.a(this.j, Float.NaN)) {
            final d d4 = new d(this.j);
            final d d5 = new d(0);
            d d6 = d4;
            if (d4.compareTo(d5) < 0) {
                d6 = d5;
            }
            s2 = b.s0(d6.f);
        }
        else {
            s2 = Integer.MAX_VALUE;
        }
        int n3 = 0;
        Label_0220: {
            if (!d.a(this.g, Float.NaN)) {
                int s3;
                if ((s3 = b.s0(this.g)) > s0) {
                    s3 = s0;
                }
                int n2;
                if ((n2 = s3) < 0) {
                    n2 = 0;
                }
                if (n2 != Integer.MAX_VALUE) {
                    n3 = n2;
                    break Label_0220;
                }
            }
            n3 = 0;
        }
        int n4 = n;
        if (!d.a(this.h, Float.NaN)) {
            int s4;
            if ((s4 = b.s0(this.h)) > s2) {
                s4 = s2;
            }
            int n5;
            if ((n5 = s4) < 0) {
                n5 = 0;
            }
            n4 = n;
            if (n5 != Integer.MAX_VALUE) {
                n4 = n5;
            }
        }
        return c0.a(n3, s0, n4, s2);
    }
    
    public final int c(final u u, final LayoutNodeWrapper layoutNodeWrapper, int n) {
        f.f((Object)u, "<this>");
        f.f((Object)layoutNodeWrapper, "measurable");
        final long b = this.b(u);
        if (u2.a.e(b)) {
            n = u2.a.g(b);
        }
        else {
            n = c0.w(((i)layoutNodeWrapper).u(n), b);
        }
        return n;
    }
    
    public final boolean equals(final Object o) {
        final boolean b = o instanceof SizeModifier;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final float g = this.g;
        final SizeModifier sizeModifier = (SizeModifier)o;
        boolean b3 = b2;
        if (d.a(g, sizeModifier.g)) {
            b3 = b2;
            if (d.a(this.h, sizeModifier.h)) {
                b3 = b2;
                if (d.a(this.i, sizeModifier.i)) {
                    b3 = b2;
                    if (d.a(this.j, sizeModifier.j)) {
                        b3 = b2;
                        if (this.k == sizeModifier.k) {
                            b3 = true;
                        }
                    }
                }
            }
        }
        return b3;
    }
    
    public final int h(final u u, final LayoutNodeWrapper layoutNodeWrapper, int n) {
        f.f((Object)u, "<this>");
        f.f((Object)layoutNodeWrapper, "measurable");
        final long b = this.b(u);
        if (u2.a.e(b)) {
            n = u2.a.g(b);
        }
        else {
            n = c0.w(((i)layoutNodeWrapper).C(n), b);
        }
        return n;
    }
    
    public final int hashCode() {
        return a.a(this.j, a.a(this.i, a.a(this.h, Float.hashCode(this.g) * 31, 31), 31), 31);
    }
    
    public final int k(final u u, final LayoutNodeWrapper layoutNodeWrapper, int n) {
        f.f((Object)u, "<this>");
        f.f((Object)layoutNodeWrapper, "measurable");
        final long b = this.b(u);
        if (u2.a.f(b)) {
            n = u2.a.h(b);
        }
        else {
            n = c0.x(((i)layoutNodeWrapper).D(n), b);
        }
        return n;
    }
    
    public final t u(final u u, final r r, long n) {
        f.f((Object)u, "$this$measure");
        f.f((Object)r, "measurable");
        final long b = this.b(u);
        if (this.k) {
            n = c0.v(n, b);
        }
        else {
            int j;
            if (!d.a(this.g, Float.NaN)) {
                j = u2.a.j(b);
            }
            else {
                final int i = u2.a.j(n);
                final int h = u2.a.h(b);
                if ((j = i) > h) {
                    j = h;
                }
            }
            int h2;
            if (!d.a(this.i, Float.NaN)) {
                h2 = u2.a.h(b);
            }
            else {
                final int h3 = u2.a.h(n);
                final int k = u2.a.j(b);
                if ((h2 = h3) < k) {
                    h2 = k;
                }
            }
            int l;
            if (!d.a(this.h, Float.NaN)) {
                l = u2.a.i(b);
            }
            else {
                final int m = u2.a.i(n);
                final int g = u2.a.g(b);
                if ((l = m) > g) {
                    l = g;
                }
            }
            int g2;
            if (!d.a(this.j, Float.NaN)) {
                g2 = u2.a.g(b);
            }
            else {
                final int g3 = u2.a.g(n);
                final int i2 = u2.a.i(b);
                if ((g2 = g3) < i2) {
                    g2 = i2;
                }
            }
            n = c0.a(j, h2, l, g2);
        }
        final e0 i3 = r.I(n);
        return u.E0(u, i3.f, i3.g, (l)new SizeModifier$measure.SizeModifier$measure$1(i3));
    }
    
    public final int y(final u u, final LayoutNodeWrapper layoutNodeWrapper, int n) {
        f.f((Object)u, "<this>");
        f.f((Object)layoutNodeWrapper, "measurable");
        final long b = this.b(u);
        if (u2.a.f(b)) {
            n = u2.a.h(b);
        }
        else {
            n = c0.x(((i)layoutNodeWrapper).F(n), b);
        }
        return n;
    }
}
