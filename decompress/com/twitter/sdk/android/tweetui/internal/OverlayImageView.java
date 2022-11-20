// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui.internal;

import android.view.View;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.widget.ImageView;

public class OverlayImageView extends ImageView
{
    public Overlay overlay;
    
    public OverlayImageView(final Context context) {
        super(context);
        this.overlay = new Overlay(null);
    }
    
    public OverlayImageView(final Context context, final AttributeSet set) {
        super(context, set);
        this.overlay = new Overlay(null);
    }
    
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.overlay.setDrawableState(((View)this).getDrawableState());
    }
    
    public void invalidateDrawable(final Drawable drawable) {
        if (drawable == this.overlay.drawable) {
            ((View)this).invalidate();
        }
        else {
            super.invalidateDrawable(drawable);
        }
    }
    
    public void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        this.overlay.draw(canvas);
    }
    
    public void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        this.overlay.setDrawableBounds(((View)this).getMeasuredWidth(), ((View)this).getMeasuredHeight());
    }
    
    public void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.overlay.setDrawableBounds(n, n2);
    }
    
    public void setOverlayDrawable(final Drawable drawable) {
        final Overlay overlay = this.overlay;
        if (drawable != overlay.drawable) {
            overlay.cleanupDrawable(this);
            if (drawable != null) {
                drawable.setCallback((Drawable$Callback)this);
            }
            (this.overlay = new Overlay(drawable)).setDrawableState(((View)this).getDrawableState());
            ((View)this).requestLayout();
        }
    }
    
    public static class Overlay
    {
        public final Drawable drawable;
        
        public Overlay(final Drawable drawable) {
            this.drawable = drawable;
        }
        
        public void cleanupDrawable(final ImageView imageView) {
            final Drawable drawable = this.drawable;
            if (drawable != null) {
                drawable.setCallback((Drawable$Callback)null);
                ((View)imageView).unscheduleDrawable(this.drawable);
            }
        }
        
        public void draw(final Canvas canvas) {
            final Drawable drawable = this.drawable;
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }
        
        public void setDrawableBounds(final int n, final int n2) {
            final Drawable drawable = this.drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, n, n2);
            }
        }
        
        public void setDrawableState(final int[] state) {
            final Drawable drawable = this.drawable;
            if (drawable != null && drawable.isStateful()) {
                this.drawable.setState(state);
            }
        }
    }
}
