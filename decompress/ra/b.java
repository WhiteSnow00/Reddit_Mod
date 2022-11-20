// 
// Decompiled by Procyon v0.6.0
// 

package ra;

import android.os.BaseBundle;
import java.util.Set;
import com.google.android.datatransport.Priority;
import java.util.Iterator;
import android.util.Log;
import android.util.Base64;
import android.os.PersistableBundle;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$b;
import android.app.job.JobInfo$Builder;
import android.app.job.JobInfo;
import va.a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.datatransport.runtime.c;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import sa.d;
import android.content.Context;

public final class b implements o
{
    public final Context a;
    public final d b;
    public final SchedulerConfig c;
    
    public b(final Context a, final d b, final SchedulerConfig c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final c c, final int n, final boolean b) {
        final ComponentName componentName = new ComponentName(this.a, (Class)JobInfoSchedulerService.class);
        final JobScheduler jobScheduler = (JobScheduler)this.a.getSystemService("jobscheduler");
        final Adler32 adler32 = new Adler32();
        adler32.update(this.a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(c.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(va.a.a(c.d())).array());
        if (c.c() != null) {
            adler32.update(c.c());
        }
        final int n2 = (int)adler32.getValue();
        Label_0210: {
            if (!b) {
                while (true) {
                    for (final JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                        final int int1 = ((BaseBundle)jobInfo.getExtras()).getInt("attemptNumber");
                        if (jobInfo.getId() == n2) {
                            if (int1 < n) {
                                break;
                            }
                            final boolean b2 = true;
                            if (b2) {
                                pa.a.a(c, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                                return;
                            }
                            break Label_0210;
                        }
                    }
                    final boolean b2 = false;
                    continue;
                }
            }
        }
        final long s1 = this.b.S1(c);
        final SchedulerConfig c2 = this.c;
        final JobInfo$Builder jobInfo$Builder = new JobInfo$Builder(n2, componentName);
        final Priority d = c.d();
        jobInfo$Builder.setMinimumLatency(c2.b(d, s1, n));
        final Set b3 = c2.c().get(d).b();
        if (b3.contains(SchedulerConfig$Flag.NETWORK_UNMETERED)) {
            jobInfo$Builder.setRequiredNetworkType(2);
        }
        else {
            jobInfo$Builder.setRequiredNetworkType(1);
        }
        if (b3.contains(SchedulerConfig$Flag.DEVICE_CHARGING)) {
            jobInfo$Builder.setRequiresCharging(true);
        }
        if (b3.contains(SchedulerConfig$Flag.DEVICE_IDLE)) {
            jobInfo$Builder.setRequiresDeviceIdle(true);
        }
        final PersistableBundle extras = new PersistableBundle();
        ((BaseBundle)extras).putInt("attemptNumber", n);
        ((BaseBundle)extras).putString("backendName", c.b());
        ((BaseBundle)extras).putInt("priority", va.a.a(c.d()));
        if (c.c() != null) {
            ((BaseBundle)extras).putString("extras", Base64.encodeToString(c.c(), 0));
        }
        jobInfo$Builder.setExtras(extras);
        final long b4 = this.c.b(c.d(), s1, n);
        final String c3 = pa.a.c("JobInfoScheduler");
        if (Log.isLoggable(c3, 3)) {
            Log.d(c3, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", c, n2, b4, s1, n));
        }
        jobScheduler.schedule(jobInfo$Builder.build());
    }
    
    @Override
    public final void b(final c c, final int n) {
        this.a(c, n, false);
    }
}
