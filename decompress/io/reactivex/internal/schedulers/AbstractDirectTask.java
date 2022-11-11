// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.schedulers;

import io.reactivex.internal.functions.Functions;
import java.util.concurrent.FutureTask;
import if2.a;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

abstract class AbstractDirectTask extends AtomicReference<Future<?>> implements a
{
    public static final FutureTask<Void> DISPOSED;
    public static final FutureTask<Void> FINISHED;
    private static final long serialVersionUID = 1811839108042568751L;
    public final Runnable runnable;
    public Thread runner;
    
    static {
        final Functions.r b = Functions.b;
        FINISHED = new FutureTask<Void>(b, null);
        DISPOSED = new FutureTask<Void>(b, null);
    }
    
    public AbstractDirectTask(final Runnable runnable) {
        this.runnable = runnable;
    }
    
    public final void dispose() {
        final Future future = ((AtomicReference<Future>)this).get();
        if (future != AbstractDirectTask.FINISHED) {
            final FutureTask<Void> disposed = AbstractDirectTask.DISPOSED;
            if (future != disposed && ((AtomicReference<FutureTask>)this).compareAndSet(future, disposed) && future != null) {
                future.cancel(this.runner != Thread.currentThread());
            }
        }
    }
    
    public Runnable getWrappedRunnable() {
        return this.runnable;
    }
    
    public final boolean isDisposed() {
        final Future future = ((AtomicReference<Future>)this).get();
        return future == AbstractDirectTask.FINISHED || future == AbstractDirectTask.DISPOSED;
    }
    
    public final void setFuture(final Future<?> future) {
        Future future2;
        do {
            future2 = ((AtomicReference<Future>)this).get();
            if (future2 == AbstractDirectTask.FINISHED) {
                break;
            }
            if (future2 == AbstractDirectTask.DISPOSED) {
                future.cancel(this.runner != Thread.currentThread());
                break;
            }
        } while (!((AtomicReference<Future>)this).compareAndSet(future2, future));
    }
}
