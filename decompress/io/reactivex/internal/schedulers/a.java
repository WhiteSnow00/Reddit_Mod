// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.schedulers;

import wf2.f;
import wf2.c;
import java.util.concurrent.RejectedExecutionException;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;
import ff2.b0;

public final class a extends b0
{
    public static final b c;
    public static final RxThreadFactory d;
    public static final int e;
    public static final c f;
    public final AtomicReference<b> b;
    
    static {
        final int availableProcessors = Runtime.getRuntime().availableProcessors();
        final int n = 0;
        final int intValue = Integer.getInteger("rx2.computation-threads", 0);
        int e2 = availableProcessors;
        if (intValue > 0) {
            if (intValue > availableProcessors) {
                e2 = availableProcessors;
            }
            else {
                e2 = intValue;
            }
        }
        e = e2;
        (f = new c(new RxThreadFactory("RxComputationShutdown"))).dispose();
        final c[] b = (c = new b(0, d = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5))), true))).b;
        for (int length = b.length, i = n; i < length; ++i) {
            b[i].dispose();
        }
    }
    
    public a() {
        this(a.d);
    }
    
    public a(final ThreadFactory threadFactory) {
        final b c = a.c;
        final AtomicReference b = new AtomicReference<b>(c);
        this.b = (AtomicReference<b>)b;
        final b b2 = new b(a.e, threadFactory);
        while (true) {
            do {
                final boolean compareAndSet = b.compareAndSet(c, b2);
                final int n = 0;
                if (compareAndSet) {
                    final boolean b3 = true;
                    if (!b3) {
                        final c[] b4 = b2.b;
                        for (int length = b4.length, i = n; i < length; ++i) {
                            b4[i].dispose();
                        }
                    }
                    return;
                }
            } while (b.get() == c);
            final boolean b3 = false;
            continue;
        }
    }
    
    public final b0.c a() {
        return (b0.c)new a.a$a(this.b.get().a());
    }
    
    public final if2.a d(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        final c a = this.b.get().a();
        a.getClass();
        final ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(RxJavaPlugins.onSchedule(runnable));
        while (true) {
            if (n <= 0L) {
                Object instance;
                try {
                    Object future = a.f.submit((Callable<V>)scheduledDirectTask);
                    while (true) {
                        ((AbstractDirectTask)scheduledDirectTask).setFuture((Future<?>)future);
                        instance = scheduledDirectTask;
                        return (if2.a)instance;
                        future = a.f.schedule((Callable<T>)scheduledDirectTask, n, timeUnit);
                        continue;
                    }
                }
                catch (final RejectedExecutionException ex) {
                    RxJavaPlugins.onError(ex);
                    instance = EmptyDisposable.INSTANCE;
                }
                return (if2.a)instance;
            }
            continue;
        }
    }
    
    public final if2.a e(Runnable onSchedule, final long n, final long n2, final TimeUnit timeUnit) {
        final c a = this.b.get().a();
        a.getClass();
        onSchedule = RxJavaPlugins.onSchedule(onSchedule);
        Object o2 = null;
        if (n2 <= 0L) {
            final wf2.c c = new wf2.c(onSchedule, a.f);
            Label_0070: {
                if (n > 0L) {
                    break Label_0070;
                }
                try {
                    Object o = a.f.submit((Callable<V>)c);
                    while (true) {
                        c.a((Future<?>)o);
                        o2 = c;
                        return (if2.a)o2;
                        o = a.f.schedule((Callable<T>)c, n, timeUnit);
                        continue;
                    }
                }
                catch (final RejectedExecutionException ex) {
                    RxJavaPlugins.onError(ex);
                    o2 = EmptyDisposable.INSTANCE;
                }
            }
        }
        else {
            o2 = new ScheduledDirectPeriodicTask(onSchedule);
            try {
                ((AbstractDirectTask)o2).setFuture(a.f.scheduleAtFixedRate((Runnable)o2, n, n2, timeUnit));
            }
            catch (final RejectedExecutionException ex2) {
                RxJavaPlugins.onError(ex2);
                o2 = EmptyDisposable.INSTANCE;
            }
        }
        return (if2.a)o2;
    }
    
    public static final class b
    {
        public final int a;
        public final c[] b;
        public long c;
        
        public b(final int a, final ThreadFactory threadFactory) {
            this.a = a;
            this.b = new c[a];
            for (int i = 0; i < a; ++i) {
                this.b[i] = new c(threadFactory);
            }
        }
        
        public final c a() {
            final int a = this.a;
            if (a == 0) {
                return io.reactivex.internal.schedulers.a.f;
            }
            final c[] b = this.b;
            final long c = this.c;
            this.c = 1L + c;
            return b[(int)(c % a)];
        }
    }
    
    public static final class c extends f
    {
        public c(final ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }
}
