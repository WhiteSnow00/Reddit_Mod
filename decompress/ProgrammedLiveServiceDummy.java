// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.programmedlive;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.covode.number.Covode;

public class ProgrammedLiveServiceDummy implements IProgrammedLiveService
{
    static {
        Covode.recordClassIndex(10611);
    }
    
    @Override
    public Class<? extends LiveRecyclableWidget> getProgrammedLiveFollowCardWidget() {
        return null;
    }
    
    @Override
    public Class<? extends LiveRecyclableWidget> getProgrammedLiveMenuWidget() {
        return null;
    }
    
    @Override
    public LiveRecyclableWidget getProgrammedLiveOnlineAudienceWidget(final boolean b) {
        return null;
    }
    
    @Override
    public Class<? extends LiveRecyclableWidget> getProgrammedLiveTitleWidget() {
        return null;
    }
    
    @Override
    public Class<? extends LiveRecyclableWidget> getProgrammedLiveUserInfoWidget() {
        return null;
    }
    
    @Override
    public boolean isProgrammedLiveForCurrentRoom() {
        return false;
    }
    
    public boolean isProgrammedLiveRoom(final Room room) {
        return false;
    }
    
    @Override
    public void onInit() {
    }
}
