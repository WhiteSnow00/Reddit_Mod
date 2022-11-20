// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core;

public class TwitterAuthException extends TwitterException
{
    private static final long serialVersionUID = 577033016879783994L;
    
    public TwitterAuthException(final String s) {
        super(s);
    }
    
    public TwitterAuthException(final String s, final Throwable t) {
        super(s, t);
    }
}
