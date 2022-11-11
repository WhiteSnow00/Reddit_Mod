// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.drm;

public final class UnsupportedDrmException extends Exception
{
    public static final int REASON_INSTANTIATION_ERROR = 2;
    public static final int REASON_UNSUPPORTED_SCHEME = 1;
    public final int reason;
    
    public UnsupportedDrmException(final int reason) {
        this.reason = reason;
    }
    
    public UnsupportedDrmException(final int reason, final Exception ex) {
        super(ex);
        this.reason = reason;
    }
}
