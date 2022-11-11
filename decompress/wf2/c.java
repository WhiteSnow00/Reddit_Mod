// 
// Decompiled by Procyon v0.6.0
// 

package wf2;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.ScheduledExecutorService;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.FutureTask;
import if2.a;
import java.util.concurrent.Callable;

public final class c implements Callable<Void>, a
{
    public static final FutureTask<Void> k;
    public final Runnable f;
    public final AtomicReference<Future<?>> g;
    public final AtomicReference<Future<?>> h;
    public final ExecutorService i;
    public Thread j;
    
    static {
        k = new FutureTask<Void>(Functions.b, null);
    }
    
    public c(final Runnable f, final ScheduledExecutorService i) {
        this.f = f;
        this.h = new AtomicReference<Future<?>>();
        this.g = new AtomicReference<Future<?>>();
        this.i = i;
    }
    
    public final void a(final Future<?> future) {
        boolean b;
    Label_0077:
        do {
            final Future future2 = this.h.get();
            final FutureTask<Void> k = c.k;
            b = false;
            boolean b2 = false;
            if (future2 == k) {
                if (this.j != Thread.currentThread()) {
                    b2 = true;
                }
                future.cancel(b2);
                return;
            }
            final AtomicReference<Future<?>> h = this.h;
            while (!h.compareAndSet(future2, future)) {
                if (h.get() != future2) {
                    continue Label_0077;
                }
            }
            b = true;
        } while (!b);
    }
    
    @Override
    public final Object call() throws Exception {
        this.j = Thread.currentThread();
        try {
            this.f.run();
            final Future<Object> submit = this.i.submit((Callable<Object>)this);
            boolean b;
        Label_0106:
            do {
                final Future future = this.g.get();
                final FutureTask<Void> k = c.k;
                b = false;
                boolean b2 = false;
                if (future == k) {
                    if (this.j != Thread.currentThread()) {
                        b2 = true;
                    }
                    submit.cancel(b2);
                    break;
                }
                final AtomicReference<Future<?>> g = this.g;
                while (!g.compareAndSet(future, submit)) {
                    if (g.get() != future) {
                        continue Label_0106;
                    }
                }
                b = true;
            } while (!b);
            this.j = null;
        }
        finally {
            this.j = null;
            final Throwable t;
            RxJavaPlugins.onError(t);
        }
        return null;
    }
    
    public final void dispose() {
        final AtomicReference<Future<?>> h = this.h;
        final FutureTask<Void> k = c.k;
        final Future future = h.getAndSet(k);
        final boolean b = true;
        if (future != null && future != k) {
            future.cancel(this.j != Thread.currentThread());
        }
        final Future future2 = this.g.getAndSet(k);
        if (future2 != null && future2 != k) {
            future2.cancel(this.j != Thread.currentThread() && b);
        }
    }
    
    public final boolean isDisposed() {
        return this.h.get() == c.k;
    }
}
