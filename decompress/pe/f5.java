// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.os.Handler;
import z0.d1;
import java.util.concurrent.atomic.AtomicReference;

public final class f5 implements Runnable
{
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;
    public final /* synthetic */ i3 h;
    
    @Override
    public final void run() {
        switch (this.f) {
            default: {
                final w6 w6 = (w6)this.h;
                final long g = this.g;
                ((l2)w6).M();
                w6.Q();
                ((h4)((d1)w6).f).h().s.b((Object)g, "Activity paused, time");
                final a4 k = w6.k;
                ((h4)((d1)k.b).f).s.getClass();
                final t6 a = new t6(k, System.currentTimeMillis(), g);
                k.a = a;
                ((Handler)((w6)k.b).h).postDelayed((Runnable)a, 2000L);
                if (((h4)((d1)w6).f).l.W()) {
                    ((m)w6.j.c).a();
                }
                return;
            }
            case 0: {
                ((o5)this.h).W(this.g, true);
                ((h4)((d1)this.h).f).v().d0(new AtomicReference());
            }
        }
    }
}
