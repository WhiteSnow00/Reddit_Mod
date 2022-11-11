// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.os.BaseBundle;
import z0.d1;
import ld.k;
import com.android.billingclient.api.w;
import android.os.SystemClock;
import android.net.Uri;
import android.content.Intent;
import ld.i;
import android.os.Bundle;
import android.app.Activity;
import android.app.Application$ActivityLifecycleCallbacks;

public final class n5 implements Application$ActivityLifecycleCallbacks
{
    public final /* synthetic */ o5 f;
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        while (true) {
            while (true) {
                Label_0236: {
                    try {
                        ((h4)((d1)this.f).f).h().s.a("onActivityCreated");
                        final Intent intent = activity.getIntent();
                        h4 h4;
                        if (intent == null) {
                            h4 = (h4)((d1)this.f).f;
                        }
                        else {
                            final Uri data = intent.getData();
                            if (data == null || !data.isHierarchical()) {
                                break Label_0236;
                            }
                            ((h4)((d1)this.f).f).y();
                            final String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                            final boolean equals = "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra);
                            boolean b = true;
                            String s;
                            if (!equals && !"https://www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
                                s = "auto";
                            }
                            else {
                                s = "gs";
                            }
                            final String queryParameter = data.getQueryParameter("referrer");
                            if (bundle != null) {
                                b = false;
                            }
                            ((h4)((d1)this.f).f).b().U(new i(this, b, data, s, queryParameter));
                            h4 = (h4)((d1)this.f).f;
                        }
                        h4.u().V(activity, bundle);
                        return;
                    }
                    catch (final RuntimeException ex) {
                        break Label_0236;
                        final h4 h4 = (h4)((d1)this.f).f;
                        continue;
                    }
                    finally {
                        break;
                    }
                }
                final Throwable t;
                ((h4)((d1)this.f).f).h().k.b((Object)t, "Throwable caught in onActivityCreated");
                h4 h4 = (h4)((d1)this.f).f;
                continue;
            }
        }
        ((h4)((d1)this.f).f).u().V(activity, bundle);
    }
    
    public final void onActivityDestroyed(final Activity activity) {
        final y5 u = ((h4)((d1)this.f).f).u();
        synchronized (u.q) {
            if (activity == u.l) {
                u.l = null;
            }
            monitorexit(u.q);
            if (((h4)((d1)u).f).l.W()) {
                u.k.remove(activity);
            }
        }
    }
    
    public final void onActivityPaused(final Activity activity) {
        final y5 u = ((h4)((d1)this.f).f).u();
        synchronized (u.q) {
            u.p = false;
            u.m = true;
            monitorexit(u.q);
            ((h4)((d1)u).f).s.getClass();
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!((h4)((d1)u).f).l.W()) {
                u.h = null;
                ((h4)((d1)u).f).b().U(new w5(u, elapsedRealtime));
            }
            else {
                final u5 w = u.W(activity);
                u.i = u.h;
                u.h = null;
                ((h4)((d1)u).f).b().U(new x5(u, w, elapsedRealtime));
            }
            final w6 w2 = ((h4)((d1)this.f).f).w();
            ((h4)((d1)w2).f).s.getClass();
            ((h4)((d1)w2).f).b().U(new f5((i3)w2, SystemClock.elapsedRealtime(), 1));
        }
    }
    
    public final void onActivityResumed(final Activity l) {
        final w6 w = ((h4)((d1)this.f).f).w();
        ((h4)((d1)w).f).s.getClass();
        ((h4)((d1)w).f).b().U(new s6(w, SystemClock.elapsedRealtime()));
        final y5 u = ((h4)((d1)this.f).f).u();
        synchronized (u.q) {
            u.p = true;
            if (l != u.l) {
                Object o = u.q;
                synchronized (o) {
                    u.l = l;
                    u.m = false;
                    monitorexit(o);
                    if (((h4)((d1)u).f).l.W()) {
                        u.n = null;
                        o = ((h4)((d1)u).f).b();
                        ((g4)o).U((Runnable)new w((Object)u, 3));
                    }
                }
            }
            monitorexit(u.q);
            if (!((h4)((d1)u).f).l.W()) {
                u.h = u.n;
                ((h4)((d1)u).f).b().U(new k(u, 2));
            }
            else {
                u.Q(l, u.W(l), false);
                final k1 k = ((h4)((d1)u).f).k();
                ((h4)k.f).s.getClass();
                ((h4)k.f).b().U(new j0(k, SystemClock.elapsedRealtime()));
            }
        }
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        final y5 u = ((h4)((d1)this.f).f).u();
        if (((h4)((d1)u).f).l.W()) {
            if (bundle != null) {
                final u5 u2 = u.k.get(activity);
                if (u2 != null) {
                    final Bundle bundle2 = new Bundle();
                    ((BaseBundle)bundle2).putLong("id", u2.c);
                    ((BaseBundle)bundle2).putString("name", u2.a);
                    ((BaseBundle)bundle2).putString("referrer_name", u2.b);
                    bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
                }
            }
        }
    }
    
    public final void onActivityStarted(final Activity activity) {
    }
    
    public final void onActivityStopped(final Activity activity) {
    }
}
