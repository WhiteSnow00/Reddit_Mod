// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.ai.magi.jni;

import com.bytedance.covode.number.Covode;

public final class PTYTTNetFeatureJNIKt
{
    static {
        Covode.recordClassIndex(4231);
    }
    
    public static final native void registerTTNetFeature();
    
    public static final native void unregisterTTNetFeature();
}
