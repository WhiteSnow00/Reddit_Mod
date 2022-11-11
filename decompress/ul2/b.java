// 
// Decompiled by Procyon v0.6.0
// 

package ul2;

import tl2.g;
import sm2.a;
import tl2.f;
import java.math.BigInteger;
import tl2.d$b;

public final class b extends d$b
{
    public static final BigInteger j;
    public static final BigInteger k;
    public static final BigInteger l;
    public static final f[] m;
    public d i;
    
    static {
        j = c.g;
        final BigInteger bigInteger = k = new BigInteger(1, a.a("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144"));
        l = new BigInteger(1, a.a("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864"));
        m = new f[] { (f)new c(tl2.b.b), (f)new c(bigInteger) };
    }
    
    public b() {
        super(b.j);
        this.i = new d((tl2.d)this, null, null);
        ((tl2.d)this).b = (f)new c(b.k);
        ((tl2.d)this).c = (f)new c(b.l);
        ((tl2.d)this).d = new BigInteger(1, a.a("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        ((tl2.d)this).e = BigInteger.valueOf(8L);
        ((tl2.d)this).f = 4;
    }
    
    public final tl2.d a() {
        return (tl2.d)new b();
    }
    
    public final bd0.a b(final g[] array, final int n) {
        final int[] array2 = new int[n * 8 * 2];
        int n2;
        for (int i = n2 = 0; i < n; ++i) {
            final g g = array[0 + i];
            android.support.v4.media.b.y(n2, ((c)g.b).f, array2);
            n2 += 8;
            android.support.v4.media.b.y(n2, ((c)g.c).f, array2);
            n2 += 8;
        }
        return new ul2.a(this, n, array2);
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
        return n == 4;
    }
}
