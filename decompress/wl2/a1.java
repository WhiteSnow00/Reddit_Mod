// 
// Decompiled by Procyon v0.6.0
// 

package wl2;

import tl2.g;
import java.math.BigInteger;
import sm2.a;
import tl2.d;
import tl2.b;
import tl2.f;
import tl2.d$a;

public final class a1 extends d$a
{
    public static final f[] k;
    public b1 j;
    
    static {
        k = new f[] { new v0(b.b) };
    }
    
    public a1() {
        super(113, 9, 0, 0);
        this.j = new b1((d)this, null, null);
        ((d)this).b = new v0(new BigInteger(1, a.a("00689918DBEC7E5A0DD6DFC0AA55C7")));
        ((d)this).c = new v0(new BigInteger(1, a.a("0095E9A9EC9B297BD4BF36E059184F")));
        ((d)this).d = new BigInteger(1, a.a("010000000000000108789B2496AF93"));
        ((d)this).e = BigInteger.valueOf(2L);
        ((d)this).f = 6;
    }
    
    public final d a() {
        return (d)new a1();
    }
    
    public final bd0.a b(final g[] array, final int n) {
        final long[] array2 = new long[n * 2 * 2];
        int n2;
        for (int i = n2 = 0; i < n; ++i) {
            final g g = array[0 + i];
            android.support.v4.media.b.z(((v0)g.b).f, array2, n2);
            n2 += 2;
            android.support.v4.media.b.z(((v0)g.c).f, array2, n2);
            n2 += 2;
        }
        return (bd0.a)new z0(this, n, array2);
    }
    
    public final g e(final f f, final f f2) {
        return (g)new b1((d)this, f, f2);
    }
    
    public final g f(final f f, final f f2, final f[] array) {
        return (g)new b1((d)this, f, f2, array);
    }
    
    public final f j(final BigInteger bigInteger) {
        return new v0(bigInteger);
    }
    
    public final int k() {
        return 113;
    }
    
    public final g l() {
        return (g)this.j;
    }
    
    public final boolean p(final int n) {
        return n == 6;
    }
    
    public final boolean q() {
        return false;
    }
}
