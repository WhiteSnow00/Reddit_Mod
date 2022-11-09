// 
// Decompiled by Procyon v0.6.0
// 

package p1;

import kz0.k;
import androidx.compose.ui.graphics.colorspace.Rgb;
import dg.d;

public class e
{
    public final c a;
    public final c b;
    public final float[] c;
    
    public e(c c, final c c2, int n) {
        final long b = c.b;
        final long a = p1.b.a;
        c b2;
        if (p1.b.a(b, a)) {
            b2 = d.B(c);
        }
        else {
            b2 = c;
        }
        c b3;
        if (p1.b.a(c2.b, a)) {
            b3 = d.B(c2);
        }
        else {
            b3 = c2;
        }
        if (n == 3) {
            n = 1;
        }
        else {
            n = 0;
        }
        float[] array3 = null;
        Label_0218: {
            if (n != 0) {
                final boolean a2 = p1.b.a(c.b, a);
                final boolean a3 = p1.b.a(c2.b, a);
                if (!a2 || !a3) {
                    if (a2 || a3) {
                        if (!a2) {
                            c = c2;
                        }
                        final Rgb rgb = (Rgb)c;
                        float[] array;
                        if (a2) {
                            array = rgb.d.a();
                        }
                        else {
                            array = k.k;
                        }
                        float[] array2;
                        if (a3) {
                            array2 = rgb.d.a();
                        }
                        else {
                            array2 = k.k;
                        }
                        array3 = new float[] { array[0] / array2[0], array[1] / array2[1], array[2] / array2[2] };
                        break Label_0218;
                    }
                }
            }
            array3 = null;
        }
        this(b2, b3, array3);
    }
    
    public e(final c a, final c b, final float[] c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void a(float[] e) {
        e = this.a.e(e);
        final float[] c = this.c;
        if (c != null) {
            e[0] *= c[0];
            e[1] *= c[1];
            e[2] *= c[2];
        }
        this.b.a(e);
    }
}
