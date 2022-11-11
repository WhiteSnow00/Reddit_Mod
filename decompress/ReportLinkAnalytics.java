// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.listing;

import com.reddit.domain.model.AnalyticableLink;
import com.reddit.domain.model.Link;
import com.reddit.domain.model.AnalyticableComment;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H&J0\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H&¨\u0006\u000e" }, d2 = { "Lcom/reddit/domain/model/listing/ReportLinkAnalytics;", "", "Lcom/reddit/domain/model/AnalyticableLink;", "thing", "", "source", "action", "noun", "Lpg2/j;", "sendLinkEvent", "Lcom/reddit/domain/model/AnalyticableComment;", "Lcom/reddit/domain/model/Link;", "parentLink", "sendCommentEvent", "model_release" }, k = 1, mv = { 1, 7, 1 })
public interface ReportLinkAnalytics
{
    void sendCommentEvent(final AnalyticableComment p0, final Link p1, final String p2, final String p3, final String p4);
    
    void sendLinkEvent(final AnalyticableLink p0, final String p1, final String p2, final String p3);
}
