// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui.internal;

import android.view.ViewGroup;
import android.view.View$OnTouchListener;
import com.squareup.picasso.Picasso$LoadedFrom;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.content.Context;
import android.widget.ProgressBar;
import com.squareup.picasso.p;
import android.widget.FrameLayout;

public class GalleryImageView extends FrameLayout implements p
{
    public final MultiTouchImageView imageView;
    public final ProgressBar progressBar;
    
    public GalleryImageView(final Context context) {
        this(context, new MultiTouchImageView(context), new ProgressBar(context));
    }
    
    public GalleryImageView(final Context context, final MultiTouchImageView imageView, final ProgressBar progressBar) {
        super(context);
        this.imageView = imageView;
        ((View)(this.progressBar = progressBar)).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2, 17));
        ((ViewGroup)this).addView((View)progressBar);
        ((View)imageView).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1, 17));
        ((ViewGroup)this).addView((View)imageView);
    }
    
    public void onBitmapFailed(final Drawable drawable) {
    }
    
    public void onBitmapLoaded(final Bitmap imageBitmap, final Picasso$LoadedFrom picasso$LoadedFrom) {
        this.imageView.setImageBitmap(imageBitmap);
        ((View)this.progressBar).setVisibility(8);
    }
    
    public void onPrepareLoad(final Drawable drawable) {
        this.imageView.setImageResource(17170445);
        ((View)this.progressBar).setVisibility(0);
    }
    
    public void setSwipeToDismissCallback(final SwipeToDismissTouchListener$Callback swipeToDismissTouchListener$Callback) {
        ((View)this.imageView).setOnTouchListener((View$OnTouchListener)SwipeToDismissTouchListener.createFromView((View)this.imageView, swipeToDismissTouchListener$Callback));
    }
}
