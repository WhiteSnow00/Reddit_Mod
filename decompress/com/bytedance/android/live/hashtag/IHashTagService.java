// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.hashtag;

import com.bytedance.ies.sdk.widgets.LiveWidget;
import X.S4L;
import X.GOM;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.Layer2PriorityManager;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface IHashTagService extends 0Vq
{
    default static {
        Covode.recordClassIndex(6917);
    }
    
    LiveRecyclableWidget getAnchorHashTagWidget(final Layer2PriorityManager p0);
    
    GOM getAnchorToolbarBehavior();
    
    LiveRecyclableWidget getAudienceHashTagWidget(final Layer2PriorityManager p0);
    
    S4L<? extends LiveWidget> getPreviewHashTagWidgetClass();
}
