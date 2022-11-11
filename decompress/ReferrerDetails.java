// 
// Decompiled by Procyon v0.6.0
// 

package com.android.installreferrer.api;

import com.bytedance.covode.number.Covode;
import android.os.Bundle;

public class ReferrerDetails
{
    public final Bundle mOriginalBundle;
    
    static {
        Covode.recordClassIndex(2536);
    }
    
    public ReferrerDetails(final Bundle mOriginalBundle) {
        this.mOriginalBundle = mOriginalBundle;
    }
    
    public boolean getGooglePlayInstantParam() {
        return this.mOriginalBundle.getBoolean("google_play_instant");
    }
    
    public long getInstallBeginTimestampSeconds() {
        return this.mOriginalBundle.getLong("install_begin_timestamp_seconds");
    }
    
    public long getInstallBeginTimestampServerSeconds() {
        return this.mOriginalBundle.getLong("install_begin_timestamp_server_seconds");
    }
    
    public String getInstallReferrer() {
        return this.mOriginalBundle.getString("install_referrer");
    }
    
    public String getInstallVersion() {
        return this.mOriginalBundle.getString("install_version");
    }
    
    public long getReferrerClickTimestampSeconds() {
        return this.mOriginalBundle.getLong("referrer_click_timestamp_seconds");
    }
    
    public long getReferrerClickTimestampServerSeconds() {
        return this.mOriginalBundle.getLong("referrer_click_timestamp_server_seconds");
    }
}
