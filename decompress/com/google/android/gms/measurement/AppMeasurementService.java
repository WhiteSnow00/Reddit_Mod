// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.measurement;

import qe.h3;
import com.android.billingclient.api.h0;
import qe.j6;
import je.a1;
import qe.j4;
import qe.u4;
import qe.c7;
import android.os.IBinder;
import android.content.Context;
import android.app.job.JobParameters;
import android.util.SparseArray;
import android.util.Log;
import android.os.PowerManager$WakeLock;
import t4.a;
import android.content.Intent;
import qe.l6;
import qe.k6;
import android.app.Service;

public final class AppMeasurementService extends Service implements k6
{
    public l6 f;
    
    public final boolean a(final int n) {
        return this.stopSelfResult(n);
    }
    
    public final void b(Intent f) {
        final SparseArray<PowerManager$WakeLock> f2 = a.f;
        final int intExtra = f.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        f = (Intent)a.f;
        synchronized (f) {
            final PowerManager$WakeLock powerManager$WakeLock = (PowerManager$WakeLock)((SparseArray)f).get(intExtra);
            if (powerManager$WakeLock != null) {
                powerManager$WakeLock.release();
                ((SparseArray)f).remove(intExtra);
                monitorexit(f);
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append("No active wake lock id #");
                sb.append(intExtra);
                Log.w("WakefulBroadcastReceiv.", sb.toString());
            }
        }
    }
    
    public final void c(final JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }
    
    public final l6 d() {
        if (this.f == null) {
            this.f = new l6((Context)this);
        }
        return this.f;
    }
    
    public final IBinder onBind(final Intent intent) {
        final l6 d = this.d();
        if (intent == null) {
            d.c().m.a("onBind called with null intent");
        }
        else {
            d.getClass();
            final String action = intent.getAction();
            if ("com.google.android.gms.measurement.START".equals(action)) {
                final Object o = new u4(c7.N(d.a));
                return (IBinder)o;
            }
            d.c().p.b((Object)action, "onBind received unknown action");
        }
        final Object o = null;
        return (IBinder)o;
    }
    
    public final void onCreate() {
        super.onCreate();
        j4.t(this.d().a, (a1)null, (Long)null).c().u.a("Local AppMeasurementService is starting up");
    }
    
    public final void onDestroy() {
        j4.t(this.d().a, (a1)null, (Long)null).c().u.a("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }
    
    public final void onRebind(final Intent intent) {
        this.d().a(intent);
    }
    
    public final int onStartCommand(final Intent intent, final int n, final int n2) {
        final l6 d = this.d();
        final h3 c = j4.t(d.a, (a1)null, (Long)null).c();
        if (intent == null) {
            c.p.a("AppMeasurementService started with null intent");
        }
        else {
            final String action = intent.getAction();
            c.u.c((Object)n2, "Local AppMeasurementService called. startId, action", (Object)action);
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                final j6 j6 = new j6(d, n2, c, intent);
                final c7 n3 = c7.N(d.a);
                n3.a().B((Runnable)new h0(n3, (Runnable)j6));
            }
        }
        return 2;
    }
    
    public final boolean onUnbind(final Intent intent) {
        this.d().b(intent);
        return true;
    }
}
