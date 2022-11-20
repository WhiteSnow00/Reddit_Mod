// 
// Decompiled by Procyon v0.6.0
// 

package pl2;

import java.math.BigInteger;
import android.support.v4.media.b;

public final class c extends b
{
    public final int g;
    public final int h;
    public final byte[] i;
    public final d j;
    
    public c(final d j, final int g, final int h, final byte[] i) {
        this.j = j;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final int H1() {
        return this.g;
    }
    
    public final g b2(final int n) {
        final int h = this.h;
        final byte[] array = new byte[h];
        final byte[] array2 = new byte[h];
        int i = 0;
        int n2 = 0;
        while (i < this.g) {
            final int n3 = (i ^ n) - 1 >> 31;
            int n4 = 0;
            int h2;
            while (true) {
                h2 = this.h;
                if (n4 >= h2) {
                    break;
                }
                final byte b = array[n4];
                final byte[] j = this.i;
                array[n4] = (byte)(b ^ (j[n2 + n4] & n3));
                array2[n4] ^= (byte)(j[h2 + n2 + n4] & n3);
                ++n4;
            }
            n2 += h2 * 2;
            ++i;
        }
        final d k = this.j;
        return k.e(k.j(new BigInteger(1, array)), this.j.j(new BigInteger(1, array2)));
    }
    
    public final g c2(int n) {
        final int h = this.h;
        final byte[] array = new byte[h];
        final byte[] array2 = new byte[h];
        final int n2 = n * h * 2;
        n = 0;
        while (true) {
            final int h2 = this.h;
            if (n >= h2) {
                break;
            }
            final byte[] i = this.i;
            array[n] = i[n2 + n];
            array2[n] = i[h2 + n2 + n];
            ++n;
        }
        final d j = this.j;
        return j.e(j.j(new BigInteger(1, array)), this.j.j(new BigInteger(1, array2)));
    }
}
