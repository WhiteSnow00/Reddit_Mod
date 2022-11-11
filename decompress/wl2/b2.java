// 
// Decompiled by Procyon v0.6.0
// 

package wl2;

import tl2.f;
import tl2.d;
import tl2.g;
import bd0.a;

public final class b2 extends a
{
    public final /* synthetic */ int h;
    public final /* synthetic */ long[] i;
    public final /* synthetic */ c2 j;
    
    public b2(final c2 j, final int h, final long[] i) {
        this.j = j;
        this.h = h;
        this.i = i;
    }
    
    public final g C0(final int n) {
        final long[] array = new long[4];
        final long[] array2 = new long[4];
        int n2;
        for (int i = n2 = 0; i < this.h; ++i) {
            final long n3 = (i ^ n) - 1 >> 31;
            for (int j = 0; j < 4; ++j) {
                final long n4 = array[j];
                final long[] k = this.i;
                array[j] = (n4 ^ (k[n2 + j] & n3));
                array2[j] ^= (k[n2 + 4 + j] & n3);
            }
            n2 += 8;
        }
        final c2 l = this.j;
        final a2 a2 = new a2(array);
        final a2 a3 = new a2(array2);
        final f[] m = c2.k;
        l.getClass();
        return (g)new d2((d)l, (f)a2, (f)a3, m);
    }
    
    public final g E0(int i) {
        final long[] array = new long[4];
        final long[] array2 = new long[4];
        final int n = i * 4 * 2;
        long[] j;
        for (i = 0; i < 4; ++i) {
            j = this.i;
            array[i] = j[n + i];
            array2[i] = j[n + 4 + i];
        }
        final c2 k = this.j;
        final a2 a2 = new a2(array);
        final a2 a3 = new a2(array2);
        final f[] l = c2.k;
        k.getClass();
        return (g)new d2((d)k, (f)a2, (f)a3, l);
    }
    
    public final int w0() {
        return this.h;
    }
}
