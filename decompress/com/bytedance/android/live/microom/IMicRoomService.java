// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.microom;

import java.util.Map;
import androidx.fragment.app.DialogFragment;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import android.content.Context;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface IMicRoomService extends 0Vq
{
    default static {
        Covode.recordClassIndex(10413);
    }
    
    String getEnterFromMerge();
    
    String getEnterMethod();
    
    Class<? extends LiveRecyclableWidget> getMicRoomAnchorTimeControlWidget();
    
    Class<? extends LiveRecyclableWidget> getMicRoomAudienceEnterWidget();
    
    Class<? extends LiveRecyclableWidget> getMicRoomAudienceExitWidget();
    
    Class<? extends LiveRecyclableWidget> getMicRoomBackupTipsWidget();
    
    DialogFragment getMicRoomUserInfoDialog(final Context p0, final boolean p1, final long p2, final Room p3, final User p4, final String p5, final UserProfileEvent p6);
    
    Class<? extends LiveRecyclableWidget> getMicRoomUserInfoWidget();
    
    Map<String, String> getRoomInfo();
    
    boolean isBackUpRoom(final Room p0);
    
    boolean isMicAudience();
    
    boolean isMicAudienceForRoom(final Room p0);
    
    boolean isMicRoom();
    
    boolean isMicRoomForAnchorNow();
    
    boolean isMicRoomForCurrentRoom();
    
    boolean isMicRoomForRoom(final Room p0);
    
    void jumpRoom(final long p0, final long p1, final boolean p2);
    
    void jumpRoom(final long p0, final boolean p1);
}
