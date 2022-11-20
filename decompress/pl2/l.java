// 
// Decompiled by Procyon v0.6.0
// 

package pl2;

import java.nio.ShortBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.math.BigInteger;

public final class l implements Cloneable
{
    public static final short[] g;
    public static final byte[] h;
    public long[] f;
    
    static {
        g = $d2j$hex$d913a449$decode_S("0000010004000500100011001400150040004100440045005000510054005500000101010401050110011101140115014001410144014501500151015401550100040104040405041004110414041504400441044404450450045104540455040005010504050505100511051405150540054105440545055005510554055505001001100410051010101110141015104010411044104510501051105410551000110111041105111011111114111511401141114411451150115111541155110014011404140514101411141414151440144114441445145014511454145514001501150415051510151115141515154015411544154515501551155415551500400140044005401040114014401540404041404440454050405140544055400041014104410541104111411441154140414141444145415041514154415541004401440444054410441144144415444044414444444544504451445444554400450145044505451045114514451545404541454445454550455145544555450050015004500550105011501450155040504150445045505050515054505550005101510451055110511151145115514051415144514551505151515451555100540154045405541054115414541554405441544454455450545154545455540055015504550555105511551455155540554155445545555055515554555555");
        h = new byte[] { 0, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8 };
    }
    
    public l(final int n) {
        this.f = new long[n];
    }
    
