// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.scribe;

import android.support.v4.media.a;
import java.util.UUID;
import java.io.IOException;
import com.twitter.sdk.android.core.internal.CurrentTimeProvider;
import android.content.Context;

class ScribeFilesManager extends EventsFilesManager<ScribeEvent>
{
    public static final String FILE_EXTENSION = ".tap";
    public static final String FILE_PREFIX = "se";
    
    public ScribeFilesManager(final Context context, final EventTransform<ScribeEvent> eventTransform, final CurrentTimeProvider currentTimeProvider, final QueueFileEventStorage queueFileEventStorage, final int n) throws IOException {
        super(context, (EventTransform)eventTransform, currentTimeProvider, (EventsStorage)queueFileEventStorage, n);
    }
    
    public String generateUniqueRollOverFileName() {
        final UUID randomUUID = UUID.randomUUID();
        final StringBuilder q = a.q("se", "_");
        q.append(randomUUID.toString());
        q.append("_");
        q.append(super.currentTimeProvider.getCurrentTimeMillis());
        q.append(".tap");
        return q.toString();
    }
}
