// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import java.util.List;

public class TimelineResult<T>
{
    public final List<T> items;
    public final TimelineCursor timelineCursor;
    
    public TimelineResult(final TimelineCursor timelineCursor, final List<T> items) {
        this.timelineCursor = timelineCursor;
        this.items = items;
    }
}
