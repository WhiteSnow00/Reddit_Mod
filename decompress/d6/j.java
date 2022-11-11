// 
// Decompiled by Procyon v0.6.0
// 

package d6;

import j5.w;
import m6.o;
import m6.p;
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
import m6.l;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Arrays;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.a$i;
import androidx.work.impl.a$h;
import java.util.ArrayList;
import androidx.room.g;
import androidx.room.RoomDatabase;
import n6.b;
import android.content.BroadcastReceiver$PendingResult;
import m6.i;
import java.util.List;
import androidx.work.impl.WorkDatabase;
import androidx.work.a;
import android.content.Context;
import c6.m;

public final class j extends m
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
        c6.i.e("WorkManagerImpl");
        d6.j.j = null;
        d6.j.k = null;
        l = new Object();
    }
    
    public j(Context applicationContext, final a b, final b d) {
        final boolean boolean1 = applicationContext.getResources().getBoolean(2131034122);
        final Context applicationContext2 = applicationContext.getApplicationContext();
        final l a = d.a;
        final int n = WorkDatabase.n;
        RoomDatabase.a<WorkDatabase> a2;
        if (boolean1) {
            a2 = new RoomDatabase.a<WorkDatabase>(applicationContext2, (Class<RoomDatabase>)WorkDatabase.class, null);
            a2.h = true;
        }
        else {
            final String a3 = d6.i.a;
            a2 = androidx.room.g.a(applicationContext2, WorkDatabase.class, "androidx.work.workdb");
            a2.g = new d6.g(applicationContext2);
        }
        a2.e = a;
        final h h = new h();
        if (a2.d == null) {
            a2.d = new ArrayList<RoomDatabase.b>();
        }
        a2.d.add(h);
        a2.a((k5.b)androidx.work.impl.a.a);
        a2.a((k5.b)new a$h(applicationContext2, 2, 3));
        a2.a((k5.b)androidx.work.impl.a.b);
        a2.a((k5.b)androidx.work.impl.a.c);
        a2.a((k5.b)new a$h(applicationContext2, 5, 6));
        a2.a((k5.b)androidx.work.impl.a.d);
        a2.a((k5.b)androidx.work.impl.a.e);
        a2.a((k5.b)androidx.work.impl.a.f);
        a2.a((k5.b)new a$i(applicationContext2));
        a2.a((k5.b)new a$h(applicationContext2, 10, 11));
        a2.a((k5.b)androidx.work.impl.a.g);
        a2.j = false;
        a2.k = true;
        final WorkDatabase c = a2.b();
        final Context applicationContext3 = applicationContext.getApplicationContext();
        final c6.i.a a4 = new c6.i.a(b.f);
        synchronized (c6.i.class) {
            c6.i.a = a4;
            monitorexit(c6.i.class);
            final String a5 = d6.e.a;
            final g6.c c2 = new g6.c(applicationContext3, this);
            m6.h.a(applicationContext3, SystemJobService.class, true);
            c6.i.c().a(d6.e.a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            final List<d> list = Arrays.asList((d)c2, (d)new e6.c(applicationContext3, b, d, this));
            final c f = new c(applicationContext, b, d, c, list);
            applicationContext = applicationContext.getApplicationContext();
            this.a = applicationContext;
            this.b = b;
            this.d = (n6.a)d;
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
    
    @Override
    public final f b(final String s, final ExistingWorkPolicy existingWorkPolicy, final List list) {
        if (!list.isEmpty()) {
            return new f(this, s, existingWorkPolicy, list);
        }
        throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
    }
    
    @Override
    public final d6.b c(final String s) {
        final m6.b b = new m6.b(this, s);
        ((b)this.d).a((Runnable)b);
        return ((m6.d)b).f;
    }
    
    @Override
    public final d6.b d(final UUID uuid) {
        final m6.a a = new m6.a(this, uuid);
        ((b)this.d).a((Runnable)a);
        return ((m6.d)a).f;
    }
    
    @Override
    public final c6.j e(final String s, final ExistingWorkPolicy existingWorkPolicy, final List<androidx.work.d> list) {
        return new f(this, s, existingWorkPolicy, (List<? extends androidx.work.f>)list).a();
    }
    
    @Override
    public final androidx.work.impl.utils.futures.a g(final UUID uuid) {
        final n n = new n(this, uuid);
        ((b)this.d).a.execute((Runnable)n);
        return ((o)n).f;
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
    
    public final c6.j i(final List<? extends androidx.work.f> list) {
        if (!list.isEmpty()) {
            return new f(this, null, ExistingWorkPolicy.KEEP, list, null).a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }
    
    public final c6.j j(final String s, final ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, final androidx.work.e e) {
        ExistingWorkPolicy existingWorkPolicy;
        if (existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.KEEP) {
            existingWorkPolicy = ExistingWorkPolicy.KEEP;
        }
        else {
            existingWorkPolicy = ExistingWorkPolicy.REPLACE;
        }
        return new f(this, s, existingWorkPolicy, (List<? extends androidx.work.f>)Collections.singletonList(e)).a();
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
        final String j = g6.c.j;
        final JobScheduler jobScheduler = (JobScheduler)a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            final ArrayList d = g6.c.d(a, jobScheduler);
            if (d != null && !d.isEmpty()) {
                final Iterator iterator = d.iterator();
                while (iterator.hasNext()) {
                    g6.c.c(jobScheduler, ((JobInfo)iterator.next()).getId());
                }
            }
        }
        final t t = (t)this.c.x();
        t.a.b();
        final n5.e a2 = ((w)t.i).a();
        t.a.c();
        try {
            a2.executeUpdateDelete();
            t.a.q();
            t.a.m();
            ((w)t.i).c(a2);
            d6.e.a(this.b, this.c, (List)this.e);
        }
        finally {
            t.a.m();
            ((w)t.i).c(a2);
        }
    }
    
    public final void o(final String s, final WorkerParameters$a workerParameters$a) {
        ((b)this.d).a((Runnable)new m6.m(this, s, workerParameters$a));
    }
    
    public final void p(final String s) {
        ((b)this.d).a((Runnable)new p(this, s, false));
    }
}
