// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.io.PrintWriter;
import com.bytedance.covode.number.Covode;

public final class 07V
{
    public static final Object LIZ;
    public static char[] LIZIZ;
    
    static {
        Covode.recordClassIndex(802);
        LIZ = new Object();
        07V.LIZIZ = new char[24];
    }
    
    public static int LIZ(final char[] array, int n, final char c, int n2, final boolean b) {
        if (!b) {
            final int n3 = n2;
            if (n <= 0) {
                return n3;
            }
        }
        int n5;
        if (n > 99) {
            final int n4 = n / 100;
            array[n2] = (char)(n4 + 48);
            n5 = n2 + 1;
            n -= n4 * 100;
        }
        else {
            n5 = n2;
        }
        int n6 = 0;
        int n7 = 0;
        Label_0095: {
            if (n <= 9) {
                n6 = n5;
                n7 = n;
                if (n2 == n5) {
                    break Label_0095;
                }
            }
            n2 = n / 10;
            array[n5] = (char)(n2 + 48);
            n6 = n5 + 1;
            n7 = n - n2 * 10;
        }
        array[n6] = (char)(n7 + 48);
        n = n6 + 1;
        array[n] = c;
        return n + 1;
    }
    
    public static void LIZ(long n, final PrintWriter printWriter) {
        synchronized (07V.LIZ) {
            final int length = 07V.LIZIZ.length;
            final char[] liziz = 07V.LIZIZ;
            int liz = 1;
            final long n2 = lcmp(n, 0L);
            if (n2 == 0) {
                liziz[0] = 48;
            }
            else {
                int n3;
                if (n2 > 0) {
                    n3 = 43;
                }
                else {
                    n3 = 45;
                    n = -n;
                }
                final int n4 = (int)(n % 1000L);
                int n5 = (int)Math.floor((double)(n / 1000L));
                int n6;
                if (n5 > 86400) {
                    n6 = n5 / 86400;
                    n5 -= 86400 * n6;
                }
                else {
                    n6 = 0;
                }
                int n7;
                if (n5 > 3600) {
                    n7 = n5 / 3600;
                    n5 -= n7 * 3600;
                }
                else {
                    n7 = 0;
                }
                int n8;
                if (n5 > 60) {
                    n8 = n5 / 60;
                    n5 -= n8 * 60;
                }
                else {
                    n8 = 0;
                }
                liziz[0] = (char)n3;
                final int liz2 = LIZ(liziz, n6, 'd', 1, false);
                final int liz3 = LIZ(liziz, n7, 'h', liz2, liz2 != 1);
                final int liz4 = LIZ(liziz, n8, 'm', liz3, liz3 != 1);
                liz = LIZ(liziz, n4, 'm', LIZ(liziz, n5, 's', liz4, liz4 != 1), true);
                liziz[liz] = 115;
                ++liz;
            }
            printWriter.print(new String(07V.LIZIZ, 0, liz));
            monitorexit(07V.LIZ);
        }
    }
}
