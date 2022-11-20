// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.Callback;

public interface Timeline<T>
{
    void next(final Long p0, final Callback<TimelineResult<T>> p1);
    
    void previous(final Long p0, final Callback<TimelineResult<T>> p1);
}
