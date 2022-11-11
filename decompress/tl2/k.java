// 
// Decompiled by Procyon v0.6.0
// 

package tl2;

import java.math.BigInteger;
import xl2.c;
import android.support.v4.media.b;

public final class k extends b
{
    public final d f;
    public final c g;
    
    public k(final d f, final c g) {
        if (f != null && f.d != null) {
            this.f = f;
            this.g = g;
            return;
        }
        throw new IllegalArgumentException("Need curve with known group order");
    }
    
    public final g v0(g c0, final BigInteger bigInteger) {
        if (this.f.i(c0.a)) {
            final BigInteger[] a = this.g.a(bigInteger.mod(c0.a.d));
            int n = 0;
            final BigInteger bigInteger2 = a[0];
            boolean b = true;
            final BigInteger bigInteger3 = a[1];
            this.g.b();
            final c g = this.g;
            final boolean b2 = bigInteger2.signum() < 0;
            if (bigInteger3.signum() >= 0) {
                b = false;
            }
            final BigInteger abs = bigInteger2.abs();
            final BigInteger abs2 = bigInteger3.abs();
            final int max = Math.max(abs.bitLength(), abs2.bitLength());
            for (int[] a2 = t.a; n < 6 && max >= a2[n]; ++n) {}
            final s c2 = t.c(c0, Math.max(2, Math.min(8, n + 2)));
            c0 = android.support.v4.media.c.C0(g, c0);
            final s s = (s)c0.a.o(c0, "bc_wnaf", (m)new v(c2, g.c()));
            final int min = Math.min(8, c2.f);
            final int min2 = Math.min(8, s.f);
            g[] array;
            if (b2) {
                array = c2.d;
            }
            else {
                array = c2.c;
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
                array3 = c2.c;
            }
            else {
                array3 = c2.d;
            }
            g[] array4;
            if (b) {
                array4 = s.c;
            }
            else {
                array4 = s.d;
            }
            return tl2.a.c(array, array3, t.b(min, abs), array2, array4, t.b(min2, abs2));
        }
        throw new IllegalStateException();
    }
}
