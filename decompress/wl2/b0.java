// 
// Decompiled by Procyon v0.6.0
// 

package wl2;

import tl2.f;
import tl2.d;
import tl2.g;
import bd0.a;

public final class b0 extends a
{
    public final /* synthetic */ int h;
    public final /* synthetic */ int[] i;
    public final /* synthetic */ c0 j;
    
    public b0(final c0 j, final int h, final int[] i) {
        this.j = j;
        this.h = h;
        this.i = i;
    }
    
    public final g C0(final int n) {
        final int[] array = new int[7];
        final int[] array2 = new int[7];
        int n2;
        for (int i = n2 = 0; i < this.h; ++i) {
            final int n3 = (i ^ n) - 1 >> 31;
            for (int j = 0; j < 7; ++j) {
                final int n4 = array[j];
                final int[] k = this.i;
                array[j] = (n4 ^ (k[n2 + j] & n3));
                array2[j] ^= (k[n2 + 7 + j] & n3);
            }
            n2 += 14;
        }
        final c0 l = this.j;
        final d0 d0 = new d0(array);
        final d0 d2 = new d0(array2);
        final f[] m = c0.k;
        l.getClass();
        return (g)new e0((d)l, (f)d0, (f)d2, m);
    }
    
    public final g E0(int i) {
        final int[] array = new int[7];
        final int[] array2 = new int[7];
        final int n = i * 7 * 2;
        int[] j;
        for (i = 0; i < 7; ++i) {
            j = this.i;
            array[i] = j[n + i];
            array2[i] = j[n + 7 + i];
        }
        final c0 k = this.j;
        final d0 d0 = new d0(array);
        final d0 d2 = new d0(array2);
        final f[] l = c0.k;
        k.getClass();
        return (g)new e0((d)k, (f)d0, (f)d2, l);
    }
    
    public final int w0() {
        return this.h;
    }
}
