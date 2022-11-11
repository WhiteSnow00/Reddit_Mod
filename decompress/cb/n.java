// 
// Decompiled by Procyon v0.6.0
// 

package cb;

import java.util.Arrays;
import ad.s;

public final class n
{
    public static p.a a(final s s) {
        s.C(1);
        final int t = s.t();
        final long n = s.b;
        final long n2 = t;
        final int n3 = t / 18;
        final long[] array = new long[n3];
        final long[] array2 = new long[n3];
        int n4 = 0;
        long[] copy;
        long[] copy2;
        while (true) {
            copy = array;
            copy2 = array2;
            if (n4 >= n3) {
                break;
            }
            final long k = s.k();
            if (k == -1L) {
                copy = Arrays.copyOf(array, n4);
                copy2 = Arrays.copyOf(array2, n4);
                break;
            }
            array[n4] = k;
            array2[n4] = s.k();
            s.C(2);
            ++n4;
        }
        s.C((int)(n + n2 - s.b));
        return new p.a(copy, copy2);
    }
    
    public static final class a
    {
        public p a;
        
        public a(final p a) {
            this.a = a;
        }
    }
}
