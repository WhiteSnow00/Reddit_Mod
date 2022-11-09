// 
// Decompiled by Procyon v0.6.0
// 

package re;

import u5.w;
import android.os.SystemClock;

public final class d6 extends m
{
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    
    public final void b() {
        switch (this.e) {
            default: {
                final u6 u6 = (u6)this.f;
                ((k2)u6.d).y();
                ((h4)((w)u6.d).f).s.getClass();
                u6.a(SystemClock.elapsedRealtime(), false, false);
                final j1 l = ((h4)((w)u6.d).f).l();
                ((h4)((w)u6.d).f).s.getClass();
                l.B(SystemClock.elapsedRealtime());
                return;
            }
            case 0: {
                final l6 l2 = (l6)this.f;
                ((k2)l2).y();
                if (l2.E()) {
                    ((h4)((w)l2).f).f().s.a("Inactivity, disconnecting from the service");
                    l2.O();
                }
            }
        }
    }
}
