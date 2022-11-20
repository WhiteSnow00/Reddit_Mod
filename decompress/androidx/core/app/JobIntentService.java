// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import android.support.v4.media.a;
import android.app.job.JobInfo$Builder;
import android.app.job.JobScheduler;
import android.app.job.JobInfo;
import a4.t;
import android.app.job.JobWorkItem;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.os.PowerManager;
import android.os.PowerManager$WakeLock;
import android.os.IBinder;
import android.os.AsyncTask;
import android.content.Intent;
import android.content.Context;
import android.os.Build$VERSION;
import java.util.ArrayList;
import android.content.ComponentName;
import java.util.HashMap;
import android.app.Service;

@Deprecated
public abstract class JobIntentService extends Service
{
    public static final boolean DEBUG = false;
    public static final String TAG = "JobIntentService";
    public static final HashMap<ComponentName, h> sClassWorkEnqueuer;
    public static final Object sLock;
    public final ArrayList<d> mCompatQueue;
    public h mCompatWorkEnqueuer;
    public a mCurProcessor;
    public boolean mDestroyed;
    public boolean mInterruptIfStopped;
    public b mJobImpl;
    public boolean mStopped;
    
    static {
        sLock = new Object();
        sClassWorkEnqueuer = new HashMap<ComponentName, h>();
    }
    
    public JobIntentService() {
        this.mInterruptIfStopped = false;
        this.mStopped = false;
        this.mDestroyed = false;
        if (Build$VERSION.SDK_INT >= 26) {
            this.mCompatQueue = null;
        }
        else {
            this.mCompatQueue = new ArrayList<d>();
        }
    }
    
    public static void enqueueWork(final Context context, final ComponentName componentName, final int n, final Intent intent) {
        if (intent != null) {
            synchronized (JobIntentService.sLock) {
                final h workEnqueuer = getWorkEnqueuer(context, componentName, true, n);
                workEnqueuer.b(n);
                workEnqueuer.a(intent);
                return;
            }
        }
        throw new IllegalArgumentException("work must not be null");
    }
    
    public static void enqueueWork(final Context context, final Class<?> clazz, final int n, final Intent intent) {
        enqueueWork(context, new ComponentName(context, (Class)clazz), n, intent);
    }
    
    public static h getWorkEnqueuer(final Context context, final ComponentName componentName, final boolean b, final int n) {
        final HashMap<ComponentName, h> sClassWorkEnqueuer = JobIntentService.sClassWorkEnqueuer;
        h h;
        if ((h = sClassWorkEnqueuer.get(componentName)) == null) {
            h h2;
            if (Build$VERSION.SDK_INT >= 26) {
                if (!b) {
                    throw new IllegalArgumentException("Can't be here without a job id");
                }
                h2 = new g(context, componentName, n);
            }
            else {
                h2 = new c(context, componentName);
            }
            sClassWorkEnqueuer.put(componentName, h2);
            h = h2;
        }
        return h;
    }
    
    public e dequeueWork() {
        final b mJobImpl = this.mJobImpl;
        if (mJobImpl != null) {
            return (e)((f)mJobImpl).a();
        }
        synchronized (this.mCompatQueue) {
            if (this.mCompatQueue.size() > 0) {
                return (e)this.mCompatQueue.remove(0);
            }
            return null;
        }
    }
    
