// 
// Decompiled by Procyon v0.6.0
// 

package tl2;

import bd0.a;
import lq0.k;
import java.math.BigInteger;
import android.support.v4.media.b;

public final class h extends b
{
    public final g v0(g g, final BigInteger bigInteger) {
        final d a = g.a;
        final int i = k.I(a);
        if (bigInteger.bitLength() <= i) {
            final d a2 = g.a;
            final i j = (i)a2.o(g, "bc_fixed_point", (m)new j(a2, g));
            final a b = j.b;
            final int c = j.c;
            final int n = (i + c - 1) / c;
            g = a.l();
            final int n2 = c * n;
            final int[] l = android.support.v4.media.b.L(n2, bigInteger);
            for (int k = 0; k < n; ++k) {
                int n3 = n2 - 1 - k;
                int n4 = 0;
                while (n3 >= 0) {
                    final int n5 = l[n3 >>> 5] >>> (n3 & 0x1F);
                    n4 = ((n4 ^ n5 >>> 1) << 1 ^ n5);
                    n3 -= n;
                }
                g = g.w(b.C0(n4));
            }
            return g.a(j.a);
        }
        throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
    }
}
