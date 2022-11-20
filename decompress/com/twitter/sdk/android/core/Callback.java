// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core;

import ku2.w;
import ku2.b;
import ku2.d;

public abstract class Callback<T> implements d<T>
{
    public abstract void failure(final TwitterException p0);
    
    public final void onFailure(final b<T> b, final Throwable t) {
        this.failure(new TwitterException("Request Failure", t));
    }
    
    public final void onResponse(final b<T> b, final w<T> w) {
        if (w.c()) {
            this.success((Result<T>)new Result(w.b, (w)w));
        }
        else {
            this.failure(new TwitterApiException(w));
        }
    }
    
    public abstract void success(final Result<T> p0);
}
