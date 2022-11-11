// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.service;

import org.json.JSONObject;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface IHostMonitor extends 0Vq
{
    default static {
        Covode.recordClassIndex(5002);
    }
    
    void LIZ(final String p0, final int p1, final JSONObject p2);
    
    void LIZ(final String p0, final int p1, final JSONObject p2, final JSONObject p3);
    
    void LIZ(final String p0, final String p1, final float p2);
    
    void LIZ(final String p0, final JSONObject p1);
    
    void LIZ(final String p0, final JSONObject p1, final JSONObject p2);
    
    void LIZ(final String p0, final JSONObject p1, final JSONObject p2, final JSONObject p3);
    
    void LIZ(final Throwable p0, final String p1);
    
    void LIZ(final JSONObject p0);
}
