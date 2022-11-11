// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.os.Handler;
import mf1.a;
import lw0.b;
import com.android.billingclient.api.j0;
import ie.o0;

public abstract class m
{
    public static volatile o0 d;
    public final w4 a;
    public final j0 b;
    public volatile long c;
    
    public m(final w4 a) {
        lw0.b.R((Object)a);
        this.a = a;
        this.b = new j0((Object)this, (Object)a, 2);
    }
    
    public final void a() {
        this.c = 0L;
        this.d().removeCallbacks((Runnable)this.b);
    }
    
    public abstract void b();
    
    public final void c(final long n) {
        this.a();
        if (n >= 0L) {
            ((a)this.a.i()).getClass();
            this.c = System.currentTimeMillis();
            if (!this.d().postDelayed((Runnable)this.b, n)) {
                this.a.h().k.b((Object)n, "Failed to schedule delayed post. time");
            }
        }
    }
    
    public final Handler d() {
        if (m.d != null) {
            return (Handler)m.d;
        }
        synchronized (m.class) {
            if (m.d == null) {
                m.d = new o0(this.a.x().getMainLooper());
            }
            return (Handler)m.d;
        }
    }
}
