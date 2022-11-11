// 
// Decompiled by Procyon v0.6.0
// 

package androidx.loader.content;

import android.os.Message;
import android.os.Looper;
import android.os.Handler;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.ThreadPoolExecutor;

public abstract class ModernAsyncTask<Params, Progress, Result>
{
    public static final ThreadPoolExecutor k;
    public static f l;
    public final ModernAsyncTask$b f;
    public final ModernAsyncTask$c g;
    public volatile Status h;
    public final AtomicBoolean i;
    public final AtomicBoolean j;
    
    static {
        k = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(10), new ThreadFactory() {
            public final AtomicInteger f = new AtomicInteger(1);
            
            @Override
            public final Thread newThread(final Runnable runnable) {
                final StringBuilder r = a.r("ModernAsyncTask #");
                r.append(this.f.getAndIncrement());
                return new Thread(runnable, r.toString());
            }
        });
    }
    
    public ModernAsyncTask() {
        this.h = Status.PENDING;
        this.i = new AtomicBoolean();
        this.j = new AtomicBoolean();
        final ModernAsyncTask$b f = new ModernAsyncTask$b(this);
        this.f = f;
        this.g = new FutureTask<Result>(f) {
            public final void done() {
                try {
                    final Object value = ((FutureTask<Object>)this).get();
                    final ModernAsyncTask f = ModernAsyncTask.this;
                    if (!f.j.get()) {
                        f.d(value);
                    }
                }
                catch (final CancellationException ex) {
                    final ModernAsyncTask f2 = ModernAsyncTask.this;
                    if (!f2.j.get()) {
                        f2.d(null);
                    }
                }
                catch (final ExecutionException ex2) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", ex2.getCause());
                }
                catch (final InterruptedException ex3) {
                    Log.w("AsyncTask", (Throwable)ex3);
                }
                finally {
                    final Throwable t;
                    throw new RuntimeException("An error occurred while executing doInBackground()", t);
                }
            }
        };
    }
    
    public abstract Result a(final Params... p0);
    
    public void b(final Result result) {
    }
    
    public void c(final Result result) {
    }
    
    public final void d(final Object o) {
        synchronized (ModernAsyncTask.class) {
            if (ModernAsyncTask.l == null) {
                ModernAsyncTask.l = new f();
            }
            final f l = ModernAsyncTask.l;
            monitorexit(ModernAsyncTask.class);
            l.obtainMessage(1, (Object)new e(this, new Object[] { o })).sendToTarget();
        }
    }
    
    public enum Status
    {
        FINISHED, 
        PENDING, 
        RUNNING;
    }
    
    public static final class e<Data>
    {
        public final ModernAsyncTask a;
        public final Data[] b;
        
        public e(final ModernAsyncTask a, final Data... b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class f extends Handler
    {
        public f() {
            super(Looper.getMainLooper());
        }
        
        public final void handleMessage(final Message message) {
            final e e = (e)message.obj;
            final int what = message.what;
            if (what != 1) {
                if (what == 2) {
                    e.a.getClass();
                }
            }
            else {
                final ModernAsyncTask a = e.a;
                final Data data = e.b[0];
                if (a.i.get()) {
                    a.b(data);
                }
                else {
                    a.c(data);
                }
                a.h = Status.FINISHED;
            }
        }
    }
    
    public abstract static class g<Params, Result> implements Callable<Result>
    {
        public Params[] f;
    }
}
