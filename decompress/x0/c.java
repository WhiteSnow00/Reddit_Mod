// 
// Decompiled by Procyon v0.6.0
// 

package x0;

import ah2.f;
import ah2.i;
import o1.r;
import k0.n;
import l0.q;
import at1.a;
import z0.e1;
import z0.d;

public final class c implements l
{
    public final long a;
    public final long b;
    public final long c;
    
    public c(final long a, final long b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final e1 a(final boolean b, final boolean b2, final d d) {
        d.A(1243421834);
        long n;
        if (!b) {
            n = this.c;
        }
        else if (!b2) {
            n = this.b;
        }
        else {
            n = this.a;
        }
        Object o;
        if (b) {
            d.A(-1052799218);
            o = k0.n.a(n, at1.a.k2(100, 0, (q)null, 6), d, 48, 4);
            d.I();
        }
        else {
            d.A(-1052799113);
            o = a80.a.v0(new r(n), d);
            d.I();
        }
        d.I();
        return (e1)o;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && f.a((Object)i.a((Class)c.class), (Object)i.a((Class)o.getClass()))) {
            final c c = (c)o;
            return r.c(this.a, c.a) && r.c(this.b, c.b) && r.c(this.c, c.c);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int m = r.m;
        return pg2.i.a(this.c) + ak0.n.d(this.b, pg2.i.a(a) * 31, 31);
    }
}
