// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.compat.function;

import com.bytedance.covode.number.Covode;

public interface Consumer<T>
{
    default static {
        Covode.recordClassIndex(2557);
    }
    
    void accept(final T p0);
}
