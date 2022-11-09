// 
// Decompiled by Procyon v0.6.0
// 

package d6;

import java.util.concurrent.Executor;
import m6.p;
import m6.m;
import androidx.work.WorkerParameters$a;
import java.util.Iterator;
import l6.t;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import java.util.Collections;
import androidx.work.ExistingPeriodicWorkPolicy;
import android.net.Uri;
import android.content.Intent;
import androidx.work.impl.foreground.SystemForegroundService;
import android.app.PendingIntent;
import m6.n;
import java.util.UUID;
import androidx.work.ExistingWorkPolicy;
import androidx.work.a$b;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Arrays;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import androidx.room.g;
import androidx.room.RoomDatabase$a;
import n6.b;
import c6.h;
import android.content.BroadcastReceiver$PendingResult;
import m6.i;
import java.util.List;
import androidx.work.impl.WorkDatabase;
import androidx.work.a;
import android.content.Context;
import c6.l;

public final class j extends l
{
    public static j j;
    public static j k;
    public static final Object l;
    public Context a;
    public a b;
    public WorkDatabase c;
    public n6.a d;
    public List<d> e;
    public c f;
    public i g;
    public boolean h;
    public BroadcastReceiver$PendingResult i;
    
    static {
        h.e("WorkManagerImpl");
        d6.j.j = null;
        d6.j.k = null;
        l = new Object();
    }
    
