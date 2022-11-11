// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.background.systemjob;

import android.os.BaseBundle;
import android.app.Service;
import android.content.Context;
import android.os.PersistableBundle;
import a4.w0;
import java.util.Arrays;
import androidx.work.WorkerParameters$a;
import android.os.Build$VERSION;
import android.text.TextUtils;
import d6.c;
import android.app.Application;
import android.app.job.JobParameters;
import c6.h;
import java.util.HashMap;
import d6.j;
import d6.a;
import android.app.job.JobService;

public class SystemJobService extends JobService implements a
{
    public static final String h;
    public j f;
    public final HashMap g;
    
    static {
        h = c6.h.e("SystemJobService");
    }
    
    public SystemJobService() {
        this.g = new HashMap();
    }
    
    public final void c(final String s, final boolean b) {
        c6.h.c().a(SystemJobService.h, String.format("%s executed on JobScheduler", s), new Throwable[0]);
        synchronized (this.g) {
            final JobParameters jobParameters = this.g.remove(s);
            monitorexit(this.g);
            if (jobParameters != null) {
                this.jobFinished(jobParameters, b);
            }
        }
    }
    
    public final void onCreate() {
        super.onCreate();
        try {
            final j k = j.k(((Context)this).getApplicationContext());
            this.f = k;
            k.f.a((a)this);
        }
        catch (final IllegalStateException ex) {
            if (!Application.class.equals(((Service)this).getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            c6.h.c().f(SystemJobService.h, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }
    
    public final void onDestroy() {
        super.onDestroy();
        final j f = this.f;
        if (f != null) {
            final c f2 = f.f;
            synchronized (f2.p) {
                f2.o.remove(this);
            }
        }
    }
    
    public final boolean onStartJob(final JobParameters jobParameters) {
        if (this.f == null) {
            c6.h.c().a(SystemJobService.h, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            this.jobFinished(jobParameters, true);
            return false;
        }
        while (true) {
            try {
                final PersistableBundle extras = jobParameters.getExtras();
                String string;
                if (extras != null && ((BaseBundle)extras).containsKey("EXTRA_WORK_SPEC_ID")) {
                    string = ((BaseBundle)extras).getString("EXTRA_WORK_SPEC_ID");
                }
                else {
                    string = null;
                }
                if (TextUtils.isEmpty((CharSequence)string)) {
                    c6.h.c().b(SystemJobService.h, "WorkSpec id not found!", new Throwable[0]);
                    return false;
                }
                Object g = this.g;
                synchronized (g) {
                    if (this.g.containsKey(string)) {
                        c6.h.c().a(SystemJobService.h, String.format("Job is already being executed by SystemJobService: %s", string), new Throwable[0]);
                        return false;
                    }
                    c6.h.c().a(SystemJobService.h, String.format("onStartJob for %s", string), new Throwable[0]);
                    this.g.put(string, jobParameters);
                    monitorexit(g);
                    final int sdk_INT = Build$VERSION.SDK_INT;
                    g = new WorkerParameters$a();
                    if (jobParameters.getTriggeredContentUris() != null) {
                        ((WorkerParameters$a)g).b = Arrays.asList(jobParameters.getTriggeredContentUris());
                    }
                    if (jobParameters.getTriggeredContentAuthorities() != null) {
                        ((WorkerParameters$a)g).a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                    }
                    if (sdk_INT >= 28) {
                        ((WorkerParameters$a)g).c = w0.b(jobParameters);
                    }
                    this.f.o(string, (WorkerParameters$a)g);
                    return true;
                }
            }
            catch (final NullPointerException ex) {
                continue;
            }
            break;
        }
    }
    
    public final boolean onStopJob(final JobParameters jobParameters) {
        if (this.f == null) {
            c6.h.c().a(SystemJobService.h, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        while (true) {
            try {
                final PersistableBundle extras = jobParameters.getExtras();
                String string;
                if (extras != null && ((BaseBundle)extras).containsKey("EXTRA_WORK_SPEC_ID")) {
                    string = ((BaseBundle)extras).getString("EXTRA_WORK_SPEC_ID");
                }
                else {
                    string = null;
                }
                if (TextUtils.isEmpty((CharSequence)string)) {
                    c6.h.c().b(SystemJobService.h, "WorkSpec id not found!", new Throwable[0]);
                    return false;
                }
                c6.h.c().a(SystemJobService.h, String.format("onStopJob for %s", string), new Throwable[0]);
                synchronized (this.g) {
                    this.g.remove(string);
                    monitorexit(this.g);
                    this.f.p(string);
                    final c f = this.f.f;
                    final Object p = f.p;
                    synchronized (this.g) {
                        final boolean contains = f.n.contains(string);
                        monitorexit(this.g);
                        return contains ^ true;
                    }
                }
            }
            catch (final NullPointerException ex) {
                continue;
            }
            break;
        }
    }
}
