// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.os.BaseBundle;
import z0.d1;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.n;
import ie.x8;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.y;
import android.app.ActivityManager;
import android.app.ActivityManager$RunningAppProcessInfo;

public final class v6
{
    public final /* synthetic */ w6 a;
    
    public v6(final w6 a) {
        this.a = a;
    }
    
    public final void a() {
        ((l2)this.a).M();
        final r3 r = ((h4)((d1)this.a).f).r();
        ((h4)((d1)this.a).f).s.getClass();
        if (r.W(System.currentTimeMillis())) {
            ((h4)((d1)this.a).f).r().p.a(true);
            final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo = new ActivityManager$RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(activityManager$RunningAppProcessInfo);
            if (activityManager$RunningAppProcessInfo.importance == 100) {
                ((h4)((d1)this.a).f).h().s.a("Detected application was in foreground");
                ((h4)((d1)this.a).f).s.getClass();
                this.c(System.currentTimeMillis(), false);
            }
        }
    }
    
    public final void b(final long n, final boolean b) {
        ((l2)this.a).M();
        this.a.Q();
        if (((h4)((d1)this.a).f).r().W(n)) {
            ((h4)((d1)this.a).f).r().p.a(true);
            y.a();
            if (((h4)((d1)this.a).f).l.V(null, r2.u0)) {
                ((h4)((d1)this.a).f).o().T();
            }
        }
        ((h4)((d1)this.a).f).r().s.b(n);
        if (((h4)((d1)this.a).f).r().p.b()) {
            this.c(n, b);
        }
    }
    
    public final void c(final long n, final boolean b) {
        ((l2)this.a).M();
        if (!((h4)((d1)this.a).f).d()) {
            return;
        }
        ((h4)((d1)this.a).f).r().s.b(n);
        ((h4)((d1)this.a).f).s.getClass();
        ((h4)((d1)this.a).f).h().s.b((Object)SystemClock.elapsedRealtime(), "Session started, time");
        final Long value = n / 1000L;
        ((h4)((d1)this.a).f).t().c0(n, (Object)value, "auto", "_sid");
        ((h4)((d1)this.a).f).r().p.a(false);
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putLong("_sid", (long)value);
        if (((h4)((d1)this.a).f).l.V(null, r2.Z) && b) {
            ((BaseBundle)bundle).putLong("_aib", 1L);
        }
        ((h4)((d1)this.a).f).t().U(n, bundle, "auto", "_s");
        ((x8)n.g.f.zza()).zza();
        if (((h4)((d1)this.a).f).l.V(null, r2.c0)) {
            final String a = ((h4)((d1)this.a).f).r().x.a();
            if (!TextUtils.isEmpty((CharSequence)a)) {
                final Bundle bundle2 = new Bundle();
                ((BaseBundle)bundle2).putString("_ffr", a);
                ((h4)((d1)this.a).f).t().U(n, bundle2, "auto", "_ssr");
            }
        }
    }
}
