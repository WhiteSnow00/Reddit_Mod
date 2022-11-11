// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.schedulers;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.RejectedExecutionException;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import io.reactivex.plugins.RxJavaPlugins;
import eg2.a;
import java.util.concurrent.Executor;
import ff2.b0;

public final class ExecutorScheduler extends b0
{
    public static final b0 d;
    public final boolean b;
    public final Executor c;
    
    static {
        d = RxJavaPlugins.onSingleScheduler(eg2.a.a);
    }
    
    public ExecutorScheduler(final Executor c) {
        this.c = c;
        this.b = false;
    }
    
    public final b0.c a() {
        return (b0.c)new ExecutorScheduler.ExecutorScheduler$ExecutorWorker(this.c, this.b);
    }
    
    public final if2.a c(Runnable onSchedule) {
        onSchedule = RxJavaPlugins.onSchedule(onSchedule);
        try {
            if (this.c instanceof ExecutorService) {
                final ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(onSchedule);
                ((AbstractDirectTask)scheduledDirectTask).setFuture(((ExecutorService)this.c).submit((Callable<Object>)scheduledDirectTask));
                return (if2.a)scheduledDirectTask;
            }
            if (this.b) {
                final InterruptibleRunnable interruptibleRunnable = new InterruptibleRunnable(onSchedule, null);
                this.c.execute(interruptibleRunnable);
                return (if2.a)interruptibleRunnable;
            }
            final BooleanRunnable booleanRunnable = new BooleanRunnable(onSchedule);
            this.c.execute(booleanRunnable);
            return (if2.a)booleanRunnable;
        }
        catch (final RejectedExecutionException ex) {
            RxJavaPlugins.onError(ex);
            return (if2.a)EmptyDisposable.INSTANCE;
        }
    }
    
    public final if2.a d(Runnable onSchedule, final long n, final TimeUnit timeUnit) {
        onSchedule = RxJavaPlugins.onSchedule(onSchedule);
        if (this.c instanceof ScheduledExecutorService) {
            try {
                final ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(onSchedule);
                ((AbstractDirectTask)scheduledDirectTask).setFuture(((ScheduledExecutorService)this.c).schedule((Callable<Object>)scheduledDirectTask, n, timeUnit));
                return (if2.a)scheduledDirectTask;
            }
            catch (final RejectedExecutionException ex) {
                RxJavaPlugins.onError(ex);
                return (if2.a)EmptyDisposable.INSTANCE;
            }
        }
        final DelayedRunnable delayedRunnable = new DelayedRunnable(onSchedule);
        delayedRunnable.timed.replace(ExecutorScheduler.d.d((Runnable)new a(delayedRunnable), n, timeUnit));
        return (if2.a)delayedRunnable;
    }
    
    public final if2.a e(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        if (this.c instanceof ScheduledExecutorService) {
            final Runnable onSchedule = RxJavaPlugins.onSchedule(runnable);
            try {
                final ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(onSchedule);
                ((AbstractDirectTask)scheduledDirectPeriodicTask).setFuture(((ScheduledExecutorService)this.c).scheduleAtFixedRate((Runnable)scheduledDirectPeriodicTask, n, n2, timeUnit));
                return (if2.a)scheduledDirectPeriodicTask;
            }
            catch (final RejectedExecutionException ex) {
                RxJavaPlugins.onError(ex);
                return (if2.a)EmptyDisposable.INSTANCE;
            }
        }
        return super.e(runnable, n, n2, timeUnit);
    }
    
    public static final class DelayedRunnable extends AtomicReference<Runnable> implements Runnable, if2.a
    {
        private static final long serialVersionUID = -4101336210206799084L;
        public final SequentialDisposable direct;
        public final SequentialDisposable timed;
        
        public DelayedRunnable(final Runnable runnable) {
            super(runnable);
            this.timed = new SequentialDisposable();
            this.direct = new SequentialDisposable();
        }
        
        public void dispose() {
            if (this.getAndSet(null) != null) {
                this.timed.dispose();
                this.direct.dispose();
            }
        }
        
        public Runnable getWrappedRunnable() {
            Runnable b = this.get();
            if (b == null) {
                b = Functions.b;
            }
            return b;
        }
        
        public boolean isDisposed() {
            return this.get() == null;
        }
        
        @Override
        public void run() {
            final Runnable runnable = this.get();
            if (runnable != null) {
                try {
                    runnable.run();
                    this.lazySet(null);
                    final SequentialDisposable timed = this.timed;
                    final DisposableHelper disposed = DisposableHelper.DISPOSED;
                    ((AtomicReference<DisposableHelper>)timed).lazySet(disposed);
                    ((AtomicReference<DisposableHelper>)this.direct).lazySet(disposed);
                }
                finally {
                    this.lazySet(null);
                    ((AtomicReference<DisposableHelper>)this.timed).lazySet(DisposableHelper.DISPOSED);
                    ((AtomicReference<DisposableHelper>)this.direct).lazySet(DisposableHelper.DISPOSED);
                }
            }
        }
    }
    
    public final class a implements Runnable
    {
        public final DelayedRunnable f;
        
        public a(final DelayedRunnable f) {
            this.f = f;
        }
        
        @Override
        public final void run() {
            final DelayedRunnable f = this.f;
            f.direct.replace(ExecutorScheduler.this.c(f));
        }
    }
}
