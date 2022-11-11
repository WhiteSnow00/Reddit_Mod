// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.n;
import java.util.LinkedHashMap;
import java.util.Map;
import com.bytedance.covode.number.Covode;

public final class 0uY
{
    static {
        Covode.recordClassIndex(9508);
    }
    
    public static final Map<String, String> LIZ() {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final GIK liziz = Fk2.LIZ().LIZIZ();
        n.LIZIZ((Object)liziz, "");
        linkedHashMap.put("guest_id", String.valueOf(liziz.LIZJ()));
        final LLU selfLinkInfo = 0jz.LIZJ().selfLinkInfo();
        final String s = "0";
        String value;
        if (selfLinkInfo == null || (value = String.valueOf(selfLinkInfo.LJ)) == null) {
            value = "0";
        }
        linkedHashMap.put("channel_id", value);
        String s2 = s;
        if (selfLinkInfo != null) {
            final String lizj = selfLinkInfo.LIZJ;
            s2 = s;
            if (lizj != null) {
                lizj.toString();
                s2 = lizj;
            }
        }
        linkedHashMap.put("link_id", s2);
        return linkedHashMap;
    }
    
    public static final Map<String, String> LIZ(final Map<String, String> map) {
        CTM.LIZ((Object)map);
        final LiveEffect lizj = 1NO.LIZ().LIZJ;
        final String s = "0";
        String resourceId;
        if (lizj == null || (resourceId = lizj.getResourceId()) == null) {
            resourceId = "0";
        }
        map.put("sticker_resource_id", resourceId);
        final LiveEffect lizj2 = 1NO.LIZ().LIZJ;
        String value = s;
        if (lizj2 != null) {
            value = String.valueOf(lizj2.effectId);
            if (value == null) {
                value = s;
            }
        }
        map.put("sticker_id", value);
        return map;
    }
    
    public static final Map<String, String> LIZIZ(final Map<String, String> map) {
        CTM.LIZ((Object)map);
        map.put("enhance_level", String.valueOf(1NO.LIZ().LIZIZ));
        return map;
    }
    
    public static final Map<String, String> LIZJ(final Map<String, String> map) {
        CTM.LIZ((Object)map);
        final 1Uo 1Uo = 1jw.LIZ.LIZIZ("MULTI_GUEST_DATA_HOLDER");
        String lizlll;
        if (1Uo != null) {
            lizlll = 1Uo.LIZLLL();
        }
        else {
            lizlll = "";
        }
        map.put("guest_permission", lizlll);
        return map;
    }
    
    public static final Map<String, String> LIZLLL(final Map<String, String> map) {
        CTM.LIZ((Object)map);
        final 1Uo 1Uo = 1jw.LIZ.LIZIZ("MULTI_GUEST_DATA_HOLDER");
        String s;
        if (1Uo != null && 1Uo.LIZ) {
            s = "0";
        }
        else {
            s = "1";
        }
        map.put("is_muted", s);
        return map;
    }
    
    public static final Map<String, String> LJ(final Map<String, String> map) {
        CTM.LIZ((Object)map);
        final 1Uo 1Uo = 1jw.LIZ.LIZIZ("MULTI_GUEST_DATA_HOLDER");
        if (1Uo == null) {
            return map;
        }
        String s;
        if (!1Uo.LIZIZ) {
            s = "off";
        }
        else if (1Uo.LIZLLL) {
            s = "rear_camera";
        }
        else {
            s = "front_camera";
        }
        map.put("camera_setting", s);
        return map;
    }
}
