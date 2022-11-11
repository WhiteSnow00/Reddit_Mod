// 
// Decompiled by Procyon v0.6.0
// 

package wl2;

import android.support.v4.media.c;
import tl2.g;
import sm2.a;
import tl2.d;
import tl2.b;
import tl2.f;
import java.math.BigInteger;
import tl2.d$b;

public final class c0 extends d$b
{
    public static final BigInteger j;
    public static final f[] k;
    public e0 i;
    
    static {
        j = d0.g;
        k = new f[] { (f)new d0(b.b) };
    }
    
    public c0() {
        super(c0.j);
        this.i = new e0((d)this, (f)null, (f)null);
        ((d)this).b = (f)new d0(new BigInteger(1, a.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE")));
        ((d)this).c = (f)new d0(new BigInteger(1, a.a("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4")));
        ((d)this).d = new BigInteger(1, a.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D"));
        ((d)this).e = BigInteger.valueOf(1L);
        ((d)this).f = 2;
    }
    
    public final d a() {
        return (d)new c0();
    }
    
    public final bd0.a b(final g[] array, final int n) {
        final int[] array2 = new int[n * 7 * 2];
        int n2;
        for (int i = n2 = 0; i < n; ++i) {
            final g g = array[0 + i];
            c.X(n2, ((d0)g.b).f, array2);
            n2 += 7;
            c.X(n2, ((d0)g.c).f, array2);
            n2 += 7;
        }
        return new b0(this, n, array2);
    }
    
    public final g e(final f f, final f f2) {
        return (g)new e0((d)this, f, f2);
    }
    
    public final g f(final f f, final f f2, final f[] array) {
        return (g)new e0((d)this, f, f2, array);
    }
    
    public final f j(final BigInteger bigInteger) {
        return (f)new d0(bigInteger);
    }
    
    public final int k() {
        return c0.j.bitLength();
    }
    
    public final g l() {
        return (g)this.i;
    }
    
    public final boolean p(final int n) {
        return n == 2;
    }
}
