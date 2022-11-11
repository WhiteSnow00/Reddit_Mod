// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveevent;

import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface ILiveEventService extends 0Vq
{
    default static {
        Covode.recordClassIndex(7006);
    }
    
    Class<? extends LiveRecyclableWidget> getLiveEventDescWidget();
}
