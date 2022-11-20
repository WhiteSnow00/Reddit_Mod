// 
// Decompiled by Procyon v0.6.0
// 

package rl2;

import pl2.f;
import pl2.g;
import android.support.v4.media.b;

public final class a extends b
{
    public final int g;
    public final int[] h;
    public final rl2.b i;
    
    public a(final rl2.b i, final int g, final int[] h) {
        this.i = i;
        this.g = g;
        this.h = h;
    }
    
    public final int H1() {
        return this.g;
    }
    
    public final g b2(final int n) {
        final int[] array = new int[8];
        final int[] array2 = new int[8];
        int i = 0;
        int n2 = 0;
        while (i < this.g) {
            final int n3 = (i ^ n) - 1 >> 31;
            for (int j = 0; j < 8; ++j) {
                final int n4 = array[j];
                final int[] h = this.h;
                array[j] = (n4 ^ (h[n2 + j] & n3));
                array2[j] ^= (h[n2 + 8 + j] & n3);
            }
            n2 += 16;
            ++i;
        }
        final rl2.b k = this.i;
        final c c = new c(array);
        final c c2 = new c(array2);
        final f[] l = rl2.b.k;
        k.getClass();
        return (g)new d((pl2.d)k, (f)c, (f)c2, l);
    }
    
    public final g c2(int i) {
        final int[] array = new int[8];
        final int[] array2 = new int[8];
        final int n = i * 8 * 2;
        int[] h;
        for (i = 0; i < 8; ++i) {
            h = this.h;
            array[i] = h[n + i];
            array2[i] = h[n + 8 + i];
        }
        final rl2.b j = this.i;
        final c c = new c(array);
        final c c2 = new c(array2);
        final f[] k = rl2.b.k;
        j.getClass();
        return (g)new d((pl2.d)j, (f)c, (f)c2, k);
    }
}
