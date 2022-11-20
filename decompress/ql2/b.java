// 
// Decompiled by Procyon v0.6.0
// 

package ql2;

import pl2.g;
import om2.a;
import pl2.f;
import java.math.BigInteger;
import pl2.d$b;

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
        m = new f[] { (f)new c(pl2.b.b), (f)new c(bigInteger) };
    }
    
    public b() {
        super(b.j);
        this.i = new d((pl2.d)this, null, null);
        ((pl2.d)this).b = (f)new c(b.k);
        ((pl2.d)this).c = (f)new c(b.l);
        ((pl2.d)this).d = new BigInteger(1, a.a("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        ((pl2.d)this).e = BigInteger.valueOf(8L);
        ((pl2.d)this).f = 4;
    }
    
    public final pl2.d a() {
        return (pl2.d)new b();
    }
    
    public final android.support.v4.media.b b(final g[] array, final int n) {
        final int[] array2 = new int[n * 8 * 2];
        int i = 0;
        int n2 = 0;
        while (i < n) {
            final g g = array[0 + i];
            android.support.v4.media.b.k1(n2, ((c)g.b).f, array2);
            n2 += 8;
            android.support.v4.media.b.k1(n2, ((c)g.c).f, array2);
            n2 += 8;
            ++i;
        }
        return new ql2.a(this, n, array2);
    }
    
    public final g e(final f f, final f f2) {
        return (g)new d((pl2.d)this, f, f2);
    }
    
    public final g f(final f f, final f f2, final f[] array) {
        return (g)new d((pl2.d)this, f, f2, array);
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
