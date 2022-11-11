// 
// Decompiled by Procyon v0.6.0
// 

package tl2;

import java.math.BigInteger;
import android.support.v4.media.b;

public final class r extends b
{
    public final g v0(g g, final BigInteger bigInteger) {
        BigInteger shiftRight = bigInteger;
        int bitLength;
        int[] a;
        int n;
        for (bitLength = bigInteger.bitLength(), a = t.a, n = 0; n < 6 && bitLength >= a[n]; ++n) {}
        final s c = t.c(g, Math.max(2, Math.min(16, n + 2)));
        final g[] c2 = c.c;
        final g[] d = c.d;
        final int f = c.f;
        int[] array;
        if (f == 2) {
            if (bigInteger.bitLength() >>> 16 != 0) {
                throw new IllegalArgumentException("'k' must have bitlength < 2^16");
            }
            if (bigInteger.signum() == 0) {
                array = t.c;
            }
            else {
                final BigInteger add = shiftRight.shiftLeft(1).add(shiftRight);
                final int bitLength2 = add.bitLength();
                final int n2 = bitLength2 >> 1;
                array = new int[n2];
                final BigInteger xor = add.xor(shiftRight);
                int n4;
                int n3 = n4 = 0;
                for (int i = 1; i < bitLength2 - 1; ++i) {
                    if (!xor.testBit(i)) {
                        ++n4;
                    }
                    else {
                        int n5;
                        if (shiftRight.testBit(i)) {
                            n5 = -1;
                        }
                        else {
                            n5 = 1;
                        }
                        array[n3] = (n4 | n5 << 16);
                        ++i;
                        n4 = 1;
                        ++n3;
                    }
                }
                final int n6 = n3 + 1;
                array[n3] = (0x10000 | n4);
                if (n2 > n6) {
                    final int[] array2 = new int[n6];
                    System.arraycopy(array, 0, array2, 0, n6);
                    array = array2;
                }
            }
        }
        else {
            if (f < 2 || f > 16) {
                throw new IllegalArgumentException("'width' must be in the range [2, 16]");
            }
            if (bigInteger.bitLength() >>> 16 != 0) {
                throw new IllegalArgumentException("'k' must have bitlength < 2^16");
            }
            if (bigInteger.signum() == 0) {
                array = t.c;
            }
            else {
                final int n7 = bigInteger.bitLength() / f + 1;
                array = new int[n7];
                final int n8 = 1 << f;
                final int n9 = 0;
                int n11;
                int n10 = n11 = n9;
                int j = n9;
                while (j <= shiftRight.bitLength()) {
                    if ((shiftRight.testBit(j) ? 1 : 0) == n10) {
                        ++j;
                    }
                    else {
                        shiftRight = shiftRight.shiftRight(j);
                        int n13;
                        final int n12 = n13 = (shiftRight.intValue() & n8 - 1);
                        if (n10 != 0) {
                            n13 = n12 + 1;
                        }
                        if ((n13 & n8 >>> 1) != 0x0) {
                            n10 = 1;
                        }
                        else {
                            n10 = 0;
                        }
                        int n14 = n13;
                        if (n10 != 0) {
                            n14 = n13 - n8;
                        }
                        int n15 = j;
                        if (n11 > 0) {
                            n15 = j - 1;
                        }
                        array[n11] = (n14 << 16 | n15);
                        j = f;
                        ++n11;
                    }
                }
                if (n7 > n11) {
                    final int[] array3 = new int[n11];
                    System.arraycopy(array, 0, array3, 0, n11);
                    array = array3;
                }
            }
        }
        g = g.a.l();
        int length = array.length;
        int k;
        if ((k = length) > 1) {
            --length;
            final int n16 = array[length];
            final int n17 = n16 >> 16;
            int n18 = n16 & 0xFFFF;
            final int abs = Math.abs(n17);
            g[] array4;
            if (n17 < 0) {
                array4 = d;
            }
            else {
                array4 = c2;
            }
            if (abs << 2 < 1 << f) {
                final int n19 = 32 - Integer.numberOfLeadingZeros(abs);
                final int n20 = f - n19;
                g = array4[(1 << f - 1) - 1 >>> 1].a(array4[((abs ^ 1 << n19 - 1) << n20) + 1 >>> 1]);
                n18 -= n20;
            }
            else {
                g = array4[abs >>> 1];
            }
            g = g.u(n18);
            k = length;
        }
        while (k > 0) {
            --k;
            final int n21 = array[k];
            final int n22 = n21 >> 16;
            final int abs2 = Math.abs(n22);
            g[] array5;
            if (n22 < 0) {
                array5 = d;
            }
            else {
                array5 = c2;
            }
            g = g.w(array5[abs2 >>> 1]).u(n21 & 0xFFFF);
        }
        return g;
    }
}
