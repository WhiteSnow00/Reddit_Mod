// 
// Decompiled by Procyon v0.6.0
// 

package wl2;

import tl2.g;
import sm2.a;
import tl2.f;
import java.math.BigInteger;
import tl2.d$b;

public final class b extends d$b
{
    public static final BigInteger j;
    public static final f[] k;
    public d i;
    
    static {
        j = c.g;
        k = new f[] { (f)new c(tl2.b.b) };
    }
    
    public b() {
        super(b.j);
        this.i = new d((tl2.d)this, null, null);
        ((tl2.d)this).b = (f)new c(new BigInteger(1, a.a("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
        ((tl2.d)this).c = (f)new c(new BigInteger(1, a.a("E87579C11079F43DD824993C2CEE5ED3")));
        ((tl2.d)this).d = new BigInteger(1, a.a("FFFFFFFE0000000075A30D1B9038A115"));
        ((tl2.d)this).e = BigInteger.valueOf(1L);
        ((tl2.d)this).f = 2;
    }
    
    public final tl2.d a() {
        return (tl2.d)new b();
    }
    
    public final bd0.a b(final g[] array, final int n) {
        final int[] array2 = new int[n * 4 * 2];
        int n2;
        for (int i = n2 = 0; i < n; ++i) {
            final g g = array[0 + i];
            android.support.v4.media.b.w(n2, ((c)g.b).f, array2);
            n2 += 4;
            android.support.v4.media.b.w(n2, ((c)g.c).f, array2);
            n2 += 4;
        }
        return new wl2.a(this, n, array2);
    }
    
    public final g e(final f f, final f f2) {
        return (g)new d((tl2.d)this, f, f2);
    }
    
    public final g f(final f f, final f f2, final f[] array) {
        return (g)new d((tl2.d)this, f, f2, array);
    }
    
    public final f j(final BigInteger bigInteger) {
        return (f)new c(bigInteger);
    }
    
    public final int k() {
        return b.j.bitLength();
    }
    
    public final g l() {
        return (g)this.i;
    }
    
    public final boolean p(final int n) {
        return n == 2;
    }
}
