// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.schedulers;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.plugins.RxJavaPlugins;

public final class ScheduledDirectPeriodicTask extends AbstractDirectTask implements Runnable
{
    private static final long serialVersionUID = 1811839108042568751L;
    
    public ScheduledDirectPeriodicTask(final Runnable runnable) {
        super(runnable);
    }
    
    @Override
    public /* bridge */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }
    
    @Override
    public void run() {
        super.runner = Thread.currentThread();
        try {
            super.runnable.run();
            super.runner = null;
        }
        finally {
            super.runner = null;
            ((AtomicReference<FutureTask<Void>>)this).lazySet(AbstractDirectTask.FINISHED);
            final Throwable t;
            RxJavaPlugins.onError(t);
        }
    }
}
