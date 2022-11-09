// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import android.content.SharedPreferences;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import com.appsflyer.deeplink.DeepLink;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.FutureTask;
import android.app.Application;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.concurrent.Callable;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import X.75k;
import java.net.HttpURLConnection;
import X.764;
import javax.net.ssl.HttpsURLConnection;
import android.webkit.WebView;
import X.75n;
import X.75s;
import X.75j;
import java.net.URLConnection;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import org.json.JSONException;
import org.json.JSONObject;
import X.46U;
import android.os.Build$VERSION;
import X.3xs;
import android.content.SharedPreferences$Editor;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import android.os.Bundle;
import android.net.Uri;
import com.appsflyer.AFLogger;
import java.util.Iterator;
import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import com.bytedance.covode.number.Covode;
import com.appsflyer.deeplink.DeepLinkListener;
import java.util.List;
import java.util.Map;
import android.content.Intent;

public final class i
{
    public static Intent AFInAppEventParameterName;
    public static final int AFInAppEventType;
    public static String[] AFKeystoreWrapper;
    public static i AFVersionDeclaration;
    public static String[] AppsFlyer2dXConversionCallback;
    public static volatile boolean values;
    public String AFLogger$LogLevel;
    public Map<String, String> getLevel;
    public List<List<String>> init;
    public DeepLinkListener valueOf;
    
    static {
        Covode.recordClassIndex(2698);
        AFInAppEventType = (int)TimeUnit.SECONDS.toMillis(2L);
    }
    
    public i() {
        this.init = new ArrayList<List<String>>();
    }
    
    private boolean AFInAppEventParameterName(final Intent intent, final Context context, final Map<String, Object> map) {
        final Uri uri = null;
        Uri data;
        if (intent != null && "android.intent.action.VIEW".equals(intent.getAction())) {
            data = intent.getData();
        }
        else {
            data = null;
        }
        final Intent afInAppEventParameterName = i.AFInAppEventParameterName;
        Uri data2;
        if (afInAppEventParameterName != null && "android.intent.action.VIEW".equals(afInAppEventParameterName.getAction())) {
            data2 = afInAppEventParameterName.getData();
        }
        else {
            data2 = null;
        }
        final Bundle invokevirtual_com_appsflyer_internal_i_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_appsflyer_internal_i_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
        final List<List<String>> init = this.init;
        Uri value = uri;
        Label_0099: {
            if (init != null) {
                value = uri;
                if (!init.isEmpty()) {
                    if (invokevirtual_com_appsflyer_internal_i_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null) {
                        value = uri;
                    }
                    else {
                        final Iterator<List<String>> iterator = this.init.iterator();
                        List list;
                        while (true) {
                            value = uri;
                            if (!iterator.hasNext()) {
                                break Label_0099;
                            }
                            list = iterator.next();
                            if (list == null) {
                                continue;
                            }
                            final Iterator iterator2 = list.iterator();
                            if (!iterator2.hasNext()) {
                                continue;
                            }
                            final String string = invokevirtual_com_appsflyer_internal_i_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.getString((String)iterator2.next());
                            if (string == null) {
                                continue;
                            }
                            value = this.valueOf(string, iterator2);
                            if (value != null) {
                                break;
                            }
                        }
                        final StringBuilder sb = new StringBuilder("Found deeplink in push payload at ");
                        sb.append(list.toString());
                        AFLogger.AFInAppEventType(sb.toString());
                        ai.valueOf(map).put("payloadKey", this.init);
                    }
                }
            }
        }
        if (data != null) {
            if (!intent.hasExtra("af_consumed")) {
                intent.putExtra("af_consumed", System.currentTimeMillis());
                this.AFKeystoreWrapper(context, map, data);
                return true;
            }
            final StringBuilder sb2 = new StringBuilder("skipping re-use of previously consumed deep link: ");
            sb2.append(data.toString());
            sb2.append(" w/af_consumed");
            AFLogger.valueOf(sb2.toString());
            return false;
        }
        else if (data2 != null) {
            if (!i.AFInAppEventParameterName.hasExtra("af_consumed")) {
                i.AFInAppEventParameterName.putExtra("af_consumed", System.currentTimeMillis());
                this.AFKeystoreWrapper(context, map, data2);
                return true;
            }
            final StringBuilder sb3 = new StringBuilder("skipping re-use of previously consumed trampoline deep link: ");
            sb3.append(data2.toString());
            sb3.append(" w/af_consumed");
            AFLogger.valueOf(sb3.toString());
            return false;
        }
        else {
            if (value == null) {
                AFLogger.AFInAppEventType("No deep link detected");
                return false;
            }
            if (!intent.hasExtra("af_consumed")) {
                intent.putExtra("af_consumed", System.currentTimeMillis());
                this.AFKeystoreWrapper(context, map, value);
                return true;
            }
            final StringBuilder sb4 = new StringBuilder("skipping re-use of previously consumed deep link from push: ");
            sb4.append(value.toString());
            sb4.append(" w/af_consumed");
            AFLogger.valueOf(sb4.toString());
            return false;
        }
    }
    
