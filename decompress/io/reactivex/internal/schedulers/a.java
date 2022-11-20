// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.schedulers;

import rf2.f;
import io.reactivex.disposables.CompositeDisposable;
import gf2.b;
import rf2.c;
import java.io.Serializable;
import java.util.concurrent.RejectedExecutionException;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;
import af2.b0;

public final class a extends b0
{
    public static final a$b c;
    public static final RxThreadFactory d;
    public static final int e;
    public static final a$c f;
    public final AtomicReference<a$b> b;
    
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
        ((f)(f = new a$c((ThreadFactory)new RxThreadFactory("RxComputationShutdown")))).dispose();
        final a$c[] b = (c = new a$b(0, (ThreadFactory)(d = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5))), true)))).b;
        for (int length = b.length, i = n; i < length; ++i) {
            ((f)b[i]).dispose();
        }
    }
    
    public a() {
        this((ThreadFactory)a.d);
    }
    
    public a(final ThreadFactory threadFactory) {
        final a$b c = a.c;
        final AtomicReference b = new AtomicReference<a$b>(c);
        this.b = (AtomicReference<a$b>)b;
        final a$b a$b = new a$b(a.e, threadFactory);
        while (true) {
            do {
                final boolean compareAndSet = b.compareAndSet(c, a$b);
                final int n = 0;
                if (compareAndSet) {
                    final boolean b2 = true;
                    if (!b2) {
                        final a$c[] b3 = a$b.b;
                        for (int length = b3.length, i = n; i < length; ++i) {
                            ((f)b3[i]).dispose();
                        }
                    }
                    return;
                }
            } while (b.get() == c);
            final boolean b2 = false;
            continue;
        }
    }
    
    public final b0.c a() {
        return new a(this.b.get().a());
    }
    
    public final a d(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        final a$c a = this.b.get().a();
        a.getClass();
        final ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(RxJavaPlugins.onSchedule(runnable));
        while (true) {
            if (n <= 0L) {
                Serializable instance;
                try {
                    Object future = ((f)a).f.submit((Callable<V>)scheduledDirectTask);
                    while (true) {
                        scheduledDirectTask.setFuture((Future<?>)future);
                        instance = scheduledDirectTask;
                        return (a)instance;
                        future = ((f)a).f.schedule((Callable<T>)scheduledDirectTask, n, timeUnit);
                        continue;
                    }
                }
                catch (final RejectedExecutionException ex) {
                    RxJavaPlugins.onError((Throwable)ex);
                    instance = EmptyDisposable.INSTANCE;
                }
                return (a)instance;
            }
            continue;
        }
    }
    
    public final a e(Runnable onSchedule, final long n, final long n2, final TimeUnit timeUnit) {
        final a$c a = this.b.get().a();
        a.getClass();
        onSchedule = RxJavaPlugins.onSchedule(onSchedule);
        Object o2 = null;
        if (n2 <= 0L) {
            final c c = new c(onSchedule, ((f)a).f);
            Label_0070: {
                if (n > 0L) {
                    break Label_0070;
                }
                try {
                    Object o = ((f)a).f.submit((Callable<V>)c);
                    while (true) {
                        c.a((Future)o);
                        o2 = c;
                        return (a)o2;
                        o = ((f)a).f.schedule((Callable<T>)c, n, timeUnit);
                        continue;
                    }
                }
                catch (final RejectedExecutionException ex) {
                    RxJavaPlugins.onError((Throwable)ex);
                    o2 = EmptyDisposable.INSTANCE;
                }
            }
        }
        else {
            o2 = new ScheduledDirectPeriodicTask(onSchedule);
            try {
                ((AbstractDirectTask)o2).setFuture(((f)a).f.scheduleAtFixedRate((Runnable)o2, n, n2, timeUnit));
            }
            catch (final RejectedExecutionException ex2) {
                RxJavaPlugins.onError((Throwable)ex2);
                o2 = EmptyDisposable.INSTANCE;
            }
        }
        return (a)o2;
    }
    
    public static final class a extends c
    {
        public final b f;
        public final CompositeDisposable g;
        public final b h;
        public final a$c i;
        public volatile boolean j;
        
        public a(final a$c i) {
            this.i = i;
            final b f = new b();
            this.f = f;
            final CompositeDisposable g = new CompositeDisposable();
            this.g = g;
            final b h = new b();
            (this.h = h).add((df2.a)f);
            h.add((df2.a)g);
        }
        
        @Override
        public final df2.a b(final Runnable runnable) {
            if (this.j) {
                return (df2.a)EmptyDisposable.INSTANCE;
            }
            return (df2.a)((f)this.i).e(runnable, 0L, TimeUnit.MILLISECONDS, (gf2.a)this.f);
        }
        
        @Override
        public final df2.a c(final Runnable runnable, final long n, final TimeUnit timeUnit) {
            if (this.j) {
                return (df2.a)EmptyDisposable.INSTANCE;
            }
            return (df2.a)((f)this.i).e(runnable, n, timeUnit, (gf2.a)this.g);
        }
        
        public final void dispose() {
            if (!this.j) {
                this.j = true;
                this.h.dispose();
            }
        }
        
        public final boolean isDisposed() {
            return this.j;
        }
    }
}
