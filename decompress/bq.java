// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import java.util.concurrent.TimeUnit;
import android.app.Application;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.net.HttpURLConnection;
import java.lang.ref.WeakReference;
import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import java.util.Map;
import java.text.SimpleDateFormat;
import java.util.Locale;
import android.net.Uri;
import android.content.Intent;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.AFLogger;
import android.text.TextUtils;
import X.6Tl;
import X.NQO;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import X.46U;
import android.os.Build$VERSION;
import X.3xs;
import android.content.SharedPreferences$Editor;
import X.0II;
import com.appsflyer.AppsFlyerLib;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.content.SharedPreferences;

public final class bq extends bu
{
    public static String onInstallConversionFailureNative;
    public final SharedPreferences onInstallConversionDataLoadedNative;
    
    static {
        Covode.recordClassIndex(2649);
        final StringBuilder sb = new StringBuilder("https://%sregister.%s/api/v");
        sb.append(ai.values);
        bq.onInstallConversionFailureNative = sb.toString();
    }
    
    public bq(final Context context) {
        final StringBuilder sb = new StringBuilder();
        sb.append(0II.LIZ(bq.onInstallConversionFailureNative, new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName() }));
        sb.append(context.getPackageName());
        super(null, sb.toString(), null, null, null, context);
        this.onInstallConversionDataLoadedNative = ai.values(context);
    }
    
    private void AFInAppEventParameterName(final aa aa) {
        INVOKEINTERFACE_com_appsflyer_internal_bq_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(this.onInstallConversionDataLoadedNative.edit().putString("afUninstallToken", aa.AFKeystoreWrapper).putLong("afUninstallToken_received_time", aa.AFInAppEventParameterName).putBoolean("afUninstallToken_queued", aa.valueOf()));
    }
    
    public static void INVOKEINTERFACE_com_appsflyer_internal_bq_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(final SharedPreferences$Editor sharedPreferences$Editor) {
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
    
    public static PackageInfo INVOKEVIRTUAL_com_appsflyer_internal_bq_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo(final PackageManager packageManager, final String s, final int n) {
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
    
    public static /* synthetic */ void valueOf(final bq bq) {
        INVOKEINTERFACE_com_appsflyer_internal_bq_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(bq.onInstallConversionDataLoadedNative.edit().putBoolean("sentRegisterRequestToAF", true));
        AFLogger.AFInAppEventType("Successfully registered for Uninstall Tracking");
    }
    
    public static boolean values(final Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            Class.forName("com.google.firebase.messaging.FirebaseMessagingService");
            if (ac.AFKeystoreWrapper(context, new Intent("com.google.firebase.MESSAGING_EVENT", (Uri)null, context, (Class)FirebaseMessagingServiceListener.class))) {
                return true;
            }
            goto Label_0048;
        }
        catch (final ClassNotFoundException ex) {
            goto Label_0048;
        }
        finally {
            final Throwable t;
            AFLogger.valueOf("An error occurred while trying to verify manifest declarations: ", t);
        }
    }
    
    public static boolean values(final SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean("sentRegisterRequestToAF", false);
    }
    
    public final void AFInAppEventType(String value) {
        final Application valueOf = super.valueOf;
        final ai value2 = ai.valueOf();
        if (value2.AFInAppEventType()) {
            AFLogger.values("CustomerUserId not set, Tracking is disabled", true);
            return;
        }
        final String value3 = ai.valueOf("AppsFlyerKey");
        if (value3 == null) {
            AFLogger.AFLogger$LogLevel("[registerUninstall] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        final PackageManager packageManager = ((Context)valueOf).getPackageManager();
        final String packageName = ((Context)valueOf).getPackageName();
        try {
            final PackageInfo invokevirtual_com_appsflyer_internal_bq_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo = INVOKEVIRTUAL_com_appsflyer_internal_bq_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo(packageManager, packageName, 0);
            super.AFInAppEventType.put("app_version_code", Integer.toString(invokevirtual_com_appsflyer_internal_bq_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo.versionCode));
            super.AFInAppEventType.put("app_version_name", invokevirtual_com_appsflyer_internal_bq_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo.versionName);
            super.AFInAppEventType.put("app_name", packageManager.getApplicationLabel(invokevirtual_com_appsflyer_internal_bq_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo.applicationInfo).toString());
            super.AFInAppEventType.put("installDate", ai.AFInAppEventParameterName(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), invokevirtual_com_appsflyer_internal_bq_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo.firstInstallTime));
        }
        finally {
            final Throwable t;
            AFLogger.valueOf("Exception while collecting application version info.", t);
        }
        ai.AFKeystoreWrapper((Context)valueOf, super.AFInAppEventType);
        final String string = AppsFlyerProperties.getInstance().getString("AppUserId");
        if (string != null) {
            super.AFInAppEventType.put("appUserId", string);
        }
        try {
            super.AFInAppEventType.put("model", Build.MODEL);
            super.AFInAppEventType.put("brand", Build.BRAND);
        }
        finally {
            final Throwable t2;
            AFLogger.valueOf("Exception while collecting device brand and model.", t2);
        }
        if (AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false)) {
            super.AFInAppEventType.put("deviceTrackingDisabled", "true");
        }
        final c.d.b afInAppEventParameterName = ad.AFInAppEventParameterName(((Context)valueOf).getContentResolver());
        if (afInAppEventParameterName != null) {
            super.AFInAppEventType.put("amazon_aid", afInAppEventParameterName.values);
            super.AFInAppEventType.put("amazon_aid_limit", String.valueOf(afInAppEventParameterName.AFKeystoreWrapper));
        }
        final String string2 = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string2 != null) {
            super.AFInAppEventType.put("advertiserId", string2);
        }
        super.AFInAppEventType.put("devkey", value3);
        super.AFInAppEventType.put("uid", ak.AFInAppEventParameterName(new WeakReference<Context>((Context)valueOf)));
        super.AFInAppEventType.put("af_gcm_token", value);
        super.AFInAppEventType.put("launch_counter", Integer.toString(ai.AFInAppEventParameterName(this.onInstallConversionDataLoadedNative, "appsFlyerCount", false)));
        super.AFInAppEventType.put("sdk", Integer.toString(Build$VERSION.SDK_INT));
        value = value2.valueOf((Context)valueOf);
        if (value != null) {
            super.AFInAppEventType.put("channel", value);
        }
        new PthreadThread((Runnable)new Runnable() {
            static {
                Covode.recordClassIndex(2650);
            }
            
            @Override
            public final void run() {
                try {
                    final bq afInAppEventType = bq.this;
                    afInAppEventType.onConversionDataSuccess = value2.isStopped();
                    final HttpURLConnection afInAppEventParameterName = new ah(afInAppEventType).AFInAppEventParameterName();
                    if (afInAppEventParameterName != null) {
                        if (afInAppEventParameterName.getResponseCode() == 200) {
                            bq.valueOf(bq.this);
                        }
                        afInAppEventParameterName.disconnect();
                    }
                }
                finally {
                    final Throwable t;
                    AFLogger.valueOf(t.getMessage(), t);
                }
            }
        }, "r/internal/bq").start();
    }
    
    public final aa values() {
        final String string = this.onInstallConversionDataLoadedNative.getString("afUninstallToken", (String)null);
        final long long1 = this.onInstallConversionDataLoadedNative.getLong("afUninstallToken_received_time", 0L);
        final boolean boolean1 = this.onInstallConversionDataLoadedNative.getBoolean("afUninstallToken_queued", false);
        INVOKEINTERFACE_com_appsflyer_internal_bq_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(this.onInstallConversionDataLoadedNative.edit().putBoolean("afUninstallToken_queued", false));
        String s = string;
        if (string == null) {
            final String string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken");
            s = string;
            if (string2 != null) {
                final String[] split = string2.split(",");
                s = split[split.length - 1];
            }
        }
        long long2 = long1;
        while (true) {
            if (long1 != 0L) {
                break Label_0158;
            }
            final String string3 = AppsFlyerProperties.getInstance().getString("afUninstallToken");
            long2 = long1;
            if (string3 == null) {
                break Label_0158;
            }
            final String[] split2 = string3.split(",");
            long2 = long1;
            if (split2.length < 2) {
                break Label_0158;
            }
            try {
                long2 = Long.parseLong(split2[split2.length - 2]);
                if (s != null) {
                    return new aa(s, long2, boolean1);
                }
                return null;
            }
            catch (final NumberFormatException ex) {
                long2 = long1;
                continue;
            }
            break;
        }
    }
    
    public final void values(final String s) {
        if (s != null) {
            AFLogger.valueOf("Firebase Refreshed Token = ".concat(String.valueOf(s)));
            final aa values = this.values();
            if (values == null || !s.equals(values.AFKeystoreWrapper)) {
                final long currentTimeMillis = System.currentTimeMillis();
                boolean b;
                if (ai.valueOf(this.onInstallConversionDataLoadedNative) && (values == null || currentTimeMillis - values.AFInAppEventParameterName > TimeUnit.SECONDS.toMillis(2L))) {
                    b = true;
                }
                else {
                    b = false;
                }
                this.AFInAppEventParameterName(new aa(s, currentTimeMillis, b ^ true));
                if (b) {
                    this.AFInAppEventType(s);
                }
            }
        }
    }
}
