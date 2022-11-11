// 
// Decompiled by Procyon v0.6.0
// 

package wl2;

import tl2.f;
import tl2.g;

public final class a extends bd0.a
{
    public final /* synthetic */ int h;
    public final /* synthetic */ int[] i;
    public final /* synthetic */ b j;
    
    public a(final b j, final int h, final int[] i) {
        this.j = j;
        this.h = h;
        this.i = i;
    }
    
    public final g C0(final int n) {
        final int[] array = new int[4];
        final int[] array2 = new int[4];
        int n2;
        for (int i = n2 = 0; i < this.h; ++i) {
            final int n3 = (i ^ n) - 1 >> 31;
            for (int j = 0; j < 4; ++j) {
                final int n4 = array[j];
                final int[] k = this.i;
                array[j] = (n4 ^ (k[n2 + j] & n3));
                array2[j] ^= (k[n2 + 4 + j] & n3);
            }
            n2 += 8;
        }
        final b l = this.j;
        final c c = new c(array);
        final c c2 = new c(array2);
        final f[] m = b.k;
        l.getClass();
        return (g)new d((tl2.d)l, (f)c, (f)c2, m);
    }
    
    public final g E0(int i) {
        final int[] array = new int[4];
        final int[] array2 = new int[4];
        final int n = i * 4 * 2;
        int[] j;
        for (i = 0; i < 4; ++i) {
            j = this.i;
            array[i] = j[n + i];
            array2[i] = j[n + 4 + i];
        }
        final b k = this.j;
        final c c = new c(array);
        final c c2 = new c(array2);
        final f[] l = b.k;
        k.getClass();
        return (g)new d((tl2.d)k, (f)c, (f)c2, l);
    }
    
    public final int w0() {
        return this.h;
    }
}
