// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import lw0.b;

public final class p
{
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Boolean k;
    
    public p(final String a, final String b, final long c, final long d, final long e, final long f, final long g, final Long h, final Long i, final Long j, final Boolean k) {
        lw0.b.O(a);
        lw0.b.O(b);
        final boolean b2 = true;
        lw0.b.H(c >= 0L);
        lw0.b.H(d >= 0L);
        lw0.b.H(e >= 0L);
        lw0.b.H(g >= 0L && b2);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public final p a(final Long n, final Long n2, Boolean b) {
        if (b != null && !b) {
            b = null;
        }
        return new p(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, n, n2, b);
    }
    
    public final p b(final long n, final long n2) {
        return new p(this.a, this.b, this.c, this.d, this.e, this.f, n, n2, this.i, this.j, this.k);
    }
}
