// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer;

import com.appsflyer.deeplink.DeepLinkListener;
import android.app.Activity;
import android.content.Intent;
import java.net.URI;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import android.content.Context;
import com.appsflyer.compat.function.Consumer;
import com.android.billingclient.api.Purchase;
import java.util.List;
import com.appsflyer.compat.function.Function;
import java.util.Map;
import com.appsflyer.internal.ai;
import com.bytedance.covode.number.Covode;

public abstract class AppsFlyerLib
{
    static {
        Covode.recordClassIndex(2547);
    }
    
    public static AppsFlyerLib getInstance() {
        return ai.valueOf();
    }
    
    public abstract void addPushNotificationDeepLinkPath(final String... p0);
    
    public abstract void anonymizeUser(final boolean p0);
    
    public abstract void appendParametersToDeepLinkingURL(final String p0, final Map<String, String> p1);
    
    public abstract void autoLogSubscriptionsRevenue(final Function<List<Purchase>, Map<String, String>> p0, final Consumer<String> p1, final Consumer<String> p2, final Boolean p3);
    
    public abstract void enableFacebookDeferredApplinks(final boolean p0);
    
    public abstract AppsFlyerLib enableLocationCollection(final boolean p0);
    
    public abstract String getAppsFlyerUID(final Context p0);
    
    public abstract String getAttributionId(final Context p0);
    
    public abstract String getHostName();
    
    public abstract String getHostPrefix();
    
    public abstract String getOutOfStore(final Context p0);
    
    public abstract String getSdkVersion();
    
    public abstract AppsFlyerLib init(final String p0, final AppsFlyerConversionListener p1, final Context p2);
    
    public abstract boolean isPreInstalledApp(final Context p0);
    
    public abstract boolean isStopped();
    
    public abstract void logEvent(final Context p0, final String p1, final Map<String, Object> p2);
    
    public abstract void logEvent(final Context p0, final String p1, final Map<String, Object> p2, final AppsFlyerRequestListener p3);
    
    public abstract void logLocation(final Context p0, final double p1, final double p2);
    
    public abstract void logSession(final Context p0);
    
    public abstract void onPause(final Context p0);
    
    public abstract void performOnAppAttribution(final Context p0, final URI p1);
    
    public abstract void performOnDeepLinking(final Intent p0, final Context p1);
    
    public abstract void registerConversionListener(final Context p0, final AppsFlyerConversionListener p1);
    
    public abstract void registerValidatorListener(final Context p0, final AppsFlyerInAppPurchaseValidatorListener p1);
    
    public abstract void sendAdRevenue(final Context p0, final Map<String, Object> p1);
    
    public abstract void sendPushNotificationData(final Activity p0);
    
    public abstract void setAdditionalData(final Map<String, Object> p0);
    
    public abstract void setAndroidIdData(final String p0);
    
    public abstract void setAppId(final String p0);
    
    public abstract void setAppInviteOneLink(final String p0);
    
    public abstract void setCollectAndroidID(final boolean p0);
    
    public abstract void setCollectIMEI(final boolean p0);
    
    public abstract void setCollectOaid(final boolean p0);
    
    public abstract void setCurrencyCode(final String p0);
    
    public abstract void setCustomerIdAndLogSession(final String p0, final Context p1);
    
    public abstract void setCustomerUserId(final String p0);
    
    public abstract void setDebugLog(final boolean p0);
    
    public abstract void setDisableAdvertisingIdentifiers(final boolean p0);
    
    public abstract void setExtension(final String p0);
    
    public abstract void setHost(final String p0, final String p1);
    
    public abstract void setImeiData(final String p0);
    
    public abstract void setIsUpdate(final boolean p0);
    
    public abstract void setLogLevel(final AFLogger.LogLevel p0);
    
    public abstract void setMinTimeBetweenSessions(final int p0);
    
    public abstract void setOaidData(final String p0);
    
    public abstract void setOneLinkCustomDomain(final String... p0);
    
    public abstract void setOutOfStore(final String p0);
    
    public abstract void setPartnerData(final String p0, final Map<String, Object> p1);
    
    public abstract void setPhoneNumber(final String p0);
    
    public abstract void setPreinstallAttribution(final String p0, final String p1, final String p2);
    
    public abstract void setResolveDeepLinkURLs(final String... p0);
    
    public abstract void setSharingFilter(final String... p0);
    
    public abstract void setSharingFilterForAllPartners();
    
    public abstract void setSharingFilterForPartners(final String... p0);
    
    public abstract void setUserEmails(final AppsFlyerProperties.EmailsCryptType p0, final String... p1);
    
    public abstract void setUserEmails(final String... p0);
    
    public abstract void start(final Context p0);
    
    public abstract void start(final Context p0, final String p1);
    
    public abstract void start(final Context p0, final String p1, final AppsFlyerRequestListener p2);
    
    public abstract void stop(final boolean p0, final Context p1);
    
    public abstract void subscribeForDeepLink(final DeepLinkListener p0);
    
    public abstract void subscribeForDeepLink(final DeepLinkListener p0, final long p1);
    
    public abstract void unregisterConversionListener();
    
    public abstract void updateServerUninstallToken(final Context p0, final String p1);
    
    public abstract void validateAndLogInAppPurchase(final Context p0, final String p1, final String p2, final String p3, final String p4, final String p5, final Map<String, String> p6);
    
    public abstract void waitForCustomerUserId(final boolean p0);
}
