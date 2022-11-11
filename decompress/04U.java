// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 04u
{
    public static final int[] LIZ;
    public static final long[] LIZIZ;
    public static final Object[] LIZJ;
    
    static {
        Covode.recordClassIndex(578);
        LIZ = new int[0];
        LIZIZ = new long[0];
        LIZJ = new Object[0];
    }
    
    public static int LIZ(final int n) {
        return LIZJ(n * 4) / 4;
    }
    
    public static int LIZ(final int[] array, int n, final int n2) {
        --n;
        int i = 0;
        while (i <= n) {
            final int n3 = i + n >>> 1;
            final int n4 = array[n3];
            if (n4 < n2) {
                i = n3 + 1;
            }
            else {
                if (n4 <= n2) {
                    return n3;
                }
                n = n3 - 1;
            }
        }
        return ~i;
    }
    
    public static int LIZ(final long[] array, int n, final long n2) {
        --n;
        int i = 0;
        while (i <= n) {
            final int n3 = i + n >>> 1;
            final long n4 = lcmp(array[n3], n2);
            if (n4 < 0) {
                i = n3 + 1;
            }
            else {
                if (n4 <= 0) {
                    return n3;
                }
                n = n3 - 1;
            }
        }
        return ~i;
    }
    
    public static boolean LIZ(final Object o, final Object o2) {
        return o == o2 || (o != null && o.equals(o2));
    }
    
    public static int LIZIZ(final int n) {
        return LIZJ(n * 8) / 8;
    }
    
    public static int LIZJ(final int n) {
        int n2 = 4;
        while (true) {
            final int n3 = (1 << n2) - 12;
            if (n <= n3) {
                return n3;
            }
            if (++n2 < 32) {
                continue;
            }
            return n;
        }
    }
}
