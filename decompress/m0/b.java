// 
// Decompiled by Procyon v0.6.0
// 

package m0;

import o1.b0;
import kotlin.NoWhenBranchMatchedException;
import wd.a;
import q1.h;
import o1.s;
import o1.f0;
import hg2.i;
import sg2.e;
import hg2.j;
import androidx.compose.ui.platform.n0;
import rg2.l;
import o1.z;
import o1.l0;
import o1.n;
import o1.r;
import l1.f;
import androidx.compose.ui.platform.o0;

public final class b extends o0 implements f
{
    public final r g;
    public final n h;
    public final float i;
    public final l0 j;
    public n1.f k;
    public z l;
    
    public b() {
        throw null;
    }
    
    public b(r g, n h, float i, final l0 j, final l l, final int n) {
        if ((n & 0x1) != 0x0) {
            g = null;
        }
        if ((n & 0x2) != 0x0) {
            h = null;
        }
        if ((n & 0x4) != 0x0) {
            i = 1.0f;
        }
        super(l);
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final boolean equals(final Object o) {
        b b;
        if (o instanceof b) {
            b = (b)o;
        }
        else {
            b = null;
        }
        final boolean b2 = false;
        if (b == null) {
            return false;
        }
        boolean b3 = b2;
        if (e.a((Object)this.g, (Object)b.g)) {
            b3 = b2;
            if (e.a((Object)this.h, (Object)b.h)) {
                final boolean b4 = this.i == b.i;
                b3 = b2;
                if (b4) {
                    b3 = b2;
                    if (e.a((Object)this.j, (Object)b.j)) {
                        b3 = true;
                    }
                }
            }
        }
        return b3;
    }
    
    public final int hashCode() {
        final r g = this.g;
        int hashCode = 0;
        int a;
        if (g != null) {
            a = hg2.i.a(g.a);
        }
        else {
            a = 0;
        }
        final n h = this.h;
        if (h != null) {
            hashCode = h.hashCode();
        }
        return this.j.hashCode() + d.d(this.i, (a * 31 + hashCode) * 31, 31);
    }
    
    public final void n0(final e2.f f) {
        if (this.j == f0.a) {
            final r g = this.g;
            if (g != null) {
                q1.e.P0((q1.e)f, g.a, 0L, 0L, 0.0f, (s)null, 126);
            }
            final n h = this.h;
            if (h != null) {
                q1.e.I((q1.e)f, h, 0L, 0L, this.i, (q1.f)null, 0, 118);
            }
        }
        else {
            z l;
            if (n1.f.b(f.b(), (Object)this.k) && f.getLayoutDirection() == null) {
                l = this.l;
                e.c((Object)l);
            }
            else {
                l = this.j.g(f.b(), f.getLayoutDirection(), (u2.b)f);
            }
            final r g2 = this.g;
            Label_0338: {
                if (g2 != null) {
                    final long a = g2.a;
                    final h a2 = q1.h.a;
                    e.f((Object)l, "outline");
                    e.f((Object)a2, "style");
                    if (l instanceof z.b) {
                        final n1.d a3 = ((z.b)l).a;
                        f.G0(a, wd.a.f(a3.a, a3.b), bg.d.q(a3.c - a3.a, a3.d - a3.b), 1.0f, (q1.f)a2, (s)null, 3);
                    }
                    else {
                        b0 b0;
                        if (l instanceof z.c) {
                            final z.c c = (z.c)l;
                            b0 = c.b;
                            if (b0 == null) {
                                final n1.e a4 = c.a;
                                final float b2 = n1.a.b(a4.h);
                                f.J0(a, wd.a.f(a4.a, a4.b), bg.d.q(a4.c - a4.a, a4.d - a4.b), aa1.a.f(b2, b2), (q1.f)a2, 1.0f, (s)null, 3);
                                break Label_0338;
                            }
                        }
                        else {
                            if (!(l instanceof z.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            b0 = ((z.a)l).a;
                        }
                        f.O(b0, a, 1.0f, (q1.f)a2, (s)null, 3);
                    }
                }
            }
            final n h2 = this.h;
            Label_0569: {
                if (h2 != null) {
                    final float i = this.i;
                    final h a5 = q1.h.a;
                    e.f((Object)l, "outline");
                    e.f((Object)a5, "style");
                    if (l instanceof z.b) {
                        final n1.d a6 = ((z.b)l).a;
                        f.s0(h2, a.f(a6.a, a6.b), bg.d.q(a6.c - a6.a, a6.d - a6.b), i, (q1.f)a5, (s)null, 3);
                    }
                    else {
                        b0 b3;
                        if (l instanceof z.c) {
                            final z.c c2 = (z.c)l;
                            b3 = c2.b;
                            if (b3 == null) {
                                final n1.e a7 = c2.a;
                                final float b4 = n1.a.b(a7.h);
                                f.B(h2, a.f(a7.a, a7.b), bg.d.q(a7.c - a7.a, a7.d - a7.b), aa1.a.f(b4, b4), i, (q1.f)a5, (s)null, 3);
                                break Label_0569;
                            }
                        }
                        else {
                            if (!(l instanceof z.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            b3 = ((z.a)l).a;
                        }
                        f.p0(b3, h2, i, (q1.f)a5, (s)null, 3);
                    }
                }
            }
            this.l = l;
            this.k = new n1.f(f.b());
        }
        f.g0();
    }
    
    public final String toString() {
        final StringBuilder r = a.r("Background(color=");
        r.append(this.g);
        r.append(", brush=");
        r.append(this.h);
        r.append(", alpha = ");
        r.append(this.i);
        r.append(", shape=");
        r.append(this.j);
        r.append(')');
        return r.toString();
    }
}
