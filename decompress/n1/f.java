// 
// Decompiled by Procyon v0.6.0
// 

package n1;

import a80.a;

public final class f
{
    public static final long b;
    public static final long c;
    public final long a = a;
    
    static {
        b = a.f(0.0f, 0.0f);
        c = a.f(Float.NaN, Float.NaN);
    }
    
    public static long a(final long n, float e, float c, final int n2) {
        if ((n2 & 0x1) != 0x0) {
            e = e(n);
        }
        if ((n2 & 0x2) != 0x0) {
            c = c(n);
        }
        return a.f(e, c);
    }
    
    public static final boolean b(final long n, final long n2) {
        return n == n2;
    }
    
    public static final float c(final long n) {
        if (n != f.c) {
            return Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }
    
    public static final float d(final long n) {
        return Math.min(Math.abs(e(n)), Math.abs(c(n)));
    }
    
    public static final float e(final long n) {
        if (n != f.c) {
            return Float.intBitsToFloat((int)(n >> 32));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }
    
    public static String f(final long n) {
        String string;
        if (n != f.c) {
            final StringBuilder k = a.k("Size(");
            k.append(a.M0(e(n)));
            k.append(", ");
            k.append(a.M0(c(n)));
            k.append(')');
            string = k.toString();
        }
        else {
            string = "Size.Unspecified";
        }
        return string;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final long a = this.a;
        final boolean b = o instanceof f;
        boolean b2 = false;
        if (b) {
            if (a == ((f)o).a) {
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
        return f(this.a);
    }
}