    public j(Context applicationContext, final a b, final b d) {
        final boolean boolean1 = applicationContext.getResources().getBoolean(2131034122);
        final Context applicationContext2 = applicationContext.getApplicationContext();
        final m6.l a = d.a;
        final int n = WorkDatabase.n;
        RoomDatabase$a a2;
        if (boolean1) {
            a2 = new RoomDatabase$a(applicationContext2, (Class)WorkDatabase.class, (String)null);
            a2.h = true;
        }
        else {
            final String a3 = d6.i.a;
            a2 = androidx.room.g.a(applicationContext2, (Class)WorkDatabase.class, "androidx.work.workdb");
            a2.g = new d6.g(applicationContext2);
        }
        a2.e = (Executor)a;
        final d6.h h = new d6.h();
        if (a2.d == null) {
            a2.d = new ArrayList();
        }
        a2.d.add(h);
        a2.a(new k5.b[] { androidx.work.impl.a.a });
        a2.a(new k5.b[] { new androidx.work.impl.a.h(applicationContext2, 2, 3) });
        a2.a(new k5.b[] { androidx.work.impl.a.b });
        a2.a(new k5.b[] { androidx.work.impl.a.c });
        a2.a(new k5.b[] { new androidx.work.impl.a.h(applicationContext2, 5, 6) });
        a2.a(new k5.b[] { androidx.work.impl.a.d });
        a2.a(new k5.b[] { androidx.work.impl.a.e });
        a2.a(new k5.b[] { androidx.work.impl.a.f });
        a2.a(new k5.b[] { new androidx.work.impl.a.i(applicationContext2) });
        a2.a(new k5.b[] { new androidx.work.impl.a.h(applicationContext2, 10, 11) });
        a2.a(new k5.b[] { androidx.work.impl.a.g });
        a2.j = false;
        a2.k = true;
        final WorkDatabase c = (WorkDatabase)a2.b();
        final Context applicationContext3 = applicationContext.getApplicationContext();
        final h.a a4 = new h.a(b.f);
        synchronized (h.class) {
            c6.h.a = a4;
            monitorexit(h.class);
            final String a5 = d6.e.a;
            final g6.b b2 = new g6.b(applicationContext3, this);
            m6.h.a(applicationContext3, (Class)SystemJobService.class, true);
            c6.h.c().a(d6.e.a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            final List<d> list = Arrays.asList((d)b2, (d)new e6.c(applicationContext3, b, d, this));
            final c f = new c(applicationContext, b, d, c, list);
            applicationContext = applicationContext.getApplicationContext();
            this.a = applicationContext;
            this.b = b;
            this.d = d;
            this.c = c;
            this.e = list;
            this.f = f;
            this.g = new i(c);
            this.h = false;
            if (!applicationContext.isDeviceProtectedStorage()) {
                ((b)this.d).a((Runnable)new ForceStopRunnable(applicationContext, this));
                return;
            }
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
    }
    
    public static j k(Context applicationContext) {
        final Object l = d6.j.l;
        monitorenter(l);
        while (true) {
            try {
                synchronized (l) {
                    j j = d6.j.j;
                    if (j != null) {
                        monitorexit(l);
                    }
                    else {
                        j = d6.j.k;
                        monitorexit(l);
                    }
                    j k = j;
                    if (j == null) {
                        applicationContext = applicationContext.getApplicationContext();
                        if (!(applicationContext instanceof a$b)) {
                            throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                        }
                        l(applicationContext, ((a$b)applicationContext).w());
                        k = k(applicationContext);
                    }
                    return k;
                }
                monitorexit(l);
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static void l(final Context context, final a a) {
        synchronized (d6.j.l) {
            final j j = d6.j.j;
            if (j != null && d6.j.k != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
            if (j == null) {
                final Context applicationContext = context.getApplicationContext();
                if (d6.j.k == null) {
                    d6.j.k = new j(applicationContext, a, new b(a.b));
                }
                d6.j.j = d6.j.k;
            }
        }
    }
    
    public final f b(final String s, final ExistingWorkPolicy existingWorkPolicy, final List list) {
        if (!list.isEmpty()) {
            return new f(this, s, existingWorkPolicy, list);
        }
        throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
    }
    
    public final d6.b c(final String s) {
        final m6.b b = new m6.b(this, s);
        ((b)this.d).a((Runnable)b);
        return b.f;
    }
    
    public final d6.b d(final UUID uuid) {
        final m6.a a = new m6.a(this, uuid);
        ((b)this.d).a((Runnable)a);
        return a.f;
    }
    
    public final c6.i e(final String s, final ExistingWorkPolicy existingWorkPolicy, final List<androidx.work.d> list) {
        return new f(this, s, existingWorkPolicy, list).a();
    }
    
    public final androidx.work.impl.utils.futures.a g(final UUID uuid) {
        final n n = new n(this, uuid);
        ((b)this.d).a.execute((Runnable)n);
        return n.f;
    }
    
    public final PendingIntent h(final UUID uuid) {
        final Context a = this.a;
        final String string = uuid.toString();
        final String p = androidx.work.impl.foreground.a.p;
        final Intent intent = new Intent(a, (Class)SystemForegroundService.class);
        intent.setAction("ACTION_CANCEL_WORK");
        intent.setData(Uri.parse(String.format("workspec://%s", string)));
        intent.putExtra("KEY_WORKSPEC_ID", string);
        int n = 134217728;
        if (v3.a.a()) {
            n = 167772160;
        }
        return PendingIntent.getService(this.a, 0, intent, n);
    }
    
    public final c6.i i(final List<? extends androidx.work.f> list) {
        if (!list.isEmpty()) {
            return new f(this, null, ExistingWorkPolicy.KEEP, list, null).a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }
    
    public final c6.i j(final String s, final ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, final androidx.work.e e) {
        ExistingWorkPolicy existingWorkPolicy;
        if (existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.KEEP) {
            existingWorkPolicy = ExistingWorkPolicy.KEEP;
        }
        else {
            existingWorkPolicy = ExistingWorkPolicy.REPLACE;
        }
        return new f(this, s, existingWorkPolicy, Collections.singletonList(e)).a();
    }
    
    public final void m() {
        synchronized (d6.j.l) {
            this.h = true;
            final BroadcastReceiver$PendingResult i = this.i;
            if (i != null) {
                i.finish();
                this.i = null;
            }
        }
    }
    
    public final void n() {
        final Context a = this.a;
        final String j = g6.b.j;
        final JobScheduler jobScheduler = (JobScheduler)a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            final ArrayList d = g6.b.d(a, jobScheduler);
            if (d != null && !d.isEmpty()) {
                final Iterator iterator = d.iterator();
                while (iterator.hasNext()) {
                    g6.b.c(jobScheduler, ((JobInfo)iterator.next()).getId());
                }
            }
        }
        final t t = (t)this.c.x();
        t.a.b();
        final n5.e a2 = t.i.a();
        t.a.c();
        try {
            a2.executeUpdateDelete();
            t.a.q();
            t.a.m();
            t.i.c(a2);
            d6.e.a(this.b, this.c, (List)this.e);
        }
        finally {
            t.a.m();
            t.i.c(a2);
        }
    }
    
    public final void o(final String s, final WorkerParameters$a workerParameters$a) {
        ((b)this.d).a((Runnable)new m(this, s, workerParameters$a));
    }
    
    public final void p(final String s) {
        ((b)this.d).a((Runnable)new p(this, s, false));
    }
}
