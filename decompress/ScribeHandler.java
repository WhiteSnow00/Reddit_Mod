// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.scribe;

import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;

class ScribeHandler extends EventsHandler<ScribeEvent>
{
    public ScribeHandler(final Context context, final EventsStrategy<ScribeEvent> eventsStrategy, final EventsFilesManager eventsFilesManager, final ScheduledExecutorService scheduledExecutorService) {
        super(context, (EventsStrategy)eventsStrategy, eventsFilesManager, scheduledExecutorService);
    }
    
    public EventsStrategy<ScribeEvent> getDisabledEventsStrategy() {
        return (EventsStrategy<ScribeEvent>)new DisabledEventsStrategy();
    }
    
    public void scribe(final ScribeEvent scribeEvent) {
        this.recordEventAsync((Object)scribeEvent, false);
    }
    
    public void scribeAndFlush(final ScribeEvent scribeEvent) {
        this.recordEventAsync((Object)scribeEvent, true);
    }
}
