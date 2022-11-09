// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk.message;

import android.os.Message;
import com.bytedance.covode.number.Covode;

public interface MessageInterceptor
{
    default static {
        Covode.recordClassIndex(2837);
    }
    
    void destroy();
    
    boolean intercept(final Message p0);
}
