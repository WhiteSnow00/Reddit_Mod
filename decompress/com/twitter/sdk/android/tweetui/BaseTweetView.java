// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import com.squareup.picasso.m;
import com.twitter.sdk.android.core.models.User;
import com.squareup.picasso.Picasso;
import fd2.b;
import com.twitter.sdk.android.core.internal.UserUtils;
import com.twitter.sdk.android.core.internal.UserUtils$AvatarSize;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.graphics.drawable.Drawable;
import com.twitter.sdk.android.core.models.TweetBuilder;
import com.twitter.sdk.android.core.Callback;
import android.content.res.TypedArray;
import com.twitter.sdk.android.core.models.Tweet;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;
import android.graphics.drawable.ColorDrawable;

public abstract class BaseTweetView extends AbstractTweetView
{
    public ColorDrawable avatarMediaBg;
    public ImageView avatarView;
    public int birdLogoResId;
    public View bottomSeparator;
    public int containerBgColor;
    public ViewGroup quoteTweetHolder;
    public QuoteTweetView quoteTweetView;
    public int retweetIconResId;
    public TextView retweetedByView;
    public TextView timestampView;
    public TweetActionBarView tweetActionBarView;
    public ImageView twitterLogoView;
    
    public BaseTweetView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public BaseTweetView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n, new AbstractTweetView$DependencyProvider());
        this.initXmlAttributes(context, set);
        this.applyStyles();
    }
    
    public BaseTweetView(final Context context, final Tweet tweet) {
        this(context, tweet, AbstractTweetView.DEFAULT_STYLE);
    }
    
    public BaseTweetView(final Context context, final Tweet tweet, final int n) {
        this(context, tweet, n, new AbstractTweetView$DependencyProvider());
    }
    
    public BaseTweetView(final Context context, final Tweet tweet, final int n, final AbstractTweetView$DependencyProvider abstractTweetView$DependencyProvider) {
        super(context, (AttributeSet)null, n, abstractTweetView$DependencyProvider);
        this.initAttributes(n);
        this.applyStyles();
        if (!this.isTweetUiEnabled()) {
            return;
        }
        this.initTweetActions();
        this.setTweet(tweet);
    }
    
    private void initAttributes(final int styleResId) {
        super.styleResId = styleResId;
        final TypedArray obtainStyledAttributes = ((View)this).getContext().getTheme().obtainStyledAttributes(styleResId, R$styleable.tw__TweetView);
        try {
            this.setStyleAttributes(obtainStyledAttributes);
        }
        finally {
            obtainStyledAttributes.recycle();
        }
    }
    
    private void initTweetActions() {
        this.setTweetActionsEnabled(super.tweetActionsEnabled);
        this.tweetActionBarView.setOnActionCallback((Callback<Tweet>)new ResetTweetCallback(this, super.dependencyProvider.getTweetUi().getTweetRepository(), (Callback)null));
    }
    
    private void initXmlAttributes(final Context context, AttributeSet obtainStyledAttributes) {
        if (obtainStyledAttributes == null) {
            return;
        }
        obtainStyledAttributes = (AttributeSet)context.getTheme().obtainStyledAttributes(obtainStyledAttributes, R$styleable.tw__TweetView, 0, 0);
        try {
            this.setXmlDataAttributes((TypedArray)obtainStyledAttributes);
            this.setStyleAttributes((TypedArray)obtainStyledAttributes);
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    private void loadTweet() {
        super.dependencyProvider.getTweetUi().getTweetRepository().loadTweet(this.getTweetId(), (Callback<Tweet>)new BaseTweetView$1(this, this.getTweetId()));
    }
    
    private void setStyleAttributes(final TypedArray typedArray) {
        this.containerBgColor = typedArray.getColor(R$styleable.tw__TweetView_tw__container_bg_color, ((View)this).getResources().getColor(R$color.tw__tweet_light_container_bg_color));
        super.primaryTextColor = typedArray.getColor(R$styleable.tw__TweetView_tw__primary_text_color, ((View)this).getResources().getColor(R$color.tw__tweet_light_primary_text_color));
        super.actionColor = typedArray.getColor(R$styleable.tw__TweetView_tw__action_color, ((View)this).getResources().getColor(R$color.tw__tweet_action_color));
        super.actionHighlightColor = typedArray.getColor(R$styleable.tw__TweetView_tw__action_highlight_color, ((View)this).getResources().getColor(R$color.tw__tweet_action_light_highlight_color));
        super.tweetActionsEnabled = typedArray.getBoolean(R$styleable.tw__TweetView_tw__tweet_actions_enabled, false);
        final boolean lightColor = ColorUtils.isLightColor(this.containerBgColor);
        if (lightColor) {
            super.photoErrorResId = R$drawable.tw__ic_tweet_photo_error_light;
            this.birdLogoResId = R$drawable.tw__ic_logo_blue;
            this.retweetIconResId = R$drawable.tw__ic_retweet_light;
        }
        else {
            super.photoErrorResId = R$drawable.tw__ic_tweet_photo_error_dark;
            this.birdLogoResId = R$drawable.tw__ic_logo_white;
            this.retweetIconResId = R$drawable.tw__ic_retweet_dark;
        }
        double n;
        if (lightColor) {
            n = 0.4;
        }
        else {
            n = 0.35;
        }
        final int n2 = -1;
        int n3;
        if (lightColor) {
            n3 = -1;
        }
        else {
            n3 = -16777216;
        }
        super.secondaryTextColor = ColorUtils.calculateOpacityTransform(n, n3, super.primaryTextColor);
        double n4;
        if (lightColor) {
            n4 = 0.08;
        }
        else {
            n4 = 0.12;
        }
        int n5 = n2;
        if (lightColor) {
            n5 = -16777216;
        }
        super.mediaBgColor = ColorUtils.calculateOpacityTransform(n4, n5, this.containerBgColor);
        this.avatarMediaBg = new ColorDrawable(super.mediaBgColor);
    }
    
    private void setTimestamp(final Tweet tweet) {
        String dotPrefix = null;
        Label_0059: {
            if (tweet != null) {
                final String createdAt = tweet.createdAt;
                if (createdAt != null && TweetDateUtils.isValidTimestamp(createdAt)) {
                    dotPrefix = TweetDateUtils.dotPrefix(TweetDateUtils.getRelativeTimeString(((View)this).getResources(), System.currentTimeMillis(), TweetDateUtils.apiTimeToLong(tweet.createdAt)));
                    break Label_0059;
                }
            }
            dotPrefix = "";
        }
        this.timestampView.setText((CharSequence)dotPrefix);
    }
    
    private void setXmlDataAttributes(final TypedArray typedArray) {
        final long longValue = Utils.numberOrDefault(typedArray.getString(R$styleable.tw__TweetView_tw__tweet_id), -1L);
        if (longValue > 0L) {
            this.setPermalinkUri((String)null, Long.valueOf(longValue));
            super.tweet = new TweetBuilder().setId(longValue).build();
            return;
        }
        throw new IllegalArgumentException("Invalid tw__tweet_id");
    }
    
    public void applyStyles() {
        ((View)this).setBackgroundColor(this.containerBgColor);
        super.fullNameView.setTextColor(super.primaryTextColor);
        super.screenNameView.setTextColor(super.secondaryTextColor);
        super.contentView.setTextColor(super.primaryTextColor);
        super.tweetMediaView.setMediaBgColor(super.mediaBgColor);
        super.tweetMediaView.setPhotoErrorResId(super.photoErrorResId);
        this.avatarView.setImageDrawable((Drawable)this.avatarMediaBg);
        this.timestampView.setTextColor(super.secondaryTextColor);
        this.twitterLogoView.setImageResource(this.birdLogoResId);
        this.retweetedByView.setTextColor(super.secondaryTextColor);
    }
    
    public void findSubviews() {
        super.findSubviews();
        this.avatarView = (ImageView)((View)this).findViewById(R$id.tw__tweet_author_avatar);
        this.timestampView = (TextView)((View)this).findViewById(R$id.tw__tweet_timestamp);
        this.twitterLogoView = (ImageView)((View)this).findViewById(R$id.tw__twitter_logo);
        this.retweetedByView = (TextView)((View)this).findViewById(R$id.tw__tweet_retweeted_by);
        this.tweetActionBarView = (TweetActionBarView)((View)this).findViewById(R$id.tw__tweet_action_bar);
        this.quoteTweetHolder = (ViewGroup)((View)this).findViewById(R$id.quote_tweet_holder);
        this.bottomSeparator = ((View)this).findViewById(R$id.bottom_separator);
    }
    
    public /* bridge */ Tweet getTweet() {
        return super.getTweet();
    }
    
    public /* bridge */ long getTweetId() {
        return super.getTweetId();
    }
    
    public void linkifyProfilePhotoView(final Tweet tweet) {
        if (tweet != null && tweet.user != null) {
            ((View)this.avatarView).setOnClickListener((View$OnClickListener)new BaseTweetView$2(this, tweet));
            ((View)this.avatarView).setOnTouchListener((View$OnTouchListener)new BaseTweetView$3(this));
        }
    }
    
    public void onFinishInflate() {
        super.onFinishInflate();
        if (!this.isTweetUiEnabled()) {
            return;
        }
        this.initTweetActions();
        this.loadTweet();
    }
    
    public void render() {
        super.render();
        final Tweet displayTweet = TweetUtils.getDisplayTweet(super.tweet);
        this.setProfilePhotoView(displayTweet);
        this.linkifyProfilePhotoView(displayTweet);
        this.setTimestamp(displayTweet);
        this.setTweetActions(super.tweet);
        this.showRetweetedBy(super.tweet);
        this.setQuoteTweet(super.tweet);
    }
    
    public void setOnActionCallback(final Callback<Tweet> callback) {
        this.tweetActionBarView.setOnActionCallback((Callback<Tweet>)new ResetTweetCallback(this, super.dependencyProvider.getTweetUi().getTweetRepository(), (Callback)callback));
        this.tweetActionBarView.setTweet(super.tweet);
    }
    
    public void setProfilePhotoView(final Tweet tweet) {
        final Picasso imageLoader = super.dependencyProvider.getImageLoader();
        if (imageLoader == null) {
            return;
        }
        String profileImageUrlHttps = null;
        Label_0042: {
            if (tweet != null) {
                final User user = tweet.user;
                if (user != null) {
                    profileImageUrlHttps = UserUtils.getProfileImageUrlHttps(user, UserUtils$AvatarSize.REASONABLY_SMALL);
                    break Label_0042;
                }
            }
            profileImageUrlHttps = null;
        }
        final m d = imageLoader.d(profileImageUrlHttps);
        d.e = (Drawable)this.avatarMediaBg;
        d.b(this.avatarView, (b)null);
    }
    
    public void setQuoteTweet(final Tweet tweet) {
        this.quoteTweetView = null;
        this.quoteTweetHolder.removeAllViews();
        if (tweet != null && TweetUtils.showQuoteTweet(tweet)) {
            (this.quoteTweetView = new QuoteTweetView(((View)this).getContext())).setStyle(super.primaryTextColor, super.secondaryTextColor, super.actionColor, super.actionHighlightColor, super.mediaBgColor, super.photoErrorResId);
            this.quoteTweetView.setTweet(tweet.quotedStatus);
            this.quoteTweetView.setTweetLinkClickListener(super.tweetLinkClickListener);
            this.quoteTweetView.setTweetMediaClickListener(super.tweetMediaClickListener);
            ((View)this.quoteTweetHolder).setVisibility(0);
            this.quoteTweetHolder.addView((View)this.quoteTweetView);
        }
        else {
            ((View)this.quoteTweetHolder).setVisibility(8);
        }
    }
    
    public /* bridge */ void setTweet(final Tweet tweet) {
        super.setTweet(tweet);
    }
    
    public void setTweetActions(final Tweet tweet) {
        this.tweetActionBarView.setTweet(tweet);
    }
    
    public void setTweetActionsEnabled(final boolean tweetActionsEnabled) {
        super.tweetActionsEnabled = tweetActionsEnabled;
        if (tweetActionsEnabled) {
            ((View)this.tweetActionBarView).setVisibility(0);
            this.bottomSeparator.setVisibility(8);
        }
        else {
            ((View)this.tweetActionBarView).setVisibility(8);
            this.bottomSeparator.setVisibility(0);
        }
    }
    
    public void setTweetLinkClickListener(final TweetLinkClickListener tweetLinkClickListener) {
        super.setTweetLinkClickListener(tweetLinkClickListener);
        final QuoteTweetView quoteTweetView = this.quoteTweetView;
        if (quoteTweetView != null) {
            quoteTweetView.setTweetLinkClickListener(tweetLinkClickListener);
        }
    }
    
    public void setTweetMediaClickListener(final TweetMediaClickListener tweetMediaClickListener) {
        super.setTweetMediaClickListener(tweetMediaClickListener);
        final QuoteTweetView quoteTweetView = this.quoteTweetView;
        if (quoteTweetView != null) {
            quoteTweetView.setTweetMediaClickListener(tweetMediaClickListener);
        }
    }
    
    public void showRetweetedBy(final Tweet tweet) {
        if (tweet != null && tweet.retweetedStatus != null) {
            this.retweetedByView.setText((CharSequence)((View)this).getResources().getString(R$string.tw__retweeted_by_format, new Object[] { tweet.user.name }));
            ((View)this.retweetedByView).setVisibility(0);
        }
        else {
            ((View)this.retweetedByView).setVisibility(8);
        }
    }
}
