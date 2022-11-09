// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Map;
import com.bytedance.covode.number.Covode;

public final class 0xk
{
    static {
        Covode.recordClassIndex(10326);
    }
    
    public static final Map<String, String> LIZ(final Map<String, String> map) {
        CTM.LIZ((Object)map);
        final Room liziz = GTi.LIZIZ(DataChannelGlobal.LIZJ);
        final GIK liziz2 = Fk2.LIZ().LIZIZ();
        Long value;
        if (liziz2 != null) {
            value = liziz2.LIZJ();
        }
        else {
            value = null;
        }
        final String s = "";
        String idStr;
        if (liziz == null || (idStr = liziz.getIdStr()) == null) {
            idStr = "";
        }
        final 8si liz = 8sj.LIZ((Object)"room_id", (Object)idStr);
        String value2;
        if (liziz == null || (value2 = String.valueOf(liziz.getOwnerUserId())) == null) {
            value2 = "";
        }
        final 8si liz2 = 8sj.LIZ((Object)"anchor_id", (Object)value2);
        String value3 = s;
        if (value != null) {
            value3 = String.valueOf((long)value);
            if (value3 == null) {
                value3 = s;
            }
        }
        map.putAll(FJ3.LIZIZ(new 8si[] { liz, liz2, 8sj.LIZ((Object)"guest_id", (Object)value3) }));
        return map;
    }
    
    public static final Map<String, String> LIZIZ(final Map<String, String> map) {
        CTM.LIZ((Object)map);
        final 8si<String, String> liz = 0uW.LIZJ.LIZ(0sD.LIZJ.LIZ().LJIIIIZZ());
        map.putAll(FJ3.LIZIZ(new 8si[] { 8sj.LIZ((Object)"layout_setting", liz.getFirst()), 8sj.LIZ((Object)"window_setting", liz.getSecond()) }));
        return map;
    }
}
