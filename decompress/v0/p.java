// 
// Decompiled by Procyon v0.6.0
// 

package v0;

import androidx.compose.foundation.gestures.Orientation;
import n1.d;
import i2.n;
import o2.x;
import c2.u;

public final class p
{
    public static final d a(final u u, int s0, final x x, final n n, final boolean b, final int n2) {
        d d;
        if (n != null) {
            d = n.c(x.b.b(s0));
        }
        else {
            d = n1.d.e;
        }
        s0 = u.s0(m.a);
        float a;
        if (b) {
            a = n2 - d.a - s0;
        }
        else {
            a = d.a;
        }
        float n3;
        if (b) {
            n3 = n2 - d.a;
        }
        else {
            n3 = s0 + d.a;
        }
        return n1.d.a(d, a, 0.0f, n3, 10);
    }
}
