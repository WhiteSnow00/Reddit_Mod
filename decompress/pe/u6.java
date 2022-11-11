// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.os.BaseBundle;
import z0.d1;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.q;
import ie.d9;
import android.os.SystemClock;

public final class u6
{
    public long a;
    public long b;
    public final d6 c;
    public final /* synthetic */ w6 d;
    
    public u6(final w6 d) {
        this.d = d;
        this.c = new d6((Object)this, (w4)((d1)d).f, 1);
        ((h4)((d1)d).f).s.getClass();
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a = elapsedRealtime;
        this.b = elapsedRealtime;
    }
    
    public final boolean a(final long n, final boolean b, final boolean b2) {
        ((l2)this.d).M();
        ((i3)this.d).N();
        ((d9)q.g.f.zza()).zza();
        if (((h4)((d1)this.d).f).l.V(null, r2.d0)) {
            if (((h4)((d1)this.d).f).d()) {
                final o3 s = ((h4)((d1)this.d).f).r().s;
                ((h4)((d1)this.d).f).s.getClass();
                s.b(System.currentTimeMillis());
            }
        }
        else {
            final o3 s2 = ((h4)((d1)this.d).f).r().s;
            ((h4)((d1)this.d).f).s.getClass();
            s2.b(System.currentTimeMillis());
        }
        long n2 = n - this.a;
        if (!b && n2 < 1000L) {
            ((h4)((d1)this.d).f).h().s.b((Object)n2, "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!b2) {
            n2 = n - this.b;
            this.b = n;
        }
        ((h4)((d1)this.d).f).h().s.b((Object)n2, "Recording user engagement, ms");
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putLong("_et", n2);
        n7.Z(((h4)((d1)this.d).f).u().T(((h4)((d1)this.d).f).l.W() ^ true), bundle, true);
        if (!b2) {
            ((h4)((d1)this.d).f).t().T(bundle, "auto", "_e");
        }
        this.a = n;
        ((m)this.c).a();
        ((m)this.c).c(3600000L);
        return true;
    }
}
