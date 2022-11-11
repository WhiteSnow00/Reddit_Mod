// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import org.json.JSONException;
import java.util.Map;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import com.bytedance.covode.number.Covode;

public final class ap
{
    static {
        Covode.recordClassIndex(2613);
    }
    
    public static void AFInAppEventParameterName(final String s, final DeepLinkResult.Error error) {
        if (i.values().valueOf != null) {
            AFLogger.AFInAppEventType("[DDL] Error occurred: ".concat(String.valueOf(s)));
            values(new DeepLinkResult(null, error));
            return;
        }
        AFKeystoreWrapper(s);
    }
    
    public static void AFInAppEventParameterName(final Map<String, String> map) {
        if (i.values().valueOf != null) {
            try {
                DeepLinkResult deepLinkResult;
                try {
                    final DeepLink afKeystoreWrapper = DeepLink.AFKeystoreWrapper(map);
                    afKeystoreWrapper.values.put("is_deferred", false);
                    deepLinkResult = new DeepLinkResult(afKeystoreWrapper, null);
                }
                catch (final JSONException ex) {
                    AFLogger.values("[DDL] Error occurred", (Throwable)ex);
                    deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                }
                values(deepLinkResult);
                return;
            }
            finally {
                values(new DeepLinkResult(null, null));
            }
        }
        AFKeystoreWrapper(map);
    }
    
    public static void AFKeystoreWrapper(final String s) {
        if (ai.AFInAppEventType != null) {
            try {
                AFLogger.AFInAppEventType("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(s)));
                ai.AFInAppEventType.onAttributionFailure(s);
            }
            finally {
                final Throwable t;
                AFLogger.valueOf(t.getLocalizedMessage(), t);
            }
        }
    }
    
    public static void AFKeystoreWrapper(final Map<String, String> map) {
        if (ai.AFInAppEventType != null) {
            try {
                final StringBuilder sb = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb.append(map.toString());
                AFLogger.AFInAppEventType(sb.toString());
                ai.AFInAppEventType.onAppOpenAttribution(map);
            }
            finally {
                final Throwable t;
                AFLogger.valueOf(t.getLocalizedMessage(), t);
            }
        }
    }
    
    public static void values(final DeepLinkResult deepLinkResult) {
        if (i.values().valueOf != null) {
            final StringBuilder sb = new StringBuilder("[DDL] Calling onDeepLinking with:\n");
            sb.append(deepLinkResult.toString());
            AFLogger.AFInAppEventType(sb.toString());
            try {
                i.values().valueOf.onDeepLinking(deepLinkResult);
                return;
            }
            finally {
                final Throwable t;
                AFLogger.valueOf(t.getLocalizedMessage(), t);
                return;
            }
        }
        AFLogger.AFInAppEventType("[DDL] skipping, no callback registered");
    }
}
