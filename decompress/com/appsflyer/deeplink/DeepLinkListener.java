// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.deeplink;

import com.bytedance.covode.number.Covode;

public interface DeepLinkListener
{
    default static {
        Covode.recordClassIndex(2560);
    }
    
    void onDeepLinking(final DeepLinkResult p0);
}
