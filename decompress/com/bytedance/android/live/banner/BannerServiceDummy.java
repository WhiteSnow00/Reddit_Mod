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
import X.CTM;
import com.bytedance.covode.number.Covode;

public class BannerServiceDummy implements IBannerService
{
    static {
        Covode.recordClassIndex(4892);
    }
    
    public void addOnBannerVisibilityChangeListener(final long n, final a a) {
        CTM.LIZ((Object)a);
    }
    
    @Override
    public S4L<? extends LiveWidget> broadcastPreviewBannerWidget() {
        return null;
    }
    
    @Override
    public LiveWidget createLiveGoalsWidget() {
        return null;
    }
    
    @Override
    public void enter(final DataChannel dataChannel, final Room room) {
    }
    
    @Override
    public void fetchBanner(final 0CH 0ch, final long n, final boolean b) {
    }
    
    @Override
    public Class<? extends LiveRecyclableWidget> getTopRightBannerWidget() {
        return null;
    }
    
    @Override
    public void leave(final DataChannel dataChannel, final Room room) {
    }
    
    @Override
    public void onInit() {
    }
    
    @Override
    public boolean shouldShowBanner(final long n) {
        return false;
    }
    
    public boolean shouldShowBanner(final Room room) {
        return false;
    }
}
