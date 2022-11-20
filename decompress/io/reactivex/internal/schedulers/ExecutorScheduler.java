// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.schedulers;

import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.disposables.CompositeDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.queue.MpscLinkedQueue;
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
import zf2.a;
import java.util.concurrent.Executor;
import af2.b0;

public final class ExecutorScheduler extends b0
{
    public static final b0 d;
    public final boolean b;
    public final Executor c;
    
    static {
        d = RxJavaPlugins.onSingleScheduler(a.a);
    }
    
    public ExecutorScheduler(final Executor c) {
        this.c = c;
        this.b = false;
    }
    
    public final b0.c a() {
        return new ExecutorWorker(this.c, this.b);
    }
    
    public final df2.a c(Runnable onSchedule) {
        onSchedule = RxJavaPlugins.onSchedule(onSchedule);
        try {
            if (this.c instanceof ExecutorService) {
                final ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(onSchedule);
                scheduledDirectTask.setFuture(((ExecutorService)this.c).submit((Callable<Object>)scheduledDirectTask));
                return (df2.a)scheduledDirectTask;
            }
            if (this.b) {
                final ExecutorWorker.InterruptibleRunnable interruptibleRunnable = new ExecutorWorker.InterruptibleRunnable(onSchedule, null);
                this.c.execute(interruptibleRunnable);
                return (df2.a)interruptibleRunnable;
            }
            final ExecutorWorker.BooleanRunnable booleanRunnable = new ExecutorWorker.BooleanRunnable(onSchedule);
            this.c.execute(booleanRunnable);
            return (df2.a)booleanRunnable;
        }
        catch (final RejectedExecutionException ex) {
            RxJavaPlugins.onError((Throwable)ex);
            return (df2.a)EmptyDisposable.INSTANCE;
        }
    }
    
    public final df2.a d(Runnable onSchedule, final long n, final TimeUnit timeUnit) {
        onSchedule = RxJavaPlugins.onSchedule(onSchedule);
        if (this.c instanceof ScheduledExecutorService) {
            try {
                final ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(onSchedule);
                scheduledDirectTask.setFuture(((ScheduledExecutorService)this.c).schedule((Callable<Object>)scheduledDirectTask, n, timeUnit));
                return (df2.a)scheduledDirectTask;
            }
            catch (final RejectedExecutionException ex) {
                RxJavaPlugins.onError((Throwable)ex);
                return (df2.a)EmptyDisposable.INSTANCE;
            }
        }
        final DelayedRunnable delayedRunnable = new DelayedRunnable(onSchedule);
        delayedRunnable.timed.replace(ExecutorScheduler.d.d((Runnable)new ExecutorScheduler.ExecutorScheduler$a(this, delayedRunnable), n, timeUnit));
        return (df2.a)delayedRunnable;
    }
    
    public final df2.a e(Runnable onSchedule, final long n, final long n2, final TimeUnit timeUnit) {
        if (this.c instanceof ScheduledExecutorService) {
            onSchedule = RxJavaPlugins.onSchedule(onSchedule);
            try {
                final ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(onSchedule);
                scheduledDirectPeriodicTask.setFuture(((ScheduledExecutorService)this.c).scheduleAtFixedRate(scheduledDirectPeriodicTask, n, n2, timeUnit));
                return (df2.a)scheduledDirectPeriodicTask;
            }
            catch (final RejectedExecutionException ex) {
                RxJavaPlugins.onError((Throwable)ex);
                return (df2.a)EmptyDisposable.INSTANCE;
            }
        }
        return super.e(onSchedule, n, n2, timeUnit);
    }
    
    public static final class DelayedRunnable extends AtomicReference<Runnable> implements Runnable, df2.a
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
            Object b = this.get();
            if (b == null) {
                b = Functions.b;
            }
            return (Runnable)b;
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
    
    public static final class ExecutorWorker extends c implements Runnable
    {
        public final boolean f;
        public final Executor g;
        public final MpscLinkedQueue<Runnable> h;
        public volatile boolean i;
        public final AtomicInteger j;
        public final CompositeDisposable k;
        
        public ExecutorWorker(final Executor g, final boolean f) {
            this.j = new AtomicInteger();
            this.k = new CompositeDisposable();
            this.g = g;
            this.h = new MpscLinkedQueue<Runnable>();
            this.f = f;
        }
        
        @Override
        public final df2.a b(Runnable onSchedule) {
            if (this.i) {
                return (df2.a)EmptyDisposable.INSTANCE;
            }
            onSchedule = RxJavaPlugins.onSchedule(onSchedule);
            Runnable runnable;
            if (this.f) {
                runnable = new InterruptibleRunnable(onSchedule, (gf2.a)this.k);
                this.k.add((df2.a)runnable);
            }
            else {
                runnable = new BooleanRunnable(onSchedule);
            }
            this.h.offer(runnable);
            if (this.j.getAndIncrement() == 0) {
                try {
                    this.g.execute(this);
                }
                catch (final RejectedExecutionException ex) {
                    this.i = true;
                    this.h.clear();
                    RxJavaPlugins.onError((Throwable)ex);
                    return (df2.a)EmptyDisposable.INSTANCE;
                }
            }
            return (df2.a)runnable;
        }
        
