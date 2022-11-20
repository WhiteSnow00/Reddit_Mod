// 
// Decompiled by Procyon v0.6.0
// 

package vi2;

public final class b<V>
{
    public static final b<Object> f;
    public final long a;
    public final V b;
    public final b<V> c;
    public final b<V> d;
    public final int e;
    
    static {
        f = new b<Object>();
    }
    
    public b() {
        this.e = 0;
        this.a = 0L;
        this.b = null;
        this.c = null;
        this.d = null;
    }
    
    public b(final long a, final V b, final b<V> c, final b<V> d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = c.e + 1 + d.e;
    }
    
    public final V a(final long n) {
        if (this.e == 0) {
            return null;
        }
        final long a = this.a;
        if (n < a) {
            return this.c.a(n - a);
        }
        if (n > a) {
            return this.d.a(n - a);
        }
        return this.b;
    }
    
    public final b b(final long n, final a a) {
        if (this.e == 0) {
            return new b(n, (V)a, this, this);
        }
        final long a2 = this.a;
        final long n2 = lcmp(n, a2);
        if (n2 < 0) {
            return this.c(this.c.b(n - a2, a), this.d);
        }
        if (n2 > 0) {
            return this.c(this.c, this.d.b(n - a2, a));
        }
        if (a == this.b) {
            return this;
        }
        return new b(n, (V)a, this.c, this.d);
    }
    
    public final b<V> c(final b<V> b, final b<V> b2) {
        if (b == this.c && b2 == this.d) {
            return this;
        }
        final long a = this.a;
        final V b3 = this.b;
        final int e = b.e;
        final int e2 = b2.e;
        if (e + e2 > 1) {
            if (e >= e2 * 5) {
                final b<Object> c = (b<Object>)b.c;
                final b<Object> d = (b<Object>)b.d;
                if (d.e < c.e * 2) {
                    final long a2 = b.a;
                    return new b(a2 + a, b.b, c, new b<Object>(-a2, b3, d.d(d.a + a2), (b<Object>)b2));
                }
                final b<Object> c2 = d.c;
                final b<Object> d2 = d.d;
                final long a3 = d.a;
                final long a4 = b.a;
                final Object b5 = d.b;
                final b b6 = new b<Object>(-a3, b.b, c, c2.d(c2.a + a3));
                final long a5 = b.a;
                final long n = -a5;
                final long a6 = d.a;
                return new b(a4 + a3 + a, b5, (b<Object>)b6, new b<Object>(n - a6, b3, d2.d(d2.a + a6 + a5), (b<Object>)b2));
            }
            else if (e2 >= e * 5) {
                final b<Object> c3 = (b<Object>)b2.c;
                final b<Object> d3 = (b<Object>)b2.d;
                if (c3.e < d3.e * 2) {
                    final long a7 = b2.a;
                    return new b(a7 + a, b2.b, new b<Object>(-a7, b3, (b<Object>)b, c3.d(c3.a + a7)), d3);
                }
                final b<Object> c4 = c3.c;
                final b<Object> d4 = c3.d;
                final long a8 = c3.a;
                final long a9 = b2.a;
                final Object b7 = c3.b;
                final b b8 = new b<Object>(-a9 - a8, b3, (b<Object>)b, c4.d(c4.a + a8 + a9));
                final long a10 = c3.a;
                return new b(a8 + a9 + a, b7, (b<Object>)b8, new b<Object>(-a10, b2.b, d4.d(d4.a + a10), d3));
            }
        }
        return new b(a, b3, (b<Object>)b, (b<Object>)b2);
    }
    
    public final b<V> d(final long n) {
        if (this.e != 0 && n != this.a) {
            return new b<V>(n, this.b, this.c, this.d);
        }
        return this;
    }
}
