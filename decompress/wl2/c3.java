// 
// Decompiled by Procyon v0.6.0
// 

package wl2;

import tl2.b;
import android.support.v4.media.c;
import nn0.a;
import tl2.g;
import tl2.f;
import tl2.d;
import tl2.g$b;

public final class c3 extends g$b
{
    public c3(final d d, final f f, final f f2) {
        super(d, f, f2);
    }
    
    public c3(final d d, final f f, final f f2, final f[] array) {
        super(d, f, f2, array);
    }
    
    public final g a(g m) {
        if (((g)this).j()) {
            return m;
        }
        if (m.j()) {
            return (g)this;
        }
        final d a = ((g)this).a;
        final z2 z2 = (z2)((g)this).b;
        final z2 z3 = (z2)m.b;
        if (z2.i()) {
            if (z3.i()) {
                return a.l();
            }
            return m.a((g)this);
        }
        else {
            final z2 z4 = (z2)((g)this).c;
            final z2 z5 = (z2)((g)this).d[0];
            final z2 z6 = (z2)m.c;
            final z2 z7 = (z2)m.h();
            final long[] array = new long[9];
            final long[] array2 = new long[9];
            final long[] array3 = new long[9];
            final long[] array4 = new long[9];
            long[] j;
            if (z5.h()) {
                j = null;
            }
            else {
                j = nn0.a.J(z5.f);
            }
            long[] f;
            long[] f2;
            if (j == null) {
                f = z3.f;
                f2 = z6.f;
            }
            else {
                nn0.a.H(z3.f, j, array2);
                nn0.a.H(z6.f, j, array4);
                f2 = array4;
                f = array2;
            }
            long[] i;
            if (z7.h()) {
                i = null;
            }
            else {
                i = nn0.a.J(z7.f);
            }
            long[] f3 = z2.f;
            long[] f4;
            if (i == null) {
                f4 = z4.f;
            }
            else {
                nn0.a.H(f3, i, array);
                nn0.a.H(z4.f, i, array3);
                f3 = array;
                f4 = array3;
            }
            nn0.a.g(f4, f2, array3);
            nn0.a.g(f3, f, array4);
            if (!c.u0(array4)) {
                f f5;
                f f6;
                f f7;
                if (z3.i()) {
                    m = ((g)this).m();
                    final z2 z8 = (z2)m.b;
                    final f g = m.g();
                    final f d = g.a((f)z6).d((f)z8);
                    f5 = d.o().a(d).a((f)z8);
                    if (((z2)f5).i()) {
                        return (g)new c3(a, f5, a.c);
                    }
                    f6 = d.j(z8.a(f5)).a(f5).a(g).d(f5).a(f5);
                    f7 = a.j(b.b);
                }
                else {
                    nn0.a.R(array4, array4);
                    final long[] k = nn0.a.J(array3);
                    nn0.a.H(f3, k, array);
                    nn0.a.H(f, k, array2);
                    final z2 z9 = new z2(array);
                    nn0.a.E(array, array2, z9.f);
                    if (z9.i()) {
                        return (g)new c3(a, z9, a.c);
                    }
                    final z2 z10 = new z2(array3);
                    nn0.a.H(array4, k, z10.f);
                    if (i != null) {
                        final long[] f8 = z10.f;
                        nn0.a.H(f8, i, f8);
                    }
                    final long[] array5 = new long[18];
                    nn0.a.g(array2, array4, array4);
                    final long[] array6 = new long[18];
                    nn0.a.C(array4, array6);
                    for (int l = 0; l < 18; ++l) {
                        array5[l] ^= array6[l];
                    }
                    nn0.a.g(z4.f, z5.f, array4);
                    nn0.a.G(array4, z10.f, array5);
                    final z2 z11 = new z2(array4);
                    nn0.a.L(array5, z11.f);
                    if (j != null) {
                        final long[] f9 = z10.f;
                        nn0.a.H(f9, j, f9);
                    }
                    f5 = z9;
                    f7 = z10;
                    f6 = z11;
                }
                return (g)new c3(a, f5, f6, new f[] { f7 });
            }
            if (c.u0(array3)) {
                return this.v();
            }
            return a.l();
        }
    }
    
    public final boolean d() {
        final f b = ((g)this).b;
        final boolean i = b.i();
        boolean b2 = false;
        if (i) {
            return false;
        }
        if (((g)this).c.s() != b.s()) {
            b2 = true;
        }
        return b2;
    }
    
    public final f g() {
        final f b = ((g)this).b;
        final f c = ((g)this).c;
        if (!((g)this).j() && !b.i()) {
            final f j = c.a(b).j(b);
            final f f = ((g)this).d[0];
            f d = j;
            if (!f.h()) {
                d = j.d(f);
            }
            return d;
        }
        return c;
    }
    
    public final g l() {
        if (((g)this).j()) {
            return (g)this;
        }
        final f b = ((g)this).b;
        if (b.i()) {
            return (g)this;
        }
        final f c = ((g)this).c;
        final f f = ((g)this).d[0];
        return (g)new c3(((g)this).a, b, c.a(f), new f[] { f });
    }
    
    public final g v() {
        if (((g)this).j()) {
            return (g)this;
        }
        final d a = ((g)this).a;
        final f b = ((g)this).b;
        if (b.i()) {
            return a.l();
        }
        final f c = ((g)this).c;
        f o = ((g)this).d[0];
        final boolean h = o.h();
        f o2;
        if (h) {
            o2 = o;
        }
        else {
            o2 = o.o();
        }
        f f;
        if (h) {
            f = c.o().a(c);
        }
        else {
            f = c.a(o).j(c);
        }
        if (f.i()) {
            return (g)new c3(a, f, a.c);
        }
        final f o3 = f.o();
        f j;
        if (h) {
            j = f;
        }
        else {
            j = f.j(o2);
        }
        final f o4 = c.a(b).o();
        if (!h) {
            o = o2.o();
        }
        return (g)new c3(a, o3, o4.a(f).a(o2).j(o4).a(o).a(o3).a(j), new f[] { j });
    }
    
    public final g w(final g g) {
        if (((g)this).j()) {
            return g;
        }
        if (g.j()) {
            return this.v();
        }
        final d a = ((g)this).a;
        final f b = ((g)this).b;
        if (b.i()) {
            return g;
        }
        final f b2 = g.b;
        final f h = g.h();
        if (b2.i() || !h.h()) {
            return this.v().a(g);
        }
        final f c = ((g)this).c;
        final f f = ((g)this).d[0];
        final f c2 = g.c;
        final f o = b.o();
        final f o2 = c.o();
        final f o3 = f.o();
        final f a2 = o2.a(c.j(f));
        final f b3 = c2.b();
        final f l = b3.j(o3).a(o2).l(a2, o, o3);
        final f j = b2.j(o3);
        final f o4 = j.a(a2).o();
        if (o4.i()) {
            if (l.i()) {
                return g.v();
            }
            return a.l();
        }
        else {
            if (l.i()) {
                return (g)new c3(a, l, a.c);
            }
            final f i = l.o().j(j);
            final f k = l.j(o4).j(o3);
            return (g)new c3(a, i, l.a(o4).o().l(a2, b3, k), new f[] { k });
        }
    }
}