    public static Uri AFKeystoreWrapper(final Intent intent) {
        Uri data;
        if (intent != null && "android.intent.action.VIEW".equals(intent.getAction())) {
            data = intent.getData();
        }
        else {
            data = null;
        }
        return data;
    }
    
    public static boolean AFKeystoreWrapper(final String s) {
        if (i.AFKeystoreWrapper == null) {
            return false;
        }
        if (s.contains("af_tranid=")) {
            return false;
        }
        final StringBuilder sb = new StringBuilder("Validate if link ");
        sb.append(s);
        sb.append(" belongs to ESP domains: ");
        sb.append(Arrays.asList(i.AFKeystoreWrapper));
        AFLogger.AFInAppEventParameterName(sb.toString());
        try {
            return Arrays.asList(i.AFKeystoreWrapper).contains(new URL(s).getHost());
        }
        catch (final MalformedURLException ex) {
            return false;
        }
    }
    
    public static void INVOKEINTERFACE_com_appsflyer_internal_i_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(final SharedPreferences$Editor sharedPreferences$Editor) {
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
    
    public static Bundle INVOKEVIRTUAL_com_appsflyer_internal_i_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(final Intent intent) {
        try {
            return intent.getExtras();
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    private Uri valueOf(Object value, final Iterator<String> iterator) {
        while (value != JSONObject.NULL) {
            Label_0075: {
                if (!iterator.hasNext()) {
                    final Uri parse = Uri.parse(value.toString());
                    if (parse != null && parse.getScheme() != null && parse.getHost() != null) {
                        return parse;
                    }
                    break Label_0075;
                }
                try {
                    value = new JSONObject(value.toString()).get((String)iterator.next());
                    continue;
                    return null;
                }
                catch (final JSONException ex) {
                    return null;
                }
            }
        }
        return null;
    }
    
    public static i values() {
        if (i.AFVersionDeclaration == null) {
            i.AFVersionDeclaration = new i();
        }
        return i.AFVersionDeclaration;
    }
    
    public final void AFKeystoreWrapper(final Context context, final Map<String, Object> map, final Uri uri) {
        if (AFKeystoreWrapper(uri.toString())) {
            i.values = true;
            if (k.values == null) {
                k.values = new k();
            }
            final k values = k.values;
            if (values.AFInAppEventParameterName == null) {
                values.AFInAppEventParameterName = PThreadExecutorsUtils.newSingleThreadScheduledExecutor(values.AFInAppEventType);
            }
            values.AFInAppEventParameterName.execute(new Runnable() {
                static {
                    Covode.recordClassIndex(2699);
                }
                
                public static URLConnection INVOKEVIRTUAL_com_appsflyer_internal_i$2_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(final URL url) {
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
                
                public static Map<String, Object> values(final Uri uri) {
                    final HashMap hashMap = new HashMap();
                    try {
                        final StringBuilder sb = new StringBuilder("ESP deeplink resolving is started: ");
                        sb.append(uri.toString());
                        AFLogger.AFInAppEventType(sb.toString());
                        final HttpURLConnection httpURLConnection = (HttpURLConnection)INVOKEVIRTUAL_com_appsflyer_internal_i$2_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(new URL(uri.toString()));
                        httpURLConnection.setInstanceFollowRedirects(false);
                        httpURLConnection.setReadTimeout(i.AFInAppEventType);
                        httpURLConnection.setConnectTimeout(i.AFInAppEventType);
                        httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
                        httpURLConnection.setRequestProperty("af-esp", "6.4.0");
                        final int responseCode = httpURLConnection.getResponseCode();
                        hashMap.put("status", responseCode);
                        if (300 <= responseCode && responseCode <= 305) {
                            hashMap.put("res", httpURLConnection.getHeaderField("Location"));
                        }
                        httpURLConnection.disconnect();
                        AFLogger.AFInAppEventType("ESP deeplink resolving is finished");
                    }
                    finally {
                        final Throwable t;
                        hashMap.put("error", t.getLocalizedMessage());
                        AFLogger.valueOf(t.getMessage(), t);
                    }
                    return hashMap;
                }
                
                @Override
                public final void run() {
                    MethodCollector.i(71);
                    final long currentTimeMillis = System.currentTimeMillis();
                    String string = uri.toString();
                    final ArrayList list = new ArrayList();
                    int n = 0;
                    Number n2;
                    Object value;
                    do {
                        final Map<String, Object> values = values(Uri.parse(string));
                        string = (String)values.get("res");
                        n2 = values.get("status");
                        value = values.get("error");
                        if (string == null || !AFKeystoreWrapper(string)) {
                            break;
                        }
                        if (n < 4) {
                            list.add(string);
                        }
                    } while (++n < 5);
                    final HashMap hashMap = new HashMap();
                    String s;
                    if (string != null) {
                        s = string;
                    }
                    else {
                        s = "";
                    }
                    hashMap.put("res", s);
                    int intValue;
                    if (n2 != null) {
                        intValue = n2.intValue();
                    }
                    else {
                        intValue = -1;
                    }
                    hashMap.put("status", intValue);
                    if (value != null) {
                        hashMap.put("error", value);
                    }
                    if (!list.isEmpty()) {
                        hashMap.put("redirects", list);
                    }
                    hashMap.put("latency", System.currentTimeMillis() - currentTimeMillis);
                    Object o = map;
                    monitorenter(o);
                    try {
                        map.put("af_deeplink_r", hashMap);
                        map.put("af_deeplink", uri.toString());
                        monitorexit(o);
                        final ai value2 = ai.valueOf();
                        o = context;
                        final Map valueOf = map;
                        Uri uri;
                        if (string != null) {
                            uri = Uri.parse(string);
                        }
                        else {
                            uri = uri;
                        }
                        value2.valueOf((Context)o, valueOf, uri);
                        i.values = false;
                        MethodCollector.o(71);
                    }
                    finally {
                        monitorexit(o);
                        MethodCollector.o(71);
                    }
                }
            });
        }
        else {
            ai.valueOf().valueOf(context, map, uri);
        }
        i.AFInAppEventParameterName = null;
    }
    
    public final void AFKeystoreWrapper(Map<String, Object> futureTask, au au, final Intent intent, final Context context) {
        final SharedPreferences values = ai.values(context);
        Label_0231: {
            if (!this.AFInAppEventParameterName(intent, context, (Map<String, Object>)futureTask) && this.valueOf != null) {
                ai.valueOf();
                if (ai.AFInAppEventParameterName(values, "appsFlyerCount", false) == 0 && !values.getBoolean("ddl_sent", false)) {
                    au = (au)new ar(context, au);
                    AFLogger.AFInAppEventType("[DDL] start");
                    futureTask = new FutureTask<Object>((Callable<Object>)new Callable<DeepLinkResult>() {
                        public /* synthetic */ ar AFInAppEventParameterName = (ar)au;
                        
                        static {
                            Covode.recordClassIndex(2619);
                        }
                    });
                    new PthreadThread((Runnable)futureTask, "er/internal/i").start();
                    try {
                        ((ar)au).valueOf(futureTask.get(ar.onInstallConversionDataLoadedNative, TimeUnit.MILLISECONDS));
                        break Label_0231;
                    }
                    catch (final TimeoutException ex) {
                        final StringBuilder sb = new StringBuilder("[DDL] Timeout, didn't manage to find deferred deep link after ");
                        sb.append(((ar)au).onInstallConversionFailureNative);
                        sb.append(" attempt(s) within ");
                        sb.append(ar.onInstallConversionDataLoadedNative);
                        sb.append(" milliseconds");
                        AFLogger.AFInAppEventType(sb.toString());
                        ((ar)au).valueOf(new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT));
                        break Label_0231;
                    }
                    catch (final InterruptedException futureTask) {}
                    catch (final ExecutionException ex2) {}
                    AFLogger.values("[DDL] Error occurred", (Throwable)futureTask);
                    DeepLinkResult.Error error;
                    if (((Throwable)futureTask).getCause() instanceof IOException) {
                        error = DeepLinkResult.Error.NETWORK;
                    }
                    else {
                        error = DeepLinkResult.Error.UNEXPECTED;
                    }
                    ((ar)au).valueOf(new DeepLinkResult(null, error));
                }
            }
        }
        INVOKEINTERFACE_com_appsflyer_internal_i_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(values.edit().putBoolean("ddl_sent", true));
    }
}
