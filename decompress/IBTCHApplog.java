// 
// Decompiled by Procyon v0.6.0
// 

package com.benchmark;

import org.json.JSONObject;
import com.bytedance.covode.number.Covode;

public interface IBTCHApplog
{
    default static {
        Covode.recordClassIndex(2875);
    }
    
    void onEvent(final String p0, final JSONObject p1);
}
