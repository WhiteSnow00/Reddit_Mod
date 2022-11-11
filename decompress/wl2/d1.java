// 
// Decompiled by Procyon v0.6.0
// 

package wl2;

import tl2.f;
import tl2.d;
import tl2.g;
import bd0.a;

public final class d1 extends a
{
    public final /* synthetic */ int h;
    public final /* synthetic */ long[] i;
    public final /* synthetic */ e1 j;
    
    public d1(final e1 j, final int h, final long[] i) {
        this.j = j;
        this.h = h;
        this.i = i;
    }
    
    public final g C0(final int n) {
        final long[] array = new long[3];
        final long[] array2 = new long[3];
        int n2;
        for (int i = n2 = 0; i < this.h; ++i) {
            final long n3 = (i ^ n) - 1 >> 31;
            for (int j = 0; j < 3; ++j) {
                final long n4 = array[j];
                final long[] k = this.i;
                array[j] = (n4 ^ (k[n2 + j] & n3));
                array2[j] ^= (k[n2 + 3 + j] & n3);
            }
            n2 += 6;
        }
        final e1 l = this.j;
        final c1 c1 = new c1(array);
        final c1 c2 = new c1(array2);
        final f[] m = e1.k;
        l.getClass();
        return (g)new f1((d)l, (f)c1, (f)c2, m);
    }
    
    public final g E0(int i) {
        final long[] array = new long[3];
        final long[] array2 = new long[3];
        final int n = i * 3 * 2;
        long[] j;
        for (i = 0; i < 3; ++i) {
            j = this.i;
            array[i] = j[n + i];
            array2[i] = j[n + 3 + i];
        }
        final e1 k = this.j;
        final c1 c1 = new c1(array);
        final c1 c2 = new c1(array2);
        final f[] l = e1.k;
        k.getClass();
        return (g)new f1((d)k, (f)c1, (f)c2, l);
    }
    
    public final int w0() {
        return this.h;
    }
}
