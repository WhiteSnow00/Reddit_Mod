// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import c2.h0;
import c2.w;
import c2.u;
import c2.x;
import cg.d;
import u2.b;
import ng2.e;
import c2.j;
import c2.k;
import mg2.l;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.platform.p0;

public final class SizeModifier extends p0 implements a
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
    
    public SizeModifier(float n, float n2, float n3, float n4, final boolean b, final l l, final int n5) {
        if ((n5 & 0x1) != 0x0) {
            n = Float.NaN;
        }
        if ((n5 & 0x2) != 0x0) {
            n2 = Float.NaN;
        }
        if ((n5 & 0x4) != 0x0) {
            n3 = Float.NaN;
        }
        if ((n5 & 0x8) != 0x0) {
            n4 = Float.NaN;
        }
        this(n, n2, n3, n4, b, l);
    }
    
    public final int b(final k k, final j j, int n) {
        e.f((Object)k, "<this>");
        final long d = this.d((u2.b)k);
        if (u2.a.e(d)) {
            n = u2.a.g(d);
        }
        else {
            n = cg.d.q1(j.t(n), d);
        }
        return n;
    }
    
    public final int c(final k k, final j j, int n) {
        e.f((Object)k, "<this>");
        final long d = this.d((u2.b)k);
        if (u2.a.f(d)) {
            n = u2.a.h(d);
        }
        else {
            n = cg.d.s1(j.l0(n), d);
        }
        return n;
    }
    
    public final long d(final u2.b b) {
        final boolean a = u2.d.a(this.i, Float.NaN);
        final int n = 0;
        int w0;
        if (!a) {
            final u2.d d = new u2.d(this.i);
            final u2.d d2 = new u2.d((float)0);
            u2.d d3 = d;
            if (d.compareTo((Object)d2) < 0) {
                d3 = d2;
            }
            w0 = b.w0(d3.f);
        }
        else {
            w0 = Integer.MAX_VALUE;
        }
        int w2;
        if (!u2.d.a(this.j, Float.NaN)) {
            final u2.d d4 = new u2.d(this.j);
            final u2.d d5 = new u2.d((float)0);
            u2.d d6 = d4;
            if (d4.compareTo((Object)d5) < 0) {
                d6 = d5;
            }
            w2 = b.w0(d6.f);
        }
        else {
            w2 = Integer.MAX_VALUE;
        }
        int n3 = 0;
        Label_0217: {
            if (!u2.d.a(this.g, Float.NaN)) {
                int w3;
                if ((w3 = b.w0(this.g)) > w0) {
                    w3 = w0;
                }
                int n2;
                if ((n2 = w3) < 0) {
                    n2 = 0;
                }
                if (n2 != Integer.MAX_VALUE) {
                    n3 = n2;
                    break Label_0217;
                }
            }
            n3 = 0;
        }
        int n4 = n;
        if (!u2.d.a(this.h, Float.NaN)) {
            int w4;
            if ((w4 = b.w0(this.h)) > w2) {
                w4 = w2;
            }
            int n5;
            if ((n5 = w4) < 0) {
                n5 = 0;
            }
            n4 = n;
            if (n5 != Integer.MAX_VALUE) {
                n4 = n5;
            }
        }
        return cg.d.G(n3, w0, n4, w2);
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
        if (u2.d.a(g, sizeModifier.g)) {
            b3 = b2;
            if (u2.d.a(this.h, sizeModifier.h)) {
                b3 = b2;
                if (u2.d.a(this.i, sizeModifier.i)) {
                    b3 = b2;
                    if (u2.d.a(this.j, sizeModifier.j)) {
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
    
    public final int f(final k k, final j j, int n) {
        e.f((Object)k, "<this>");
        final long d = this.d((u2.b)k);
        if (u2.a.e(d)) {
            n = u2.a.g(d);
        }
        else {
            n = cg.d.q1(j.L(n), d);
        }
        return n;
    }
    
    public final int g(final k k, final j j, int n) {
        e.f((Object)k, "<this>");
        final long d = this.d((u2.b)k);
        if (u2.a.f(d)) {
            n = u2.a.h(d);
        }
        else {
            n = cg.d.s1(j.r0(n), d);
        }
        return n;
    }
    
    public final w h(final x x, final u u, long n) {
        e.f((Object)x, "$this$measure");
        final long d = this.d((u2.b)x);
        if (this.k) {
            n = cg.d.p1(n, d);
        }
        else {
            int j;
            if (!u2.d.a(this.g, Float.NaN)) {
                j = u2.a.j(d);
            }
            else {
                final int i = u2.a.j(n);
                final int h = u2.a.h(d);
                if ((j = i) > h) {
                    j = h;
                }
            }
            int h2;
            if (!u2.d.a(this.i, Float.NaN)) {
                h2 = u2.a.h(d);
            }
            else {
                final int h3 = u2.a.h(n);
                final int k = u2.a.j(d);
                if ((h2 = h3) < k) {
                    h2 = k;
                }
            }
            int l;
            if (!u2.d.a(this.h, Float.NaN)) {
                l = u2.a.i(d);
            }
            else {
                final int m = u2.a.i(n);
                final int g = u2.a.g(d);
                if ((l = m) > g) {
                    l = g;
                }
            }
            int g2;
            if (!u2.d.a(this.j, Float.NaN)) {
                g2 = u2.a.g(d);
            }
            else {
                final int g3 = u2.a.g(n);
                final int i2 = u2.a.i(d);
                if ((g2 = g3) < i2) {
                    g2 = i2;
                }
            }
            n = cg.d.G(j, h2, l, g2);
        }
        final h0 s0 = u.s0(n);
        return x.N0(x, s0.f, s0.g, (l)new SizeModifier$measure.SizeModifier$measure$1(s0));
    }
    
    public final int hashCode() {
        return aq2.a.b(this.j, aq2.a.b(this.i, aq2.a.b(this.h, Float.hashCode(this.g) * 31, 31), 31), 31);
    }
}
