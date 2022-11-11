// 
// Decompiled by Procyon v0.6.0
// 

package wl2;

import tl2.x;
import tl2.g;
import sm2.a;
import java.math.BigInteger;
import tl2.d;
import tl2.b;
import tl2.f;
import tl2.d$a;

public final class c2 extends d$a
{
    public static final f[] k;
    public d2 j;
    
    static {
        k = new f[] { (f)new a2(b.b) };
    }
    
    public c2() {
        super(233, 74, 0, 0);
        this.j = new d2((d)this, null, null);
        ((d)this).b = (f)new a2(BigInteger.valueOf(0L));
        ((d)this).c = (f)new a2(BigInteger.valueOf(1L));
        ((d)this).d = new BigInteger(1, a.a("8000000000000000000000000000069D5BB915BCD46EFB1AD5F173ABDF"));
        ((d)this).e = BigInteger.valueOf(4L);
        ((d)this).f = 6;
    }
    
    public final d a() {
        return (d)new c2();
    }
    
    public final bd0.a b(final g[] array, final int n) {
        final long[] array2 = new long[n * 4 * 2];
        int n2;
        for (int i = n2 = 0; i < n; ++i) {
            final g g = array[0 + i];
            android.support.v4.media.b.C(((a2)g.b).f, array2, n2);
            n2 += 4;
            android.support.v4.media.b.C(((a2)g.c).f, array2, n2);
            n2 += 4;
        }
        return new b2(this, n, array2);
    }
    
    public final android.support.v4.media.b c() {
        return new x();
    }
    
    public final g e(final f f, final f f2) {
        return (g)new d2((d)this, f, f2);
    }
    
    public final g f(final f f, final f f2, final f[] array) {
        return (g)new d2((d)this, f, f2, array);
    }
    
    public final f j(final BigInteger bigInteger) {
        return (f)new a2(bigInteger);
    }
    
    public final int k() {
        return 233;
    }
    
    public final g l() {
        return (g)this.j;
    }
    
    public final boolean p(final int n) {
        return n == 6;
    }
    
    public final boolean q() {
        return true;
    }
}
