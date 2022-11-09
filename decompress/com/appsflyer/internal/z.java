// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import com.appsflyer.AppsFlyerProperties;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.HashMap;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AFLogger;
import java.net.HttpURLConnection;
import org.json.JSONObject;
import X.0II;
import com.appsflyer.AppsFlyerLib;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import android.content.Context;
import java.lang.ref.WeakReference;

public final class z implements Runnable
{
    public static String AFKeystoreWrapper;
    public static String valueOf;
    public WeakReference<Context> AFInAppEventParameterName;
    public String AFInAppEventType;
    public String AFLogger$LogLevel;
    public String AFVersionDeclaration;
    public String AppsFlyer2dXConversionCallback;
    public String getLevel;
    public Map<String, String> init;
    public String values;
    
    static {
        Covode.recordClassIndex(2721);
        z.AFKeystoreWrapper = "https://%ssdk-services.%s/validate-android-signature";
        final StringBuilder sb = new StringBuilder("https://%svalidate.%s/api/v");
        sb.append(ai.valueOf);
        sb.append("/androidevent?buildnumber=6.4.0&app_id=");
        z.valueOf = sb.toString();
    }
    
    public z(final Context context, final String afInAppEventType, final String values, final String afVersionDeclaration, final String appsFlyer2dXConversionCallback, final String afLogger$LogLevel, final String getLevel, final Map<String, String> init) {
        this.AFInAppEventParameterName = new WeakReference<Context>(context);
        this.AFInAppEventType = afInAppEventType;
        this.values = values;
        this.AppsFlyer2dXConversionCallback = appsFlyer2dXConversionCallback;
        this.AFLogger$LogLevel = afLogger$LogLevel;
        this.getLevel = getLevel;
        this.init = init;
        this.AFVersionDeclaration = afVersionDeclaration;
    }
    
    public static /* synthetic */ Map AFInAppEventParameterName(final z z) {
        return z.init;
    }
    
