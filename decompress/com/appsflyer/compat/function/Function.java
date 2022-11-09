// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.compat.function;

import com.bytedance.covode.number.Covode;

public interface Function<T, R>
{
    default static {
        Covode.recordClassIndex(2558);
    }
    
    R apply(final T p0);
}
