// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.LinkedHashMap;
import java.util.Map;
import com.bytedance.covode.number.Covode;

public final class 0aX
{
    static {
        Covode.recordClassIndex(5532);
    }
    
    public static final void LIZ(final int n, final String s, final String s2, final String s3, final Map<String, Object> map) {
        map.put("timestamp", System.currentTimeMillis());
        map.put("session_id", s);
        map.put("manager_id", s2);
        map.put("type", s3);
        0d8.LIZ(GGd.LIZ("ttlive_speed_detection_full_chain_service"), n, map);
    }
    
    public static final void LIZ(final String s, final String s2, final int n, final String s3, final String s4) {
        CTM.LIZ((Object)s, (Object)s2, (Object)s3, (Object)s4);
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("interrupt_code", n);
        linkedHashMap.put("interrupt_msg", s3);
        LIZ(-1, s, s2, s4, linkedHashMap);
    }
    
    public static final void LIZ(final String s, final String s2, final long n, final long n2, final String s3, final boolean b, final String s4) {
        CTM.LIZ((Object)s, (Object)s2, (Object)s3, (Object)s4);
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("upload_speed", n);
        linkedHashMap.put("download_speed", n2);
        linkedHashMap.put("suggest_sdk_key", s3);
        linkedHashMap.put("detect_result_network_good", b);
        LIZ(0, s, s2, s4, linkedHashMap);
    }
    
    public static final void LIZ(final String s, final String s2, final String s3) {
        CTM.LIZ((Object)s, (Object)s2, (Object)s3);
        LIZ(-2, s, s2, s3, new LinkedHashMap<String, Object>());
    }
    
    public static final void LIZIZ(final String s, final String s2, final int n, final String s3, final String s4) {
        CTM.LIZ((Object)s, (Object)s2, (Object)s3, (Object)s4);
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("detect_failure_code", n);
        linkedHashMap.put("detect_failure_msg", s3);
        LIZ(1, s, s2, s4, linkedHashMap);
    }
}