    public static /* synthetic */ void AFInAppEventType(z z, final Map map, final Map map2, final WeakReference weakReference) {
        if (weakReference.get() != null) {
            ab.AFKeystoreWrapper((Context)weakReference.get()).valueOf();
            final StringBuilder sb = new StringBuilder();
            sb.append(0II.LIZ(z.valueOf, new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName() }));
            sb.append(((Context)weakReference.get()).getPackageName());
            final String string = sb.toString();
            final String string2 = ai.values((Context)weakReference.get()).getString("referrer", "");
            final cc cc = new cc((Context)weakReference.get());
            cc.AppsFlyer2dXConversionCallback = z.AFInAppEventType;
            cc.AFVersionDeclaration = string2;
            final ai value = ai.valueOf();
            final Map<String, Object> value2 = value.valueOf(cc);
            value2.put("price", z.AFLogger$LogLevel);
            value2.put("currency", z.getLevel);
            value2.put("receipt_data", map);
            if (map2 != null) {
                value2.put("extra_prms", map2);
            }
            value2.putAll(value.values());
            aj.AFInAppEventParameterName().AFInAppEventType("server_request", string, new JSONObject((Map)value2).toString());
            final z z2 = z = null;
            try {
                cc.AFInAppEventType(value2);
                z = z2;
                cc.valueOf(string);
                z = z2;
                final Object value3 = valueOf(cc);
                int responseCode = -1;
                if (value3 != null) {
                    z = (z)value3;
                    responseCode = ((HttpURLConnection)value3).getResponseCode();
                }
                z = (z)value3;
                final String afInAppEventParameterName = ai.AFInAppEventParameterName((HttpURLConnection)value3);
                z = (z)value3;
                aj.AFInAppEventParameterName().AFInAppEventType("server_response", string, new String[] { String.valueOf(responseCode), afInAppEventParameterName });
                z = (z)value3;
                z = (z)value3;
                final StringBuilder sb2 = new StringBuilder("Validate-WH response - ");
                z = (z)value3;
                sb2.append(responseCode);
                z = (z)value3;
                sb2.append(": ");
                z = (z)value3;
                z = (z)value3;
                final JSONObject jsonObject = new JSONObject(afInAppEventParameterName);
                z = (z)value3;
                sb2.append(jsonObject.toString());
                z = (z)value3;
                AFLogger.valueOf(sb2.toString());
                if (value3 != null) {
                    ((HttpURLConnection)value3).disconnect();
                }
            }
            finally {
                try {
                    final Throwable t;
                    AFLogger.valueOf(t.getMessage(), t);
                }
                finally {
                    if (z != null) {
                        ((HttpURLConnection)z).disconnect();
                    }
                }
            }
        }
    }
    
    public static /* synthetic */ WeakReference AFKeystoreWrapper(final z z) {
        return z.AFInAppEventParameterName;
    }
    
    public static HttpURLConnection valueOf(final ce ce) {
        final StringBuilder sb = new StringBuilder("Calling ");
        sb.append(ce.onAppOpenAttributionNative);
        AFLogger.AFInAppEventType(sb.toString());
        ce.onConversionDataSuccess = AppsFlyerLib.getInstance().isStopped();
        return new ah(ce).AFInAppEventParameterName();
    }
    
    public static void values(final boolean b, String s, final String s2, final String s3, final String s4) {
        if (ai.AFKeystoreWrapper != null) {
            final StringBuilder sb = new StringBuilder("Validate callback parameters: ");
            sb.append(s);
            sb.append(" ");
            sb.append(s2);
            sb.append(" ");
            sb.append(s3);
            AFLogger.AFInAppEventType(sb.toString());
            if (b) {
                AFLogger.AFInAppEventType("Validate in app purchase success: ".concat(String.valueOf(s4)));
                ai.AFKeystoreWrapper.onValidateInApp();
                return;
            }
            AFLogger.AFInAppEventType("Validate in app purchase failed: ".concat(String.valueOf(s4)));
            final AppsFlyerInAppPurchaseValidatorListener afKeystoreWrapper = ai.AFKeystoreWrapper;
            if ((s = s4) == null) {
                s = "Failed validating";
            }
            afKeystoreWrapper.onValidateInAppFailure(s);
        }
    }
    
    @Override
    public final void run() {
        final String afInAppEventType = this.AFInAppEventType;
        if (afInAppEventType == null || afInAppEventType.length() == 0) {
            return;
        }
        if (AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        HttpURLConnection httpURLConnection2;
        final HttpURLConnection httpURLConnection = httpURLConnection2 = null;
        try {
            final Context context = this.AFInAppEventParameterName.get();
            if (context == null) {
                return;
            }
            httpURLConnection2 = httpURLConnection;
            httpURLConnection2 = httpURLConnection;
            final HashMap hashMap = new HashMap();
            httpURLConnection2 = httpURLConnection;
            hashMap.put("public-key", this.values);
            httpURLConnection2 = httpURLConnection;
            hashMap.put("sig-data", this.AppsFlyer2dXConversionCallback);
            httpURLConnection2 = httpURLConnection;
            hashMap.put("signature", this.AFVersionDeclaration);
            httpURLConnection2 = httpURLConnection;
            httpURLConnection2 = httpURLConnection;
            final HashMap hashMap2 = new HashMap(hashMap);
            httpURLConnection2 = httpURLConnection;
            httpURLConnection2 = httpURLConnection;
            httpURLConnection2 = httpURLConnection;
            final Runnable runnable = new Runnable() {
                static {
                    Covode.recordClassIndex(2722);
                }
                
                @Override
                public final void run() {
                    final z afKeystoreWrapper = z.this;
                    z.AFInAppEventType(afKeystoreWrapper, hashMap2, z.AFInAppEventParameterName(afKeystoreWrapper), z.AFKeystoreWrapper(z.this));
                }
            };
            httpURLConnection2 = httpURLConnection;
            final PthreadThread pthreadThread = new PthreadThread((Runnable)runnable, "er/internal/z");
            httpURLConnection2 = httpURLConnection;
            pthreadThread.start();
            httpURLConnection2 = httpURLConnection;
            hashMap.put("dev_key", this.AFInAppEventType);
            httpURLConnection2 = httpURLConnection;
            hashMap.put("app_id", context.getPackageName());
            httpURLConnection2 = httpURLConnection;
            hashMap.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            httpURLConnection2 = httpURLConnection;
            final String string = AppsFlyerProperties.getInstance().getString("advertiserId");
            if (string != null) {
                httpURLConnection2 = httpURLConnection;
                hashMap.put("advertiserId", string);
            }
            httpURLConnection2 = httpURLConnection;
            httpURLConnection2 = httpURLConnection;
            final JSONObject jsonObject = new JSONObject((Map)hashMap);
            httpURLConnection2 = httpURLConnection;
            final String string2 = jsonObject.toString();
            httpURLConnection2 = httpURLConnection;
            final String liz = 0II.LIZ(z.AFKeystoreWrapper, new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName() });
            httpURLConnection2 = httpURLConnection;
            aj.AFInAppEventParameterName().AFInAppEventType("server_request", liz, string2);
            httpURLConnection2 = httpURLConnection;
            httpURLConnection2 = httpURLConnection;
            final cd cd = new cd();
            httpURLConnection2 = httpURLConnection;
            cd.AFInAppEventType(hashMap);
            httpURLConnection2 = httpURLConnection;
            cd.valueOf(liz);
            httpURLConnection2 = httpURLConnection;
            final HttpURLConnection value = valueOf(cd);
            int responseCode = -1;
            if (value != null) {
                httpURLConnection2 = value;
                responseCode = value.getResponseCode();
            }
            httpURLConnection2 = value;
            ai.valueOf();
            httpURLConnection2 = value;
            final String afInAppEventParameterName = ai.AFInAppEventParameterName(value);
            httpURLConnection2 = value;
            aj.AFInAppEventParameterName().AFInAppEventType("server_response", liz, new String[] { String.valueOf(responseCode), afInAppEventParameterName });
            httpURLConnection2 = value;
            httpURLConnection2 = value;
            final JSONObject jsonObject2 = new JSONObject(afInAppEventParameterName);
            httpURLConnection2 = value;
            jsonObject2.put("code", responseCode);
            if (responseCode == 200) {
                httpURLConnection2 = value;
                httpURLConnection2 = value;
                final StringBuilder sb = new StringBuilder("Validate response 200 ok: ");
                httpURLConnection2 = value;
                sb.append(jsonObject2.toString());
                httpURLConnection2 = value;
                AFLogger.valueOf(sb.toString());
                httpURLConnection2 = value;
                values(jsonObject2.optBoolean("result"), this.AppsFlyer2dXConversionCallback, this.AFLogger$LogLevel, this.getLevel, jsonObject2.toString());
            }
            else {
                httpURLConnection2 = value;
                AFLogger.valueOf("Failed Validate request");
                httpURLConnection2 = value;
                values(false, this.AppsFlyer2dXConversionCallback, this.AFLogger$LogLevel, this.getLevel, jsonObject2.toString());
            }
            if (value != null) {
                value.disconnect();
            }
        }
        finally {
            try {
                final Throwable t;
                if (ai.AFKeystoreWrapper != null) {
                    AFLogger.valueOf("Failed Validate request + ex", t);
                    values(false, this.AppsFlyer2dXConversionCallback, this.AFLogger$LogLevel, this.getLevel, t.getMessage());
                }
                AFLogger.valueOf(t.getMessage(), t);
            }
            finally {
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
            }
        }
    }
}
