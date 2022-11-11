// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class bs extends j
{
    static {
        Covode.recordClassIndex(2652);
    }
    
    public bs() {
        super(null, null, Boolean.FALSE, null);
    }
    
    @Override
    public final j valueOf(final String s) {
        super.valueOf(this.AFInAppEventParameterName(s));
        return this;
    }
}
