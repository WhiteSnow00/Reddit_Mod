// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.schedulers;

import io.reactivex.disposables.CompositeDisposable;
import rf2.c;
import java.util.concurrent.RejectedExecutionException;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import io.reactivex.plugins.RxJavaPlugins;
import df2.a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import rf2.h;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import af2.b0;

public final class b extends b0
{
    public static final RxThreadFactory c;
    public final AtomicReference<ScheduledExecutorService> b;
    
    static {
        Executors.newScheduledThreadPool(0).shutdown();
        c = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5))), true);
    }
    
    public b() {
        this((ThreadFactory)io.reactivex.internal.schedulers.b.c);
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
        return new a(this.b.get());
    }
    
    public final df2.a d(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        final ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(RxJavaPlugins.onSchedule(runnable));
        Label_0040: {
            if (n > 0L) {
                break Label_0040;
            }
            try {
                Object future = this.b.get().submit((Callable<V>)scheduledDirectTask);
                while (true) {
                    scheduledDirectTask.setFuture((Future<?>)future);
                    return (df2.a)scheduledDirectTask;
                    future = this.b.get().schedule((Callable<T>)scheduledDirectTask, n, timeUnit);
                    continue;
                }
            }
            catch (final RejectedExecutionException ex) {
                RxJavaPlugins.onError((Throwable)ex);
                return (df2.a)EmptyDisposable.INSTANCE;
            }
        }
    }
    
    public final df2.a e(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
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
                        c.a((Future)o);
                        return (df2.a)c;
                        o = scheduledExecutorService.schedule((Callable<T>)c, n, timeUnit);
                        continue;
                    }
                }
                catch (final RejectedExecutionException ex) {
                    RxJavaPlugins.onError((Throwable)ex);
                    return (df2.a)EmptyDisposable.INSTANCE;
                }
            }
        }
        final ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(onSchedule);
        try {
            scheduledDirectPeriodicTask.setFuture(this.b.get().scheduleAtFixedRate(scheduledDirectPeriodicTask, n, n2, timeUnit));
            return (df2.a)scheduledDirectPeriodicTask;
        }
        catch (final RejectedExecutionException ex2) {
            RxJavaPlugins.onError((Throwable)ex2);
            return (df2.a)EmptyDisposable.INSTANCE;
        }
    }
    
    public static final class a extends c
    {
        public final ScheduledExecutorService f;
        public final CompositeDisposable g;
        public volatile boolean h;
        
        public a(final ScheduledExecutorService f) {
            this.f = f;
            this.g = new CompositeDisposable();
        }
        
        @Override
        public final df2.a c(final Runnable runnable, final long n, final TimeUnit timeUnit) {
            if (this.h) {
                return (df2.a)EmptyDisposable.INSTANCE;
            }
            final ScheduledRunnable scheduledRunnable = new ScheduledRunnable(RxJavaPlugins.onSchedule(runnable), (gf2.a)this.g);
            this.g.add((df2.a)scheduledRunnable);
            Label_0059: {
                if (n > 0L) {
                    break Label_0059;
                }
                try {
                    Object future = this.f.submit((Callable<V>)scheduledRunnable);
                    while (true) {
                        scheduledRunnable.setFuture((Future<?>)future);
                        return (df2.a)scheduledRunnable;
                        future = this.f.schedule((Callable<T>)scheduledRunnable, n, timeUnit);
                        continue;
                    }
                }
                catch (final RejectedExecutionException ex) {
                    this.dispose();
                    RxJavaPlugins.onError((Throwable)ex);
                    return (df2.a)EmptyDisposable.INSTANCE;
                }
            }
        }
        
        public final void dispose() {
            if (!this.h) {
                this.h = true;
                this.g.dispose();
            }
        }
        
        public final boolean isDisposed() {
            return this.h;
        }
    }
}
