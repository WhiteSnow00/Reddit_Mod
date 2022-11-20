// 
// Decompiled by Procyon v0.6.0
// 

package s1;

import ph0.a;
import ng2.e;
import ng2.h;
import o1.n;
import java.util.List;

public final class l extends k
{
    public final String f;
    public final List<d> g;
    public final int h;
    public final n i;
    public final float j;
    public final n k;
    public final float l;
    public final float m;
    public final int n;
    public final int o;
    public final float p;
    public final float q;
    public final float r;
    public final float s;
    
    public l(final String f, final List g, final int h, final n i, final float j, final n k, final float l, final float m, final int n, final int o, final float p14, final float q, final float r, final float s) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p14;
        this.q = q;
        this.r = r;
        this.s = s;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && e.a((Object)ng2.h.a((Class)l.class), (Object)ng2.h.a((Class)o.getClass()))) {
            final l l = (l)o;
            return e.a((Object)this.f, (Object)l.f) && e.a((Object)this.i, (Object)l.i) && this.j == l.j && e.a((Object)this.k, (Object)l.k) && this.l == l.l && this.m == l.m && this.n == l.n && this.o == l.o && this.p == l.p && this.q == l.q && this.r == l.r && this.s == l.s && this.h == l.h && e.a((Object)this.g, (Object)l.g);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int b = a.b((List)this.g, this.f.hashCode() * 31, 31);
        final n i = this.i;
        final int n = 0;
        int hashCode;
        if (i != null) {
            hashCode = i.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int b2 = aq2.a.b(this.j, (b + hashCode) * 31, 31);
        final n k = this.k;
        int hashCode2 = n;
        if (k != null) {
            hashCode2 = k.hashCode();
        }
        return Integer.hashCode(this.h) + aq2.a.b(this.s, aq2.a.b(this.r, aq2.a.b(this.q, aq2.a.b(this.p, aq2.a.c(this.o, aq2.a.c(this.n, aq2.a.b(this.m, aq2.a.b(this.l, (b2 + hashCode2) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
