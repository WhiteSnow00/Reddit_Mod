// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.event.UserProfileEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import android.view.View$OnClickListener;

public final class 0tz implements View$OnClickListener
{
    public final /* synthetic */ LinkPlayerInfo LIZ;
    public final /* synthetic */ int LIZIZ;
    
    static {
        Covode.recordClassIndex(9416);
    }
    
    public 0tz(final LinkPlayerInfo liz, final int liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final void onClick(final View view) {
        if (this.LIZ.LIZJ == null) {
            return;
        }
        final FGP liz = FGP.LIZ();
        final UserProfileEvent userProfileEvent = new UserProfileEvent(this.LIZ.LIZJ);
        boolean linkInRoomEnable = false;
        userProfileEvent.coHostEnable = false;
        if (this.LIZIZ > 1) {
            linkInRoomEnable = true;
        }
        userProfileEvent.linkInRoomEnable = linkInRoomEnable;
        userProfileEvent.mSource = "guest_connection";
        userProfileEvent.mClickUserPosition = "connection_list";
        liz.LIZ((Object)userProfileEvent);
    }
}
