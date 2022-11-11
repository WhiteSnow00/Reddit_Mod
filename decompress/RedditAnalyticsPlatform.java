// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.platform;

import u41.a;
import com.reddit.network.info.NetworkTypeProvider$a;
import com.reddit.network.info.NetworkTypeProvider$BandwidthDirection;
import java.util.Locale;
import kotlin.text.Regex;
import android.app.ActivityManager$MemoryInfo;
import android.app.ActivityManager;
import v3.e;
import android.content.res.Resources;
import javax.inject.Inject;
import android.os.Build$VERSION;
import android.os.Build;
import ah2.f;
import db0.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.network.info.NetworkTypeProvider;
import cb0.h;
import android.content.Context;
import cb0.d;
import kotlin.Metadata;
import com.reddit.data.events.models.AnalyticsPlatform;

@Metadata(bv = {}, d1 = { "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 A2\u00020\u0001:\u0001ABC\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0011\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\fR\u0014\u0010\u001f\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\fR\u0014\u0010#\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\fR\u0016\u0010'\u001a\u0004\u0018\u00010$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\fR\u0014\u0010+\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\fR\u0014\u0010-\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\fR\u0014\u00100\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0014\u00104\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\f¨\u0006B" }, d2 = { "Lcom/reddit/data/events/models/platform/RedditAnalyticsPlatform;", "Lcom/reddit/data/events/models/AnalyticsPlatform;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/reddit/network/info/NetworkTypeProvider;", "networkTypeProvider", "Lcom/reddit/network/info/NetworkTypeProvider;", "", "deviceName", "Ljava/lang/String;", "getDeviceName", "()Ljava/lang/String;", "deviceManufacturer", "getDeviceManufacturer", "osName", "getOsName", "osVersion", "getOsVersion", "appVersionName", "getAppVersionName", "", "appVersionCode", "I", "getAppVersionCode", "()I", "appVersion", "getAppVersion", "Lv3/h;", "getDeviceLanguagesList", "()Lv3/h;", "deviceLanguagesList", "getPlatformName", "platformName", "getDeviceId", "deviceId", "", "getAppInstallTime", "()Ljava/lang/Long;", "appInstallTime", "getBrowserName", "browserName", "getPrimaryLanguage", "primaryLanguage", "getLanguageList", "languageList", "getAvailableMemoryInMB", "()J", "availableMemoryInMB", "getDownloadSpeedInKbps", "downloadSpeedInKbps", "getConnectionType", "connectionType", "Lcb0/d;", "browserNameProvider", "Lsw1/d;", "sessionDataOperator", "Lu41/d;", "networkBandwidthProvider", "Lcb0/h;", "deviceMetrics", "Ldb0/l;", "internalFeatures", "<init>", "(Landroid/content/Context;Lcb0/d;Lsw1/d;Lcom/reddit/network/info/NetworkTypeProvider;Lu41/d;Lcb0/h;Ldb0/l;)V", "Companion", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public final class RedditAnalyticsPlatform implements AnalyticsPlatform
{
    private static final String ANDROID_OS_NAME = "android";
    public static final Companion Companion;
    private static final String DEFAULT_WEB_BROWSER_NAME = "web_view_fallback";
    private static final String PLATFORM_NAME_PHONE = "android_phone";
    private static final String PLATFORM_NAME_TABLET = "android_tablet";
    private final String appVersion;
    private final int appVersionCode;
    private final String appVersionName;
    private final d browserNameProvider;
    private final Context context;
    private final String deviceManufacturer;
    private final h deviceMetrics;
    private final String deviceName;
    private final u41.d networkBandwidthProvider;
    private final NetworkTypeProvider networkTypeProvider;
    private final String osName;
    private final String osVersion;
    private final sw1.d sessionDataOperator;
    
    static {
        Companion = new Companion(null);
    }
    
    @Inject
    public RedditAnalyticsPlatform(final Context context, final d browserNameProvider, final sw1.d sessionDataOperator, final NetworkTypeProvider networkTypeProvider, final u41.d networkBandwidthProvider, final h deviceMetrics, final l l) {
        f.f((Object)context, "context");
        f.f((Object)browserNameProvider, "browserNameProvider");
        f.f((Object)sessionDataOperator, "sessionDataOperator");
        f.f((Object)networkTypeProvider, "networkTypeProvider");
        f.f((Object)networkBandwidthProvider, "networkBandwidthProvider");
        f.f((Object)deviceMetrics, "deviceMetrics");
        f.f((Object)l, "internalFeatures");
        this.context = context;
        this.browserNameProvider = browserNameProvider;
        this.sessionDataOperator = sessionDataOperator;
        this.networkTypeProvider = networkTypeProvider;
        this.networkBandwidthProvider = networkBandwidthProvider;
        this.deviceMetrics = deviceMetrics;
        final String model = Build.MODEL;
        f.e((Object)model, "MODEL");
        this.deviceName = model;
        final String manufacturer = Build.MANUFACTURER;
        f.e((Object)manufacturer, "MANUFACTURER");
        this.deviceManufacturer = manufacturer;
        this.osName = "android";
        final String release = Build$VERSION.RELEASE;
        f.e((Object)release, "RELEASE");
        this.osVersion = release;
        this.appVersionName = l.c();
        this.appVersionCode = l.n();
        this.appVersion = l.getAppVersion();
    }
    
    private final v3.h getDeviceLanguagesList() {
        return e.a(Resources.getSystem().getConfiguration());
    }
    
    @Override
    public Long getAppInstallTime() {
        return this.sessionDataOperator.f();
    }
    
    @Override
    public String getAppVersion() {
        return this.appVersion;
    }
    
    @Override
    public int getAppVersionCode() {
        return this.appVersionCode;
    }
    
    @Override
    public String getAppVersionName() {
        return this.appVersionName;
    }
    
    @Override
    public long getAvailableMemoryInMB() {
        final Object systemService = this.deviceMetrics.a.getSystemService("activity");
        f.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        final ActivityManager activityManager = (ActivityManager)systemService;
        final ActivityManager$MemoryInfo activityManager$MemoryInfo = new ActivityManager$MemoryInfo();
        activityManager.getMemoryInfo(activityManager$MemoryInfo);
        return activityManager$MemoryInfo.availMem / 1024;
    }
    
    @Override
    public String getBrowserName() {
        final String a = this.browserNameProvider.a();
        if (a == null) {
            return "web_view_fallback";
        }
        final Regex regex = new Regex("[^a-z0-9_-]");
        final Locale us = Locale.US;
        f.e((Object)us, "US");
        final String lowerCase = a.toLowerCase(us);
        f.e((Object)lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return regex.replace((CharSequence)lowerCase, "_");
    }
    
    @Override
    public String getConnectionType() {
        return NetworkTypeProvider$a.a(this.networkTypeProvider, NetworkTypeProvider$BandwidthDirection.None, 1);
    }
    
    @Override
    public String getDeviceId() {
        String deviceId;
        if ((deviceId = ((xw1.d)this.sessionDataOperator).getDeviceId()) == null) {
            deviceId = "";
        }
        return deviceId;
    }
    
    @Override
    public String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }
    
    @Override
    public String getDeviceName() {
        return this.deviceName;
    }
    
    @Override
    public long getDownloadSpeedInKbps() {
        final long n = ((a)this.networkBandwidthProvider.b().getValue()).a / 1000;
        final long n2 = 50;
        return n / n2 * n2 * 1L;
    }
    
    @Override
    public String getLanguageList() {
        final String d = this.getDeviceLanguagesList().d();
        f.e((Object)d, "deviceLanguagesList.toLanguageTags()");
        return d;
    }
    
    @Override
    public String getOsName() {
        return this.osName;
    }
    
    @Override
    public String getOsVersion() {
        return this.osVersion;
    }
    
    @Override
    public String getPlatformName() {
        String s;
        if ((this.context.getResources().getConfiguration().screenLayout & 0xF) >= 3) {
            s = "android_tablet";
        }
        else {
            s = "android_phone";
        }
        return s;
    }
    
    @Override
    public String getPrimaryLanguage() {
        final Locale b = this.getDeviceLanguagesList().b(0);
        f.c((Object)b);
        final String languageTag = b.toLanguageTag();
        f.e((Object)languageTag, "deviceLanguagesList[0]!!.toLanguageTag()");
        return languageTag;
    }
    
    @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b" }, d2 = { "Lcom/reddit/data/events/models/platform/RedditAnalyticsPlatform$Companion;", "", "()V", "ANDROID_OS_NAME", "", "DEFAULT_WEB_BROWSER_NAME", "PLATFORM_NAME_PHONE", "PLATFORM_NAME_TABLET", "impl_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
    }
}
