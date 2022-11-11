// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import android.view.View;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.models.Tweet;
import android.util.AttributeSet;
import android.content.Context;

public class CompactTweetView extends BaseTweetView
{
    private static final double DEFAULT_ASPECT_RATIO_MEDIA_CONTAINER = 1.6;
    private static final double MAX_LANDSCAPE_ASPECT_RATIO = 3.0;
    private static final double MIN_LANDSCAPE_ASPECT_RATIO = 1.3333333333333333;
    private static final double SQUARE_ASPECT_RATIO = 1.0;
    private static final String VIEW_TYPE_NAME = "compact";
    
    public CompactTweetView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public CompactTweetView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public CompactTweetView(final Context context, final Tweet tweet) {
        super(context, tweet);
    }
    
    public CompactTweetView(final Context context, final Tweet tweet, final int n) {
        super(context, tweet, n);
    }
    
    public CompactTweetView(final Context context, final Tweet tweet, final int n, final AbstractTweetView$DependencyProvider abstractTweetView$DependencyProvider) {
        super(context, tweet, n, abstractTweetView$DependencyProvider);
    }
    
    public void applyStyles() {
        super.applyStyles();
        ((View)this).setPadding(0, ((View)this).getResources().getDimensionPixelSize(R$dimen.tw__compact_tweet_container_padding_top), 0, 0);
        final int dimensionPixelSize = ((View)this).getResources().getDimensionPixelSize(R$dimen.tw__media_view_radius);
        ((AbstractTweetView)this).tweetMediaView.setRoundedCornersRadii(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
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
        return R$layout.tw__tweet_compact;
    }
    
    public String getViewTypeName() {
        return "compact";
    }
    
    public void render() {
        super.render();
        ((View)((AbstractTweetView)this).screenNameView).requestLayout();
    }
}
