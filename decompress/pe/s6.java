// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.os.Handler;
import z0.d1;

public final class s6 implements Runnable
{
    public final /* synthetic */ long f;
    public final /* synthetic */ w6 g;
    
    public s6(final w6 g, final long f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final void run() {
        final w6 g = this.g;
        final long f = this.f;
        ((l2)g).M();
        g.Q();
        ((h4)((d1)g).f).h().s.b((Object)f, "Activity resumed, time");
        if (((h4)((d1)g).f).l.W() || ((h4)((d1)g).f).r().u.b()) {
            final u6 j = g.j;
            ((l2)j.d).M();
            ((m)j.c).a();
            j.a = f;
            j.b = f;
        }
        final a4 k = g.k;
        ((l2)k.b).M();
        final t6 t6 = (t6)k.a;
        if (t6 != null) {
            ((Handler)((w6)k.b).h).removeCallbacks((Runnable)t6);
        }
        ((h4)((d1)k.b).f).r().u.a(false);
        final v6 i = g.i;
        ((l2)i.a).M();
        if (((h4)((d1)i.a).f).d()) {
            ((h4)((d1)i.a).f).s.getClass();
            i.b(System.currentTimeMillis(), false);
        }
    }
}
