// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import android.content.ContextWrapper;
import android.content.pm.PackageItemInfo;
import X.6rk;
import java.io.OutputStream;
import android.net.Uri$Builder;
import com.appsflyer.deeplink.DeepLinkListener;
import java.util.concurrent.ThreadPoolExecutor;
import android.os.Build;
import android.net.Uri;
import com.appsflyer.deeplink.DeepLinkResult;
import java.net.URI;
import com.appsflyer.compat.function.Consumer;
import com.android.billingclient.api.Purchase;
import com.appsflyer.compat.function.Function;
import java.util.List;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import org.json.JSONException;
import org.json.JSONArray;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import X.6Fr;
import android.view.WindowManager;
import java.util.HashMap;
import android.net.NetworkCapabilities;
import android.net.Network;
import java.util.Collections;
import java.net.NetworkInterface;
import android.net.ConnectivityManager;
import X.5an;
import android.provider.Settings$Secure;
import X.5dv;
import X.5aq;
import X.75k;
import X.764;
import javax.net.ssl.HttpsURLConnection;
import android.webkit.WebView;
import X.75n;
import X.75s;
import X.75j;
import java.net.URLConnection;
import android.content.pm.PackageInfo;
import X.6Tl;
import X.NQO;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import X.5WL;
import java.lang.reflect.Field;
import X.6G9;
import X.6Nw;
import X.2Lq;
import android.os.Handler;
import android.os.Looper;
import android.content.ClipboardManager;
import X.2JT;
import com.bytedance.sysoptimizer.ReceiverRegisterLancet;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import X.6uu;
import X.6v3;
import X.6ut;
import X.6v6;
import java.util.concurrent.ExecutorService;
import X.2bx;
import android.text.TextUtils;
import android.content.ContentResolver;
import X.46U;
import X.3xs;
import android.content.pm.PackageManager$NameNotFoundException;
import com.google.android.gms.common.GoogleApiAvailability;
import X.0II;
import java.util.Locale;
import java.io.DataOutputStream;
import java.net.URL;
import java.security.KeyStoreException;
import java.lang.ref.WeakReference;
import com.appsflyer.AFKeystoreWrapper;
import android.os.Build$VERSION;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.os.Bundle;
import android.content.Intent;
import android.app.Activity;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.ConcurrentHashMap;
import android.content.Context;
import java.util.concurrent.RejectedExecutionException;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.attribution.RequestError;
import java.io.IOException;
import com.appsflyer.AppsFlyerProperties;
import org.json.JSONObject;
import android.util.Base64;
import com.appsflyer.AFLogger;
import java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Collection;
import java.util.Arrays;
import java.util.ArrayList;
import android.content.SharedPreferences$Editor;
import com.appsflyer.AFVersionDeclaration;
import java.util.concurrent.TimeUnit;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;
import android.app.Application;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;

public final class ai extends AppsFlyerLib
{
    public static final String AFInAppEventParameterName;
    public static AppsFlyerConversionListener AFInAppEventType;
    public static AppsFlyerInAppPurchaseValidatorListener AFKeystoreWrapper;
    public static ai onAppOpenAttribution;
    public static String onAttributionFailure;
    public static String onAttributionFailureNative;
    public static String onConversionDataFail;
    public static String onDeepLinking;
    public static final String onDeepLinkingNative;
    public static String onInstallConversionDataLoadedNative;
    public static String onInstallConversionFailureNative;
    public static final String valueOf;
    public static final String values;
    public au AFLogger$LogLevel;
    public String AFVersionDeclaration;
    public long AppsFlyer2dXConversionCallback;
    public long AppsFlyerConversionListener;
    public boolean AppsFlyerInAppPurchaseValidatorListener;
    public ScheduledExecutorService AppsFlyerLib;
    public final an enableLocationCollection;
    public Map<Long, String> getInstance;
    public String getLevel;
    public String getOutOfStore;
    public String getSdkVersion;
    public cl[] init;
    public l onAppOpenAttributionNative;
    public long onConversionDataSuccess;
    public long onPause;
    public long onValidateInApp;
    public long onValidateInAppFailure;
    public SharedPreferences sendPushNotificationData;
    public final be setAdditionalData;
    public Application setAndroidIdData;
    public final Executor setAppInviteOneLink;
    public boolean setCustomerIdAndLogSession;
    public Map<String, Object> setCustomerUserId;
    public boolean setDebugLog;
    public boolean setImeiData;
    public boolean setOaidData;
    public cm setOutOfStore;
    public boolean setPhoneNumber;
    public bb setUserEmails;
    public boolean stop;
    public boolean updateServerUninstallToken;
    public Map<String, Object> waitForCustomerUserId;
    
    static {
        Covode.recordClassIndex(2590);
        AFInAppEventParameterName = "119";
        valueOf = "6.4";
        ai.onInstallConversionFailureNative = "https://%sstats.%s/stats";
        final StringBuilder sb = new StringBuilder();
        sb.append("6.4");
        sb.append("/androidevent?buildnumber=6.4.0&app_id=");
        values = sb.toString();
        final StringBuilder sb2 = new StringBuilder("https://%sadrevenue.%s/api/v");
        sb2.append("6.4");
        sb2.append("/android?buildnumber=6.4.0&app_id=");
        ai.onAttributionFailureNative = sb2.toString();
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("6.4");
        sb3.append("/androidevent?app_id=");
        final String s = onDeepLinkingNative = sb3.toString();
        final StringBuilder sb4 = new StringBuilder("https://%sconversions.%s/api/v");
        sb4.append(s);
        ai.onInstallConversionDataLoadedNative = sb4.toString();
        final StringBuilder sb5 = new StringBuilder("https://%slaunches.%s/api/v");
        sb5.append(s);
        ai.onConversionDataFail = sb5.toString();
        final StringBuilder sb6 = new StringBuilder("https://%sinapps.%s/api/v");
        sb6.append(s);
        ai.onAttributionFailure = sb6.toString();
        final StringBuilder sb7 = new StringBuilder("https://%sattr.%s/api/v");
        sb7.append(s);
        ai.onDeepLinking = sb7.toString();
        ai.AFKeystoreWrapper = null;
        ai.AFInAppEventType = null;
        ai.onAppOpenAttribution = new ai();
    }
    
    public ai() {
        this.onConversionDataSuccess = -1L;
        this.onValidateInApp = -1L;
        this.AppsFlyerConversionListener = TimeUnit.SECONDS.toMillis(5L);
        this.AppsFlyerInAppPurchaseValidatorListener = false;
        this.AppsFlyerLib = null;
        this.updateServerUninstallToken = false;
        this.enableLocationCollection = new an();
        this.setDebugLog = false;
        this.setImeiData = false;
        this.setPhoneNumber = false;
        this.setCustomerIdAndLogSession = false;
        this.setAppInviteOneLink = INVOKESTATIC_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor();
        com.appsflyer.AFVersionDeclaration.init();
        this.setAdditionalData = new be();
    }
    
    public static int AFInAppEventParameterName(final SharedPreferences sharedPreferences, final String s, final boolean b) {
        int int1;
        final int n = int1 = sharedPreferences.getInt(s, 0);
        if (b) {
            int1 = n + 1;
            final SharedPreferences$Editor edit = sharedPreferences.edit();
            edit.putInt(s, int1);
            INVOKEINTERFACE_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(edit);
        }
        if (aj.AFInAppEventParameterName().getLevel()) {
            aj.AFInAppEventParameterName().AFInAppEventType(String.valueOf(int1));
        }
        return int1;
    }
    
    public static /* synthetic */ long AFInAppEventParameterName(final ai ai) {
        return ai.onPause;
    }
    
    public static /* synthetic */ long AFInAppEventParameterName(final ai ai, final long onValidateInAppFailure) {
        return ai.onValidateInAppFailure = onValidateInAppFailure;
    }
    
