// 
// Decompiled by Procyon v0.6.0
// 

package bd;

import java.util.Arrays;

public final class z<V>
{
    public long[] a;
    public V[] b;
    public int c;
    public int d;
    
    public z() {
        this.a = new long[10];
        this.b = (V[])new Object[10];
    }
    
    public final void a(final long n, final V v) {
        synchronized (this) {
            final int d = this.d;
            if (d > 0 && n <= this.a[(this.c + d - 1) % this.b.length]) {
                this.b();
            }
            this.c();
            final int c = this.c;
            final int d2 = this.d;
            final V[] b = this.b;
            final int n2 = (c + d2) % b.length;
            this.a[n2] = n;
            b[n2] = v;
            this.d = d2 + 1;
        }
    }
    
    public final void b() {
        synchronized (this) {
            this.c = 0;
            this.d = 0;
            Arrays.fill(this.b, null);
        }
    }
    
    public final void c() {
        final int length = this.b.length;
        if (this.d < length) {
            return;
        }
        final int n = length * 2;
        final long[] a = new long[n];
        final Object[] b = new Object[n];
        final int c = this.c;
        final int n2 = length - c;
        System.arraycopy(this.a, c, a, 0, n2);
        System.arraycopy(this.b, this.c, b, 0, n2);
        final int c2 = this.c;
        if (c2 > 0) {
            System.arraycopy(this.a, 0, a, n2, c2);
            System.arraycopy(this.b, 0, b, n2, this.c);
        }
        this.a = a;
        this.b = (V[])b;
        this.c = 0;
    }
    
    public final V d(final long n, final boolean b) {
        V e = null;
        long n2 = Long.MAX_VALUE;
        while (this.d > 0) {
            final long n3 = n - this.a[this.c];
            if (n3 < 0L) {
                if (b) {
                    break;
                }
                if (-n3 >= n2) {
                    break;
                }
            }
            e = this.e();
            n2 = n3;
        }
        return e;
    }
    
    public final V e() {
        d0.f(this.d > 0);
        final V[] b = this.b;
        final int c = this.c;
        final V v = b[c];
        b[c] = null;
        this.c = (c + 1) % b.length;
        --this.d;
        return v;
    }
}
