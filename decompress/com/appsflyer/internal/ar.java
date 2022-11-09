// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import java.util.AbstractMap;
import org.json.JSONException;
import X.46U;
import X.3xs;
import android.content.SharedPreferences$Editor;
import java.util.concurrent.TimeUnit;
import java.util.Observable;
import java.util.Observer;
import android.net.Uri$Builder;
import java.util.Iterator;
import android.net.Uri;
import X.0II;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.HashMap;
import android.os.Build;
import android.os.Build$VERSION;
import java.util.Locale;
import java.net.HttpURLConnection;
import com.appsflyer.deeplink.DeepLink;
import org.json.JSONArray;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.AFLogger;
import android.app.Application;
import java.util.ArrayList;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

public final class ar extends bu
{
    public static String onAttributionFailure;
    public static long onInstallConversionDataLoadedNative;
    public int AppsFlyerConversionListener;
    public int AppsFlyerInAppPurchaseValidatorListener;
    public final JSONObject AppsFlyerLib;
    public final au onAppOpenAttribution;
    public final CountDownLatch onConversionDataFail;
    public final List<cl> onDeepLinking;
    public int onInstallConversionFailureNative;
    public boolean onValidateInApp;
    
    static {
        Covode.recordClassIndex(2615);
        ar.onAttributionFailure = "https://%sdlsdk.%s/v1.0/android/";
    }
    
    public ar(final Context context, final au onAppOpenAttribution) {
        super(null, ar.onAttributionFailure, Boolean.FALSE, Boolean.TRUE, null, context);
        this.onDeepLinking = new ArrayList<cl>();
        this.onConversionDataFail = new CountDownLatch(1);
        this.AppsFlyerLib = new JSONObject();
        this.onAppOpenAttribution = onAppOpenAttribution;
    }
    
    private void AFInAppEventParameterName(final cl cl) {
        if (AFInAppEventType(cl)) {
            this.onDeepLinking.add(cl);
            this.onConversionDataFail.countDown();
            final StringBuilder sb = new StringBuilder("[DDL] Added non-organic ");
            sb.append(cl.getClass().getSimpleName());
            AFLogger.AFInAppEventType(sb.toString());
            return;
        }
        if (++this.AppsFlyerInAppPurchaseValidatorListener == this.AppsFlyerConversionListener) {
            this.onConversionDataFail.countDown();
        }
    }
    
    private void AFInAppEventType(final Context context) {
        ++this.onInstallConversionFailureNative;
        final StringBuilder sb = new StringBuilder("[DDL] Preparing request ");
        sb.append(this.onInstallConversionFailureNative);
        AFLogger.AFInAppEventType(sb.toString());
        if (this.onInstallConversionFailureNative == 1) {
            final ai value = ai.valueOf();
            super.AFInAppEventType.put("is_first", ai.AFInAppEventType(context));
            final Map<String, Object> afInAppEventType = super.AFInAppEventType;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(Locale.getDefault().getLanguage());
            sb2.append("-");
            sb2.append(Locale.getDefault().getCountry());
            afInAppEventType.put("lang", sb2.toString());
            super.AFInAppEventType.put("os", Build$VERSION.RELEASE);
            super.AFInAppEventType.put("type", Build.MODEL);
            super.AFInAppEventType.put("request_id", value.getAppsFlyerUID(context));
            final l onAppOpenAttributionNative = value.onAppOpenAttributionNative;
            if (onAppOpenAttributionNative != null) {
                final String[] valueOf = onAppOpenAttributionNative.valueOf;
                if (valueOf != null) {
                    super.AFInAppEventType.put("sharing_filter", valueOf);
                }
            }
            final Map<String, Object> value2 = this.valueOf(ad.AFInAppEventType(context, new HashMap<String, Object>()));
            final Map<String, Object> value3 = this.valueOf(ad.values(context));
            if (value2 != null) {
                super.AFInAppEventType.put("gaid", value2);
            }
            if (value3 != null) {
                super.AFInAppEventType.put("oaid", value3);
            }
        }
        final Map<String, Object> afInAppEventType2 = super.AFInAppEventType;
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        final long currentTimeMillis = System.currentTimeMillis();
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        afInAppEventType2.put("timestamp", simpleDateFormat.format(new Date(currentTimeMillis)));
        super.AFInAppEventType.put("request_count", this.onInstallConversionFailureNative);
        final ArrayList list = new ArrayList();
        for (final cl cl : this.onDeepLinking) {
            if (cl.valueOf == cl.a.values) {
                final HashMap hashMap = new HashMap();
                final Object value4 = cl.values.get("referrer");
                if (value4 == null) {
                    continue;
                }
                hashMap.put("source", cl.values.get("source"));
                hashMap.put("value", value4);
                list.add(hashMap);
            }
        }
        if (!list.isEmpty()) {
            super.AFInAppEventType.put("referrers", list);
        }
        final String string = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
        final Uri$Builder appendPath = Uri.parse(0II.LIZ(super.onAppOpenAttributionNative, new Object[] { com.appsflyer.AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName() })).buildUpon().appendPath(context.getPackageName());
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(super.AFInAppEventType.get("timestamp"));
        sb3.append(string);
        this.valueOf(appendPath.appendQueryParameter("af_sig", ah.valueOf(sb3.toString(), string)).appendQueryParameter("sdk_version", ai.valueOf).build().toString());
    }
    
