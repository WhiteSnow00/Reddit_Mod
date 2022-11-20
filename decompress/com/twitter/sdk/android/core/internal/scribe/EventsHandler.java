// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.scribe;

import com.twitter.sdk.android.core.internal.CommonUtils;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;

public abstract class EventsHandler<T> implements EventsStorageListener
{
    public final Context context;
    public final ScheduledExecutorService executor;
    public EventsStrategy<T> strategy;
    
    public EventsHandler(final Context context, final EventsStrategy<T> strategy, final EventsFilesManager eventsFilesManager, final ScheduledExecutorService executor) {
        this.context = context.getApplicationContext();
        this.executor = executor;
        this.strategy = strategy;
        eventsFilesManager.registerRollOverListener((EventsStorageListener)this);
    }
    
    public void disable() {
        this.executeAsync((Runnable)new EventsHandler$4(this));
    }
    
    public void executeAsync(final Runnable runnable) {
        try {
            this.executor.submit(runnable);
        }
        catch (final Exception ex) {
            CommonUtils.logControlledError(this.context, "Failed to submit events task", (Throwable)ex);
        }
    }
    
    public void executeSync(final Runnable runnable) {
        try {
            this.executor.submit(runnable).get();
        }
        catch (final Exception ex) {
            CommonUtils.logControlledError(this.context, "Failed to run events task", (Throwable)ex);
        }
    }
    
    public abstract EventsStrategy<T> getDisabledEventsStrategy();
    
    public void onRollOver(final String s) {
        this.executeAsync((Runnable)new EventsHandler$3(this));
    }
    
    public void recordEventAsync(final T t, final boolean b) {
        this.executeAsync((Runnable)new EventsHandler$1(this, (Object)t, b));
    }
    
    public void recordEventSync(final T t) {
        this.executeSync((Runnable)new EventsHandler$2(this, (Object)t));
    }
}
