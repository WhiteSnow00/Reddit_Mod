// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.covode.number.Covode;

public final class 0t1
{
    public static final 0t1 LIZ;
    
    static {
        Covode.recordClassIndex(9091);
        LIZ = new 0t1();
    }
    
    public final void LIZ(final String s, final DataChannel dataChannel) {
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_live_nearby_devices_popup_click");
        liz.LIZ(dataChannel);
        liz.LIZ("live_type", "video_live");
        liz.LIZ("toast_type", "multi_guest");
        liz.LIZ("btn_type", s);
        liz.LIZLLL();
    }
}
