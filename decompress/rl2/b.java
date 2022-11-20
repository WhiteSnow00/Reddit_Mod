// 
// Decompiled by Procyon v0.6.0
// 

package rl2;

import pl2.g;
import om2.a;
import pl2.f;
import java.math.BigInteger;
import pl2.d$b;

public final class b extends d$b
{
    public static final BigInteger j;
    public static final f[] k;
    public d i;
    
    static {
        j = c.g;
        k = new f[] { (f)new c(pl2.b.b) };
    }
    
    public b() {
        super(b.j);
        this.i = new d((pl2.d)this, null, null);
        ((pl2.d)this).b = (f)new c(new BigInteger(1, a.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC")));
        ((pl2.d)this).c = (f)new c(new BigInteger(1, a.a("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93")));
        ((pl2.d)this).d = new BigInteger(1, a.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123"));
        ((pl2.d)this).e = BigInteger.valueOf(1L);
        ((pl2.d)this).f = 2;
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
        return new rl2.a(this, n, array2);
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
        return n == 2;
    }
}
