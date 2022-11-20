// 
// Decompiled by Procyon v0.6.0
// 

package p3;

import i10.a;

public final class l
{
    public static final l k;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;
    
    static {
        final float[] s = a.S;
        final float n = (float)(a.A0() * 63.66197723675813 / 100.0);
        final float[][] q = a.Q;
        final float n2 = s[0];
        final float[] array = q[0];
        final float n3 = array[0];
        final float n4 = s[1];
        final float n5 = array[1];
        final float n6 = s[2];
        final float n7 = array[2] * n6 + (n5 * n4 + n3 * n2);
        final float[] array2 = q[1];
        final float n8 = array2[2] * n6 + (array2[1] * n4 + array2[0] * n2);
        final float[] array3 = q[2];
        final float n9 = n6 * array3[2] + (n4 * array3[1] + n2 * array3[0]);
        float n10;
        if (1.0f >= 0.9) {
            n10 = 0.69f;
        }
        else {
            n10 = 0.655f;
        }
        float a = b.a((float)Math.exp((-n - 42.0f) / 92.0f), 0.2777778f, 1.0f, 1.0f);
        final double n11 = a;
        if (n11 > 1.0) {
            a = 1.0f;
        }
        else if (n11 < 0.0) {
            a = 0.0f;
        }
        final float[] array4 = { 100.0f / n7 * a + 1.0f - a, 100.0f / n8 * a + 1.0f - a, 100.0f / n9 * a + 1.0f - a };
        final float n12 = 1.0f / (5.0f * n + 1.0f);
        final float n13 = n12 * n12 * n12 * n12;
        final float n14 = 1.0f - n13;
        final float n15 = 0.1f * n14 * n14 * (float)Math.cbrt(n * 5.0) + n13 * n;
        final float n16 = i10.a.A0() / s[1];
        final double n17 = n16;
        final float n18 = (float)Math.sqrt(n17);
        final float n19 = 0.725f / (float)Math.pow(n17, 0.2);
        final float[] array5 = { (float)Math.pow(array4[0] * n15 * n7 / 100.0, 0.42), (float)Math.pow(array4[1] * n15 * n8 / 100.0, 0.42), 0.0f };
        final float n20 = (float)Math.pow(array4[2] * n15 * n9 / 100.0, 0.42);
        array5[2] = n20;
        final float n21 = array5[0];
        final float n22 = n21 * 400.0f / (n21 + 27.13f);
        final float n23 = array5[1];
        k = new l(n16, (400.0f * n20 / (n20 + 27.13f) * 0.05f + (n22 * 2.0f + n23 * 400.0f / (n23 + 27.13f))) * n19, n19, n19, n10, 1.0f, array4, n15, (float)Math.pow(n15, 0.25), n18 + 1.48f);
    }
    
    public l(final float f, final float a, final float b, final float c, final float d, final float e, final float[] g, final float h, final float i, final float j) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
}
