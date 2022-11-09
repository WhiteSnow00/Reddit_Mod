// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.hashtag;

import X.S4L;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import X.GOM;
import X.CTM;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.Layer2PriorityManager;
import com.bytedance.covode.number.Covode;

public class HashTagServiceDummy implements IHashTagService
{
    static {
        Covode.recordClassIndex(6916);
    }
    
    @Override
    public LiveRecyclableWidget getAnchorHashTagWidget(final Layer2PriorityManager layer2PriorityManager) {
        CTM.LIZ((Object)layer2PriorityManager);
        return null;
    }
    
    @Override
    public GOM getAnchorToolbarBehavior() {
        return null;
    }
    
    @Override
    public LiveRecyclableWidget getAudienceHashTagWidget(final Layer2PriorityManager layer2PriorityManager) {
        CTM.LIZ((Object)layer2PriorityManager);
        return null;
    }
    
    public LiveWidget getPreviewHashTagWidget() {
        return null;
    }
    
    @Override
    public S4L<? extends LiveWidget> getPreviewHashTagWidgetClass() {
        return null;
    }
    
    @Override
    public void onInit() {
    }
}
