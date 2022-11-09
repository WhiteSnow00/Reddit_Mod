// 
// Decompiled by Procyon v0.6.0
// 

package com.benchmark.runtime.nativePort;

import com.bytedance.covode.number.Covode;

public class BXStrategyManagePort
{
    static {
        Covode.recordClassIndex(3000);
    }
    
    private native void native_releaseByteBenchStrategy(final int p0);
    
    public native void native_createBenchStrategy(final int p0);
}
