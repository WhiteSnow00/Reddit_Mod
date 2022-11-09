// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import android.os.IBinder;
import android.os.AsyncTask;
import android.content.Intent;
import android.content.Context;
import android.os.Build$VERSION;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import android.content.ComponentName;
import java.util.HashMap;
import android.app.Service;

public abstract class JobIntentService extends Service
{
    public static final HashMap<ComponentName, JobIntentService.h> sClassWorkEnqueuer;
    public static final Object sLock;
    public final ArrayList<JobIntentService.d> mCompatQueue;
    public JobIntentService.h mCompatWorkEnqueuer;
    public JobIntentService.a mCurProcessor;
    public boolean mDestroyed;
    public boolean mInterruptIfStopped;
    public JobIntentService.b mJobImpl;
    public boolean mStopped;
    
    static {
        Covode.recordClassIndex(663);
        sLock = new Object();
        sClassWorkEnqueuer = new HashMap<ComponentName, JobIntentService.h>();
    }
    
    public JobIntentService() {
        if (Build$VERSION.SDK_INT >= 26) {
            this.mCompatQueue = null;
            return;
        }
        this.mCompatQueue = new ArrayList<JobIntentService.d>();
    }
    
    public static void enqueueWork(final Context context, final ComponentName componentName, final int n, final Intent intent) {
        if (intent != null) {
            synchronized (JobIntentService.sLock) {
                final JobIntentService.h workEnqueuer = getWorkEnqueuer(context, componentName, true, n);
                workEnqueuer.LIZ(n);
                workEnqueuer.LIZ(intent);
                return;
            }
        }
        throw new IllegalArgumentException("work must not be null");
    }
    
    public static void enqueueWork(final Context context, final Class<?> clazz, final int n, final Intent intent) {
        enqueueWork(context, new ComponentName(context, (Class)clazz), n, intent);
    }
    
    public static JobIntentService.h getWorkEnqueuer(final Context context, final ComponentName componentName, final boolean b, final int n) {
        final HashMap<ComponentName, JobIntentService.h> sClassWorkEnqueuer = JobIntentService.sClassWorkEnqueuer;
        JobIntentService.h h;
        if ((h = sClassWorkEnqueuer.get(componentName)) == null) {
            Object o;
            if (Build$VERSION.SDK_INT >= 26) {
                if (!b) {
                    throw new IllegalArgumentException("Can't be here without a job id");
                }
                o = new JobIntentService.g(context, componentName, n);
            }
            else {
                o = new JobIntentService.c(context, componentName);
            }
            sClassWorkEnqueuer.put(componentName, (JobIntentService.h)o);
            h = (JobIntentService.h)o;
        }
        return h;
    }
    
    public JobIntentService.e dequeueWork() {
        final JobIntentService.b mJobImpl = this.mJobImpl;
        if (mJobImpl != null) {
            return mJobImpl.LIZIZ();
        }
        synchronized (this.mCompatQueue) {
            if (this.mCompatQueue.size() > 0) {
                return (JobIntentService.e)this.mCompatQueue.remove(0);
            }
            return null;
        }
    }
    
    public boolean doStopCurrentWork() {
        final JobIntentService.a mCurProcessor = this.mCurProcessor;
        if (mCurProcessor != null) {
            mCurProcessor.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return this.onStopCurrentWork();
    }
    
    public void ensureProcessorRunningLocked(final boolean b) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new JobIntentService.a(this);
            final JobIntentService.h mCompatWorkEnqueuer = this.mCompatWorkEnqueuer;
            if (mCompatWorkEnqueuer != null && b) {
                mCompatWorkEnqueuer.LIZIZ();
            }
            this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
        }
    }
    
    public IBinder onBind(final Intent intent) {
        final JobIntentService.b mJobImpl = this.mJobImpl;
        if (mJobImpl != null) {
            return mJobImpl.LIZ();
        }
        return null;
    }
    
    public void onCreate() {
        super.onCreate();
        if (Build$VERSION.SDK_INT >= 26) {
            this.mJobImpl = (JobIntentService.b)new JobIntentService.f(this);
            this.mCompatWorkEnqueuer = null;
            return;
        }
        this.mJobImpl = null;
        this.mCompatWorkEnqueuer = getWorkEnqueuer((Context)this, new ComponentName((Context)this, (Class)this.getClass()), false, 0);
    }
    
    public void onDestroy() {
        super.onDestroy();
        final ArrayList<JobIntentService.d> mCompatQueue = this.mCompatQueue;
        if (mCompatQueue != null) {
            synchronized (mCompatQueue) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.LIZJ();
            }
        }
    }
    
    public abstract void onHandleWork(final Intent p0);
    
    public int onStartCommand(Intent intent, final int n, final int n2) {
        if (this.mCompatQueue != null) {
            this.mCompatWorkEnqueuer.LIZ();
            synchronized (this.mCompatQueue) {
                final ArrayList<JobIntentService.d> mCompatQueue = this.mCompatQueue;
                if (intent == null) {
                    intent = new Intent();
                }
                mCompatQueue.add(new JobIntentService.d(this, intent, n2));
                this.ensureProcessorRunningLocked(true);
                monitorexit(this.mCompatQueue);
                return 3;
            }
        }
        return 2;
    }
    
    public boolean onStopCurrentWork() {
        return true;
    }
    
    public void processorFinished() {
        final ArrayList<JobIntentService.d> mCompatQueue = this.mCompatQueue;
        if (mCompatQueue != null) {
            synchronized (mCompatQueue) {
                this.mCurProcessor = null;
                final ArrayList<JobIntentService.d> mCompatQueue2 = this.mCompatQueue;
                if (mCompatQueue2 != null && mCompatQueue2.size() > 0) {
                    this.ensureProcessorRunningLocked(false);
                }
                else if (!this.mDestroyed) {
                    this.mCompatWorkEnqueuer.LIZJ();
                }
                monitorexit(mCompatQueue);
            }
        }
    }
}
