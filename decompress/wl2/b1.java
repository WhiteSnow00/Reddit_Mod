// 
// Decompiled by Procyon v0.6.0
// 

package wl2;

import tl2.b;
import al0.g7;
import tl2.g;
import tl2.f;
import tl2.d;
import tl2.g$b;

public final class b1 extends g$b
{
    public b1(final d d, final f f, final f f2) {
        super(d, f, f2);
    }
    
    public b1(final d d, final f f, final f f2, final f[] array) {
        super(d, f, f2, array);
    }
    
    public final g a(final g g) {
        if (((g)this).j()) {
            return g;
        }
        if (g.j()) {
            return (g)this;
        }
        final d a = ((g)this).a;
        f f = ((g)this).b;
        final f b = g.b;
        if (f.i()) {
            if (b.i()) {
                return a.l();
            }
            return g.a((g)this);
        }
        else {
            final f c = ((g)this).c;
            final f f2 = ((g)this).d[0];
            final f c2 = g.c;
            final f h = g.h();
            final boolean h2 = f2.h();
            f j;
            f i;
            if (!h2) {
                j = b.j(f2);
                i = c2.j(f2);
            }
            else {
                j = b;
                i = c2;
            }
            final boolean h3 = h.h();
            f k;
            if (!h3) {
                f = f.j(h);
                k = c.j(h);
            }
            else {
                k = c;
            }
            final f a2 = k.a(i);
            final f a3 = f.a(j);
            if (!a3.i()) {
                f f3;
                f f4;
                f f5;
                if (b.i()) {
                    final g m = ((g)this).m();
                    final f b2 = m.b;
                    final f g2 = m.g();
                    final f d = g2.a(c2).d(b2);
                    f3 = g7.p(d, d, b2).a(a.b);
                    if (f3.i()) {
                        return (g)new b1(a, f3, a.c.n());
                    }
                    f4 = d.j(b2.a(f3)).a(f3).a(g2).d(f3).a(f3);
                    f5 = a.j(tl2.b.b);
                }
                else {
                    final f o = a3.o();
                    final f l = a2.j(f);
                    final f j2 = a2.j(j);
                    f3 = l.j(j2);
                    if (f3.i()) {
                        return (g)new b1(a, f3, a.c.n());
                    }
                    final f f6 = f5 = a2.j(o);
                    if (!h3) {
                        f5 = f6.j(h);
                    }
                    f4 = j2.a(o).p(f5, c.a(f2));
                    if (!h2) {
                        f5 = f5.j(f2);
                    }
                }
                return (g)new b1(a, f3, f4, new f[] { f5 });
            }
            if (a2.i()) {
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
        return (g)new b1(((g)this).a, b, c.a(f), new f[] { f });
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
        final f f = ((g)this).d[0];
        final boolean h = f.h();
        f j;
        if (h) {
            j = c;
        }
        else {
            j = c.j(f);
        }
        f o;
        if (h) {
            o = f;
        }
        else {
            o = f.o();
        }
        f f2 = a.b;
        if (!h) {
            f2 = f2.j(o);
        }
        final f p = g7.p(c, j, f2);
        if (p.i()) {
            return (g)new b1(a, p, a.c.n());
        }
        final f o2 = p.o();
        f i;
        if (h) {
            i = p;
        }
        else {
            i = p.j(o);
        }
        f k;
        if (h) {
            k = b;
        }
        else {
            k = b.j(f);
        }
        return (g)new b1(a, o2, k.p(p, j).a(o2).a(i), new f[] { i });
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
        final f a2 = a.b.j(o3).a(o2).a(c.j(f));
        final f b3 = c2.b();
        final f l = a.b.a(b3).j(o3).a(o2).l(a2, o, o3);
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
                return (g)new b1(a, l, a.c.n());
            }
            final f i = l.o().j(j);
            final f k = l.j(o4).j(o3);
            return (g)new b1(a, i, l.a(o4).o().l(a2, b3, k), new f[] { k });
        }
    }
}
