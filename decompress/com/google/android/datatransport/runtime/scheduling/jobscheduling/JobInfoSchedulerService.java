// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.os.BaseBundle;
import ra.j;
import com.google.android.datatransport.runtime.b$a;
import p3.g;
import android.util.Base64;
import va.a;
import com.google.android.datatransport.runtime.c;
import com.google.android.datatransport.runtime.d;
import android.app.job.JobParameters;
import android.app.job.JobService;

public class JobInfoSchedulerService extends JobService
{
    public final boolean onStartJob(final JobParameters jobParameters) {
        final String string = ((BaseBundle)jobParameters.getExtras()).getString("backendName");
        final String string2 = ((BaseBundle)jobParameters.getExtras()).getString("extras");
        final int int1 = ((BaseBundle)jobParameters.getExtras()).getInt("priority");
        final int int2 = ((BaseBundle)jobParameters.getExtras()).getInt("attemptNumber");
        d.b(((Context)this).getApplicationContext());
        final b$a a = c.a();
        a.b(string);
        a.c(va.a.b(int1));
        if (string2 != null) {
            a.b = Base64.decode(string2, 0);
        }
        final j d = com.google.android.datatransport.runtime.d.a().d;
        d.e.execute(new ra.c(d, a.a(), int2, new g(2, this, jobParameters)));
        return true;
    }
    
    public final boolean onStopJob(final JobParameters jobParameters) {
        return true;
    }
}
