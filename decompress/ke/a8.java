// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import sun.misc.Unsafe;

public final class a8 extends c8
{
    public a8(final Unsafe unsafe) {
        super(unsafe);
    }
    
    @Override
    public final double a(final long n, final Object o) {
        return Double.longBitsToDouble(this.k(n, o));
    }
    
    @Override
    public final float b(final long n, final Object o) {
        return Float.intBitsToFloat(this.j(n, o));
    }
    
    @Override
    public final void c(final Object o, final long n, final boolean b) {
        if (d8.g) {
            d8.c(o, n, (byte)(b ? 1 : 0));
            return;
        }
        d8.d(o, n, (byte)(b ? 1 : 0));
    }
    
    @Override
    public final void d(final Object o, final long n, final byte b) {
        if (d8.g) {
            d8.c(o, n, b);
            return;
        }
        d8.d(o, n, b);
    }
    
    @Override
    public final void e(final Object o, final long n, final double n2) {
        this.o(o, n, Double.doubleToLongBits(n2));
    }
    
    @Override
    public final void f(final Object o, final long n, final float n2) {
        this.n(o, Float.floatToIntBits(n2), n);
    }
    
    @Override
    public final boolean g(final long n, final Object o) {
        final boolean g = d8.g;
        final boolean b = true;
        boolean b2 = true;
        if (g) {
            if ((byte)(d8.c.j(0xFFFFFFFFFFFFFFFCL & n, o) >>> (int)((~n & 0x3L) << 3) & 0xFF) == 0) {
                b2 = false;
            }
            return b2;
        }
        return (byte)(d8.c.j(0xFFFFFFFFFFFFFFFCL & n, o) >>> (int)((n & 0x3L) << 3) & 0xFF) != 0 && b;
    }
}
