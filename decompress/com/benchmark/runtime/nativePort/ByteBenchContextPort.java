// 
// Decompiled by Procyon v0.6.0
// 

package com.benchmark.runtime.nativePort;

import com.bytedance.covode.number.Covode;

public class ByteBenchContextPort
{
    static {
        Covode.recordClassIndex(3001);
    }
    
    public native void native_init(final long p0);
}
