// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.performance;

import n22.o$a;
import n22.p$a;
import com.reddit.tracking.TrackerParams$TrackerType;
import javax.inject.Inject;
import a2.b;
import ah2.f;
import i22.c;
import android.content.Context;
import n22.p;
import va0.a;

public final class RedditChatInboxPerformanceTracker implements a
{
    public final p a;
    public final Context b;
    public final c c;
    public final String d;
    public RedditChatInboxPerformanceTracker.RedditChatInboxPerformanceTracker$Tracking e;
    
    @Inject
    public RedditChatInboxPerformanceTracker(final p a, final Context b, final c c) {
        f.f((Object)a, "trackingDelegate");
        f.f((Object)b, "context");
        f.f((Object)c, "tracingFeatures");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = a2.b.g("randomUUID().toString()");
        this.e = RedditChatInboxPerformanceTracker.RedditChatInboxPerformanceTracker$Tracking.READY;
    }
    
    public final void start() {
        if (this.e == RedditChatInboxPerformanceTracker.RedditChatInboxPerformanceTracker$Tracking.READY) {
            this.e = RedditChatInboxPerformanceTracker.RedditChatInboxPerformanceTracker$Tracking.IN_PROGRESS;
            p$a.c(this.a, TrackerParams$TrackerType.ChatInbox, "chat_inbox_loading_time", (String)null, this.d, this.b, this.c, 76);
        }
    }
    
    public final void stop() {
        if (this.e == RedditChatInboxPerformanceTracker.RedditChatInboxPerformanceTracker$Tracking.IN_PROGRESS) {
            this.e = RedditChatInboxPerformanceTracker.RedditChatInboxPerformanceTracker$Tracking.FINISHED;
            this.a.a(this.b, this.c, o$a.a(), this.d, false);
        }
    }
}
