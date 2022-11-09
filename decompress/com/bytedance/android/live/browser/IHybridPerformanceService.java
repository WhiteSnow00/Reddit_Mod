// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.browser;

import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface IHybridPerformanceService extends 0Vq
{
    default static {
        Covode.recordClassIndex(5582);
    }
    
    void preload();
    
    void preloadActQuizContainer();
    
    void registerPreloadInfo();
    
    void registerReuseInfo();
    
    void unregisterReuseInfo();
}
