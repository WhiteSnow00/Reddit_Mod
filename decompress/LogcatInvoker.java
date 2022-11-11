// 
// Decompiled by Procyon v0.6.0
// 

package com.benchmark.port.nativePort;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import X.1CR;
import com.bytedance.covode.number.Covode;

public class LogcatInvoker
{
    static {
        Covode.recordClassIndex(2988);
        1CR.LIZ();
        if (!1CR.LIZ) {
            1CR.LIZ();
        }
    }
    
    public static void LIZ(final byte b) {
        MethodCollector.i(10923);
        if (1CR.LIZ) {
            nativeSetLogLevel(b);
        }
        MethodCollector.o(10923);
    }
    
    public static native void nativeSetLogLevel(final byte p0);
}
