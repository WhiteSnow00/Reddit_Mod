// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.broadcast.api.blockword.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.bytedance.android.livesdk.model.Extra;

public class BlockWordGetExtra extends Extra
{
    @c(LIZ = "max_count")
    public long maxCount;
    @c(LIZ = "max_length")
    public long maxLength;
    
    static {
        Covode.recordClassIndex(5043);
    }
    
    public BlockWordGetExtra() {
        this.maxCount = 50L;
        this.maxLength = 30L;
    }
}
