// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal;

import android.text.TextUtils;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.internal.persistence.PreferenceStore;
import android.content.Context;

class AdvertisingInfoProvider
{
    private static final String PREFKEY_ADVERTISING_ID = "advertising_id";
    private static final String PREFKEY_LIMIT_AD_TRACKING = "limit_ad_tracking_enabled";
    private final Context context;
    private final PreferenceStore preferenceStore;
    
    public AdvertisingInfoProvider(final Context context, final PreferenceStore preferenceStore) {
        this.context = context.getApplicationContext();
        this.preferenceStore = preferenceStore;
    }
    
    private AdvertisingInfo getAdvertisingInfoFromStrategies() {
        AdvertisingInfo advertisingInfo = this.getReflectionStrategy().getAdvertisingInfo();
        if (!this.isInfoValid(advertisingInfo)) {
            advertisingInfo = this.getServiceStrategy().getAdvertisingInfo();
            if (!this.isInfoValid(advertisingInfo)) {
                Twitter.getLogger().d("Twitter", "AdvertisingInfo not present");
            }
            else {
                Twitter.getLogger().d("Twitter", "Using AdvertisingInfo from Service Provider");
            }
        }
        else {
            Twitter.getLogger().d("Twitter", "Using AdvertisingInfo from Reflection Provider");
        }
        return advertisingInfo;
    }
    
    private AdvertisingInfo getInfoFromPreferences() {
        return new AdvertisingInfo(this.preferenceStore.get().getString("advertising_id", ""), this.preferenceStore.get().getBoolean("limit_ad_tracking_enabled", false));
    }
    
    private AdvertisingInfoStrategy getReflectionStrategy() {
        return (AdvertisingInfoStrategy)new AdvertisingInfoReflectionStrategy(this.context);
    }
    
    private AdvertisingInfoStrategy getServiceStrategy() {
        return (AdvertisingInfoStrategy)new AdvertisingInfoServiceStrategy(this.context);
    }
    
    private boolean isInfoValid(final AdvertisingInfo advertisingInfo) {
        return advertisingInfo != null && !TextUtils.isEmpty((CharSequence)advertisingInfo.advertisingId);
    }
    
    private void refreshInfoIfNeededAsync(final AdvertisingInfo advertisingInfo) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                final AdvertisingInfo access$000 = AdvertisingInfoProvider.this.getAdvertisingInfoFromStrategies();
                if (!advertisingInfo.equals(access$000)) {
                    Twitter.getLogger().d("Twitter", "Asychronously getting Advertising Info and storing it to preferences");
                    AdvertisingInfoProvider.this.storeInfoToPreferences(access$000);
                }
            }
        }).start();
    }
    
    private void storeInfoToPreferences(final AdvertisingInfo advertisingInfo) {
        if (this.isInfoValid(advertisingInfo)) {
            final PreferenceStore preferenceStore = this.preferenceStore;
            preferenceStore.save(preferenceStore.edit().putString("advertising_id", advertisingInfo.advertisingId).putBoolean("limit_ad_tracking_enabled", advertisingInfo.limitAdTrackingEnabled));
        }
        else {
            final PreferenceStore preferenceStore2 = this.preferenceStore;
            preferenceStore2.save(preferenceStore2.edit().remove("advertising_id").remove("limit_ad_tracking_enabled"));
        }
    }
    
    public AdvertisingInfo getAdvertisingInfo() {
        final AdvertisingInfo infoFromPreferences = this.getInfoFromPreferences();
        if (this.isInfoValid(infoFromPreferences)) {
            Twitter.getLogger().d("Twitter", "Using AdvertisingInfo from Preference Store");
            this.refreshInfoIfNeededAsync(infoFromPreferences);
            return infoFromPreferences;
        }
        final AdvertisingInfo advertisingInfoFromStrategies = this.getAdvertisingInfoFromStrategies();
        this.storeInfoToPreferences(advertisingInfoFromStrategies);
        return advertisingInfoFromStrategies;
    }
}
