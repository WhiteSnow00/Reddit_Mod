// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;

public class 0c3
{
    public static 0c3 LIZIZ;
    public final ConcurrentHashMap<String, Integer> LIZ;
    
    static {
        Covode.recordClassIndex(5691);
    }
    
    public 0c3() {
        this.LIZ = new ConcurrentHashMap<String, Integer>();
    }
    
    public static 0c3 LIZ() {
        MethodCollector.i(10060);
        final 0c3 liziz = 0c3.LIZIZ;
        if (liziz != null) {
            MethodCollector.o(10060);
            return liziz;
        }
        monitorenter(0c3.class);
        try {
            if (0c3.LIZIZ == null) {
                0c3.LIZIZ = new 0c3();
            }
            monitorexit(0c3.class);
            final 0c3 liziz2 = 0c3.LIZIZ;
            MethodCollector.o(10060);
            return liziz2;
        }
        finally {
            monitorexit(0c3.class);
            MethodCollector.o(10060);
        }
    }
}
