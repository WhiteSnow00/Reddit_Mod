// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.schedulers;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Future;
import df2.a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class ScheduledRunnable extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, a
{
    public static final Object ASYNC_DISPOSED;
    public static final Object DONE;
    public static final int FUTURE_INDEX = 1;
    public static final Object PARENT_DISPOSED;
    public static final int PARENT_INDEX = 0;
    public static final Object SYNC_DISPOSED;
    public static final int THREAD_INDEX = 2;
    private static final long serialVersionUID = -6120223772001106981L;
    public final Runnable actual;
    
    static {
        PARENT_DISPOSED = new Object();
        SYNC_DISPOSED = new Object();
        ASYNC_DISPOSED = new Object();
        DONE = new Object();
    }
    
    public ScheduledRunnable(final Runnable actual, final gf2.a a) {
        super(3);
        this.actual = actual;
        ((AtomicReferenceArray<gf2.a>)this).lazySet(0, a);
    }
    
    @Override
    public Object call() {
        this.run();
        return null;
    }
    
    public void dispose() {
        while (true) {
            Future value;
            Object sync_DISPOSED;
            boolean b;
            do {
                value = ((AtomicReferenceArray<Future>)this).get(1);
                if (value != ScheduledRunnable.DONE) {
                    sync_DISPOSED = ScheduledRunnable.SYNC_DISPOSED;
                    if (value != sync_DISPOSED) {
                        final Object async_DISPOSED = ScheduledRunnable.ASYNC_DISPOSED;
                        if (value != async_DISPOSED) {
                            b = (this.get(2) != Thread.currentThread());
                            if (b) {
                                sync_DISPOSED = async_DISPOSED;
                                continue;
                            }
                            continue;
                        }
                    }
                }
                gf2.a value2;
                Object parent_DISPOSED;
                do {
                    value2 = ((AtomicReferenceArray<gf2.a>)this).get(0);
                    if (value2 != ScheduledRunnable.DONE) {
                        parent_DISPOSED = ScheduledRunnable.PARENT_DISPOSED;
                        if (value2 != parent_DISPOSED) {
                            if (value2 != null) {
                                continue;
                            }
                        }
                    }
                    return;
                } while (!((AtomicReferenceArray<gf2.a>)this).compareAndSet(0, value2, parent_DISPOSED));
                value2.delete((a)this);
                return;
            } while (!((AtomicReferenceArray<Future>)this).compareAndSet(1, value, sync_DISPOSED));
            if (value != null) {
                value.cancel(b);
            }
            continue;
        }
    }
    
    public boolean isDisposed() {
        boolean b = false;
        final Object value = this.get(0);
        if (value == ScheduledRunnable.PARENT_DISPOSED || value == ScheduledRunnable.DONE) {
            b = true;
        }
        return b;
    }
    
    @Override
    public void run() {
        ((AtomicReferenceArray<Thread>)this).lazySet(2, Thread.currentThread());
        Label_0025: {
            try {
                this.actual.run();
                break Label_0025;
            }
            finally {
                try {
                    final Throwable t;
                    RxJavaPlugins.onError(t);
                    this.lazySet(2, null);
                    final gf2.a value = ((AtomicReferenceArray<gf2.a>)this).get(0);
                    if (value != ScheduledRunnable.PARENT_DISPOSED && this.compareAndSet(0, value, ScheduledRunnable.DONE) && value != null) {
                        value.delete((a)this);
                    }
                    Object value2;
                    do {
                        value2 = this.get(1);
                    } while (value2 != ScheduledRunnable.SYNC_DISPOSED && value2 != ScheduledRunnable.ASYNC_DISPOSED && !this.compareAndSet(1, value2, ScheduledRunnable.DONE));
                }
                finally {
                    this.lazySet(2, null);
                    final gf2.a value3 = ((AtomicReferenceArray<gf2.a>)this).get(0);
                    if (value3 != ScheduledRunnable.PARENT_DISPOSED && this.compareAndSet(0, value3, ScheduledRunnable.DONE) && value3 != null) {
                        value3.delete((a)this);
                    }
                    Object value4;
                    do {
                        value4 = this.get(1);
                    } while (value4 != ScheduledRunnable.SYNC_DISPOSED && value4 != ScheduledRunnable.ASYNC_DISPOSED && !this.compareAndSet(1, value4, ScheduledRunnable.DONE));
                }
            }
        }
    }
    
    public void setFuture(final Future<?> future) {
        Object value;
        do {
            value = this.get(1);
            if (value == ScheduledRunnable.DONE) {
                return;
            }
            if (value == ScheduledRunnable.SYNC_DISPOSED) {
                future.cancel(false);
                return;
            }
            if (value == ScheduledRunnable.ASYNC_DISPOSED) {
                future.cancel(true);
            }
        } while (!this.compareAndSet(1, value, future));
    }
}
