// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.contrib.viewpropertyobjectanimator;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import android.animation.ValueAnimator$AnimatorUpdateListener;

class MarginChangeListener extends ChangeUpdateListener implements ValueAnimator$AnimatorUpdateListener
{
    private IntValues bottomMargin;
    private final ViewGroup$MarginLayoutParams layoutParams;
    private IntValues leftMargin;
    private IntValues rightMargin;
    private IntValues topMargin;
    
    public MarginChangeListener(final View view) {
        super(view);
        final ViewGroup$MarginLayoutParams layoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        this.layoutParams = layoutParams;
        if (layoutParams != null) {
            return;
        }
        throw new IllegalStateException("View does not have layout params yet.");
    }
    
    private int currentBottomMargin() {
        return this.layoutParams.bottomMargin;
    }
    
    private int currentLeftMargin() {
        return this.layoutParams.leftMargin;
    }
    
    private int currentRightMargin() {
        return this.layoutParams.rightMargin;
    }
    
    private int currentTopMargin() {
        return this.layoutParams.topMargin;
    }
    
    public void bottomMargin(final int n) {
        this.bottomMargin = new IntValues(this.currentBottomMargin(), n);
    }
    
    public void bottomMarginBy(final int n) {
        this.bottomMargin = new IntValues(this.currentBottomMargin(), this.currentBottomMargin() + n);
    }
    
    public void horizontalMargin(final int n) {
        this.leftMargin(n);
        this.rightMargin(n);
    }
    
    public void horizontalMarginBy(final int n) {
        this.leftMarginBy(n);
        this.rightMarginBy(n);
    }
    
    public void leftMargin(final int n) {
        this.leftMargin = new IntValues(this.currentLeftMargin(), n);
    }
    
    public void leftMarginBy(final int n) {
        this.leftMargin = new IntValues(this.currentLeftMargin(), this.currentLeftMargin() + n);
    }
    
    public void margin(final int n) {
        this.leftMargin(n);
        this.topMargin(n);
        this.bottomMargin(n);
        this.rightMargin(n);
    }
    
    public void marginBy(final int n) {
        this.leftMarginBy(n);
        this.topMarginBy(n);
        this.bottomMarginBy(n);
        this.rightMarginBy(n);
    }
    
    public void onAnimationUpdate(final ValueAnimator valueAnimator) {
        if (this.hasView()) {
            final float animatedFraction = valueAnimator.getAnimatedFraction();
            final IntValues leftMargin = this.leftMargin;
            if (leftMargin != null) {
                this.layoutParams.leftMargin = (int)this.calculateAnimatedValue((float)leftMargin.from, (float)leftMargin.to, animatedFraction);
            }
            final IntValues topMargin = this.topMargin;
            if (topMargin != null) {
                this.layoutParams.topMargin = (int)this.calculateAnimatedValue((float)topMargin.from, (float)topMargin.to, animatedFraction);
            }
            final IntValues rightMargin = this.rightMargin;
            if (rightMargin != null) {
                this.layoutParams.rightMargin = (int)this.calculateAnimatedValue((float)rightMargin.from, (float)rightMargin.to, animatedFraction);
            }
            final IntValues bottomMargin = this.bottomMargin;
            if (bottomMargin != null) {
                this.layoutParams.bottomMargin = (int)this.calculateAnimatedValue((float)bottomMargin.from, (float)bottomMargin.to, animatedFraction);
            }
            super.viewRef.get().requestLayout();
        }
    }
    
    public void rightMargin(final int n) {
        this.rightMargin = new IntValues(this.currentRightMargin(), n);
    }
    
    public void rightMarginBy(final int n) {
        this.rightMargin = new IntValues(this.currentRightMargin(), this.currentRightMargin() + n);
    }
    
    public void topMargin(final int n) {
        this.topMargin = new IntValues(this.currentTopMargin(), n);
    }
    
    public void topMarginBy(final int n) {
        this.topMargin = new IntValues(this.currentTopMargin(), this.currentTopMargin() + n);
    }
    
    public void verticalMargin(final int n) {
        this.topMargin(n);
        this.bottomMargin(n);
    }
    
    public void verticalMarginBy(final int n) {
        this.topMarginBy(n);
        this.bottomMarginBy(n);
    }
}
