// 
// Decompiled by Procyon v0.6.0
// 

package k0;

import l0.u;
import l0.o;
import z0.d$a;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import u2.b;
import l0.n;
import z0.d;
import android.view.ViewConfiguration;

public final class s
{
    public static final float a;
    
    static {
        a = ViewConfiguration.getScrollFriction();
    }
    
    public static final n a(final d d) {
        d.A(904445851);
        final b b = (b)d.u((o0)CompositionLocalsKt.e);
        final float density = b.getDensity();
        d.A(1157296644);
        final boolean m = d.m((Object)density);
        final Object b2 = d.B();
        Object o;
        if (m || (o = b2) == d$a.a) {
            o = new o((u)new r(b));
            d.w(o);
        }
        d.I();
        final n n = (n)o;
        d.I();
        return n;
    }
}
