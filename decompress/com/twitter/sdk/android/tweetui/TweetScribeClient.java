// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.models.Tweet;

public interface TweetScribeClient
{
    void click(final Tweet p0, final String p1);
    
    void favorite(final Tweet p0);
    
    void impression(final Tweet p0, final String p1, final boolean p2);
    
    void share(final Tweet p0);
    
    void unfavorite(final Tweet p0);
}
