// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.queuebadging;

import com.reddit.domain.model.Link;
import pj2.e;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\bf\u0018\u00002\u00020\u0001:\u0001\u0014J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&R\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0013\u001a\u00020\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/modtools/queuebadging/ModQueueBadgingRepository;", "", "Lcom/reddit/domain/model/Link;", "link", "Lpg2/j;", "setLastViewedLink", "markViewed", "", "isMod", "triggerUpdate", "Lpj2/e;", "", "getPendingQueueCount", "()Lpj2/e;", "pendingQueueCount", "getReadyForUpdate", "()Z", "setReadyForUpdate", "(Z)V", "readyForUpdate", "FirstViewedLinkIdProvider", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public interface ModQueueBadgingRepository
{
    e<String> getPendingQueueCount();
    
    boolean getReadyForUpdate();
    
    void markViewed();
    
    void setLastViewedLink(final Link p0);
    
    void setReadyForUpdate(final boolean p0);
    
    void triggerUpdate(final boolean p0);
    
    @Metadata(d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u0004" }, d2 = { "Lcom/reddit/domain/modtools/queuebadging/ModQueueBadgingRepository$FirstViewedLinkIdProvider;", "", "getFirstViewedLink", "Lcom/reddit/domain/model/Link;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public interface FirstViewedLinkIdProvider
    {
        Link getFirstViewedLink();
    }
}
