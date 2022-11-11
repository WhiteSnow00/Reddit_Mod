// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.measurement.internal;

import re.k2;
import j0.i;
import android.os.BaseBundle;
import u5.w;
import android.text.TextUtils;
import re.a5;
import ke.z0;
import com.android.billingclient.api.d0;
import re.k5;
import re.a3;
import re.x5;
import re.y4;
import re.h3;
import re.d5;
import re.w4;
import re.p7;
import ke.x0;
import re.m5;
import android.app.Activity;
import re.z5;
import re.t;
import re.r;
import android.content.Context;
import ke.a1;
import java.util.Map;
import re.n6;
import re.n7;
import qd.h1;
import re.j4;
import com.android.billingclient.api.i0;
import re.f5;
import java.util.concurrent.atomic.AtomicReference;
import yd.a;
import p2.e;
import re.t5;
import re.o7;
import re.h5;
import re.n5;
import re.z4;
import android.os.Bundle;
import android.os.RemoteException;
import ke.u0;
import j0.b;
import re.h4;
import com.google.android.gms.common.util.DynamiteApi;
import ke.q0;

@DynamiteApi
public class AppMeasurementDynamiteService extends q0
{
    public h4 a;
    public final b b;
    
    public AppMeasurementDynamiteService() {
        this.a = null;
        this.b = new b();
    }
    
    public final void J(final String s, final u0 u0) {
        this.m();
        this.a.y().W(s, u0);
    }
    
    public void beginAdUnitExposure(final String s, final long n) throws RemoteException {
        this.m();
        this.a.l().z(n, s);
    }
    
    public void clearConditionalUserProperty(final String s, final String s2, final Bundle bundle) throws RemoteException {
        this.m();
        this.a.u().C(bundle, s, s2);
    }
    
    public void clearMeasurementEnabled(final long n) throws RemoteException {
        this.m();
        final n5 u = this.a.u();
        ((h3)u).z();
        ((h4)((w)u).f).a().G((Runnable)new z4(u, (Object)null, 1));
    }
    
    public void endAdUnitExposure(final String s, final long n) throws RemoteException {
        this.m();
        this.a.l().A(n, s);
    }
    
    public void generateEventId(final u0 u0) throws RemoteException {
        this.m();
        final long a0 = this.a.y().A0();
        this.m();
        this.a.y().V(u0, a0);
    }
    
    public void getAppInstanceId(final u0 u0) throws RemoteException {
        this.m();
        this.a.a().G((Runnable)new h5(this, u0, 0));
    }
    
    public void getCachedAppInstanceId(final u0 u0) throws RemoteException {
        this.m();
        this.J(this.a.u().l.get(), u0);
    }
    
    public void getConditionalUserProperties(final String s, final String s2, final u0 u0) throws RemoteException {
        this.m();
        this.a.a().G((Runnable)new o7(this, u0, s, s2));
    }
    
    public void getCurrentScreenClass(final u0 u0) throws RemoteException {
        this.m();
        final t5 h = ((h4)((w)this.a.u()).f).v().h;
        String b;
        if (h != null) {
            b = h.b;
        }
        else {
            b = null;
        }
        this.J(b, u0);
    }
    
    public void getCurrentScreenName(final u0 u0) throws RemoteException {
        this.m();
        final t5 h = ((h4)((w)this.a.u()).f).v().h;
        String a;
        if (h != null) {
            a = h.a;
        }
        else {
            a = null;
        }
        this.J(a, u0);
    }
    
    public void getGmpAppId(final u0 u0) throws RemoteException {
        this.m();
        final n5 u2 = this.a.u();
        final Object f = ((w)u2).f;
        String s = ((h4)f).g;
        if (s == null) {
            try {
                s = e.t(((h4)f).f, ((h4)f).x);
            }
            catch (final IllegalStateException ex) {
                ((h4)((w)u2).f).f().k.b(ex, "getGoogleAppId failed with exception");
                s = null;
            }
        }
        this.J(s, u0);
    }
    
    public void getMaxUserProperties(final String s, final u0 u0) throws RemoteException {
        this.m();
        final n5 u2 = this.a.u();
        u2.getClass();
        yd.a.P0(s);
        ((w)u2).f.getClass();
        this.m();
        this.a.y().U(u0, 25);
    }
    
