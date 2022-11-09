// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import java.util.concurrent.TimeUnit;
import java.lang.ref.WeakReference;
import com.appsflyer.AppsFlyerLib;
import X.0II;
import android.content.Context;
import X.75k;
import java.net.HttpURLConnection;
import X.764;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;
import android.webkit.WebView;
import X.75n;
import X.75s;
import X.75j;
import java.net.URLConnection;
import java.net.URL;
import X.46U;
import android.os.Build$VERSION;
import X.3xs;
import android.content.SharedPreferences$Editor;
import com.appsflyer.AFLogger;
import java.util.Map;
import java.util.Arrays;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ScheduledExecutorService;
import android.app.Application;
import java.util.List;

public final class bv implements Runnable
{
    public static String AFInAppEventType;
    public static final List<String> valueOf;
    public final Application AFInAppEventParameterName;
    public final ScheduledExecutorService AFKeystoreWrapper;
    public final int AFVersionDeclaration;
    public final AtomicInteger AppsFlyer2dXConversionCallback;
    public final ai getLevel;
    public final String values;
    
    static {
        Covode.recordClassIndex(2655);
        bv.AFInAppEventType = "https://%sgcdsdk.%s/install_data/v4.0/";
        valueOf = Arrays.asList("googleplay", "playstore", "googleplaystore");
    }
    
    public bv(final ai getLevel, final Application afInAppEventParameterName, final String values) {
        if (k.values == null) {
            k.values = new k();
        }
        this.AFKeystoreWrapper = k.values.AFInAppEventType();
        this.AppsFlyer2dXConversionCallback = new AtomicInteger(0);
        this.getLevel = getLevel;
        this.AFInAppEventParameterName = afInAppEventParameterName;
        this.values = values;
        this.AFVersionDeclaration = 0;
    }
    
    public bv(final bv bv) {
        if (k.values == null) {
            k.values = new k();
        }
        this.AFKeystoreWrapper = k.values.AFInAppEventType();
        this.AppsFlyer2dXConversionCallback = new AtomicInteger(0);
        this.getLevel = bv.getLevel;
        this.AFInAppEventParameterName = bv.AFInAppEventParameterName;
        this.values = bv.values;
        this.AFVersionDeclaration = bv.AFVersionDeclaration + 1;
    }
    
    public static void AFInAppEventType(final Map<String, Object> map) {
        final StringBuilder sb = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
        sb.append(map.toString());
        AFLogger.AFInAppEventType(sb.toString());
        ai.AFInAppEventType.onConversionDataSuccess(map);
    }
    
