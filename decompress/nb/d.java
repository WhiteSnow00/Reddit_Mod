// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import cb.v;
import ad.c0;
import cb.u;

public final class d implements u
{
    public final b a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    
    public d(final b a, final int b, long n, final long n2) {
        this.a = a;
        this.b = b;
        this.c = n;
        n = (n2 - n) / a.c;
        this.d = n;
        this.e = this.a(n);
    }
    
    public final long a(final long n) {
        return c0.P(n * this.b, 1000000L, this.a.b);
    }
    
    public final u.a c(long n) {
        final long j = c0.j(this.a.b * n / (this.b * 1000000L), 0L, this.d - 1L);
        final long c = this.c;
        final long n2 = this.a.c;
        final long a = this.a(j);
        final v v = new v(a, n2 * j + c);
        if (a < n && j != this.d - 1L) {
            n = j + 1L;
            return new u.a(v, new v(this.a(n), this.a.c * n + this.c));
        }
        return new u.a(v, v);
    }
    
    public final boolean d() {
        return true;
    }
    
    public final long h() {
        return this.e;
    }
}
