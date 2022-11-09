// 
// Decompiled by Procyon v0.6.0
// 

package u2;

import dg.d;

public final class f
{
    public static final long b;
    public static final long c;
    public final long a = a;
    
    static {
        final float n = 0;
        b = dg.d.z(n, n);
        c = dg.d.z(Float.NaN, Float.NaN);
    }
    
    public static final float a(final long n) {
        if (n != f.c) {
            return Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }
    
    public static final float b(final long n) {
        if (n != f.c) {
            return Float.intBitsToFloat((int)(n >> 32));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }
    
    public static String c(final long n) {
        String string;
        if (n != f.c) {
            final StringBuilder sb = new StringBuilder();
            sb.append((Object)u2.d.b(b(n)));
            sb.append(" x ");
            sb.append((Object)u2.d.b(a(n)));
            string = sb.toString();
        }
        else {
            string = "DpSize.Unspecified";
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
        return c(this.a);
    }
}
