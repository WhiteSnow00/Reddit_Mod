// 
// Decompiled by Procyon v0.6.0
// 

package cb;

import ad.c0;
import ad.d0;

public final class o implements u
{
    public final p a;
    public final long b;
    
    public o(final p a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public final u.a c(long n) {
        d0.g(this.a.k);
        final p a = this.a;
        final p.a k = a.k;
        final long[] a2 = k.a;
        final long[] b = k.b;
        int f = c0.f(a2, c0.j(a.e * n / 1000000L, 0L, a.j - 1L), false);
        long n2 = 0L;
        long n3;
        if (f == -1) {
            n3 = 0L;
        }
        else {
            n3 = a2[f];
        }
        if (f != -1) {
            n2 = b[f];
        }
        final int e = this.a.e;
        final long n4 = n3 * 1000000L / e;
        final long b2 = this.b;
        final v v = new v(n4, n2 + b2);
        if (n4 != n && f != a2.length - 1) {
            ++f;
            final long n5 = a2[f];
            n = b[f];
            return new u.a(v, new v(n5 * 1000000L / e, b2 + n));
        }
        return new u.a(v, v);
    }
    
    public final boolean d() {
        return true;
    }
    
    public final long h() {
        return this.a.b();
    }
}
