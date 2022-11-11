// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import c2.e0;
import u2.a$a;
import u2.i;
import c2.t;
import c2.r;
import androidx.compose.ui.node.LayoutNodeWrapper;
import c2.u;
import ej2.c0;
import lw0.b;
import sg2.e;
import hg2.j;
import androidx.compose.ui.platform.n0;
import rg2.l;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.platform.o0;

public final class AspectRatioModifier extends o0 implements a
{
    public final float g;
    public final boolean h;
    
    public AspectRatioModifier(final float g, final boolean h, final l<? super n0, j> l) {
        e.f((Object)l, "inspectorInfo");
        super(l);
        this.g = g;
        this.h = h;
        if (g > 0.0f) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("aspectRatio ");
        sb.append(g);
        sb.append(" must be > 0");
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public final long b(final long n, final boolean b) {
        final int g = u2.a.g(n);
        if (g != Integer.MAX_VALUE) {
            final int k2 = b.k2(g * this.g);
            if (k2 > 0) {
                final long l = b.l(k2, g);
                if (!b || c0.z3(n, l)) {
                    return l;
                }
            }
        }
        return 0L;
    }
    
    public final int c(final u u, final LayoutNodeWrapper layoutNodeWrapper, int n) {
        e.f((Object)u, "<this>");
        e.f((Object)layoutNodeWrapper, "measurable");
        if (n != Integer.MAX_VALUE) {
            n = b.k2(n / this.g);
        }
        else {
            n = ((c2.i)layoutNodeWrapper).q(n);
        }
        return n;
    }
    
    public final long d(final long n, final boolean b) {
        final int h = u2.a.h(n);
        if (h != Integer.MAX_VALUE) {
            final int k2 = b.k2(h / this.g);
            if (k2 > 0) {
                final long l = b.l(h, k2);
                if (!b || c0.z3(n, l)) {
                    return l;
                }
            }
        }
        return 0L;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        AspectRatioModifier aspectRatioModifier;
        if (o instanceof AspectRatioModifier) {
            aspectRatioModifier = (AspectRatioModifier)o;
        }
        else {
            aspectRatioModifier = null;
        }
        if (aspectRatioModifier == null) {
            return false;
        }
        if (this.g != aspectRatioModifier.g || this.h != ((AspectRatioModifier)o).h) {
            b = false;
        }
        return b;
    }
    
    public final long f(final long n, final boolean b) {
        final int i = u2.a.i(n);
        final int k2 = b.k2(i * this.g);
        if (k2 > 0) {
            final long l = b.l(k2, i);
            if (!b || c0.z3(n, l)) {
                return l;
            }
        }
        return 0L;
    }
    
    public final long g(final long n, final boolean b) {
        final int j = u2.a.j(n);
        final int k2 = b.k2(j / this.g);
        if (k2 > 0) {
            final long l = b.l(j, k2);
            if (!b || c0.z3(n, l)) {
                return l;
            }
        }
        return 0L;
    }
    
    public final int h(final u u, final LayoutNodeWrapper layoutNodeWrapper, int n) {
        e.f((Object)u, "<this>");
        e.f((Object)layoutNodeWrapper, "measurable");
        if (n != Integer.MAX_VALUE) {
            n = b.k2(n / this.g);
        }
        else {
            n = ((c2.i)layoutNodeWrapper).C(n);
        }
        return n;
    }
    
    public final int hashCode() {
        return Boolean.hashCode(this.h) + Float.hashCode(this.g) * 31;
    }
    
    public final int k(final u u, final LayoutNodeWrapper layoutNodeWrapper, int n) {
        e.f((Object)u, "<this>");
        e.f((Object)layoutNodeWrapper, "measurable");
        if (n != Integer.MAX_VALUE) {
            n = b.k2(n * this.g);
        }
        else {
            n = ((c2.i)layoutNodeWrapper).E(n);
        }
        return n;
    }
    
    public final String toString() {
        return b.h(a.r("AspectRatioModifier(aspectRatio="), this.g, ')');
    }
    
    public final t v(final u u, final r r, long c) {
        e.f((Object)u, "$this$measure");
        e.f((Object)r, "measurable");
        long n = 0L;
        Label_0342: {
            if (!this.h) {
                n = this.d(c, true);
                if (!i.a(n, 0L)) {
                    break Label_0342;
                }
                n = this.b(c, true);
                if (!i.a(n, 0L)) {
                    break Label_0342;
                }
                n = this.g(c, true);
                if (!i.a(n, 0L)) {
                    break Label_0342;
                }
                n = this.f(c, true);
                if (!i.a(n, 0L)) {
                    break Label_0342;
                }
                n = this.d(c, false);
                if (!i.a(n, 0L)) {
                    break Label_0342;
                }
                n = this.b(c, false);
                if (!i.a(n, 0L)) {
                    break Label_0342;
                }
                n = this.g(c, false);
                if (!i.a(n, 0L)) {
                    break Label_0342;
                }
                n = this.f(c, false);
                if (!i.a(n, 0L)) {
                    break Label_0342;
                }
            }
            else {
                n = this.b(c, true);
                if (!i.a(n, 0L)) {
                    break Label_0342;
                }
                n = this.d(c, true);
                if (!i.a(n, 0L)) {
                    break Label_0342;
                }
                n = this.f(c, true);
                if (!i.a(n, 0L)) {
                    break Label_0342;
                }
                n = this.g(c, true);
                if (!i.a(n, 0L)) {
                    break Label_0342;
                }
                n = this.b(c, false);
                if (!i.a(n, 0L)) {
                    break Label_0342;
                }
                n = this.d(c, false);
                if (!i.a(n, 0L)) {
                    break Label_0342;
                }
                n = this.f(c, false);
                if (!i.a(n, 0L)) {
                    break Label_0342;
                }
                n = this.g(c, false);
                if (!i.a(n, 0L)) {
                    break Label_0342;
                }
            }
            n = 0L;
        }
        if (!i.a(n, 0L)) {
            c = a$a.c((int)(n >> 32), i.b(n));
        }
        final e0 h = r.H(c);
        return u.U(u, h.f, h.g, (l)new AspectRatioModifier$measure.AspectRatioModifier$measure$1(h));
    }
    
    public final int y(final u u, final LayoutNodeWrapper layoutNodeWrapper, int n) {
        e.f((Object)u, "<this>");
        e.f((Object)layoutNodeWrapper, "measurable");
        if (n != Integer.MAX_VALUE) {
            n = b.k2(n * this.g);
        }
        else {
            n = ((c2.i)layoutNodeWrapper).F(n);
        }
        return n;
    }
}
