// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer;

import java.util.Map;
import com.bytedance.covode.number.Covode;

public interface AppsFlyerConversionListener
{
    default static {
        Covode.recordClassIndex(2545);
    }
    
    void onAppOpenAttribution(final Map<String, String> p0);
    
    void onAttributionFailure(final String p0);
    
    void onConversionDataFail(final String p0);
    
    void onConversionDataSuccess(final Map<String, Object> p0);
}
