// 
// Decompiled by Procyon v0.6.0
// 

package pl2;

import android.support.v4.media.b;
import oi2.d0;
import java.math.BigInteger;

public final class a
{
    public static void a(final g g) {
        if (g.i(false, false)) {
            return;
        }
        throw new IllegalStateException("Invalid result");
    }
    
    public static g b(g g, final BigInteger bigInteger, final g g2, final BigInteger bigInteger2) {
        final boolean b = bigInteger.signum() < 0;
        final boolean b2 = bigInteger2.signum() < 0;
        final BigInteger abs = bigInteger.abs();
        final BigInteger abs2 = bigInteger2.abs();
        int bitLength;
        int[] a;
        int n;
        for (bitLength = abs.bitLength(), a = t.a, n = 0; n < 6 && bitLength >= a[n]; ++n) {}
        final int max = Math.max(2, Math.min(8, n + 2));
        int bitLength2;
        int[] a2;
        int n2;
        for (bitLength2 = abs2.bitLength(), a2 = t.a, n2 = 0; n2 < 6 && bitLength2 >= a2[n2]; ++n2) {}
        final int max2 = Math.max(2, Math.min(8, n2 + 2));
        final s c = t.c(g, max);
        final s c2 = t.c(g2, max2);
        final int m = d0.m(g.a);
        if (b || b2 || bigInteger.bitLength() > m || bigInteger2.bitLength() > m || c.a > 0 || c2.a > 0) {
            final int min = Math.min(8, c.f);
            final int min2 = Math.min(8, c2.f);
            g[] array;
            if (b) {
                array = c.d;
            }
            else {
                array = c.c;
            }
            g[] array2;
            if (b2) {
                array2 = c2.d;
            }
            else {
                array2 = c2.c;
            }
            g[] array3;
            if (b) {
                array3 = c.c;
            }
            else {
                array3 = c.d;
            }
            g[] array4;
            if (b2) {
                array4 = c2.c;
            }
            else {
                array4 = c2.d;
            }
            return c(array, array3, t.b(min, abs), array2, array4, t.b(min2, abs2));
        }
        final d a3 = g.a;
        final int i = d0.m(a3);
        if (bigInteger.bitLength() <= i && bigInteger2.bitLength() <= i) {
            final d a4 = g.a;
            final i j = (i)a4.o(g, "bc_fixed_point", (m)new j(a4, g));
            final d a5 = g2.a;
            final i k = (i)a5.o(g2, "bc_fixed_point", (m)new j(a5, g2));
            final b b3 = j.b;
            final b b4 = k.b;
            final int c3 = j.c;
            g g3;
            if (c3 != k.c) {
                final h h = new h();
                g = h.k2(g, bigInteger);
                g3 = h.k2(g2, bigInteger2);
            }
            else {
                final int n3 = (i + c3 - 1) / c3;
                g = a3.l();
                final int n4 = c3 * n3;
                final int[] y1 = android.support.v4.media.b.y1(n4, bigInteger);
                final int[] y2 = android.support.v4.media.b.y1(n4, bigInteger2);
                for (int l = 0; l < n3; ++l) {
                    int n5 = n4 - 1 - l;
                    int n6 = 0;
                    int n7 = 0;
                    while (n5 >= 0) {
                        final int n8 = n5 >>> 5;
                        final int n9 = y1[n8];
                        final int n10 = n5 & 0x1F;
                        final int n11 = n9 >>> n10;
                        n6 = ((n6 ^ n11 >>> 1) << 1 ^ n11);
                        final int n12 = y2[n8] >>> n10;
                        n7 = ((n7 ^ n12 >>> 1) << 1 ^ n12);
                        n5 -= n3;
                    }
                    g = g.w(b3.c2(n6).a(b4.c2(n7)));
                }
                g = g.a(j.a);
                g3 = k.a;
            }
            return g.a(g3);
        }
        throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
    }
    
    public static g c(final g[] array, final g[] array2, final byte[] array3, final g[] array4, final g[] array5, final byte[] array6) {
        final int max = Math.max(array3.length, array6.length);
        final g l = array[0].a.l();
        int i = max - 1;
        int n = 0;
        g w = l;
        while (i >= 0) {
            byte b;
            if (i < array3.length) {
                b = array3[i];
            }
            else {
                b = 0;
            }
            byte b2;
            if (i < array6.length) {
                b2 = array6[i];
            }
            else {
                b2 = 0;
            }
            if ((b | b2) == 0x0) {
                ++n;
            }
            else {
                g a;
                if (b != 0) {
                    final int abs = Math.abs(b);
                    g[] array7;
                    if (b < 0) {
                        array7 = array2;
                    }
                    else {
                        array7 = array;
                    }
                    a = l.a(array7[abs >>> 1]);
                }
                else {
                    a = l;
                }
                g a2 = a;
                if (b2 != 0) {
                    final int abs2 = Math.abs(b2);
                    g[] array8;
                    if (b2 < 0) {
                        array8 = array5;
                    }
                    else {
                        array8 = array4;
                    }
                    a2 = a.a(array8[abs2 >>> 1]);
                }
                int n2 = n;
                g u = w;
                if (n > 0) {
                    u = w.u(n);
                    n2 = 0;
                }
                w = u.w(a2);
                n = n2;
            }
            --i;
        }
        g u2 = w;
        if (n > 0) {
            u2 = w.u(n);
        }
        return u2;
    }
    
    public static g d(final boolean[] array, final s[] array2, final byte[][] array3) {
        final int length = array3.length;
        int i = 0;
        int max = 0;
        while (i < length) {
            max = Math.max(max, array3[i].length);
            ++i;
        }
        final g l = array2[0].c[0].a.l();
        int j = max - 1;
        int n = 0;
        g w = l;
        while (j >= 0) {
            int k = 0;
            g g = l;
            while (k < length) {
                final byte[] array4 = array3[k];
                byte b;
                if (j < array4.length) {
                    b = array4[j];
                }
                else {
                    b = 0;
                }
                g a = g;
                if (b != 0) {
                    final int abs = Math.abs(b);
                    final s s = array2[k];
                    g[] array5;
                    if (b < 0 == array[k]) {
                        array5 = s.c;
                    }
                    else {
                        array5 = s.d;
                    }
                    a = g.a(array5[abs >>> 1]);
                }
                ++k;
                g = a;
            }
            if (g == l) {
                ++n;
            }
            else {
                int n2 = n;
                g u = w;
                if (n > 0) {
                    u = w.u(n);
                    n2 = 0;
                }
                w = u.w(g);
                n = n2;
            }
            --j;
        }
        g u2 = w;
        if (n > 0) {
            u2 = w.u(n);
        }
        return u2;
    }
}
