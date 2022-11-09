// 
// Decompiled by Procyon v0.6.0
// 

package com.benchmark.port.nativePort;

import X.0Mu;
import X.0NO;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import X.1CR;
import com.bytedance.covode.number.Covode;

public class ApplogUtilsInvoker
{
    static {
        Covode.recordClassIndex(2987);
        1CR.LIZ();
        if (!1CR.LIZ) {
            1CR.LIZ();
        }
    }
    
    public static void Init() {
        MethodCollector.i(11125);
        if (1CR.LIZ) {
            nativeInit();
        }
        MethodCollector.o(11125);
    }
    
    public static boolean isInSampleList(final String s) {
        s.hashCode();
        switch (s) {
            case "bytebench_strategy_get_operation_result": {
                return true;
            }
            case "bytebench_collection_report_task": {
                return true;
            }
            case "bytebench_strategy_request": {
                return true;
            }
            default:
                break;
        }
        return false;
    }
    
    public static native void nativeInit();
    
    public static void onNativeCallback_onAppLogJson(final String s, final String s2) {
        if (isInSampleList(s) && !0NO.LIZ(s)) {
            return;
        }
        0Mu.LIZ(s, s2);
    }
}
