// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.covode.number.Covode;

public final class al
{
    public static String AFInAppEventParameterName;
    public static String AFKeystoreWrapper;
    
    static {
        Covode.recordClassIndex(2605);
    }
    
    public static void AFInAppEventParameterName(final String afKeystoreWrapper) {
        al.AFKeystoreWrapper = afKeystoreWrapper;
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < afKeystoreWrapper.length(); ++i) {
            if (i == 0 || i == afKeystoreWrapper.length() - 1) {
                sb.append(afKeystoreWrapper.charAt(i));
            }
            else {
                sb.append("*");
            }
        }
        al.AFInAppEventParameterName = sb.toString();
    }
    
    public static void values(final String s) {
        if (al.AFKeystoreWrapper == null) {
            AFInAppEventParameterName(AppsFlyerProperties.getInstance().getString("AppsFlyerKey"));
        }
        final String afKeystoreWrapper = al.AFKeystoreWrapper;
        if (afKeystoreWrapper != null) {
            AFLogger.valueOf(s.replace(afKeystoreWrapper, al.AFInAppEventParameterName));
        }
    }
}
