// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class bz extends bu
{
    public String onInstallConversionDataLoadedNative;
    
    static {
        Covode.recordClassIndex(2659);
    }
    
    public bz() {
        super(null, null, null, Boolean.FALSE, null, null);
    }
    
    @Override
    public final String AFVersionDeclaration() {
        return this.onInstallConversionDataLoadedNative;
    }
}
