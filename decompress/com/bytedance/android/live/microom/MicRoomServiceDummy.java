// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.microom;

import java.util.HashMap;
import java.util.Map;
import X.CTM;
import androidx.fragment.app.DialogFragment;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import android.content.Context;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.covode.number.Covode;

public class MicRoomServiceDummy implements IMicRoomService
{
    static {
        Covode.recordClassIndex(10415);
    }
    
    @Override
    public String getEnterFromMerge() {
        return "";
    }
    
    @Override
    public String getEnterMethod() {
        return "";
    }
    
    @Override
    public Class<? extends LiveRecyclableWidget> getMicRoomAnchorTimeControlWidget() {
        return null;
    }
    
    @Override
    public Class<? extends LiveRecyclableWidget> getMicRoomAudienceEnterWidget() {
        return null;
    }
    
    @Override
    public Class<? extends LiveRecyclableWidget> getMicRoomAudienceExitWidget() {
        return null;
    }
    
    @Override
    public Class<? extends LiveRecyclableWidget> getMicRoomBackupTipsWidget() {
        return null;
    }
    
    @Override
    public DialogFragment getMicRoomUserInfoDialog(final Context context, final boolean b, final long n, final Room room, final User user, final String s, final UserProfileEvent userProfileEvent) {
        CTM.LIZ((Object)context);
        return null;
    }
    
    @Override
    public Class<? extends LiveRecyclableWidget> getMicRoomUserInfoWidget() {
        return null;
    }
    
    @Override
    public Map<String, String> getRoomInfo() {
        return new HashMap<String, String>();
    }
    
    @Override
    public boolean isBackUpRoom(final Room room) {
        return false;
    }
    
    @Override
    public boolean isMicAudience() {
        return false;
    }
    
    @Override
    public boolean isMicAudienceForRoom(final Room room) {
        return false;
    }
    
    @Override
    public boolean isMicRoom() {
        return false;
    }
    
    @Override
    public boolean isMicRoomForAnchorNow() {
        return false;
    }
    
    @Override
    public boolean isMicRoomForCurrentRoom() {
        return false;
    }
    
    @Override
    public boolean isMicRoomForRoom(final Room room) {
        return false;
    }
    
    @Override
    public void jumpRoom(final long n, final long n2, final boolean b) {
    }
    
    @Override
    public void jumpRoom(final long n, final boolean b) {
    }
    
    @Override
    public void onInit() {
    }
}
