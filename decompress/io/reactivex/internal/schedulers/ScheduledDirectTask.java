// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.schedulers;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Callable;

public final class ScheduledDirectTask extends AbstractDirectTask implements Callable<Void>
{
    private static final long serialVersionUID = 1811839108042568751L;
    
    public ScheduledDirectTask(final Runnable runnable) {
        super(runnable);
    }
    
    @Override
    public /* bridge */ Object call() throws Exception {
        return this.call();
    }
    
    @Override
    public Void call() throws Exception {
        super.runner = Thread.currentThread();
        try {
            super.runnable.run();
            return null;
        }
        finally {
            ((AtomicReference<FutureTask<Void>>)this).lazySet(AbstractDirectTask.FINISHED);
            super.runner = null;
        }
    }
    
    @Override
    public /* bridge */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }
}
