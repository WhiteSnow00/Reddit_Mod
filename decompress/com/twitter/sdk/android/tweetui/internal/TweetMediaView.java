// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui.internal;

import com.twitter.sdk.android.tweetui.TweetUi;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.m;
import com.squareup.picasso.Picasso;
import fd2.b;
import com.twitter.sdk.android.tweetui.R$string;
import android.text.TextUtils;
import android.graphics.Path$Direction;
import android.view.View$MeasureSpec;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import com.twitter.sdk.android.tweetui.PlayerActivity$PlayerItem;
import com.twitter.sdk.android.tweetui.PlayerActivity;
import com.twitter.sdk.android.core.IntentUtils;
import java.io.Serializable;
import com.twitter.sdk.android.tweetui.GalleryActivity$GalleryItem;
import android.content.Intent;
import com.twitter.sdk.android.tweetui.GalleryActivity;
import com.twitter.sdk.android.core.models.ImageValue;
import android.widget.ImageView;
import com.twitter.sdk.android.core.internal.VineCardUtils;
import com.twitter.sdk.android.core.models.Card;
import ph0.a;
import com.twitter.sdk.android.tweetui.R$id;
import android.view.View;
import android.graphics.Canvas;
import com.twitter.sdk.android.tweetui.R$drawable;
import com.twitter.sdk.android.tweetui.R$dimen;
import java.util.Collections;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.sdk.android.tweetui.TweetMediaClickListener;
import com.twitter.sdk.android.core.models.Tweet;
import android.graphics.RectF;
import android.graphics.Path;
import com.twitter.sdk.android.core.models.MediaEntity;
import java.util.List;
import android.view.View$OnClickListener;
import android.view.ViewGroup;

public class TweetMediaView extends ViewGroup implements View$OnClickListener
{
    public static final int MAX_IMAGE_VIEW_COUNT = 4;
    public static final String SIZED_IMAGE_SMALL = ":small";
    public final DependencyProvider dependencyProvider;
    private int imageCount;
    private final OverlayImageView[] imageViews;
    public boolean internalRoundedCornersEnabled;
    public int mediaBgColor;
    private final int mediaDividerSize;
    private List<MediaEntity> mediaEntities;
    private final Path path;
    public int photoErrorResId;
    public final float[] radii;
    private final RectF rect;
    public Tweet tweet;
    public TweetMediaClickListener tweetMediaClickListener;
    
    public TweetMediaView(final Context context) {
        this(context, null);
    }
    
    public TweetMediaView(final Context context, final AttributeSet set) {
        this(context, set, new DependencyProvider());
    }
    
    public TweetMediaView(final Context context, final AttributeSet set, final DependencyProvider dependencyProvider) {
        super(context, set);
        this.imageViews = new OverlayImageView[4];
        this.mediaEntities = Collections.emptyList();
        this.path = new Path();
        this.rect = new RectF();
        this.radii = new float[8];
        this.mediaBgColor = -16777216;
        this.dependencyProvider = dependencyProvider;
        this.mediaDividerSize = ((View)this).getResources().getDimensionPixelSize(R$dimen.tw__media_view_divider_size);
        this.photoErrorResId = R$drawable.tw__ic_tweet_photo_error_dark;
    }
    
    public void clearImageViews() {
        for (int i = 0; i < this.imageCount; ++i) {
            final OverlayImageView overlayImageView = this.imageViews[i];
            if (overlayImageView != null) {
                overlayImageView.setVisibility(8);
            }
        }
        this.imageCount = 0;
    }
    
