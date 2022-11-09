// 
// Decompiled by Procyon v0.6.0
// 

package com.android.installreferrer.api;

import com.bytedance.covode.number.Covode;

public interface InstallReferrerStateListener
{
    default static {
        Covode.recordClassIndex(2535);
    }
    
    void onInstallReferrerServiceDisconnected();
    
    void onInstallReferrerSetupFinished(final int p0);
}
