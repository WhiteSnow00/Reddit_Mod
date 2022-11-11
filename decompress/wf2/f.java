// 
// Decompiled by Procyon v0.6.0
// 

package wf2;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import if2.a;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ScheduledExecutorService;
import ff2.b0;

public class f extends c
{
    public final ScheduledExecutorService f;
    public volatile boolean g;
    
    public f(final ThreadFactory threadFactory) {
        final boolean a = h.a;
        final ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (h.a && scheduledThreadPool instanceof ScheduledThreadPoolExecutor) {
            h.d.put(scheduledThreadPool, scheduledThreadPool);
        }
        this.f = scheduledThreadPool;
    }
    
    @Override
    public final a b(final Runnable runnable) {
        return this.c(runnable, 0L, null);
    }
    
    @Override
    public final a c(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        if (this.g) {
            return (a)EmptyDisposable.INSTANCE;
        }
        return (a)this.e(runnable, n, timeUnit, null);
    }
    
    public final void dispose() {
        if (!this.g) {
            this.g = true;
            this.f.shutdownNow();
        }
    }
    
    public final ScheduledRunnable e(final Runnable runnable, final long n, final TimeUnit timeUnit, final lf2.a a) {
        final ScheduledRunnable scheduledRunnable = new ScheduledRunnable(RxJavaPlugins.onSchedule(runnable), a);
        if (a != null && !a.add((a)scheduledRunnable)) {
            return scheduledRunnable;
        }
        while (true) {
            if (n <= 0L) {
                try {
                    Object future = this.f.submit((Callable<V>)scheduledRunnable);
                    while (true) {
                        scheduledRunnable.setFuture((Future<?>)future);
                        return scheduledRunnable;
                        future = this.f.schedule((Callable<T>)scheduledRunnable, n, timeUnit);
                        continue;
                    }
                }
                catch (final RejectedExecutionException ex) {
                    if (a != null) {
                        a.remove((a)scheduledRunnable);
                    }
                    RxJavaPlugins.onError(ex);
                }
                return scheduledRunnable;
            }
            continue;
        }
    }
    
    public final boolean isDisposed() {
        return this.g;
    }
}
