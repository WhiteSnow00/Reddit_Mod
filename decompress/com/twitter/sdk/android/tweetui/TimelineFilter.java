// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.models.Tweet;
import java.util.List;

public interface TimelineFilter
{
    List<Tweet> filter(final List<Tweet> p0);
    
    int totalFilters();
}
