// 
// Decompiled by Procyon v0.6.0
// 

package u2;

import a40.f;
import dg.d;

public final class e
{
    public static final long b;
    public static final long c;
    public final long a = a;
    
    static {
        final float n = 0;
        b = dg.d.x(n, n);
        c = dg.d.x(Float.NaN, Float.NaN);
    }
    
    public static final float a(final long n) {
        if (n != e.c) {
            return Float.intBitsToFloat((int)(n >> 32));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }
    
    public static final float b(final long n) {
        if (n != e.c) {
            return Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }
    
    public static String c(final long n) {
        String string;
        if (n != e.c) {
            final StringBuilder q = f.q('(');
            q.append((Object)u2.d.b(a(n)));
            q.append(", ");
            q.append((Object)u2.d.b(b(n)));
            q.append(')');
            string = q.toString();
        }
        else {
            string = "DpOffset.Unspecified";
        }
        return string;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final long a = this.a;
        final boolean b = o instanceof e;
        boolean b2 = false;
        if (b) {
            if (a == ((e)o).a) {
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
