// 
// Decompiled by Procyon v0.6.0
// 

package vl2;

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
        ((tl2.d)this).b = (f)new c(new BigInteger(1, a.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC")));
        ((tl2.d)this).c = (f)new c(new BigInteger(1, a.a("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93")));
        ((tl2.d)this).d = new BigInteger(1, a.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123"));
        ((tl2.d)this).e = BigInteger.valueOf(1L);
        ((tl2.d)this).f = 2;
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
        return new vl2.a(this, n, array2);
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
