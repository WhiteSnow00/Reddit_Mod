// 
// Decompiled by Procyon v0.6.0
// 

package x0;

import t5.w;
import cg2.i;
import ng2.e;
import ng2.h;
import mg2.q;
import ah0.b;
import o1.r;
import androidx.compose.runtime.ComposerKt;
import z0.g0;

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
    
    public final g0 a(final boolean b, final boolean b2, final z0.d d) {
        d.A(-1176343362);
        final q a = ComposerKt.a;
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
        final g0 k1 = b.k1((Object)new r(n), d);
        d.H();
        return k1;
    }
    
    public final g0 b(final boolean b, final boolean b2, final z0.d d) {
        d.A(-66424183);
        final q a = ComposerKt.a;
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
        final g0 k1 = b.k1((Object)new r(n), d);
        d.H();
        return k1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && ng2.e.a((Object)ng2.h.a((Class)d.class), (Object)ng2.h.a((Class)o.getClass()))) {
            final d d = (d)o;
            return r.c(this.a, d.a) && r.c(this.b, d.b) && r.c(this.c, d.c) && r.c(this.d, d.d) && r.c(this.e, d.e) && r.c(this.f, d.f) && r.c(this.g, d.g) && r.c(this.h, d.h);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int m = r.m;
        return i.a(this.h) + w.c(this.g, w.c(this.f, w.c(this.e, w.c(this.d, w.c(this.c, w.c(this.b, i.a(a) * 31, 31), 31), 31), 31), 31), 31);
    }
}
