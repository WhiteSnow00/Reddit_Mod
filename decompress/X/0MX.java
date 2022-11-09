// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;

public final class 0Mx
{
    public static 0NT.c LIZ;
    
    static {
        Covode.recordClassIndex(2887);
    }
    
    public static void LIZ(final 0NT.c liz) {
        synchronized (0Mx.class) {
            MethodCollector.i(12444);
            0Mx.LIZ = liz;
            MethodCollector.o(12444);
        }
    }
    
    public static void LIZ(final Throwable t) {
        final 0NT.c liz = 0Mx.LIZ;
        if (liz != null) {
            liz.onException(t);
        }
    }
}