    public void dispatchDraw(final Canvas canvas) {
        if (this.internalRoundedCornersEnabled) {
            final int save = canvas.save();
            canvas.clipPath(this.path);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        else {
            super.dispatchDraw(canvas);
        }
    }
    
    public OverlayImageView getOrCreateImageView(final int n) {
        OverlayImageView overlayImageView = this.imageViews[n];
        if (overlayImageView == null) {
            overlayImageView = new OverlayImageView(((View)this).getContext());
            ((View)overlayImageView).setLayoutParams(this.generateDefaultLayoutParams());
            ((View)overlayImageView).setOnClickListener((View$OnClickListener)this);
            this.addView((View)(this.imageViews[n] = overlayImageView), n);
        }
        else {
            this.measureImageView(n, 0, 0);
            this.layoutImage(n, 0, 0, 0, 0);
        }
        ((View)overlayImageView).setVisibility(0);
        ((View)overlayImageView).setBackgroundColor(this.mediaBgColor);
        ((View)overlayImageView).setTag(R$id.tw__entity_index, (Object)n);
        return overlayImageView;
    }
    
    public String getSizedImagePath(final MediaEntity mediaEntity) {
        if (this.imageCount > 1) {
            return a.f(new StringBuilder(), mediaEntity.mediaUrlHttps, ":small");
        }
        return mediaEntity.mediaUrlHttps;
    }
    
    public void initializeImageViews(final Card card) {
        this.imageCount = 1;
        final OverlayImageView orCreateImageView = this.getOrCreateImageView(0);
        final ImageValue imageValue = VineCardUtils.getImageValue(card);
        this.setAltText(orCreateImageView, imageValue.alt);
        this.setMediaImage(orCreateImageView, imageValue.url);
        this.setOverlayImage(orCreateImageView, true);
    }
    
    public void initializeImageViews(final List<MediaEntity> list) {
        this.imageCount = Math.min(4, list.size());
        for (int i = 0; i < this.imageCount; ++i) {
            final OverlayImageView orCreateImageView = this.getOrCreateImageView(i);
            final MediaEntity mediaEntity = list.get(i);
            this.setAltText(orCreateImageView, mediaEntity.altText);
            this.setMediaImage(orCreateImageView, this.getSizedImagePath(mediaEntity));
            this.setOverlayImage(orCreateImageView, TweetMediaUtils.isVideoType(mediaEntity));
        }
    }
    
    public void launchPhotoGallery(final int n) {
        final Intent intent = new Intent(((View)this).getContext(), (Class)GalleryActivity.class);
        intent.putExtra("GALLERY_ITEM", (Serializable)new GalleryActivity$GalleryItem(this.tweet.id, n, (List)this.mediaEntities));
        IntentUtils.safeStartActivity(((View)this).getContext(), intent);
    }
    
    public void launchVideoPlayer(final MediaEntity mediaEntity) {
        if (TweetMediaUtils.getSupportedVariant(mediaEntity) != null) {
            final Intent intent = new Intent(((View)this).getContext(), (Class)PlayerActivity.class);
            intent.putExtra("PLAYER_ITEM", (Serializable)new PlayerActivity$PlayerItem(TweetMediaUtils.getSupportedVariant(mediaEntity).url, TweetMediaUtils.isLooping(mediaEntity), TweetMediaUtils.showVideoControls(mediaEntity), (String)null, (String)null));
            IntentUtils.safeStartActivity(((View)this).getContext(), intent);
        }
    }
    
    public void launchVideoPlayer(final Tweet tweet) {
        final Card card = tweet.card;
        final Intent intent = new Intent(((View)this).getContext(), (Class)PlayerActivity.class);
        intent.putExtra("PLAYER_ITEM", (Serializable)new PlayerActivity$PlayerItem(VineCardUtils.getStreamUrl(card), true, false, (String)null, (String)null));
        intent.putExtra("SCRIBE_ITEM", (Serializable)ScribeItem.fromTweetCard(tweet.id, card));
        IntentUtils.safeStartActivity(((View)this).getContext(), intent);
    }
    
    public void layoutImage(final int n, final int n2, final int n3, final int n4, final int n5) {
        final OverlayImageView overlayImageView = this.imageViews[n];
        if (((View)overlayImageView).getLeft() == n2 && ((View)overlayImageView).getTop() == n3 && ((View)overlayImageView).getRight() == n4 && ((View)overlayImageView).getBottom() == n5) {
            return;
        }
        ((View)overlayImageView).layout(n2, n3, n4, n5);
    }
    
    public void layoutImages() {
        final int measuredWidth = ((View)this).getMeasuredWidth();
        final int measuredHeight = ((View)this).getMeasuredHeight();
        final int mediaDividerSize = this.mediaDividerSize;
        final int n = (measuredWidth - mediaDividerSize) / 2;
        final int n2 = (measuredHeight - mediaDividerSize) / 2;
        final int n3 = n + mediaDividerSize;
        final int imageCount = this.imageCount;
        if (imageCount != 1) {
            if (imageCount != 2) {
                if (imageCount != 3) {
                    if (imageCount == 4) {
                        this.layoutImage(0, 0, 0, n, n2);
                        this.layoutImage(2, 0, n2 + this.mediaDividerSize, n, measuredHeight);
                        this.layoutImage(1, n3, 0, measuredWidth, n2);
                        this.layoutImage(3, n3, n2 + this.mediaDividerSize, measuredWidth, measuredHeight);
                    }
                }
                else {
                    this.layoutImage(0, 0, 0, n, measuredHeight);
                    this.layoutImage(1, n3, 0, measuredWidth, n2);
                    this.layoutImage(2, n3, n2 + this.mediaDividerSize, measuredWidth, measuredHeight);
                }
            }
            else {
                this.layoutImage(0, 0, 0, n, measuredHeight);
                this.layoutImage(1, n + this.mediaDividerSize, 0, measuredWidth, measuredHeight);
            }
        }
        else {
            this.layoutImage(0, 0, 0, measuredWidth, measuredHeight);
        }
    }
    
    public void measureImageView(final int n, final int n2, final int n3) {
        ((View)this.imageViews[n]).measure(View$MeasureSpec.makeMeasureSpec(n2, 1073741824), View$MeasureSpec.makeMeasureSpec(n3, 1073741824));
    }
    
    public Size measureImages(int size, int n) {
        size = View$MeasureSpec.getSize(size);
        final int size2 = View$MeasureSpec.getSize(n);
        final int mediaDividerSize = this.mediaDividerSize;
        n = (size - mediaDividerSize) / 2;
        final int n2 = (size2 - mediaDividerSize) / 2;
        final int imageCount = this.imageCount;
        if (imageCount != 1) {
            if (imageCount != 2) {
                if (imageCount != 3) {
                    if (imageCount == 4) {
                        this.measureImageView(0, n, n2);
                        this.measureImageView(1, n, n2);
                        this.measureImageView(2, n, n2);
                        this.measureImageView(3, n, n2);
                    }
                }
                else {
                    this.measureImageView(0, n, size2);
                    this.measureImageView(1, n, n2);
                    this.measureImageView(2, n, n2);
                }
            }
            else {
                this.measureImageView(0, n, size2);
                this.measureImageView(1, n, size2);
            }
        }
        else {
            this.measureImageView(0, size, size2);
        }
        return Size.fromSize(size, size2);
    }
    
    public void onClick(final View view) {
        final Integer n = (Integer)view.getTag(R$id.tw__entity_index);
        if (this.tweetMediaClickListener != null) {
            MediaEntity mediaEntity;
            if (!this.mediaEntities.isEmpty()) {
                mediaEntity = this.mediaEntities.get(n);
            }
            else {
                mediaEntity = null;
            }
            this.tweetMediaClickListener.onMediaEntityClick(this.tweet, mediaEntity);
        }
        else if (!this.mediaEntities.isEmpty()) {
            final MediaEntity mediaEntity2 = this.mediaEntities.get(n);
            if (TweetMediaUtils.isVideoType(mediaEntity2)) {
                this.launchVideoPlayer(mediaEntity2);
            }
            else if (TweetMediaUtils.isPhotoType(mediaEntity2)) {
                this.launchPhotoGallery(n);
            }
        }
        else {
            this.launchVideoPlayer(this.tweet);
        }
    }
    
    public void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        if (this.imageCount > 0) {
            this.layoutImages();
        }
    }
    
