// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.measurement;

import android.os.BaseBundle;
import qe.h3;
import com.android.billingclient.api.h0;
import qe.c7;
import qe.l4;
import je.a1;
import qe.j4;
import android.content.Context;
import android.app.job.JobParameters;
import android.content.Intent;
import qe.l6;
import qe.k6;
import android.app.job.JobService;

public final class AppMeasurementJobService extends JobService implements k6
{
    public l6 f;
    
    public final boolean a(final int n) {
        throw new UnsupportedOperationException();
    }
    
    public final void b(final Intent intent) {
    }
    
    public final void c(final JobParameters jobParameters) {
        this.jobFinished(jobParameters, false);
    }
    
    public final l6 d() {
        if (this.f == null) {
            this.f = new l6((Context)this);
        }
        return this.f;
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
    
    public final boolean onStartJob(final JobParameters jobParameters) {
        final l6 d = this.d();
        final h3 c = j4.t(d.a, (a1)null, (Long)null).c();
        final String string = ((BaseBundle)jobParameters.getExtras()).getString("action");
        c.u.b((Object)string, "Local AppMeasurementJobService called. action");
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            final l4 l4 = new l4((Object)d, 2, (Object)c, (Object)jobParameters);
            final c7 n = c7.N(d.a);
            n.a().B((Runnable)new h0(n, (Runnable)l4));
        }
        return true;
    }
    
    public final boolean onStopJob(final JobParameters jobParameters) {
        return false;
    }
    
    public final boolean onUnbind(final Intent intent) {
        this.d().b(intent);
        return true;
    }
}
