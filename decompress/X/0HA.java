// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import java.util.Arrays;
import com.bytedance.covode.number.Covode;

public final class 0Ha
{
    public static final 0Ha LIZ;
    public static final String LIZIZ = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=";
    public static final int[] LIZJ;
    
    static {
        Covode.recordClassIndex(1859);
        LIZ = new 0Ha();
        final int[] lizj = new int[256];
        final int n = 0;
        int n2 = 0;
        do {
            lizj[n2] = -1;
        } while (++n2 <= 255);
        for (int length = 0Ha.LIZIZ.length(), i = n; i < length; ++i) {
            lizj[0Ha.LIZIZ.charAt(i)] = i;
        }
        LIZJ = lizj;
    }
    
    public final byte[] LIZ(final String s) {
        CTM.LIZ((Object)s);
        final int length = s.length();
        final byte[] array = new byte[length];
        int i = 0;
        for (int j = 0; j < length; ++j) {
            array[j] = (byte)s.charAt(j);
        }
        final byte[] array2 = new byte[length];
        CTM.LIZ((Object)array, (Object)array2);
        int n = 0;
        while (i < length) {
            final int[] lizj = 0Ha.LIZJ;
            if (lizj[array[i] & 0xFF] < 0) {
                ++i;
            }
            else {
                final int n2 = i + 1;
                final int n3 = lizj[array[i] & 0xFF];
                final int n4 = n2 + 1;
                final int n5 = lizj[array[n2] & 0xFF];
                final int n6 = n4 + 1;
                final int n7 = lizj[array[n4] & 0xFF];
                final int n8 = n6 + 1;
                final int n9 = lizj[array[n6] & 0xFF];
                final int n10 = n + 1;
                array2[n] = (byte)(n3 << 2 | n5 >> 4);
                if (n7 < 64) {
                    final int n11 = n10 + 1;
                    array2[n10] = (byte)(n5 << 4 | n7 >> 2);
                    i = n8;
                    n = n11;
                    if (n9 >= 64) {
                        continue;
                    }
                    array2[n11] = (byte)(n9 | n7 << 6);
                    n = n11 + 1;
                    i = n8;
                }
                else {
                    n = n10;
                    i = n8;
                }
            }
        }
        final byte[] copy = Arrays.copyOf(array2, n);
        kotlin.jvm.internal.n.LIZ((Object)copy, "");
        return copy;
    }
}
