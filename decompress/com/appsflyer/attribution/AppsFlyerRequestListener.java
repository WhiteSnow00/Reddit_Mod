// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.attribution;

import com.bytedance.covode.number.Covode;

public interface AppsFlyerRequestListener
{
    default static {
        Covode.recordClassIndex(2555);
    }
    
    void onError(final int p0, final String p1);
    
    void onSuccess();
}
