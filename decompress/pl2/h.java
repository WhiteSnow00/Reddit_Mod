// 
// Decompiled by Procyon v0.6.0
// 

package pl2;

import oi2.d0;
import java.math.BigInteger;
import android.support.v4.media.b;

public final class h extends b
{
    public final g l2(g g, final BigInteger bigInteger) {
        final d a = g.a;
        final int m = d0.m(a);
        if (bigInteger.bitLength() <= m) {
            final d a2 = g.a;
            final i i = (i)a2.o(g, "bc_fixed_point", (m)new j(a2, g));
            final b b = i.b;
            final int c = i.c;
            final int n = (m + c - 1) / c;
            g = a.l();
            final int n2 = c * n;
            final int[] y1 = android.support.v4.media.b.y1(n2, bigInteger);
            for (int j = 0; j < n; ++j) {
                int k = n2 - 1 - j;
                int n3 = 0;
                while (k >= 0) {
                    final int n4 = y1[k >>> 5] >>> (k & 0x1F);
                    n3 = ((n3 ^ n4 >>> 1) << 1 ^ n4);
                    k -= n;
                }
                g = g.w(b.b2(n3));
            }
            return g.a(i.a);
        }
        throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
    }
}
