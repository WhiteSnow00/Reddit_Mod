// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import android.view.View;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.core.models.MediaEntity;
import android.util.AttributeSet;
import android.content.Context;

public class QuoteTweetView extends AbstractTweetView
{
    private static final double DEFAULT_ASPECT_RATIO_MEDIA_CONTAINER = 1.6;
    private static final double MAX_LANDSCAPE_ASPECT_RATIO = 3.0;
    private static final double MIN_LANDSCAPE_ASPECT_RATIO = 1.3333333333333333;
    private static final double SQUARE_ASPECT_RATIO = 1.0;
    private static final String VIEW_TYPE_NAME = "quote";
    
    public QuoteTweetView(final Context context) {
        this(context, new AbstractTweetView$DependencyProvider());
    }
    
    public QuoteTweetView(final Context context, final AbstractTweetView$DependencyProvider abstractTweetView$DependencyProvider) {
        super(context, (AttributeSet)null, 0, abstractTweetView$DependencyProvider);
    }
    
    public void applyStyles() {
        final int dimensionPixelSize = ((View)this).getResources().getDimensionPixelSize(R$dimen.tw__media_view_radius);
        super.tweetMediaView.setRoundedCornersRadii(0, 0, dimensionPixelSize, dimensionPixelSize);
        ((View)this).setBackgroundResource(R$drawable.tw__quote_tweet_border);
        super.fullNameView.setTextColor(super.primaryTextColor);
        super.screenNameView.setTextColor(super.secondaryTextColor);
        super.contentView.setTextColor(super.primaryTextColor);
        super.tweetMediaView.setMediaBgColor(super.mediaBgColor);
        super.tweetMediaView.setPhotoErrorResId(super.photoErrorResId);
    }
    
    public double getAspectRatio(final MediaEntity mediaEntity) {
        final double aspectRatio = super.getAspectRatio(mediaEntity);
        if (aspectRatio <= 1.0) {
            return 1.0;
        }
        if (aspectRatio > 3.0) {
            return 3.0;
        }
        if (aspectRatio < 1.3333333333333333) {
            return 1.3333333333333333;
        }
        return aspectRatio;
    }
    
    public double getAspectRatioForPhotoEntity(final int n) {
        return 1.6;
    }
    
    public int getLayout() {
        return R$layout.tw__tweet_quote;
    }
    
    public /* bridge */ Tweet getTweet() {
        return super.getTweet();
    }
    
    public /* bridge */ long getTweetId() {
        return super.getTweetId();
    }
    
    public String getViewTypeName() {
        return "quote";
    }
    
    public void render() {
        super.render();
        ((View)super.screenNameView).requestLayout();
    }
    
    public void setStyle(final int primaryTextColor, final int secondaryTextColor, final int actionColor, final int actionHighlightColor, final int mediaBgColor, final int photoErrorResId) {
        super.primaryTextColor = primaryTextColor;
        super.secondaryTextColor = secondaryTextColor;
        super.actionColor = actionColor;
        super.actionHighlightColor = actionHighlightColor;
        super.mediaBgColor = mediaBgColor;
        super.photoErrorResId = photoErrorResId;
        this.applyStyles();
    }
    
    public /* bridge */ void setTweet(final Tweet tweet) {
        super.setTweet(tweet);
    }
    
    public /* bridge */ void setTweetLinkClickListener(final TweetLinkClickListener tweetLinkClickListener) {
        super.setTweetLinkClickListener(tweetLinkClickListener);
    }
    
    public /* bridge */ void setTweetMediaClickListener(final TweetMediaClickListener tweetMediaClickListener) {
        super.setTweetMediaClickListener(tweetMediaClickListener);
    }
}
