// 
// Decompiled by Procyon v0.6.0
// 

package pl2;

import java.math.BigInteger;
import tl2.c;
import android.support.v4.media.b;

public final class k extends b
{
    public final d g;
    public final c h;
    
    public k(final d g, final c h) {
        if (g != null && g.d != null) {
            this.g = g;
            this.h = h;
            return;
        }
        throw new IllegalArgumentException("Need curve with known group order");
    }
    
    public final g l2(g d2, final BigInteger bigInteger) {
        if (this.g.i(d2.a)) {
            final BigInteger[] a = this.h.a(bigInteger.mod(d2.a.d));
            int n = 0;
            final BigInteger bigInteger2 = a[0];
            boolean b = true;
            final BigInteger bigInteger3 = a[1];
            this.h.b();
            final c h = this.h;
            final boolean b2 = bigInteger2.signum() < 0;
            if (bigInteger3.signum() >= 0) {
                b = false;
            }
            final BigInteger abs = bigInteger2.abs();
            final BigInteger abs2 = bigInteger3.abs();
            final int max = Math.max(abs.bitLength(), abs2.bitLength());
            for (int[] a2 = t.a; n < 6 && max >= a2[n]; ++n) {}
            final s c = t.c(d2, Math.max(2, Math.min(8, n + 2)));
            d2 = android.support.v4.media.b.d2(h, d2);
            final s s = (s)d2.a.o(d2, "bc_wnaf", (m)new v(c, h.c()));
            final int min = Math.min(8, c.f);
            final int min2 = Math.min(8, s.f);
            g[] array;
            if (b2) {
                array = c.d;
            }
            else {
                array = c.c;
            }
            g[] array2;
            if (b) {
                array2 = s.d;
            }
            else {
                array2 = s.c;
            }
            g[] array3;
            if (b2) {
                array3 = c.c;
            }
            else {
                array3 = c.d;
            }
            g[] array4;
            if (b) {
                array4 = s.c;
            }
            else {
                array4 = s.d;
            }
            return pl2.a.c(array, array3, t.b(min, abs), array2, array4, t.b(min2, abs2));
        }
        throw new IllegalStateException();
    }
}
