// 
// Decompiled by Procyon v0.6.0
// 

package n1;

import yd.a;

public final class c
{
    public static final long b;
    public static final long c;
    public static final long d;
    public final long a = a;
    
    static {
        new a();
        b = yd.a.y0(0.0f, 0.0f);
        c = yd.a.y0(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
        d = yd.a.y0(Float.NaN, Float.NaN);
    }
    
    public static final boolean a(final long n, final long n2) {
        return n == n2;
    }
    
    public static final float b(final long n) {
        return (float)Math.sqrt(d(n) * d(n) + c(n) * c(n));
    }
    
    public static final float c(final long n) {
        if (n != n1.c.d) {
            return Float.intBitsToFloat((int)(n >> 32));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }
    
    public static final float d(final long n) {
        if (n != n1.c.d) {
            return Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }
    
    public static final long e(final long n, final long n2) {
        return yd.a.y0(c(n) - c(n2), d(n) - d(n2));
    }
    
    public static final long f(final long n, final long n2) {
        return yd.a.y0(c(n2) + c(n), d(n2) + d(n));
    }
    
    public static final long g(final float n, final long n2) {
        return yd.a.y0(c(n2) * n, d(n2) * n);
    }
    
    public static String h(final long n) {
        String string;
        if (yd.a.N1(n)) {
            final StringBuilder k = a.k("Offset(");
            k.append(a80.a.M0(c(n)));
            k.append(", ");
            k.append(a80.a.M0(d(n)));
            k.append(')');
            string = k.toString();
        }
        else {
            string = "Offset.Unspecified";
        }
        return string;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final long a = this.a;
        final boolean b = o instanceof c;
        boolean b2 = false;
        if (b) {
            if (a == ((c)o).a) {
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
    
    public static final class a
    {
    }
}
