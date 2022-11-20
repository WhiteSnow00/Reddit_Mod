// 
// Decompiled by Procyon v0.6.0
// 

package qc2;

import com.sendbird.android.shadow.okio.a$a;
import aq2.a;

public final class d
{
    public static String a(final int n) {
        if (n < 1000 || n >= 5000) {
            return d.h("Code must be in range [1000,5000): ", n);
        }
        if ((n >= 1004 && n <= 1006) || (n >= 1012 && n <= 2999)) {
            return a.l("Code ", n, " is reserved and may not be used.");
        }
        return null;
    }
    
    public static void b(final a$a a$a, final byte[] array) {
        final int length = array.length;
        int n = 0;
        int i;
        do {
            final byte[] j = a$a.j;
            for (int k = a$a.k; k < a$a.l; ++k, ++n) {
                n %= length;
                j[k] ^= array[n];
            }
            final long l = a$a.i;
            if (l == a$a.f.g) {
                throw new IllegalStateException();
            }
            if (l == -1L) {
                i = a$a.h(0L);
            }
            else {
                i = a$a.h(l + (a$a.l - a$a.k));
            }
        } while (i != -1);
    }
}
