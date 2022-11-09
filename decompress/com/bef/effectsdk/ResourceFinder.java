// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk;

import com.bytedance.covode.number.Covode;

public interface ResourceFinder
{
    default static {
        Covode.recordClassIndex(2807);
    }
    
    long createNativeResourceFinder(final long p0);
    
    void release(final long p0);
}
