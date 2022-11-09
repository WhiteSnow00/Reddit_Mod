// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class cc extends ce
{
    static {
        Covode.recordClassIndex(2665);
    }
    
    public cc(final Context context) {
        super("af_purchase", Boolean.TRUE, context);
    }
    
    @Override
    public final j valueOf(final String s) {
        super.valueOf(this.AFInAppEventParameterName(s));
        return this;
    }
}
