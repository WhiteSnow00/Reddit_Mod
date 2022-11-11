// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public final class 0O3
{
    public static String LIZ;
    public static String LIZIZ;
    public static String LIZJ;
    public static String LIZLLL;
    public static String LJ;
    public static String LJFF;
    public static String LJI;
    public static String LJII;
    public static Map<String, Object> LJIIIIZZ;
    public static Map<String, Object> LJIIIZ;
    
    static {
        Covode.recordClassIndex(3939);
        0O3.LIZ = "cn-north-1";
        0O3.LIZIZ = "us-east-1";
        0O3.LIZJ = "ap-singapore-1";
        0O3.LIZLLL = "/vod/settings/v1";
    }
    
    public static Map<String, String> LIZ() {
        return LIZ(0O3.LJIIIIZZ);
    }
    
    public static Map<String, String> LIZ(final Map<String, Object> map) {
        HashMap hashMap2;
        if (map != null && map.size() > 0) {
            final HashMap hashMap = new HashMap();
            final Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
            while (true) {
                hashMap2 = hashMap;
                if (!iterator.hasNext()) {
                    break;
                }
                final Map.Entry entry = iterator.next();
                if (entry.getValue() == null) {
                    continue;
                }
                hashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        else {
            hashMap2 = null;
        }
        return hashMap2;
    }
    
    public static Map<String, String> LIZIZ() {
        return LIZ(0O3.LJIIIZ);
    }
}
