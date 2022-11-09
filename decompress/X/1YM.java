// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.content.Context;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.liveinteract.multiguestv3.widget.MultiGuestV3GuestWidget;

public final class 1YM implements 0fW
{
    public final /* synthetic */ MultiGuestV3GuestWidget LIZ;
    
    static {
        Covode.recordClassIndex(9288);
    }
    
    public 1YM(final MultiGuestV3GuestWidget liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ(final View view, final 0fS 0fS, final LiveActionSheetDialog liveActionSheetDialog) {
        CTM.LIZ((Object)view, (Object)0fS, (Object)liveActionSheetDialog);
        liveActionSheetDialog.dismiss();
        final MultiGuestV3GuestWidget liz = this.LIZ;
        final DataChannel dataChannel = liz.dataChannel;
        while (true) {
            Label_0121: {
                if (dataChannel == null) {
                    break Label_0121;
                }
                final Room room = (Room)dataChannel.LIZIZ((Class)G69.class);
                if (room == null) {
                    break Label_0121;
                }
                final User owner = room.getOwner();
                final String liz2 = 0cB.LIZ(2131829540, 0W3.LIZLLL(owner));
                final LiveDialog.a a = new LiveDialog.a((Context)0jz.LIZIZ().getTopActivity());
                a.LIZJ = liz2;
                a.LIZJ(2131830379);
                a.LIZ(2131831463, (LiveDialog.b)new 1YO(liz));
                a.LIZIZ(2131831469, (LiveDialog.b)1YP.LIZ);
                MultiGuestV3GuestWidget.LIZ(a.LIZIZ());
                return;
            }
            final User owner = null;
            continue;
        }
    }
}