    public l(final BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0) {
            throw new IllegalArgumentException("invalid F2m field value");
        }
        if (bigInteger.signum() == 0) {
            this.f = new long[] { 0L };
            return;
        }
        final byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        int i;
        if (byteArray[0] == 0) {
            --length;
            i = 1;
        }
        else {
            i = 0;
        }
        final int n = (length + 7) / 8;
        this.f = new long[n];
        final int n2 = n - 1;
        final int n3 = length % 8 + i;
        int n4 = i;
        int j = n2;
        if (i < n3) {
            long n5 = 0L;
            while (i < n3) {
                n5 = (n5 << 8 | (long)(byteArray[i] & 0xFF));
                ++i;
            }
            this.f[n2] = n5;
            j = n2 - 1;
            n4 = i;
        }
        while (j >= 0) {
            long n6 = 0L;
            for (int k = 0; k < 8; ++k, ++n4) {
                n6 = (n6 << 8 | (long)(byteArray[n4] & 0xFF));
            }
            this.f[j] = n6;
            --j;
        }
    }
    
    public l(final long[] f) {
        this.f = f;
    }
    
    public l(final long[] f, final int n) {
        if (n == f.length) {
            this.f = f;
        }
        else {
            System.arraycopy(f, 0, this.f = new long[n], 0, n);
        }
    }
    
    public static void a(final int n, final int n2, final int n3, final long[] array, final long[] array2) {
        for (int i = 0; i < n3; ++i) {
            final int n4 = n + i;
            array[n4] ^= array2[n2 + i];
        }
    }
    
    public static long e(final long[] array, final int n, final long[] array2, final int n2, final int n3, final int n4) {
        long n5 = 0L;
        for (int i = 0; i < n3; ++i) {
            final long n6 = array2[n2 + i];
            final int n7 = n + i;
            array[n7] ^= (n5 | n6 << n4);
            n5 = n6 >>> 64 - n4;
        }
        return n5;
    }
    
    public static int f(final long n) {
        int n2 = 32;
        int n3;
        if ((n3 = (int)(n >>> 32)) == 0) {
            n3 = (int)n;
            n2 = 0;
        }
        final int n4 = n3 >>> 16;
        int n6;
        if (n4 == 0) {
            final int n5 = n3 >>> 8;
            if (n5 == 0) {
                n6 = l.h[n3];
            }
            else {
                n6 = l.h[n5] + 8;
            }
        }
        else {
            final int n7 = n4 >>> 8;
            if (n7 == 0) {
                n6 = l.h[n4] + 16;
            }
            else {
                n6 = l.h[n7] + 24;
            }
        }
        return n2 + n6;
    }
    
    public static void h(final long[] array, final long[] array2, final int n, int n2, int n3) {
        final int n4 = 0 + (n3 >>> 6);
        n3 &= 0x3F;
        if (n3 == 0) {
            a(n4, n, n2, array, array2);
        }
        else {
            n3 = 64 - n3;
            long n5 = 0L;
            while (--n2 >= 0) {
                final long n6 = array2[n + n2];
                final int n7 = n4 + 1 + n2;
                array[n7] ^= (n5 | n6 >>> n3);
                n5 = n6 << 64 - n3;
            }
            array[n4] ^= n5;
        }
    }
    
    public static void i(final long[] array, int n, long n2) {
        final int n3 = 0 + (n >>> 6);
        n &= 0x3F;
        if (n == 0) {
            array[n3] ^= n2;
        }
        else {
            array[n3] ^= n2 << n;
            n2 >>>= 64 - n;
            if (n2 != 0L) {
                n = n3 + 1;
                array[n] ^= n2;
            }
        }
    }
    
    public static long k(final int n) {
        final short[] g = l.g;
        return ((long)(g[n & 0xFF] | g[n >>> 8 & 0xFF] << 16) & 0xFFFFFFFFL) | ((long)(g[n >>> 24] << 16 | g[n >>> 16 & 0xFF]) & 0xFFFFFFFFL) << 32;
    }
    
    public static void n(long n, final long[] array, final int n2, final long[] array2) {
        if ((n & 0x1L) != 0x0L) {
            a(0, 0, n2, array2, array);
        }
        int n3 = 1;
        while (true) {
            n >>>= 1;
            if (n == 0L) {
                break;
            }
            if ((n & 0x1L) != 0x0L) {
                final long e = e(array2, 0, array, 0, n2, n3);
                if (e != 0L) {
                    final int n4 = 0 + n2;
                    array2[n4] ^= e;
                }
            }
            ++n3;
        }
    }
    
    public static int o(final long[] array, int n, final int n2, final int[] array2) {
        final int n3 = n2 + 63 >>> 6;
        if (n < n3) {
            return n;
        }
        final int n4 = n << 6;
        final int min = Math.min(n4, (n2 << 1) - 1);
        int i;
        for (i = n4 - min; i >= 64; i -= 64) {
            --n;
        }
        final int length = array2.length;
        final int n5 = array2[length - 1];
        int n6;
        if (length > 1) {
            n6 = array2[length - 2];
        }
        else {
            n6 = 0;
        }
        final int max = Math.max(n2, n5 + 64);
        final int n7 = Math.min(min - max, n2 - n6) + i >> 6;
        int n8 = n;
        int n9 = min;
        if (n7 > 1) {
            final int n10 = n - n7;
            final int n11 = n10 << 6;
            final int n12 = n11 - n2;
            int length2 = array2.length;
            while (--length2 >= 0) {
                h(array, array, 0 + n10, n - n10, n12 + array2[length2]);
            }
            h(array, array, 0 + n10, n - n10, n12);
            while (true) {
                n8 = n;
                n9 = n11;
                if (n <= n10) {
                    break;
                }
                --n;
                array[0 + n] = 0L;
            }
        }
        if (n9 > max) {
            final int n13 = max >>> 6;
            while (true) {
                final int n14 = n8 - 1;
                if (n14 <= n13) {
                    break;
                }
                n = 0 + n14;
                final long n15 = array[n];
                n8 = n14;
                if (n15 == 0L) {
                    continue;
                }
                array[n] = 0L;
                final int n16 = (n14 << 6) - n2;
                n = array2.length;
                while (--n >= 0) {
                    i(array, array2[n] + n16, n15);
                }
                i(array, n16, n15);
                n8 = n14;
            }
            final int n17 = max & 0x3F;
            final int n18 = n13 + 0;
            final long n19 = array[n18];
            final long n20 = n19 >>> n17;
            n = max;
            if (n20 != 0L) {
                array[n18] = (n19 ^ n20 << n17);
                final int n21 = max - n2;
                n = array2.length;
                while (--n >= 0) {
                    i(array, array2[n] + n21, n20);
                }
                i(array, n21, n20);
                n = max;
            }
        }
        else {
            n = n9;
        }
        if (n > n2) {
            while (true) {
                final int n22 = n - 1;
                if (n22 < n2) {
                    break;
                }
                final long n23 = 1L << (n22 & 0x3F);
                final int n24 = (n22 >>> 6) + 0;
                final long n25 = array[n24];
                final boolean b = (n25 & n23) != 0x0L;
                n = n22;
                if (!b) {
                    continue;
                }
                array[n24] = (n23 ^ n25);
                final int n26 = n22 - n2;
                n = array2.length;
                while (--n >= 0) {
                    final int n27 = array2[n] + n26;
                    final int n28 = (n27 >>> 6) + 0;
                    array[n28] ^= 1L << (n27 & 0x3F);
                }
                n = (n26 >>> 6) + 0;
                array[n] ^= 1L << (n26 & 0x3F);
                n = n22;
            }
        }
        return n3;
    }
    
    public static void p(final long[] array, final int n, final long[] array2, final int n2, final int n3, final int n4) {
        long n5 = 0L;
        for (int i = 0; i < n3; ++i) {
            final long n6 = array[n + i];
            array2[n2 + i] = (n5 | n6 << n4);
            n5 = n6 >>> 64 - n4;
        }
    }
    
    public final void b(final l l, int n, int n2) {
        n = n + 63 >>> 6;
        final int n3 = n2 >>> 6;
        n2 &= 0x3F;
        if (n2 == 0) {
            a(n3, 0, n, this.f, l.f);
            return;
        }
        final long e = e(this.f, n3, l.f, 0, n, n2);
        if (e != 0L) {
            final long[] f = this.f;
            n += n3;
            f[n] ^= e;
        }
    }
    
    public final void c(final l l) {
        final int j = l.j();
        if (j == 0) {
            return;
        }
        final int n = j + 0;
        final long[] f = this.f;
        if (n > f.length) {
            final long[] f2 = new long[n];
            System.arraycopy(f, 0, f2, 0, Math.min(f.length, n));
            this.f = f2;
        }
        a(0, 0, j, this.f, l.f);
    }
    
    public final Object clone() {
        final long[] f = this.f;
        long[] array;
        if (f == null) {
            array = null;
        }
        else {
            array = f.clone();
        }
        return new l(array);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof l)) {
            return false;
        }
        final l l = (l)o;
        final int j = this.j();
        if (l.j() != j) {
            return false;
        }
        for (int i = 0; i < j; ++i) {
            if (this.f[i] != l.f[i]) {
                return false;
            }
        }
        return true;
    }
    
    public final int g() {
        int i = this.f.length;
        while (i != 0) {
            final long[] f = this.f;
            final int n = i - 1;
            final long n2 = f[n];
            i = n;
            if (n2 != 0L) {
                return f(n2) + (n << 6);
            }
        }
        return 0;
    }
    
    @Override
    public final int hashCode() {
        final int j = this.j();
        int n = 1;
        for (int i = 0; i < j; ++i) {
            final long n2 = this.f[i];
            n = ((n * 31 ^ (int)n2) * 31 ^ (int)(n2 >>> 32));
        }
        return n;
    }
    
    public final int j() {
        final long[] f = this.f;
        final int min = Math.min(f.length, f.length);
        final int n = 0;
        int n2;
        if (min < 1) {
            n2 = n;
        }
        else {
            int n3 = min;
            int n4 = 0;
            Label_0058: {
                if (f[0] == 0L) {
                    do {
                        n4 = n3 - 1;
                        if (f[n4] != 0L) {
                            break Label_0058;
                        }
                    } while ((n3 = n4) > 0);
                    n2 = n;
                    return n2;
                }
                int n5 = min;
                do {
                    n4 = --n5;
                } while (f[n5] == 0L);
            }
            n2 = n4 + 1;
        }
        return n2;
    }
    
    public final boolean l() {
        final long[] f = this.f;
        if (f[0] != 1L) {
            return false;
        }
        for (int i = 1; i < f.length; ++i) {
            if (f[i] != 0L) {
                return false;
            }
        }
        return true;
    }
    
    public final l m(l l) {
        int g = this.g();
        if (g == 0) {
            return this;
        }
        final int g2 = l.g();
        if (g2 == 0) {
            return l;
        }
        int n;
        l i;
        if (g > g2) {
            n = g2;
            i = this;
        }
        else {
            n = g;
            g = g2;
            i = l;
            l = this;
        }
        final int n2 = n + 63 >>> 6;
        final int n3 = g + 63 >>> 6;
        final int n4 = n + g + 62 >>> 6;
        if (n2 != 1) {
            final int n5 = g + 7 + 63 >>> 6;
            final int[] array = new int[16];
            final int n6 = n5 << 4;
            final long[] array2 = new long[n6];
            array[1] = n5;
            System.arraycopy(i.f, 0, array2, n5, n3);
            int j = 2;
            int n7 = n5;
            final long[] array3 = array2;
            while (j < 16) {
                final int n8 = n7 + n5;
                array[j] = n8;
                if ((j & 0x1) == 0x0) {
                    p(array3, n8 >>> 1, array3, n8, n5, 1);
                }
                else {
                    for (int k = 0; k < n5; ++k) {
                        array3[n8 + k] = (array3[n5 + k] ^ array3[n8 - n5 + k]);
                    }
                }
                ++j;
                n7 = n8;
            }
            final long[] array4 = new long[n6];
            p(array3, 0, array4, 0, n6, 4);
            final long[] f = l.f;
            final int n9 = n4 << 3;
            final long[] array5 = new long[n9];
            int n10 = 0;
            int n11;
            while (true) {
                n11 = n9;
                if (n10 >= n2) {
                    break;
                }
                long n12 = f[n10];
                int n13 = n10;
                while (true) {
                    final int n14 = (int)n12;
                    final long n15 = n12 >>> 4;
                    final int n16 = (int)n15;
                    final int n17 = array[n14 & 0xF];
                    final int n18 = array[n16 & 0xF];
                    for (int n19 = 0; n19 < n5; ++n19) {
                        final int n20 = n13 + n19;
                        array5[n20] ^= (array3[n17 + n19] ^ array4[n18 + n19]);
                    }
                    n12 = n15 >>> 4;
                    if (n12 == 0L) {
                        break;
                    }
                    n13 += n4;
                }
                ++n10;
            }
            while (true) {
                n11 -= n4;
                if (n11 == 0) {
                    break;
                }
                e(array5, n11 - n4, array5, n11, n4, 8);
            }
            return new l(array5, n4);
        }
        final long n21 = l.f[0];
        if (n21 == 1L) {
            return i;
        }
        final long[] array6 = new long[n4];
        n(n21, i.f, n3, array6);
        return new l(array6, n4);
    }
    
    @Override
    public final String toString() {
        int j = this.j();
        if (j == 0) {
            return "0";
        }
        final long[] f = this.f;
        --j;
        final StringBuffer sb = new StringBuffer(Long.toBinaryString(f[j]));
        while (--j >= 0) {
            final String binaryString = Long.toBinaryString(this.f[j]);
            final int length = binaryString.length();
            if (length < 64) {
                sb.append("0000000000000000000000000000000000000000000000000000000000000000".substring(length));
            }
            sb.append(binaryString);
        }
        return sb.toString();
    }
    
    private static long[] $d2j$hex$d913a449$decode_J(final String src) {
        final byte[] d = $d2j$hex$d913a449$decode_B(src);
        final ByteBuffer b = ByteBuffer.wrap(d);
        b.order(ByteOrder.LITTLE_ENDIAN);
        final LongBuffer s = b.asLongBuffer();
        final long[] data = new long[d.length / 8];
        s.get(data);
        return data;
    }
    
    private static int[] $d2j$hex$d913a449$decode_I(final String src) {
        final byte[] d = $d2j$hex$d913a449$decode_B(src);
        final ByteBuffer b = ByteBuffer.wrap(d);
        b.order(ByteOrder.LITTLE_ENDIAN);
        final IntBuffer s = b.asIntBuffer();
        final int[] data = new int[d.length / 4];
        s.get(data);
        return data;
    }
    
    private static short[] $d2j$hex$d913a449$decode_S(final String src) {
        final byte[] d = $d2j$hex$d913a449$decode_B(src);
        final ByteBuffer b = ByteBuffer.wrap(d);
        b.order(ByteOrder.LITTLE_ENDIAN);
        final ShortBuffer s = b.asShortBuffer();
        final short[] data = new short[d.length / 2];
        s.get(data);
        return data;
    }
    
    private static byte[] $d2j$hex$d913a449$decode_B(final String src) {
        final char[] d = src.toCharArray();
        final byte[] ret = new byte[src.length() / 2];
        for (int i = 0; i < ret.length; ++i) {
            final char h = d[2 * i];
            final char l = d[2 * i + 1];
            int hh;
            if (h >= '0' && h <= '9') {
                hh = h - '0';
            }
            else if (h >= 'a' && h <= 'f') {
                hh = h - 'a' + 10;
            }
            else {
                if (h < 'A' || h > 'F') {
                    throw new RuntimeException();
                }
                hh = h - 'A' + 10;
            }
            int ll;
            if (l >= '0' && l <= '9') {
                ll = l - '0';
            }
            else if (l >= 'a' && l <= 'f') {
                ll = l - 'a' + 10;
            }
            else {
                if (l < 'A' || l > 'F') {
                    throw new RuntimeException();
                }
                ll = l - 'A' + 10;
            }
            ret[i] = (byte)(hh << 4 | ll);
        }
        return ret;
    }
}
