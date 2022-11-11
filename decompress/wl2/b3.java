// 
// Decompiled by Procyon v0.6.0
// 

package wl2;

import tl2.x;
import android.support.v4.media.c;
import tl2.g;
import sm2.a;
import java.math.BigInteger;
import tl2.d;
import tl2.b;
import tl2.f;
import tl2.d$a;

public final class b3 extends d$a
{
    public static final f[] k;
    public c3 j;
    
    static {
        k = new f[] { new z2(b.b) };
    }
    
    public b3() {
        super(571, 2, 5, 10);
        this.j = new c3((d)this, null, null);
        ((d)this).b = new z2(BigInteger.valueOf(0L));
        ((d)this).c = new z2(BigInteger.valueOf(1L));
        ((d)this).d = new BigInteger(1, a.a("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001"));
        ((d)this).e = BigInteger.valueOf(4L);
        ((d)this).f = 6;
    }
    
    public final d a() {
        return (d)new b3();
    }
    
    public final bd0.a b(final g[] array, final int n) {
        final long[] array2 = new long[n * 9 * 2];
        int n2;
        for (int i = n2 = 0; i < n; ++i) {
            final g g = array[0 + i];
            c.a0(((z2)g.b).f, array2, n2);
            n2 += 9;
            c.a0(((z2)g.c).f, array2, n2);
            n2 += 9;
        }
        return new a3(this, n, array2);
    }
    
    public final android.support.v4.media.b c() {
        return new x();
    }
    
    public final g e(final f f, final f f2) {
        return (g)new c3((d)this, f, f2);
    }
    
    public final g f(final f f, final f f2, final f[] array) {
        return (g)new c3((d)this, f, f2, array);
    }
    
    public final f j(final BigInteger bigInteger) {
        return new z2(bigInteger);
    }
    
    public final int k() {
        return 571;
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