    public void getTestFlag(final u0 u0, final int n) throws RemoteException {
        this.m();
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n == 3) {
                        final n7 y = this.a.y();
                        final n5 u2 = this.a.u();
                        u2.getClass();
                        final AtomicReference atomicReference = new AtomicReference();
                        y.U(u0, (int)((h4)((w)u2).f).a().D(atomicReference, 15000L, "int test flag value", (Runnable)new f5(u2, atomicReference, 1)));
                        return;
                    }
                    if (n != 4) {
                        return;
                    }
                    final n7 y2 = this.a.y();
                    final n5 u3 = this.a.u();
                    u3.getClass();
                    final AtomicReference atomicReference2 = new AtomicReference();
                    y2.Q(u0, (boolean)((h4)((w)u3).f).a().D(atomicReference2, 15000L, "boolean test flag value", (Runnable)new f5(u3, atomicReference2, 0)));
                    return;
                }
                else {
                    final n7 y3 = this.a.y();
                    final n5 u4 = this.a.u();
                    u4.getClass();
                    final AtomicReference atomicReference3 = new AtomicReference();
                    final double doubleValue = (double)((h4)((w)u4).f).a().D(atomicReference3, 15000L, "double test flag value", new i0(u4, atomicReference3, 6));
                    final Bundle bundle = new Bundle();
                    ((BaseBundle)bundle).putDouble("r", doubleValue);
                    try {
                        u0.b(bundle);
                        return;
                    }
                    catch (final RemoteException ex) {
                        ((h4)((w)y3).f).f().n.b(ex, "Error returning double value to wrapper");
                        return;
                    }
                }
            }
            final n7 y4 = this.a.y();
            final n5 u5 = this.a.u();
            u5.getClass();
            final AtomicReference atomicReference4 = new AtomicReference();
            y4.V(u0, (long)((h4)((w)u5).f).a().D(atomicReference4, 15000L, "long test flag value", (Runnable)new j4(3, (Object)u5, (Object)atomicReference4)));
            return;
        }
        final n7 y5 = this.a.y();
        final n5 u6 = this.a.u();
        u6.getClass();
        final AtomicReference atomicReference5 = new AtomicReference();
        y5.W((String)((h4)((w)u6).f).a().D(atomicReference5, 15000L, "String test flag value", (Runnable)new h1((Object)u6, (Object)atomicReference5, 3)), u0);
    }
    
    public void getUserProperties(final String s, final String s2, final boolean b, final u0 u0) throws RemoteException {
        this.m();
        this.a.a().G((Runnable)new n6(this, u0, s, s2, b));
    }
    
    public void initForTests(final Map map) throws RemoteException {
        this.m();
    }
    
    public void initialize(final zd.a a, final a1 a2, final long n) throws RemoteException {
        final h4 a3 = this.a;
        if (a3 == null) {
            final Context context = zd.b.J(a);
            a.S0((Object)context);
            this.a = h4.t(context, a2, n);
            return;
        }
        a3.f().n.a("Attempting to initialize multiple times");
    }
    
    public void isDataCollectionEnabled(final u0 u0) throws RemoteException {
        this.m();
        this.a.a().G((Runnable)new h5(this, u0, 1));
    }
    
    public void logEvent(final String s, final String s2, final Bundle bundle, final boolean b, final boolean b2, final long n) throws RemoteException {
        this.m();
        this.a.u().E(s, s2, bundle, b, b2, n);
    }
    
    public void logEventAndBundle(final String s, final String s2, final Bundle bundle, final u0 u0, final long n) throws RemoteException {
        this.m();
        yd.a.P0(s2);
        Bundle bundle2;
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        }
        else {
            bundle2 = new Bundle();
        }
        ((BaseBundle)bundle2).putString("_o", "app");
        this.a.a().G((Runnable)new z5(this, u0, new t(s2, new r(bundle), "app", n), s));
    }
    
    public void logHealthData(final int n, final String s, final zd.a a, final zd.a a2, final zd.a a3) throws RemoteException {
        this.m();
        final Object o = null;
        Object j;
        if (a == null) {
            j = null;
        }
        else {
            j = zd.b.J(a);
        }
        Object i;
        if (a2 == null) {
            i = null;
        }
        else {
            i = zd.b.J(a2);
        }
        Object k;
        if (a3 == null) {
            k = o;
        }
        else {
            k = zd.b.J(a3);
        }
        this.a.f().L(n, true, false, s, j, i, k);
    }
    
    public final void m() {
        if (this.a != null) {
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }
    
    public void onActivityCreated(final zd.a a, final Bundle bundle, final long n) throws RemoteException {
        this.m();
        final m5 h = this.a.u().h;
        if (h != null) {
            this.a.u().D();
            h.onActivityCreated((Activity)zd.b.J(a), bundle);
        }
    }
    
    public void onActivityDestroyed(final zd.a a, final long n) throws RemoteException {
        this.m();
        final m5 h = this.a.u().h;
        if (h != null) {
            this.a.u().D();
            h.onActivityDestroyed((Activity)zd.b.J(a));
        }
    }
    
    public void onActivityPaused(final zd.a a, final long n) throws RemoteException {
        this.m();
        final m5 h = this.a.u().h;
        if (h != null) {
            this.a.u().D();
            h.onActivityPaused((Activity)zd.b.J(a));
        }
    }
    
    public void onActivityResumed(final zd.a a, final long n) throws RemoteException {
        this.m();
        final m5 h = this.a.u().h;
        if (h != null) {
            this.a.u().D();
            h.onActivityResumed((Activity)zd.b.J(a));
        }
    }
    
    public void onActivitySaveInstanceState(final zd.a a, final u0 u0, final long n) throws RemoteException {
        this.m();
        final m5 h = this.a.u().h;
        final Bundle bundle = new Bundle();
        if (h != null) {
            this.a.u().D();
            h.onActivitySaveInstanceState((Activity)zd.b.J(a), bundle);
        }
        try {
            u0.b(bundle);
        }
        catch (final RemoteException ex) {
            this.a.f().n.b(ex, "Error returning bundle value to wrapper");
        }
    }
    
    public void onActivityStarted(final zd.a a, final long n) throws RemoteException {
        this.m();
        if (this.a.u().h != null) {
            this.a.u().D();
            final Activity activity = zd.b.J(a);
        }
    }
    
    public void onActivityStopped(final zd.a a, final long n) throws RemoteException {
        this.m();
        if (this.a.u().h != null) {
            this.a.u().D();
            final Activity activity = zd.b.J(a);
        }
    }
    
    public void performAction(final Bundle bundle, final u0 u0, final long n) throws RemoteException {
        this.m();
        u0.b(null);
    }
    
    public void registerOnMeasurementEventListener(final x0 x0) throws RemoteException {
        this.m();
        synchronized (this.b) {
            Object o;
            if ((o = ((i)this.b).getOrDefault((Object)x0.u(), (Object)null)) == null) {
                o = new p7(this, x0);
                ((i)this.b).put((Object)x0.u(), o);
            }
            monitorexit(this.b);
            final n5 u = this.a.u();
            ((h3)u).z();
            if (!u.j.add(o)) {
                ((h4)((w)u).f).f().n.a("OnEventListener already registered");
            }
        }
    }
    
    public void resetAnalyticsData(final long n) throws RemoteException {
        this.m();
        final n5 u = this.a.u();
        u.l.set(null);
        ((h4)((w)u).f).a().G(new d5((h3)u, n, 0));
    }
    
    public void setConditionalUserProperty(final Bundle bundle, final long n) throws RemoteException {
        this.m();
        if (bundle == null) {
            this.a.f().k.a("Conditional user property must not be null");
            return;
        }
        this.a.u().J(bundle, n);
    }
    
    public void setConsent(final Bundle bundle, final long n) throws RemoteException {
        this.m();
        final n5 u = this.a.u();
        ((h4)((w)u).f).a().H((Runnable)new y4(u, bundle, n));
    }
    
    public void setConsentThirdParty(final Bundle bundle, final long n) throws RemoteException {
        this.m();
        this.a.u().K(bundle, -20, n);
    }
    
    public void setCurrentScreen(final zd.a a, final String s, String s2, final long n) throws RemoteException {
        this.m();
        final x5 v = this.a.v();
        final Activity activity = zd.b.J(a);
        if (!((h4)((w)v).f).l.I()) {
            ((h4)((w)v).f).f().p.a("setCurrentScreen cannot be called while screen reporting is disabled.");
        }
        else {
            final t5 h = v.h;
            if (h == null) {
                ((h4)((w)v).f).f().p.a("setCurrentScreen cannot be called while no activity active");
            }
            else if (v.k.get(activity) == null) {
                ((h4)((w)v).f).f().p.a("setCurrentScreen must be called with an activity in the activity lifecycle");
            }
            else {
                String g;
                if ((g = s2) == null) {
                    g = v.G((Class)activity.getClass());
                }
                final boolean m2 = a.M2(h.b, (Object)g);
                final boolean m3 = a.M2(h.a, (Object)s);
                if (m2 && m3) {
                    ((h4)((w)v).f).f().p.a("setCurrentScreen cannot be called with the same class and name");
                }
                else {
                    Label_0273: {
                        if (s != null) {
                            if (s.length() > 0) {
                                ((w)v).f.getClass();
                                if (s.length() <= 100) {
                                    break Label_0273;
                                }
                            }
                            ((h4)((w)v).f).f().p.b(s.length(), "Invalid screen name length in setCurrentScreen. Length");
                            return;
                        }
                    }
                    Label_0338: {
                        if (g != null) {
                            if (g.length() > 0) {
                                ((w)v).f.getClass();
                                if (g.length() <= 100) {
                                    break Label_0338;
                                }
                            }
                            ((h4)((w)v).f).f().p.b(g.length(), "Invalid class name length in setCurrentScreen. Length");
                            return;
                        }
                    }
                    final a3 s3 = ((h4)((w)v).f).f().s;
                    if (s == null) {
                        s2 = "null";
                    }
                    else {
                        s2 = s;
                    }
                    s3.c(s2, "Setting current screen to name, class", g);
                    final t5 t5 = new t5(s, g, ((h4)((w)v).f).y().A0());
                    v.k.put(activity, t5);
                    v.C(activity, t5, true);
                }
            }
        }
    }
    
    public void setDataCollectionEnabled(final boolean b) throws RemoteException {
        this.m();
        final n5 u = this.a.u();
        ((h3)u).z();
        ((h4)((w)u).f).a().G((Runnable)new k5(u, b));
    }
    
    public void setDefaultEventParameters(Bundle bundle) {
        this.m();
        final n5 u = this.a.u();
        if (bundle == null) {
            bundle = null;
        }
        else {
            bundle = new Bundle(bundle);
        }
        ((h4)((w)u).f).a().G(new i0(5, u, bundle));
    }
    
    public void setEventInterceptor(final x0 x0) throws RemoteException {
        this.m();
        final d0 i = new d0((Object)this, (Object)x0, 5);
        if (this.a.a().I()) {
            final n5 u = this.a.u();
            ((k2)u).y();
            ((h3)u).z();
            final d0 j = u.i;
            if (i != j) {
                yd.a.W0(j == null, "EventInterceptor already set.");
            }
            u.i = i;
            return;
        }
        this.a.a().G((Runnable)new j4(5, (Object)this, (Object)i));
    }
    
    public void setInstanceIdProvider(final z0 z0) throws RemoteException {
        this.m();
    }
    
    public void setMeasurementEnabled(final boolean b, final long n) throws RemoteException {
        this.m();
        final n5 u = this.a.u();
        ((h3)u).z();
        ((h4)((w)u).f).a().G((Runnable)new z4(u, (Object)b, 1));
    }
    
    public void setMinimumSessionDuration(final long n) throws RemoteException {
        this.m();
    }
    
    public void setSessionTimeoutDuration(final long n) throws RemoteException {
        this.m();
        final n5 u = this.a.u();
        ((h4)((w)u).f).a().G(new a5(u, n));
    }
    
    public void setUserId(final String s, final long n) throws RemoteException {
        this.m();
        final n5 u = this.a.u();
        if (s != null && TextUtils.isEmpty((CharSequence)s)) {
            ((h4)((w)u).f).f().n.a("User ID must be non-empty or null");
            return;
        }
        ((h4)((w)u).f).a().G((Runnable)new z4(u, (Object)s, 0));
        u.N((String)null, "_id", (Object)s, true, n);
    }
    
    public void setUserProperty(final String s, final String s2, final zd.a a, final boolean b, final long n) throws RemoteException {
        this.m();
        this.a.u().N(s, s2, zd.b.J(a), b, n);
    }
    
    public void unregisterOnMeasurementEventListener(final x0 x0) throws RemoteException {
        this.m();
        Object b = this.b;
        synchronized (b) {
            final w4 w4 = (w4)((i)this.b).remove((Object)x0.u());
            monitorexit(b);
            b = w4;
            if (w4 == null) {
                b = new p7(this, x0);
            }
            final n5 u = this.a.u();
            ((h3)u).z();
            if (!u.j.remove(b)) {
                ((h4)((w)u).f).f().n.a("OnEventListener had not been registered");
            }
        }
    }
}
