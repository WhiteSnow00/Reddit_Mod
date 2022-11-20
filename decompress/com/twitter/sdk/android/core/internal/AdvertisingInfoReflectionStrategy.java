// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal;

import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.twitter.sdk.android.core.Twitter;
import com.google.android.gms.ads.identifier.AdvertisingIdClient$Info;
import android.content.Context;

class AdvertisingInfoReflectionStrategy implements AdvertisingInfoStrategy
{
    private static final String CLASS_NAME_ADVERTISING_ID_CLIENT = "com.google.android.gms.ads.identifier.AdvertisingIdClient";
    private static final String CLASS_NAME_ADVERTISING_ID_CLIENT_INFO = "com.google.android.gms.ads.identifier.AdvertisingIdClient$Info";
    private static final String CLASS_NAME_GOOGLE_PLAY_SERVICES_UTILS = "com.google.android.gms.common.GooglePlayServicesUtil";
    private static final int GOOGLE_PLAY_SERVICES_SUCCESS_CODE = 0;
    private static final String METHOD_NAME_GET_ADVERTISING_ID_INFO = "getAdvertisingIdInfo";
    private static final String METHOD_NAME_GET_ID = "getId";
    private static final String METHOD_NAME_IS_GOOGLE_PLAY_SERVICES_AVAILABLE = "isGooglePlayServicesAvailable";
    private static final String METHOD_NAME_IS_LIMITED_AD_TRACKING_ENABLED = "isLimitAdTrackingEnabled";
    private final Context context;
    
    public AdvertisingInfoReflectionStrategy(final Context context) {
        this.context = context.getApplicationContext();
    }
    
    private String getAdvertisingId() {
        try {
            return (String)AdvertisingIdClient$Info.class.getMethod("getId", (Class<?>[])new Class[0]).invoke(this.getInfo(), new Object[0]);
        }
        catch (final Exception ex) {
            Twitter.getLogger().w("Twitter", "Could not call getId on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
            return null;
        }
    }
    
    private Object getInfo() {
        try {
            return AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, this.context);
        }
        catch (final Exception ex) {
            Twitter.getLogger().w("Twitter", "Could not call getAdvertisingIdInfo on com.google.android.gms.ads.identifier.AdvertisingIdClient");
            return null;
        }
    }
    
    private boolean isLimitAdTrackingEnabled() {
        try {
            return (boolean)AdvertisingIdClient$Info.class.getMethod("isLimitAdTrackingEnabled", (Class<?>[])new Class[0]).invoke(this.getInfo(), new Object[0]);
        }
        catch (final Exception ex) {
            Twitter.getLogger().w("Twitter", "Could not call isLimitAdTrackingEnabled on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
            return false;
        }
    }
    
    public AdvertisingInfo getAdvertisingInfo() {
        if (this.isGooglePlayServiceAvailable(this.context)) {
            return new AdvertisingInfo(this.getAdvertisingId(), this.isLimitAdTrackingEnabled());
        }
        return null;
    }
    
    public boolean isGooglePlayServiceAvailable(final Context context) {
        boolean b = false;
        try {
            final String gms_ERROR_DIALOG = GooglePlayServicesUtil.GMS_ERROR_DIALOG;
            if ((int)GooglePlayServicesUtil.class.getMethod("isGooglePlayServicesAvailable", Context.class).invoke(null, context) == 0) {
                b = true;
            }
            return b;
        }
        catch (final Exception ex) {
            return b;
        }
    }
}
