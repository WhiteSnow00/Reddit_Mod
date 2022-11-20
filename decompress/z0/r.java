// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import mg2.q;
import ah0.b;
import androidx.compose.runtime.ComposerKt;
import ng2.e;
import mg2.a;

public final class r<T> extends m0<T>
{
    public final z0<T> b;
    
    public r(final z0<T> b, final a<? extends T> a) {
        e.f((Object)b, "policy");
        e.f((Object)a, "defaultFactory");
        super((a)a);
        this.b = b;
    }
    
    public final c1 a(final Object value, final d d) {
        d.A(-84026900);
        final q a = ComposerKt.a;
        d.A(-492369756);
        Object o;
        if ((o = d.B()) == d$a.a) {
            o = ah0.b.Y0(value, (z0)this.b);
            d.w(o);
        }
        d.H();
        final g0 g0 = (g0)o;
        g0.setValue(value);
        d.H();
        return (c1)g0;
    }
}