    public static void INVOKEINTERFACE_com_appsflyer_internal_bv_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(final SharedPreferences$Editor sharedPreferences$Editor) {
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
    
    public static URLConnection INVOKEVIRTUAL_com_appsflyer_internal_bv_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(final URL url) {
        final 75n ljiil = 75j.LIZLLL.LJIIL(new 75n((Object)url, (WebView)null, (JSONObject)null, 75s.CONTINUE));
        if (ljiil.LJFF == 75s.INTERCEPT && ljiil.LIZIZ != null) {
            final URLConnection urlConnection = (URLConnection)ljiil.LIZIZ;
            Object o;
            if (urlConnection instanceof HttpsURLConnection) {
                o = new 764((HttpsURLConnection)urlConnection);
            }
            else {
                o = urlConnection;
                if (urlConnection instanceof HttpURLConnection) {
                    o = new 75k((HttpURLConnection)urlConnection);
                }
            }
            return (URLConnection)o;
        }
        if (ljiil.LJFF != 75s.EXCEPTION || ljiil.LJ == null) {
            final URLConnection openConnection = url.openConnection();
            Object o2;
            if (openConnection instanceof HttpsURLConnection) {
                o2 = new 764((HttpsURLConnection)openConnection);
            }
            else {
                o2 = openConnection;
                if (openConnection instanceof HttpURLConnection) {
                    o2 = new 75k((HttpURLConnection)openConnection);
                }
            }
            return (URLConnection)o2;
        }
        throw ljiil.LJ;
    }
    
    public static void valueOf(final String s) {
        if (ai.AFInAppEventType != null) {
            AFLogger.AFInAppEventType("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(s)));
            ai.AFInAppEventType.onConversionDataFail(s);
        }
    }
    
    @Override
    public final void run() {
        final String values = this.values;
        if (values == null || values.length() == 0) {
            AFLogger.AFInAppEventType("[GCD-E05] AppsFlyer dev key is missing");
            valueOf("AppsFlyer dev key is missing");
            return;
        }
        if (this.getLevel.isStopped()) {
            AFLogger.AFInAppEventType("[GCD-E03] 'isStopTracking' enabled");
            valueOf("'isStopTracking' enabled");
            return;
        }
        this.AppsFlyer2dXConversionCallback.incrementAndGet();
        Object o = null;
        String s = null;
        try {
            final Application afInAppEventParameterName = this.AFInAppEventParameterName;
            if (afInAppEventParameterName == null) {
                AFLogger.AFInAppEventType("[GCD-E06] Context null");
                valueOf("Context null");
                this.AppsFlyer2dXConversionCallback.decrementAndGet();
                return;
            }
            final ai getLevel = this.getLevel;
            final String values2 = getLevel.values((Context)afInAppEventParameterName, getLevel.valueOf((Context)afInAppEventParameterName));
            String concat = null;
            Label_0144: {
                if (values2 != null) {
                    if (!bv.valueOf.contains(values2.toLowerCase())) {
                        concat = "-".concat(String.valueOf(values2));
                        break Label_0144;
                    }
                    AFLogger.AFLogger$LogLevel(0II.LIZ("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", new Object[] { values2 }));
                }
                concat = "";
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(0II.LIZ(bv.AFInAppEventType, new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName() }));
            sb.append(((Context)this.AFInAppEventParameterName).getPackageName());
            sb.append(concat);
            sb.append("?devkey=");
            sb.append(this.values);
            sb.append("&device_id=");
            sb.append(ak.AFInAppEventParameterName(new WeakReference<Context>((Context)this.AFInAppEventParameterName)));
            final String string = sb.toString();
            aj.AFInAppEventParameterName().AFInAppEventType("server_request", string, "");
            al.values("[GCD-B01] URL: ".concat(String.valueOf(string)));
            final long currentTimeMillis = System.currentTimeMillis();
            final HttpURLConnection httpURLConnection = (HttpURLConnection)INVOKEVIRTUAL_com_appsflyer_internal_bv_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(new URL(string));
            try {
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setRequestProperty("Connection", "close");
                httpURLConnection.connect();
                final int responseCode = httpURLConnection.getResponseCode();
                final String afInAppEventParameterName2 = ai.AFInAppEventParameterName(httpURLConnection);
                aj.AFInAppEventParameterName().AFInAppEventType("server_response", string, new String[] { String.valueOf(responseCode), afInAppEventParameterName2 });
                if (responseCode != 200 && responseCode != 404) {
                    if ((responseCode == 403 || responseCode >= 500) && this.AFVersionDeclaration < 2) {
                        final bv bv = new bv(this);
                        ai.AFInAppEventParameterName(bv.AFKeystoreWrapper, bv, 10L, TimeUnit.MILLISECONDS);
                    }
                    else {
                        valueOf("Error connection to server: ".concat(String.valueOf(responseCode)));
                    }
                }
                else {
                    o = new JSONObject();
                    ((JSONObject)o).put("net", System.currentTimeMillis() - currentTimeMillis);
                    ((JSONObject)o).put("retries", this.AFVersionDeclaration);
                    final au afLogger$LogLevel = this.getLevel.AFLogger$LogLevel;
                    o = ((JSONObject)o).toString();
                    INVOKEINTERFACE_com_appsflyer_internal_bv_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(afLogger$LogLevel.values.edit().putString("gcd", (String)o));
                    al.values("Attribution data: ".concat(String.valueOf(afInAppEventParameterName2)));
                    if (afInAppEventParameterName2.length() > 0) {
                        Map<String, Object> afKeystoreWrapper = bo.AFKeystoreWrapper(afInAppEventParameterName2);
                        o = afKeystoreWrapper.get("iscache");
                        if (responseCode == 404) {
                            afKeystoreWrapper.remove("error_reason");
                            afKeystoreWrapper.remove("status_code");
                            afKeystoreWrapper.put("af_status", "Organic");
                            afKeystoreWrapper.put("af_message", "organic install");
                        }
                        if (o != null && !(boolean)o) {
                            this.getLevel.valueOf((Context)this.AFInAppEventParameterName, "appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                        }
                        if (afKeystoreWrapper.containsKey("af_siteid")) {
                            if (afKeystoreWrapper.containsKey("af_channel")) {
                                o = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                ((StringBuilder)o).append(afKeystoreWrapper.get("af_channel"));
                                AFLogger.AFInAppEventType(o.toString());
                            }
                            else {
                                AFLogger.AFInAppEventType(0II.LIZ("[CrossPromotion] App was installed via %s's Cross Promotion", new Object[] { afKeystoreWrapper.get("af_siteid") }));
                            }
                        }
                        if (afKeystoreWrapper.containsKey("af_siteid")) {
                            o = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                            ((StringBuilder)o).append(afKeystoreWrapper.get("af_channel"));
                            AFLogger.AFInAppEventType(o.toString());
                        }
                        afKeystoreWrapper.put("is_first_launch", Boolean.FALSE);
                        o = new JSONObject((Map)afKeystoreWrapper);
                        o = ((JSONObject)o).toString();
                        if (o != null) {
                            ai.values((Context)this.AFInAppEventParameterName, "attributionId", (String)o);
                        }
                        else {
                            ai.values((Context)this.AFInAppEventParameterName, "attributionId", afInAppEventParameterName2);
                        }
                        if (ai.AFInAppEventType != null && this.AppsFlyer2dXConversionCallback.intValue() <= 1) {
                            try {
                                final Map<String, Object> afInAppEventType = bo.AFInAppEventType((Context)this.AFInAppEventParameterName);
                                if (!ai.values((Context)this.AFInAppEventParameterName).getBoolean("sixtyDayConversionData", false)) {
                                    afInAppEventType.put("is_first_launch", Boolean.TRUE);
                                }
                                afKeystoreWrapper = afInAppEventType;
                            }
                            catch (final bp bp) {
                                AFLogger.valueOf("Exception while trying to fetch attribution data. ", bp);
                            }
                            final StringBuilder sb2 = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
                            sb2.append(afKeystoreWrapper.toString());
                            AFLogger.AFInAppEventType(sb2.toString());
                            ai.AFInAppEventType.onConversionDataSuccess(afKeystoreWrapper);
                        }
                    }
                }
                this.AppsFlyer2dXConversionCallback.decrementAndGet();
                httpURLConnection.disconnect();
            }
            finally {}
        }
        finally {
            s = (String)o;
        }
        try {
            final Throwable t;
            if (this.AFVersionDeclaration < 2) {
                final bv bv2 = new bv(this);
                ai.AFInAppEventParameterName(bv2.AFKeystoreWrapper, bv2, 10L, TimeUnit.MILLISECONDS);
            }
            else {
                valueOf(t.getMessage());
            }
            AFLogger.valueOf(t.getMessage(), t);
            this.AppsFlyer2dXConversionCallback.decrementAndGet();
            if (s != null) {
                ((HttpURLConnection)s).disconnect();
            }
            this.AFKeystoreWrapper.shutdown();
            AFLogger.AFInAppEventType("[GCD-A03] Server retrieving attempt finished");
        }
        finally {
            this.AppsFlyer2dXConversionCallback.decrementAndGet();
            if (s != null) {
                ((HttpURLConnection)s).disconnect();
            }
        }
    }
}
