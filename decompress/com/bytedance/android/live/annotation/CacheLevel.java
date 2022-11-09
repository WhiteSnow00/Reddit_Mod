// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.annotation;

import com.bytedance.covode.number.Covode;

public enum CacheLevel
{
    DID(1), 
    UID(2);
    
    public int value;
    
    static {
        Covode.recordClassIndex(4881);
    }
    
    public CacheLevel(final int value) {
        this.value = value;
    }
    
    public final int getValue() {
        return this.value;
    }
}
