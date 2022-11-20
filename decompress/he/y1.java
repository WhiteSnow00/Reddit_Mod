// 
// Decompiled by Procyon v0.6.0
// 

package he;

import sun.misc.Unsafe;

public final class y1 extends a2
{
    public y1(final Unsafe unsafe) {
        super(unsafe);
    }
    
    public final double a(final long n, final Object o) {
        return Double.longBitsToDouble(this.k(n, o));
    }
    
    public final float b(final long n, final Object o) {
        return Float.intBitsToFloat(this.j(n, o));
    }
    
    public final void c(final Object o, final long n, final boolean b) {
        if (b2.g) {
            b2.c(o, n, (byte)(byte)(b ? 1 : 0));
            return;
        }
        b2.d(o, n, (byte)(byte)(b ? 1 : 0));
    }
    
    public final void d(final Object o, final long n, final byte b) {
        if (b2.g) {
            b2.c(o, n, b);
            return;
        }
        b2.d(o, n, b);
    }
    
    public final void e(final Object o, final long n, final double n2) {
        this.o(o, n, Double.doubleToLongBits(n2));
    }
    
    public final void f(final Object o, final long n, final float n2) {
        this.n(o, Float.floatToIntBits(n2), n);
    }
    
    public final boolean g(final long n, final Object o) {
        final boolean g = b2.g;
        boolean b = true;
        final boolean b2 = true;
        if (g) {
            return (byte)(he.b2.c.j(0xFFFFFFFFFFFFFFFCL & n, o) >>> (int)((~n & 0x3L) << 3) & 0xFF) != 0 && b2;
        }
        if ((byte)(he.b2.c.j(0xFFFFFFFFFFFFFFFCL & n, o) >>> (int)((n & 0x3L) << 3) & 0xFF) == 0) {
            b = false;
        }
        return b;
    }
}
