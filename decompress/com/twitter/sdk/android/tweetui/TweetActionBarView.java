// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import android.view.View;
import android.view.View$OnClickListener;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageButton;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.core.Callback;
import android.widget.LinearLayout;

public class TweetActionBarView extends LinearLayout
{
    public Callback<Tweet> actionCallback;
    public final DependencyProvider dependencyProvider;
    public ToggleImageButton likeButton;
    public ImageButton shareButton;
    
    public TweetActionBarView(final Context context) {
        this(context, null, new DependencyProvider());
    }
    
    public TweetActionBarView(final Context context, final AttributeSet set) {
        this(context, set, new DependencyProvider());
    }
    
    public TweetActionBarView(final Context context, final AttributeSet set, final DependencyProvider dependencyProvider) {
        super(context, set);
        this.dependencyProvider = dependencyProvider;
    }
    
    public void findSubviews() {
        this.likeButton = (ToggleImageButton)((View)this).findViewById(R$id.tw__tweet_like_button);
        this.shareButton = (ImageButton)((View)this).findViewById(R$id.tw__tweet_share_button);
    }
    
    public void onFinishInflate() {
        super.onFinishInflate();
        this.findSubviews();
    }
    
    public void setLike(final Tweet tweet) {
        final TweetUi tweetUi = this.dependencyProvider.getTweetUi();
        if (tweet != null) {
            this.likeButton.setToggledOn(tweet.favorited);
            ((View)this.likeButton).setOnClickListener((View$OnClickListener)new LikeTweetAction(tweet, tweetUi, this.actionCallback));
        }
    }
    
    public void setOnActionCallback(final Callback<Tweet> actionCallback) {
        this.actionCallback = actionCallback;
    }
    
    public void setShare(final Tweet tweet) {
        final TweetUi tweetUi = this.dependencyProvider.getTweetUi();
        if (tweet != null) {
            ((View)this.shareButton).setOnClickListener((View$OnClickListener)new ShareTweetAction(tweet, tweetUi));
        }
    }
    
    public void setTweet(final Tweet tweet) {
        this.setLike(tweet);
        this.setShare(tweet);
    }
    
    public static class DependencyProvider
    {
        public TweetUi getTweetUi() {
            return TweetUi.getInstance();
        }
    }
}
