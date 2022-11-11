// 
// Decompiled by Procyon v0.6.0
// 

package wl2;

import tl2.f;
import tl2.d;
import tl2.g;
import bd0.a;

public final class d3 extends a
{
    public final /* synthetic */ int h;
    public final /* synthetic */ long[] i;
    public final /* synthetic */ e3 j;
    
    public d3(final e3 j, final int h, final long[] i) {
        this.j = j;
        this.h = h;
        this.i = i;
    }
    
    public final g C0(final int n) {
        final long[] array = new long[9];
        final long[] array2 = new long[9];
        int n2;
        for (int i = n2 = 0; i < this.h; ++i) {
            final long n3 = (i ^ n) - 1 >> 31;
            for (int j = 0; j < 9; ++j) {
                final long n4 = array[j];
                final long[] k = this.i;
                array[j] = (n4 ^ (k[n2 + j] & n3));
                array2[j] ^= (k[n2 + 9 + j] & n3);
            }
            n2 += 18;
        }
        final e3 l = this.j;
        final z2 z2 = new z2(array);
        final z2 z3 = new z2(array2);
        final f[] m = e3.k;
        l.getClass();
        return (g)new f3((d)l, (f)z2, (f)z3, m);
    }
    
    public final g E0(int i) {
        final long[] array = new long[9];
        final long[] array2 = new long[9];
        final int n = i * 9 * 2;
        long[] j;
        for (i = 0; i < 9; ++i) {
            j = this.i;
            array[i] = j[n + i];
            array2[i] = j[n + 9 + i];
        }
        final e3 k = this.j;
        final z2 z2 = new z2(array);
        final z2 z3 = new z2(array2);
        final f[] l = e3.k;
        k.getClass();
        return (g)new f3((d)k, (f)z2, (f)z3, l);
    }
    
    public final int w0() {
        return this.h;
    }
}
