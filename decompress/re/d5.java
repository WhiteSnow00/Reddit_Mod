// 
// Decompiled by Procyon v0.6.0
// 

package re;

import u5.w;
import java.util.concurrent.atomic.AtomicReference;

public final class d5 implements Runnable
{
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;
    public final /* synthetic */ h3 h;
    
    @Override
    public final void run() {
        switch (this.f) {
            default: {
                final w6 w6 = (w6)this.h;
                final long g = this.g;
                ((k2)w6).y();
                w6.C();
                ((h4)((w)w6).f).f().s.b(g, "Activity paused, time");
                final a4 k = w6.k;
                ((h4)((w)k.b).f).s.getClass();
                final t6 a = new t6(k, System.currentTimeMillis(), g);
                k.a = a;
                ((w6)k.b).h.postDelayed((Runnable)a, 2000L);
                if (((h4)((w)w6).f).l.I()) {
                    w6.j.c.a();
                }
                return;
            }
            case 0: {
                ((n5)this.h).I(this.g, true);
                ((h4)((w)this.h).f).w().P(new AtomicReference());
            }
        }
    }
}
