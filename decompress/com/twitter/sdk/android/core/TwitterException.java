// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core;

public class TwitterException extends RuntimeException
{
    public TwitterException(final String s) {
        super(s);
    }
    
    public TwitterException(final String s, final Throwable t) {
        super(s, t);
    }
}
