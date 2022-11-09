// 
// Decompiled by Procyon v0.6.0
// 

package m0;

import n1.d;
import o1.b0;
import kotlin.NoWhenBranchMatchedException;
import o1.z$a;
import o1.z$c;
import o1.z$b;
import q1.h;
import u2.b;
import o1.s;
import q1.e;
import o1.f0;
import pg2.i;
import zg2.l;
import o1.z;
import o1.l0;
import o1.n;
import o1.r;
import l1.f;
import androidx.compose.ui.platform.q0;

public final class c extends q0 implements f
{
    public final r g;
    public final n h;
    public final float i;
    public final l0 j;
    public n1.f k;
    public z l;
    
    public c() {
        throw null;
    }
    
    public c(r g, n h, float i, final l0 j, final l l, final int n) {
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
        c c;
        if (o instanceof c) {
            c = (c)o;
        }
        else {
            c = null;
        }
        final boolean b = false;
        if (c == null) {
            return false;
        }
        boolean b2 = b;
        if (ah2.f.a((Object)this.g, (Object)c.g)) {
            b2 = b;
            if (ah2.f.a((Object)this.h, (Object)c.h)) {
                final boolean b3 = this.i == c.i;
                b2 = b;
                if (b3) {
                    b2 = b;
                    if (ah2.f.a((Object)this.j, (Object)c.j)) {
                        b2 = true;
                    }
                }
            }
        }
        return b2;
    }
    
    public final int hashCode() {
        final r g = this.g;
        int hashCode = 0;
        int a;
        if (g != null) {
            a = pg2.i.a(g.a);
        }
        else {
            a = 0;
        }
        final n h = this.h;
        if (h != null) {
            hashCode = h.hashCode();
        }
        return this.j.hashCode() + a.a(this.i, (a * 31 + hashCode) * 31, 31);
    }
    
    public final void k0(final e2.f f) {
        if (this.j == f0.a) {
            final r g = this.g;
            if (g != null) {
                e.P0(f, g.a, 0L, 0L, 0.0f, null, 126);
            }
            final n h = this.h;
            if (h != null) {
                e.G(f, h, 0L, 0L, this.i, null, 0, 118);
            }
        }
        else {
            final long b = f.b();
            final n1.f k = this.k;
            final int d = n1.f.d;
            final boolean b2 = k instanceof n1.f;
            boolean b3 = false;
            if (b2) {
                if (b == k.a) {
                    b3 = true;
                }
            }
            z l;
            if (b3 && f.getLayoutDirection() == null) {
                l = this.l;
                ah2.f.c((Object)l);
            }
            else {
                l = this.j.e(f.b(), f.getLayoutDirection(), (u2.b)f);
            }
            final r g2 = this.g;
            Label_0394: {
                if (g2 != null) {
                    final long a = g2.a;
                    final h a2 = q1.h.a;
                    ah2.f.f((Object)l, "outline");
                    ah2.f.f((Object)a2, "style");
                    if (l instanceof z$b) {
                        final n1.d a3 = ((z$b)l).a;
                        f.D0(a, yd.a.y0(a3.a, a3.b), a80.a.f(a3.c - a3.a, a3.d - a3.b), 1.0f, a2, null, 3);
                    }
                    else {
                        Object o;
                        if (l instanceof z$c) {
                            final z$c z$c = (z$c)l;
                            o = z$c.b;
                            if (o == null) {
                                final n1.e a4 = z$c.a;
                                final float b4 = n1.a.b(a4.h);
                                f.I0(a, yd.a.y0(a4.a, a4.b), a80.a.f(a4.c - a4.a, a4.d - a4.b), at1.a.g(b4, b4), a2, 1.0f, null, 3);
                                break Label_0394;
                            }
                        }
                        else {
                            if (!(l instanceof z$a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            o = ((z$a)l).a;
                        }
                        f.N((b0)o, a, 1.0f, a2, null, 3);
                    }
                }
            }
            final n h2 = this.h;
            Label_0644: {
                if (h2 != null) {
                    final float i = this.i;
                    final h a5 = q1.h.a;
                    ah2.f.f((Object)l, "outline");
                    ah2.f.f((Object)a5, "style");
                    if (l instanceof z$b) {
                        final n1.d a6 = ((z$b)l).a;
                        f.o0(h2, yd.a.y0(a6.a, a6.b), a80.a.f(a6.c - a6.a, a6.d - a6.b), i, a5, null, 3);
                    }
                    else {
                        Object o2;
                        if (l instanceof z$c) {
                            final z$c z$c2 = (z$c)l;
                            o2 = z$c2.b;
                            if (o2 == null) {
                                final n1.e a7 = z$c2.a;
                                final float b5 = n1.a.b(a7.h);
                                f.A(h2, yd.a.y0(a7.a, a7.b), a80.a.f(a7.c - a7.a, a7.d - a7.b), at1.a.g(b5, b5), i, a5, null, 3);
                                break Label_0644;
                            }
                        }
                        else {
                            if (!(l instanceof z$a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            o2 = ((z$a)l).a;
                        }
                        f.m0((b0)o2, h2, i, a5, null, 3);
                    }
                }
            }
            this.l = l;
            this.k = new n1.f(f.b());
        }
        f.c0();
    }
    
    public final String toString() {
        final StringBuilder k = a.k("Background(color=");
        k.append(this.g);
        k.append(", brush=");
        k.append(this.h);
        k.append(", alpha = ");
        k.append(this.i);
        k.append(", shape=");
        k.append(this.j);
        k.append(')');
        return k.toString();
    }
}
