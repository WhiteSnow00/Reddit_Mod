// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import com.bytedance.covode.number.Covode;

public interface bk<ResponseType>
{
    default static {
        Covode.recordClassIndex(2643);
    }
    
    void valueOf(final bm<ResponseType> p0);
    
    void valueOf(final Throwable p0);
}
