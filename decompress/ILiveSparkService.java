// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.browser;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface ILiveSparkService extends 0Vq
{
    default static {
        Covode.recordClassIndex(5583);
    }
    
    void handle(final SparkContext p0);
    
    void initResourceIfNeeded();
    
    void registerSparkIfNeeded();
}
