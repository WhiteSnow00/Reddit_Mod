// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import kotlin.jvm.internal.n;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

public final class 0k6
{
    static {
        Covode.recordClassIndex(7066);
    }
    
    public static final String LIZ(final Room room) {
        CTM.LIZ((Object)room);
        if (room.getLinkMicInfo() != null) {
            final RoomLinkInfo linkMicInfo = room.getLinkMicInfo();
            n.LIZIZ((Object)linkMicInfo, "");
            if (linkMicInfo.LIZ > 0L && linkMicInfo.LIZIZ > 0L) {
                final BattleInfoResponse lj = linkMicInfo.LJ;
                if (lj == null) {
                    return "anchor";
                }
                final BattleSetting lizj = lj.LIZJ;
                if (lizj == null) {
                    return "anchor";
                }
                final int lj2 = lizj.LJ;
                if (lj2 != 1 && lj2 != 3) {
                    return "anchor";
                }
                return "manual_pk";
                s = "anchor";
                return s;
            }
            if (linkMicInfo.LIZLLL != null && linkMicInfo.LIZLLL.size() > 0) {
                return "audience";
            }
        }
        return "normal";
    }
}
