// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;

public class 0ex
{
    public static volatile 0ex LIZJ;
    public volatile 1Ie LIZ;
    public volatile 1If LIZIZ;
    
    static {
        Covode.recordClassIndex(6010);
    }
    
    public static 0ex LIZ() {
        MethodCollector.i(1210);
        if (0ex.LIZJ == null) {
            monitorenter(0ex.class);
            try {
                if (0ex.LIZJ == null) {
                    0ex.LIZJ = new 0ex();
                }
                monitorexit(0ex.class);
            }
            finally {
                monitorexit(0ex.class);
                MethodCollector.o(1210);
            }
        }
        final 0ex lizj = 0ex.LIZJ;
        MethodCollector.o(1210);
        return lizj;
    }
}
