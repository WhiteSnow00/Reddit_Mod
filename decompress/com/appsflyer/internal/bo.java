// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import java.util.concurrent.TimeUnit;
import android.app.Application;
import android.content.SharedPreferences;
import X.5WL;
import java.util.Iterator;
import org.json.JSONException;
import com.appsflyer.AFLogger;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class bo
{
    static {
        Covode.recordClassIndex(2647);
    }
    
    public static Map<String, Object> AFInAppEventType(final Context context) {
        final String string = ai.values(context).getString("attributionId", (String)null);
        if (string != null && string.length() > 0) {
            return AFKeystoreWrapper(string);
        }
        throw new bp();
    }
    
    public static Map<String, Object> AFKeystoreWrapper(final String s) {
        final HashMap hashMap = new HashMap();
        try {
            final JSONObject jsonObject = new JSONObject(s);
            final Iterator keys = jsonObject.keys();
            while (keys.hasNext()) {
                final String s2 = keys.next();
                if (!s2.equals("is_cache")) {
                    Object value;
                    if (jsonObject.isNull(s2)) {
                        value = null;
                    }
                    else {
                        value = jsonObject.get(s2);
                    }
                    hashMap.put(s2, value);
                }
            }
            return hashMap;
        }
        catch (final JSONException ex) {
            AFLogger.valueOf(((Throwable)ex).getMessage(), (Throwable)ex);
            return null;
        }
    }
    
    public static Context INVOKEVIRTUAL_com_appsflyer_internal_bo_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context applicationContext) {
        applicationContext = applicationContext.getApplicationContext();
        if (!5WL.LIZIZ) {
            return applicationContext;
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        return (Context)5WL.LIZ;
    }
    
    public static void values(final ai ai, final j j, final String s, final Context context, final SharedPreferences sharedPreferences, final Integer n, final Throwable t) {
        if (!j.AFKeystoreWrapper()) {
            return;
        }
        if (ai.AFInAppEventType == null) {
            AFLogger.AFInAppEventType("[GCD-E01] AppsFlyerConversionListener is null - skip gcd");
            return;
        }
        final StringBuilder sb = new StringBuilder("[GCD-A01] Loading conversion data. Counter: ");
        sb.append(j.onAttributionFailureNative);
        AFLogger.AFInAppEventType(sb.toString());
        final long long1 = sharedPreferences.getLong("appsflyerConversionDataCacheExpiration", 0L);
        if (long1 != 0L && System.currentTimeMillis() - long1 > 5184000000L) {
            AFLogger.AFInAppEventType("[GCD-E02] Cached conversion data expired");
            ai.valueOf(context, "sixtyDayConversionData");
            ai.values(context, "attributionId", null);
            ai.valueOf(context, "appsflyerConversionDataCacheExpiration", 0L);
        }
        if (sharedPreferences.getString("attributionId", (String)null) != null) {
            if (ai.AFInAppEventParameterName(sharedPreferences, "appsFlyerCount", false) <= 1) {
                return;
            }
            try {
                final Map<String, Object> afInAppEventType = AFInAppEventType(context);
                if (afInAppEventType == null) {
                    return;
                }
                try {
                    if (!afInAppEventType.containsKey("is_first_launch")) {
                        afInAppEventType.put("is_first_launch", Boolean.FALSE);
                    }
                    bv.AFInAppEventType(afInAppEventType);
                    return;
                }
                finally {
                    final Throwable t2;
                    AFLogger.valueOf(t2.getLocalizedMessage(), t2);
                    return;
                }
            }
            catch (final bp bp) {
                AFLogger.valueOf(bp.getMessage(), bp);
                return;
            }
        }
        if (t != null) {
            final StringBuilder sb2 = new StringBuilder("Launch exception: ");
            sb2.append(t.getMessage());
            bv.valueOf(sb2.toString());
            return;
        }
        if (n.intValue() != 200) {
            bv.valueOf("Launch status code: ".concat(String.valueOf(n)));
            return;
        }
        final bv bv = new bv(ai, (Application)INVOKEVIRTUAL_com_appsflyer_internal_bo_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context), s);
        ai.AFInAppEventParameterName(bv.AFKeystoreWrapper, bv, 10L, TimeUnit.MILLISECONDS);
    }
}
