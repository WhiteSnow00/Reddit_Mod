// 
// Decompiled by Procyon v0.6.0
// 

package tl2;

import java.math.BigInteger;
import bd0.a;

public final class c extends a
{
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ byte[] j;
    public final /* synthetic */ d k;
    
    public c(final d k, final int h, final int i, final byte[] j) {
        this.k = k;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final g C0(final int n) {
        final int i = this.i;
        final byte[] array = new byte[i];
        final byte[] array2 = new byte[i];
        int n2;
        for (int j = n2 = 0; j < this.h; ++j) {
            final int n3 = (j ^ n) - 1 >> 31;
            int n4 = 0;
            int k;
            while (true) {
                k = this.i;
                if (n4 >= k) {
                    break;
                }
                final byte b = array[n4];
                final byte[] l = this.j;
                array[n4] = (byte)(b ^ (l[n2 + n4] & n3));
                array2[n4] ^= (byte)(l[k + n2 + n4] & n3);
                ++n4;
            }
            n2 += k * 2;
        }
        final d m = this.k;
        return m.e(m.j(new BigInteger(1, array)), this.k.j(new BigInteger(1, array2)));
    }
    
    public final g E0(int n) {
        final int i = this.i;
        final byte[] array = new byte[i];
        final byte[] array2 = new byte[i];
        final int n2 = n * i * 2;
        n = 0;
        while (true) {
            final int j = this.i;
            if (n >= j) {
                break;
            }
            final byte[] k = this.j;
            array[n] = k[n2 + n];
            array2[n] = k[j + n2 + n];
            ++n;
        }
        final d l = this.k;
        return l.e(l.j(new BigInteger(1, array)), this.k.j(new BigInteger(1, array2)));
    }
    
    public final int w0() {
        return this.h;
    }
}
