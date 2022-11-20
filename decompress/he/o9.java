// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.util.Arrays;
import java.security.interfaces.ECPublicKey;

public final class o9 implements j2
{
    public o9(final ECPublicKey ecPublicKey) {
        q9.c(ecPublicKey.getW(), ecPublicKey.getParams().getCurve());
    }
    
    public static String a(String s) {
        try {
            final Object invoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, s);
            if (invoke != null && String.class.isAssignableFrom(((String)invoke).getClass())) {
                s = (String)invoke;
                return s;
            }
            return null;
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public static byte[] b(byte[] array, final byte[] array2) {
        final long c = c(0, 0, array);
        final long n = c(3, 2, array) & 0x3FFFF03L;
        final long n2 = c(6, 4, array) & 0x3FFC0FFL;
        final long n3 = c(9, 6, array) & 0x3F03FFFL;
        final long n4 = c(12, 8, array) & 0xFFFFFL;
        final long n5 = n2 * 5L;
        final long n6 = n3 * 5L;
        final long n7 = n4 * 5L;
        final byte[] array3 = new byte[17];
        final long n8 = 0L;
        int n9 = 0;
        long n10 = 0L;
        long n11 = 0L;
        long n13;
        long n12 = n13 = n11;
        long n14 = n8;
        while (true) {
            final int length = array2.length;
            if (n9 >= length) {
                break;
            }
            final int min = Math.min(16, length - n9);
            System.arraycopy(array2, n9, array3, 0, min);
            array3[min] = 1;
            if (min != 16) {
                Arrays.fill(array3, min + 1, 17, (byte)0);
            }
            final long n15 = c(0, 0, array3) + n12;
            final long n16 = c(3, 2, array3) + n14;
            final long n17 = c(6, 4, array3) + n10;
            final long n18 = c(9, 6, array3) + n11;
            final long n19 = n13 + (c(12, 8, array3) | (long)(array3[16] << 24));
            final long n20 = n19 * (n * 5L) + (n18 * n5 + (n17 * n6 + (n16 * n7 + n15 * c)));
            final long n21 = n19 * n5 + (n18 * n6 + (n17 * n7 + (n16 * c + n15 * n))) + (n20 >> 26);
            final long n22 = n19 * n6 + (n18 * n7 + (n17 * c + (n16 * n + n15 * n2))) + (n21 >> 26);
            final long n23 = n19 * n7 + (n18 * c + (n17 * n + (n16 * n2 + n15 * n3))) + (n22 >> 26);
            final long n24 = n19 * c + (n18 * n + (n17 * n2 + (n16 * n3 + n15 * n4))) + (n23 >> 26);
            final long n25 = (n24 >> 26) * 5L + (n20 & 0x3FFFFFFL);
            n12 = (n25 & 0x3FFFFFFL);
            n9 += 16;
            n13 = (n24 & 0x3FFFFFFL);
            n11 = (n23 & 0x3FFFFFFL);
            n10 = (n22 & 0x3FFFFFFL);
            n14 = (n21 & 0x3FFFFFFL) + (n25 >> 26);
        }
        final long n26 = n10 + (n14 >> 26);
        final long n27 = n26 & 0x3FFFFFFL;
        final long n28 = n11 + (n26 >> 26);
        final long n29 = n28 & 0x3FFFFFFL;
        final long n30 = n13 + (n28 >> 26);
        final long n31 = n30 & 0x3FFFFFFL;
        final long n32 = (n30 >> 26) * 5L + n12;
        final long n33 = n32 & 0x3FFFFFFL;
        final long n34 = (n14 & 0x3FFFFFFL) + (n32 >> 26);
        final long n35 = n33 + 5L;
        final long n36 = (n35 >> 26) + n34;
        final long n37 = n27 + (n36 >> 26);
        final long n38 = n29 + (n37 >> 26);
        final long n39 = n31 + (n38 >> 26) - 67108864L;
        final long n40 = n39 >> 63;
        final long n41 = ~n40;
        final long n42 = (n36 & 0x3FFFFFFL & n41) | (n34 & n40);
        final long n43 = (n27 & n40) | (n37 & 0x3FFFFFFL & n41);
        final long n44 = (n29 & n40) | (n38 & 0x3FFFFFFL & n41);
        final long n45 = d(16, array) + (((n33 & n40) | (n35 & 0x3FFFFFFL & n41) | n42 << 26) & 0xFFFFFFFFL);
        final long n46 = d(20, array) + ((n42 >> 6 | n43 << 20) & 0xFFFFFFFFL) + (n45 >> 32);
        final long n47 = d(24, array) + ((n43 >> 12 | n44 << 14) & 0xFFFFFFFFL) + (n46 >> 32);
        final long d = d(28, array);
        array = new byte[16];
        e(n45 & 0xFFFFFFFFL, array, 0);
        e(n46 & 0xFFFFFFFFL, array, 4);
        e(n47 & 0xFFFFFFFFL, array, 8);
        e(((((n39 & n41) | (n40 & n31)) << 8 | n44 >> 18) & 0xFFFFFFFFL) + d + (n47 >> 32) & 0xFFFFFFFFL, array, 12);
        return array;
    }
    
    public static long c(final int n, final int n2, final byte[] array) {
        return d(n, array) >> n2 & 0x3FFFFFFL;
    }
    
    public static long d(final int n, final byte[] array) {
        return (long)((array[n + 3] & 0xFF) << 24 | ((array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8 | (array[n + 2] & 0xFF) << 16)) & 0xFFFFFFFFL;
    }
    
    public static void e(long n, final byte[] array, final int n2) {
        for (int i = 0; i < 4; ++i, n >>= 8) {
            array[n2 + i] = (byte)(0xFFL & n);
        }
    }
    
    public static boolean f(final byte b) {
        return b > -65;
    }
}
