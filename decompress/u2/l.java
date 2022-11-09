// 
// Decompiled by Procyon v0.6.0
// 

package u2;

import a40.f;
import aj2.c;

public final class l
{
    public static final long b;
    public final long a = a;
    
    static {
        b = aj2.c.g(0.0f, 0.0f);
    }
    
    public static long a(final long n, float b, float c, final int n2) {
        if ((n2 & 0x1) != 0x0) {
            b = b(n);
        }
        if ((n2 & 0x2) != 0x0) {
            c = c(n);
        }
        return c.g(b, c);
    }
    
    public static final float b(final long n) {
        return Float.intBitsToFloat((int)(n >> 32));
    }
    
    public static final float c(final long n) {
        return Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
    }
    
    public static final long d(final long n, final long n2) {
        return aj2.c.g(b(n) - b(n2), c(n) - c(n2));
    }
    
    public static final long e(final long n, final long n2) {
        return aj2.c.g(b(n2) + b(n), c(n2) + c(n));
    }
    
    @Override
    public final boolean equals(final Object o) {
        final long a = this.a;
        final boolean b = o instanceof l;
        boolean b2 = false;
        if (b) {
            if (a == ((l)o).a) {
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
        final long a = this.a;
        final StringBuilder q = f.q('(');
        q.append(b(a));
        q.append(", ");
        q.append(c(a));
        q.append(") px/sec");
        return q.toString();
    }
}