    public static String AFInAppEventParameterName(final String s) {
        if (s == null) {
            return null;
        }
        String replace = s;
        if (s.matches("fb\\d*?://authorize.*")) {
            replace = s;
            if (s.contains("access_token")) {
                final int index = s.indexOf(63);
                String substring;
                if (index == -1) {
                    substring = "";
                }
                else {
                    substring = s.substring(index);
                }
                if (substring.length() == 0) {
                    return s;
                }
                ArrayList list = new ArrayList();
                if (substring.contains("&")) {
                    list = new ArrayList(Arrays.asList(substring.split("&")));
                }
                else {
                    list.add(substring);
                }
                final StringBuilder sb = new StringBuilder();
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    final String s2 = (String)iterator.next();
                    if (s2.contains("access_token")) {
                        iterator.remove();
                    }
                    else {
                        if (sb.length() != 0) {
                            sb.append("&");
                        }
                        else if (!s2.startsWith("?")) {
                            sb.append("?");
                        }
                        sb.append(s2);
                    }
                }
                replace = s.replace(substring, sb.toString());
            }
        }
        return replace;
    }
    
    public static String AFInAppEventParameterName(final HttpURLConnection p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //     6: new             Ljava/lang/StringBuilder;
        //     9: dup            
        //    10: invokespecial   java/lang/StringBuilder.<init>:()V
        //    13: astore_1       
        //    14: aconst_null    
        //    15: astore_2       
        //    16: aload_0        
        //    17: invokevirtual   java/net/HttpURLConnection.getErrorStream:()Ljava/io/InputStream;
        //    20: astore_3       
        //    21: aload_3        
        //    22: astore          4
        //    24: aload_3        
        //    25: ifnonnull       34
        //    28: aload_0        
        //    29: invokevirtual   java/net/URLConnection.getInputStream:()Ljava/io/InputStream;
        //    32: astore          4
        //    34: new             Ljava/io/InputStreamReader;
        //    37: astore_3       
        //    38: aload_3        
        //    39: aload           4
        //    41: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //    44: new             Ljava/io/BufferedReader;
        //    47: astore          5
        //    49: aload           5
        //    51: aload_3        
        //    52: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    55: iconst_0       
        //    56: istore          6
        //    58: aload           5
        //    60: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //    63: astore_2       
        //    64: aload_2        
        //    65: ifnull          110
        //    68: iload           6
        //    70: ifeq            76
        //    73: goto            84
        //    76: ldc_w           ""
        //    79: astore          4
        //    81: goto            91
        //    84: bipush          10
        //    86: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    89: astore          4
        //    91: aload_1        
        //    92: aload           4
        //    94: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    97: pop            
        //    98: aload_1        
        //    99: aload_2        
        //   100: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   103: pop            
        //   104: iconst_1       
        //   105: istore          6
        //   107: goto            58
        //   110: aload           5
        //   112: invokevirtual   java/io/Reader.close:()V
        //   115: aload_3        
        //   116: invokevirtual   java/io/Reader.close:()V
        //   119: goto            199
        //   122: astore          4
        //   124: aload           5
        //   126: astore_2       
        //   127: goto            139
        //   130: astore          4
        //   132: goto            139
        //   135: astore          4
        //   137: aconst_null    
        //   138: astore_3       
        //   139: new             Ljava/lang/StringBuilder;
        //   142: astore          5
        //   144: aload           5
        //   146: ldc_w           "Could not read connection response from: "
        //   149: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   152: aload           5
        //   154: aload_0        
        //   155: invokevirtual   java/net/URLConnection.getURL:()Ljava/net/URL;
        //   158: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   161: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   164: pop            
        //   165: aload           5
        //   167: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   170: aload           4
        //   172: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   175: aload_2        
        //   176: ifnull          183
        //   179: aload_2        
        //   180: invokevirtual   java/io/Reader.close:()V
        //   183: aload_3        
        //   184: ifnull          199
        //   187: aload_3        
        //   188: invokevirtual   java/io/Reader.close:()V
        //   191: goto            199
        //   194: astore_0       
        //   195: aload_0        
        //   196: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/Throwable;)V
        //   199: aload_1        
        //   200: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   203: astore_0       
        //   204: new             Lorg/json/JSONObject;
        //   207: dup            
        //   208: aload_0        
        //   209: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //   212: pop            
        //   213: sipush          3597
        //   216: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   219: aload_0        
        //   220: areturn        
        //   221: astore          4
        //   223: new             Lorg/json/JSONObject;
        //   226: dup            
        //   227: invokespecial   org/json/JSONObject.<init>:()V
        //   230: astore          4
        //   232: aload           4
        //   234: ldc_w           "string_response"
        //   237: aload_0        
        //   238: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   241: pop            
        //   242: aload           4
        //   244: invokevirtual   org/json/JSONObject.toString:()Ljava/lang/String;
        //   247: astore_0       
        //   248: sipush          3597
        //   251: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   254: aload_0        
        //   255: areturn        
        //   256: astore_0       
        //   257: new             Lorg/json/JSONObject;
        //   260: dup            
        //   261: invokespecial   org/json/JSONObject.<init>:()V
        //   264: invokevirtual   org/json/JSONObject.toString:()Ljava/lang/String;
        //   267: astore_0       
        //   268: sipush          3597
        //   271: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   274: aload_0        
        //   275: areturn        
        //   276: astore_0       
        //   277: aload_2        
        //   278: ifnull          285
        //   281: aload_2        
        //   282: invokevirtual   java/io/Reader.close:()V
        //   285: aload_3        
        //   286: ifnull          303
        //   289: aload_3        
        //   290: invokevirtual   java/io/Reader.close:()V
        //   293: goto            303
        //   296: astore          4
        //   298: aload           4
        //   300: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/Throwable;)V
        //   303: sipush          3597
        //   306: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   309: aload_0        
        //   310: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  16     21     135    139    Any
        //  28     34     135    139    Any
        //  34     44     135    139    Any
        //  44     55     130    135    Any
        //  58     64     122    130    Any
        //  84     91     122    130    Any
        //  91     104    122    130    Any
        //  110    119    194    199    Any
        //  139    175    276    311    Any
        //  179    183    194    199    Any
        //  187    191    194    199    Any
        //  204    213    221    276    Lorg/json/JSONException;
        //  232    248    256    276    Lorg/json/JSONException;
        //  281    285    296    303    Any
        //  289    293    296    303    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0110:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static String AFInAppEventParameterName(final SimpleDateFormat simpleDateFormat, final long n) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date(n));
    }
    
    public static /* synthetic */ void AFInAppEventParameterName(final ai ai, final j j) {
        final StringBuilder sb = new StringBuilder("url: ");
        sb.append(j.onAppOpenAttributionNative);
        AFLogger.valueOf(sb.toString());
        String encodeToString;
        if (j.getLevel != null) {
            encodeToString = Base64.encodeToString(j.valueOf(), 2);
            AFLogger.valueOf("cached data: ".concat(String.valueOf(encodeToString)));
        }
        else {
            final String string = new JSONObject((Map)j.AFInAppEventParameterName()).toString();
            final String replaceAll = string.replaceAll("\\p{C}", "*Non-printing character*");
            encodeToString = string;
            if (!replaceAll.equals(string)) {
                AFLogger.AFLogger$LogLevel("Payload contains non-printing characters");
                encodeToString = replaceAll;
            }
            al.values("data: ".concat(String.valueOf(encodeToString)));
        }
        aj.AFInAppEventParameterName().AFInAppEventType("server_request", j.onAppOpenAttributionNative, encodeToString);
        try {
            ai.AFKeystoreWrapper(j);
        }
        catch (final IOException ex) {
            AFLogger.valueOf("Exception in sendRequestToServer. ", ex);
            if (AppsFlyerProperties.getInstance().getBoolean("useHttpFallback", false)) {
                j.valueOf(j.onAppOpenAttributionNative.replace("https:", "http:"));
                ai.AFKeystoreWrapper(j);
                return;
            }
            final StringBuilder sb2 = new StringBuilder("failed to send request to server. ");
            sb2.append(ex.getLocalizedMessage());
            AFLogger.valueOf(sb2.toString());
            throw ex;
        }
    }
    
    private void AFInAppEventParameterName(final j j) {
        final boolean b = j.AFLogger$LogLevel == null;
        if (this.AFInAppEventType()) {
            AFLogger.values("CustomerUserId not set, reporting is disabled", true);
            return;
        }
        if (b) {
            if (AppsFlyerProperties.getInstance().getBoolean("launchProtectEnabled", true)) {
                if (this.AFKeystoreWrapper()) {
                    final AppsFlyerRequestListener afInAppEventParameterName = j.AFInAppEventParameterName;
                    if (afInAppEventParameterName != null) {
                        afInAppEventParameterName.onError(RequestError.EVENT_TIMEOUT, az.AFKeystoreWrapper);
                    }
                    return;
                }
            }
            else {
                AFLogger.valueOf("Allowing multiple launches within a 5 second time window.");
            }
            this.onConversionDataSuccess = System.currentTimeMillis();
        }
        if (k.values == null) {
            k.values = new k();
        }
        AFInAppEventParameterName(k.values.AFInAppEventType(), new b(j, (byte)0), 0L, TimeUnit.MILLISECONDS);
    }
    
    public static void AFInAppEventParameterName(final ScheduledExecutorService scheduledExecutorService, final Runnable runnable, final long n, final TimeUnit timeUnit) {
        Label_0034: {
            if (scheduledExecutorService == null) {
                break Label_0034;
            }
            try {
                if (!scheduledExecutorService.isShutdown() && !scheduledExecutorService.isTerminated()) {
                    scheduledExecutorService.schedule(runnable, n, timeUnit);
                    return;
                }
                AFLogger.AFLogger$LogLevel("scheduler is null, shut downed or terminated");
            }
            catch (final RejectedExecutionException ex) {
                AFLogger.valueOf("scheduleJob failed with RejectedExecutionException Exception", ex);
            }
            finally {
                final Throwable t;
                AFLogger.valueOf("scheduleJob failed with Exception", t);
            }
        }
    }
    
    private boolean AFInAppEventParameterName() {
        final Map<String, Object> setCustomerUserId = this.setCustomerUserId;
        return setCustomerUserId != null && !setCustomerUserId.isEmpty();
    }
    
    private boolean AFInAppEventParameterName(final Context context) {
        try {
            Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
            final long currentTimeMillis = System.currentTimeMillis();
            this.waitForCustomerUserId = new ConcurrentHashMap<String, Object>();
            final y.a a = new y.a() {
                static {
                    Covode.recordClassIndex(2591);
                }
                
                @Override
                public final void AFInAppEventType(final String s, final String s2) {
                    ai.AFKeystoreWrapper(ai.this).put("signedData", s);
                    ai.AFKeystoreWrapper(ai.this).put("signature", s2);
                    ai.AFKeystoreWrapper(ai.this).put("ttr", System.currentTimeMillis() - currentTimeMillis);
                    AFLogger.valueOf("Successfully retrieved Google LVL data.");
                }
                
                @Override
                public final void AFKeystoreWrapper(final String s, final Exception ex) {
                    String message;
                    if ((message = ex.getMessage()) == null) {
                        message = "unknown";
                    }
                    ai.AFKeystoreWrapper(ai.this).put("error", message);
                    AFLogger.values(s, ex);
                }
            };
            try {
                final Class<?> forName = Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
                final Class<?> forName2 = Class.forName("com.appsflyer.lvl.AppsFlyerLVL$resultListener");
                forName.getMethod("checkLicense", Long.TYPE, Context.class, forName2).invoke(null, currentTimeMillis, context, Proxy.newProxyInstance(forName2.getClassLoader(), new Class[] { forName2 }, new InvocationHandler() {
                    public /* synthetic */ a AFKeystoreWrapper = a;
                    
                    static {
                        Covode.recordClassIndex(2719);
                    }
                    
                    @Override
                    public final Object invoke(final Object o, final Method method, final Object[] array) {
                        if (method.getName().equals("onLvlResult")) {
                            String s;
                            if (array[0] != null) {
                                s = (String)array[0];
                            }
                            else {
                                s = null;
                            }
                            String s2;
                            if (array[1] != null) {
                                s2 = (String)array[1];
                            }
                            else {
                                s2 = null;
                            }
                            final a afKeystoreWrapper = this.AFKeystoreWrapper;
                            if (afKeystoreWrapper != null) {
                                if (s != null && s2 != null) {
                                    afKeystoreWrapper.AFInAppEventType(s, s2);
                                }
                                else if (s2 == null) {
                                    afKeystoreWrapper.AFKeystoreWrapper("onLvlResult with error", new Exception("AFLVL Invalid signature"));
                                }
                                else {
                                    afKeystoreWrapper.AFKeystoreWrapper("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
                                }
                            }
                            else {
                                AFLogger.AFInAppEventType("onLvlResult invocation succeeded, but listener is null");
                            }
                        }
                        else if (method.getName().equals("onLvlFailure")) {
                            final a afKeystoreWrapper2 = this.AFKeystoreWrapper;
                            if (afKeystoreWrapper2 != null) {
                                if (array[0] != null) {
                                    afKeystoreWrapper2.AFKeystoreWrapper("onLvlFailure with exception", (Exception)array[0]);
                                }
                                else {
                                    afKeystoreWrapper2.AFKeystoreWrapper("onLvlFailure", new Exception("unknown"));
                                }
                            }
                            else {
                                AFLogger.AFInAppEventType("onLvlFailure: listener is null");
                            }
                        }
                        else {
                            final a afKeystoreWrapper3 = this.AFKeystoreWrapper;
                            if (afKeystoreWrapper3 != null) {
                                afKeystoreWrapper3.AFKeystoreWrapper("lvlInvocation failed", new Exception("com.appsflyer.lvl.AppsFlyerLVL$resultListener invocation failed"));
                            }
                        }
                        return null;
                    }
                }));
            }
            catch (final InvocationTargetException ex) {
                a.AFKeystoreWrapper(ex.getClass().getSimpleName(), ex);
            }
            catch (final IllegalAccessException ex2) {
                a.AFKeystoreWrapper(ex2.getClass().getSimpleName(), ex2);
            }
            catch (final NoSuchMethodException ex3) {
                a.AFKeystoreWrapper(ex3.getClass().getSimpleName(), ex3);
            }
            catch (final ClassNotFoundException ex4) {
                a.AFKeystoreWrapper(ex4.getClass().getSimpleName(), ex4);
            }
            return true;
        }
        catch (final ClassNotFoundException ex5) {
            return false;
        }
    }
    
    public static boolean AFInAppEventParameterName(final File file) {
        return file == null || !file.exists();
    }
    
    public static boolean AFInAppEventParameterName(final String s, final boolean b) {
        return AppsFlyerProperties.getInstance().getBoolean(s, b);
    }
    
    public static /* synthetic */ long AFInAppEventType(final ai ai) {
        return ai.onValidateInAppFailure;
    }
    
    public static String AFInAppEventType(final Activity activity) {
        final String s = null;
        final String s2 = null;
        String s3 = s;
        if (activity != null) {
            final Intent intent = activity.getIntent();
            s3 = s;
            if (intent != null) {
                s3 = s2;
                try {
                    final Bundle invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
                    s3 = s;
                    if (invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras != null) {
                        s3 = s2;
                        final String string = invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.getString("af");
                        if ((s3 = string) != null) {
                            s3 = string;
                            AFLogger.valueOf("Push Notification received af payload = ".concat(String.valueOf(string)));
                            s3 = string;
                            invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.remove("af");
                            s3 = string;
                            activity.setIntent(intent.putExtras(invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras));
                            s3 = string;
                        }
                    }
                }
                finally {
                    final Throwable t;
                    AFLogger.valueOf(t.getMessage(), t);
                }
            }
        }
        return s3;
    }
    
    private String AFInAppEventType(final SimpleDateFormat simpleDateFormat, final Context context) {
        String string;
        if ((string = values(context).getString("appsFlyerFirstInstall", (String)null)) == null) {
            String format;
            if (AFInAppEventType(context)) {
                AFLogger.AFInAppEventType("AppsFlyer: first launch detected");
                format = simpleDateFormat.format(new Date());
            }
            else {
                format = "";
            }
            final SharedPreferences$Editor edit = values(context).edit();
            edit.putString("appsFlyerFirstInstall", format);
            INVOKEINTERFACE_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(edit);
            string = format;
        }
        AFLogger.valueOf("AppsFlyer: first launch date: ".concat(String.valueOf(string)));
        return string;
    }
    
    public static void AFInAppEventType(final JSONObject p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/util/ArrayList.<init>:()V
        //     7: astore_1       
        //     8: aload_0        
        //     9: invokevirtual   org/json/JSONObject.keys:()Ljava/util/Iterator;
        //    12: astore_2       
        //    13: aload_2        
        //    14: invokeinterface java/util/Iterator.hasNext:()Z
        //    19: istore_3       
        //    20: iconst_0       
        //    21: istore          4
        //    23: iload_3        
        //    24: ifeq            90
        //    27: aload_2        
        //    28: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    33: checkcast       Ljava/lang/String;
        //    36: astore          5
        //    38: new             Lorg/json/JSONArray;
        //    41: astore          6
        //    43: aload           6
        //    45: aload_0        
        //    46: aload           5
        //    48: invokevirtual   org/json/JSONObject.get:(Ljava/lang/String;)Ljava/lang/Object;
        //    51: checkcast       Ljava/lang/String;
        //    54: invokespecial   org/json/JSONArray.<init>:(Ljava/lang/String;)V
        //    57: iload           4
        //    59: aload           6
        //    61: invokevirtual   org/json/JSONArray.length:()I
        //    64: if_icmpge       13
        //    67: aload_1        
        //    68: aload           6
        //    70: iload           4
        //    72: invokevirtual   org/json/JSONArray.getLong:(I)J
        //    75: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    78: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    83: pop            
        //    84: iinc            4, 1
        //    87: goto            57
        //    90: aload_1        
        //    91: invokestatic    java/util/Collections.sort:(Ljava/util/List;)V
        //    94: aload_0        
        //    95: invokevirtual   org/json/JSONObject.keys:()Ljava/util/Iterator;
        //    98: astore          7
        //   100: aconst_null    
        //   101: astore          6
        //   103: aload           7
        //   105: invokeinterface java/util/Iterator.hasNext:()Z
        //   110: ifeq            279
        //   113: aload           6
        //   115: ifnonnull       284
        //   118: aload           7
        //   120: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   125: checkcast       Ljava/lang/String;
        //   128: astore          8
        //   130: aload           6
        //   132: astore          5
        //   134: new             Lorg/json/JSONArray;
        //   137: astore          9
        //   139: aload           6
        //   141: astore          5
        //   143: aload           9
        //   145: aload_0        
        //   146: aload           8
        //   148: invokevirtual   org/json/JSONObject.get:(Ljava/lang/String;)Ljava/lang/Object;
        //   151: checkcast       Ljava/lang/String;
        //   154: invokespecial   org/json/JSONArray.<init>:(Ljava/lang/String;)V
        //   157: iconst_0       
        //   158: istore          4
        //   160: aload           6
        //   162: astore_2       
        //   163: aload_2        
        //   164: astore          6
        //   166: aload_2        
        //   167: astore          5
        //   169: iload           4
        //   171: aload           9
        //   173: invokevirtual   org/json/JSONArray.length:()I
        //   176: if_icmpge       103
        //   179: aload_2        
        //   180: astore          5
        //   182: aload           9
        //   184: iload           4
        //   186: invokevirtual   org/json/JSONArray.getLong:(I)J
        //   189: aload_1        
        //   190: iconst_0       
        //   191: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   196: checkcast       Ljava/lang/Number;
        //   199: invokevirtual   java/lang/Number.longValue:()J
        //   202: lcmp           
        //   203: ifeq            100
        //   206: aload_2        
        //   207: astore          5
        //   209: aload           9
        //   211: iload           4
        //   213: invokevirtual   org/json/JSONArray.getLong:(I)J
        //   216: aload_1        
        //   217: iconst_1       
        //   218: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   223: checkcast       Ljava/lang/Number;
        //   226: invokevirtual   java/lang/Number.longValue:()J
        //   229: lcmp           
        //   230: ifeq            100
        //   233: aload_2        
        //   234: astore          5
        //   236: aload           9
        //   238: iload           4
        //   240: invokevirtual   org/json/JSONArray.getLong:(I)J
        //   243: aload_1        
        //   244: aload_1        
        //   245: invokeinterface java/util/List.size:()I
        //   250: iconst_1       
        //   251: isub           
        //   252: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   257: checkcast       Ljava/lang/Number;
        //   260: invokevirtual   java/lang/Number.longValue:()J
        //   263: lcmp           
        //   264: ifne            270
        //   267: goto            100
        //   270: iinc            4, 1
        //   273: aload           8
        //   275: astore_2       
        //   276: goto            163
        //   279: aload           6
        //   281: ifnull          291
        //   284: aload_0        
        //   285: aload           6
        //   287: invokevirtual   org/json/JSONObject.remove:(Ljava/lang/String;)Ljava/lang/Object;
        //   290: pop            
        //   291: return         
        //   292: astore          6
        //   294: goto            13
        //   297: astore_2       
        //   298: aload           5
        //   300: astore          6
        //   302: goto            103
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  38     57     292    297    Lorg/json/JSONException;
        //  57     84     292    297    Lorg/json/JSONException;
        //  134    139    297    305    Lorg/json/JSONException;
        //  143    157    297    305    Lorg/json/JSONException;
        //  169    179    297    305    Lorg/json/JSONException;
        //  182    206    297    305    Lorg/json/JSONException;
        //  209    233    297    305    Lorg/json/JSONException;
        //  236    267    297    305    Lorg/json/JSONException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0163:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static boolean AFInAppEventType(final Context context) {
        return !values(context).contains("appsFlyerCount");
    }
    
    public static /* synthetic */ long AFKeystoreWrapper(final ai ai, final long onPause) {
        return ai.onPause = onPause;
    }
    
    public static File AFKeystoreWrapper(final String s) {
        if (s != null) {
            try {
                if (s.trim().length() > 0) {
                    return new File(s.trim());
                }
            }
            finally {
                final Throwable t;
                AFLogger.valueOf(t.getMessage(), t);
            }
        }
        return null;
    }
    
    public static /* synthetic */ Map AFKeystoreWrapper(final ai ai) {
        return ai.waitForCustomerUserId;
    }
    
    public static void AFKeystoreWrapper(Context afInAppEventParameterName) {
        MethodCollector.i(4304);
        Label_0281: {
            if (!ac.AFInAppEventParameterName()) {
                break Label_0281;
            }
            int n = 23;
            AFLogger.AFInAppEventParameterName("OPPO device found");
        Label_0116_Outer:
            while (true) {
                if (Build$VERSION.SDK_INT < n || AFInAppEventParameterName("keyPropDisableAFKeystore", true)) {
                    break Label_0281;
                }
                final StringBuilder sb = new StringBuilder("OS SDK is=");
                sb.append(Build$VERSION.SDK_INT);
                sb.append("; use KeyStore");
                AFLogger.AFInAppEventParameterName(sb.toString());
                final AFKeystoreWrapper afKeystoreWrapper = new AFKeystoreWrapper(afInAppEventParameterName);
                while (true) {
                    Label_0156: {
                        if (afKeystoreWrapper.values()) {
                            break Label_0156;
                        }
                        afKeystoreWrapper.valueOf = ak.AFInAppEventParameterName(new WeakReference<Context>(afInAppEventParameterName));
                        afKeystoreWrapper.values = 0;
                        afKeystoreWrapper.AFKeystoreWrapper(afKeystoreWrapper.AFInAppEventType());
                        AppsFlyerProperties.getInstance().set("KSAppsFlyerId", afKeystoreWrapper.AFInAppEventParameterName());
                        AppsFlyerProperties.getInstance().set("KSAppsFlyerRICounter", String.valueOf(afKeystoreWrapper.valueOf()));
                        MethodCollector.o(4304);
                        return;
                    }
                    final String afInAppEventType = afKeystoreWrapper.AFInAppEventType();
                    afInAppEventParameterName = (Context)afKeystoreWrapper.AFInAppEventParameterName;
                    monitorenter(afInAppEventParameterName);
                    try {
                        ++afKeystoreWrapper.values;
                        AFLogger.valueOf("Deleting key with alias: ".concat(String.valueOf(afInAppEventType)));
                        try {
                            final Object afInAppEventParameterName2 = afKeystoreWrapper.AFInAppEventParameterName;
                            monitorenter(afInAppEventParameterName2);
                            try {
                                afKeystoreWrapper.AFKeystoreWrapper.deleteEntry(afInAppEventType);
                                monitorexit(afInAppEventParameterName2);
                            }
                            finally {
                                monitorexit(afInAppEventParameterName2);
                                MethodCollector.o(4304);
                            }
                        }
                        catch (final KeyStoreException ex) {
                            final StringBuilder sb2 = new StringBuilder("Exception ");
                            sb2.append(ex.getMessage());
                            sb2.append(" occurred");
                            AFLogger.valueOf(sb2.toString(), ex);
                        }
                        monitorexit(afInAppEventParameterName);
                        afKeystoreWrapper.AFKeystoreWrapper(afKeystoreWrapper.AFInAppEventType());
                        continue;
                        n = 18;
                        continue Label_0116_Outer;
                    }
                    finally {
                        monitorexit(afInAppEventParameterName);
                        MethodCollector.o(4304);
                    }
                    break;
                }
                break;
            }
        }
        final StringBuilder sb3 = new StringBuilder("OS SDK is=");
        sb3.append(Build$VERSION.SDK_INT);
        sb3.append("; no KeyStore usage");
        AFLogger.AFInAppEventParameterName(sb3.toString());
        MethodCollector.o(4304);
    }
    
    public static void AFKeystoreWrapper(final Context context, final Map<String, ? super String> map) {
        final u.a value = u.valueOf(context);
        map.put("network", value.AFInAppEventParameterName);
        if (value.values != null) {
            map.put("operator", value.values);
        }
        if (value.AFKeystoreWrapper != null) {
            map.put("carrier", value.AFKeystoreWrapper);
        }
    }
    
    private void AFKeystoreWrapper(final j j) {
        MethodCollector.i(3467);
        final URL url = new URL(j.onAppOpenAttributionNative);
        final byte[] value = j.valueOf();
        final String appsFlyer2dXConversionCallback = j.AppsFlyer2dXConversionCallback;
        final String getLevel = j.getLevel;
        final boolean afKeystoreWrapper = j.AFKeystoreWrapper();
        final Application valueOf = j.valueOf;
        final AppsFlyerRequestListener afInAppEventParameterName = j.AFInAppEventParameterName;
        boolean b;
        if (afKeystoreWrapper && j.onAttributionFailureNative == 1) {
            b = true;
        }
        else {
            b = false;
        }
        if (this.AFLogger$LogLevel == null) {
            this.AFLogger$LogLevel = new au((Context)valueOf);
        }
        final au afLogger$LogLevel = this.AFLogger$LogLevel;
        long currentTimeMillis;
        if (b) {
            afLogger$LogLevel.AFKeystoreWrapper.put("from_fg", System.currentTimeMillis() - this.onValidateInAppFailure);
            currentTimeMillis = System.currentTimeMillis();
        }
        else {
            currentTimeMillis = 0L;
        }
        try {
            final HttpURLConnection httpURLConnection = (HttpURLConnection)INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(url);
            try {
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Length", String.valueOf(value.length));
                Object values;
                if (j.AFInAppEventType()) {
                    values = "application/octet-stream";
                }
                else {
                    values = "application/json";
                }
                httpURLConnection.setRequestProperty("Content-Type", (String)values);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setDoOutput(true);
                if (!AppsFlyerProperties.getInstance().getBoolean("http_cache", true)) {
                    httpURLConnection.setUseCaches(false);
                }
                Label_0758: {
                    try {
                        values = new DataOutputStream(httpURLConnection.getOutputStream());
                        try {
                            ((OutputStream)values).write(value);
                            ((OutputStream)values).close();
                            final int responseCode = httpURLConnection.getResponseCode();
                            if (b) {
                                afLogger$LogLevel.AFKeystoreWrapper.put("net", System.currentTimeMillis() - currentTimeMillis);
                            }
                            final String afInAppEventParameterName2 = AFInAppEventParameterName(httpURLConnection);
                            aj.AFInAppEventParameterName().AFInAppEventType("server_response", url.toString(), new String[] { String.valueOf(responseCode), afInAppEventParameterName2 });
                            AFLogger.valueOf("response code: ".concat(String.valueOf(responseCode)));
                            values = values((Context)valueOf);
                            if (responseCode == 200) {
                                if (valueOf != null && afKeystoreWrapper) {
                                    this.onValidateInApp = System.currentTimeMillis();
                                    final av value2 = this.setAdditionalData.valueOf();
                                    if (value2.AFKeystoreWrapper.AFInAppEventType()) {
                                        value2.values.submit(value2);
                                    }
                                }
                                if (afInAppEventParameterName != null) {
                                    afInAppEventParameterName.onSuccess();
                                }
                                if (getLevel != null) {
                                    af.values();
                                    af.AFKeystoreWrapper(getLevel, (Context)valueOf);
                                }
                                else {
                                    final SharedPreferences$Editor edit = values((Context)valueOf).edit();
                                    edit.putString("sentSuccessfully", "true");
                                    INVOKEINTERFACE_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(edit);
                                    if (!this.AppsFlyerInAppPurchaseValidatorListener && System.currentTimeMillis() - this.AppsFlyer2dXConversionCallback >= 15000L && this.AppsFlyerLib == null) {
                                        if (k.values == null) {
                                            k.values = new k();
                                        }
                                        AFInAppEventParameterName(this.AppsFlyerLib = k.values.AFInAppEventType(), new e((Context)valueOf), 1L, TimeUnit.SECONDS);
                                    }
                                }
                                final bq bq = new bq((Context)valueOf);
                                final aa values2 = bq.values();
                                if (values2 != null && values2.valueOf()) {
                                    final String afKeystoreWrapper2 = values2.AFKeystoreWrapper;
                                    AFLogger.AFInAppEventType("Resending Uninstall token to AF servers: ".concat(String.valueOf(afKeystoreWrapper2)));
                                    bq.AFInAppEventType(afKeystoreWrapper2);
                                }
                                this.setDebugLog = as.valueOf(afInAppEventParameterName2).optBoolean("send_background", false);
                            }
                            else if (afInAppEventParameterName != null) {
                                final int response_CODE_FAILURE = RequestError.RESPONSE_CODE_FAILURE;
                                final StringBuilder sb = new StringBuilder();
                                sb.append(az.AFInAppEventParameterName);
                                sb.append(" ");
                                sb.append(responseCode);
                                afInAppEventParameterName.onError(response_CODE_FAILURE, sb.toString());
                            }
                            bo.values(this, j, appsFlyer2dXConversionCallback, (Context)valueOf, (SharedPreferences)values, responseCode, null);
                            httpURLConnection.disconnect();
                            MethodCollector.o(3467);
                            return;
                        }
                        finally {}
                    }
                    finally {
                        break Label_0758;
                    }
                    ((OutputStream)values).close();
                }
                MethodCollector.o(3467);
            }
            finally {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
        }
        finally {}
        MethodCollector.o(3467);
    }
    
    private boolean AFKeystoreWrapper() {
        if (this.onConversionDataSuccess > 0L) {
            final long n = System.currentTimeMillis() - this.onConversionDataSuccess;
            final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
            final long onConversionDataSuccess = this.onConversionDataSuccess;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            final String format = simpleDateFormat.format(new Date(onConversionDataSuccess));
            final long onValidateInApp = this.onValidateInApp;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            final String format2 = simpleDateFormat.format(new Date(onValidateInApp));
            if (n < this.AppsFlyerConversionListener && !this.isStopped()) {
                AFLogger.valueOf(0II.LIZ(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", new Object[] { format, format2, n, this.AppsFlyerConversionListener }));
                return true;
            }
            if (!this.isStopped()) {
                AFLogger.valueOf(0II.LIZ(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", new Object[] { format, format2, n }));
            }
        }
        else if (!this.isStopped()) {
            AFLogger.valueOf("Sending first launch for this session!");
        }
        return false;
    }
    
    public static /* synthetic */ ScheduledExecutorService AFLogger$LogLevel(final ai ai) {
        return ai.AppsFlyerLib;
    }
    
    private boolean AFLogger$LogLevel() {
        final Map<String, Object> waitForCustomerUserId = this.waitForCustomerUserId;
        return waitForCustomerUserId != null && !waitForCustomerUserId.isEmpty();
    }
    
    public static boolean AFVersionDeclaration(final Context context) {
        try {
            if (INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_isGooglePlayServicesAvailable(GoogleApiAvailability.getInstance(), context) == 0) {
                return true;
            }
        }
        finally {
            final Throwable t;
            AFLogger.valueOf("WARNING:  Google play services is unavailable. ", t);
        }
        try {
            INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo(context.getPackageManager(), "com.google.android.gms", 0);
            return true;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            AFLogger.valueOf("WARNING:  Google Play Services is unavailable. ", (Throwable)ex);
            return false;
        }
    }
    
    public static boolean AppsFlyer2dXConversionCallback(final Context context) {
        return AppsFlyerProperties.getInstance().getBoolean("collectAndroidIdForceByUser", false) || AppsFlyerProperties.getInstance().getBoolean("collectIMEIForceByUser", false) || !AFVersionDeclaration(context);
    }
    
    public static void INVOKEINTERFACE_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(final SharedPreferences$Editor sharedPreferences$Editor) {
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
    
    public static String INVOKESTATIC_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_process_AnndroidIdSecureLancet_getString(final ContentResolver contentResolver, final String s) {
        if (TextUtils.equals((CharSequence)s, (CharSequence)"android_id")) {
            if (TextUtils.isEmpty((CharSequence)2bx.LIZ)) {
                2bx.LIZ = com_appsflyer_internal_ai_android_provider_Settings$Secure_getString(contentResolver, s);
            }
            return 2bx.LIZ;
        }
        return com_appsflyer_internal_ai_android_provider_Settings$Secure_getString(contentResolver, s);
    }
    
    public static ExecutorService INVOKESTATIC_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor() {
        final 6uu liz = 6ut.LIZ(6v6.FIXED);
        liz.LIZJ = 1;
        return 6v3.LIZ(liz.LIZ());
    }
    
    public static Intent INVOKEVIRTUAL_com_appsflyer_internal_ai_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(final Context context, final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter) {
        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
            ReceiverRegisterCrashOptimizer.doHWReceiverFix();
        }
        try {
            if (ReceiverRegisterCrashOptimizer.doRegisterHandler()) {
                return context.registerReceiver(broadcastReceiver, intentFilter, (String)null, ReceiverRegisterLancet.sReceiverHandler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        catch (final Exception ex) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw ex;
        }
    }
    
    public static Object INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String ex) {
        MethodCollector.i(80);
    Label_0167_Outer:
        while (true) {
            if (Build$VERSION.SDK_INT <= 27 && "clipboard".equals(ex)) {
                if (!2JT.LIZ) {
                    break Label_0167_Outer;
                }
                monitorenter(ClipboardManager.class);
                try {
                    final Object systemService = context.getSystemService((String)ex);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            final Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            ex = (Exception)new 2Lq((Handler)declaredField.get(systemService));
                            declaredField.set(systemService, ex);
                        }
                        catch (final Exception ex) {
                            6Nw.LIZ((Throwable)ex, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    2JT.LIZ = false;
                    monitorexit(ClipboardManager.class);
                    break Label_0182;
                }
                finally {
                    monitorexit(ClipboardManager.class);
                    MethodCollector.o(80);
                }
            }
            while (true) {
                if (2JT.LIZIZ || !"connectivity".equals(ex)) {
                    break Label_0167;
                }
                try {
                    new 6G9().LIZ();
                    2JT.LIZIZ = true;
                    context = (Context)context.getSystemService((String)ex);
                    MethodCollector.o(80);
                    return context;
                    context = (Context)context.getSystemService((String)ex);
                    continue Label_0167_Outer;
                    context = (Context)context.getSystemService((String)ex);
                    continue Label_0167_Outer;
                }
                finally {
                    continue;
                }
                break;
            }
            break;
        }
    }
    
    public static Object INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_IntentLancet_get(final Bundle bundle, final String s) {
        try {
            return bundle.get(s);
        }
        catch (final Exception | OutOfMemoryError exception | OutOfMemoryError) {
            return null;
        }
    }
    
    public static Bundle INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(final Intent intent) {
        try {
            return intent.getExtras();
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public static String INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(final Intent intent, final String s) {
        try {
            return intent.getStringExtra(s);
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public static Context INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context applicationContext) {
        applicationContext = applicationContext.getApplicationContext();
        if (!5WL.LIZIZ) {
            return applicationContext;
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        return (Context)5WL.LIZ;
    }
    
    public static ApplicationInfo INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo(final PackageManager packageManager, final String s, final int n) {
        final Context liz = NQO.LJJ.LIZ();
        if (6Tl.LJIIIZ && TextUtils.equals((CharSequence)s, (CharSequence)liz.getPackageName()) && n == 128) {
            if (6Tl.LIZ == null) {
                6Tl.LIZ = packageManager.getApplicationInfo(s, n);
            }
            return 6Tl.LIZ;
        }
        if (6Tl.LJIIIZ && TextUtils.equals((CharSequence)s, (CharSequence)liz.getPackageName()) && n == 0) {
            if (6Tl.LIZJ == null) {
                6Tl.LIZJ = packageManager.getApplicationInfo(s, n);
            }
            return 6Tl.LIZJ;
        }
        return packageManager.getApplicationInfo(s, n);
    }
    
    public static PackageInfo INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo(final PackageManager packageManager, final String s, final int n) {
        final Context liz = NQO.LJJ.LIZ();
        if (6Tl.LJIIIZ && TextUtils.equals((CharSequence)s, (CharSequence)liz.getPackageName()) && n == 128) {
            if (6Tl.LIZIZ == null) {
                6Tl.LIZIZ = packageManager.getPackageInfo(s, n);
            }
            return 6Tl.LIZIZ;
        }
        if (6Tl.LJIIIZ && TextUtils.equals((CharSequence)s, (CharSequence)liz.getPackageName()) && n == 0) {
            if (6Tl.LIZLLL == null) {
                6Tl.LIZLLL = packageManager.getPackageInfo(s, n);
            }
            return 6Tl.LIZLLL;
        }
        if (6Tl.LJIIIZ && TextUtils.equals((CharSequence)s, (CharSequence)liz.getPackageName()) && n == 64) {
            if (6Tl.LJ == null) {
                6Tl.LJ = packageManager.getPackageInfo(s, n);
            }
            return 6Tl.LJ;
        }
        if (6Tl.LJIIIZ && TextUtils.equals((CharSequence)s, (CharSequence)liz.getPackageName()) && n == 8) {
            if (6Tl.LJFF == null) {
                6Tl.LJFF = packageManager.getPackageInfo(s, n);
            }
            return 6Tl.LJFF;
        }
        return packageManager.getPackageInfo(s, n);
    }
    
    public static int INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_isGooglePlayServicesAvailable(final GoogleApiAvailability googleApiAvailability, final Context context) {
        if (!6Tl.LJIIIZ || 6Tl.LJI < 0) {
            return 6Tl.LJI = ((6rk)googleApiAvailability).isGooglePlayServicesAvailable(context);
        }
        return 6Tl.LJI;
    }
    
    public static URLConnection INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(final URL url) {
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
    
    public static String com_appsflyer_internal_ai_android_provider_Settings$Secure_getString(final ContentResolver contentResolver, final String s) {
        final 5aq 5aq = new 5aq();
        final Object[] array = { contentResolver, s };
        final 5dv 5dv = new 5dv(false);
        final 5an liz = 5aq.LIZ(102004, "android/provider/Settings$Secure", "getString", (Object)Settings$Secure.class, array, "java.lang.String", 5dv);
        if (liz.LIZ) {
            5aq.LIZ((Object)null, 102004, "android/provider/Settings$Secure", "getString", (Object)Settings$Secure.class, array, 5dv, false);
            return (String)liz.LIZIZ;
        }
        final String string = Settings$Secure.getString(contentResolver, s);
        5aq.LIZ((Object)string, 102004, "android/provider/Settings$Secure", "getString", (Object)Settings$Secure.class, array, 5dv, true);
        return string;
    }
    
    public static Object com_appsflyer_internal_ai_java_lang_reflect_Method_invoke(final Method method, final Object o, final Object[] array) {
        final 5an liz = new 5aq().LIZ(110000, "java/lang/reflect/Method", "invoke", (Object)method, new Object[] { o, array }, "java.lang.Object", new 5dv(true));
        if (liz.LIZ) {
            return liz.LIZIZ;
        }
        return method.invoke(o, array);
    }
    
    public static boolean getLevel(final Context context) {
        if (context != null) {
            Label_0079: {
                if (Build$VERSION.SDK_INT < 23) {
                    break Label_0079;
                }
                try {
                    final ConnectivityManager connectivityManager = (ConnectivityManager)INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "connectivity");
                    final Network[] allNetworks = connectivityManager.getAllNetworks();
                    for (int length = allNetworks.length, i = 0; i < length; ++i) {
                        final NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(allNetworks[i]);
                        if (networkCapabilities.hasTransport(4) && !networkCapabilities.hasCapability(15)) {
                            return true;
                        }
                    }
                    return false;
                    final ArrayList list = new ArrayList();
                    try {
                        for (final NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                            if (networkInterface.isUp()) {
                                list.add(networkInterface.getName());
                            }
                        }
                        return list.contains("tun0");
                    }
                    catch (final Exception ex) {
                        AFLogger.valueOf("Failed collecting ivc data", ex);
                    }
                }
                catch (final Exception ex2) {
                    AFLogger.valueOf("Failed collecting ivc data", ex2);
                }
            }
        }
        return false;
    }
    
    public static /* synthetic */ boolean getLevel(final ai ai) {
        return ai.AppsFlyerInAppPurchaseValidatorListener;
    }
    
    public static float init(final Context context) {
        int intExtra;
        int intExtra2;
        try {
            final Intent invokevirtual_com_appsflyer_internal_ai_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver = INVOKEVIRTUAL_com_appsflyer_internal_ai_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context), null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            intExtra = invokevirtual_com_appsflyer_internal_ai_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver.getIntExtra("level", -1);
            intExtra2 = invokevirtual_com_appsflyer_internal_ai_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver.getIntExtra("scale", -1);
            if (intExtra == -1 || intExtra2 == -1) {
                return 50.0f;
            }
        }
        finally {
            final Throwable t;
            AFLogger.valueOf(t.getMessage(), t);
            return 1.0f;
        }
        return intExtra / (float)intExtra2 * 100.0f;
    }
    
    public static /* synthetic */ ScheduledExecutorService init(final ai ai) {
        return ai.AppsFlyerLib = null;
    }
    
    public static ai valueOf() {
        return ai.onAppOpenAttribution;
    }
    
    public static String valueOf(final String s) {
        return AppsFlyerProperties.getInstance().getString(s);
    }
    
    public static String valueOf(final String s, final PackageManager packageManager, final String s2) {
        try {
            final Bundle metaData = ((PackageItemInfo)INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo(packageManager, s2, 128)).metaData;
            if (metaData != null) {
                final Object invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_IntentLancet_get = INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_IntentLancet_get(metaData, s);
                if (invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_IntentLancet_get != null) {
                    return invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_IntentLancet_get.toString();
                }
            }
        }
        finally {
            final StringBuilder sb = new StringBuilder("Could not find ");
            sb.append(s);
            sb.append(" value in the manifest");
            final Throwable t;
            AFLogger.valueOf(sb.toString(), t);
        }
        return null;
    }
    
    public static /* synthetic */ Map valueOf(final ai ai) {
        return ai.setCustomerUserId;
    }
    
    public static Map<String, Object> valueOf(final Map<String, Object> map) {
        Map map2;
        if (map.containsKey("meta")) {
            map2 = map.get("meta");
        }
        else {
            final HashMap hashMap = new HashMap();
            map.put("meta", hashMap);
            map2 = hashMap;
        }
        return map2;
    }
    
    public static void valueOf(final Context context, final String s) {
        final SharedPreferences$Editor edit = values(context).edit();
        edit.putBoolean(s, true);
        INVOKEINTERFACE_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(edit);
    }
    
    private void valueOf(final Context context, final String afLogger$LogLevel, final Map<String, Object> afKeystoreWrapper) {
        final cb cb = new cb();
        if (context != null) {
            cb.valueOf = (Application)INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
        }
        cb.AFLogger$LogLevel = afLogger$LogLevel;
        cb.AFKeystoreWrapper = afKeystoreWrapper;
        Activity activity;
        if (context instanceof Activity) {
            activity = (Activity)context;
        }
        else {
            activity = null;
        }
        this.valueOf(cb, activity);
    }
    
    public static void valueOf(final Context context, final Map<String, Object> map) {
        final WindowManager windowManager = (WindowManager)INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "window");
        if (windowManager != null) {
            final int rotation = windowManager.getDefaultDisplay().getRotation();
            String s;
            if (rotation != 0) {
                if (rotation != 1) {
                    if (rotation != 2) {
                        if (rotation != 3) {
                            s = "";
                        }
                        else {
                            s = "lr";
                        }
                    }
                    else {
                        s = "pr";
                    }
                }
                else {
                    s = "l";
                }
            }
            else {
                s = "p";
            }
            map.put("sc_o", s);
        }
    }
    
    public static boolean valueOf(final SharedPreferences sharedPreferences) {
        return Boolean.parseBoolean(sharedPreferences.getString("sentSuccessfully", (String)null));
    }
    
    public static /* synthetic */ boolean valueOf(final ai ai, final boolean appsFlyerInAppPurchaseValidatorListener) {
        return ai.AppsFlyerInAppPurchaseValidatorListener = appsFlyerInAppPurchaseValidatorListener;
    }
    
    private boolean valueOf(final j j, final SharedPreferences sharedPreferences) {
        final int afInAppEventParameterName = AFInAppEventParameterName(sharedPreferences, "appsFlyerCount", false);
        boolean b;
        if (afInAppEventParameterName == 1 && !(j instanceof bw)) {
            b = true;
        }
        else {
            b = false;
        }
        return (!sharedPreferences.getBoolean("newGPReferrerSent", false) && afInAppEventParameterName == 1) || b;
    }
    
    public static /* synthetic */ Application values(final ai ai) {
        return ai.setAndroidIdData;
    }
    
    public static SharedPreferences values(final Context context) {
        final ai onAppOpenAttribution = ai.onAppOpenAttribution;
        if (onAppOpenAttribution.sendPushNotificationData == null) {
            onAppOpenAttribution.sendPushNotificationData = 6Fr.LIZ(INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context), "appsflyer-data", 0);
        }
        return ai.onAppOpenAttribution.sendPushNotificationData;
    }
    
    public static String values(final File p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_2       
        //     4: aload_2        
        //     5: invokespecial   java/util/Properties.<init>:()V
        //     8: new             Ljava/io/FileReader;
        //    11: astore_3       
        //    12: aload_3        
        //    13: aload_0        
        //    14: invokespecial   java/io/FileReader.<init>:(Ljava/io/File;)V
        //    17: aload_2        
        //    18: aload_3        
        //    19: invokevirtual   java/util/Properties.load:(Ljava/io/Reader;)V
        //    22: ldc_w           "Found PreInstall property!"
        //    25: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;)V
        //    28: aload_2        
        //    29: aload_1        
        //    30: invokevirtual   java/util/Properties.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //    33: astore_1       
        //    34: aload_3        
        //    35: invokevirtual   java/io/Reader.close:()V
        //    38: goto            50
        //    41: astore_0       
        //    42: aload_0        
        //    43: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //    46: aload_0        
        //    47: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    50: aload_1        
        //    51: areturn        
        //    52: astore_1       
        //    53: aload_3        
        //    54: astore_0       
        //    55: goto            61
        //    58: astore_1       
        //    59: aconst_null    
        //    60: astore_0       
        //    61: aload_0        
        //    62: astore_3       
        //    63: aload_1        
        //    64: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //    67: aload_1        
        //    68: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    71: aload_0        
        //    72: ifnull          140
        //    75: aload_0        
        //    76: invokevirtual   java/io/Reader.close:()V
        //    79: goto            140
        //    82: astore_1       
        //    83: aconst_null    
        //    84: astore_1       
        //    85: aload_1        
        //    86: astore_3       
        //    87: new             Ljava/lang/StringBuilder;
        //    90: astore_2       
        //    91: aload_1        
        //    92: astore_3       
        //    93: aload_2        
        //    94: ldc_w           "PreInstall file wasn't found: "
        //    97: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   100: aload_1        
        //   101: astore_3       
        //   102: aload_2        
        //   103: aload_0        
        //   104: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   107: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   110: pop            
        //   111: aload_1        
        //   112: astore_3       
        //   113: aload_2        
        //   114: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   117: invokestatic    com/appsflyer/AFLogger.AFInAppEventType:(Ljava/lang/String;)V
        //   120: aload_1        
        //   121: ifnull          140
        //   124: aload_1        
        //   125: invokevirtual   java/io/Reader.close:()V
        //   128: goto            140
        //   131: astore_0       
        //   132: aload_0        
        //   133: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   136: aload_0        
        //   137: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   140: aconst_null    
        //   141: areturn        
        //   142: astore_0       
        //   143: aload_3        
        //   144: ifnull          163
        //   147: aload_3        
        //   148: invokevirtual   java/io/Reader.close:()V
        //   151: goto            163
        //   154: astore_1       
        //   155: aload_1        
        //   156: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   159: aload_1        
        //   160: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   163: aload_0        
        //   164: athrow         
        //   165: astore_1       
        //   166: aload_3        
        //   167: astore_1       
        //   168: goto            85
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  0      17     82     85     Ljava/io/FileNotFoundException;
        //  0      17     58     61     Any
        //  17     34     165    171    Ljava/io/FileNotFoundException;
        //  17     34     52     58     Any
        //  34     38     41     50     Any
        //  63     71     142    165    Any
        //  75     79     131    140    Any
        //  87     91     142    165    Any
        //  93     100    142    165    Any
        //  102    111    142    165    Any
        //  113    120    142    165    Any
        //  124    128    131    140    Any
        //  147    151    154    163    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 99, Size: 99
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3611)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static String values(String s) {
        final String s2 = null;
        String s3 = null;
        try {
            s = (String)Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, s);
        }
        finally {
            final Throwable t;
            AFLogger.valueOf(t.getMessage(), t);
            s3 = s2;
        }
        return s3;
    }
    
    public static void values(final Context context, final String s, final String s2) {
        final SharedPreferences$Editor edit = values(context).edit();
        edit.putString(s, s2);
        INVOKEINTERFACE_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(edit);
    }
    
    public static /* synthetic */ void values(final ai ai, final j j) {
        final Application valueOf = j.valueOf;
        final String afLogger$LogLevel = j.AFLogger$LogLevel;
        if (valueOf == null) {
            AFLogger.AFInAppEventType("sendWithEvent - got null context. skipping event/launch.");
            return;
        }
        final SharedPreferences values = values((Context)valueOf);
        AppsFlyerProperties.getInstance().saveProperties(values);
        if (!ai.isStopped()) {
            final StringBuilder sb = new StringBuilder("sendWithEvent from activity: ");
            sb.append(((Context)valueOf).getClass().getName());
            AFLogger.valueOf(sb.toString());
        }
        final int n = 1;
        boolean b = false;
        int i = 0;
        final boolean onDeepLinkingNative = afLogger$LogLevel == null;
        final boolean b2 = j instanceof bx;
        final boolean b3 = j instanceof bw;
        j.onDeepLinkingNative = onDeepLinkingNative;
        final Map<String, Object> value = ai.valueOf(j);
        final String s = value.get("appsflyerKey");
        if (s == null || s.length() == 0) {
            AFLogger.AFInAppEventType("Not sending data yet, waiting for dev key");
            final AppsFlyerRequestListener afInAppEventParameterName = j.AFInAppEventParameterName;
            if (afInAppEventParameterName != null) {
                afInAppEventParameterName.onError(RequestError.NO_DEV_KEY, az.AFInAppEventType);
            }
            return;
        }
        if (!ai.isStopped()) {
            AFLogger.valueOf("AppsFlyerLib.sendWithEvent");
        }
        final int afInAppEventParameterName2 = AFInAppEventParameterName(values, "appsFlyerCount", false);
        String s2;
        if (b3 || b2) {
            s2 = 0II.LIZ(ai.onDeepLinking, new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), ai.onAppOpenAttribution.getHostName() });
        }
        else if (onDeepLinkingNative) {
            if (afInAppEventParameterName2 < 2) {
                s2 = 0II.LIZ(ai.onInstallConversionDataLoadedNative, new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), ai.onAppOpenAttribution.getHostName() });
            }
            else {
                s2 = 0II.LIZ(ai.onConversionDataFail, new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), ai.onAppOpenAttribution.getHostName() });
            }
        }
        else {
            s2 = 0II.LIZ(ai.onAttributionFailure, new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), ai.onAppOpenAttribution.getHostName() });
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(s2);
        sb2.append(((Context)valueOf).getPackageName());
        final String string = sb2.toString();
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(string);
        sb3.append("&buildnumber=6.4.0");
        final String string2 = sb3.toString();
        final String value2 = ai.valueOf((Context)valueOf);
        String string3 = string2;
        if (value2 != null) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(string2);
            sb4.append("&channel=");
            sb4.append(value2);
            string3 = sb4.toString();
        }
        if (!AppsFlyerProperties.getInstance().getBoolean("collectAndroidIdForceByUser", false) && !AppsFlyerProperties.getInstance().getBoolean("collectIMEIForceByUser", false) && value.get("advertiserId") != null) {
            try {
                if (TextUtils.isEmpty((CharSequence)ai.getLevel) && value.remove("android_id") != null) {
                    AFLogger.valueOf("validateGaidAndIMEI :: removing: android_id");
                }
                if (TextUtils.isEmpty((CharSequence)ai.AFVersionDeclaration) && value.remove("imei") != null) {
                    AFLogger.valueOf("validateGaidAndIMEI :: removing: imei");
                }
            }
            catch (final Exception ex) {
                AFLogger.valueOf("failed to remove IMEI or AndroidID key from params; ", ex);
            }
        }
        j.valueOf(string3);
        j.AFInAppEventType(value);
        j.onAttributionFailureNative = afInAppEventParameterName2;
        final d d = ai.new d(j, (byte)0);
        int n3;
        if (onDeepLinkingNative) {
            final cl[] init = ai.init;
            if (init != null) {
                final int length = init.length;
                b = false;
                while (i < length) {
                    final cl cl = init[i];
                    if (cl.valueOf == com.appsflyer.internal.cl.a.valueOf) {
                        final StringBuilder sb5 = new StringBuilder("Failed to get ");
                        sb5.append(cl.AFInAppEventType);
                        sb5.append(" referrer, wait ...");
                        AFLogger.AFInAppEventType(sb5.toString());
                        b = true;
                    }
                    ++i;
                }
            }
            int n2 = b ? 1 : 0;
            if (ai.setPhoneNumber) {
                n2 = (b ? 1 : 0);
                if (!ai.AFInAppEventParameterName()) {
                    AFLogger.AFInAppEventType("fetching Facebook deferred AppLink data, wait ...");
                    n2 = 1;
                }
            }
            if (ai.setCustomerIdAndLogSession && !ai.AFLogger$LogLevel()) {
                n3 = n;
            }
            else {
                n3 = n2;
            }
        }
        else {
            n3 = 0;
        }
        ScheduledExecutorService scheduledExecutorService;
        if (com.appsflyer.internal.i.values) {
            AFLogger.AFInAppEventParameterName("ESP deeplink: execute launch on SerialExecutor");
            if (k.values == null) {
                k.values = new k();
            }
            final k values2 = k.values;
            if (values2.AFInAppEventParameterName == null) {
                values2.AFInAppEventParameterName = PThreadExecutorsUtils.newSingleThreadScheduledExecutor(values2.AFInAppEventType);
            }
            scheduledExecutorService = values2.AFInAppEventParameterName;
        }
        else {
            if (k.values == null) {
                k.values = new k();
            }
            scheduledExecutorService = k.values.AFInAppEventType();
        }
        long n4;
        if (n3 != 0) {
            n4 = 500L;
        }
        else {
            n4 = 0L;
        }
        AFInAppEventParameterName(scheduledExecutorService, d, n4, TimeUnit.MILLISECONDS);
    }
    
    public final boolean AFInAppEventType() {
        return AFInAppEventParameterName("waitForCustomerId", false) && AppsFlyerProperties.getInstance().getString("AppUserId") == null;
    }
    
    public final void AFKeystoreWrapper(final Context context, final String s) {
        AFLogger.AFInAppEventType("received a new (extra) referrer: ".concat(String.valueOf(s)));
        try {
            final long currentTimeMillis = System.currentTimeMillis();
            final String string = values(context).getString("extraReferrers", (String)null);
            JSONObject jsonObject;
            JSONArray jsonArray;
            if (string == null) {
                jsonObject = new JSONObject();
                jsonArray = new JSONArray();
            }
            else {
                jsonObject = new JSONObject(string);
                if (jsonObject.has(s)) {
                    jsonArray = new JSONArray((String)jsonObject.get(s));
                }
                else {
                    jsonArray = new JSONArray();
                }
            }
            if (jsonArray.length() < 5L) {
                jsonArray.put(currentTimeMillis);
            }
            if (jsonObject.length() >= 4L) {
                AFInAppEventType(jsonObject);
            }
            jsonObject.put(s, (Object)jsonArray.toString());
            final String string2 = jsonObject.toString();
            final SharedPreferences$Editor edit = values(context).edit();
            edit.putString("extraReferrers", string2);
            INVOKEINTERFACE_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(edit);
        }
        catch (final JSONException ex) {
            goto Label_0234;
        }
        finally {
            final StringBuilder sb = new StringBuilder("Couldn't save referrer - ");
            sb.append(s);
            sb.append(": ");
            final Throwable t;
            AFLogger.valueOf(sb.toString(), t);
        }
    }
    
    public final void AFKeystoreWrapper(final WeakReference<Context> weakReference) {
        if (weakReference.get() == null) {
            return;
        }
        AFLogger.valueOf("app went to background");
        final SharedPreferences values = values(weakReference.get());
        AppsFlyerProperties.getInstance().saveProperties(values);
        final long onPause = this.onPause;
        final long onValidateInAppFailure = this.onValidateInAppFailure;
        final HashMap hashMap = new HashMap();
        final String string = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
        if (string == null) {
            AFLogger.AFLogger$LogLevel("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        final String string2 = AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
        if (AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false)) {
            hashMap.put("deviceTrackingDisabled", "true");
        }
        final c.d.b afInAppEventParameterName = ad.AFInAppEventParameterName(weakReference.get().getContentResolver());
        if (afInAppEventParameterName != null) {
            hashMap.put("amazon_aid", afInAppEventParameterName.values);
            hashMap.put("amazon_aid_limit", String.valueOf(afInAppEventParameterName.AFKeystoreWrapper));
        }
        final String string3 = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string3 != null) {
            hashMap.put("advertiserId", string3);
        }
        hashMap.put("app_id", weakReference.get().getPackageName());
        hashMap.put("devkey", string);
        hashMap.put("uid", ak.AFInAppEventParameterName(weakReference));
        hashMap.put("time_in_app", String.valueOf((onPause - onValidateInAppFailure) / 1000L));
        hashMap.put("statType", "user_closed_app");
        hashMap.put("platform", "Android");
        hashMap.put("launch_counter", Integer.toString(AFInAppEventParameterName(values, "appsFlyerCount", false)));
        hashMap.put("channel", this.valueOf(weakReference.get()));
        String s;
        if (string2 != null) {
            s = string2;
        }
        else {
            s = "";
        }
        hashMap.put("originalAppsflyerId", s);
        if (this.setDebugLog) {
            try {
                AFLogger.AFInAppEventType("Running callStats task");
                final cg cg = new cg();
                cg.onConversionDataSuccess = this.isStopped();
                cg.AFInAppEventType(hashMap);
                cg.valueOf(0II.LIZ(ai.onInstallConversionFailureNative, new Object[] { com.appsflyer.AppsFlyerLib.getInstance().getHostPrefix(), ai.onAppOpenAttribution.getHostName() }));
                new PthreadThread((Runnable)new ah(cg), "r/internal/ai").start();
                return;
            }
            finally {
                final Throwable t;
                AFLogger.valueOf("Could not send callStats request", t);
                return;
            }
        }
        AFLogger.AFInAppEventType("Stats call is disabled, ignore ...");
    }
    
    @Override
    public final void addPushNotificationDeepLinkPath(final String... array) {
        final List<String> list = Arrays.asList(array);
        final List<List<String>> init = i.values().init;
        if (!init.contains(list)) {
            init.add(list);
        }
    }
    
    @Override
    public final void anonymizeUser(final boolean b) {
        aj.AFInAppEventParameterName().AFInAppEventType("public_api_call", "anonymizeUser", String.valueOf(b));
        AppsFlyerProperties.getInstance().set("deviceTrackingDisabled", b);
    }
    
    @Override
    public final void appendParametersToDeepLinkingURL(final String afLogger$LogLevel, final Map<String, String> getLevel) {
        final i values = i.values();
        values.AFLogger$LogLevel = afLogger$LogLevel;
        values.getLevel = getLevel;
    }
    
    @Override
    public final void autoLogSubscriptionsRevenue(final Function<List<Purchase>, Map<String, String>> function, final Consumer<String> consumer, final Consumer<String> consumer2, final Boolean b) {
        this.setAdditionalData.AFInAppEventParameterName().valueOf(new ad(function, consumer, consumer2, b != null && b));
    }
    
    @Override
    public final void enableFacebookDeferredApplinks(final boolean setPhoneNumber) {
        this.setPhoneNumber = setPhoneNumber;
    }
    
    @Override
    public final AppsFlyerLib enableLocationCollection(final boolean updateServerUninstallToken) {
        this.updateServerUninstallToken = updateServerUninstallToken;
        return this;
    }
    
    @Override
    public final String getAppsFlyerUID(final Context context) {
        aj.AFInAppEventParameterName().AFInAppEventType("public_api_call", "getAppsFlyerUID", new String[0]);
        return ak.AFInAppEventParameterName(new WeakReference<Context>(this.setAdditionalData.AFInAppEventType().valueOf));
    }
    
    @Override
    public final String getAttributionId(final Context context) {
        try {
            return new ae(context).AFInAppEventType();
        }
        finally {
            final Throwable t;
            AFLogger.valueOf("Could not collect facebook attribution id. ", t);
            return null;
        }
    }
    
    @Override
    public final String getHostName() {
        final String string = AppsFlyerProperties.getInstance().getString("custom_host");
        if (string != null) {
            return string;
        }
        return "appsflyer.com";
    }
    
    @Override
    public final String getHostPrefix() {
        final String string = AppsFlyerProperties.getInstance().getString("custom_host_prefix");
        if (string != null) {
            return string;
        }
        return "";
    }
    
    @Override
    public final String getOutOfStore(final Context context) {
        final String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (string != null) {
            return string;
        }
        if (context != null) {
            final String value = valueOf("AF_STORE", context.getPackageManager(), context.getPackageName());
            if (value != null) {
                return value;
            }
        }
        AFLogger.valueOf("No out-of-store value set");
        return null;
    }
    
    @Override
    public final String getSdkVersion() {
        aj.AFInAppEventParameterName().AFInAppEventType("public_api_call", "getSdkVersion", new String[0]);
        final StringBuilder sb = new StringBuilder("version: 6.4.0 (build ");
        sb.append(ai.AFInAppEventParameterName);
        sb.append(")");
        return sb.toString();
    }
    
    @Override
    public final AppsFlyerLib init(final String s, final AppsFlyerConversionListener afInAppEventType, final Context context) {
        if (this.setOaidData) {
            return this;
        }
        this.setOaidData = true;
        if (context != null) {
            if (this.AFLogger$LogLevel == null) {
                this.AFLogger$LogLevel = new au(context);
            }
            final au afLogger$LogLevel = this.AFLogger$LogLevel;
            if (afLogger$LogLevel.valueOf()) {
                INVOKEINTERFACE_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(afLogger$LogLevel.values.edit().putLong("init_ts", System.currentTimeMillis()));
            }
            this.setAndroidIdData = (Application)INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
            this.setAdditionalData.AFKeystoreWrapper = INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
            final cj cj = new cj(new Runnable() {
                static {
                    Covode.recordClassIndex(2593);
                }
                
                @Override
                public final void run() {
                    if (k.values == null) {
                        k.values = new k();
                    }
                    ai.AFInAppEventParameterName(k.values.AFInAppEventType(), new Runnable() {
                        static {
                            Covode.recordClassIndex(2594);
                        }
                        
                        public static Context INVOKEVIRTUAL_com_appsflyer_internal_ai$2$3_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context applicationContext) {
                            applicationContext = applicationContext.getApplicationContext();
                            if (!5WL.LIZIZ) {
                                return applicationContext;
                            }
                            if (applicationContext != null) {
                                return applicationContext;
                            }
                            return (Context)5WL.LIZ;
                        }
                        
                        @Override
                        public final void run() {
                            try {
                                final bw bw = new bw();
                                final Application values = ai.values(ai.this);
                                if (values != null) {
                                    bw.valueOf = (Application)INVOKEVIRTUAL_com_appsflyer_internal_ai$2$3_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext((Context)values);
                                }
                                if (ai.this.valueOf(bw, ai.values((Context)ai.values(ai.this)))) {
                                    ai.values(ai.this, bw);
                                }
                            }
                            finally {
                                final Throwable t;
                                AFLogger.valueOf(t.getMessage(), t);
                            }
                        }
                    }, 0L, TimeUnit.MILLISECONDS);
                }
            });
            final Runnable runnable = new Runnable() {
                static {
                    Covode.recordClassIndex(2595);
                }
                
                public static Context INVOKEVIRTUAL_com_appsflyer_internal_ai$3_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context applicationContext) {
                    applicationContext = applicationContext.getApplicationContext();
                    if (!5WL.LIZIZ) {
                        return applicationContext;
                    }
                    if (applicationContext != null) {
                        return applicationContext;
                    }
                    return (Context)5WL.LIZ;
                }
                
                @Override
                public final void run() {
                    final SharedPreferences values = ai.values((Context)ai.values(ai.this));
                    boolean b = false;
                    final int afInAppEventParameterName = ai.AFInAppEventParameterName(values, "appsFlyerCount", false);
                    final boolean boolean1 = values.getBoolean("newGPReferrerSent", false);
                    if (cj.valueOf == cl.a.AFInAppEventType) {
                        b = true;
                    }
                    if (afInAppEventParameterName == 1 && (b || boolean1)) {
                        final ai values2 = ai.this;
                        final bw bw = new bw();
                        final Application values3 = ai.values(ai.this);
                        if (values3 != null) {
                            bw.valueOf = (Application)INVOKEVIRTUAL_com_appsflyer_internal_ai$3_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext((Context)values3);
                        }
                        ai.values(values2, bw);
                    }
                }
            };
            final cl[] init = { cj, new ch(runnable), new ck(runnable) };
            this.init = init;
            for (int length = init.length, i = 0; i < length; ++i) {
                init[i].AFKeystoreWrapper((Context)this.setAndroidIdData);
            }
            this.setCustomerIdAndLogSession = this.AFInAppEventParameterName(context);
            ay.AFKeystoreWrapper = this.setAndroidIdData;
            if (AFInAppEventParameterName(values(context), "appsFlyerCount", false) == 0 && Build$VERSION.SDK_INT >= 29) {
                final cm setOutOfStore = new cm(context);
                this.setOutOfStore = setOutOfStore;
                new PthreadThread((Runnable)setOutOfStore.valueOf, "r/internal/ai").start();
            }
        }
        else {
            AFLogger.AFLogger$LogLevel("context is null, Google Install Referrer will be not initialized");
        }
        final aj afInAppEventParameterName = aj.AFInAppEventParameterName();
        String s2;
        if (afInAppEventType == null) {
            s2 = "null";
        }
        else {
            s2 = "conversionDataListener";
        }
        afInAppEventParameterName.AFInAppEventType("public_api_call", "init", new String[] { s, s2 });
        AFLogger.AFKeystoreWrapper(0II.LIZ("Initializing AppsFlyer SDK: (v%s.%s)", new Object[] { "6.4.0", ai.AFInAppEventParameterName }));
        AppsFlyerProperties.getInstance().set("AppsFlyerKey", s);
        al.AFInAppEventParameterName(s);
        ai.AFInAppEventType = afInAppEventType;
        return this;
    }
    
    @Override
    public final boolean isPreInstalledApp(final Context context) {
        try {
            if ((INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo(context.getPackageManager(), context.getPackageName(), 0).flags & 0x1) != 0x0) {
                return true;
            }
        }
        catch (final PackageManager$NameNotFoundException ex) {
            AFLogger.valueOf("Could not check if app is pre installed", (Throwable)ex);
        }
        return false;
    }
    
    @Override
    public final boolean isStopped() {
        return this.setImeiData;
    }
    
    @Override
    public final void logEvent(final Context context, final String s, final Map<String, Object> map) {
        this.logEvent(context, s, map, null);
    }
    
    @Override
    public final void logEvent(final Context context, final String afLogger$LogLevel, final Map<String, Object> map, final AppsFlyerRequestListener afInAppEventParameterName) {
        final cb cb = new cb();
        if (context != null) {
            cb.valueOf = (Application)INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
        }
        cb.AFLogger$LogLevel = afLogger$LogLevel;
        final Activity activity = null;
        Map<String, Object> afKeystoreWrapper;
        if (map == null) {
            afKeystoreWrapper = null;
        }
        else {
            afKeystoreWrapper = new HashMap<String, Object>(map);
        }
        cb.AFKeystoreWrapper = afKeystoreWrapper;
        cb.AFInAppEventParameterName = afInAppEventParameterName;
        final aj afInAppEventParameterName2 = aj.AFInAppEventParameterName();
        Map<String, Object> afKeystoreWrapper2;
        if (cb.AFKeystoreWrapper == null) {
            afKeystoreWrapper2 = new HashMap<String, Object>();
        }
        else {
            afKeystoreWrapper2 = cb.AFKeystoreWrapper;
        }
        afInAppEventParameterName2.AFInAppEventType("public_api_call", "logEvent", new String[] { afLogger$LogLevel, new JSONObject((Map)afKeystoreWrapper2).toString() });
        if (afLogger$LogLevel != null) {
            ab.AFKeystoreWrapper(context).valueOf();
        }
        Activity activity2 = activity;
        if (context instanceof Activity) {
            activity2 = (Activity)context;
        }
        this.valueOf(cb, activity2);
    }
    
    @Override
    public final void logLocation(final Context context, final double n, final double n2) {
        aj.AFInAppEventParameterName().AFInAppEventType("public_api_call", "logLocation", new String[] { String.valueOf(n), String.valueOf(n2) });
        final HashMap hashMap = new HashMap();
        hashMap.put("af_long", Double.toString(n2));
        hashMap.put("af_lat", Double.toString(n));
        this.valueOf(context, "af_location_coordinates", hashMap);
    }
    
    @Override
    public final void logSession(final Context context) {
        aj.AFInAppEventParameterName().AFInAppEventType("public_api_call", "logSession", new String[0]);
        aj.AFInAppEventParameterName().values = false;
        this.valueOf(context, null, (Map<String, Object>)null);
    }
    
    @Override
    public final void onPause(final Context context) {
        if (ag.valueOf != null) {
            ag.valueOf.valueOf(context);
        }
    }
    
    @Override
    public final void performOnAppAttribution(final Context context, final URI uri) {
        if (uri == null || uri.toString().isEmpty()) {
            final StringBuilder sb = new StringBuilder("Link is \"");
            sb.append(uri);
            sb.append("\"");
            ap.AFInAppEventParameterName(sb.toString(), DeepLinkResult.Error.NETWORK);
            return;
        }
        if (context == null) {
            final StringBuilder sb2 = new StringBuilder("Context is \"");
            sb2.append(context);
            sb2.append("\"");
            ap.AFInAppEventParameterName(sb2.toString(), DeepLinkResult.Error.NETWORK);
            return;
        }
        i.values().AFKeystoreWrapper(context, new HashMap<String, Object>(), Uri.parse(uri.toString()));
    }
    
    @Override
    public final void performOnDeepLinking(final Intent intent, Context invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext) {
        if (intent == null) {
            ap.AFInAppEventParameterName("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
            return;
        }
        if (invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext == null) {
            ap.AFInAppEventParameterName("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
            return;
        }
        invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext = INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext);
        this.setAppInviteOneLink.execute(new Runnable() {
            static {
                Covode.recordClassIndex(2596);
            }
            
            @Override
            public final void run() {
                i.values();
                final Intent afKeystoreWrapper = intent;
                final Context values = invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext;
                final ai afInAppEventParameterName = ai.this;
                if (afInAppEventParameterName.AFLogger$LogLevel == null) {
                    afInAppEventParameterName.AFLogger$LogLevel = new au(values);
                }
                final au afLogger$LogLevel = afInAppEventParameterName.AFLogger$LogLevel;
                final Uri afKeystoreWrapper2 = i.AFKeystoreWrapper(afKeystoreWrapper);
                boolean b;
                if (afKeystoreWrapper2 != null && !afKeystoreWrapper2.toString().isEmpty()) {
                    b = true;
                }
                else {
                    b = false;
                }
                if (ai.values(values).getBoolean("ddl_sent", false) && !b) {
                    ap.AFInAppEventParameterName("No direct deep link", null);
                    return;
                }
                i.values().AFKeystoreWrapper(new HashMap<String, Object>(), afLogger$LogLevel, afKeystoreWrapper, values);
            }
        });
    }
    
    @Override
    public final void registerConversionListener(final Context context, final AppsFlyerConversionListener afInAppEventType) {
        aj.AFInAppEventParameterName().AFInAppEventType("public_api_call", "registerConversionListener", new String[0]);
        if (afInAppEventType != null) {
            ai.AFInAppEventType = afInAppEventType;
        }
    }
    
    @Override
    public final void registerValidatorListener(final Context context, final AppsFlyerInAppPurchaseValidatorListener afKeystoreWrapper) {
        aj.AFInAppEventParameterName().AFInAppEventType("public_api_call", "registerValidatorListener", new String[0]);
        AFLogger.AFInAppEventType("registerValidatorListener called");
        if (afKeystoreWrapper == null) {
            AFLogger.AFInAppEventType("registerValidatorListener null listener");
            return;
        }
        ai.AFKeystoreWrapper = afKeystoreWrapper;
    }
    
    @Override
    public final void sendAdRevenue(final Context context, final Map<String, Object> afKeystoreWrapper) {
        final bs bs = new bs();
        if (context != null) {
            bs.valueOf = (Application)INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
        }
        bs.AFKeystoreWrapper = afKeystoreWrapper;
        final Application valueOf = bs.valueOf;
        final String liz = 0II.LIZ(ai.onAttributionFailureNative, new Object[] { com.appsflyer.AppsFlyerLib.getInstance().getHostPrefix(), ai.onAppOpenAttribution.getHostName() });
        final StringBuilder sb = new StringBuilder();
        sb.append(liz);
        sb.append(((Context)valueOf).getPackageName());
        final String string = sb.toString();
        final SharedPreferences values = values((Context)valueOf);
        final int afInAppEventParameterName = AFInAppEventParameterName(values, "appsFlyerCount", false);
        final int afInAppEventParameterName2 = AFInAppEventParameterName(values, "appsFlyerAdRevenueCount", true);
        final HashMap hashMap = new HashMap();
        hashMap.put("ad_network", bs.AFKeystoreWrapper);
        hashMap.put("adrevenue_counter", afInAppEventParameterName2);
        final String string2 = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
        hashMap.put("af_key", string2);
        hashMap.put("launch_counter", afInAppEventParameterName);
        hashMap.put("af_timestamp", Long.toString(new Date().getTime()));
        hashMap.put("uid", ak.AFInAppEventParameterName(new WeakReference<Context>((Context)valueOf)));
        final String string3 = AppsFlyerProperties.getInstance().getString("advertiserId");
        final String string4 = AppsFlyerProperties.getInstance().getString("advertiserIdEnabled");
        if (string4 != null) {
            hashMap.put("advertiserIdEnabled", string4);
        }
        if (string3 != null) {
            hashMap.put("advertiserId", string3);
        }
        hashMap.put("device", Build.DEVICE);
        valueOf((Context)valueOf, hashMap);
        try {
            final PackageInfo invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo = INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo(((Context)valueOf).getPackageManager(), ((Context)valueOf).getPackageName(), 0);
            hashMap.put("app_version_code", Integer.toString(invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo.versionCode));
            final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            final long firstInstallTime = invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo.firstInstallTime;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            hashMap.put("install_date", simpleDateFormat.format(new Date(firstInstallTime)));
            String s;
            if ((s = values.getString("appsFlyerFirstInstall", (String)null)) == null) {
                s = this.AFInAppEventType(simpleDateFormat, (Context)valueOf);
            }
            hashMap.put("first_launch_date", s);
        }
        finally {
            final Throwable t;
            AFLogger.valueOf("AdRevenue - Exception while collecting app version data ", t);
        }
        bs.valueOf(string);
        bs.AFInAppEventType(hashMap);
        bs.onAttributionFailureNative = afInAppEventParameterName;
        bs.AppsFlyer2dXConversionCallback = string2;
        final d d = new d(bs, (byte)0);
        if (k.values == null) {
            k.values = new k();
        }
        AFInAppEventParameterName(k.values.AFInAppEventType(), d, 1L, TimeUnit.MILLISECONDS);
    }
    
    @Override
    public final void sendPushNotificationData(final Activity activity) {
        if (activity != null) {
            if (activity.getIntent() != null) {
                final aj afInAppEventParameterName = aj.AFInAppEventParameterName();
                final String localClassName = activity.getLocalClassName();
                final StringBuilder sb = new StringBuilder("activity_intent_");
                sb.append(activity.getIntent().toString());
                afInAppEventParameterName.AFInAppEventType("public_api_call", "sendPushNotificationData", new String[] { localClassName, sb.toString() });
            }
            else {
                aj.AFInAppEventParameterName().AFInAppEventType("public_api_call", "sendPushNotificationData", new String[] { activity.getLocalClassName(), "activity_intent_null" });
            }
        }
        else {
            aj.AFInAppEventParameterName().AFInAppEventType("public_api_call", "sendPushNotificationData", "activity_null");
        }
        final String afInAppEventType = AFInAppEventType(activity);
        this.getSdkVersion = afInAppEventType;
        if (afInAppEventType != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            long longValue = 0L;
            Label_0121: {
                if (this.getInstance != null) {
                    long n3;
                    try {
                        final long long1 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000L);
                        final Iterator<Long> iterator = this.getInstance.keySet().iterator();
                        longValue = currentTimeMillis;
                        while (true) {
                            final long n = longValue = longValue;
                            try {
                                if (!iterator.hasNext()) {
                                    break Label_0121;
                                }
                                final Long n2 = iterator.next();
                                final JSONObject jsonObject = new JSONObject(this.getSdkVersion);
                                final JSONObject jsonObject2 = new JSONObject((String)this.getInstance.get(n2));
                                if (jsonObject.opt("pid").equals(jsonObject2.opt("pid")) && jsonObject.opt("c").equals(jsonObject2.opt("c"))) {
                                    final StringBuilder sb2 = new StringBuilder("PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: ");
                                    sb2.append(jsonObject2);
                                    sb2.append(", new: ");
                                    sb2.append(jsonObject);
                                    sb2.append(")");
                                    AFLogger.valueOf(sb2.toString());
                                    this.getSdkVersion = null;
                                    return;
                                }
                                if (currentTimeMillis - n2.longValue() > long1) {
                                    this.getInstance.remove(n2);
                                }
                                longValue = n;
                                if (n2.longValue() <= n) {
                                    longValue = n2.longValue();
                                    continue;
                                }
                                continue;
                            }
                            finally {}
                        }
                    }
                    finally {
                        n3 = currentTimeMillis;
                    }
                    final StringBuilder sb3 = new StringBuilder("Error while handling push notification measurement: ");
                    final Throwable t;
                    sb3.append(t.getClass().getSimpleName());
                    AFLogger.valueOf(sb3.toString(), t);
                    longValue = n3;
                    break Label_0121;
                }
                AFLogger.valueOf("pushes: initializing pushes history..");
                this.getInstance = new ConcurrentHashMap<Long, String>();
                longValue = currentTimeMillis;
            }
            if (this.getInstance.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                final StringBuilder sb4 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                sb4.append(longValue);
                sb4.append(")");
                AFLogger.valueOf(sb4.toString());
                this.getInstance.remove(longValue);
            }
            this.getInstance.put(currentTimeMillis, this.getSdkVersion);
            this.start((Context)activity);
        }
    }
    
    @Override
    public final void setAdditionalData(final Map<String, Object> map) {
        if (map != null) {
            aj.AFInAppEventParameterName().AFInAppEventType("public_api_call", "setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject((Map)map).toString());
        }
    }
    
    @Override
    public final void setAndroidIdData(final String getLevel) {
        aj.AFInAppEventParameterName().AFInAppEventType("public_api_call", "setAndroidIdData", getLevel);
        this.getLevel = getLevel;
    }
    
    @Override
    public final void setAppId(final String s) {
        aj.AFInAppEventParameterName().AFInAppEventType("public_api_call", "setAppId", s);
        AppsFlyerProperties.getInstance().set("appid", s);
    }
    
    @Override
    public final void setAppInviteOneLink(final String s) {
        aj.AFInAppEventParameterName().AFInAppEventType("public_api_call", "setAppInviteOneLink", s);
        AFLogger.valueOf("setAppInviteOneLink = ".concat(String.valueOf(s)));
        if (s == null || !s.equals(AppsFlyerProperties.getInstance().getString("oneLinkSlug"))) {
            AppsFlyerProperties.getInstance().remove("onelinkDomain");
            AppsFlyerProperties.getInstance().remove("onelinkVersion");
            AppsFlyerProperties.getInstance().remove("onelinkScheme");
        }
        AppsFlyerProperties.getInstance().set("oneLinkSlug", s);
    }
    
    @Override
    public final void setCollectAndroidID(final boolean b) {
        aj.AFInAppEventParameterName().AFInAppEventType("public_api_call", "setCollectAndroidID", String.valueOf(b));
        AppsFlyerProperties.getInstance().set("collectAndroidId", Boolean.toString(b));
        AppsFlyerProperties.getInstance().set("collectAndroidIdForceByUser", Boolean.toString(b));
    }
    
    @Override
    public final void setCollectIMEI(final boolean b) {
        aj.AFInAppEventParameterName().AFInAppEventType("public_api_call", "setCollectIMEI", String.valueOf(b));
        AppsFlyerProperties.getInstance().set("collectIMEI", Boolean.toString(b));
        AppsFlyerProperties.getInstance().set("collectIMEIForceByUser", Boolean.toString(b));
    }
    
    @Override
    public final void setCollectOaid(final boolean b) {
        aj.AFInAppEventParameterName().AFInAppEventType("public_api_call", "setCollectOaid", String.valueOf(b));
        AppsFlyerProperties.getInstance().set("collectOAID", Boolean.toString(b));
    }
    
    @Override
    public final void setCurrencyCode(final String s) {
        aj.AFInAppEventParameterName().AFInAppEventType("public_api_call", "setCurrencyCode", s);
        AppsFlyerProperties.getInstance().set("currencyCode", s);
    }
    
    @Override
    public final void setCustomerIdAndLogSession(String customerUserId, final Context context) {
        if (context != null) {
            if (this.AFInAppEventType()) {
                this.setCustomerUserId(customerUserId);
                final StringBuilder sb = new StringBuilder("CustomerUserId set: ");
                sb.append(customerUserId);
                sb.append(" - Initializing AppsFlyer Tacking");
                AFLogger.values(sb.toString(), true);
                final String referrer = AppsFlyerProperties.getInstance().getReferrer(context);
                final String string = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
                if ((customerUserId = referrer) == null) {
                    customerUserId = "";
                }
                if (context instanceof Activity) {
                    ((Activity)context).getIntent();
                }
                final by by = new by();
                by.valueOf = (Application)INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
                by.AFLogger$LogLevel = null;
                by.AppsFlyer2dXConversionCallback = string;
                by.AFKeystoreWrapper = null;
                by.AFVersionDeclaration = customerUserId;
                by.values = null;
                this.AFInAppEventParameterName(by);
                return;
            }
            this.setCustomerUserId(customerUserId);
            AFLogger.values("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(customerUserId)), true);
        }
    }
    
    @Override
    public final void setCustomerUserId(final String s) {
        aj.AFInAppEventParameterName().AFInAppEventType("public_api_call", "setCustomerUserId", s);
        AFLogger.valueOf("setCustomerUserId = ".concat(String.valueOf(s)));
        AppsFlyerProperties.getInstance().set("AppUserId", s);
        AppsFlyerProperties.getInstance().set("waitForCustomerId", false);
    }
    
    @Override
    public final void setDebugLog(final boolean b) {
        AFLogger.LogLevel logLevel;
        if (b) {
            logLevel = AFLogger.LogLevel.DEBUG;
        }
        else {
            logLevel = AFLogger.LogLevel.NONE;
        }
        this.setLogLevel(logLevel);
    }
    
    @Override
    public final void setDisableAdvertisingIdentifiers(final boolean b) {
        AFLogger.AFInAppEventType("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(b)));
        ad.AFKeystoreWrapper = (b ^ true);
        AppsFlyerProperties.getInstance().remove("advertiserIdEnabled");
        AppsFlyerProperties.getInstance().remove("advertiserId");
    }
    
    @Override
    public final void setExtension(final String s) {
        aj.AFInAppEventParameterName().AFInAppEventType("public_api_call", "setExtension", s);
        AppsFlyerProperties.getInstance().set("sdkExtension", s);
    }
    
    @Override
    public final void setHost(final String s, final String s2) {
        if (s != null) {
            AppsFlyerProperties.getInstance().set("custom_host_prefix", s);
        }
        if (s2 != null && !s2.isEmpty()) {
            AppsFlyerProperties.getInstance().set("custom_host", s2);
            return;
        }
        AFLogger.AFLogger$LogLevel("hostName cannot be null or empty");
    }
    
    @Override
    public final void setImeiData(final String afVersionDeclaration) {
        aj.AFInAppEventParameterName().AFInAppEventType("public_api_call", "setImeiData", afVersionDeclaration);
        this.AFVersionDeclaration = afVersionDeclaration;
    }
    
    @Override
    public final void setIsUpdate(final boolean b) {
        aj.AFInAppEventParameterName().AFInAppEventType("public_api_call", "setIsUpdate", String.valueOf(b));
        AppsFlyerProperties.getInstance().set("IS_UPDATE", b);
    }
    
    @Override
    public final void setLogLevel(final AFLogger.LogLevel logLevel) {
        aj.AFInAppEventParameterName().AFInAppEventType("public_api_call", "log", String.valueOf(logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
    }
    
    @Override
    public final void setMinTimeBetweenSessions(final int n) {
        this.AppsFlyerConversionListener = TimeUnit.SECONDS.toMillis(n);
    }
    
    @Override
    public final void setOaidData(final String afInAppEventParameterName) {
        aj.AFInAppEventParameterName().AFInAppEventType("public_api_call", "setOaidData", afInAppEventParameterName);
        ad.AFInAppEventParameterName = afInAppEventParameterName;
    }
    
    @Override
    public final void setOneLinkCustomDomain(final String... appsFlyer2dXConversionCallback) {
        AFLogger.AFInAppEventType(0II.LIZ("setOneLinkCustomDomain %s", new Object[] { Arrays.toString(appsFlyer2dXConversionCallback) }));
        i.AppsFlyer2dXConversionCallback = appsFlyer2dXConversionCallback;
    }
    
    @Override
    public final void setOutOfStore(String lowerCase) {
        if (lowerCase != null) {
            lowerCase = lowerCase.toLowerCase();
            AppsFlyerProperties.getInstance().set("api_store_value", lowerCase);
            AFLogger.values("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
            return;
        }
        AFLogger.values("Cannot set setOutOfStore with null");
    }
    
    @Override
    public final void setPartnerData(String concat, final Map<String, Object> map) {
        if (this.setUserEmails == null) {
            this.setUserEmails = new bb();
        }
        final bb setUserEmails = this.setUserEmails;
        if (concat == null || concat.isEmpty()) {
            AFLogger.AFLogger$LogLevel("Partner ID is missing or `null`");
            return;
        }
        if (map == null || map.isEmpty()) {
            if (setUserEmails.values.remove(concat) == null) {
                concat = "Partner data is missing or `null`";
            }
            else {
                concat = "Cleared partner data for ".concat(String.valueOf(concat));
            }
            AFLogger.AFLogger$LogLevel(concat);
            return;
        }
        final StringBuilder sb = new StringBuilder("Setting partner data for ");
        sb.append(concat);
        sb.append(": ");
        sb.append(map);
        AFLogger.AFInAppEventType(sb.toString());
        final int length = new JSONObject((Map)map).toString().length();
        if (length > 1000) {
            AFLogger.AFLogger$LogLevel("Partner data 1000 characters limit exceeded");
            final HashMap hashMap = new HashMap();
            hashMap.put("error", "limit exceeded: ".concat(String.valueOf(length)));
            setUserEmails.AFInAppEventType.put(concat, hashMap);
            return;
        }
        setUserEmails.values.put(concat, map);
        setUserEmails.AFInAppEventType.remove(concat);
    }
    
    @Override
    public final void setPhoneNumber(final String s) {
        this.getOutOfStore = ah.AFInAppEventParameterName(s);
    }
    
    @Override
    public final void setPreinstallAttribution(String string, final String s, final String s2) {
        AFLogger.AFInAppEventType("setPreinstallAttribution API called");
        final JSONObject jsonObject = new JSONObject();
        Label_0029: {
            if (string == null) {
                break Label_0029;
            }
            try {
                jsonObject.put("pid", (Object)string);
                if (s != null) {
                    jsonObject.put("c", (Object)s);
                }
                if (s2 != null) {
                    jsonObject.put("af_siteid", (Object)s2);
                }
            }
            catch (final JSONException ex) {
                AFLogger.valueOf(((Throwable)ex).getMessage(), (Throwable)ex);
            }
        }
        if (jsonObject.has("pid")) {
            string = jsonObject.toString();
            AppsFlyerProperties.getInstance().set("preInstallName", string);
            return;
        }
        AFLogger.AFLogger$LogLevel("Cannot set preinstall attribution data without a media source");
    }
    
    @Override
    public final void setResolveDeepLinkURLs(final String... afKeystoreWrapper) {
        AFLogger.AFInAppEventType(0II.LIZ("setResolveDeepLinkURLs %s", new Object[] { Arrays.toString(afKeystoreWrapper) }));
        i.AFKeystoreWrapper = afKeystoreWrapper;
    }
    
    @Override
    public final void setSharingFilter(final String... sharingFilterForPartners) {
        this.setSharingFilterForPartners(sharingFilterForPartners);
    }
    
    @Override
    public final void setSharingFilterForAllPartners() {
        this.setSharingFilterForPartners("all");
    }
    
    @Override
    public final void setSharingFilterForPartners(final String... array) {
        this.onAppOpenAttributionNative = new l(array);
    }
    
    @Override
    public final void setUserEmails(final AppsFlyerProperties.EmailsCryptType emailsCryptType, final String... array) {
        final ArrayList list = new ArrayList(array.length + 1);
        list.add(emailsCryptType.toString());
        list.addAll(Arrays.asList(array));
        aj.AFInAppEventParameterName().AFInAppEventType("public_api_call", "setUserEmails", (String[])list.toArray(new String[array.length + 1]));
        AppsFlyerProperties.getInstance().set("userEmailsCryptType", emailsCryptType.getValue());
        final HashMap hashMap = new HashMap();
        final ArrayList list2 = new ArrayList();
        final int length = array.length;
        Object o = null;
        for (final String s : array) {
            if (ai$7.values[emailsCryptType.ordinal()] != 2) {
                list2.add(ah.AFInAppEventParameterName(s));
                o = "sha256_el_arr";
            }
            else {
                list2.add(s);
                o = "plain_el_arr";
            }
        }
        hashMap.put(o, list2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject((Map)hashMap).toString());
    }
    
    @Override
    public final void setUserEmails(final String... array) {
        aj.AFInAppEventParameterName().AFInAppEventType("public_api_call", "setUserEmails", array);
        this.setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, array);
    }
    
    @Override
    public final void start(final Context context) {
        this.start(context, null);
    }
    
    @Override
    public final void start(final Context context, final String s) {
        this.start(context, s, null);
    }
    
    @Override
    public final void start(final Context context, final String s, final AppsFlyerRequestListener appsFlyerRequestListener) {
        if (ag.valueOf != null) {
            return;
        }
        if (!this.setOaidData) {
            AFLogger.AFLogger$LogLevel("ERROR: AppsFlyer SDK is not initialized! The API call 'start()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
            if (s == null) {
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, az.AFInAppEventType);
                }
                return;
            }
        }
        this.setAdditionalData.AFKeystoreWrapper = INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
        if (this.AFLogger$LogLevel == null) {
            this.AFLogger$LogLevel = new au(context);
        }
        final au afLogger$LogLevel = this.AFLogger$LogLevel;
        String s2;
        if (context instanceof Activity) {
            s2 = "activity";
        }
        else if (context instanceof Application) {
            s2 = "application";
        }
        else {
            s2 = "other";
        }
        afLogger$LogLevel.AFKeystoreWrapper.put("start_with", s2);
        this.setAndroidIdData = (Application)INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
        aj.AFInAppEventParameterName().AFInAppEventType("public_api_call", "start", s);
        final String afInAppEventParameterName = ai.AFInAppEventParameterName;
        AFLogger.valueOf(0II.LIZ("Starting AppsFlyer: (v%s.%s)", new Object[] { "6.4.0", afInAppEventParameterName }));
        final StringBuilder sb = new StringBuilder("Build Number: ");
        sb.append(afInAppEventParameterName);
        AFLogger.valueOf(sb.toString());
        AppsFlyerProperties.getInstance().loadProperties(INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext((Context)this.setAndroidIdData));
        if (!TextUtils.isEmpty((CharSequence)s)) {
            AppsFlyerProperties.getInstance().set("AppsFlyerKey", s);
            al.AFInAppEventParameterName(s);
        }
        else if (TextUtils.isEmpty((CharSequence)AppsFlyerProperties.getInstance().getString("AppsFlyerKey"))) {
            AFLogger.AFLogger$LogLevel("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
            if (appsFlyerRequestListener != null) {
                appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, az.AFInAppEventType);
            }
            return;
        }
        final Context baseContext = ((ContextWrapper)this.setAndroidIdData).getBaseContext();
        try {
            if ((INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo(baseContext.getPackageManager(), baseContext.getPackageName(), 0).applicationInfo.flags & 0x8000) != 0x0) {
                if (baseContext.getResources().getIdentifier("appsflyer_backup_rules", "xml", baseContext.getPackageName()) != 0) {
                    AFLogger.values("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                }
                else {
                    AFLogger.values("'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules");
                }
            }
        }
        catch (final Exception ex) {
            final StringBuilder sb2 = new StringBuilder("checkBackupRules Exception: ");
            sb2.append(ex.toString());
            AFLogger.AFInAppEventParameterName(sb2.toString());
        }
        if (this.setPhoneNumber) {
            final Context invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext = INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext((Context)this.setAndroidIdData);
            this.setCustomerUserId = new HashMap<String, Object>();
            final l.c c = new l.c() {
                public /* synthetic */ long AFKeystoreWrapper = System.currentTimeMillis();
                
                static {
                    Covode.recordClassIndex(2597);
                }
                
                @Override
                public final void AFKeystoreWrapper(final String s) {
                    ai.valueOf(ai.this).put("error", s);
                }
                
                @Override
                public final void values(final String s, final String s2, final String s3) {
                    if (s != null) {
                        AFLogger.valueOf("Facebook Deferred AppLink data received: ".concat(String.valueOf(s)));
                        ai.valueOf(ai.this).put("link", s);
                        if (s2 != null) {
                            ai.valueOf(ai.this).put("target_url", s2);
                        }
                        if (s3 != null) {
                            final HashMap hashMap = new HashMap();
                            final HashMap hashMap2 = new HashMap();
                            hashMap2.put("promo_code", s3);
                            hashMap.put("deeplink_context", hashMap2);
                            ai.valueOf(ai.this).put("extras", hashMap);
                        }
                    }
                    else {
                        ai.valueOf(ai.this).put("link", "");
                    }
                    ai.valueOf(ai.this).put("ttr", String.valueOf(System.currentTimeMillis() - this.AFKeystoreWrapper));
                }
            };
            try {
                Class.forName("com.facebook.s").getMethod("LIZ", Context.class).invoke(null, invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext);
                final Class<?> forName = Class.forName("com.facebook.applinks.a");
                final Class<?> forName2 = Class.forName("com.facebook.applinks.a$a");
                final Method method = forName.getMethod("fetchDeferredAppLinkData", Context.class, String.class, forName2);
                final Object proxyInstance = Proxy.newProxyInstance(forName2.getClassLoader(), new Class[] { forName2 }, new InvocationHandler() {
                    public /* synthetic */ Class AFInAppEventType = forName;
                    public /* synthetic */ c AFKeystoreWrapper = c;
                    
                    static {
                        Covode.recordClassIndex(2705);
                    }
                    
                    @Override
                    public final Object invoke(Object cast, final Method method, final Object[] array) {
                        if (method.getName().equals("onDeferredAppLinkDataFetched")) {
                            if (array[0] != null) {
                                cast = this.AFInAppEventType.cast(array[0]);
                                final Bundle bundle = Bundle.class.cast(this.AFInAppEventType.getMethod("getArgumentBundle", (Class[])new Class[0]).invoke(cast, new Object[0]));
                                String string = null;
                                String string2 = null;
                                String string3 = null;
                                Label_0106: {
                                    if (bundle != null) {
                                        string = bundle.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                                        string2 = bundle.getString("target_url");
                                        final Bundle bundle2 = bundle.getBundle("extras");
                                        if (bundle2 != null) {
                                            final Bundle bundle3 = bundle2.getBundle("deeplink_context");
                                            if (bundle3 != null) {
                                                string3 = bundle3.getString("promo_code");
                                                break Label_0106;
                                            }
                                        }
                                        string3 = null;
                                    }
                                    else {
                                        string3 = null;
                                        string = (string2 = string3);
                                    }
                                }
                                final c afKeystoreWrapper = this.AFKeystoreWrapper;
                                if (afKeystoreWrapper != null) {
                                    afKeystoreWrapper.values(string, string2, string3);
                                }
                            }
                            else {
                                final c afKeystoreWrapper2 = this.AFKeystoreWrapper;
                                if (afKeystoreWrapper2 != null) {
                                    afKeystoreWrapper2.values(null, null, null);
                                }
                            }
                            return null;
                        }
                        final c afKeystoreWrapper3 = this.AFKeystoreWrapper;
                        if (afKeystoreWrapper3 != null) {
                            afKeystoreWrapper3.AFKeystoreWrapper("onDeferredAppLinkDataFetched invocation failed");
                        }
                        return null;
                    }
                });
                final String string = invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext.getString(invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext.getResources().getIdentifier("facebook_app_id", "string", invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext.getPackageName()));
                if (TextUtils.isEmpty((CharSequence)string)) {
                    c.AFKeystoreWrapper("Facebook app id not defined in resources");
                }
                else {
                    method.invoke(null, invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext, string, proxyInstance);
                }
            }
            catch (final IllegalAccessException ex2) {
                c.AFKeystoreWrapper(ex2.toString());
            }
            catch (final InvocationTargetException ex3) {
                c.AFKeystoreWrapper(ex3.toString());
            }
            catch (final NoSuchMethodException ex4) {
                c.AFKeystoreWrapper(ex4.toString());
            }
            catch (final ClassNotFoundException ex5) {
                c.AFKeystoreWrapper(ex5.toString());
            }
        }
        ag.AFKeystoreWrapper(context, (ag.b)new ag.b() {
            static {
                Covode.recordClassIndex(2592);
            }
            
            public static void INVOKEINTERFACE_com_appsflyer_internal_ai$10_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(final SharedPreferences$Editor sharedPreferences$Editor) {
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
            
            public static Context INVOKEVIRTUAL_com_appsflyer_internal_ai$10_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context applicationContext) {
                applicationContext = applicationContext.getApplicationContext();
                if (!5WL.LIZIZ) {
                    return applicationContext;
                }
                if (applicationContext != null) {
                    return applicationContext;
                }
                return (Context)5WL.LIZ;
            }
            
            @Override
            public final void AFKeystoreWrapper(final Activity activity) {
                ai.AFInAppEventParameterName(ai.this, System.currentTimeMillis());
                final au afInAppEventType = afLogger$LogLevel;
                if (afInAppEventType.valueOf()) {
                    INVOKEINTERFACE_com_appsflyer_internal_ai$10_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(afInAppEventType.values.edit().putLong("fg_ts", System.currentTimeMillis()));
                }
                final int afInAppEventParameterName = ai.AFInAppEventParameterName(ai.values((Context)activity), "appsFlyerCount", false);
                if (afInAppEventParameterName == 0) {
                    afLogger$LogLevel.AFKeystoreWrapper.put("init_to_fg", ai.AFInAppEventType(ai.this) - afLogger$LogLevel.values.getLong("init_ts", 0L));
                }
                AFLogger.valueOf("onBecameForeground");
                if (afInAppEventParameterName < 2) {
                    final ab afKeystoreWrapper = ab.AFKeystoreWrapper((Context)activity);
                    afKeystoreWrapper.AFInAppEventType.post(afKeystoreWrapper.getLevel);
                    afKeystoreWrapper.AFInAppEventType.post(afKeystoreWrapper.valueOf);
                }
                final by by = new by();
                i.values().AFKeystoreWrapper(by.AFInAppEventParameterName(), afLogger$LogLevel, activity.getIntent(), (Context)activity.getApplication());
                final ai afInAppEventParameterName2 = ai.this;
                by.valueOf = (Application)INVOKEVIRTUAL_com_appsflyer_internal_ai$10_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext((Context)activity);
                by.AppsFlyer2dXConversionCallback = s;
                by.AFInAppEventParameterName = appsFlyerRequestListener;
                afInAppEventParameterName2.valueOf(by, activity);
            }
            
            @Override
            public final void valueOf(final Context context) {
                AFLogger.valueOf("onBecameBackground");
                ai.AFKeystoreWrapper(ai.this, System.currentTimeMillis());
                long n2;
                final long n = n2 = ai.AFInAppEventParameterName(ai.this) - ai.AFInAppEventType(ai.this);
                if (n > 0L) {
                    n2 = n;
                    if (n < 1000L) {
                        n2 = 1000L;
                    }
                }
                final ai afInAppEventParameterName = ai.this;
                if (afInAppEventParameterName.AFLogger$LogLevel == null) {
                    afInAppEventParameterName.AFLogger$LogLevel = new au(context);
                }
                INVOKEINTERFACE_com_appsflyer_internal_ai$10_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(afInAppEventParameterName.AFLogger$LogLevel.values.edit().putLong("prev_session_dur", TimeUnit.MILLISECONDS.toSeconds(n2)));
                AFLogger.valueOf("callStatsBackground background call");
                ai.this.AFKeystoreWrapper(new WeakReference<Context>(context));
                final aj afInAppEventParameterName2 = aj.AFInAppEventParameterName();
                if (afInAppEventParameterName2.getLevel()) {
                    afInAppEventParameterName2.values();
                    if (context != null) {
                        aj.AFInAppEventParameterName(context.getPackageName(), context.getPackageManager());
                    }
                    afInAppEventParameterName2.AFKeystoreWrapper();
                }
                else {
                    AFLogger.AFInAppEventType("RD status is OFF");
                }
                if (k.values == null) {
                    k.values = new k();
                }
                final k values = k.values;
                try {
                    k.valueOf(values.valueOf);
                    if (values.AFKeystoreWrapper instanceof ThreadPoolExecutor) {
                        k.valueOf((ExecutorService)values.AFKeystoreWrapper);
                    }
                }
                finally {
                    final Throwable t;
                    AFLogger.valueOf("failed to stop Executors", t);
                }
                final ab afKeystoreWrapper = ab.AFKeystoreWrapper(context);
                afKeystoreWrapper.AFInAppEventType.post(afKeystoreWrapper.getLevel);
            }
        }, this.setAppInviteOneLink);
    }
    
    @Override
    public final void stop(final boolean setImeiData, final Context context) {
        this.setImeiData = setImeiData;
        af.values();
        try {
            final File values = af.values(context);
            if (!values.exists()) {
                values.mkdir();
            }
            else {
                for (final File file : values.listFiles()) {
                    final StringBuilder sb = new StringBuilder("Found cached request");
                    sb.append(file.getName());
                    AFLogger.valueOf(sb.toString());
                    af.AFKeystoreWrapper(af.valueOf(file).AFKeystoreWrapper, context);
                }
            }
        }
        catch (final Exception ex) {
            AFLogger.valueOf("Could not cache request", ex);
        }
        if (this.setImeiData) {
            final SharedPreferences$Editor edit = values(context).edit();
            edit.putBoolean("is_stop_tracking_used", true);
            INVOKEINTERFACE_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(edit);
        }
    }
    
    @Override
    public final void subscribeForDeepLink(final DeepLinkListener deepLinkListener) {
        this.subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
    }
    
    @Override
    public final void subscribeForDeepLink(final DeepLinkListener valueOf, final long onInstallConversionDataLoadedNative) {
        i.values().valueOf = valueOf;
        ar.onInstallConversionDataLoadedNative = onInstallConversionDataLoadedNative;
    }
    
    @Override
    public final void unregisterConversionListener() {
        aj.AFInAppEventParameterName().AFInAppEventType("public_api_call", "unregisterConversionListener", new String[0]);
        ai.AFInAppEventType = null;
    }
    
    @Override
    public final void updateServerUninstallToken(final Context context, final String s) {
        new bq(context).values(s);
    }
    
    @Override
    public final void validateAndLogInAppPurchase(final Context context, final String s, final String s2, final String s3, final String s4, final String s5, final Map<String, String> map) {
        final aj afInAppEventParameterName = aj.AFInAppEventParameterName();
        String string;
        if (map == null) {
            string = "";
        }
        else {
            string = map.toString();
        }
        afInAppEventParameterName.AFInAppEventType("public_api_call", "validateAndTrackInAppPurchase", s, s2, s3, s4, s5, string);
        if (!this.isStopped()) {
            final StringBuilder sb = new StringBuilder("Validate in app called with parameters: ");
            sb.append(s3);
            sb.append(" ");
            sb.append(s4);
            sb.append(" ");
            sb.append(s5);
            AFLogger.valueOf(sb.toString());
        }
        if (s == null || s4 == null || s2 == null || s5 == null || s3 == null) {
            final AppsFlyerInAppPurchaseValidatorListener afKeystoreWrapper = ai.AFKeystoreWrapper;
            if (afKeystoreWrapper != null) {
                afKeystoreWrapper.onValidateInAppFailure("Please provide purchase parameters");
            }
        }
        else {
            final Context invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext = INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
            final String string2 = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
            if (context instanceof Activity) {
                ((Activity)context).getIntent();
            }
            new PthreadThread((Runnable)new z(invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext, string2, s, s2, s3, s4, s5, map), "r/internal/ai").start();
        }
    }
    
    public final String valueOf(final Context context) {
        String s = null;
        Label_0045: {
            if ((s = AppsFlyerProperties.getInstance().getString("channel")) != null) {
                break Label_0045;
            }
            String s2;
            if (context == null) {
                s2 = null;
            }
            else {
                s = valueOf("CHANNEL", context.getPackageManager(), context.getPackageName());
                if ((s2 = s) != null) {
                    break Label_0045;
                }
            }
            return s2;
        }
        String s2 = s;
        if (s.equals("")) {
            return null;
        }
        return s2;
    }
    
    public final Map<String, Object> valueOf(final j p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/appsflyer/internal/j.valueOf:Landroid/app/Application;
        //     4: astore_2       
        //     5: aload_1        
        //     6: getfield        com/appsflyer/internal/j.AppsFlyer2dXConversionCallback:Ljava/lang/String;
        //     9: astore_3       
        //    10: aload_1        
        //    11: getfield        com/appsflyer/internal/j.AFLogger$LogLevel:Ljava/lang/String;
        //    14: astore          4
        //    16: aload_1        
        //    17: getfield        com/appsflyer/internal/j.AFKeystoreWrapper:Ljava/util/Map;
        //    20: ifnonnull       175
        //    23: new             Ljava/util/HashMap;
        //    26: dup            
        //    27: invokespecial   java/util/HashMap.<init>:()V
        //    30: astore          5
        //    32: new             Lorg/json/JSONObject;
        //    35: dup            
        //    36: aload           5
        //    38: invokespecial   org/json/JSONObject.<init>:(Ljava/util/Map;)V
        //    41: invokevirtual   org/json/JSONObject.toString:()Ljava/lang/String;
        //    44: astore          6
        //    46: aload_1        
        //    47: getfield        com/appsflyer/internal/j.AFVersionDeclaration:Ljava/lang/String;
        //    50: astore          5
        //    52: aload_2        
        //    53: invokestatic    com/appsflyer/internal/ai.values:(Landroid/content/Context;)Landroid/content/SharedPreferences;
        //    56: astore          7
        //    58: aload_1        
        //    59: invokevirtual   com/appsflyer/internal/j.AFKeystoreWrapper:()Z
        //    62: istore          8
        //    64: aload_1        
        //    65: getfield        com/appsflyer/internal/j.values:Ljava/lang/String;
        //    68: astore          9
        //    70: aload_1        
        //    71: getfield        com/appsflyer/internal/j.AFInAppEventType:Ljava/util/Map;
        //    74: astore          10
        //    76: aload_2        
        //    77: aload           10
        //    79: invokestatic    com/appsflyer/internal/ad.AFInAppEventType:(Landroid/content/Context;Ljava/util/Map;)Lcom/appsflyer/internal/c$d$b;
        //    82: pop            
        //    83: getstatic       com/appsflyer/internal/ad.AFKeystoreWrapper:Ljava/lang/Boolean;
        //    86: astore_1       
        //    87: aload_1        
        //    88: ifnull          121
        //    91: aload_1        
        //    92: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    95: ifne            121
        //    98: aload           10
        //   100: invokestatic    com/appsflyer/internal/ai.valueOf:(Ljava/util/Map;)Ljava/util/Map;
        //   103: ldc_w           "ad_ids_disabled"
        //   106: aload_1        
        //   107: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   110: iconst_1       
        //   111: ixor           
        //   112: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   115: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   120: pop            
        //   121: new             Ljava/util/Date;
        //   124: dup            
        //   125: invokespecial   java/util/Date.<init>:()V
        //   128: invokevirtual   java/util/Date.getTime:()J
        //   131: lstore          11
        //   133: aload           10
        //   135: ldc_w           "af_timestamp"
        //   138: lload           11
        //   140: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //   143: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   148: pop            
        //   149: aload_2        
        //   150: lload           11
        //   152: invokestatic    com/appsflyer/internal/c.AFKeystoreWrapper:(Landroid/content/Context;J)Ljava/lang/String;
        //   155: astore_1       
        //   156: aload_1        
        //   157: ifnull          184
        //   160: aload           10
        //   162: ldc_w           "cksm_v1"
        //   165: aload_1        
        //   166: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   171: pop            
        //   172: goto            184
        //   175: aload_1        
        //   176: getfield        com/appsflyer/internal/j.AFKeystoreWrapper:Ljava/util/Map;
        //   179: astore          5
        //   181: goto            32
        //   184: aload_0        
        //   185: invokevirtual   com/appsflyer/AppsFlyerLib.isStopped:()Z
        //   188: ifne            218
        //   191: new             Ljava/lang/StringBuilder;
        //   194: astore          13
        //   196: aload           13
        //   198: ldc_w           "******* sendTrackingWithEvent: "
        //   201: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   204: iload           8
        //   206: ifeq            212
        //   209: goto            227
        //   212: aload           4
        //   214: astore_1       
        //   215: goto            231
        //   218: ldc_w           "Reporting has been stopped"
        //   221: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;)V
        //   224: goto            246
        //   227: ldc_w           "Launch"
        //   230: astore_1       
        //   231: aload           13
        //   233: aload_1        
        //   234: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   237: pop            
        //   238: aload           13
        //   240: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   243: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;)V
        //   246: invokestatic    com/appsflyer/internal/af.values:()Lcom/appsflyer/internal/af;
        //   249: pop            
        //   250: aload_2        
        //   251: invokestatic    com/appsflyer/internal/af.values:(Landroid/content/Context;)Ljava/io/File;
        //   254: invokevirtual   java/io/File.exists:()Z
        //   257: ifne            279
        //   260: aload_2        
        //   261: invokestatic    com/appsflyer/internal/af.values:(Landroid/content/Context;)Ljava/io/File;
        //   264: invokevirtual   java/io/File.mkdir:()Z
        //   267: pop            
        //   268: goto            279
        //   271: astore_1       
        //   272: ldc_w           "Could not create cache directory"
        //   275: aload_1        
        //   276: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   279: aload_2        
        //   280: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   283: aload_2        
        //   284: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   287: sipush          4096
        //   290: invokestatic    com/appsflyer/internal/ai.INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo:(Landroid/content/pm/PackageManager;Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //   293: getfield        android/content/pm/PackageInfo.requestedPermissions:[Ljava/lang/String;
        //   296: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //   299: astore_1       
        //   300: aload_1        
        //   301: ldc_w           "android.permission.INTERNET"
        //   304: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   309: ifne            318
        //   312: ldc_w           "Permission android.permission.INTERNET is missing in the AndroidManifest.xml"
        //   315: invokestatic    com/appsflyer/AFLogger.AFLogger$LogLevel:(Ljava/lang/String;)V
        //   318: aload_1        
        //   319: ldc_w           "android.permission.ACCESS_NETWORK_STATE"
        //   322: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   327: ifne            336
        //   330: ldc_w           "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml"
        //   333: invokestatic    com/appsflyer/AFLogger.AFLogger$LogLevel:(Ljava/lang/String;)V
        //   336: aload_1        
        //   337: ldc_w           "android.permission.ACCESS_WIFI_STATE"
        //   340: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   345: ifne            365
        //   348: ldc_w           "Permission android.permission.ACCESS_WIFI_STATE is missing in the AndroidManifest.xml"
        //   351: invokestatic    com/appsflyer/AFLogger.AFLogger$LogLevel:(Ljava/lang/String;)V
        //   354: goto            365
        //   357: astore_1       
        //   358: ldc_w           "Exception while validation permissions. "
        //   361: aload_1        
        //   362: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   365: aload           10
        //   367: ldc_w           "af_events_api"
        //   370: ldc_w           "1"
        //   373: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   378: pop            
        //   379: aload           10
        //   381: ldc_w           "brand"
        //   384: getstatic       android/os/Build.BRAND:Ljava/lang/String;
        //   387: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   392: pop            
        //   393: aload           10
        //   395: ldc_w           "device"
        //   398: getstatic       android/os/Build.DEVICE:Ljava/lang/String;
        //   401: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   406: pop            
        //   407: aload           10
        //   409: ldc_w           "product"
        //   412: getstatic       android/os/Build.PRODUCT:Ljava/lang/String;
        //   415: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   420: pop            
        //   421: aload           10
        //   423: ldc_w           "sdk"
        //   426: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   429: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   432: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   437: pop            
        //   438: aload           10
        //   440: ldc_w           "model"
        //   443: getstatic       android/os/Build.MODEL:Ljava/lang/String;
        //   446: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   451: pop            
        //   452: aload           10
        //   454: ldc_w           "deviceType"
        //   457: getstatic       android/os/Build.TYPE:Ljava/lang/String;
        //   460: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   465: pop            
        //   466: aload_2        
        //   467: aload           10
        //   469: invokestatic    com/appsflyer/internal/ai.valueOf:(Landroid/content/Context;Ljava/util/Map;)V
        //   472: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //   475: astore          14
        //   477: aload_0        
        //   478: getfield        com/appsflyer/internal/ai.AFLogger$LogLevel:Lcom/appsflyer/internal/au;
        //   481: ifnonnull       498
        //   484: new             Lcom/appsflyer/internal/au;
        //   487: astore_1       
        //   488: aload_1        
        //   489: aload_2        
        //   490: invokespecial   com/appsflyer/internal/au.<init>:(Landroid/content/Context;)V
        //   493: aload_0        
        //   494: aload_1        
        //   495: putfield        com/appsflyer/internal/ai.AFLogger$LogLevel:Lcom/appsflyer/internal/au;
        //   498: aload_0        
        //   499: getfield        com/appsflyer/internal/ai.AFLogger$LogLevel:Lcom/appsflyer/internal/au;
        //   502: astore          13
        //   504: iload           8
        //   506: ifeq            1008
        //   509: aload_2        
        //   510: invokestatic    com/appsflyer/internal/ai.AFInAppEventType:(Landroid/content/Context;)Z
        //   513: ifeq            626
        //   516: aload           14
        //   518: invokevirtual   com/appsflyer/AppsFlyerProperties.isOtherSdkStringDisabled:()Z
        //   521: ifne            542
        //   524: aload           10
        //   526: ldc_w           "batteryLevel"
        //   529: aload_2        
        //   530: invokestatic    com/appsflyer/internal/ai.init:(Landroid/content/Context;)F
        //   533: invokestatic    java/lang/String.valueOf:(F)Ljava/lang/String;
        //   536: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   541: pop            
        //   542: aload_2        
        //   543: invokestatic    com/appsflyer/internal/ai.AFKeystoreWrapper:(Landroid/content/Context;)V
        //   546: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   549: bipush          23
        //   551: if_icmplt       568
        //   554: aload_2        
        //   555: ldc_w           Landroid/app/UiModeManager;.class
        //   558: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/Class;)Ljava/lang/Object;
        //   561: checkcast       Landroid/app/UiModeManager;
        //   564: astore_1       
        //   565: goto            579
        //   568: aload_2        
        //   569: ldc_w           "uimode"
        //   572: invokestatic    com/appsflyer/internal/ai.INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService:(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;
        //   575: checkcast       Landroid/app/UiModeManager;
        //   578: astore_1       
        //   579: aload_1        
        //   580: ifnull          605
        //   583: aload_1        
        //   584: invokevirtual   android/app/UiModeManager.getCurrentModeType:()I
        //   587: iconst_4       
        //   588: if_icmpne       605
        //   591: aload           10
        //   593: ldc_w           "tv"
        //   596: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //   599: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   604: pop            
        //   605: aload_2        
        //   606: invokestatic    com/appsflyer/internal/bt.values:(Landroid/content/Context;)Z
        //   609: ifeq            626
        //   612: aload           10
        //   614: ldc_w           "inst_app"
        //   617: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //   620: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   625: pop            
        //   626: aload_2        
        //   627: invokestatic    com/appsflyer/internal/ai.values:(Landroid/content/Context;)Landroid/content/SharedPreferences;
        //   630: ldc_w           "AppsFlyerTimePassedSincePrevLaunch"
        //   633: lconst_0       
        //   634: invokeinterface android/content/SharedPreferences.getLong:(Ljava/lang/String;J)J
        //   639: lstore          11
        //   641: invokestatic    java/lang/System.currentTimeMillis:()J
        //   644: lstore          15
        //   646: aload_0        
        //   647: aload_2        
        //   648: ldc_w           "AppsFlyerTimePassedSincePrevLaunch"
        //   651: lload           15
        //   653: invokevirtual   com/appsflyer/internal/ai.valueOf:(Landroid/content/Context;Ljava/lang/String;J)V
        //   656: lload           11
        //   658: lconst_0       
        //   659: lcmp           
        //   660: ifle            666
        //   663: goto            674
        //   666: ldc2_w          -1
        //   669: lstore          11
        //   671: goto            685
        //   674: lload           15
        //   676: lload           11
        //   678: lsub           
        //   679: ldc2_w          1000
        //   682: ldiv           
        //   683: lstore          11
        //   685: aload           10
        //   687: ldc_w           "timepassedsincelastlaunch"
        //   690: lload           11
        //   692: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //   695: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   700: pop            
        //   701: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //   704: ldc_w           "oneLinkSlug"
        //   707: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   710: astore_1       
        //   711: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //   714: ldc_w           "onelinkVersion"
        //   717: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   720: astore          17
        //   722: aload_1        
        //   723: ifnull          738
        //   726: aload           10
        //   728: ldc_w           "onelink_id"
        //   731: aload_1        
        //   732: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   737: pop            
        //   738: aload           17
        //   740: ifnull          756
        //   743: aload           10
        //   745: ldc_w           "onelink_ver"
        //   748: aload           17
        //   750: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   755: pop            
        //   756: aload_0        
        //   757: getfield        com/appsflyer/internal/ai.AFLogger$LogLevel:Lcom/appsflyer/internal/au;
        //   760: getfield        com/appsflyer/internal/au.values:Landroid/content/SharedPreferences;
        //   763: ldc_w           "gcd"
        //   766: aconst_null    
        //   767: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   772: astore          17
        //   774: aload           17
        //   776: ifnull          842
        //   779: new             Lorg/json/JSONObject;
        //   782: astore_1       
        //   783: aload_1        
        //   784: aload           17
        //   786: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //   789: aload_1        
        //   790: invokestatic    com/appsflyer/internal/o.values:(Lorg/json/JSONObject;)Ljava/util/Map;
        //   793: astore_1       
        //   794: aload_1        
        //   795: invokeinterface java/util/Map.isEmpty:()Z
        //   800: ifne            842
        //   803: aload           10
        //   805: invokestatic    com/appsflyer/internal/ai.valueOf:(Ljava/util/Map;)Ljava/util/Map;
        //   808: ldc_w           "gcd"
        //   811: aload_1        
        //   812: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   817: pop            
        //   818: aload_0        
        //   819: getfield        com/appsflyer/internal/ai.AFLogger$LogLevel:Lcom/appsflyer/internal/au;
        //   822: getfield        com/appsflyer/internal/au.values:Landroid/content/SharedPreferences;
        //   825: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //   830: ldc_w           "gcd"
        //   833: aconst_null    
        //   834: invokeinterface android/content/SharedPreferences$Editor.putString:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
        //   839: invokestatic    com/appsflyer/internal/ai.INVOKEINTERFACE_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy:(Landroid/content/SharedPreferences$Editor;)V
        //   842: aload_0        
        //   843: getfield        com/appsflyer/internal/ai.getOutOfStore:Ljava/lang/String;
        //   846: astore_1       
        //   847: aload_1        
        //   848: ifnull          863
        //   851: aload           10
        //   853: ldc_w           "phone"
        //   856: aload_1        
        //   857: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   862: pop            
        //   863: aload           5
        //   865: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   868: istore          18
        //   870: iload           18
        //   872: ifne            888
        //   875: aload           10
        //   877: ldc_w           "referrer"
        //   880: aload           5
        //   882: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   887: pop            
        //   888: aload           7
        //   890: ldc_w           "extraReferrers"
        //   893: aconst_null    
        //   894: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   899: astore_1       
        //   900: aload_1        
        //   901: ifnull          916
        //   904: aload           10
        //   906: ldc_w           "extraReferrers"
        //   909: aload_1        
        //   910: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   915: pop            
        //   916: aload           14
        //   918: aload_2        
        //   919: invokevirtual   com/appsflyer/AppsFlyerProperties.getReferrer:(Landroid/content/Context;)Ljava/lang/String;
        //   922: astore_1       
        //   923: aload_1        
        //   924: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   927: ifne            955
        //   930: aload           10
        //   932: ldc_w           "referrer"
        //   935: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   940: ifnonnull       955
        //   943: aload           10
        //   945: ldc_w           "referrer"
        //   948: aload_1        
        //   949: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   954: pop            
        //   955: aload           13
        //   957: getfield        com/appsflyer/internal/au.values:Landroid/content/SharedPreferences;
        //   960: ldc_w           "prev_session_dur"
        //   963: lconst_0       
        //   964: invokeinterface android/content/SharedPreferences.getLong:(Ljava/lang/String;J)J
        //   969: lstore          11
        //   971: lload           11
        //   973: lconst_0       
        //   974: lcmp           
        //   975: ifeq            994
        //   978: aload           10
        //   980: ldc_w           "prev_session_dur"
        //   983: lload           11
        //   985: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   988: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   993: pop            
        //   994: getstatic       com/appsflyer/internal/ay.AFKeystoreWrapper:Landroid/app/Application;
        //   997: ifnonnull       1154
        //  1000: ldc2_w          -1
        //  1003: lstore          11
        //  1005: goto            1171
        //  1008: iconst_0       
        //  1009: istore          18
        //  1011: aload_2        
        //  1012: invokestatic    com/appsflyer/internal/ai.values:(Landroid/content/Context;)Landroid/content/SharedPreferences;
        //  1015: astore_1       
        //  1016: aload_1        
        //  1017: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //  1022: astore          19
        //  1024: aload_1        
        //  1025: ldc_w           "prev_event_name"
        //  1028: aconst_null    
        //  1029: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1034: astore          5
        //  1036: aload           5
        //  1038: ifnull          1096
        //  1041: new             Lorg/json/JSONObject;
        //  1044: astore          17
        //  1046: aload           17
        //  1048: invokespecial   org/json/JSONObject.<init>:()V
        //  1051: aload           17
        //  1053: ldc_w           "prev_event_timestamp"
        //  1056: aload_1        
        //  1057: ldc_w           "prev_event_timestamp"
        //  1060: ldc2_w          -1
        //  1063: invokeinterface android/content/SharedPreferences.getLong:(Ljava/lang/String;J)J
        //  1068: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;J)Lorg/json/JSONObject;
        //  1071: pop            
        //  1072: aload           17
        //  1074: ldc_w           "prev_event_name"
        //  1077: aload           5
        //  1079: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //  1082: pop            
        //  1083: aload           10
        //  1085: ldc_w           "prev_event"
        //  1088: aload           17
        //  1090: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1095: pop            
        //  1096: aload           19
        //  1098: ldc_w           "prev_event_name"
        //  1101: aload           4
        //  1103: invokeinterface android/content/SharedPreferences$Editor.putString:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
        //  1108: pop            
        //  1109: aload           19
        //  1111: ldc_w           "prev_event_timestamp"
        //  1114: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1117: invokeinterface android/content/SharedPreferences$Editor.putLong:(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
        //  1122: pop            
        //  1123: aload           19
        //  1125: invokestatic    com/appsflyer/internal/ai.INVOKEINTERFACE_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy:(Landroid/content/SharedPreferences$Editor;)V
        //  1128: goto            1285
        //  1131: astore_1       
        //  1132: goto            1144
        //  1135: astore_1       
        //  1136: goto            1144
        //  1139: astore_1       
        //  1140: goto            1144
        //  1143: astore_1       
        //  1144: ldc_w           "Error while processing previous event."
        //  1147: aload_1        
        //  1148: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1151: goto            1285
        //  1154: getstatic       com/appsflyer/internal/ay.AFKeystoreWrapper:Landroid/app/Application;
        //  1157: invokestatic    com/appsflyer/internal/ai.values:(Landroid/content/Context;)Landroid/content/SharedPreferences;
        //  1160: ldc_w           "exception_number"
        //  1163: lconst_0       
        //  1164: invokeinterface android/content/SharedPreferences.getLong:(Ljava/lang/String;J)J
        //  1169: lstore          11
        //  1171: aload           10
        //  1173: ldc_w           "exception_number"
        //  1176: lload           11
        //  1178: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1181: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1186: pop            
        //  1187: aload_0        
        //  1188: getfield        com/appsflyer/internal/ai.setUserEmails:Lcom/appsflyer/internal/bb;
        //  1191: astore          5
        //  1193: iload           8
        //  1195: istore          18
        //  1197: aload           5
        //  1199: ifnull          1285
        //  1202: aload           5
        //  1204: getfield        com/appsflyer/internal/bb.values:Ljava/util/Map;
        //  1207: invokeinterface java/util/Map.isEmpty:()Z
        //  1212: ifne            1231
        //  1215: aload           10
        //  1217: ldc_w           "partner_data"
        //  1220: aload           5
        //  1222: getfield        com/appsflyer/internal/bb.values:Ljava/util/Map;
        //  1225: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1230: pop            
        //  1231: iload           8
        //  1233: istore          18
        //  1235: aload           5
        //  1237: getfield        com/appsflyer/internal/bb.AFInAppEventType:Ljava/util/Map;
        //  1240: invokeinterface java/util/Map.isEmpty:()Z
        //  1245: ifne            1285
        //  1248: aload           10
        //  1250: invokestatic    com/appsflyer/internal/ai.valueOf:(Ljava/util/Map;)Ljava/util/Map;
        //  1253: ldc_w           "partner_data"
        //  1256: aload           5
        //  1258: getfield        com/appsflyer/internal/bb.AFInAppEventType:Ljava/util/Map;
        //  1261: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1266: pop            
        //  1267: new             Ljava/util/HashMap;
        //  1270: astore_1       
        //  1271: aload_1        
        //  1272: invokespecial   java/util/HashMap.<init>:()V
        //  1275: aload           5
        //  1277: aload_1        
        //  1278: putfield        com/appsflyer/internal/bb.AFInAppEventType:Ljava/util/Map;
        //  1281: iload           8
        //  1283: istore          18
        //  1285: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //  1288: ldc_w           "KSAppsFlyerId"
        //  1291: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //  1294: astore          5
        //  1296: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //  1299: ldc_w           "KSAppsFlyerRICounter"
        //  1302: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //  1305: astore_1       
        //  1306: aload           5
        //  1308: ifnull          1350
        //  1311: aload_1        
        //  1312: ifnull          1350
        //  1315: aload_1        
        //  1316: invokestatic    java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
        //  1319: invokevirtual   java/lang/Number.intValue:()I
        //  1322: ifle            1350
        //  1325: aload           10
        //  1327: ldc_w           "reinstallCounter"
        //  1330: aload_1        
        //  1331: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1336: pop            
        //  1337: aload           10
        //  1339: ldc_w           "originalAppsflyerId"
        //  1342: aload           5
        //  1344: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1349: pop            
        //  1350: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //  1353: ldc_w           "additionalCustomData"
        //  1356: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //  1359: astore_1       
        //  1360: aload_1        
        //  1361: ifnull          1376
        //  1364: aload           10
        //  1366: ldc_w           "customData"
        //  1369: aload_1        
        //  1370: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1375: pop            
        //  1376: aload_2        
        //  1377: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //  1380: aload_2        
        //  1381: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //  1384: invokevirtual   android/content/pm/PackageManager.getInstallerPackageName:(Ljava/lang/String;)Ljava/lang/String;
        //  1387: astore_1       
        //  1388: aload_1        
        //  1389: ifnull          1415
        //  1392: aload           10
        //  1394: ldc_w           "installer_package"
        //  1397: aload_1        
        //  1398: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1403: pop            
        //  1404: goto            1415
        //  1407: astore_1       
        //  1408: ldc_w           "Exception while getting the app's installer package. "
        //  1411: aload_1        
        //  1412: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1415: aload           14
        //  1417: ldc_w           "sdkExtension"
        //  1420: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //  1423: astore_1       
        //  1424: aload_1        
        //  1425: ifnull          1447
        //  1428: aload_1        
        //  1429: invokevirtual   java/lang/String.length:()I
        //  1432: ifle            1447
        //  1435: aload           10
        //  1437: ldc_w           "sdkExtension"
        //  1440: aload_1        
        //  1441: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1446: pop            
        //  1447: aload_0        
        //  1448: aload_2        
        //  1449: invokevirtual   com/appsflyer/internal/ai.valueOf:(Landroid/content/Context;)Ljava/lang/String;
        //  1452: astore_1       
        //  1453: aload_0        
        //  1454: aload_2        
        //  1455: aload_1        
        //  1456: invokevirtual   com/appsflyer/internal/ai.values:(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
        //  1459: astore          5
        //  1461: aload           5
        //  1463: ifnull          1475
        //  1466: aload           5
        //  1468: aload_1        
        //  1469: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //  1472: ifeq            1484
        //  1475: aload           5
        //  1477: ifnonnull       1496
        //  1480: aload_1        
        //  1481: ifnull          1496
        //  1484: aload           10
        //  1486: ldc_w           "af_latestchannel"
        //  1489: aload_1        
        //  1490: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1495: pop            
        //  1496: aload_2        
        //  1497: invokestatic    com/appsflyer/internal/ai.values:(Landroid/content/Context;)Landroid/content/SharedPreferences;
        //  1500: astore_1       
        //  1501: aload_1        
        //  1502: ldc_w           "INSTALL_STORE"
        //  1505: invokeinterface android/content/SharedPreferences.contains:(Ljava/lang/String;)Z
        //  1510: ifeq            1527
        //  1513: aload_1        
        //  1514: ldc_w           "INSTALL_STORE"
        //  1517: aconst_null    
        //  1518: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1523: astore_1       
        //  1524: goto            1606
        //  1527: aload_2        
        //  1528: invokestatic    com/appsflyer/internal/ai.AFInAppEventType:(Landroid/content/Context;)Z
        //  1531: ifeq            1601
        //  1534: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //  1537: ldc_w           "api_store_value"
        //  1540: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //  1543: astore_1       
        //  1544: aload_1        
        //  1545: ifnull          1579
        //  1548: aload_2        
        //  1549: invokestatic    com/appsflyer/internal/ai.values:(Landroid/content/Context;)Landroid/content/SharedPreferences;
        //  1552: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //  1557: astore          5
        //  1559: aload           5
        //  1561: ldc_w           "INSTALL_STORE"
        //  1564: aload_1        
        //  1565: invokeinterface android/content/SharedPreferences$Editor.putString:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
        //  1570: pop            
        //  1571: aload           5
        //  1573: invokestatic    com/appsflyer/internal/ai.INVOKEINTERFACE_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy:(Landroid/content/SharedPreferences$Editor;)V
        //  1576: goto            1606
        //  1579: aload_2        
        //  1580: ifnull          1601
        //  1583: ldc_w           "AF_STORE"
        //  1586: aload_2        
        //  1587: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //  1590: aload_2        
        //  1591: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //  1594: invokestatic    com/appsflyer/internal/ai.valueOf:(Ljava/lang/String;Landroid/content/pm/PackageManager;Ljava/lang/String;)Ljava/lang/String;
        //  1597: astore_1       
        //  1598: goto            1548
        //  1601: aconst_null    
        //  1602: astore_1       
        //  1603: goto            1548
        //  1606: aload_1        
        //  1607: ifnull          1625
        //  1610: aload           10
        //  1612: ldc_w           "af_installstore"
        //  1615: aload_1        
        //  1616: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //  1619: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1624: pop            
        //  1625: aload_2        
        //  1626: invokestatic    com/appsflyer/internal/ai.values:(Landroid/content/Context;)Landroid/content/SharedPreferences;
        //  1629: astore          17
        //  1631: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //  1634: ldc_w           "preInstallName"
        //  1637: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //  1640: astore          5
        //  1642: aload           5
        //  1644: astore_1       
        //  1645: aload           5
        //  1647: ifnonnull       1884
        //  1650: aload           17
        //  1652: ldc_w           "preInstallName"
        //  1655: invokeinterface android/content/SharedPreferences.contains:(Ljava/lang/String;)Z
        //  1660: ifeq            1679
        //  1663: aload           17
        //  1665: ldc_w           "preInstallName"
        //  1668: aconst_null    
        //  1669: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1674: astore          5
        //  1676: goto            1862
        //  1679: aload           5
        //  1681: astore_1       
        //  1682: aload_2        
        //  1683: invokestatic    com/appsflyer/internal/ai.AFInAppEventType:(Landroid/content/Context;)Z
        //  1686: ifeq            1794
        //  1689: ldc_w           "ro.appsflyer.preinstall.path"
        //  1692: invokestatic    com/appsflyer/internal/ai.values:(Ljava/lang/String;)Ljava/lang/String;
        //  1695: invokestatic    com/appsflyer/internal/ai.AFKeystoreWrapper:(Ljava/lang/String;)Ljava/io/File;
        //  1698: astore_1       
        //  1699: aload_1        
        //  1700: astore          5
        //  1702: aload_1        
        //  1703: invokestatic    com/appsflyer/internal/ai.AFInAppEventParameterName:(Ljava/io/File;)Z
        //  1706: ifeq            1728
        //  1709: ldc_w           "AF_PRE_INSTALL_PATH"
        //  1712: aload_2        
        //  1713: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //  1716: aload_2        
        //  1717: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //  1720: invokestatic    com/appsflyer/internal/ai.valueOf:(Ljava/lang/String;Landroid/content/pm/PackageManager;Ljava/lang/String;)Ljava/lang/String;
        //  1723: invokestatic    com/appsflyer/internal/ai.AFKeystoreWrapper:(Ljava/lang/String;)Ljava/io/File;
        //  1726: astore          5
        //  1728: aload           5
        //  1730: astore_1       
        //  1731: aload           5
        //  1733: invokestatic    com/appsflyer/internal/ai.AFInAppEventParameterName:(Ljava/io/File;)Z
        //  1736: ifeq            1746
        //  1739: ldc_w           "/data/local/tmp/pre_install.appsflyer"
        //  1742: invokestatic    com/appsflyer/internal/ai.AFKeystoreWrapper:(Ljava/lang/String;)Ljava/io/File;
        //  1745: astore_1       
        //  1746: aload_1        
        //  1747: astore          5
        //  1749: aload_1        
        //  1750: invokestatic    com/appsflyer/internal/ai.AFInAppEventParameterName:(Ljava/io/File;)Z
        //  1753: ifeq            1764
        //  1756: ldc_w           "/etc/pre_install.appsflyer"
        //  1759: invokestatic    com/appsflyer/internal/ai.AFKeystoreWrapper:(Ljava/lang/String;)Ljava/io/File;
        //  1762: astore          5
        //  1764: aload           5
        //  1766: invokestatic    com/appsflyer/internal/ai.AFInAppEventParameterName:(Ljava/io/File;)Z
        //  1769: ifeq            1775
        //  1772: goto            1788
        //  1775: aload           5
        //  1777: aload_2        
        //  1778: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //  1781: invokestatic    com/appsflyer/internal/ai.values:(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;
        //  1784: astore_1       
        //  1785: goto            1790
        //  1788: aconst_null    
        //  1789: astore_1       
        //  1790: aload_1        
        //  1791: ifnull          1804
        //  1794: aload_1        
        //  1795: astore          5
        //  1797: aload_1        
        //  1798: ifnull          1862
        //  1801: goto            1831
        //  1804: aload_2        
        //  1805: ifnonnull       1813
        //  1808: aconst_null    
        //  1809: astore_1       
        //  1810: goto            1794
        //  1813: ldc_w           "AF_PRE_INSTALL_NAME"
        //  1816: aload_2        
        //  1817: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //  1820: aload_2        
        //  1821: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //  1824: invokestatic    com/appsflyer/internal/ai.valueOf:(Ljava/lang/String;Landroid/content/pm/PackageManager;Ljava/lang/String;)Ljava/lang/String;
        //  1827: astore_1       
        //  1828: goto            1794
        //  1831: aload_2        
        //  1832: invokestatic    com/appsflyer/internal/ai.values:(Landroid/content/Context;)Landroid/content/SharedPreferences;
        //  1835: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //  1840: astore          5
        //  1842: aload           5
        //  1844: ldc_w           "preInstallName"
        //  1847: aload_1        
        //  1848: invokeinterface android/content/SharedPreferences$Editor.putString:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
        //  1853: pop            
        //  1854: aload           5
        //  1856: invokestatic    com/appsflyer/internal/ai.INVOKEINTERFACE_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy:(Landroid/content/SharedPreferences$Editor;)V
        //  1859: aload_1        
        //  1860: astore          5
        //  1862: aload           5
        //  1864: astore_1       
        //  1865: aload           5
        //  1867: ifnull          1884
        //  1870: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //  1873: ldc_w           "preInstallName"
        //  1876: aload           5
        //  1878: invokevirtual   com/appsflyer/AppsFlyerProperties.set:(Ljava/lang/String;Ljava/lang/String;)V
        //  1881: aload           5
        //  1883: astore_1       
        //  1884: aload_1        
        //  1885: ifnull          1903
        //  1888: aload           10
        //  1890: ldc_w           "af_preinstall_name"
        //  1893: aload_1        
        //  1894: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //  1897: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1902: pop            
        //  1903: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //  1906: ldc_w           "api_store_value"
        //  1909: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //  1912: astore_1       
        //  1913: aload_1        
        //  1914: ifnull          1920
        //  1917: goto            1947
        //  1920: aload_2        
        //  1921: ifnonnull       1927
        //  1924: goto            1945
        //  1927: ldc_w           "AF_STORE"
        //  1930: aload_2        
        //  1931: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //  1934: aload_2        
        //  1935: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //  1938: invokestatic    com/appsflyer/internal/ai.valueOf:(Ljava/lang/String;Landroid/content/pm/PackageManager;Ljava/lang/String;)Ljava/lang/String;
        //  1941: astore_1       
        //  1942: goto            1947
        //  1945: aconst_null    
        //  1946: astore_1       
        //  1947: aload_1        
        //  1948: ifnull          1966
        //  1951: aload           10
        //  1953: ldc_w           "af_currentstore"
        //  1956: aload_1        
        //  1957: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //  1960: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1965: pop            
        //  1966: aload_3        
        //  1967: ifnull          1973
        //  1970: goto            2009
        //  1973: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //  1976: ldc_w           "AppsFlyerKey"
        //  1979: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //  1982: astore_1       
        //  1983: aload_1        
        //  1984: ifnull          5186
        //  1987: aload_1        
        //  1988: invokevirtual   java/lang/String.length:()I
        //  1991: ifle            5186
        //  1994: aload           10
        //  1996: ldc_w           "appsflyerKey"
        //  1999: aload_1        
        //  2000: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2005: pop            
        //  2006: goto            2028
        //  2009: aload_3        
        //  2010: invokevirtual   java/lang/String.length:()I
        //  2013: ifle            1973
        //  2016: aload           10
        //  2018: ldc_w           "appsflyerKey"
        //  2021: aload_3        
        //  2022: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2027: pop            
        //  2028: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //  2031: ldc_w           "AppUserId"
        //  2034: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //  2037: astore_1       
        //  2038: aload_1        
        //  2039: ifnull          2054
        //  2042: aload           10
        //  2044: ldc_w           "appUserId"
        //  2047: aload_1        
        //  2048: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2053: pop            
        //  2054: aload           14
        //  2056: ldc_w           "userEmails"
        //  2059: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //  2062: astore_1       
        //  2063: aload_1        
        //  2064: ifnull          2082
        //  2067: aload           10
        //  2069: ldc_w           "user_emails"
        //  2072: aload_1        
        //  2073: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2078: pop            
        //  2079: goto            2111
        //  2082: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //  2085: ldc_w           "userEmail"
        //  2088: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //  2091: astore_1       
        //  2092: aload_1        
        //  2093: ifnull          2111
        //  2096: aload           10
        //  2098: ldc_w           "sha1_el"
        //  2101: aload_1        
        //  2102: invokestatic    com/appsflyer/internal/ah.AFKeystoreWrapper:(Ljava/lang/String;)Ljava/lang/String;
        //  2105: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2110: pop            
        //  2111: aload           4
        //  2113: ifnull          2142
        //  2116: aload           10
        //  2118: ldc_w           "eventName"
        //  2121: aload           4
        //  2123: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2128: pop            
        //  2129: aload           10
        //  2131: ldc_w           "eventValue"
        //  2134: aload           6
        //  2136: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2141: pop            
        //  2142: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //  2145: ldc_w           "appid"
        //  2148: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //  2151: ifnull          2174
        //  2154: aload           10
        //  2156: ldc_w           "appid"
        //  2159: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //  2162: ldc_w           "appid"
        //  2165: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //  2168: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2173: pop            
        //  2174: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //  2177: ldc_w           "currencyCode"
        //  2180: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //  2183: astore_1       
        //  2184: aload_1        
        //  2185: ifnull          2245
        //  2188: aload_1        
        //  2189: invokevirtual   java/lang/String.length:()I
        //  2192: iconst_3       
        //  2193: if_icmpeq       2233
        //  2196: new             Ljava/lang/StringBuilder;
        //  2199: astore          5
        //  2201: aload           5
        //  2203: ldc_w           "WARNING: currency code should be 3 characters!!! '"
        //  2206: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  2209: aload           5
        //  2211: aload_1        
        //  2212: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2215: pop            
        //  2216: aload           5
        //  2218: ldc_w           "' is not a legal value."
        //  2221: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2224: pop            
        //  2225: aload           5
        //  2227: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //  2230: invokestatic    com/appsflyer/AFLogger.AFLogger$LogLevel:(Ljava/lang/String;)V
        //  2233: aload           10
        //  2235: ldc_w           "currency"
        //  2238: aload_1        
        //  2239: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2244: pop            
        //  2245: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //  2248: ldc_w           "IS_UPDATE"
        //  2251: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //  2254: astore_1       
        //  2255: aload_1        
        //  2256: ifnull          2271
        //  2259: aload           10
        //  2261: ldc_w           "isUpdate"
        //  2264: aload_1        
        //  2265: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2270: pop            
        //  2271: aload           10
        //  2273: ldc_w           "af_preinstalled"
        //  2276: aload_0        
        //  2277: aload_2        
        //  2278: invokevirtual   com/appsflyer/AppsFlyerLib.isPreInstalledApp:(Landroid/content/Context;)Z
        //  2281: invokestatic    java/lang/Boolean.toString:(Z)Ljava/lang/String;
        //  2284: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2289: pop            
        //  2290: aload           14
        //  2292: ldc_w           "collectFacebookAttrId"
        //  2295: iconst_1       
        //  2296: invokevirtual   com/appsflyer/AppsFlyerProperties.getBoolean:(Ljava/lang/String;Z)Z
        //  2299: ifeq            2359
        //  2302: aload_2        
        //  2303: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //  2306: ldc_w           "com.facebook.katana"
        //  2309: iconst_0       
        //  2310: invokestatic    com/appsflyer/internal/ai.INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo:(Landroid/content/pm/PackageManager;Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
        //  2313: pop            
        //  2314: aload_0        
        //  2315: aload_2        
        //  2316: invokevirtual   com/appsflyer/AppsFlyerLib.getAttributionId:(Landroid/content/Context;)Ljava/lang/String;
        //  2319: astore_1       
        //  2320: goto            2343
        //  2323: astore_1       
        //  2324: ldc_w           "Exception while collecting facebook's attribution ID. "
        //  2327: aload_1        
        //  2328: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2331: goto            2341
        //  2334: astore_1       
        //  2335: ldc_w           "Exception while collecting facebook's attribution ID. "
        //  2338: invokestatic    com/appsflyer/AFLogger.AFLogger$LogLevel:(Ljava/lang/String;)V
        //  2341: aconst_null    
        //  2342: astore_1       
        //  2343: aload_1        
        //  2344: ifnull          2359
        //  2347: aload           10
        //  2349: ldc_w           "fb"
        //  2352: aload_1        
        //  2353: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2358: pop            
        //  2359: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //  2362: astore          6
        //  2364: aload           6
        //  2366: ldc_w           "deviceTrackingDisabled"
        //  2369: iconst_0       
        //  2370: invokevirtual   com/appsflyer/AppsFlyerProperties.getBoolean:(Ljava/lang/String;Z)Z
        //  2373: ifeq            2393
        //  2376: aload           10
        //  2378: ldc_w           "deviceTrackingDisabled"
        //  2381: ldc_w           "true"
        //  2384: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2389: pop            
        //  2390: goto            2963
        //  2393: aload_2        
        //  2394: invokestatic    com/appsflyer/internal/ai.values:(Landroid/content/Context;)Landroid/content/SharedPreferences;
        //  2397: astore_3       
        //  2398: aload           6
        //  2400: ldc_w           "collectIMEI"
        //  2403: iconst_1       
        //  2404: invokevirtual   com/appsflyer/AppsFlyerProperties.getBoolean:(Ljava/lang/String;Z)Z
        //  2407: istore          8
        //  2409: aload_3        
        //  2410: ldc_w           "imeiCached"
        //  2413: aconst_null    
        //  2414: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  2419: astore_1       
        //  2420: iload           8
        //  2422: ifeq            2606
        //  2425: aload_0        
        //  2426: getfield        com/appsflyer/internal/ai.AFVersionDeclaration:Ljava/lang/String;
        //  2429: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  2432: ifeq            2606
        //  2435: aload_2        
        //  2436: invokestatic    com/appsflyer/internal/ai.AppsFlyer2dXConversionCallback:(Landroid/content/Context;)Z
        //  2439: ifeq            2618
        //  2442: aload_2        
        //  2443: ldc_w           "phone"
        //  2446: invokestatic    com/appsflyer/internal/ai.INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService:(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;
        //  2449: checkcast       Landroid/telephony/TelephonyManager;
        //  2452: astore          5
        //  2454: aload           5
        //  2456: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  2459: astore          17
        //  2461: aload           17
        //  2463: ldc_w           "getDeviceId"
        //  2466: iconst_0       
        //  2467: anewarray       Ljava/lang/Class;
        //  2470: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //  2473: aload           5
        //  2475: iconst_0       
        //  2476: anewarray       Ljava/lang/Object;
        //  2479: invokestatic    com/appsflyer/internal/ai.com_appsflyer_internal_ai_java_lang_reflect_Method_invoke:(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //  2482: checkcast       Ljava/lang/String;
        //  2485: astore          5
        //  2487: aload           5
        //  2489: ifnull          2498
        //  2492: aload           5
        //  2494: astore_1       
        //  2495: goto            2615
        //  2498: aload_1        
        //  2499: ifnull          2618
        //  2502: aload_1        
        //  2503: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  2506: astore          5
        //  2508: ldc_w           "use cached IMEI: "
        //  2511: aload           5
        //  2513: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  2516: invokestatic    com/appsflyer/AFLogger.AFInAppEventType:(Ljava/lang/String;)V
        //  2519: goto            2620
        //  2522: astore          5
        //  2524: goto            2534
        //  2527: astore          5
        //  2529: goto            2534
        //  2532: astore          5
        //  2534: aload_1        
        //  2535: ifnull          2541
        //  2538: goto            2546
        //  2541: aconst_null    
        //  2542: astore_1       
        //  2543: goto            2559
        //  2546: ldc_w           "use cached IMEI: "
        //  2549: aload_1        
        //  2550: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  2553: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  2556: invokestatic    com/appsflyer/AFLogger.AFInAppEventType:(Ljava/lang/String;)V
        //  2559: ldc_w           "WARNING: other reason: "
        //  2562: aload           5
        //  2564: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2567: goto            2620
        //  2570: astore          5
        //  2572: aload_1        
        //  2573: ifnull          2579
        //  2576: goto            2584
        //  2579: aconst_null    
        //  2580: astore_1       
        //  2581: goto            2597
        //  2584: ldc_w           "use cached IMEI: "
        //  2587: aload_1        
        //  2588: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  2591: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  2594: invokestatic    com/appsflyer/AFLogger.AFInAppEventType:(Ljava/lang/String;)V
        //  2597: ldc_w           "WARNING: READ_PHONE_STATE is missing."
        //  2600: invokestatic    com/appsflyer/AFLogger.AFLogger$LogLevel:(Ljava/lang/String;)V
        //  2603: goto            2620
        //  2606: aload_0        
        //  2607: getfield        com/appsflyer/internal/ai.AFVersionDeclaration:Ljava/lang/String;
        //  2610: astore_1       
        //  2611: aload_1        
        //  2612: ifnull          2618
        //  2615: goto            2620
        //  2618: aconst_null    
        //  2619: astore_1       
        //  2620: aload_1        
        //  2621: ifnull          2627
        //  2624: goto            2636
        //  2627: ldc_w           "IMEI was not collected."
        //  2630: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;)V
        //  2633: goto            2676
        //  2636: aload_2        
        //  2637: invokestatic    com/appsflyer/internal/ai.values:(Landroid/content/Context;)Landroid/content/SharedPreferences;
        //  2640: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //  2645: astore          5
        //  2647: aload           5
        //  2649: ldc_w           "imeiCached"
        //  2652: aload_1        
        //  2653: invokeinterface android/content/SharedPreferences$Editor.putString:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
        //  2658: pop            
        //  2659: aload           5
        //  2661: invokestatic    com/appsflyer/internal/ai.INVOKEINTERFACE_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy:(Landroid/content/SharedPreferences$Editor;)V
        //  2664: aload           10
        //  2666: ldc_w           "imei"
        //  2669: aload_1        
        //  2670: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2675: pop            
        //  2676: aload           6
        //  2678: ldc_w           "collectAndroidId"
        //  2681: iconst_1       
        //  2682: invokevirtual   com/appsflyer/AppsFlyerProperties.getBoolean:(Ljava/lang/String;Z)Z
        //  2685: istore          8
        //  2687: aload_3        
        //  2688: ldc_w           "androidIdCached"
        //  2691: aconst_null    
        //  2692: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  2697: astore_1       
        //  2698: iload           8
        //  2700: ifeq            2803
        //  2703: aload_0        
        //  2704: getfield        com/appsflyer/internal/ai.getLevel:Ljava/lang/String;
        //  2707: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  2710: ifeq            2803
        //  2713: aload_2        
        //  2714: invokestatic    com/appsflyer/internal/ai.AppsFlyer2dXConversionCallback:(Landroid/content/Context;)Z
        //  2717: ifeq            2815
        //  2720: aload_2        
        //  2721: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //  2724: ldc_w           "android_id"
        //  2727: invokestatic    com/appsflyer/internal/ai.INVOKESTATIC_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_process_AnndroidIdSecureLancet_getString:(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
        //  2730: astore          5
        //  2732: aload           5
        //  2734: ifnull          2743
        //  2737: aload           5
        //  2739: astore_1       
        //  2740: goto            2822
        //  2743: aload_1        
        //  2744: ifnull          2820
        //  2747: ldc_w           "use cached AndroidId: "
        //  2750: aload_1        
        //  2751: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  2754: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  2757: invokestatic    com/appsflyer/AFLogger.AFInAppEventType:(Ljava/lang/String;)V
        //  2760: goto            2822
        //  2763: astore          5
        //  2765: aload_1        
        //  2766: ifnull          2772
        //  2769: goto            2777
        //  2772: aconst_null    
        //  2773: astore_1       
        //  2774: goto            2790
        //  2777: ldc_w           "use cached AndroidId: "
        //  2780: aload_1        
        //  2781: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  2784: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  2787: invokestatic    com/appsflyer/AFLogger.AFInAppEventType:(Ljava/lang/String;)V
        //  2790: aload           5
        //  2792: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //  2795: aload           5
        //  2797: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2800: goto            2822
        //  2803: aload_0        
        //  2804: getfield        com/appsflyer/internal/ai.getLevel:Ljava/lang/String;
        //  2807: astore_1       
        //  2808: aload_1        
        //  2809: ifnull          2815
        //  2812: goto            2822
        //  2815: aconst_null    
        //  2816: astore_1       
        //  2817: goto            2822
        //  2820: aconst_null    
        //  2821: astore_1       
        //  2822: aload_1        
        //  2823: ifnull          2829
        //  2826: goto            2838
        //  2829: ldc_w           "Android ID was not collected."
        //  2832: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;)V
        //  2835: goto            2878
        //  2838: aload_2        
        //  2839: invokestatic    com/appsflyer/internal/ai.values:(Landroid/content/Context;)Landroid/content/SharedPreferences;
        //  2842: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //  2847: astore          5
        //  2849: aload           5
        //  2851: ldc_w           "androidIdCached"
        //  2854: aload_1        
        //  2855: invokeinterface android/content/SharedPreferences$Editor.putString:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
        //  2860: pop            
        //  2861: aload           5
        //  2863: invokestatic    com/appsflyer/internal/ai.INVOKEINTERFACE_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy:(Landroid/content/SharedPreferences$Editor;)V
        //  2866: aload           10
        //  2868: ldc_w           "android_id"
        //  2871: aload_1        
        //  2872: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2877: pop            
        //  2878: aload_2        
        //  2879: invokestatic    com/appsflyer/internal/ad.values:(Landroid/content/Context;)Lcom/appsflyer/internal/c$d$b;
        //  2882: astore          5
        //  2884: aload           5
        //  2886: ifnull          2963
        //  2889: new             Ljava/util/HashMap;
        //  2892: astore_1       
        //  2893: aload_1        
        //  2894: invokespecial   java/util/HashMap.<init>:()V
        //  2897: aload_1        
        //  2898: ldc_w           "isManual"
        //  2901: aload           5
        //  2903: getfield        com/appsflyer/internal/c$d$b.valueOf:Ljava/lang/Boolean;
        //  2906: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2911: pop            
        //  2912: aload_1        
        //  2913: ldc_w           "val"
        //  2916: aload           5
        //  2918: getfield        com/appsflyer/internal/c$d$b.values:Ljava/lang/String;
        //  2921: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2926: pop            
        //  2927: aload           5
        //  2929: getfield        com/appsflyer/internal/c$d$b.AFKeystoreWrapper:Ljava/lang/Boolean;
        //  2932: astore          5
        //  2934: aload           5
        //  2936: ifnull          2951
        //  2939: aload_1        
        //  2940: ldc_w           "isLat"
        //  2943: aload           5
        //  2945: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2950: pop            
        //  2951: aload           10
        //  2953: ldc_w           "oaid"
        //  2956: aload_1        
        //  2957: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2962: pop            
        //  2963: new             Ljava/lang/ref/WeakReference;
        //  2966: astore_1       
        //  2967: aload_1        
        //  2968: aload_2        
        //  2969: invokespecial   java/lang/ref/WeakReference.<init>:(Ljava/lang/Object;)V
        //  2972: aload_1        
        //  2973: invokestatic    com/appsflyer/internal/ak.AFInAppEventParameterName:(Ljava/lang/ref/WeakReference;)Ljava/lang/String;
        //  2976: astore_1       
        //  2977: aload_1        
        //  2978: ifnull          3033
        //  2981: aload           10
        //  2983: ldc_w           "uid"
        //  2986: aload_1        
        //  2987: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2992: pop            
        //  2993: goto            3033
        //  2996: astore_1       
        //  2997: goto            3001
        //  3000: astore_1       
        //  3001: new             Ljava/lang/StringBuilder;
        //  3004: astore          5
        //  3006: aload           5
        //  3008: ldc_w           "ERROR: could not get uid "
        //  3011: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  3014: aload           5
        //  3016: aload_1        
        //  3017: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //  3020: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3023: pop            
        //  3024: aload           5
        //  3026: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //  3029: aload_1        
        //  3030: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  3033: aload           10
        //  3035: ldc_w           "lang"
        //  3038: invokestatic    java/util/Locale.getDefault:()Ljava/util/Locale;
        //  3041: invokevirtual   java/util/Locale.getDisplayLanguage:()Ljava/lang/String;
        //  3044: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  3049: pop            
        //  3050: goto            3061
        //  3053: astore_1       
        //  3054: ldc_w           "Exception while collecting display language name. "
        //  3057: aload_1        
        //  3058: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  3061: aload           10
        //  3063: ldc_w           "lang_code"
        //  3066: invokestatic    java/util/Locale.getDefault:()Ljava/util/Locale;
        //  3069: invokevirtual   java/util/Locale.getLanguage:()Ljava/lang/String;
        //  3072: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  3077: pop            
        //  3078: goto            3089
        //  3081: astore_1       
        //  3082: ldc_w           "Exception while collecting display language code. "
        //  3085: aload_1        
        //  3086: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  3089: aload           10
        //  3091: ldc_w           "country"
        //  3094: invokestatic    java/util/Locale.getDefault:()Ljava/util/Locale;
        //  3097: invokevirtual   java/util/Locale.getCountry:()Ljava/lang/String;
        //  3100: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  3105: pop            
        //  3106: goto            3117
        //  3109: astore_1       
        //  3110: ldc_w           "Exception while collecting country name. "
        //  3113: aload_1        
        //  3114: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  3117: aload           10
        //  3119: ldc_w           "platformextension"
        //  3122: aload_0        
        //  3123: getfield        com/appsflyer/internal/ai.enableLocationCollection:Lcom/appsflyer/internal/an;
        //  3126: invokevirtual   com/appsflyer/internal/an.AFKeystoreWrapper:()Ljava/lang/String;
        //  3129: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  3134: pop            
        //  3135: aload_2        
        //  3136: aload           10
        //  3138: invokestatic    com/appsflyer/internal/ai.AFKeystoreWrapper:(Landroid/content/Context;Ljava/util/Map;)V
        //  3141: new             Ljava/text/SimpleDateFormat;
        //  3144: astore_1       
        //  3145: aload_1        
        //  3146: ldc_w           "yyyy-MM-dd_HHmmssZ"
        //  3149: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //  3152: invokespecial   java/text/SimpleDateFormat.<init>:(Ljava/lang/String;Ljava/util/Locale;)V
        //  3155: aload_2        
        //  3156: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //  3159: aload_2        
        //  3160: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //  3163: iconst_0       
        //  3164: invokestatic    com/appsflyer/internal/ai.INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo:(Landroid/content/pm/PackageManager;Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //  3167: getfield        android/content/pm/PackageInfo.firstInstallTime:J
        //  3170: lstore          11
        //  3172: aload_1        
        //  3173: ldc_w           "UTC"
        //  3176: invokestatic    java/util/TimeZone.getTimeZone:(Ljava/lang/String;)Ljava/util/TimeZone;
        //  3179: invokevirtual   java/text/DateFormat.setTimeZone:(Ljava/util/TimeZone;)V
        //  3182: new             Ljava/util/Date;
        //  3185: astore          5
        //  3187: aload           5
        //  3189: lload           11
        //  3191: invokespecial   java/util/Date.<init>:(J)V
        //  3194: aload           10
        //  3196: ldc_w           "installDate"
        //  3199: aload_1        
        //  3200: aload           5
        //  3202: invokevirtual   java/text/DateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
        //  3205: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  3210: pop            
        //  3211: goto            3224
        //  3214: astore          5
        //  3216: ldc_w           "Exception while collecting install date. "
        //  3219: aload           5
        //  3221: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  3224: aload_2        
        //  3225: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //  3228: aload_2        
        //  3229: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //  3232: iconst_0       
        //  3233: invokestatic    com/appsflyer/internal/ai.INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo:(Landroid/content/pm/PackageManager;Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //  3236: astore          6
        //  3238: aload           7
        //  3240: ldc_w           "versionCode"
        //  3243: iconst_0       
        //  3244: invokeinterface android/content/SharedPreferences.getInt:(Ljava/lang/String;I)I
        //  3249: istore          20
        //  3251: aload           6
        //  3253: getfield        android/content/pm/PackageInfo.versionCode:I
        //  3256: iload           20
        //  3258: if_icmple       3304
        //  3261: aload           6
        //  3263: getfield        android/content/pm/PackageInfo.versionCode:I
        //  3266: istore          20
        //  3268: aload_2        
        //  3269: invokestatic    com/appsflyer/internal/ai.values:(Landroid/content/Context;)Landroid/content/SharedPreferences;
        //  3272: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //  3277: astore          5
        //  3279: aload           5
        //  3281: ldc_w           "versionCode"
        //  3284: iload           20
        //  3286: invokeinterface android/content/SharedPreferences$Editor.putInt:(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
        //  3291: pop            
        //  3292: aload           5
        //  3294: invokestatic    com/appsflyer/internal/ai.INVOKEINTERFACE_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy:(Landroid/content/SharedPreferences$Editor;)V
        //  3297: goto            3304
        //  3300: astore_1       
        //  3301: goto            3474
        //  3304: aload           10
        //  3306: ldc_w           "app_version_code"
        //  3309: aload           6
        //  3311: getfield        android/content/pm/PackageInfo.versionCode:I
        //  3314: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //  3317: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  3322: pop            
        //  3323: aload           10
        //  3325: ldc_w           "app_version_name"
        //  3328: aload           6
        //  3330: getfield        android/content/pm/PackageInfo.versionName:Ljava/lang/String;
        //  3333: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  3338: pop            
        //  3339: aload           6
        //  3341: getfield        android/content/pm/PackageInfo.firstInstallTime:J
        //  3344: lstore          15
        //  3346: aload           6
        //  3348: getfield        android/content/pm/PackageInfo.lastUpdateTime:J
        //  3351: lstore          11
        //  3353: new             Ljava/text/SimpleDateFormat;
        //  3356: astore          5
        //  3358: aload           5
        //  3360: ldc_w           "yyyy-MM-dd_HHmmssZ"
        //  3363: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //  3366: invokespecial   java/text/SimpleDateFormat.<init>:(Ljava/lang/String;Ljava/util/Locale;)V
        //  3369: new             Ljava/util/Date;
        //  3372: astore          6
        //  3374: aload           6
        //  3376: lload           15
        //  3378: invokespecial   java/util/Date.<init>:(J)V
        //  3381: aload           10
        //  3383: ldc_w           "date1"
        //  3386: aload           5
        //  3388: aload           6
        //  3390: invokevirtual   java/text/DateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
        //  3393: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  3398: pop            
        //  3399: new             Ljava/text/SimpleDateFormat;
        //  3402: astore          5
        //  3404: aload           5
        //  3406: ldc_w           "yyyy-MM-dd_HHmmssZ"
        //  3409: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //  3412: invokespecial   java/text/SimpleDateFormat.<init>:(Ljava/lang/String;Ljava/util/Locale;)V
        //  3415: new             Ljava/util/Date;
        //  3418: astore          6
        //  3420: aload           6
        //  3422: lload           11
        //  3424: invokespecial   java/util/Date.<init>:(J)V
        //  3427: aload           10
        //  3429: ldc_w           "date2"
        //  3432: aload           5
        //  3434: aload           6
        //  3436: invokevirtual   java/text/DateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
        //  3439: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  3444: pop            
        //  3445: aload           10
        //  3447: ldc_w           "firstLaunchDate"
        //  3450: aload_0        
        //  3451: aload_1        
        //  3452: aload_2        
        //  3453: invokespecial   com/appsflyer/internal/ai.AFInAppEventType:(Ljava/text/SimpleDateFormat;Landroid/content/Context;)Ljava/lang/String;
        //  3456: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  3461: pop            
        //  3462: goto            3481
        //  3465: astore_1       
        //  3466: goto            3474
        //  3469: astore_1       
        //  3470: goto            3474
        //  3473: astore_1       
        //  3474: ldc_w           "Exception while collecting app version data "
        //  3477: aload_1        
        //  3478: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  3481: aload_0        
        //  3482: aload_2        
        //  3483: invokestatic    com/appsflyer/internal/bq.values:(Landroid/content/Context;)Z
        //  3486: putfield        com/appsflyer/internal/ai.stop:Z
        //  3489: new             Ljava/lang/StringBuilder;
        //  3492: astore_1       
        //  3493: aload_1        
        //  3494: ldc_w           "didConfigureTokenRefreshService="
        //  3497: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  3500: aload_1        
        //  3501: aload_0        
        //  3502: getfield        com/appsflyer/internal/ai.stop:Z
        //  3505: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //  3508: pop            
        //  3509: aload_1        
        //  3510: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //  3513: invokestatic    com/appsflyer/AFLogger.AFInAppEventType:(Ljava/lang/String;)V
        //  3516: aload_0        
        //  3517: getfield        com/appsflyer/internal/ai.stop:Z
        //  3520: ifne            3537
        //  3523: aload           10
        //  3525: ldc_w           "tokenRefreshConfigured"
        //  3528: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //  3531: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  3536: pop            
        //  3537: iload           18
        //  3539: ifeq            3630
        //  3542: aload_0        
        //  3543: getfield        com/appsflyer/internal/ai.getSdkVersion:Ljava/lang/String;
        //  3546: ifnull          3568
        //  3549: aload           10
        //  3551: ldc_w           "af_deeplink"
        //  3554: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  3559: ifnull          3589
        //  3562: ldc_w           "Skip 'af' payload as deeplink was found by path"
        //  3565: invokestatic    com/appsflyer/AFLogger.AFInAppEventType:(Ljava/lang/String;)V
        //  3568: aload_0        
        //  3569: aconst_null    
        //  3570: putfield        com/appsflyer/internal/ai.getSdkVersion:Ljava/lang/String;
        //  3573: aload           10
        //  3575: ldc_w           "open_referrer"
        //  3578: aload           9
        //  3580: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  3585: pop            
        //  3586: goto            3630
        //  3589: new             Lorg/json/JSONObject;
        //  3592: astore_1       
        //  3593: aload_1        
        //  3594: aload_0        
        //  3595: getfield        com/appsflyer/internal/ai.getSdkVersion:Ljava/lang/String;
        //  3598: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //  3601: aload_1        
        //  3602: ldc_w           "isPush"
        //  3605: ldc_w           "true"
        //  3608: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //  3611: pop            
        //  3612: aload           10
        //  3614: ldc_w           "af_deeplink"
        //  3617: aload_1        
        //  3618: invokevirtual   org/json/JSONObject.toString:()Ljava/lang/String;
        //  3621: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  3626: pop            
        //  3627: goto            3568
        //  3630: iload           18
        //  3632: ifne            3752
        //  3635: aload_2        
        //  3636: invokestatic    com/appsflyer/internal/ab.AFKeystoreWrapper:(Landroid/content/Context;)Lcom/appsflyer/internal/ab;
        //  3639: astore          5
        //  3641: new             Ljava/util/concurrent/ConcurrentHashMap;
        //  3644: astore_1       
        //  3645: aload_1        
        //  3646: invokespecial   java/util/concurrent/ConcurrentHashMap.<init>:()V
        //  3649: aload           5
        //  3651: invokevirtual   com/appsflyer/internal/ab.AFInAppEventType:()Ljava/util/List;
        //  3654: astore          9
        //  3656: aload           9
        //  3658: invokeinterface java/util/List.isEmpty:()Z
        //  3663: ifne            3704
        //  3666: new             Lcom/appsflyer/internal/h;
        //  3669: astore          5
        //  3671: aload           5
        //  3673: invokespecial   com/appsflyer/internal/h.<init>:()V
        //  3676: aload_1        
        //  3677: ldc_w           "sensors"
        //  3680: aload           5
        //  3682: aload           9
        //  3684: invokevirtual   com/appsflyer/internal/h.AFInAppEventParameterName:(Ljava/util/List;)Ljava/util/Map;
        //  3687: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  3692: pop            
        //  3693: aload           10
        //  3695: aload_1        
        //  3696: invokeinterface java/util/Map.putAll:(Ljava/util/Map;)V
        //  3701: goto            3752
        //  3704: aload_1        
        //  3705: ldc_w           "sensors"
        //  3708: ldc_w           "na"
        //  3711: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  3716: pop            
        //  3717: goto            3693
        //  3720: astore_1       
        //  3721: new             Ljava/lang/StringBuilder;
        //  3724: astore          5
        //  3726: aload           5
        //  3728: ldc_w           "Unexpected exception from AFSensorManager: "
        //  3731: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  3734: aload           5
        //  3736: aload_1        
        //  3737: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //  3740: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3743: pop            
        //  3744: aload           5
        //  3746: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //  3749: invokestatic    com/appsflyer/AFLogger.AFInAppEventParameterName:(Ljava/lang/String;)V
        //  3752: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //  3755: ldc_w           "advertiserId"
        //  3758: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //  3761: ifnonnull       3808
        //  3764: aload_2        
        //  3765: aload           10
        //  3767: invokestatic    com/appsflyer/internal/ad.AFInAppEventType:(Landroid/content/Context;Ljava/util/Map;)Lcom/appsflyer/internal/c$d$b;
        //  3770: pop            
        //  3771: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //  3774: ldc_w           "advertiserId"
        //  3777: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //  3780: ifnull          3789
        //  3783: iconst_1       
        //  3784: istore          8
        //  3786: goto            3792
        //  3789: iconst_0       
        //  3790: istore          8
        //  3792: aload           10
        //  3794: ldc_w           "GAID_retry"
        //  3797: iload           8
        //  3799: invokestatic    java/lang/String.valueOf:(Z)Ljava/lang/String;
        //  3802: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  3807: pop            
        //  3808: aload_2        
        //  3809: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //  3812: invokestatic    com/appsflyer/internal/ad.AFInAppEventParameterName:(Landroid/content/ContentResolver;)Lcom/appsflyer/internal/c$d$b;
        //  3815: astore_1       
        //  3816: aload_1        
        //  3817: ifnull          3853
        //  3820: aload           10
        //  3822: ldc_w           "amazon_aid"
        //  3825: aload_1        
        //  3826: getfield        com/appsflyer/internal/c$d$b.values:Ljava/lang/String;
        //  3829: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  3834: pop            
        //  3835: aload           10
        //  3837: ldc_w           "amazon_aid_limit"
        //  3840: aload_1        
        //  3841: getfield        com/appsflyer/internal/c$d$b.AFKeystoreWrapper:Ljava/lang/Boolean;
        //  3844: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  3847: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  3852: pop            
        //  3853: aload           10
        //  3855: ldc_w           "registeredUninstall"
        //  3858: aload           7
        //  3860: invokestatic    com/appsflyer/internal/bq.values:(Landroid/content/SharedPreferences;)Z
        //  3863: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  3866: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  3871: pop            
        //  3872: aload           7
        //  3874: ldc_w           "appsFlyerCount"
        //  3877: iload           18
        //  3879: invokestatic    com/appsflyer/internal/ai.AFInAppEventParameterName:(Landroid/content/SharedPreferences;Ljava/lang/String;Z)I
        //  3882: istore          20
        //  3884: aload           10
        //  3886: ldc_w           "counter"
        //  3889: iload           20
        //  3891: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //  3894: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  3899: pop            
        //  3900: aload           4
        //  3902: ifnull          3911
        //  3905: iconst_1       
        //  3906: istore          8
        //  3908: goto            3914
        //  3911: iconst_0       
        //  3912: istore          8
        //  3914: aload           10
        //  3916: ldc_w           "iaecounter"
        //  3919: aload           7
        //  3921: ldc_w           "appsFlyerInAppEventCount"
        //  3924: iload           8
        //  3926: invokestatic    com/appsflyer/internal/ai.AFInAppEventParameterName:(Landroid/content/SharedPreferences;Ljava/lang/String;Z)I
        //  3929: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //  3932: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  3937: pop            
        //  3938: iload           18
        //  3940: ifeq            3955
        //  3943: iload           20
        //  3945: iconst_1       
        //  3946: if_icmpeq       4002
        //  3949: iload           20
        //  3951: iconst_2       
        //  3952: if_icmpeq       3958
        //  3955: goto            4138
        //  3958: aload           10
        //  3960: invokestatic    com/appsflyer/internal/ai.valueOf:(Ljava/util/Map;)Ljava/util/Map;
        //  3963: astore          5
        //  3965: new             Ljava/util/HashMap;
        //  3968: astore_1       
        //  3969: aload_1        
        //  3970: aload           13
        //  3972: getfield        com/appsflyer/internal/au.AFKeystoreWrapper:Ljava/util/Map;
        //  3975: invokespecial   java/util/HashMap.<init>:(Ljava/util/Map;)V
        //  3978: aload_1        
        //  3979: invokeinterface java/util/Map.isEmpty:()Z
        //  3984: ifne            3955
        //  3987: aload           5
        //  3989: ldc_w           "first_launch"
        //  3992: aload_1        
        //  3993: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  3998: pop            
        //  3999: goto            3955
        //  4002: aload           14
        //  4004: iconst_1       
        //  4005: putfield        com/appsflyer/AppsFlyerProperties.valueOf:Z
        //  4008: ldc_w           "waitForCustomerId"
        //  4011: iconst_0       
        //  4012: invokestatic    com/appsflyer/internal/ai.AFInAppEventParameterName:(Ljava/lang/String;Z)Z
        //  4015: ifeq            4033
        //  4018: aload           10
        //  4020: ldc_w           "wait_cid"
        //  4023: iconst_1       
        //  4024: invokestatic    java/lang/Boolean.toString:(Z)Ljava/lang/String;
        //  4027: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4032: pop            
        //  4033: aload           10
        //  4035: invokestatic    com/appsflyer/internal/ai.valueOf:(Ljava/util/Map;)Ljava/util/Map;
        //  4038: astore_1       
        //  4039: aload           13
        //  4041: getfield        com/appsflyer/internal/au.values:Landroid/content/SharedPreferences;
        //  4044: ldc_w           "ddl"
        //  4047: aconst_null    
        //  4048: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  4053: astore          4
        //  4055: aload           4
        //  4057: ifnull          4101
        //  4060: new             Lorg/json/JSONObject;
        //  4063: astore          5
        //  4065: aload           5
        //  4067: aload           4
        //  4069: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //  4072: aload           5
        //  4074: invokestatic    com/appsflyer/internal/o.values:(Lorg/json/JSONObject;)Ljava/util/Map;
        //  4077: astore          5
        //  4079: aload           5
        //  4081: invokeinterface java/util/Map.isEmpty:()Z
        //  4086: ifne            4101
        //  4089: aload_1        
        //  4090: ldc_w           "ddl"
        //  4093: aload           5
        //  4095: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4100: pop            
        //  4101: new             Ljava/util/HashMap;
        //  4104: astore          5
        //  4106: aload           5
        //  4108: aload           13
        //  4110: getfield        com/appsflyer/internal/au.AFKeystoreWrapper:Ljava/util/Map;
        //  4113: invokespecial   java/util/HashMap.<init>:(Ljava/util/Map;)V
        //  4116: aload           5
        //  4118: invokeinterface java/util/Map.isEmpty:()Z
        //  4123: ifne            4138
        //  4126: aload_1        
        //  4127: ldc_w           "first_launch"
        //  4130: aload           5
        //  4132: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4137: pop            
        //  4138: iconst_1       
        //  4139: istore          8
        //  4141: aload           7
        //  4143: invokestatic    com/appsflyer/internal/ai.valueOf:(Landroid/content/SharedPreferences;)Z
        //  4146: ifne            4240
        //  4149: aload           10
        //  4151: ldc_w           "isFirstCall"
        //  4154: iload           8
        //  4156: invokestatic    java/lang/Boolean.toString:(Z)Ljava/lang/String;
        //  4159: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4164: pop            
        //  4165: new             Ljava/util/HashMap;
        //  4168: astore_1       
        //  4169: aload_1        
        //  4170: invokespecial   java/util/HashMap.<init>:()V
        //  4173: aload_1        
        //  4174: ldc_w           "cpu_abi"
        //  4177: ldc_w           "ro.product.cpu.abi"
        //  4180: invokestatic    com/appsflyer/internal/ai.values:(Ljava/lang/String;)Ljava/lang/String;
        //  4183: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4188: pop            
        //  4189: aload_1        
        //  4190: ldc_w           "cpu_abi2"
        //  4193: ldc_w           "ro.product.cpu.abi2"
        //  4196: invokestatic    com/appsflyer/internal/ai.values:(Ljava/lang/String;)Ljava/lang/String;
        //  4199: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4204: pop            
        //  4205: aload_1        
        //  4206: ldc_w           "arch"
        //  4209: ldc_w           "os.arch"
        //  4212: invokestatic    com/appsflyer/internal/ai.values:(Ljava/lang/String;)Ljava/lang/String;
        //  4215: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4220: pop            
        //  4221: aload_1        
        //  4222: ldc_w           "build_display_id"
        //  4225: ldc_w           "ro.build.display.id"
        //  4228: invokestatic    com/appsflyer/internal/ai.values:(Ljava/lang/String;)Ljava/lang/String;
        //  4231: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4236: pop            
        //  4237: goto            4246
        //  4240: iconst_0       
        //  4241: istore          8
        //  4243: goto            4149
        //  4246: iload           18
        //  4248: ifeq            4472
        //  4251: aload_0        
        //  4252: getfield        com/appsflyer/internal/ai.updateServerUninstallToken:Z
        //  4255: ifeq            4362
        //  4258: getstatic       com/appsflyer/internal/x$d.AFInAppEventType:Lcom/appsflyer/internal/x;
        //  4261: aload_2        
        //  4262: invokevirtual   com/appsflyer/internal/x.AFInAppEventType:(Landroid/content/Context;)Landroid/location/Location;
        //  4265: astore          4
        //  4267: new             Ljava/util/HashMap;
        //  4270: astore          5
        //  4272: aload           5
        //  4274: iconst_3       
        //  4275: invokespecial   java/util/HashMap.<init>:(I)V
        //  4278: aload           4
        //  4280: ifnull          4340
        //  4283: aload           5
        //  4285: ldc_w           "lat"
        //  4288: aload           4
        //  4290: invokevirtual   android/location/Location.getLatitude:()D
        //  4293: invokestatic    java/lang/String.valueOf:(D)Ljava/lang/String;
        //  4296: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4301: pop            
        //  4302: aload           5
        //  4304: ldc_w           "lon"
        //  4307: aload           4
        //  4309: invokevirtual   android/location/Location.getLongitude:()D
        //  4312: invokestatic    java/lang/String.valueOf:(D)Ljava/lang/String;
        //  4315: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4320: pop            
        //  4321: aload           5
        //  4323: ldc_w           "ts"
        //  4326: aload           4
        //  4328: invokevirtual   android/location/Location.getTime:()J
        //  4331: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //  4334: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4339: pop            
        //  4340: aload           5
        //  4342: invokeinterface java/util/Map.isEmpty:()Z
        //  4347: ifne            4362
        //  4350: aload_1        
        //  4351: ldc_w           "loc"
        //  4354: aload           5
        //  4356: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4361: pop            
        //  4362: getstatic       com/appsflyer/internal/e$e.AFInAppEventParameterName:Lcom/appsflyer/internal/e;
        //  4365: aload_2        
        //  4366: invokevirtual   com/appsflyer/internal/e.AFInAppEventType:(Landroid/content/Context;)Lcom/appsflyer/internal/e$b;
        //  4369: astore          5
        //  4371: aload_1        
        //  4372: ldc_w           "btl"
        //  4375: aload           5
        //  4377: getfield        com/appsflyer/internal/e$b.AFInAppEventParameterName:F
        //  4380: invokestatic    java/lang/Float.toString:(F)Ljava/lang/String;
        //  4383: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4388: pop            
        //  4389: aload           5
        //  4391: getfield        com/appsflyer/internal/e$b.AFKeystoreWrapper:Ljava/lang/String;
        //  4394: ifnull          4412
        //  4397: aload_1        
        //  4398: ldc_w           "btch"
        //  4401: aload           5
        //  4403: getfield        com/appsflyer/internal/e$b.AFKeystoreWrapper:Ljava/lang/String;
        //  4406: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4411: pop            
        //  4412: iload           20
        //  4414: iconst_2       
        //  4415: if_icmpgt       4472
        //  4418: aload_2        
        //  4419: invokestatic    com/appsflyer/internal/ab.AFKeystoreWrapper:(Landroid/content/Context;)Lcom/appsflyer/internal/ab;
        //  4422: astore          9
        //  4424: new             Ljava/util/concurrent/ConcurrentHashMap;
        //  4427: astore          5
        //  4429: aload           5
        //  4431: invokespecial   java/util/concurrent/ConcurrentHashMap.<init>:()V
        //  4434: aload           9
        //  4436: invokevirtual   com/appsflyer/internal/ab.values:()Ljava/util/List;
        //  4439: astore          4
        //  4441: aload           4
        //  4443: invokeinterface java/util/List.isEmpty:()Z
        //  4448: ifne            5153
        //  4451: aload           5
        //  4453: ldc_w           "sensors"
        //  4456: aload           4
        //  4458: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4463: pop            
        //  4464: aload_1        
        //  4465: aload           5
        //  4467: invokeinterface java/util/Map.putAll:(Ljava/util/Map;)V
        //  4472: aload_1        
        //  4473: ldc_w           "dim"
        //  4476: aload_2        
        //  4477: invokestatic    com/appsflyer/internal/v.values:(Landroid/content/Context;)Ljava/util/Map;
        //  4480: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4485: pop            
        //  4486: aload           10
        //  4488: ldc_w           "deviceData"
        //  4491: aload_1        
        //  4492: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4497: pop            
        //  4498: aload           10
        //  4500: ldc_w           "appsflyerKey"
        //  4503: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  4508: checkcast       Ljava/lang/String;
        //  4511: astore          4
        //  4513: aload           10
        //  4515: ldc_w           "af_timestamp"
        //  4518: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  4523: checkcast       Ljava/lang/String;
        //  4526: astore_1       
        //  4527: aload           10
        //  4529: ldc_w           "uid"
        //  4532: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  4537: checkcast       Ljava/lang/String;
        //  4540: astore          9
        //  4542: new             Ljava/lang/StringBuilder;
        //  4545: astore          5
        //  4547: aload           5
        //  4549: invokespecial   java/lang/StringBuilder.<init>:()V
        //  4552: aload           5
        //  4554: aload           4
        //  4556: iconst_0       
        //  4557: bipush          7
        //  4559: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //  4562: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4565: pop            
        //  4566: aload           5
        //  4568: aload           9
        //  4570: iconst_0       
        //  4571: bipush          7
        //  4573: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //  4576: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4579: pop            
        //  4580: aload           5
        //  4582: aload_1        
        //  4583: aload_1        
        //  4584: invokevirtual   java/lang/String.length:()I
        //  4587: bipush          7
        //  4589: isub           
        //  4590: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //  4593: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4596: pop            
        //  4597: aload           10
        //  4599: ldc_w           "af_v"
        //  4602: aload           5
        //  4604: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //  4607: invokestatic    com/appsflyer/internal/ah.AFKeystoreWrapper:(Ljava/lang/String;)Ljava/lang/String;
        //  4610: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4615: pop            
        //  4616: aload           10
        //  4618: ldc_w           "appsflyerKey"
        //  4621: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  4626: checkcast       Ljava/lang/String;
        //  4629: astore          5
        //  4631: new             Ljava/lang/StringBuilder;
        //  4634: astore_1       
        //  4635: aload_1        
        //  4636: invokespecial   java/lang/StringBuilder.<init>:()V
        //  4639: aload_1        
        //  4640: aload           5
        //  4642: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4645: pop            
        //  4646: aload_1        
        //  4647: aload           10
        //  4649: ldc_w           "af_timestamp"
        //  4652: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  4657: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  4660: pop            
        //  4661: aload_1        
        //  4662: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //  4665: astore_1       
        //  4666: new             Ljava/lang/StringBuilder;
        //  4669: astore          5
        //  4671: aload           5
        //  4673: invokespecial   java/lang/StringBuilder.<init>:()V
        //  4676: aload           5
        //  4678: aload_1        
        //  4679: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4682: pop            
        //  4683: aload           5
        //  4685: aload           10
        //  4687: ldc_w           "uid"
        //  4690: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  4695: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  4698: pop            
        //  4699: aload           5
        //  4701: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //  4704: astore          5
        //  4706: new             Ljava/lang/StringBuilder;
        //  4709: astore_1       
        //  4710: aload_1        
        //  4711: invokespecial   java/lang/StringBuilder.<init>:()V
        //  4714: aload_1        
        //  4715: aload           5
        //  4717: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4720: pop            
        //  4721: aload_1        
        //  4722: aload           10
        //  4724: ldc_w           "installDate"
        //  4727: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  4732: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  4735: pop            
        //  4736: aload_1        
        //  4737: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //  4740: astore_1       
        //  4741: new             Ljava/lang/StringBuilder;
        //  4744: astore          5
        //  4746: aload           5
        //  4748: invokespecial   java/lang/StringBuilder.<init>:()V
        //  4751: aload           5
        //  4753: aload_1        
        //  4754: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4757: pop            
        //  4758: aload           5
        //  4760: aload           10
        //  4762: ldc_w           "counter"
        //  4765: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  4770: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  4773: pop            
        //  4774: aload           5
        //  4776: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //  4779: astore_1       
        //  4780: new             Ljava/lang/StringBuilder;
        //  4783: astore          5
        //  4785: aload           5
        //  4787: invokespecial   java/lang/StringBuilder.<init>:()V
        //  4790: aload           5
        //  4792: aload_1        
        //  4793: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4796: pop            
        //  4797: aload           5
        //  4799: aload           10
        //  4801: ldc_w           "iaecounter"
        //  4804: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  4809: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  4812: pop            
        //  4813: aload           10
        //  4815: ldc_w           "af_v2"
        //  4818: aload           5
        //  4820: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //  4823: invokestatic    com/appsflyer/internal/ah.AFInAppEventType:(Ljava/lang/String;)Ljava/lang/String;
        //  4826: invokestatic    com/appsflyer/internal/ah.AFKeystoreWrapper:(Ljava/lang/String;)Ljava/lang/String;
        //  4829: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4834: pop            
        //  4835: aload           10
        //  4837: ldc_w           "ivc"
        //  4840: aload_2        
        //  4841: invokestatic    com/appsflyer/internal/ai.getLevel:(Landroid/content/Context;)Z
        //  4844: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  4847: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4852: pop            
        //  4853: aload           7
        //  4855: ldc_w           "is_stop_tracking_used"
        //  4858: invokeinterface android/content/SharedPreferences.contains:(Ljava/lang/String;)Z
        //  4863: ifeq            4891
        //  4866: aload           10
        //  4868: ldc_w           "istu"
        //  4871: aload           7
        //  4873: ldc_w           "is_stop_tracking_used"
        //  4876: iconst_0       
        //  4877: invokeinterface android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
        //  4882: invokestatic    java/lang/String.valueOf:(Z)Ljava/lang/String;
        //  4885: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4890: pop            
        //  4891: new             Ljava/util/HashMap;
        //  4894: astore_1       
        //  4895: aload_1        
        //  4896: invokespecial   java/util/HashMap.<init>:()V
        //  4899: aload_1        
        //  4900: ldc_w           "mcc"
        //  4903: aload_2        
        //  4904: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //  4907: invokevirtual   android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
        //  4910: getfield        android/content/res/Configuration.mcc:I
        //  4913: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  4916: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4921: pop            
        //  4922: aload_1        
        //  4923: ldc_w           "mnc"
        //  4926: aload_2        
        //  4927: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //  4930: invokevirtual   android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
        //  4933: getfield        android/content/res/Configuration.mnc:I
        //  4936: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  4939: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4944: pop            
        //  4945: aload           10
        //  4947: ldc_w           "cell"
        //  4950: aload_1        
        //  4951: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4956: pop            
        //  4957: aload           10
        //  4959: ldc_w           "sig"
        //  4962: aload           13
        //  4964: getfield        com/appsflyer/internal/au.valueOf:Landroid/app/Application;
        //  4967: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //  4970: aload           13
        //  4972: getfield        com/appsflyer/internal/au.valueOf:Landroid/app/Application;
        //  4975: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //  4978: invokestatic    com/appsflyer/internal/ac.values:(Landroid/content/pm/PackageManager;Ljava/lang/String;)Ljava/lang/String;
        //  4981: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4986: pop            
        //  4987: aload           10
        //  4989: ldc_w           "last_boot_time"
        //  4992: invokestatic    java/lang/System.currentTimeMillis:()J
        //  4995: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //  4998: lsub           
        //  4999: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  5002: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  5007: pop            
        //  5008: new             Landroid/os/StatFs;
        //  5011: astore_1       
        //  5012: aload_1        
        //  5013: invokestatic    android/os/Environment.getDataDirectory:()Ljava/io/File;
        //  5016: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //  5019: invokespecial   android/os/StatFs.<init>:(Ljava/lang/String;)V
        //  5022: aload_1        
        //  5023: invokevirtual   android/os/StatFs.getBlockSizeLong:()J
        //  5026: lstore          21
        //  5028: aload_1        
        //  5029: invokevirtual   android/os/StatFs.getAvailableBlocksLong:()J
        //  5032: lstore          15
        //  5034: aload_1        
        //  5035: invokevirtual   android/os/StatFs.getBlockCountLong:()J
        //  5038: lstore          11
        //  5040: ldc2_w          2.0
        //  5043: ldc2_w          20.0
        //  5046: invokestatic    java/lang/Math.pow:(DD)D
        //  5049: dstore          23
        //  5051: lload           15
        //  5053: lload           21
        //  5055: lmul           
        //  5056: l2d            
        //  5057: dload           23
        //  5059: ddiv           
        //  5060: d2l            
        //  5061: lstore          15
        //  5063: lload           11
        //  5065: lload           21
        //  5067: lmul           
        //  5068: l2d            
        //  5069: dload           23
        //  5071: ddiv           
        //  5072: d2l            
        //  5073: lstore          11
        //  5075: new             Ljava/lang/StringBuilder;
        //  5078: astore_1       
        //  5079: aload_1        
        //  5080: invokespecial   java/lang/StringBuilder.<init>:()V
        //  5083: aload_1        
        //  5084: lload           15
        //  5086: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //  5089: pop            
        //  5090: aload_1        
        //  5091: ldc_w           "/"
        //  5094: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  5097: pop            
        //  5098: aload_1        
        //  5099: lload           11
        //  5101: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //  5104: pop            
        //  5105: aload           10
        //  5107: ldc_w           "disk"
        //  5110: aload_1        
        //  5111: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //  5114: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  5119: pop            
        //  5120: aload_0        
        //  5121: getfield        com/appsflyer/internal/ai.onAppOpenAttributionNative:Lcom/appsflyer/internal/l;
        //  5124: astore_1       
        //  5125: aload_1        
        //  5126: ifnull          5209
        //  5129: aload_1        
        //  5130: getfield        com/appsflyer/internal/l.valueOf:[Ljava/lang/String;
        //  5133: astore_1       
        //  5134: aload_1        
        //  5135: ifnull          5209
        //  5138: aload           10
        //  5140: ldc_w           "sharing_filter"
        //  5143: aload_1        
        //  5144: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  5149: pop            
        //  5150: goto            5209
        //  5153: aload           9
        //  5155: invokevirtual   com/appsflyer/internal/ab.AFInAppEventType:()Ljava/util/List;
        //  5158: astore          4
        //  5160: aload           4
        //  5162: invokeinterface java/util/List.isEmpty:()Z
        //  5167: ifne            4464
        //  5170: aload           5
        //  5172: ldc_w           "sensors"
        //  5175: aload           4
        //  5177: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  5182: pop            
        //  5183: goto            4464
        //  5186: ldc_w           "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. "
        //  5189: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;)V
        //  5192: ldc_w           "AppsFlyer will not track this event."
        //  5195: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;)V
        //  5198: aconst_null    
        //  5199: areturn        
        //  5200: astore_1       
        //  5201: aload_1        
        //  5202: invokevirtual   java/lang/Throwable.getLocalizedMessage:()Ljava/lang/String;
        //  5205: aload_1        
        //  5206: invokestatic    com/appsflyer/AFLogger.values:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  5209: aload           10
        //  5211: areturn        
        //  5212: astore_1       
        //  5213: goto            842
        //    Signature:
        //  (Lcom/appsflyer/internal/j;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  184    204    5200   5209   Any
        //  218    224    5200   5209   Any
        //  231    246    5200   5209   Any
        //  246    250    5200   5209   Any
        //  250    268    271    279    Ljava/lang/Exception;
        //  250    268    5200   5209   Any
        //  272    279    5200   5209   Any
        //  279    318    357    365    Ljava/lang/Exception;
        //  279    318    5200   5209   Any
        //  318    336    357    365    Ljava/lang/Exception;
        //  318    336    5200   5209   Any
        //  336    354    357    365    Ljava/lang/Exception;
        //  336    354    5200   5209   Any
        //  358    365    5200   5209   Any
        //  365    498    5200   5209   Any
        //  498    504    5200   5209   Any
        //  509    542    5200   5209   Any
        //  542    565    5200   5209   Any
        //  568    579    5200   5209   Any
        //  583    605    5200   5209   Any
        //  605    626    5200   5209   Any
        //  626    656    5200   5209   Any
        //  674    685    5200   5209   Any
        //  685    722    5200   5209   Any
        //  726    738    5200   5209   Any
        //  743    756    5200   5209   Any
        //  756    774    5200   5209   Any
        //  779    842    5212   5216   Lorg/json/JSONException;
        //  779    842    5200   5209   Any
        //  842    847    5200   5209   Any
        //  851    863    5200   5209   Any
        //  863    870    5200   5209   Any
        //  875    888    5200   5209   Any
        //  888    900    5200   5209   Any
        //  904    916    5200   5209   Any
        //  916    955    5200   5209   Any
        //  955    971    5200   5209   Any
        //  978    994    5200   5209   Any
        //  994    1000   5200   5209   Any
        //  1011   1024   5200   5209   Any
        //  1024   1036   1143   1144   Ljava/lang/Exception;
        //  1024   1036   5200   5209   Any
        //  1041   1051   1139   1143   Ljava/lang/Exception;
        //  1041   1051   5200   5209   Any
        //  1051   1096   1135   1139   Ljava/lang/Exception;
        //  1051   1096   5200   5209   Any
        //  1096   1128   1131   1135   Ljava/lang/Exception;
        //  1096   1128   5200   5209   Any
        //  1144   1151   5200   5209   Any
        //  1154   1171   5200   5209   Any
        //  1171   1193   5200   5209   Any
        //  1202   1231   5200   5209   Any
        //  1235   1281   5200   5209   Any
        //  1285   1306   5200   5209   Any
        //  1315   1350   5200   5209   Any
        //  1350   1360   5200   5209   Any
        //  1364   1376   5200   5209   Any
        //  1376   1388   1407   1415   Ljava/lang/Exception;
        //  1376   1388   5200   5209   Any
        //  1392   1404   1407   1415   Ljava/lang/Exception;
        //  1392   1404   5200   5209   Any
        //  1408   1415   5200   5209   Any
        //  1415   1424   5200   5209   Any
        //  1428   1447   5200   5209   Any
        //  1447   1461   5200   5209   Any
        //  1466   1475   5200   5209   Any
        //  1484   1496   5200   5209   Any
        //  1496   1524   5200   5209   Any
        //  1527   1544   5200   5209   Any
        //  1548   1576   5200   5209   Any
        //  1583   1598   5200   5209   Any
        //  1610   1625   5200   5209   Any
        //  1625   1642   5200   5209   Any
        //  1650   1676   5200   5209   Any
        //  1682   1699   5200   5209   Any
        //  1702   1728   5200   5209   Any
        //  1731   1746   5200   5209   Any
        //  1749   1764   5200   5209   Any
        //  1764   1772   5200   5209   Any
        //  1775   1785   5200   5209   Any
        //  1813   1828   5200   5209   Any
        //  1831   1859   5200   5209   Any
        //  1870   1881   5200   5209   Any
        //  1888   1903   5200   5209   Any
        //  1903   1913   5200   5209   Any
        //  1927   1942   5200   5209   Any
        //  1951   1966   5200   5209   Any
        //  1973   1983   5200   5209   Any
        //  1987   2006   5200   5209   Any
        //  2009   2028   5200   5209   Any
        //  2028   2038   5200   5209   Any
        //  2042   2054   5200   5209   Any
        //  2054   2063   5200   5209   Any
        //  2067   2079   5200   5209   Any
        //  2082   2092   5200   5209   Any
        //  2096   2111   5200   5209   Any
        //  2116   2142   5200   5209   Any
        //  2142   2174   5200   5209   Any
        //  2174   2184   5200   5209   Any
        //  2188   2233   5200   5209   Any
        //  2233   2245   5200   5209   Any
        //  2245   2255   5200   5209   Any
        //  2259   2271   5200   5209   Any
        //  2271   2302   5200   5209   Any
        //  2302   2320   2334   2341   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  2302   2320   2323   2334   Any
        //  2324   2331   5200   5209   Any
        //  2335   2341   5200   5209   Any
        //  2347   2359   5200   5209   Any
        //  2359   2390   5200   5209   Any
        //  2393   2420   5200   5209   Any
        //  2425   2442   5200   5209   Any
        //  2442   2461   2570   2606   Ljava/lang/reflect/InvocationTargetException;
        //  2442   2461   2527   2532   Ljava/lang/Exception;
        //  2442   2461   5200   5209   Any
        //  2461   2487   2570   2606   Ljava/lang/reflect/InvocationTargetException;
        //  2461   2487   2522   2527   Ljava/lang/Exception;
        //  2461   2487   5200   5209   Any
        //  2502   2508   2570   2606   Ljava/lang/reflect/InvocationTargetException;
        //  2502   2508   2522   2527   Ljava/lang/Exception;
        //  2502   2508   5200   5209   Any
        //  2508   2519   2570   2606   Ljava/lang/reflect/InvocationTargetException;
        //  2508   2519   2532   2534   Ljava/lang/Exception;
        //  2508   2519   5200   5209   Any
        //  2546   2559   5200   5209   Any
        //  2559   2567   5200   5209   Any
        //  2584   2597   5200   5209   Any
        //  2597   2603   5200   5209   Any
        //  2606   2611   5200   5209   Any
        //  2627   2633   5200   5209   Any
        //  2636   2676   5200   5209   Any
        //  2676   2698   5200   5209   Any
        //  2703   2720   5200   5209   Any
        //  2720   2732   2763   2803   Ljava/lang/Exception;
        //  2720   2732   5200   5209   Any
        //  2747   2760   2763   2803   Ljava/lang/Exception;
        //  2747   2760   5200   5209   Any
        //  2777   2790   5200   5209   Any
        //  2790   2800   5200   5209   Any
        //  2803   2808   5200   5209   Any
        //  2829   2835   5200   5209   Any
        //  2838   2878   5200   5209   Any
        //  2878   2884   5200   5209   Any
        //  2889   2934   5200   5209   Any
        //  2939   2951   5200   5209   Any
        //  2951   2963   5200   5209   Any
        //  2963   2977   3000   3001   Ljava/lang/Exception;
        //  2963   2977   5200   5209   Any
        //  2981   2993   2996   3000   Ljava/lang/Exception;
        //  2981   2993   5200   5209   Any
        //  3001   3033   5200   5209   Any
        //  3033   3050   3053   3061   Ljava/lang/Exception;
        //  3033   3050   5200   5209   Any
        //  3054   3061   5200   5209   Any
        //  3061   3078   3081   3089   Ljava/lang/Exception;
        //  3061   3078   5200   5209   Any
        //  3082   3089   5200   5209   Any
        //  3089   3106   3109   3117   Ljava/lang/Exception;
        //  3089   3106   5200   5209   Any
        //  3110   3117   5200   5209   Any
        //  3117   3155   5200   5209   Any
        //  3155   3211   3214   3224   Ljava/lang/Exception;
        //  3155   3211   5200   5209   Any
        //  3216   3224   5200   5209   Any
        //  3224   3261   3473   3474   Any
        //  3261   3297   3300   3304   Any
        //  3304   3353   3473   3474   Any
        //  3353   3358   3469   3473   Any
        //  3358   3462   3465   3469   Any
        //  3474   3481   5200   5209   Any
        //  3481   3537   5200   5209   Any
        //  3542   3568   5200   5209   Any
        //  3568   3586   5200   5209   Any
        //  3589   3627   5200   5209   Any
        //  3635   3693   3720   3752   Ljava/lang/Exception;
        //  3635   3693   5200   5209   Any
        //  3693   3701   3720   3752   Ljava/lang/Exception;
        //  3693   3701   5200   5209   Any
        //  3704   3717   3720   3752   Ljava/lang/Exception;
        //  3704   3717   5200   5209   Any
        //  3721   3752   5200   5209   Any
        //  3752   3783   5200   5209   Any
        //  3792   3808   5200   5209   Any
        //  3808   3816   5200   5209   Any
        //  3820   3853   5200   5209   Any
        //  3853   3900   5200   5209   Any
        //  3914   3938   5200   5209   Any
        //  3958   3999   5200   5209   Any
        //  4002   4033   5200   5209   Any
        //  4033   4055   5200   5209   Any
        //  4060   4101   5200   5209   Any
        //  4101   4138   5200   5209   Any
        //  4141   4149   5200   5209   Any
        //  4149   4237   5200   5209   Any
        //  4251   4278   5200   5209   Any
        //  4283   4340   5200   5209   Any
        //  4340   4362   5200   5209   Any
        //  4362   4412   5200   5209   Any
        //  4418   4464   5200   5209   Any
        //  4464   4472   5200   5209   Any
        //  4472   4891   5200   5209   Any
        //  4891   5051   5200   5209   Any
        //  5075   5125   5200   5209   Any
        //  5129   5134   5200   5209   Any
        //  5138   5150   5200   5209   Any
        //  5153   5183   5200   5209   Any
        //  5186   5198   5200   5209   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0842:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void valueOf(final Context context, final String s, final long n) {
        final SharedPreferences$Editor edit = values(context).edit();
        edit.putLong(s, n);
        INVOKEINTERFACE_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(edit);
    }
    
    public final void valueOf(final Context context, final Map<String, Object> map, final Uri uri) {
        if (!map.containsKey("af_deeplink")) {
            final String afInAppEventParameterName = AFInAppEventParameterName(uri.toString());
            final i values = i.values();
            String string = afInAppEventParameterName;
            if (values.AFLogger$LogLevel != null) {
                string = afInAppEventParameterName;
                if (values.getLevel != null) {
                    string = afInAppEventParameterName;
                    if (afInAppEventParameterName.contains(values.AFLogger$LogLevel)) {
                        final Uri$Builder buildUpon = Uri.parse(afInAppEventParameterName).buildUpon();
                        final Uri$Builder buildUpon2 = Uri.EMPTY.buildUpon();
                        for (final Map.Entry<String, String> entry : values.getLevel.entrySet()) {
                            buildUpon.appendQueryParameter((String)entry.getKey(), (String)entry.getValue());
                            buildUpon2.appendQueryParameter((String)entry.getKey(), (String)entry.getValue());
                        }
                        string = buildUpon.build().toString();
                        map.put("appended_query_params", buildUpon2.build().getEncodedQuery());
                    }
                }
            }
            map.put("af_deeplink", string);
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("link", uri.toString());
        final ao ao = new ao(uri, this, context);
        if (ao.AFKeystoreWrapper) {
            map.put("isBrandedDomain", Boolean.TRUE);
        }
        ac.values(context, hashMap, uri);
        if (ao.AFKeystoreWrapper()) {
            ao.AFInAppEventParameterName = (ao.c)new ao.c() {
                public /* synthetic */ Map AFInAppEventType = hashMap;
                
                static {
                    Covode.recordClassIndex(2599);
                }
                
                @Override
                public final void AFKeystoreWrapper(final String s) {
                    ap.AFInAppEventParameterName(s, DeepLinkResult.Error.NETWORK);
                }
                
                @Override
                public final void valueOf(final Map<String, String> map) {
                    for (final String next : map.keySet()) {
                        this.AFInAppEventType.put(next, map.get(next));
                    }
                    ap.AFInAppEventParameterName(this.AFInAppEventType);
                }
            };
            if (k.values == null) {
                k.values = new k();
            }
            k.values.AFKeystoreWrapper().execute(ao);
            return;
        }
        ap.AFInAppEventParameterName(hashMap);
    }
    
    public final void valueOf(final j j, final Activity activity) {
        final Application valueOf = j.valueOf;
        String afVersionDeclaration = "";
        while (true) {
            Label_0075: {
                if (activity == null || activity.getIntent() == null) {
                    break Label_0075;
                }
                final Uri afInAppEventParameterName = aq.AFInAppEventParameterName(activity);
                if (afInAppEventParameterName == null) {
                    break Label_0075;
                }
                final String string = afInAppEventParameterName.toString();
                if (AppsFlyerProperties.getInstance().getString("AppsFlyerKey") == null) {
                    AFLogger.AFLogger$LogLevel("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
                    final AppsFlyerRequestListener afInAppEventParameterName2 = j.AFInAppEventParameterName;
                    if (afInAppEventParameterName2 != null) {
                        afInAppEventParameterName2.onError(RequestError.NO_DEV_KEY, az.AFInAppEventType);
                    }
                    return;
                }
                final String referrer = AppsFlyerProperties.getInstance().getReferrer((Context)valueOf);
                if (referrer != null) {
                    afVersionDeclaration = referrer;
                }
                j.AFVersionDeclaration = afVersionDeclaration;
                j.values = string;
                this.AFInAppEventParameterName(j);
                return;
            }
            final String string = "";
            continue;
        }
    }
    
    public final String values(final Context context, final String s) {
        final SharedPreferences values = values(context);
        if (values.contains("CACHED_CHANNEL")) {
            return values.getString("CACHED_CHANNEL", (String)null);
        }
        final SharedPreferences$Editor edit = values(context).edit();
        edit.putString("CACHED_CHANNEL", s);
        INVOKEINTERFACE_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(edit);
        return s;
    }
    
    public final Map<String, Object> values() {
        final HashMap hashMap = new HashMap();
        if (this.AFLogger$LogLevel()) {
            hashMap.put("lvl", this.waitForCustomerUserId);
        }
        else if (this.setCustomerIdAndLogSession) {
            (this.waitForCustomerUserId = new HashMap<String, Object>()).put("error", "operation timed out.");
            hashMap.put("lvl", this.waitForCustomerUserId);
        }
        return hashMap;
    }
    
    public final void values(final Context context, final Intent intent) {
        if (INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "appsflyer_preinstall") != null) {
            final String invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "appsflyer_preinstall");
            try {
                if (new JSONObject(invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra).has("pid")) {
                    AppsFlyerProperties.getInstance().set("preInstallName", invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
                }
                else {
                    AFLogger.AFLogger$LogLevel("Cannot set preinstall attribution data without a media source");
                }
            }
            catch (final JSONException ex) {
                AFLogger.valueOf("Error parsing JSON for preinstall", (Throwable)ex);
            }
        }
        AFLogger.valueOf("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        final String invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2 = INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "referrer");
        AFLogger.valueOf("Play store referrer: ".concat(String.valueOf(invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2)));
        if (invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2 != null) {
            final SharedPreferences$Editor edit = values(context).edit();
            edit.putString("referrer", invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2);
            INVOKEINTERFACE_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(edit);
            final AppsFlyerProperties instance = AppsFlyerProperties.getInstance();
            instance.set("AF_REFERRER", invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2);
            instance.AFKeystoreWrapper = invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2;
            if (AppsFlyerProperties.getInstance().values()) {
                AFLogger.valueOf("onReceive: isLaunchCalled");
                final bx bx = new bx();
                if (context != null) {
                    bx.valueOf = (Application)INVOKEVIRTUAL_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
                }
                bx.AFVersionDeclaration = invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2;
                if (invokevirtual_com_appsflyer_internal_ai_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2.length() > 5 && this.valueOf(bx, values(context))) {
                    if (k.values == null) {
                        k.values = new k();
                    }
                    AFInAppEventParameterName(k.values.AFInAppEventType(), new b(bx, (byte)0), 5L, TimeUnit.MILLISECONDS);
                }
            }
        }
    }
    
    @Override
    public final void waitForCustomerUserId(final boolean b) {
        AFLogger.values("initAfterCustomerUserID: ".concat(String.valueOf(b)), true);
        AppsFlyerProperties.getInstance().set("waitForCustomerId", b);
    }
    
    public final class b implements Runnable
    {
        public final j AFInAppEventType;
        
        static {
            Covode.recordClassIndex(2600);
        }
        
        public b(final j afInAppEventType) {
            this.AFInAppEventType = afInAppEventType;
        }
        
        @Override
        public final void run() {
            ai.values(ai.this, this.AFInAppEventType);
        }
    }
    
    public final class d implements Runnable
    {
        public final j valueOf;
        
        static {
            Covode.recordClassIndex(2601);
        }
        
        public d(final j valueOf) {
            this.valueOf = valueOf;
        }
        
        public static void INVOKEINTERFACE_com_appsflyer_internal_ai$d_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(final SharedPreferences$Editor sharedPreferences$Editor) {
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
        
        @Override
        public final void run() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     3: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
            //     6: aload_0        
            //     7: getfield        com/appsflyer/internal/ai$d.valueOf:Lcom/appsflyer/internal/j;
            //    10: invokevirtual   com/appsflyer/internal/j.AFInAppEventParameterName:()Ljava/util/Map;
            //    13: astore_1       
            //    14: aload_0        
            //    15: getfield        com/appsflyer/internal/ai$d.valueOf:Lcom/appsflyer/internal/j;
            //    18: invokevirtual   com/appsflyer/internal/j.AFKeystoreWrapper:()Z
            //    21: istore_2       
            //    22: aload_0        
            //    23: getfield        com/appsflyer/internal/ai$d.valueOf:Lcom/appsflyer/internal/j;
            //    26: getfield        com/appsflyer/internal/j.onAppOpenAttributionNative:Ljava/lang/String;
            //    29: astore_3       
            //    30: aload_0        
            //    31: getfield        com/appsflyer/internal/ai$d.valueOf:Lcom/appsflyer/internal/j;
            //    34: getfield        com/appsflyer/internal/j.onAttributionFailureNative:I
            //    37: istore          4
            //    39: aload_0        
            //    40: getfield        com/appsflyer/internal/ai$d.valueOf:Lcom/appsflyer/internal/j;
            //    43: getfield        com/appsflyer/internal/j.valueOf:Landroid/app/Application;
            //    46: astore          5
            //    48: aload_0        
            //    49: getfield        com/appsflyer/internal/ai$d.AFInAppEventParameterName:Lcom/appsflyer/internal/ai;
            //    52: invokevirtual   com/appsflyer/AppsFlyerLib.isStopped:()Z
            //    55: ifeq            92
            //    58: aload_0        
            //    59: getfield        com/appsflyer/internal/ai$d.valueOf:Lcom/appsflyer/internal/j;
            //    62: getfield        com/appsflyer/internal/j.AFInAppEventParameterName:Lcom/appsflyer/attribution/AppsFlyerRequestListener;
            //    65: astore          6
            //    67: aload           6
            //    69: ifnull          85
            //    72: aload           6
            //    74: getstatic       com/appsflyer/attribution/RequestError.STOP_TRACKING:I
            //    77: getstatic       com/appsflyer/internal/az.valueOf:Ljava/lang/String;
            //    80: invokeinterface com/appsflyer/attribution/AppsFlyerRequestListener.onError:(ILjava/lang/String;)V
            //    85: sipush          3293
            //    88: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
            //    91: return         
            //    92: iconst_0       
            //    93: newarray        B
            //    95: astore          7
            //    97: iload_2        
            //    98: ifeq            434
            //   101: iload           4
            //   103: iconst_2       
            //   104: if_icmpgt       434
            //   107: new             Ljava/util/ArrayList;
            //   110: dup            
            //   111: invokespecial   java/util/ArrayList.<init>:()V
            //   114: astore          8
            //   116: aload_0        
            //   117: getfield        com/appsflyer/internal/ai$d.AFInAppEventParameterName:Lcom/appsflyer/internal/ai;
            //   120: invokestatic    com/appsflyer/internal/ai.AppsFlyer2dXConversionCallback:(Lcom/appsflyer/internal/ai;)[Lcom/appsflyer/internal/cl;
            //   123: ifnull          326
            //   126: aload_0        
            //   127: getfield        com/appsflyer/internal/ai$d.AFInAppEventParameterName:Lcom/appsflyer/internal/ai;
            //   130: invokestatic    com/appsflyer/internal/ai.AppsFlyer2dXConversionCallback:(Lcom/appsflyer/internal/ai;)[Lcom/appsflyer/internal/cl;
            //   133: astore          9
            //   135: aload           9
            //   137: arraylength    
            //   138: istore          10
            //   140: iconst_0       
            //   141: istore          11
            //   143: iload           11
            //   145: iload           10
            //   147: if_icmpge       326
            //   150: aload           9
            //   152: iload           11
            //   154: aaload         
            //   155: astore          12
            //   157: aload           12
            //   159: instanceof      Lcom/appsflyer/internal/cj;
            //   162: istore_2       
            //   163: getstatic       com/appsflyer/internal/ai$7.AFInAppEventParameterName:[I
            //   166: aload           12
            //   168: getfield        com/appsflyer/internal/cl.valueOf:Lcom/appsflyer/internal/cl$a;
            //   171: invokevirtual   java/lang/Enum.ordinal:()I
            //   174: iaload         
            //   175: istore          13
            //   177: iload           13
            //   179: iconst_1       
            //   180: if_icmpeq       268
            //   183: iload           13
            //   185: iconst_2       
            //   186: if_icmpeq       195
            //   189: iinc            11, 1
            //   192: goto            143
            //   195: iload           4
            //   197: iconst_2       
            //   198: if_icmpne       189
            //   201: iload_2        
            //   202: ifne            189
            //   205: new             Ljava/util/HashMap;
            //   208: dup            
            //   209: invokespecial   java/util/HashMap.<init>:()V
            //   212: astore          6
            //   214: aload           6
            //   216: ldc             "source"
            //   218: aload           12
            //   220: getfield        com/appsflyer/internal/cl.AFInAppEventType:Ljava/lang/String;
            //   223: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
            //   228: pop            
            //   229: aload           6
            //   231: ldc             "response"
            //   233: ldc             "TIMEOUT"
            //   235: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
            //   240: pop            
            //   241: aload           6
            //   243: new             Lcom/appsflyer/internal/ci;
            //   246: dup            
            //   247: invokespecial   com/appsflyer/internal/ci.<init>:()V
            //   250: invokeinterface java/util/Map.putAll:(Ljava/util/Map;)V
            //   255: aload           8
            //   257: aload           6
            //   259: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
            //   264: pop            
            //   265: goto            189
            //   268: iload_2        
            //   269: ifeq            310
            //   272: aload_1        
            //   273: ldc             "rfr"
            //   275: aload           12
            //   277: checkcast       Lcom/appsflyer/internal/cj;
            //   280: getfield        com/appsflyer/internal/cj.AFInAppEventParameterName:Ljava/util/Map;
            //   283: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
            //   288: pop            
            //   289: aload           5
            //   291: invokestatic    com/appsflyer/internal/ai.values:(Landroid/content/Context;)Landroid/content/SharedPreferences;
            //   294: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
            //   299: ldc             "newGPReferrerSent"
            //   301: iconst_1       
            //   302: invokeinterface android/content/SharedPreferences$Editor.putBoolean:(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
            //   307: invokestatic    com/appsflyer/internal/ai$d.INVOKEINTERFACE_com_appsflyer_internal_ai$d_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy:(Landroid/content/SharedPreferences$Editor;)V
            //   310: aload           8
            //   312: aload           12
            //   314: getfield        com/appsflyer/internal/cl.values:Ljava/util/Map;
            //   317: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
            //   322: pop            
            //   323: goto            189
            //   326: aload           8
            //   328: invokeinterface java/util/List.isEmpty:()Z
            //   333: ifne            347
            //   336: aload_1        
            //   337: ldc             "referrers"
            //   339: aload           8
            //   341: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
            //   346: pop            
            //   347: aload_0        
            //   348: getfield        com/appsflyer/internal/ai$d.AFInAppEventParameterName:Lcom/appsflyer/internal/ai;
            //   351: invokestatic    com/appsflyer/internal/ai.valueOf:(Lcom/appsflyer/internal/ai;)Ljava/util/Map;
            //   354: ifnull          373
            //   357: aload_1        
            //   358: ldc             "fb_ddl"
            //   360: aload_0        
            //   361: getfield        com/appsflyer/internal/ai$d.AFInAppEventParameterName:Lcom/appsflyer/internal/ai;
            //   364: invokestatic    com/appsflyer/internal/ai.valueOf:(Lcom/appsflyer/internal/ai;)Ljava/util/Map;
            //   367: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
            //   372: pop            
            //   373: aload_0        
            //   374: getfield        com/appsflyer/internal/ai$d.AFInAppEventParameterName:Lcom/appsflyer/internal/ai;
            //   377: invokestatic    com/appsflyer/internal/ai.AFVersionDeclaration:(Lcom/appsflyer/internal/ai;)Lcom/appsflyer/internal/cm;
            //   380: ifnull          434
            //   383: aload_0        
            //   384: getfield        com/appsflyer/internal/ai$d.AFInAppEventParameterName:Lcom/appsflyer/internal/ai;
            //   387: invokestatic    com/appsflyer/internal/ai.AFVersionDeclaration:(Lcom/appsflyer/internal/ai;)Lcom/appsflyer/internal/cm;
            //   390: invokevirtual   com/appsflyer/internal/cm.AFKeystoreWrapper:()Z
            //   393: ifeq            482
            //   396: aload_0        
            //   397: getfield        com/appsflyer/internal/ai$d.AFInAppEventParameterName:Lcom/appsflyer/internal/ai;
            //   400: invokestatic    com/appsflyer/internal/ai.AFVersionDeclaration:(Lcom/appsflyer/internal/ai;)Lcom/appsflyer/internal/cm;
            //   403: invokevirtual   com/appsflyer/internal/cm.AFInAppEventParameterName:()Ljava/util/List;
            //   406: astore          6
            //   408: aload           6
            //   410: ifnull          434
            //   413: aload           6
            //   415: invokeinterface java/util/List.isEmpty:()Z
            //   420: ifne            434
            //   423: aload_1        
            //   424: ldc             "preload_id"
            //   426: aload           6
            //   428: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
            //   433: pop            
            //   434: aload_0        
            //   435: getfield        com/appsflyer/internal/ai$d.valueOf:Lcom/appsflyer/internal/j;
            //   438: instanceof      Lcom/appsflyer/internal/bs;
            //   441: ifne            473
            //   444: aload_1        
            //   445: new             Lcom/appsflyer/internal/c$d;
            //   448: dup            
            //   449: aload_1        
            //   450: aload           5
            //   452: invokespecial   com/appsflyer/internal/c$d.<init>:(Ljava/util/Map;Landroid/content/Context;)V
            //   455: invokeinterface java/util/Map.putAll:(Ljava/util/Map;)V
            //   460: aload_1        
            //   461: aload_0        
            //   462: getfield        com/appsflyer/internal/ai$d.AFInAppEventParameterName:Lcom/appsflyer/internal/ai;
            //   465: invokevirtual   com/appsflyer/internal/ai.values:()Ljava/util/Map;
            //   468: invokeinterface java/util/Map.putAll:(Ljava/util/Map;)V
            //   473: aconst_null    
            //   474: astore          9
            //   476: aconst_null    
            //   477: astore          12
            //   479: goto            499
            //   482: aload_1        
            //   483: ldc             "preload_id"
            //   485: ldc             "timeout"
            //   487: invokestatic    java/util/Collections.singletonList:(Ljava/lang/Object;)Ljava/util/List;
            //   490: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
            //   495: pop            
            //   496: goto            434
            //   499: aload           7
            //   501: astore          6
            //   503: aload_0        
            //   504: getfield        com/appsflyer/internal/ai$d.valueOf:Lcom/appsflyer/internal/j;
            //   507: astore          14
            //   509: aload           7
            //   511: astore          6
            //   513: aload           14
            //   515: instanceof      Lcom/appsflyer/internal/bs;
            //   518: ifeq            559
            //   521: aload           7
            //   523: astore          6
            //   525: aload_1        
            //   526: ldc_w           "af_key"
            //   529: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
            //   534: checkcast       Ljava/lang/String;
            //   537: astore          8
            //   539: aload           7
            //   541: astore          6
            //   543: aload           14
            //   545: aload           8
            //   547: putfield        com/appsflyer/internal/j.AppsFlyer2dXConversionCallback:Ljava/lang/String;
            //   550: aload           7
            //   552: astore          6
            //   554: aload_1        
            //   555: monitorenter   
            //   556: goto            580
            //   559: aload           7
            //   561: astore          6
            //   563: aload_1        
            //   564: ldc_w           "appsflyerKey"
            //   567: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
            //   572: checkcast       Ljava/lang/String;
            //   575: astore          8
            //   577: goto            539
            //   580: aload_0        
            //   581: getfield        com/appsflyer/internal/ai$d.valueOf:Lcom/appsflyer/internal/j;
            //   584: astore          6
            //   586: lconst_0       
            //   587: invokestatic    android/widget/ExpandableListView.getPackedPositionGroup:(J)I
            //   590: ldc_w           47184
            //   593: iadd           
            //   594: i2c            
            //   595: invokestatic    android/view/ViewConfiguration.getMaximumFlingVelocity:()I
            //   598: bipush          16
            //   600: ishr           
            //   601: bipush          48
            //   603: iadd           
            //   604: iconst_0       
            //   605: iconst_0       
            //   606: invokestatic    android/widget/ExpandableListView.getPackedPositionForChild:(II)J
            //   609: lconst_0       
            //   610: lcmp           
            //   611: bipush          25
            //   613: iadd           
            //   614: invokestatic    com/appsflyer/internal/d.values:(CII)Ljava/lang/Object;
            //   617: checkcast       Ljava/lang/Class;
            //   620: ldc_w           "AFKeystoreWrapper"
            //   623: iconst_1       
            //   624: anewarray       Ljava/lang/Class;
            //   627: dup            
            //   628: iconst_0       
            //   629: ldc             Lcom/appsflyer/internal/j;.class
            //   631: aastore        
            //   632: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
            //   635: aconst_null    
            //   636: iconst_1       
            //   637: anewarray       Ljava/lang/Object;
            //   640: dup            
            //   641: iconst_0       
            //   642: aload           6
            //   644: aastore        
            //   645: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
            //   648: checkcast       [B
            //   651: astore          6
            //   653: aload_1        
            //   654: monitorexit    
            //   655: aload_0        
            //   656: getfield        com/appsflyer/internal/ai$d.AFInAppEventParameterName:Lcom/appsflyer/internal/ai;
            //   659: astore          7
            //   661: aload_0        
            //   662: getfield        com/appsflyer/internal/ai$d.valueOf:Lcom/appsflyer/internal/j;
            //   665: astore          8
            //   667: aload           8
            //   669: aload           6
            //   671: putfield        com/appsflyer/internal/j.init:[B
            //   674: aload           7
            //   676: aload           8
            //   678: invokestatic    com/appsflyer/internal/ai.AFInAppEventParameterName:(Lcom/appsflyer/internal/ai;Lcom/appsflyer/internal/j;)V
            //   681: sipush          3293
            //   684: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
            //   687: return         
            //   688: astore          8
            //   690: goto            809
            //   693: astore          8
            //   695: aload           6
            //   697: astore          7
            //   699: goto            736
            //   702: astore          8
            //   704: aload           8
            //   706: invokevirtual   java/lang/Throwable.getCause:()Ljava/lang/Throwable;
            //   709: astore          6
            //   711: aload           6
            //   713: ifnull          725
            //   716: sipush          3293
            //   719: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
            //   722: aload           6
            //   724: athrow         
            //   725: sipush          3293
            //   728: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
            //   731: aload           8
            //   733: athrow         
            //   734: astore          8
            //   736: aload           7
            //   738: astore          6
            //   740: aload_1        
            //   741: monitorexit    
            //   742: aload           7
            //   744: astore          6
            //   746: sipush          3293
            //   749: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
            //   752: aload           7
            //   754: astore          6
            //   756: aload           8
            //   758: athrow         
            //   759: astore          6
            //   761: aload           6
            //   763: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
            //   766: aload           6
            //   768: invokestatic    com/appsflyer/AFLogger.values:(Ljava/lang/String;Ljava/lang/Throwable;)V
            //   771: aload_0        
            //   772: getfield        com/appsflyer/internal/ai$d.valueOf:Lcom/appsflyer/internal/j;
            //   775: getfield        com/appsflyer/internal/j.AFInAppEventParameterName:Lcom/appsflyer/attribution/AppsFlyerRequestListener;
            //   778: astore          7
            //   780: aload           7
            //   782: ifnull          800
            //   785: aload           7
            //   787: getstatic       com/appsflyer/attribution/RequestError.NETWORK_FAILURE:I
            //   790: aload           6
            //   792: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
            //   795: invokeinterface com/appsflyer/attribution/AppsFlyerRequestListener.onError:(ILjava/lang/String;)V
            //   800: sipush          3293
            //   803: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
            //   806: return         
            //   807: astore          8
            //   809: ldc_w           "Exception while sending request to server. "
            //   812: aload           8
            //   814: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
            //   817: aload           6
            //   819: ifnull          1215
            //   822: aload           5
            //   824: ifnull          1215
            //   827: aload_3        
            //   828: ldc_w           "&isCachedRequest=true&timeincache="
            //   831: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
            //   834: ifne            1215
            //   837: invokestatic    com/appsflyer/internal/af.values:()Lcom/appsflyer/internal/af;
            //   840: pop            
            //   841: new             Lcom/appsflyer/internal/f;
            //   844: dup            
            //   845: aload_3        
            //   846: aload           6
            //   848: ldc_w           "6.4.0"
            //   851: invokespecial   com/appsflyer/internal/f.<init>:(Ljava/lang/String;[BLjava/lang/String;)V
            //   854: astore_3       
            //   855: aload           9
            //   857: astore          6
            //   859: aload           5
            //   861: invokestatic    com/appsflyer/internal/af.values:(Landroid/content/Context;)Ljava/io/File;
            //   864: astore          7
            //   866: aload           9
            //   868: astore          6
            //   870: aload           7
            //   872: invokevirtual   java/io/File.exists:()Z
            //   875: ifne            891
            //   878: aload           9
            //   880: astore          6
            //   882: aload           7
            //   884: invokevirtual   java/io/File.mkdir:()Z
            //   887: pop            
            //   888: goto            1205
            //   891: aload           9
            //   893: astore          6
            //   895: aload           7
            //   897: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
            //   900: astore          7
            //   902: aload           7
            //   904: ifnull          932
            //   907: aload           9
            //   909: astore          6
            //   911: aload           7
            //   913: arraylength    
            //   914: bipush          40
            //   916: if_icmple       932
            //   919: aload           9
            //   921: astore          6
            //   923: ldc_w           "reached cache limit, not caching request"
            //   926: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;)V
            //   929: goto            1205
            //   932: aload           9
            //   934: astore          6
            //   936: ldc_w           "caching request..."
            //   939: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;)V
            //   942: aload           9
            //   944: astore          6
            //   946: new             Ljava/io/File;
            //   949: astore          7
            //   951: aload           9
            //   953: astore          6
            //   955: aload           7
            //   957: aload           5
            //   959: invokestatic    com/appsflyer/internal/af.values:(Landroid/content/Context;)Ljava/io/File;
            //   962: invokestatic    java/lang/System.currentTimeMillis:()J
            //   965: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
            //   968: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
            //   971: aload           9
            //   973: astore          6
            //   975: aload           7
            //   977: invokevirtual   java/io/File.createNewFile:()Z
            //   980: pop            
            //   981: aload           9
            //   983: astore          6
            //   985: new             Ljava/io/FileOutputStream;
            //   988: astore_1       
            //   989: aload           9
            //   991: astore          6
            //   993: aload_1        
            //   994: aload           7
            //   996: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
            //   999: iconst_1       
            //  1000: invokespecial   java/io/FileOutputStream.<init>:(Ljava/lang/String;Z)V
            //  1003: aload           9
            //  1005: astore          6
            //  1007: new             Ljava/io/OutputStreamWriter;
            //  1010: dup            
            //  1011: aload_1        
            //  1012: invokespecial   java/io/OutputStreamWriter.<init>:(Ljava/io/OutputStream;)V
            //  1015: astore          7
            //  1017: aload           7
            //  1019: ldc_w           "version="
            //  1022: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
            //  1025: aload           7
            //  1027: aload_3        
            //  1028: getfield        com/appsflyer/internal/f.AFInAppEventParameterName:Ljava/lang/String;
            //  1031: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
            //  1034: aload           7
            //  1036: bipush          10
            //  1038: invokevirtual   java/io/Writer.write:(I)V
            //  1041: aload           7
            //  1043: ldc_w           "url="
            //  1046: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
            //  1049: aload           7
            //  1051: aload_3        
            //  1052: getfield        com/appsflyer/internal/f.valueOf:Ljava/lang/String;
            //  1055: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
            //  1058: aload           7
            //  1060: bipush          10
            //  1062: invokevirtual   java/io/Writer.write:(I)V
            //  1065: aload           7
            //  1067: ldc_w           "data="
            //  1070: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
            //  1073: aload           7
            //  1075: aload_3        
            //  1076: invokevirtual   com/appsflyer/internal/f.values:()[B
            //  1079: iconst_2       
            //  1080: invokestatic    android/util/Base64.encodeToString:([BI)Ljava/lang/String;
            //  1083: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
            //  1086: aload           7
            //  1088: bipush          10
            //  1090: invokevirtual   java/io/Writer.write:(I)V
            //  1093: aload           7
            //  1095: invokevirtual   java/io/Writer.flush:()V
            //  1098: aload           7
            //  1100: invokevirtual   java/io/Writer.close:()V
            //  1103: goto            1205
            //  1106: astore          8
            //  1108: aload           7
            //  1110: astore          6
            //  1112: aload           8
            //  1114: astore          7
            //  1116: goto            1166
            //  1119: astore          9
            //  1121: goto            1130
            //  1124: astore          9
            //  1126: aload           12
            //  1128: astore          7
            //  1130: aload           7
            //  1132: astore          6
            //  1134: ldc_w           "Could not cache request"
            //  1137: aload           9
            //  1139: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
            //  1142: aload           7
            //  1144: ifnull          1205
            //  1147: aload           7
            //  1149: invokevirtual   java/io/Writer.close:()V
            //  1152: goto            1205
            //  1155: astore          7
            //  1157: aload           7
            //  1159: astore          8
            //  1161: aload           6
            //  1163: ifnull          1189
            //  1166: aload           6
            //  1168: invokevirtual   java/io/Writer.close:()V
            //  1171: aload           7
            //  1173: astore          8
            //  1175: goto            1189
            //  1178: astore          6
            //  1180: aload           6
            //  1182: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/Throwable;)V
            //  1185: aload           7
            //  1187: astore          8
            //  1189: sipush          3293
            //  1192: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
            //  1195: aload           8
            //  1197: athrow         
            //  1198: astore          6
            //  1200: aload           6
            //  1202: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/Throwable;)V
            //  1205: aload           8
            //  1207: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
            //  1210: aload           8
            //  1212: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
            //  1215: aload_0        
            //  1216: getfield        com/appsflyer/internal/ai$d.valueOf:Lcom/appsflyer/internal/j;
            //  1219: getfield        com/appsflyer/internal/j.AFInAppEventParameterName:Lcom/appsflyer/attribution/AppsFlyerRequestListener;
            //  1222: astore          6
            //  1224: aload           6
            //  1226: ifnull          1244
            //  1229: aload           6
            //  1231: getstatic       com/appsflyer/attribution/RequestError.NETWORK_FAILURE:I
            //  1234: aload           8
            //  1236: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
            //  1239: invokeinterface com/appsflyer/attribution/AppsFlyerRequestListener.onError:(ILjava/lang/String;)V
            //  1244: aload_0        
            //  1245: getfield        com/appsflyer/internal/ai$d.AFInAppEventParameterName:Lcom/appsflyer/internal/ai;
            //  1248: astore          6
            //  1250: aload_0        
            //  1251: getfield        com/appsflyer/internal/ai$d.valueOf:Lcom/appsflyer/internal/j;
            //  1254: astore          7
            //  1256: aload           6
            //  1258: aload           7
            //  1260: aload           7
            //  1262: getfield        com/appsflyer/internal/j.AppsFlyer2dXConversionCallback:Ljava/lang/String;
            //  1265: aload           5
            //  1267: aload           5
            //  1269: invokestatic    com/appsflyer/internal/ai.values:(Landroid/content/Context;)Landroid/content/SharedPreferences;
            //  1272: aconst_null    
            //  1273: aload           8
            //  1275: invokestatic    com/appsflyer/internal/bo.values:(Lcom/appsflyer/internal/ai;Lcom/appsflyer/internal/j;Ljava/lang/String;Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/Integer;Ljava/lang/Throwable;)V
            //  1278: sipush          3293
            //  1281: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
            //  1284: return         
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                 
            //  -----  -----  -----  -----  ---------------------
            //  503    509    807    809    Ljava/io/IOException;
            //  503    509    759    807    Any
            //  513    521    807    809    Ljava/io/IOException;
            //  513    521    759    807    Any
            //  525    539    807    809    Ljava/io/IOException;
            //  525    539    759    807    Any
            //  543    550    807    809    Ljava/io/IOException;
            //  543    550    759    807    Any
            //  554    556    807    809    Ljava/io/IOException;
            //  554    556    759    807    Any
            //  563    577    807    809    Ljava/io/IOException;
            //  563    577    759    807    Any
            //  580    586    734    736    Any
            //  586    653    702    734    Any
            //  653    655    693    702    Any
            //  655    681    688    693    Ljava/io/IOException;
            //  655    681    759    807    Any
            //  704    711    734    736    Any
            //  716    725    734    736    Any
            //  725    734    734    736    Any
            //  740    742    807    809    Ljava/io/IOException;
            //  740    742    759    807    Any
            //  746    752    807    809    Ljava/io/IOException;
            //  746    752    759    807    Any
            //  756    759    807    809    Ljava/io/IOException;
            //  756    759    759    807    Any
            //  859    866    1124   1130   Ljava/lang/Exception;
            //  859    866    1155   1166   Any
            //  870    878    1124   1130   Ljava/lang/Exception;
            //  870    878    1155   1166   Any
            //  882    888    1124   1130   Ljava/lang/Exception;
            //  882    888    1155   1166   Any
            //  895    902    1124   1130   Ljava/lang/Exception;
            //  895    902    1155   1166   Any
            //  911    919    1124   1130   Ljava/lang/Exception;
            //  911    919    1155   1166   Any
            //  923    929    1124   1130   Ljava/lang/Exception;
            //  923    929    1155   1166   Any
            //  936    942    1124   1130   Ljava/lang/Exception;
            //  936    942    1155   1166   Any
            //  946    951    1124   1130   Ljava/lang/Exception;
            //  946    951    1155   1166   Any
            //  955    971    1124   1130   Ljava/lang/Exception;
            //  955    971    1155   1166   Any
            //  975    981    1124   1130   Ljava/lang/Exception;
            //  975    981    1155   1166   Any
            //  985    989    1124   1130   Ljava/lang/Exception;
            //  985    989    1155   1166   Any
            //  993    1003   1124   1130   Ljava/lang/Exception;
            //  993    1003   1155   1166   Any
            //  1007   1017   1124   1130   Ljava/lang/Exception;
            //  1007   1017   1155   1166   Any
            //  1017   1098   1119   1124   Ljava/lang/Exception;
            //  1017   1098   1106   1119   Any
            //  1098   1103   1198   1205   Ljava/io/IOException;
            //  1134   1142   1155   1166   Any
            //  1147   1152   1198   1205   Ljava/io/IOException;
            //  1166   1171   1178   1189   Ljava/io/IOException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_1130:
            //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
            //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
    }
    
    public final class e implements Runnable
    {
        public final Application valueOf;
        
        static {
            Covode.recordClassIndex(2602);
        }
        
        public e(final Context context) {
            this.valueOf = (Application)INVOKEVIRTUAL_com_appsflyer_internal_ai$e_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
        }
        
        public static Context INVOKEVIRTUAL_com_appsflyer_internal_ai$e_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context applicationContext) {
            applicationContext = applicationContext.getApplicationContext();
            if (!5WL.LIZIZ) {
                return applicationContext;
            }
            if (applicationContext != null) {
                return applicationContext;
            }
            return (Context)5WL.LIZ;
        }
        
        @Override
        public final void run() {
            if (ai.getLevel(ai.this)) {
                return;
            }
            ai.this.AppsFlyer2dXConversionCallback = System.currentTimeMillis();
            ai.valueOf(ai.this, true);
            try {
                try {
                    final String value = ai.valueOf("AppsFlyerKey");
                    af.values();
                    for (final f f : af.valueOf((Context)this.valueOf)) {
                        final StringBuilder sb = new StringBuilder("resending request: ");
                        sb.append(f.valueOf);
                        AFLogger.valueOf(sb.toString());
                        try {
                            final long currentTimeMillis = System.currentTimeMillis();
                            final long long1 = Long.parseLong(f.AFKeystoreWrapper, 10);
                            final ai afInAppEventType = ai.this;
                            final ca ca = new ca();
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append(f.valueOf);
                            sb2.append("&isCachedRequest=true&timeincache=");
                            sb2.append((currentTimeMillis - long1) / 1000L);
                            ca.valueOf(sb2.toString());
                            ca.init = f.values();
                            ca.AppsFlyer2dXConversionCallback = value;
                            final Application valueOf = this.valueOf;
                            if (valueOf != null) {
                                ca.valueOf = (Application)INVOKEVIRTUAL_com_appsflyer_internal_ai$e_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext((Context)valueOf);
                            }
                            ca.getLevel = f.AFKeystoreWrapper;
                            ca.onDeepLinkingNative = false;
                            ai.AFInAppEventParameterName(afInAppEventType, ca);
                        }
                        catch (final Exception ex) {
                            AFLogger.valueOf("Failed to resend cached request", ex);
                        }
                    }
                }
                catch (final Exception ex2) {
                    AFLogger.valueOf("failed to check cache. ", ex2);
                }
                ai.valueOf(ai.this, false);
                ai.AFLogger$LogLevel(ai.this).shutdown();
                ai.init(ai.this);
            }
            finally {
                ai.valueOf(ai.this, false);
            }
        }
    }
}
