// 
// Decompiled by Procyon v0.6.0
// 

package re;

import android.os.BaseBundle;
import android.content.pm.ServiceInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.text.TextUtils;
import android.content.ComponentName;
import android.os.SystemClock;
import android.os.Bundle;
import ke.a1;
import com.android.billingclient.api.i0;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import ke.a5;
import u5.w;
import android.database.ContentObserver;
import ke.m4;
import ke.z4;
import ke.i4;
import ke.y4;
import aj2.c;
import kz0.k;
import v7.a;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

public final class h4 implements u4
{
    public static volatile h4 M;
    public n A;
    public u2 B;
    public boolean C;
    public Boolean D;
    public long E;
    public volatile Boolean F;
    public Boolean G;
    public Boolean H;
    public volatile boolean I;
    public int J;
    public final AtomicInteger K;
    public final long L;
    public final Context f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final a k;
    public final f l;
    public final q3 m;
    public final c3 n;
    public final g4 o;
    public final w6 p;
    public final n7 q;
    public final x2 r;
    public final k s;
    public final x5 t;
    public final n5 u;
    public final j1 v;
    public final r5 w;
    public final String x;
    public w2 y;
    public l6 z;
    
    public h4(final x4 x4) {
        boolean b = false;
        this.C = false;
        this.K = new AtomicInteger(0);
        final Context a = x4.a;
        final a a2 = new a(0);
        this.k = a2;
        c.u = a2;
        this.f = a;
        this.g = x4.b;
        this.h = x4.c;
        this.i = x4.d;
        this.j = x4.h;
        this.F = x4.e;
        this.x = x4.j;
        this.I = true;
        final a1 g = x4.g;
        if (g != null) {
            final Bundle l = g.l;
            if (l != null) {
                final Object value = ((BaseBundle)l).get("measurementEnabled");
                if (value instanceof Boolean) {
                    this.G = (Boolean)value;
                }
                final Object value2 = ((BaseBundle)g.l).get("measurementDeactivated");
                if (value2 instanceof Boolean) {
                    this.H = (Boolean)value2;
                }
            }
        }
        if (y4.g == null) {
            synchronized (y4.f) {
                if (y4.g == null) {
                    synchronized (y4.f) {
                        final ke.g4 g2 = y4.g;
                        Context applicationContext = a.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = a;
                        }
                        Label_0350: {
                            if (g2 != null && g2.a == applicationContext) {
                                break Label_0350;
                            }
                            i4.c();
                            z4.a();
                            synchronized (m4.class) {
                                final m4 c = m4.c;
                                if (c != null) {
                                    final Context a3 = c.a;
                                    if (a3 != null && c.b != null) {
                                        a3.getContentResolver().unregisterContentObserver((ContentObserver)m4.c.b);
                                    }
                                }
                                m4.c = null;
                                monitorexit(m4.class);
                                y4.g = new ke.g4(applicationContext, com.google.android.gms.internal.measurement.a.b((a5)new w(applicationContext)));
                                y4.h.incrementAndGet();
                            }
                        }
                    }
                }
            }
        }
        this.s = kz0.k.r;
        final Long i = x4.i;
        long j;
        if (i != null) {
            j = i;
        }
        else {
            j = System.currentTimeMillis();
        }
        this.L = j;
        this.l = new f(this);
        final q3 m = new q3(this);
        m.B();
        this.m = m;
        final c3 n = new c3(this);
        n.B();
        this.n = n;
        final n7 q = new n7(this);
        q.B();
        this.q = q;
        this.r = new x2(new c1.c(this));
        this.v = new j1(this);
        final x5 t = new x5(this);
        ((h3)t).A();
        this.t = t;
        final n5 u = new n5(this);
        ((h3)u).A();
        this.u = u;
        final w6 p = new w6(this);
        ((h3)p).A();
        this.p = p;
        final r5 w = new r5(this);
        w.B();
        this.w = w;
        final g4 o = new g4(this);
        o.B();
        this.o = o;
        final a1 g3 = x4.g;
        if (g3 == null || g3.g == 0L) {
            b = true;
        }
        if (a.getApplicationContext() instanceof Application) {
            final n5 u2 = this.u();
            if (((h4)((w)u2).f).f.getApplicationContext() instanceof Application) {
                final Application application = (Application)((h4)((w)u2).f).f.getApplicationContext();
                if (u2.h == null) {
                    u2.h = new m5(u2);
                }
                if (b) {
                    application.unregisterActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)u2.h);
                    application.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)u2.h);
                    ((h4)((w)u2).f).f().s.a("Registered activity lifecycle callback");
                }
            }
        }
        else {
            this.f().n.a("Application context is not an Application");
        }
        o.G(new i0(this, x4, 4));
    }
    
    public static final void h(final h3 h3) {
        if (h3 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (h3.g) {
            return;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(h3.getClass())));
    }
    
    public static final void j(final t4 t4) {
        if (t4 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (t4.g) {
            return;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(t4.getClass())));
    }
    
    public static h4 t(final Context context, final a1 a1, final Long n) {
        a1 a2 = a1;
        Label_0053: {
            if (a1 != null) {
                if (a1.j != null) {
                    a2 = a1;
                    if (a1.k != null) {
                        break Label_0053;
                    }
                }
                a2 = new a1(a1.f, a1.g, a1.h, a1.i, (String)null, (String)null, a1.l, (String)null);
            }
        }
        yd.a.S0((Object)context);
        yd.a.S0((Object)context.getApplicationContext());
        Label_0163: {
            if (h4.M == null) {
                synchronized (h4.class) {
                    if (h4.M == null) {
                        h4.M = new h4(new x4(context, a2, n));
                    }
                    break Label_0163;
                }
            }
            if (a2 != null) {
                final Bundle l = a2.l;
                if (l != null && ((BaseBundle)l).containsKey("dataCollectionDefaultEnabled")) {
                    yd.a.S0((Object)h4.M);
                    h4.M.F = ((BaseBundle)a2.l).getBoolean("dataCollectionDefaultEnabled");
                }
            }
        }
        yd.a.S0((Object)h4.M);
        return h4.M;
    }
    
    public final g4 a() {
        j(this.o);
        return this.o;
    }
    
    public final void b() {
        this.K.incrementAndGet();
    }
    
    public final void c() {
        ++this.J;
    }
    
    public final boolean d() {
        return this.k() == 0;
    }
    
    public final boolean e() {
        Label_0318: {
            if (!this.C) {
                break Label_0318;
            }
            this.a().y();
            final Boolean d = this.D;
            Label_0310: {
                if (d != null && this.E != 0L) {
                    if (d) {
                        break Label_0310;
                    }
                    this.s.getClass();
                    if (Math.abs(SystemClock.elapsedRealtime() - this.E) <= 1000L) {
                        break Label_0310;
                    }
                }
                this.s.getClass();
                this.E = SystemClock.elapsedRealtime();
                final boolean g0 = this.y().g0("android.permission.INTERNET");
                final boolean b = false;
                Label_0221: {
                    if (!g0 || !this.y().g0("android.permission.ACCESS_NETWORK_STATE")) {
                        break Label_0221;
                    }
                    Label_0216: {
                        if (yd.c.a(this.f).c() || this.l.L()) {
                            break Label_0216;
                        }
                        if (!n7.m0(this.f)) {
                            break Label_0221;
                        }
                        final Context f = this.f;
                        yd.a.S0((Object)f);
                        while (true) {
                            try {
                                final PackageManager packageManager = f.getPackageManager();
                                boolean b2 = false;
                                Label_0211: {
                                    if (packageManager != null) {
                                        final ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(f, "com.google.android.gms.measurement.AppMeasurementJobService"), 0);
                                        if (serviceInfo != null && serviceInfo.enabled) {
                                            b2 = true;
                                            break Label_0211;
                                        }
                                    }
                                    b2 = false;
                                }
                                boolean b3;
                                if (b2) {
                                    b3 = true;
                                }
                                else {
                                    b3 = false;
                                }
                                final Boolean value = b3;
                                this.D = value;
                                if (value) {
                                    final n7 y = this.y();
                                    final String e = this.o().E();
                                    final u2 o = this.o();
                                    ((h3)o).z();
                                    boolean b4 = false;
                                    Label_0302: {
                                        if (!y.Y(e, o.r)) {
                                            final u2 o2 = this.o();
                                            ((h3)o2).z();
                                            b4 = b;
                                            if (TextUtils.isEmpty((CharSequence)o2.r)) {
                                                break Label_0302;
                                            }
                                        }
                                        b4 = true;
                                    }
                                    this.D = b4;
                                }
                                return this.D;
                                throw new IllegalStateException("AppMeasurement is not initialized");
                            }
                            catch (final PackageManager$NameNotFoundException ex) {
                                continue;
                            }
                            break;
                        }
                    }
                }
            }
        }
    }
    
    public final c3 f() {
        j(this.n);
        return this.n;
    }
    
    public final wd.c g() {
        return (wd.c)this.s;
    }
    
    public final a i() {
        return this.k;
    }
    
    public final int k() {
        this.a().y();
        if (this.l.J()) {
            return 1;
        }
        final Boolean h = this.H;
        if (h != null && h) {
            return 2;
        }
        this.a().y();
        if (!this.I) {
            return 8;
        }
        final Boolean f = this.s().F();
        if (f != null) {
            if (f) {
                return 0;
            }
            return 3;
        }
        else {
            final f l = this.l;
            final a k = ((h4)((w)l).f).k;
            final Boolean g = l.G("firebase_analytics_collection_enabled");
            if (g != null) {
                if (g) {
                    return 0;
                }
                return 4;
            }
            else {
                final Boolean g2 = this.G;
                if (g2 != null) {
                    if (g2) {
                        return 0;
                    }
                    return 5;
                }
                else {
                    if (this.F == null) {
                        return 0;
                    }
                    if (this.F) {
                        return 0;
                    }
                    return 7;
                }
            }
        }
    }
    
    public final j1 l() {
        final j1 v = this.v;
        if (v != null) {
            return v;
        }
        throw new IllegalStateException("Component not created");
    }
    
    public final f m() {
        return this.l;
    }
    
    public final n n() {
        j(this.A);
        return this.A;
    }
    
    public final u2 o() {
        h((h3)this.B);
        return this.B;
    }
    
    public final w2 p() {
        h((h3)this.y);
        return this.y;
    }
    
    public final Context q() {
        return this.f;
    }
    
    public final x2 r() {
        return this.r;
    }
    
    public final q3 s() {
        final q3 m = this.m;
        if (m != null) {
            return m;
        }
        throw new IllegalStateException("Component not created");
    }
    
    public final n5 u() {
        h((h3)this.u);
        return this.u;
    }
    
    public final x5 v() {
        h((h3)this.t);
        return this.t;
    }
    
    public final l6 w() {
        h((h3)this.z);
        return this.z;
    }
    
    public final w6 x() {
        h((h3)this.p);
        return this.p;
    }
    
    public final n7 y() {
        final n7 q = this.q;
        if (q != null) {
            return q;
        }
        throw new IllegalStateException("Component not created");
    }
}
