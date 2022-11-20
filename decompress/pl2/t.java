// 
// Decompiled by Procyon v0.6.0
// 

package pl2;

import java.math.BigInteger;

public abstract class t
{
    public static final int[] a;
    public static final byte[] b;
    public static final int[] c;
    public static final g[] d;
    
    static {
        a = new int[] { 13, 41, 121, 337, 897, 2305 };
        b = new byte[0];
        c = new int[0];
        d = new g[0];
    }
    
    public static void a(final g g) {
        final d a = g.a;
        if (a == null) {
            return;
        }
        final BigInteger d = a.d;
        int bitLength;
        if (d == null) {
            bitLength = a.k() + 1;
        }
        else {
            bitLength = d.bitLength();
        }
        int[] a2;
        int n;
        for (a2 = t.a, n = 0; n < 6 && bitLength >= a2[n]; ++n) {}
        a.o(g, "bc_wnaf", (m)new t$a(Math.min(16, Math.max(2, Math.min(16, n + 2)) + 3)));
    }
    
    public static byte[] b(int i, BigInteger shiftRight) {
        if (i == 2) {
            byte[] b;
            if (shiftRight.signum() == 0) {
                b = t.b;
            }
            else {
                final BigInteger add = shiftRight.shiftLeft(1).add(shiftRight);
                final int n = add.bitLength() - 1;
                final byte[] array = new byte[n];
                final BigInteger xor = add.xor(shiftRight);
                int n2;
                int n3;
                for (i = 1; i < n; i = n2 + 1) {
                    n2 = i;
                    if (xor.testBit(i)) {
                        if (shiftRight.testBit(i)) {
                            n3 = -1;
                        }
                        else {
                            n3 = 1;
                        }
                        array[i - 1] = (byte)n3;
                        n2 = i + 1;
                    }
                }
                array[n - 1] = 1;
                b = array;
            }
            return b;
        }
        if (i < 2 || i > 8) {
            throw new IllegalArgumentException("'width' must be in the range [2, 8]");
        }
        if (shiftRight.signum() == 0) {
            return t.b;
        }
        final int n4 = shiftRight.bitLength() + 1;
        final byte[] array2 = new byte[n4];
        final int n5 = 1 << i;
        int j = 0;
        boolean b2;
        int n6 = (b2 = false) ? 1 : 0;
        while (j <= shiftRight.bitLength()) {
            if (shiftRight.testBit(j) == b2) {
                ++j;
            }
            else {
                shiftRight = shiftRight.shiftRight(j);
                int n8;
                final int n7 = n8 = (shiftRight.intValue() & n5 - 1);
                if (b2) {
                    n8 = n7 + 1;
                }
                if ((n8 & n5 >>> 1) != 0x0) {
                    b2 = true;
                }
                else {
                    b2 = false;
                }
                int n9 = n8;
                if (b2) {
                    n9 = n8 - n5;
                }
                int n10 = j;
                if (n6 > 0) {
                    n10 = j - 1;
                }
                final int n11 = n6 + n10;
                array2[n11] = (byte)n9;
                n6 = n11 + 1;
                j = i;
            }
        }
        byte[] array3 = array2;
        if (n4 > n6) {
            array3 = new byte[n6];
            System.arraycopy(array2, 0, array3, 0, n6);
        }
        return array3;
    }
    
    public static s c(final g g, final int n) {
        final d a = g.a;
        return (s)a.o(g, "bc_wnaf", (m)new u(n, g, a));
    }
}
