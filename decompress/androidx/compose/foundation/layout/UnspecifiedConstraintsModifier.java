// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import u2.b;
import c2.h0;
import c2.w;
import c2.u;
import c2.x;
import u2.d;
import ng2.e;
import c2.j;
import c2.k;
import mg2.l;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.platform.p0;

public final class UnspecifiedConstraintsModifier extends p0 implements a
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
    
    public final int b(final k k, final j j, int w0) {
        e.f((Object)k, "<this>");
        final int t = j.t(w0);
        if (!u2.d.a(this.h, Float.NaN)) {
            w0 = ((u2.b)k).w0(this.h);
        }
        else {
            w0 = 0;
        }
        int n = t;
        if (t < w0) {
            n = w0;
        }
        return n;
    }
    
    public final int c(final k k, final j j, int w0) {
        e.f((Object)k, "<this>");
        final int l0 = j.l0(w0);
        if (!u2.d.a(this.g, Float.NaN)) {
            w0 = ((u2.b)k).w0(this.g);
        }
        else {
            w0 = 0;
        }
        int n = l0;
        if (l0 < w0) {
            n = w0;
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
        if (u2.d.a(g, unspecifiedConstraintsModifier.g)) {
            b3 = b2;
            if (u2.d.a(this.h, unspecifiedConstraintsModifier.h)) {
                b3 = true;
            }
        }
        return b3;
    }
    
    public final int f(final k k, final j j, int w0) {
        e.f((Object)k, "<this>");
        final int l = j.L(w0);
        if (!u2.d.a(this.h, Float.NaN)) {
            w0 = ((u2.b)k).w0(this.h);
        }
        else {
            w0 = 0;
        }
        int n = l;
        if (l < w0) {
            n = w0;
        }
        return n;
    }
    
    public final int g(final k k, final j j, int w0) {
        e.f((Object)k, "<this>");
        final int r0 = j.r0(w0);
        if (!u2.d.a(this.g, Float.NaN)) {
            w0 = ((u2.b)k).w0(this.g);
        }
        else {
            w0 = 0;
        }
        int n = r0;
        if (r0 < w0) {
            n = w0;
        }
        return n;
    }
    
    public final w h(final x x, final u u, final long n) {
        e.f((Object)x, "$this$measure");
        final boolean a = u2.d.a(this.g, Float.NaN);
        final int n2 = 0;
        int j;
        if (!a && u2.a.j(n) == 0) {
            final int w0 = ((u2.b)x).w0(this.g);
            final int h = u2.a.h(n);
            int n3;
            if ((n3 = w0) > h) {
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
        if (!u2.d.a(this.h, Float.NaN) && u2.a.i(n) == 0) {
            final int w2 = ((u2.b)x).w0(this.h);
            final int g = u2.a.g(n);
            if ((i = w2) > g) {
                i = g;
            }
            if (i < 0) {
                i = n2;
            }
        }
        else {
            i = u2.a.i(n);
        }
        final h0 s0 = u.s0(cg.d.G(j, h2, i, u2.a.g(n)));
        return x.N0(x, s0.f, s0.g, (l)new UnspecifiedConstraintsModifier$measure.UnspecifiedConstraintsModifier$measure$1(s0));
    }
    
    public final int hashCode() {
        return Float.hashCode(this.h) + Float.hashCode(this.g) * 31;
    }
}
