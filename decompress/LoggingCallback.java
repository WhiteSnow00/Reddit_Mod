// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.Logger;
import com.twitter.sdk.android.core.Callback;

abstract class LoggingCallback<T> extends Callback<T>
{
    private final Callback cb;
    private final Logger logger;
    
    public LoggingCallback(final Callback cb, final Logger logger) {
        this.cb = cb;
        this.logger = logger;
    }
    
    public void failure(final TwitterException ex) {
        this.logger.e("TweetUi", ex.getMessage(), (Throwable)ex);
        final Callback cb = this.cb;
        if (cb != null) {
            cb.failure(ex);
        }
    }
}
