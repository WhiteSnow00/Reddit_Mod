// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.core.Callback;

class ResetTweetCallback extends Callback<Tweet>
{
    public final BaseTweetView baseTweetView;
    public final Callback<Tweet> cb;
    public final TweetRepository tweetRepository;
    
    public ResetTweetCallback(final BaseTweetView baseTweetView, final TweetRepository tweetRepository, final Callback<Tweet> cb) {
        this.baseTweetView = baseTweetView;
        this.tweetRepository = tweetRepository;
        this.cb = cb;
    }
    
    public void failure(final TwitterException ex) {
        final Callback<Tweet> cb = this.cb;
        if (cb != null) {
            cb.failure(ex);
        }
    }
    
    public void success(final Result<Tweet> result) {
        this.tweetRepository.updateCache((Tweet)result.data);
        this.baseTweetView.setTweet((Tweet)result.data);
        final Callback<Tweet> cb = this.cb;
        if (cb != null) {
            cb.success((Result)result);
        }
    }
}
