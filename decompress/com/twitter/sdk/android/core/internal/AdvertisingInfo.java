// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal;

class AdvertisingInfo
{
    public final String advertisingId;
    public final boolean limitAdTrackingEnabled;
    
    public AdvertisingInfo(final String advertisingId, final boolean limitAdTrackingEnabled) {
        this.advertisingId = advertisingId;
        this.limitAdTrackingEnabled = limitAdTrackingEnabled;
    }
}
