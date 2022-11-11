// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.platform;

import javax.inject.Inject;
import ah2.f;
import cb0.g;
import kotlin.Metadata;
import com.reddit.data.events.models.AnalyticsPlatform;

@Metadata(bv = {}, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\r8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0014R\u0014\u0010!\u001a\u00020\u00028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010\u0006R\u0014\u0010#\u001a\u00020\u00028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010\u0006R\u0014\u0010%\u001a\u00020\u00028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010\u0006R\u0014\u0010'\u001a\u00020\u00028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010\u0006R\u0014\u0010)\u001a\u00020\u00028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010\u0006¨\u00060" }, d2 = { "Lcom/reddit/data/events/models/platform/RedditPushAnalyticsPlatform;", "Lcom/reddit/data/events/models/AnalyticsPlatform;", "", "deviceId", "Ljava/lang/String;", "getDeviceId", "()Ljava/lang/String;", "", "getAppInstallTime", "()Ljava/lang/Long;", "appInstallTime", "getAppVersion", "appVersion", "", "getAppVersionCode", "()I", "appVersionCode", "getAppVersionName", "appVersionName", "getAvailableMemoryInMB", "()J", "availableMemoryInMB", "getBrowserName", "browserName", "getConnectionType", "connectionType", "getDeviceManufacturer", "deviceManufacturer", "getDeviceName", "deviceName", "getDownloadSpeedInKbps", "downloadSpeedInKbps", "getLanguageList", "languageList", "getOsName", "osName", "getOsVersion", "osVersion", "getPlatformName", "platformName", "getPrimaryLanguage", "primaryLanguage", "Lcom/reddit/data/events/models/platform/RedditAnalyticsPlatform;", "redditAnalyticsPlatform", "Lcb0/g;", "defaultDeviceIdProvider", "<init>", "(Lcom/reddit/data/events/models/platform/RedditAnalyticsPlatform;Lcb0/g;)V", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public final class RedditPushAnalyticsPlatform implements AnalyticsPlatform
{
    private final /* synthetic */ RedditAnalyticsPlatform $$delegate_0;
    private final String deviceId;
    
    @Inject
    public RedditPushAnalyticsPlatform(final RedditAnalyticsPlatform $$delegate_0, final g g) {
        f.f((Object)$$delegate_0, "redditAnalyticsPlatform");
        f.f((Object)g, "defaultDeviceIdProvider");
        this.$$delegate_0 = $$delegate_0;
        String deviceId;
        if ((deviceId = g.getDeviceId()) == null) {
            deviceId = "";
        }
        this.deviceId = deviceId;
    }
    
    @Override
    public Long getAppInstallTime() {
        return this.$$delegate_0.getAppInstallTime();
    }
    
    @Override
    public String getAppVersion() {
        return this.$$delegate_0.getAppVersion();
    }
    
    @Override
    public int getAppVersionCode() {
        return this.$$delegate_0.getAppVersionCode();
    }
    
    @Override
    public String getAppVersionName() {
        return this.$$delegate_0.getAppVersionName();
    }
    
    @Override
    public long getAvailableMemoryInMB() {
        return this.$$delegate_0.getAvailableMemoryInMB();
    }
    
    @Override
    public String getBrowserName() {
        return this.$$delegate_0.getBrowserName();
    }
    
    @Override
    public String getConnectionType() {
        return this.$$delegate_0.getConnectionType();
    }
    
    @Override
    public String getDeviceId() {
        return this.deviceId;
    }
    
    @Override
    public String getDeviceManufacturer() {
        return this.$$delegate_0.getDeviceManufacturer();
    }
    
    @Override
    public String getDeviceName() {
        return this.$$delegate_0.getDeviceName();
    }
    
    @Override
    public long getDownloadSpeedInKbps() {
        return this.$$delegate_0.getDownloadSpeedInKbps();
    }
    
    @Override
    public String getLanguageList() {
        return this.$$delegate_0.getLanguageList();
    }
    
    @Override
    public String getOsName() {
        return this.$$delegate_0.getOsName();
    }
    
    @Override
    public String getOsVersion() {
        return this.$$delegate_0.getOsVersion();
    }
    
    @Override
    public String getPlatformName() {
        return this.$$delegate_0.getPlatformName();
    }
    
    @Override
    public String getPrimaryLanguage() {
        return this.$$delegate_0.getPrimaryLanguage();
    }
}
