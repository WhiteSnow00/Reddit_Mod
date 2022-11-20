// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.net;

public abstract class QuicException extends NetworkException
{
    public QuicException(final String s, final Throwable t) {
        super(s, t);
    }
    
    public abstract int getQuicDetailedErrorCode();
}
