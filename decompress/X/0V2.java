// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.event.UserProfileEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import android.view.View$OnClickListener;

public final class 0v2 implements View$OnClickListener
{
    public final /* synthetic */ LinkPlayerInfo LIZ;
    
    static {
        Covode.recordClassIndex(9603);
    }
    
    public 0v2(final LinkPlayerInfo liz) {
        this.LIZ = liz;
    }
    
    public final void onClick(final View view) {
        final FGP liz = FGP.LIZ();
        final UserProfileEvent userProfileEvent = new UserProfileEvent(this.LIZ.LIZJ);
        userProfileEvent.coHostEnable = false;
        userProfileEvent.linkInRoomEnable = false;
        userProfileEvent.mSource = "guest_connection";
        userProfileEvent.mClickUserPosition = "connection_list";
        liz.LIZ((Object)userProfileEvent);
    }
}
