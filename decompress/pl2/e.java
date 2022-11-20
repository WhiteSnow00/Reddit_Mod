// 
// Decompiled by Procyon v0.6.0
// 

package pl2;

import android.support.v4.media.b;

public final class e extends b
{
    public final int g;
    public final int h;
    public final long[] i;
    public final int[] j;
    public final d.d k;
    
    public e(final d.d k, final int g, final int h, final long[] i, final int[] j) {
        this.k = k;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final int H1() {
        return this.g;
    }
    
    public final g S2(final long[] array, final long[] array2) {
        final f$c f$c = new f$c(this.k.j, new l(array), this.j);
        final f$c f$c2 = new f$c(this.k.j, new l(array2), this.j);
        final d.d k = this.k;
        k.getClass();
        return (g)new g.d((d)k, (f)f$c, (f)f$c2);
    }
    
    public final g b2(final int n) {
        final int h = this.h;
        final long[] array = new long[h];
        final long[] array2 = new long[h];
        int i = 0;
        int n2 = 0;
        while (i < this.g) {
            final long n3 = (i ^ n) - 1 >> 31;
            int n4 = 0;
            int h2;
            while (true) {
                h2 = this.h;
                if (n4 >= h2) {
                    break;
                }
                final long n5 = array[n4];
                final long[] j = this.i;
                array[n4] = (n5 ^ (j[n2 + n4] & n3));
                array2[n4] ^= (j[h2 + n2 + n4] & n3);
                ++n4;
            }
            n2 += h2 * 2;
            ++i;
        }
        return this.S2(array, array2);
    }
    
    public final g c2(int n) {
        final int h = this.h;
        final long[] array = new long[h];
        final long[] array2 = new long[h];
        final int n2 = n * h * 2;
        n = 0;
        while (true) {
            final int h2 = this.h;
            if (n >= h2) {
                break;
            }
            final long[] i = this.i;
            array[n] = i[n2 + n];
            array2[n] = i[h2 + n2 + n];
            ++n;
        }
        return this.S2(array, array2);
    }
}
