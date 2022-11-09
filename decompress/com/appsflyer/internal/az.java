// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import com.bytedance.covode.number.Covode;

public final class az
{
    public static String AFInAppEventParameterName;
    public static String AFInAppEventType;
    public static String AFKeystoreWrapper;
    public static String valueOf;
    
    static {
        Covode.recordClassIndex(2631);
        az.AFKeystoreWrapper = "Event timeout. Check 'minTimeBetweenSessions' param";
        az.valueOf = "Skipping event because 'isStopped' is true";
        az.AFInAppEventParameterName = "Status code failure";
        az.AFInAppEventType = "No dev key";
    }
}
