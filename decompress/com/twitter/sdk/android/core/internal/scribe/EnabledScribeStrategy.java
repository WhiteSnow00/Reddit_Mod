// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.scribe;

import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;

class EnabledScribeStrategy extends EnabledEventsStrategy<ScribeEvent>
{
    private final FilesSender filesSender;
    
    public EnabledScribeStrategy(final Context context, final ScheduledExecutorService scheduledExecutorService, final ScribeFilesManager scribeFilesManager, final ScribeConfig scribeConfig, final ScribeFilesSender filesSender) {
        super(context, scheduledExecutorService, (EventsFilesManager)scribeFilesManager);
        this.filesSender = (FilesSender)filesSender;
        this.configureRollover(scribeConfig.sendIntervalSeconds);
    }
    
    public FilesSender getFilesSender() {
        return this.filesSender;
    }
}
