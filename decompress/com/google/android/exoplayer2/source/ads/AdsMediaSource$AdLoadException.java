// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source.ads;

import ad.d0;
import al0.f0;
import java.io.IOException;

public final class AdsMediaSource$AdLoadException extends IOException
{
    public static final int TYPE_AD = 0;
    public static final int TYPE_AD_GROUP = 1;
    public static final int TYPE_ALL_ADS = 2;
    public static final int TYPE_UNEXPECTED = 3;
    public final int type;
    
    public AdsMediaSource$AdLoadException(final int type, final Exception ex) {
        super(ex);
        this.type = type;
    }
    
    public static AdsMediaSource$AdLoadException createForAd(final Exception ex) {
        return new AdsMediaSource$AdLoadException(0, ex);
    }
    
    public static AdsMediaSource$AdLoadException createForAdGroup(final Exception ex, final int n) {
        return new AdsMediaSource$AdLoadException(1, new IOException(f0.f(35, "Failed to load ad group ", n), ex));
    }
    
    public static AdsMediaSource$AdLoadException createForAllAds(final Exception ex) {
        return new AdsMediaSource$AdLoadException(2, ex);
    }
    
    public static AdsMediaSource$AdLoadException createForUnexpected(final RuntimeException ex) {
        return new AdsMediaSource$AdLoadException(3, ex);
    }
    
    public RuntimeException getRuntimeExceptionForUnexpected() {
        d0.f(this.type == 3);
        final Throwable cause = this.getCause();
        cause.getClass();
        return (RuntimeException)cause;
    }
}
