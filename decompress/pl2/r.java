// 
// Decompiled by Procyon v0.6.0
// 

package pl2;

import java.math.BigInteger;
import android.support.v4.media.b;

public final class r extends b
{
    public final g l2(g g, final BigInteger bigInteger) {
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
                int n3 = 0;
                int n4 = 0;
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
                int j = 0;
                boolean b;
                int n9 = (b = false) ? 1 : 0;
                while (j <= shiftRight.bitLength()) {
                    if (shiftRight.testBit(j) == b) {
                        ++j;
                    }
                    else {
                        shiftRight = shiftRight.shiftRight(j);
                        int n11;
                        final int n10 = n11 = (shiftRight.intValue() & n8 - 1);
                        if (b) {
                            n11 = n10 + 1;
                        }
                        if ((n11 & n8 >>> 1) != 0x0) {
                            b = true;
                        }
                        else {
                            b = false;
                        }
                        int n12 = n11;
                        if (b) {
                            n12 = n11 - n8;
                        }
                        int n13 = j;
                        if (n9 > 0) {
                            n13 = j - 1;
                        }
                        array[n9] = (n12 << 16 | n13);
                        j = f;
                        ++n9;
                    }
                }
                if (n7 > n9) {
                    final int[] array3 = new int[n9];
                    System.arraycopy(array, 0, array3, 0, n9);
                    array = array3;
                }
            }
        }
        g = g.a.l();
        int length = array.length;
        int k;
        if ((k = length) > 1) {
            --length;
            final int n14 = array[length];
            final int n15 = n14 >> 16;
            int n16 = n14 & 0xFFFF;
            final int abs = Math.abs(n15);
            g[] array4;
            if (n15 < 0) {
                array4 = d;
            }
            else {
                array4 = c2;
            }
            if (abs << 2 < 1 << f) {
                final int n17 = 32 - Integer.numberOfLeadingZeros(abs);
                final int n18 = f - n17;
                g = array4[(1 << f - 1) - 1 >>> 1].a(array4[((abs ^ 1 << n17 - 1) << n18) + 1 >>> 1]);
                n16 -= n18;
            }
            else {
                g = array4[abs >>> 1];
            }
            g = g.u(n16);
            k = length;
        }
        while (k > 0) {
            --k;
            final int n19 = array[k];
            final int n20 = n19 >> 16;
            final int abs2 = Math.abs(n20);
            g[] array5;
            if (n20 < 0) {
                array5 = d;
            }
            else {
                array5 = c2;
            }
            g = g.w(array5[abs2 >>> 1]).u(n19 & 0xFFFF);
        }
        return g;
    }
}