    public boolean doStopCurrentWork() {
        final a mCurProcessor = this.mCurProcessor;
        if (mCurProcessor != null) {
            mCurProcessor.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return this.onStopCurrentWork();
    }
    
    public void ensureProcessorRunningLocked(final boolean b) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new a();
            final h mCompatWorkEnqueuer = this.mCompatWorkEnqueuer;
            if (mCompatWorkEnqueuer != null && b) {
                mCompatWorkEnqueuer.d();
            }
            this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
        }
    }
    
    public boolean isStopped() {
        return this.mStopped;
    }
    
    public IBinder onBind(final Intent intent) {
        final b mJobImpl = this.mJobImpl;
        if (mJobImpl != null) {
            return ((f)mJobImpl).getBinder();
        }
        return null;
    }
    
    public void onCreate() {
        super.onCreate();
        if (Build$VERSION.SDK_INT >= 26) {
            this.mJobImpl = (b)new f(this);
            this.mCompatWorkEnqueuer = null;
        }
        else {
            this.mJobImpl = null;
            this.mCompatWorkEnqueuer = getWorkEnqueuer((Context)this, new ComponentName((Context)this, (Class)this.getClass()), false, 0);
        }
    }
    
    public void onDestroy() {
        super.onDestroy();
        final ArrayList<d> mCompatQueue = this.mCompatQueue;
        if (mCompatQueue != null) {
            synchronized (mCompatQueue) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.c();
            }
        }
    }
    
    public abstract void onHandleWork(final Intent p0);
    
    public int onStartCommand(Intent intent, final int n, final int n2) {
        if (this.mCompatQueue != null) {
            this.mCompatWorkEnqueuer.e();
            synchronized (this.mCompatQueue) {
                final ArrayList<d> mCompatQueue = this.mCompatQueue;
                if (intent == null) {
                    intent = new Intent();
                }
                mCompatQueue.add(new d(intent, n2));
                this.ensureProcessorRunningLocked(true);
                return 3;
            }
        }
        return 2;
    }
    
    public boolean onStopCurrentWork() {
        return true;
    }
    
    public void processorFinished() {
        final ArrayList<d> mCompatQueue = this.mCompatQueue;
        if (mCompatQueue != null) {
            synchronized (mCompatQueue) {
                this.mCurProcessor = null;
                final ArrayList<d> mCompatQueue2 = this.mCompatQueue;
                if (mCompatQueue2 != null && mCompatQueue2.size() > 0) {
                    this.ensureProcessorRunningLocked(false);
                }
                else if (!this.mDestroyed) {
                    this.mCompatWorkEnqueuer.c();
                }
            }
        }
    }
    
    public void setInterruptIfStopped(final boolean mInterruptIfStopped) {
        this.mInterruptIfStopped = mInterruptIfStopped;
    }
    
    public final class a extends AsyncTask<Void, Void, Void>
    {
        public final JobIntentService a;
        
        public a(final JobIntentService a) {
            this.a = a;
        }
        
        public final Object doInBackground(final Object[] array) {
            final Void[] array2 = (Void[])array;
            while (true) {
                final e dequeueWork = this.a.dequeueWork();
                if (dequeueWork == null) {
                    break;
                }
                this.a.onHandleWork(dequeueWork.getIntent());
                dequeueWork.complete();
            }
            return null;
        }
        
        public final void onCancelled(final Object o) {
            final Void void1 = (Void)o;
            this.a.processorFinished();
        }
        
        public final void onPostExecute(final Object o) {
            final Void void1 = (Void)o;
            this.a.processorFinished();
        }
    }
    
    public interface b
    {
    }
    
    public static final class c extends h
    {
        public final Context d;
        public final PowerManager$WakeLock e;
        public final PowerManager$WakeLock f;
        public boolean g;
        public boolean h;
        
        public c(final Context context, final ComponentName componentName) {
            super(componentName);
            this.d = context.getApplicationContext();
            final PowerManager powerManager = (PowerManager)context.getSystemService("power");
            final StringBuilder sb = new StringBuilder();
            sb.append(componentName.getClassName());
            sb.append(":launch");
            (this.e = powerManager.newWakeLock(1, sb.toString())).setReferenceCounted(false);
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(componentName.getClassName());
            sb2.append(":run");
            (this.f = powerManager.newWakeLock(1, sb2.toString())).setReferenceCounted(false);
        }
        
        @Override
        public final void a(Intent intent) {
            intent = new Intent(intent);
            intent.setComponent(super.a);
            if (this.d.startService(intent) != null) {
                synchronized (this) {
                    if (!this.g) {
                        this.g = true;
                        if (!this.h) {
                            this.e.acquire(60000L);
                        }
                    }
                }
            }
        }
        
        @Override
        public final void c() {
            synchronized (this) {
                if (this.h) {
                    if (this.g) {
                        this.e.acquire(60000L);
                    }
                    this.h = false;
                    this.f.release();
                }
            }
        }
        
        @Override
        public final void d() {
            synchronized (this) {
                if (!this.h) {
                    this.h = true;
                    this.f.acquire(600000L);
                    this.e.release();
                }
            }
        }
        
        @Override
        public final void e() {
            synchronized (this) {
                this.g = false;
            }
        }
    }
    
    public final class d implements e
    {
        public final Intent a;
        public final int b;
        public final JobIntentService c;
        
        public d(final JobIntentService c, final Intent a, final int b) {
            this.c = c;
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final void complete() {
            this.c.stopSelf(this.b);
        }
        
        @Override
        public final Intent getIntent() {
            return this.a;
        }
    }
    
    public interface e
    {
        void complete();
        
        Intent getIntent();
    }
    
    public static final class f extends JobServiceEngine implements b
    {
        public final JobIntentService a;
        public final Object b;
        public JobParameters c;
        
        public f(final JobIntentService a) {
            super(a);
            this.b = new Object();
            this.a = a;
        }
        
        public final a a() {
            synchronized (this.b) {
                final JobParameters c = this.c;
                if (c == null) {
                    return null;
                }
                final JobWorkItem dequeueWork = c.dequeueWork();
                monitorexit(this.b);
                if (dequeueWork != null) {
                    dequeueWork.getIntent().setExtrasClassLoader(((Context)this.a).getClassLoader());
                    return new a(dequeueWork);
                }
                return null;
            }
        }
        
        public final boolean onStartJob(final JobParameters c) {
            this.c = c;
            this.a.ensureProcessorRunningLocked(false);
            return true;
        }
        
        public final boolean onStopJob(final JobParameters jobParameters) {
            final boolean doStopCurrentWork = this.a.doStopCurrentWork();
            synchronized (this.b) {
                this.c = null;
                return doStopCurrentWork;
            }
        }
        
        public final class a implements e
        {
            public final JobWorkItem a;
            public final f b;
            
            public a(final f b, final JobWorkItem a) {
                this.b = b;
                this.a = a;
            }
            
            @Override
            public final void complete() {
                synchronized (this.b.b) {
                    final JobParameters c = this.b.c;
                    if (c != null) {
                        t.k(c, this.a);
                    }
                }
            }
            
            @Override
            public final Intent getIntent() {
                return this.a.getIntent();
            }
        }
    }
    
    public static final class g extends h
    {
        public final JobInfo d;
        public final JobScheduler e;
        
        public g(final Context context, final ComponentName componentName, final int n) {
            super(componentName);
            ((h)this).b(n);
            this.d = new JobInfo$Builder(n, componentName).setOverrideDeadline(0L).build();
            this.e = (JobScheduler)context.getApplicationContext().getSystemService("jobscheduler");
        }
        
        @Override
        public final void a(final Intent intent) {
            this.e.enqueue(this.d, new JobWorkItem(intent));
        }
    }
    
    public abstract static class h
    {
        public final ComponentName a;
        public boolean b;
        public int c;
        
        public h(final ComponentName a) {
            this.a = a;
        }
        
        public abstract void a(final Intent p0);
        
        public final void b(final int c) {
            if (!this.b) {
                this.b = true;
                this.c = c;
            }
            else if (this.c != c) {
                final StringBuilder o = android.support.v4.media.a.o("Given job ID ", c, " is different than previous ");
                o.append(this.c);
                throw new IllegalArgumentException(o.toString());
            }
        }
        
        public void c() {
        }
        
        public void d() {
        }
        
        public void e() {
        }
    }
}
