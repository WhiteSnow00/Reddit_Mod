// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3GuestGoLivePreviewPanelOpt;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.covode.number.Covode;

public final class 0t4
{
    static {
        Covode.recordClassIndex(9099);
    }
    
    public static final boolean LIZ() {
        final 1Uo liz = 1Uo.LJJIJIIJIL.LIZ();
        if (liz != null && 0rF.LIZ(liz.LJJIFFI)) {
            return LIZ(GTi.LIZIZ(DataChannelGlobal.LIZJ));
        }
        final 1Uo liz2 = 1Uo.LJJIJIIJIL.LIZ();
        return liz2 != null && liz2.LJIIIIZZ() && LIZIZ(GTi.LIZIZ(DataChannelGlobal.LIZJ));
    }
    
    public static final boolean LIZ(final Room room) {
        return MultiGuestV3GuestGoLivePreviewPanelOpt.INSTANCE.isSupportPauseGoLiveInPreviewPanel() && !LIZJ(room);
    }
    
    public static final boolean LIZIZ(final Room room) {
        return MultiGuestV3GuestGoLivePreviewPanelOpt.INSTANCE.enableCloseAndPauseAndSilentMicWhenInPreviewPanel() && !LIZJ(room);
    }
    
    public static boolean LIZJ(final Room room) {
        return room == null || room.getHostWebcastSdkVersion() < 2480L;
    }
}
