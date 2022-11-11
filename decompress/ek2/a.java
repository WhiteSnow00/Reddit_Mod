// 
// Decompiled by Procyon v0.6.0
// 

package ek2;

public final class a implements b
{
    public float[] b;
    public int c;
    
    public a() {
        this.b = new float[640];
        this.c = 0;
    }
    
    public final void a(final g g, final float[] array, final float[][][] array2, final int n, final int n2) {
        final float[] array3 = new float[64];
        final float[] array4 = new float[32];
        final float[] array5 = new float[32];
        final float[] array6 = new float[32];
        final float[] array7 = new float[32];
        int i = 0;
        int n3 = 0;
        while (i < g.x0) {
            for (int j = 31; j >= 0; --j, ++n3) {
                final float[] b = this.b;
                final int c = this.c;
                b[c + j] = (b[c + j + 320] = array[n3]);
            }
            for (int k = 0; k < 64; ++k) {
                final float[] b2 = this.b;
                final int c2 = this.c;
                final float n4 = b2[c2 + k];
                final float[] a = ek2.b.a;
                array3[k] = b2[c2 + k + 256] * a[(k + 256) * 2] + (b2[c2 + k + 192] * a[(k + 192) * 2] + (b2[c2 + k + 128] * a[(k + 128) * 2] + (b2[c2 + k + 64] * a[(k + 64) * 2] + n4 * a[k * 2])));
            }
            if ((this.c -= 32) < 0) {
                this.c = 288;
            }
            array5[31] = array3[1];
            array4[0] = array3[0];
            int n5;
            for (int l = 1; l < 31; l = n5) {
                n5 = l + 1;
                array5[31 - l] = array3[n5];
                array4[l] = -array3[64 - l];
            }
            array5[0] = array3[32];
            array4[31] = -array3[33];
            vl.a.F(array4, array5, array6, array7);
            for (int n6 = 0; n6 < 16; ++n6) {
                final int n7 = n6 * 2;
                final int n8 = n7 + 1;
                if (n8 < n2) {
                    final float[][] array8 = array2[i + n];
                    final float[] array9 = array8[n7];
                    array9[0] = array6[n6] * 2.0f;
                    array9[1] = array7[n6] * 2.0f;
                    final float[] array10 = array8[n8];
                    final int n9 = 31 - n6;
                    array10[0] = array7[n9] * -2.0f;
                    array10[1] = array6[n9] * -2.0f;
                }
                else {
                    if (n7 < n2) {
                        final float[] array11 = array2[i + n][n7];
                        array11[0] = array6[n6] * 2.0f;
                        array11[1] = array7[n6] * 2.0f;
                    }
                    else {
                        final float[] array12 = array2[i + n][n7];
                        array12[1] = (array12[0] = 0.0f);
                    }
                    final float[] array13 = array2[i + n][n8];
                    array13[1] = (array13[0] = 0.0f);
                }
            }
            ++i;
        }
    }
}
