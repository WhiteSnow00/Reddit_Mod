// 
// Decompiled by Procyon v0.6.0
// 

package com.android.installreferrer.api;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public abstract class InstallReferrerClient
{
    static {
        Covode.recordClassIndex(2528);
    }
    
    public static Builder newBuilder(final Context context) {
        return new Builder(context, null);
    }
    
    public abstract void endConnection();
    
    public abstract ReferrerDetails getInstallReferrer();
    
    public abstract boolean isReady();
    
    public abstract void startConnection(final InstallReferrerStateListener p0);
    
    public static final class Builder
    {
        public final Context mContext;
        
        static {
            Covode.recordClassIndex(2530);
        }
        
        public Builder(final Context mContext) {
            this.mContext = mContext;
        }
        
        public final InstallReferrerClient build() {
            final Context mContext = this.mContext;
            if (mContext != null) {
                return new InstallReferrerClientImpl(mContext);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }
}
