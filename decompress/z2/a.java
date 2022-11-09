// 
// Decompiled by Procyon v0.6.0
// 

package z2;

import android.content.Context;
import android.content.Intent;
import ie.ib;
import ie.g2;
import h.s;
import ie.od;
import ie.fd;
import ie.fc;
import ng.g0;
import ng.c;
import ng.h0;
import jh.i;
import ie.s5;
import javax.inject.Provider;
import androidx.constraintlayout.core.SolverVariable;
import a2.f;
import ng.v;
import ie.nc;

public final class a implements nc, v
{
    public Object f = f;
    public Object g = g;
    public Object h = h;
    public Object i = i;
    
    public final void a(final String s) {
        ((s5)this.h).d(jh.i.a(s));
    }
    
    public final void b(final int n) {
        final h0 h0 = (h0)this.i;
        h0.g.post((Runnable)new g0(h0, (c)this.f, 6, n));
    }
    
    public final void c(final fc fc) {
        final fd fd = (fd)fc;
        final od od = new od();
        final String g = fd.g;
        yd.a.P0(g);
        od.f = g;
        final String g2 = (String)this.f;
        if (g2 == null) {
            od.i.g.add("EMAIL");
        }
        else {
            od.g = g2;
        }
        final String h = (String)this.g;
        if (h == null) {
            od.i.g.add("PASSWORD");
        }
        else {
            od.h = h;
        }
        final s s = (s)this.i;
        final s5 s2 = (s5)this.h;
        yd.a.S0((Object)s2);
        ((android.support.v4.media.a)s.g).l2(new g2(fd.g), (nc)new ib(s, s2, (nc)this, fd, od));
    }
    
    public final void s() {
        if (!((Intent)this.g).getBooleanExtra("triggered_from_app_after_verification", false)) {
            ((Intent)this.g).putExtra("triggered_from_app_after_verification", true);
            ((Context)this.h).sendBroadcast((Intent)this.g);
            return;
        }
        ((h0)this.i).a.h("Splits copied and verified more than once.", new Object[0]);
    }
    
    public final void zza() {
        final h0 h0 = (h0)this.i;
        h0.g.post((Runnable)new g0(h0, (c)this.f, 5, 0));
    }
}
