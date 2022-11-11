// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.measurement;

import android.os.BaseBundle;
import pe.d3;
import com.android.billingclient.api.j0;
import pe.g7;
import od.e2;
import ie.c1;
import pe.h4;
import android.content.Context;
import android.app.job.JobParameters;
import android.content.Intent;
import pe.r6;
import pe.q6;
import android.app.job.JobService;

public final class AppMeasurementJobService extends JobService implements q6
{
    public r6 f;
    
    public final boolean a(final int n) {
        throw new UnsupportedOperationException();
    }
    
    public final void b(final Intent intent) {
    }
    
    public final void c(final JobParameters jobParameters) {
        this.jobFinished(jobParameters, false);
    }
    
    public final r6 d() {
        if (this.f == null) {
            this.f = new r6((Context)this);
        }
        return this.f;
    }
    
    public final void onCreate() {
        super.onCreate();
        h4.s(this.d().a, (c1)null, (Long)null).h().s.a("Local AppMeasurementService is starting up");
    }
    
    public final void onDestroy() {
        h4.s(this.d().a, (c1)null, (Long)null).h().s.a("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }
    
    public final void onRebind(final Intent intent) {
        this.d().a(intent);
    }
    
    public final boolean onStartJob(final JobParameters jobParameters) {
        final r6 d = this.d();
        final d3 h = h4.s(d.a, (c1)null, (Long)null).h();
        final String string = ((BaseBundle)jobParameters.getExtras()).getString("action");
        h.s.b((Object)string, "Local AppMeasurementJobService called. action");
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            final e2 e2 = new e2(d, h, jobParameters);
            final g7 n = g7.N(d.a);
            n.b().U((Runnable)new j0(n, (Runnable)e2));
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
