// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveevent;

import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.covode.number.Covode;

public class LiveEventDummyService implements ILiveEventService
{
    static {
        Covode.recordClassIndex(7007);
    }
    
    @Override
    public Class<? extends LiveRecyclableWidget> getLiveEventDescWidget() {
        return null;
    }
    
    @Override
    public void onInit() {
    }
}
