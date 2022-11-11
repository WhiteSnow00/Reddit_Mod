// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.liveinteract.multiguestv3.widget.MultiGuestV3GuestWidget;
import com.bytedance.android.live.design.app.LiveDialog;

public final class 1YO implements b
{
    public final /* synthetic */ MultiGuestV3GuestWidget LIZ;
    
    static {
        Covode.recordClassIndex(9290);
    }
    
    public 1YO(final MultiGuestV3GuestWidget liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ(final DialogInterface dialogInterface) {
        CTM.LIZ((Object)dialogInterface);
        final DataChannel dataChannel = this.LIZ.dataChannel;
        if (dataChannel != null) {
            dataChannel.LIZJ((Class)2Fr.class, (Object)8sj.LIZ((Object)"others", (Object)10002));
        }
        dialogInterface.dismiss();
    }
}
