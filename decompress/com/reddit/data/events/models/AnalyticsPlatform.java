// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001e\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0012\u0010\u0010\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\tR\u0012\u0010\u0015\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\tR\u0012\u0010\u0017\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\tR\u0012\u0010\u0019\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\tR\u0012\u0010\u001b\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\tR\u0012\u0010\u001d\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012R\u0012\u0010\u001f\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\tR\u0012\u0010!\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\tR\u0012\u0010#\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\tR\u0012\u0010%\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\tR\u0012\u0010'\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\t¨\u0006)" }, d2 = { "Lcom/reddit/data/events/models/AnalyticsPlatform;", "", "appInstallTime", "", "getAppInstallTime", "()Ljava/lang/Long;", "appVersion", "", "getAppVersion", "()Ljava/lang/String;", "appVersionCode", "", "getAppVersionCode", "()I", "appVersionName", "getAppVersionName", "availableMemoryInMB", "getAvailableMemoryInMB", "()J", "browserName", "getBrowserName", "connectionType", "getConnectionType", "deviceId", "getDeviceId", "deviceManufacturer", "getDeviceManufacturer", "deviceName", "getDeviceName", "downloadSpeedInKbps", "getDownloadSpeedInKbps", "languageList", "getLanguageList", "osName", "getOsName", "osVersion", "getOsVersion", "platformName", "getPlatformName", "primaryLanguage", "getPrimaryLanguage", "impl_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public interface AnalyticsPlatform
{
    Long getAppInstallTime();
    
    String getAppVersion();
    
    int getAppVersionCode();
    
    String getAppVersionName();
    
    long getAvailableMemoryInMB();
    
    String getBrowserName();
    
    String getConnectionType();
    
    String getDeviceId();
    
    String getDeviceManufacturer();
    
    String getDeviceName();
    
    long getDownloadSpeedInKbps();
    
    String getLanguageList();
    
    String getOsName();
    
    String getOsVersion();
    
    String getPlatformName();
    
    String getPrimaryLanguage();
}