    public void onMeasure(final int n, final int n2) {
        Size size;
        if (this.imageCount > 0) {
            size = this.measureImages(n, n2);
        }
        else {
            size = Size.EMPTY;
        }
        ((View)this).setMeasuredDimension(size.width, size.height);
    }
    
    public void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.path.reset();
        this.rect.set(0.0f, 0.0f, (float)n, (float)n2);
        this.path.addRoundRect(this.rect, this.radii, Path$Direction.CW);
        this.path.close();
    }
    
    public void setAltText(final ImageView imageView, final String contentDescription) {
        if (!TextUtils.isEmpty((CharSequence)contentDescription)) {
            ((View)imageView).setContentDescription((CharSequence)contentDescription);
        }
        else {
            ((View)imageView).setContentDescription((CharSequence)((View)this).getResources().getString(R$string.tw__tweet_media));
        }
    }
    
    public void setMediaBgColor(final int mediaBgColor) {
        this.mediaBgColor = mediaBgColor;
    }
    
    public void setMediaImage(final ImageView imageView, final String s) {
        final Picasso imageLoader = this.dependencyProvider.getImageLoader();
        if (imageLoader == null) {
            return;
        }
        final m d = imageLoader.d(s);
        d.c = true;
        d.b.e = true;
        final int photoErrorResId = this.photoErrorResId;
        if (photoErrorResId != 0) {
            d.d = photoErrorResId;
            d.b(imageView, (b)new TweetMediaView.TweetMediaView$PicassoCallback(imageView));
            return;
        }
        throw new IllegalArgumentException("Error image resource invalid.");
    }
    
    public void setOverlayImage(final OverlayImageView overlayImageView, final boolean b) {
        if (b) {
            overlayImageView.setOverlayDrawable(((View)this).getContext().getResources().getDrawable(R$drawable.tw__player_overlay));
        }
        else {
            overlayImageView.setOverlayDrawable(null);
        }
    }
    
    public void setPhotoErrorResId(final int photoErrorResId) {
        this.photoErrorResId = photoErrorResId;
    }
    
    public void setRoundedCornersRadii(final int n, final int n2, final int n3, final int n4) {
        final float[] radii = this.radii;
        radii[1] = (radii[0] = (float)n);
        radii[3] = (radii[2] = (float)n2);
        radii[5] = (radii[4] = (float)n3);
        radii[7] = (radii[6] = (float)n4);
        ((View)this).requestLayout();
    }
    
    public void setTweetMediaClickListener(final TweetMediaClickListener tweetMediaClickListener) {
        this.tweetMediaClickListener = tweetMediaClickListener;
    }
    
    public void setTweetMediaEntities(final Tweet tweet, final List<MediaEntity> mediaEntities) {
        if (tweet != null && mediaEntities != null && !mediaEntities.isEmpty()) {
            if (!mediaEntities.equals(this.mediaEntities)) {
                this.tweet = tweet;
                this.mediaEntities = mediaEntities;
                this.clearImageViews();
                this.initializeImageViews(mediaEntities);
                if (TweetMediaUtils.isPhotoType(mediaEntities.get(0))) {
                    this.internalRoundedCornersEnabled = true;
                }
                else {
                    this.internalRoundedCornersEnabled = false;
                }
                ((View)this).requestLayout();
            }
        }
    }
    
    public void setVineCard(final Tweet tweet) {
        if (tweet != null) {
            final Card card = tweet.card;
            if (card != null) {
                if (VineCardUtils.isVine(card)) {
                    this.tweet = tweet;
                    this.mediaEntities = Collections.emptyList();
                    this.clearImageViews();
                    this.initializeImageViews(tweet.card);
                    this.internalRoundedCornersEnabled = false;
                    ((View)this).requestLayout();
                }
            }
        }
    }
    
    public static class DependencyProvider
    {
        public Picasso getImageLoader() {
            return TweetUi.getInstance().getImageLoader();
        }
    }
    
    public static class Size
    {
        public static final Size EMPTY;
        public final int height;
        public final int width;
        
        static {
            EMPTY = new Size();
        }
        
        private Size() {
            this(0, 0);
        }
        
        private Size(final int width, final int height) {
            this.width = width;
            this.height = height;
        }
        
        public static Size fromSize(int max, int max2) {
            max = Math.max(max, 0);
            max2 = Math.max(max2, 0);
            Size empty;
            if (max == 0 && max2 == 0) {
                empty = Size.EMPTY;
            }
            else {
                empty = new Size(max, max2);
            }
            return empty;
        }
    }
}
