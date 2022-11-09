// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer;

import com.bytedance.covode.number.Covode;

public interface AppsFlyerInAppPurchaseValidatorListener
{
    default static {
        Covode.recordClassIndex(2546);
    }
    
    void onValidateInApp();
    
    void onValidateInAppFailure(final String p0);
}
