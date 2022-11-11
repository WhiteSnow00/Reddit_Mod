// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.schedulers;

import wf2.c;
import java.util.concurrent.RejectedExecutionException;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import io.reactivex.plugins.RxJavaPlugins;
import if2.a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import wf2.h;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import ff2.b0;

public final class b extends b0
{
    public static final RxThreadFactory c;
    public final AtomicReference<ScheduledExecutorService> b;
    
    static {
        Executors.newScheduledThreadPool(0).shutdown();
        c = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5))), true);
    }
    
    public b() {
        this(io.reactivex.internal.schedulers.b.c);
    }
    
    public b(final ThreadFactory threadFactory) {
        final AtomicReference b = new AtomicReference();
        this.b = b;
        final boolean a = h.a;
        final ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (h.a && scheduledThreadPool instanceof ScheduledThreadPoolExecutor) {
            h.d.put(scheduledThreadPool, scheduledThreadPool);
        }
        b.lazySet(scheduledThreadPool);
    }
    
    public final b0.c a() {
        return (b0.c)new b.b$a((ScheduledExecutorService)this.b.get());
    }
    
    public final a d(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        final ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(RxJavaPlugins.onSchedule(runnable));
        Label_0040: {
            if (n > 0L) {
                break Label_0040;
            }
            try {
                Object future = this.b.get().submit((Callable<V>)scheduledDirectTask);
                while (true) {
                    ((AbstractDirectTask)scheduledDirectTask).setFuture((Future<?>)future);
                    return (a)scheduledDirectTask;
                    future = this.b.get().schedule((Callable<T>)scheduledDirectTask, n, timeUnit);
                    continue;
                }
            }
            catch (final RejectedExecutionException ex) {
                RxJavaPlugins.onError(ex);
                return (a)EmptyDisposable.INSTANCE;
            }
        }
    }
    
    public final a e(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        final Runnable onSchedule = RxJavaPlugins.onSchedule(runnable);
        if (n2 <= 0L) {
            final ScheduledExecutorService scheduledExecutorService = this.b.get();
            final c c = new c(onSchedule, scheduledExecutorService);
            Label_0054: {
                if (n > 0L) {
                    break Label_0054;
                }
                try {
                    Object o = scheduledExecutorService.submit((Callable<V>)c);
                    while (true) {
                        c.a((Future<?>)o);
                        return (a)c;
                        o = scheduledExecutorService.schedule((Callable<T>)c, n, timeUnit);
                        continue;
                    }
                }
                catch (final RejectedExecutionException ex) {
                    RxJavaPlugins.onError(ex);
                    return (a)EmptyDisposable.INSTANCE;
                }
            }
        }
        final ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(onSchedule);
        try {
            ((AbstractDirectTask)scheduledDirectPeriodicTask).setFuture(this.b.get().scheduleAtFixedRate((Runnable)scheduledDirectPeriodicTask, n, n2, timeUnit));
            return (a)scheduledDirectPeriodicTask;
        }
        catch (final RejectedExecutionException ex2) {
            RxJavaPlugins.onError(ex2);
            return (a)EmptyDisposable.INSTANCE;
        }
    }
}
