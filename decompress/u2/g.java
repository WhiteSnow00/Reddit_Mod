// 
// Decompiled by Procyon v0.6.0
// 

package u2;

import a40.f;
import at1.a;

public final class g
{
    public static final long b;
    public final long a = a;
    
    static {
        new a();
        b = at1.a.h(0, 0);
    }
    
    public static long a(int n, int b, final long n2, final int n3) {
        if ((n3 & 0x1) != 0x0) {
            n = (int)(n2 >> 32);
        }
        if ((n3 & 0x2) != 0x0) {
            b = b(n2);
        }
        return at1.a.h(n, b);
    }
    
    public static final int b(final long n) {
        return (int)(n & 0xFFFFFFFFL);
    }
    
    public static String c(final long n) {
        final StringBuilder q = f.q('(');
        q.append((int)(n >> 32));
        q.append(", ");
        q.append(b(n));
        q.append(')');
        return q.toString();
    }
    
    @Override
    public final boolean equals(final Object o) {
        final long a = this.a;
        final boolean b = o instanceof g;
        boolean b2 = false;
        if (b) {
            if (a == ((g)o).a) {
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
    
    public static final class a
    {
    }
}
