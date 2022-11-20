// 
// Decompiled by Procyon v0.6.0
// 

package x0;

import t5.w;
import cg2.i;
import ng2.e;
import ng2.h;
import ah0.b;
import o1.r;
import k0.n;
import l0.q;
import vl.a;
import androidx.compose.runtime.ComposerKt;
import z0.c1;
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
    
    public final c1 a(final boolean b, final boolean b2, final d d) {
        d.A(1243421834);
        final mg2.q a = ComposerKt.a;
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
            o = k0.n.a(n, vl.a.u3(100, 0, (q)null, 6), d, 48, 4);
            d.H();
        }
        else {
            d.A(-1052799113);
            o = b.k1((Object)new r(n), d);
            d.H();
        }
        d.H();
        return (c1)o;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && e.a((Object)h.a((Class)c.class), (Object)h.a((Class)o.getClass()))) {
            final c c = (c)o;
            return r.c(this.a, c.a) && r.c(this.b, c.b) && r.c(this.c, c.c);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int m = r.m;
        return i.a(this.c) + w.c(this.b, i.a(a) * 31, 31);
    }
}
