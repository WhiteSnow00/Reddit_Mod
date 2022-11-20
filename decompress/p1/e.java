// 
// Decompiled by Procyon v0.6.0
// 

package p1;

import i10.a;
import androidx.compose.ui.graphics.colorspace.Rgb;

public class e
{
    public final c a;
    public final c b;
    public final float[] c;
    
    public e(c c, final c c2, int n) {
        final long b = c.b;
        final long a = p1.b.a;
        c s;
        if (p1.b.a(b, a)) {
            s = ah0.b.s(c);
        }
        else {
            s = c;
        }
        c s2;
        if (p1.b.a(c2.b, a)) {
            s2 = ah0.b.s(c2);
        }
        else {
            s2 = c2;
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
                            array = i10.a.P;
                        }
                        float[] array2;
                        if (a3) {
                            array2 = rgb.d.a();
                        }
                        else {
                            array2 = i10.a.P;
                        }
                        array3 = new float[] { array[0] / array2[0], array[1] / array2[1], array[2] / array2[2] };
                        break Label_0218;
                    }
                }
            }
            array3 = null;
        }
        this(s, s2, array3);
    }
    
    public e(final c a, final c b, final float[] c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void a(float[] c) {
        final float[] e = this.a.e(c);
        c = this.c;
        if (c != null) {
            e[0] *= c[0];
            e[1] *= c[1];
            e[2] *= c[2];
        }
        this.b.a(e);
    }
}
