// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.measurement;

import re.c3;
import re.l;
import re.p6;
import ke.a1;
import re.h4;
import re.s4;
import re.g7;
import android.os.IBinder;
import android.content.Context;
import android.app.job.JobParameters;
import android.util.SparseArray;
import android.util.Log;
import android.os.PowerManager$WakeLock;
import u4.a;
import android.content.Intent;
import re.r6;
import re.q6;
import android.app.Service;

public final class AppMeasurementService extends Service implements q6
{
    public r6 f;
    
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
    
    public final r6 d() {
        if (this.f == null) {
            this.f = new r6((Context)this);
        }
        return this.f;
    }
    
    public final IBinder onBind(final Intent intent) {
        final r6 d = this.d();
        if (intent == null) {
            d.c().k.a("onBind called with null intent");
        }
        else {
            d.getClass();
            final String action = intent.getAction();
            if ("com.google.android.gms.measurement.START".equals(action)) {
                final Object o = new s4(g7.N(d.a));
                return (IBinder)o;
            }
            d.c().n.b(action, "onBind received unknown action");
        }
        final Object o = null;
        return (IBinder)o;
    }
    
    public final void onCreate() {
        super.onCreate();
        h4.t(this.d().a, null, null).f().s.a("Local AppMeasurementService is starting up");
    }
    
    public final void onDestroy() {
        h4.t(this.d().a, null, null).f().s.a("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }
    
    public final void onRebind(final Intent intent) {
        this.d().a(intent);
    }
    
    public final int onStartCommand(final Intent intent, final int n, final int n2) {
        final r6 d = this.d();
        final c3 f = h4.t(d.a, null, null).f();
        if (intent == null) {
            f.n.a("AppMeasurementService started with null intent");
        }
        else {
            final String action = intent.getAction();
            f.s.c(n2, "Local AppMeasurementService called. startId, action", action);
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                final p6 p3 = new p6(d, n2, f, intent);
                final g7 n3 = g7.N(d.a);
                n3.a().G((Runnable)new l(n3, (Runnable)p3));
            }
        }
        return 2;
    }
    
    public final boolean onUnbind(final Intent intent) {
        this.d().b(intent);
        return true;
    }
}
