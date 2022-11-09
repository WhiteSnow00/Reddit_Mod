// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.measurement;

import android.os.BaseBundle;
import re.c3;
import re.l;
import re.g7;
import re.c6;
import ke.a1;
import re.h4;
import android.content.Context;
import android.app.job.JobParameters;
import android.content.Intent;
import re.r6;
import re.q6;
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
        h4.t(this.d().a, null, null).f().s.a("Local AppMeasurementService is starting up");
    }
    
    public final void onDestroy() {
        h4.t(this.d().a, null, null).f().s.a("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }
    
    public final void onRebind(final Intent intent) {
        this.d().a(intent);
    }
    
    public final boolean onStartJob(final JobParameters jobParameters) {
        final r6 d = this.d();
        final c3 f = h4.t(d.a, null, null).f();
        final String string = ((BaseBundle)jobParameters.getExtras()).getString("action");
        f.s.b(string, "Local AppMeasurementJobService called. action");
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            final c6 c6 = new c6(d, f, jobParameters);
            final g7 n = g7.N(d.a);
            n.a().G((Runnable)new l(n, (Runnable)c6));
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