        @Override
        public final df2.a c(final Runnable runnable, final long n, final TimeUnit timeUnit) {
            if (n <= 0L) {
                return this.b(runnable);
            }
            if (this.i) {
                return (df2.a)EmptyDisposable.INSTANCE;
            }
            final SequentialDisposable sequentialDisposable = new SequentialDisposable();
            final SequentialDisposable sequentialDisposable2 = new SequentialDisposable((df2.a)sequentialDisposable);
            final ScheduledRunnable scheduledRunnable = new ScheduledRunnable((Runnable)new ExecutorWorker.ExecutorScheduler$ExecutorWorker$a(this, sequentialDisposable2, RxJavaPlugins.onSchedule(runnable)), (gf2.a)this.k);
            this.k.add((df2.a)scheduledRunnable);
            final Executor g = this.g;
            Label_0151: {
                if (g instanceof ScheduledExecutorService) {
                    try {
                        scheduledRunnable.setFuture(((ScheduledExecutorService)g).schedule((Callable<Object>)scheduledRunnable, n, timeUnit));
                        break Label_0151;
                    }
                    catch (final RejectedExecutionException ex) {
                        this.i = true;
                        RxJavaPlugins.onError((Throwable)ex);
                        return (df2.a)EmptyDisposable.INSTANCE;
                    }
                }
                scheduledRunnable.setFuture((Future<?>)new rf2.a(ExecutorScheduler.d.d((Runnable)scheduledRunnable, n, timeUnit)));
            }
            sequentialDisposable.replace((df2.a)scheduledRunnable);
            return (df2.a)sequentialDisposable2;
        }
        
        public final void dispose() {
            if (!this.i) {
                this.i = true;
                this.k.dispose();
                if (this.j.getAndIncrement() == 0) {
                    this.h.clear();
                }
            }
        }
        
        public final boolean isDisposed() {
            return this.i;
        }
        
        @Override
        public final void run() {
            final MpscLinkedQueue<Runnable> h = this.h;
            int addAndGet = 1;
        Label_0007:
            while (!this.i) {
                do {
                    final Runnable runnable = h.poll();
                    if (runnable == null) {
                        if (this.i) {
                            h.clear();
                            return;
                        }
                        if ((addAndGet = this.j.addAndGet(-addAndGet)) == 0) {
                            return;
                        }
                        continue Label_0007;
                    }
                    else {
                        runnable.run();
                    }
                } while (!this.i);
                h.clear();
                return;
            }
            h.clear();
        }
        
        public static final class BooleanRunnable extends AtomicBoolean implements Runnable, df2.a
        {
            private static final long serialVersionUID = -2421395018820541164L;
            public final Runnable actual;
            
            public BooleanRunnable(final Runnable actual) {
                this.actual = actual;
            }
            
            public void dispose() {
                this.lazySet(true);
            }
            
            public boolean isDisposed() {
                return this.get();
            }
            
            @Override
            public void run() {
                if (this.get()) {
                    return;
                }
                try {
                    this.actual.run();
                }
                finally {
                    this.lazySet(true);
                }
            }
        }
        
        public static final class InterruptibleRunnable extends AtomicInteger implements Runnable, df2.a
        {
            public static final int FINISHED = 2;
            public static final int INTERRUPTED = 4;
            public static final int INTERRUPTING = 3;
            public static final int READY = 0;
            public static final int RUNNING = 1;
            private static final long serialVersionUID = -3603436687413320876L;
            public final Runnable run;
            public final gf2.a tasks;
            public volatile Thread thread;
            
            public InterruptibleRunnable(final Runnable run, final gf2.a tasks) {
                this.run = run;
                this.tasks = tasks;
            }
            
            public void cleanup() {
                final gf2.a tasks = this.tasks;
                if (tasks != null) {
                    tasks.delete((df2.a)this);
                }
            }
            
            public void dispose() {
                while (true) {
                    final int value = this.get();
                    if (value >= 2) {
                        break;
                    }
                    if (value == 0) {
                        if (this.compareAndSet(0, 4)) {
                            this.cleanup();
                            break;
                        }
                        continue;
                    }
                    else {
                        if (this.compareAndSet(1, 3)) {
                            final Thread thread = this.thread;
                            if (thread != null) {
                                thread.interrupt();
                                this.thread = null;
                            }
                            this.set(4);
                            this.cleanup();
                            break;
                        }
                        continue;
                    }
                }
            }
            
            public boolean isDisposed() {
                return this.get() >= 2;
            }
            
            @Override
            public void run() {
                if (this.get() == 0) {
                    this.thread = Thread.currentThread();
                    if (this.compareAndSet(0, 1)) {
                        try {
                            this.run.run();
                            this.thread = null;
                            if (this.compareAndSet(1, 2)) {
                                this.cleanup();
                                return;
                            }
                            while (this.get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                            return;
                        }
                        finally {
                            this.thread = null;
                            if (!this.compareAndSet(1, 2)) {
                                while (this.get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            }
                            else {
                                this.cleanup();
                            }
                        }
                    }
                    this.thread = null;
                }
            }
        }
    }
}
