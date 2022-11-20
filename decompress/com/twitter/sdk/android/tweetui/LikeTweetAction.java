// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import android.view.View;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.models.Tweet;
import android.view.View$OnClickListener;

class LikeTweetAction extends BaseTweetAction implements View$OnClickListener
{
    public final Tweet tweet;
    public final TweetRepository tweetRepository;
    public final TweetScribeClient tweetScribeClient;
    public final TweetUi tweetUi;
    
    public LikeTweetAction(final Tweet tweet, final TweetUi tweetUi, final Callback<Tweet> callback) {
        this(tweet, tweetUi, callback, (TweetScribeClient)new TweetScribeClientImpl(tweetUi));
    }
    
    public LikeTweetAction(final Tweet tweet, final TweetUi tweetUi, final Callback<Tweet> callback, final TweetScribeClient tweetScribeClient) {
        super((Callback)callback);
        this.tweet = tweet;
        this.tweetUi = tweetUi;
        this.tweetScribeClient = tweetScribeClient;
        this.tweetRepository = tweetUi.getTweetRepository();
    }
    
    public void onClick(final View view) {
        if (view instanceof ToggleImageButton) {
            final ToggleImageButton toggleImageButton = (ToggleImageButton)view;
            if (this.tweet.favorited) {
                this.scribeUnFavoriteAction();
                final TweetRepository tweetRepository = this.tweetRepository;
                final Tweet tweet = this.tweet;
                tweetRepository.unfavorite(tweet.id, (Callback<Tweet>)new LikeTweetAction.LikeTweetAction$LikeCallback(toggleImageButton, tweet, this.getActionCallback()));
            }
            else {
                this.scribeFavoriteAction();
                final TweetRepository tweetRepository2 = this.tweetRepository;
                final Tweet tweet2 = this.tweet;
                tweetRepository2.favorite(tweet2.id, (Callback<Tweet>)new LikeTweetAction.LikeTweetAction$LikeCallback(toggleImageButton, tweet2, this.getActionCallback()));
            }
        }
    }
    
    public void scribeFavoriteAction() {
        this.tweetScribeClient.favorite(this.tweet);
    }
    
    public void scribeUnFavoriteAction() {
        this.tweetScribeClient.unfavorite(this.tweet);
    }
}
