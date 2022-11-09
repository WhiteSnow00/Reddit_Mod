// 
// Decompiled by Procyon v0.6.0
// 

package u2;

import mj2.c0;

public final class j
{
    public static final k[] b;
    public static final long c;
    public final long a = a;
    
    static {
        b = new k[] { new k(0L), new k(4294967296L), new k(8589934592L) };
        c = c0.O(Float.NaN, 0L);
    }
    
    public static final boolean a(final long n, final long n2) {
        return n == n2;
    }
    
    public static final long b(final long n) {
        return j.b[(int)((n & 0xFF00000000L) >>> 32)].a;
    }
    
    public static final float c(final long n) {
        return Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
    }
    
    public static String d(final long n) {
        final long b = b(n);
        String s;
        if (k.a(b, 0L)) {
            s = "Unspecified";
        }
        else if (k.a(b, 4294967296L)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(c(n));
            sb.append(".sp");
            s = sb.toString();
        }
        else if (k.a(b, 8589934592L)) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(c(n));
            sb2.append(".em");
            s = sb2.toString();
        }
        else {
            s = "Invalid";
        }
        return s;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final long a = this.a;
        final boolean b = o instanceof j;
        boolean b2 = false;
        if (b) {
            if (a == ((j)o).a) {
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
        return d(this.a);
    }
}
