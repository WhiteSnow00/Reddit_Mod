// 
// Decompiled by Procyon v0.6.0
// 

package tl2;

import bd0.a;

public final class e extends a
{
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ long[] j;
    public final /* synthetic */ int[] k;
    public final /* synthetic */ d.d l;
    
    public e(final d.d l, final int h, final int i, final long[] j, final int[] k) {
        this.l = l;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public final g C0(final int n) {
        final int i = this.i;
        final long[] array = new long[i];
        final long[] array2 = new long[i];
        int n2;
        for (int j = n2 = 0; j < this.h; ++j) {
            final long n3 = (j ^ n) - 1 >> 31;
            int n4 = 0;
            int k;
            while (true) {
                k = this.i;
                if (n4 >= k) {
                    break;
                }
                final long n5 = array[n4];
                final long[] l = this.j;
                array[n4] = (n5 ^ (l[n2 + n4] & n3));
                array2[n4] ^= (l[k + n2 + n4] & n3);
                ++n4;
            }
            n2 += k * 2;
        }
        return this.X0(array, array2);
    }
    
    public final g E0(int n) {
        final int i = this.i;
        final long[] array = new long[i];
        final long[] array2 = new long[i];
        final int n2 = n * i * 2;
        n = 0;
        while (true) {
            final int j = this.i;
            if (n >= j) {
                break;
            }
            final long[] k = this.j;
            array[n] = k[n2 + n];
            array2[n] = k[j + n2 + n];
            ++n;
        }
        return this.X0(array, array2);
    }
    
    public final g X0(final long[] array, final long[] array2) {
        final f$c f$c = new f$c(this.l.j, new l(array), this.k);
        final f$c f$c2 = new f$c(this.l.j, new l(array2), this.k);
        final d.d l = this.l;
        l.getClass();
        return (g)new g.d((d)l, (f)f$c, (f)f$c2);
    }
    
    public final int w0() {
        return this.h;
    }
}
