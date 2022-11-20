// 
// Decompiled by Procyon v0.6.0
// 

package bk2;

import net.sourceforge.jaad.aac.syntax.ICSInfo;

public final class b extends d
{
    public static final float[] k;
    public final net.sourceforge.jaad.aac.syntax.b c;
    public float[] d;
    public int e;
    public int f;
    public final boolean[] g;
    public final int[] h;
    public final int[] i;
    public final float[][] j;
    
    static {
        k = new float[] { 1.0905077f, 1.1892071f, 1.4142135f, 2.0f };
    }
    
    public b(final int n) {
        this.c = new net.sourceforge.jaad.aac.syntax.b(n);
        this.g = new boolean[8];
        this.h = new int[8];
        this.i = new int[8];
        this.j = new float[16][120];
    }
    
    public final void a(final int n, final float[] array) {
        ICSInfo d = this.c.d;
        final int[] s = d.s;
        final int p2 = d.p;
        final int h = d.h;
        int i = 0;
        int n2 = 0;
        int n4;
        int n3 = n4 = n2;
        while (i < p2) {
            final int n5 = d.q[i];
            ICSInfo icsInfo;
            for (int j = 0; j < h; ++j, ++n4, d = icsInfo) {
                icsInfo = d;
                if ((new int[][] { new int[0] })[i][j] != 0) {
                    final float n6 = this.j[n][n4];
                    int n7 = 0;
                    while (true) {
                        icsInfo = d;
                        if (n7 >= n5) {
                            break;
                        }
                        for (int k = s[j]; k < s[j + 1]; ++k) {
                            final int n8 = n7 * 128;
                            final int n9 = n3 + n8 + k;
                            array[n9] += this.d[n8 + n2 + k] * n6;
                        }
                        ++n7;
                    }
                }
            }
            final int n10 = n5 * 128;
            n3 += n10;
            n2 += n10;
            ++i;
        }
    }
}
