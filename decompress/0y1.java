// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Map;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;

public final class 0y1
{
    public static String LIZ;
    public static final 0y1 LIZIZ;
    
    static {
        Covode.recordClassIndex(10354);
        LIZIZ = new 0y1();
        0y1.LIZ = "";
    }
    
    public static final void LIZ(final int n, final 0k8 0k8, final String s) {
        CTM.LIZ((Object)s);
        final HashMap hashMap = new HashMap();
        final 0y1 liziz = 0y1.LIZIZ;
        liziz.LIZ(hashMap);
        hashMap.put("enter_from", 0y1.LIZ);
        hashMap.put("guest_cnt", String.valueOf(n));
        hashMap.put("layout_setting", 0uW.LIZJ.LIZ(0k8).getFirst());
        hashMap.put("window_setting", 0uW.LIZJ.LIZ(0k8).getSecond());
        hashMap.put("tab_page", s);
        liziz.LIZ("livesdk_anchor_guest_connection_invite_list_show", hashMap);
    }
    
    public static final void LIZ(final long n, final 0k8 0k8, final int n2) {
        final HashMap hashMap = new HashMap();
        final 0y1 liziz = 0y1.LIZIZ;
        liziz.LIZ(hashMap);
        hashMap.put("enter_from", 0y1.LIZ);
        hashMap.put("guest_id", String.valueOf(n));
        hashMap.put("layout_setting", 0uW.LIZJ.LIZ(0k8).getFirst());
        hashMap.put("window_setting", 0uW.LIZJ.LIZ(0k8).getSecond());
        hashMap.put("rank", String.valueOf(n2));
        liziz.LIZ("livesdk_anchor_guest_connection_invite_show", hashMap);
    }
    
    public static final void LIZ(final String liz) {
        CTM.LIZ((Object)liz);
        0y1.LIZ = liz;
    }
    
    public final void LIZ(final String s, final Map<String, String> map) {
        final Gkn liz = Gkn.LJFF.LIZ(s);
        liz.LIZ();
        liz.LIZ((Map)map);
        liz.LIZLLL();
    }
    
    public final void LIZ(final Map<String, String> map) {
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            final String idStr = room.getIdStr();
            n.LIZIZ((Object)idStr, "");
            map.put("room_id", idStr);
            map.put("enter_method", Fwf.LIZ.LIZLLL());
            map.put("enter_from_merge", Fwf.LIZ.LIZ());
            map.put("action_type", Fwf.LIZ.LJFF());
        }
    }
}
