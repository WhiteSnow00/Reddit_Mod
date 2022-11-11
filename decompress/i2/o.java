// 
// Decompiled by Procyon v0.6.0
// 

package i2;

import wd.a;

public final class o
{
    public static final long b;
    public final long a = a;
    
    static {
        b = a.i(0, 0);
    }
    
    public static final boolean a(final long n, final long n2) {
        return n == n2;
    }
    
    public static final boolean b(final long n) {
        return (int)(n >> 32) == c(n);
    }
    
    public static final int c(final long n) {
        return (int)(n & 0xFFFFFFFFL);
    }
    
    public static final int d(final long n) {
        return e(n) - f(n);
    }
    
    public static final int e(final long n) {
        int c = (int)(n >> 32);
        if (c <= c(n)) {
            c = c(n);
        }
        return c;
    }
    
    public static final int f(final long n) {
        int c;
        if ((c = (int)(n >> 32)) > c(n)) {
            c = c(n);
        }
        return c;
    }
    
    public static final boolean g(final long n) {
        return (int)(n >> 32) > c(n);
    }
    
    public static String h(final long n) {
        final StringBuilder r = a.r("TextRange(");
        r.append((int)(n >> 32));
        r.append(", ");
        r.append(c(n));
        r.append(')');
        return r.toString();
    }
    
    @Override
    public final boolean equals(final Object o) {
        final long a = this.a;
        final boolean b = o instanceof o;
        boolean b2 = false;
        if (b) {
            if (a == ((o)o).a) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return h(this.a);
    }
}
