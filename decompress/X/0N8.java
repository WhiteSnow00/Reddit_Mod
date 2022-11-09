// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.LinkedHashMap;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public class 0N8
{
    public static volatile 0N8 LIZJ;
    public 7A7 LIZ;
    public String LIZIZ;
    public volatile Map<String, String> LIZLLL;
    
    static {
        Covode.recordClassIndex(2972);
    }
    
    public static 0N8 LIZ() {
        synchronized (0N8.class) {
            MethodCollector.i(12451);
            if (0N8.LIZJ == null) {
                0N8.LIZJ = new 0N8();
            }
            final 0N8 lizj = 0N8.LIZJ;
            MethodCollector.o(12451);
            return lizj;
        }
    }
    
    public final boolean LIZ(final String s, final String s2, final String s3) {
        try {
            return 70E.LIZ(s, s2, s3);
        }
        catch (final Exception ex) {
            return false;
        }
    }
    
    public final Map<String, String> LIZIZ() {
        MethodCollector.i(13241);
        if (this.LIZLLL == null) {
            monitorenter(0N8.class);
            try {
                if (this.LIZLLL == null) {
                    final LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("sdk_version", "4.6.0-mt_5");
                    linkedHashMap.put("device_type", 0NJ.LJIILJJIL.LIZIZ);
                    linkedHashMap.put("device_platform", "android");
                    linkedHashMap.put("status", String.valueOf(0NJ.LJIILJJIL.LIZJ));
                    linkedHashMap.put("aid", String.valueOf(0NJ.LJIILJJIL.LIZLLL));
                    linkedHashMap.put("app_name", 0NJ.LJIILJJIL.LJ);
                    linkedHashMap.put("app_version", 0NJ.LJIILJJIL.LJFF);
                    linkedHashMap.put("update_version_code", String.valueOf(0NJ.LJIILJJIL.LJI));
                    linkedHashMap.put("device_id", 0NJ.LJIILJJIL.LJII);
                    linkedHashMap.put("user_id", 0NJ.LJIILJJIL.LJIIIIZZ);
                    linkedHashMap.put("net_status", 0My.LIZ());
                    this.LIZLLL = new LinkedHashMap<String, String>(linkedHashMap);
                }
                monitorexit(0N8.class);
            }
            finally {
                monitorexit(0N8.class);
                MethodCollector.o(13241);
            }
        }
        final Map<String, String> lizlll = this.LIZLLL;
        MethodCollector.o(13241);
        return lizlll;
    }
}