    public static boolean AFInAppEventType(final cl cl) {
        final Number n = cl.values.get("click_ts");
        return n != null && System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(n.longValue()) < TimeUnit.DAYS.toMillis(1L);
    }
    
    public static void INVOKEINTERFACE_com_appsflyer_internal_ar_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(final SharedPreferences$Editor sharedPreferences$Editor) {
        if (!3xs.LIZ() || Build$VERSION.SDK_INT < 26) {
            sharedPreferences$Editor.apply();
            return;
        }
        if (!sharedPreferences$Editor.getClass().getName().equals("android.app.SharedPreferencesImpl$EditorImpl")) {
            sharedPreferences$Editor.apply();
            return;
        }
        final Object liz = 46U.LIZ((Object)sharedPreferences$Editor);
        if (liz == null || !46U.LIZIZ((Object)sharedPreferences$Editor, liz)) {
            sharedPreferences$Editor.apply();
            if (liz == null) {
                return;
            }
        }
        46U.LIZ((Object)sharedPreferences$Editor, liz);
    }
    
    private Map<String, Object> valueOf(final c.d.b b) {
        if (b != null && b.values != null) {
            final Boolean afKeystoreWrapper = b.AFKeystoreWrapper;
            if (afKeystoreWrapper == null || !afKeystoreWrapper) {
                return new HashMap<String, Object>() {
                    static {
                        Covode.recordClassIndex(2617);
                    }
                    
                    {
                        ((AbstractMap<String, String>)this).put("type", "unhashed");
                        ((AbstractMap<String, String>)this).put("value", b.values);
                    }
                };
            }
        }
        return null;
    }
    
    private boolean values() {
        final List list = super.AFInAppEventType.get("referrers");
        int size;
        if (list != null) {
            size = list.size();
        }
        else {
            size = 0;
        }
        return size < this.AppsFlyerConversionListener && !super.AFInAppEventType.containsKey("referrers");
    }
    
    public final void valueOf(final DeepLinkResult deepLinkResult) {
        while (true) {
            try {
                this.AppsFlyerLib.put("status", (Object)deepLinkResult.getStatus().toString());
                this.AppsFlyerLib.put("timeout_value", ar.onInstallConversionDataLoadedNative);
                INVOKEINTERFACE_com_appsflyer_internal_ar_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(this.onAppOpenAttribution.values.edit().putString("ddl", this.AppsFlyerLib.toString()));
                ap.values(deepLinkResult);
            }
            catch (final JSONException ex) {
                continue;
            }
            break;
        }
    }
}
