// 
// Decompiled by Procyon v0.6.0
// 

package cb;

import ad.c0;
import ad.d0;

public final class s implements u
{
    public final long[] a;
    public final long[] b;
    public final long c;
    public final boolean d;
    
    public s(final long c, final long[] a, final long[] b) {
        d0.c(a.length == b.length);
        final int length = b.length;
        final boolean d = length > 0;
        this.d = d;
        if (d && b[0] > 0L) {
            final int n = length + 1;
            final long[] a2 = new long[n];
            this.a = a2;
            final long[] b2 = new long[n];
            this.b = b2;
            System.arraycopy(a, 0, a2, 1, length);
            System.arraycopy(b, 0, b2, 1, length);
        }
        else {
            this.a = a;
            this.b = b;
        }
        this.c = c;
    }
    
    public final u.a c(final long n) {
        if (!this.d) {
            final v c = v.c;
            return new u.a(c, c);
        }
        int f = c0.f(this.b, n, true);
        final long[] b = this.b;
        final long n2 = b[f];
        final long[] a = this.a;
        final v v = new v(n2, a[f]);
        if (n2 != n && f != b.length - 1) {
            ++f;
            return new u.a(v, new v(b[f], a[f]));
        }
        return new u.a(v, v);
    }
    
    public final boolean d() {
        return this.d;
    }
    
    public final long h() {
        return this.c;
    }
}
