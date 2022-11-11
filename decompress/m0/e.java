// 
// Decompiled by Procyon v0.6.0
// 

package m0;

import androidx.compose.foundation.gestures.Orientation;
import o1.l0;
import aa1.a;
import j1.d;

public final class e
{
    public static final float a;
    public static final d b;
    public static final d c;
    
    static {
        a = 30;
        final int t3 = d.T3;
        final d.a f = d.a.f;
        b = aa1.a.O((d)f, (l0)new e$a());
        c = aa1.a.O((d)f, (l0)new e$b());
    }
    
    public static final d a(final d d, final Orientation orientation) {
        sg2.e.f((Object)d, "<this>");
        sg2.e.f((Object)orientation, "orientation");
        d d2;
        if (orientation == Orientation.Vertical) {
            d2 = e.c;
        }
        else {
            d2 = e.b;
        }
        return d.j0(d2);
    }
}
