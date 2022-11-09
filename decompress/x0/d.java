// 
// Decompiled by Procyon v0.6.0
// 

package x0;

import ak0.n;
import ah2.f;
import ah2.i;
import a80.a;
import o1.r;
import z0.h0;

public final class d implements p
{
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    
    public d(final long a, final long b, final long c, final long d, final long e, final long f, final long g, final long h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final h0 a(final boolean b, final boolean b2, final z0.d d) {
        d.A(-1176343362);
        long n;
        if (b) {
            if (b2) {
                n = this.b;
            }
            else {
                n = this.d;
            }
        }
        else if (b2) {
            n = this.f;
        }
        else {
            n = this.h;
        }
        final h0 v0 = a80.a.v0(new r(n), d);
        d.I();
        return v0;
    }
    
    @Override
    public final h0 b(final boolean b, final boolean b2, final z0.d d) {
        d.A(-66424183);
        long n;
        if (b) {
            if (b2) {
                n = this.a;
            }
            else {
                n = this.c;
            }
        }
        else if (b2) {
            n = this.e;
        }
        else {
            n = this.g;
        }
        final h0 v0 = a80.a.v0(new r(n), d);
        d.I();
        return v0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && ah2.f.a((Object)i.a((Class)d.class), (Object)i.a((Class)o.getClass()))) {
            final d d = (d)o;
            return r.c(this.a, d.a) && r.c(this.b, d.b) && r.c(this.c, d.c) && r.c(this.d, d.d) && r.c(this.e, d.e) && r.c(this.f, d.f) && r.c(this.g, d.g) && r.c(this.h, d.h);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int m = r.m;
        return pg2.i.a(this.h) + n.d(this.g, n.d(this.f, n.d(this.e, n.d(this.d, n.d(this.c, n.d(this.b, pg2.i.a(a) * 31, 31), 31), 31), 31), 31), 31);
    }
}
