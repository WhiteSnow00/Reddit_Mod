// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import java.util.Map;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public abstract class bu extends j
{
    public boolean onConversionDataSuccess;
    public final boolean onInstallConversionDataLoadedNative;
    public final boolean onInstallConversionFailureNative;
    
    static {
        Covode.recordClassIndex(2654);
    }
    
    public bu() {
        this(null, null, null, null, null, null);
    }
    
    public bu(final String s, final String s2, final Boolean b, final Boolean b2, final Boolean b3, final Context context) {
        super(s, s2, b3 != null && b3, context);
        final boolean b4 = true;
        this.onInstallConversionDataLoadedNative = (b == null || b);
        boolean booleanValue = b4;
        if (b2 != null) {
            booleanValue = b2;
        }
        this.onInstallConversionFailureNative = booleanValue;
    }
    
    public final boolean AFLogger$LogLevel() {
        return this.onInstallConversionFailureNative;
    }
    
    public String AFVersionDeclaration() {
        return o.AFInAppEventParameterName(this.AFInAppEventParameterName()).toString();
    }
    
    public final boolean getLevel() {
        return this.onConversionDataSuccess;
    }
    
    public final boolean init() {
        return this.onInstallConversionDataLoadedNative;
    }
}
