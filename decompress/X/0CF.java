// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Looper;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;
import android.os.Handler;

public class 0cf
{
    public static Handler LIZ;
    
    static {
        Covode.recordClassIndex(5746);
    }
    
    public static Handler LIZ() {
        MethodCollector.i(9912);
        if (0cf.LIZ == null) {
            monitorenter(0cf.class);
            try {
                if (0cf.LIZ == null) {
                    0cf.LIZ = new Handler(Looper.getMainLooper());
                }
                monitorexit(0cf.class);
            }
            finally {
                monitorexit(0cf.class);
                MethodCollector.o(9912);
            }
        }
        final Handler liz = 0cf.LIZ;
        MethodCollector.o(9912);
        return liz;
    }
    
    public static void LIZ(final Runnable runnable) {
        if (runnable == null) {
            return;
        }
        LIZ().post(runnable);
    }
    
    public static void LIZ(final Runnable runnable, final long n) {
        LIZ().postDelayed(runnable, Math.max(n, 0L));
    }
}
