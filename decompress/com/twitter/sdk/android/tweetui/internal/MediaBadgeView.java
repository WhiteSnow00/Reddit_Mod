// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui.internal;

import com.twitter.sdk.android.core.models.VideoInfo;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.tweetui.R$drawable;
import com.twitter.sdk.android.core.internal.VineCardUtils;
import com.twitter.sdk.android.core.models.Card;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.twitter.sdk.android.tweetui.R$id;
import android.view.ViewGroup;
import com.twitter.sdk.android.tweetui.R$layout;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.FrameLayout;

public class MediaBadgeView extends FrameLayout
{
    public ImageView badge;
    public TextView videoDuration;
    
    public MediaBadgeView(final Context context) {
        this(context, null);
    }
    
    public MediaBadgeView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public MediaBadgeView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.initSubViews(context);
    }
    
    public void initSubViews(final Context context) {
        final View inflate = ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(R$layout.tw__media_badge, (ViewGroup)this, true);
        this.videoDuration = (TextView)inflate.findViewById(R$id.tw__video_duration);
        this.badge = (ImageView)inflate.findViewById(R$id.tw__gif_badge);
    }
    
    public void setBadge(final Drawable imageDrawable) {
        this.badge.setVisibility(0);
        ((View)this.videoDuration).setVisibility(8);
        this.badge.setImageDrawable(imageDrawable);
    }
    
    public void setCard(final Card card) {
        if (VineCardUtils.isVine(card)) {
            this.setBadge(((View)this).getResources().getDrawable(R$drawable.tw__vine_badge));
        }
        else {
            this.setEmpty();
        }
    }
    
    public void setEmpty() {
        ((View)this.videoDuration).setVisibility(8);
        this.badge.setVisibility(8);
    }
    
    public void setMediaEntity(final MediaEntity mediaEntity) {
        if ("animated_gif".equals(mediaEntity.type)) {
            this.setBadge(((View)this).getResources().getDrawable(R$drawable.tw__gif_badge));
        }
        else if ("video".equals(mediaEntity.type)) {
            final VideoInfo videoInfo = mediaEntity.videoInfo;
            long durationMillis;
            if (videoInfo == null) {
                durationMillis = 0L;
            }
            else {
                durationMillis = videoInfo.durationMillis;
            }
            this.setText(durationMillis);
        }
        else {
            this.setEmpty();
        }
    }
    
    public void setText(final long n) {
        ((View)this.videoDuration).setVisibility(0);
        this.badge.setVisibility(8);
        this.videoDuration.setText((CharSequence)MediaTimeUtils.getPlaybackTime(n));
    }
}
