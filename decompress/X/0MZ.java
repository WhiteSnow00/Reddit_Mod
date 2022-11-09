// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.Context;
import com.benchmark.bytemonitor.nativePort.ByteMonitorPort;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;
import com.benchmark.bytemonitor.BatteryMonitor;

public class 0Mz
{
    public static BatteryMonitor LIZ;
    
    static {
        Covode.recordClassIndex(2890);
    }
    
    public static void LIZ() {
        MethodCollector.i(12140);
        final BatteryMonitor liz = 0Mz.LIZ;
        if (liz == null) {
            MethodCollector.o(12140);
            return;
        }
        ByteMonitorPort.nativeInit(liz);
        MethodCollector.o(12140);
    }
    
    public static void LIZ(final Context context) {
        MethodCollector.i(12134);
        if (0Mz.LIZ == null) {
            monitorenter(0Mz.class);
            try {
                if (0Mz.LIZ == null) {
                    0Mz.LIZ = new BatteryMonitor(context);
                }
                return;
            }
            finally {
                monitorexit(0Mz.class);
                MethodCollector.o(12134);
            }
        }
        MethodCollector.o(12134);
    }
}
