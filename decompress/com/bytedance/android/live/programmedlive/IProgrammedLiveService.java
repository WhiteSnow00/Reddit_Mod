// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.programmedlive;

import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface IProgrammedLiveService extends 0Vq
{
    default static {
        Covode.recordClassIndex(10610);
    }
    
    Class<? extends LiveRecyclableWidget> getProgrammedLiveFollowCardWidget();
    
    Class<? extends LiveRecyclableWidget> getProgrammedLiveMenuWidget();
    
    LiveRecyclableWidget getProgrammedLiveOnlineAudienceWidget(final boolean p0);
    
    Class<? extends LiveRecyclableWidget> getProgrammedLiveTitleWidget();
    
    Class<? extends LiveRecyclableWidget> getProgrammedLiveUserInfoWidget();
    
    boolean isProgrammedLiveForCurrentRoom();
}
