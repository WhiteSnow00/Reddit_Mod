// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.browser;

import X.CTM;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.covode.number.Covode;

public class LiveSparkDummyService implements ILiveSparkService
{
    static {
        Covode.recordClassIndex(5584);
    }
    
    @Override
    public void handle(final SparkContext sparkContext) {
        CTM.LIZ((Object)sparkContext);
    }
    
    @Override
    public void initResourceIfNeeded() {
    }
    
    @Override
    public void onInit() {
    }
    
    @Override
    public void registerSparkIfNeeded() {
    }
}
