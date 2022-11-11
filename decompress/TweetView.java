// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.models.User;
import com.twitter.sdk.android.core.models.Tweet;
import android.util.AttributeSet;
import android.content.Context;

public class TweetView extends BaseTweetView
{
    private static final double DEFAULT_ASPECT_RATIO_MEDIA_CONTAINER = 1.5;
    private static final double SQUARE_ASPECT_RATIO = 1.0;
    private static final String VIEW_TYPE_NAME = "default";
    
    public TweetView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public TweetView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public TweetView(final Context context, final Tweet tweet) {
        super(context, tweet);
    }
    
    public TweetView(final Context context, final Tweet tweet, final int n) {
        super(context, tweet, n);
    }
    
    public TweetView(final Context context, final Tweet tweet, final int n, final AbstractTweetView$DependencyProvider abstractTweetView$DependencyProvider) {
        super(context, tweet, n, abstractTweetView$DependencyProvider);
    }
    
    private void setVerifiedCheck(final Tweet tweet) {
        if (tweet != null) {
            final User user = tweet.user;
            if (user != null && user.verified) {
                ((AbstractTweetView)this).fullNameView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R$drawable.tw__ic_tweet_verified, 0);
                return;
            }
        }
        ((AbstractTweetView)this).fullNameView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }
    
    public double getAspectRatioForPhotoEntity(final int n) {
        if (n == 4) {
            return 1.0;
        }
        return 1.5;
    }
    
    public int getLayout() {
        return R$layout.tw__tweet;
    }
    
    public String getViewTypeName() {
        return "default";
    }
    
    public void render() {
        super.render();
        this.setVerifiedCheck(((AbstractTweetView)this).tweet);
    }
}
