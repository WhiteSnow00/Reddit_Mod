// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.contrib.viewpropertyobjectanimator;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.animation.ValueAnimator$AnimatorUpdateListener;

class DimensionChangeListener extends ChangeUpdateListener implements ValueAnimator$AnimatorUpdateListener
{
    private IntValues height;
    private final ViewGroup$LayoutParams layoutParams;
    private IntValues width;
    
    public DimensionChangeListener(final View view) {
        super(view);
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        this.layoutParams = layoutParams;
        if (layoutParams != null) {
            return;
        }
        throw new IllegalStateException("View does not have layout params yet.");
    }
    
    private int currentHeight() {
        int n = this.layoutParams.height;
        if (n <= 0) {
            if (this.hasView()) {
                n = super.viewRef.get().getHeight();
            }
            else {
                n = 0;
            }
        }
        return n;
    }
    
    private int currentWidth() {
        int n = this.layoutParams.width;
        if (n <= 0) {
            if (this.hasView()) {
                n = super.viewRef.get().getWidth();
            }
            else {
                n = 0;
            }
        }
        return n;
    }
    
    public void height(final int n) {
        this.height = new IntValues(this.currentHeight(), n);
    }
    
    public void heightBy(final int n) {
        this.height = new IntValues(this.currentHeight(), this.currentHeight() + n);
    }
    
    public void onAnimationUpdate(final ValueAnimator valueAnimator) {
        if (this.hasView()) {
            final float animatedFraction = valueAnimator.getAnimatedFraction();
            final IntValues width = this.width;
            if (width != null) {
                this.layoutParams.width = (int)this.calculateAnimatedValue((float)width.from, (float)width.to, animatedFraction);
            }
            final IntValues height = this.height;
            if (height != null) {
                this.layoutParams.height = (int)this.calculateAnimatedValue((float)height.from, (float)height.to, animatedFraction);
            }
            super.viewRef.get().requestLayout();
        }
    }
    
    public void size(final int n) {
        this.width(n);
        this.height(n);
    }
    
    public void sizeBy(final int n) {
        this.widthBy(n);
        this.heightBy(n);
    }
    
    public void width(final int n) {
        this.width = new IntValues(this.currentWidth(), n);
    }
    
    public void widthBy(final int n) {
        this.width = new IntValues(this.currentWidth(), this.currentWidth() + n);
    }
}
