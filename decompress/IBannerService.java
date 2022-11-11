// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.banner;

import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import X.0CH;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import X.S4L;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface IBannerService extends 0Vq
{
    default static {
        Covode.recordClassIndex(4893);
    }
    
    void addOnBannerVisibilityChangeListener(final long p0, final IBannerService.a p1);
    
    S4L<? extends LiveWidget> broadcastPreviewBannerWidget();
    
    LiveWidget createLiveGoalsWidget();
    
    void enter(final DataChannel p0, final Room p1);
    
    void fetchBanner(final 0CH p0, final long p1, final boolean p2);
    
    Class<? extends LiveRecyclableWidget> getTopRightBannerWidget();
    
    void leave(final DataChannel p0, final Room p1);
    
    boolean shouldShowBanner(final long p0);
}
