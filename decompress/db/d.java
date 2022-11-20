// 
// Decompiled by Procyon v0.6.0
// 

package db;

public class d implements u
{
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;
    
    public d(final int e, long n, final int n2, final long b, final boolean g) {
        this.a = n;
        this.b = b;
        int c = n2;
        if (n2 == -1) {
            c = 1;
        }
        this.c = c;
        this.e = e;
        this.g = g;
        if (n == -1L) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        }
        else {
            n -= b;
            this.d = n;
            this.f = Math.max(0L, n) * 8L * 1000000L / e;
        }
    }
    
    public final u$a d(long n) {
        final long d = this.d;
        final long n2 = lcmp(d, -1L);
        if (n2 == 0 && !this.g) {
            final v v = new v(0L, this.b);
            return new u$a(v, v);
        }
        final long n3 = this.e * n / 8000000L;
        final long n4 = this.c;
        long min = n3 / n4 * n4;
        if (n2 != 0) {
            min = Math.min(min, d - n4);
        }
        final long max = Math.max(min, 0L);
        final long b = this.b;
        final long n5 = max + b;
        final long n6 = Math.max(0L, n5 - b) * 8L * 1000000L / this.e;
        final v v2 = new v(n6, n5);
        if (this.d != -1L && n6 < n) {
            n = this.c + n5;
            if (n < this.a) {
                return new u$a(v2, new v(Math.max(0L, n - this.b) * 8L * 1000000L / this.e, n));
            }
        }
        return new u$a(v2, v2);
    }
    
    public final boolean e() {
        return this.d != -1L || this.g;
    }
    
    public final long i() {
        return this.f;
    }
}
