// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import org.json.JSONObject;
import java.util.Map;
import kotlin.jvm.internal.n;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;

public final class 0xx
{
    public static long LIZ;
    public static String LIZIZ;
    public static String LIZJ;
    public static final String LIZLLL;
    
    static {
        Covode.recordClassIndex(10341);
        0xx.LIZIZ = "";
        0xx.LIZJ = "";
        LIZLLL = "MultiLiveGuestEnd";
    }
    
    public static final void LIZ(final String s, final 0k8 0k8, final boolean b) {
        CTM.LIZ((Object)s);
        if (0xx.LIZ > 0L) {
            final HashMap hashMap = new HashMap();
            final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
            if (room != null) {
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                final String idStr = room.getIdStr();
                n.LIZIZ((Object)idStr, "");
                hashMap.put("room_id", idStr);
                hashMap.put("duration", String.valueOf(System.currentTimeMillis() - 0xx.LIZ));
                hashMap.put("live_type", "video_live");
                hashMap.put("connection_over_type", s);
                final User owner = room.getOwner();
                n.LIZIZ((Object)owner, "");
                final FollowInfo followInfo = owner.getFollowInfo();
                n.LIZIZ((Object)followInfo, "");
                hashMap.put("anchor_relationship", String.valueOf(followInfo.getFollowStatus()));
                hashMap.put("guest_invite_type", 0xx.LIZIZ);
                hashMap.put("enter_method", Fwf.LIZ.LIZLLL());
                hashMap.put("enter_from_merge", Fwf.LIZ.LIZ());
                hashMap.put("action_type", Fwf.LIZ.LJFF());
                hashMap.put("layout_setting", 0uW.LIZJ.LIZ(0k8).getFirst());
                hashMap.put("window_setting", 0uW.LIZJ.LIZ(0k8).getSecond());
                String s2;
                if (b) {
                    s2 = "on";
                }
                else {
                    s2 = "off";
                }
                hashMap.put("camera_status", s2);
                hashMap.put("permission_type", 0tO.LIZLLL());
                hashMap.put("link_id", 0xx.LIZJ);
                0uY.LIZ(hashMap);
                0uY.LIZIZ(hashMap);
                0uY.LIZLLL(hashMap);
                0uY.LIZJ(hashMap);
                final Gkn liz = Gkn.LJFF.LIZ("livesdk_guest_connection_over");
                liz.LIZ((Map)hashMap);
                liz.LIZ();
                liz.LIZLLL();
            }
            0xx.LIZ = 0L;
            final JSONObject jsonObject = new JSONObject();
            jsonObject.put("log_name", (Object)"ttlive_multilive_guest_end");
            jsonObject.put("way", (Object)s);
            0ba.LIZ(4, 0xx.LIZLLL, jsonObject.toString());
        }
    }
    
    public static final void LIZ(String s, final String s2) {
        CTM.LIZ((Object)s);
        0xx.LIZ = System.currentTimeMillis();
        0xx.LIZIZ = s;
        s = s2;
        if (s2 == null) {
            s = "";
        }
        0xx.LIZJ = s;
    }
}
