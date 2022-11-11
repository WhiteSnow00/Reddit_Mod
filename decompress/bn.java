// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import com.bytedance.covode.number.Covode;

public interface bn<ResponseType>
{
    default static {
        Covode.recordClassIndex(2646);
    }
    
    ResponseType AFInAppEventType(final String p0);
}
