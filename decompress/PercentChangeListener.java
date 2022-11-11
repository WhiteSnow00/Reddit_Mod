// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.contrib.viewpropertyobjectanimator;

import android.animation.ValueAnimator;
import android.view.ViewGroup$LayoutParams;
import androidx.percentlayout.widget.a$b;
import android.view.View;
import androidx.percentlayout.widget.a$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;

class PercentChangeListener extends ChangeUpdateListener implements ValueAnimator$AnimatorUpdateListener
{
    private FloatValues aspectRatio;
    private FloatValues bottomMarginPercent;
    private FloatValues heightPercent;
    private FloatValues leftMarginPercent;
    private final a$a percentLayoutInfo;
    private FloatValues rightMarginPercent;
    private FloatValues topMarginPercent;
    private FloatValues widthPercent;
    
    public PercentChangeListener(final View view) {
        super(view);
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            try {
                if (layoutParams instanceof a$b) {
                    this.percentLayoutInfo = ((a$b)layoutParams).a();
                    return;
                }
                throw new IllegalStateException("Animating percent parameters (aspectRatio is also a \"percent parameter\") is available only for children of PercentRelativeLayout or PercentFrameLayout (part of the Percent AndroidX library).");
            }
            catch (final NoClassDefFoundError noClassDefFoundError) {
                throw new IllegalStateException("Animating percent parameters (aspectRatio is also a \"percent parameter\") is available only for children of PercentRelativeLayout or PercentFrameLayout (part of the Percent AndroidX Library).");
            }
        }
        throw new IllegalStateException("View does not have layout params yet.");
    }
    
    private float currentAspectRatio() {
        return this.percentLayoutInfo.i;
    }
    
    private float currentBottomMarginPercent() {
        return this.percentLayoutInfo.f;
    }
    
    private float currentHeightPercent() {
        return this.percentLayoutInfo.b;
    }
    
    private float currentLeftMarginPercent() {
        return this.percentLayoutInfo.c;
    }
    
    private float currentRightMarginPercent() {
        return this.percentLayoutInfo.e;
    }
    
    private float currentTopMarginPercent() {
        return this.percentLayoutInfo.d;
    }
    
    private float currentWidthPercent() {
        return this.percentLayoutInfo.a;
    }
    
    public void aspectRatio(final float n) {
        this.aspectRatio = new FloatValues(this.currentAspectRatio(), n);
    }
    
    public void aspectRatioBy(final float n) {
        this.aspectRatio = new FloatValues(this.currentAspectRatio(), this.currentAspectRatio() + n);
    }
    
    public void bottomMarginPercent(final float n) {
        this.bottomMarginPercent = new FloatValues(this.currentBottomMarginPercent(), n);
    }
    
    public void bottomMarginPercentBy(final float n) {
        this.bottomMarginPercent = new FloatValues(this.currentBottomMarginPercent(), this.currentBottomMarginPercent() + n);
    }
    
    public void heightPercent(final float n) {
        this.heightPercent = new FloatValues(this.currentHeightPercent(), n);
    }
    
    public void heightPercentBy(final float n) {
        this.heightPercent = new FloatValues(this.currentHeightPercent(), this.currentHeightPercent() + n);
    }
    
    public void horizontalMarginPercent(final float n) {
        this.leftMarginPercent(n);
        this.rightMarginPercent(n);
    }
    
    public void horizontalMarginPercentBy(final float n) {
        this.leftMarginPercentBy(n);
        this.rightMarginPercentBy(n);
    }
    
    public void leftMarginPercent(final float n) {
        this.leftMarginPercent = new FloatValues(this.currentLeftMarginPercent(), n);
    }
    
    public void leftMarginPercentBy(final float n) {
        this.leftMarginPercent = new FloatValues(this.currentLeftMarginPercent(), this.currentLeftMarginPercent() + n);
    }
    
    public void marginPercent(final float n) {
        this.leftMarginPercent(n);
        this.topMarginPercent(n);
        this.bottomMarginPercent(n);
        this.rightMarginPercent(n);
    }
    
    public void marginPercentBy(final float n) {
        this.leftMarginPercentBy(n);
        this.topMarginPercentBy(n);
        this.bottomMarginPercentBy(n);
        this.rightMarginPercentBy(n);
    }
    
    public void onAnimationUpdate(final ValueAnimator valueAnimator) {
        if (this.hasView()) {
            final float animatedFraction = valueAnimator.getAnimatedFraction();
            final FloatValues widthPercent = this.widthPercent;
            if (widthPercent != null) {
                this.percentLayoutInfo.a = this.calculateAnimatedValue(widthPercent.from, widthPercent.to, animatedFraction);
            }
            final FloatValues heightPercent = this.heightPercent;
            if (heightPercent != null) {
                this.percentLayoutInfo.b = this.calculateAnimatedValue(heightPercent.from, heightPercent.to, animatedFraction);
            }
            final FloatValues leftMarginPercent = this.leftMarginPercent;
            if (leftMarginPercent != null) {
                this.percentLayoutInfo.c = this.calculateAnimatedValue(leftMarginPercent.from, leftMarginPercent.to, animatedFraction);
            }
            final FloatValues topMarginPercent = this.topMarginPercent;
            if (topMarginPercent != null) {
                this.percentLayoutInfo.d = this.calculateAnimatedValue(topMarginPercent.from, topMarginPercent.to, animatedFraction);
            }
            final FloatValues rightMarginPercent = this.rightMarginPercent;
            if (rightMarginPercent != null) {
                this.percentLayoutInfo.e = this.calculateAnimatedValue(rightMarginPercent.from, rightMarginPercent.to, animatedFraction);
            }
            final FloatValues bottomMarginPercent = this.bottomMarginPercent;
            if (bottomMarginPercent != null) {
                this.percentLayoutInfo.f = this.calculateAnimatedValue(bottomMarginPercent.from, bottomMarginPercent.to, animatedFraction);
            }
            final FloatValues aspectRatio = this.aspectRatio;
            if (aspectRatio != null) {
                this.percentLayoutInfo.i = this.calculateAnimatedValue(aspectRatio.from, aspectRatio.to, animatedFraction);
            }
            super.viewRef.get().requestLayout();
        }
    }
    
    public void rightMarginPercent(final float n) {
        this.rightMarginPercent = new FloatValues(this.currentRightMarginPercent(), n);
    }
    
    public void rightMarginPercentBy(final float n) {
        this.rightMarginPercent = new FloatValues(this.currentRightMarginPercent(), this.currentRightMarginPercent() + n);
    }
    
    public void sizePercent(final float n) {
        this.widthPercent(n);
        this.heightPercent(n);
    }
    
    public void sizePercentBy(final float n) {
        this.widthPercentBy(n);
        this.heightPercentBy(n);
    }
    
    public void topMarginPercent(final float n) {
        this.topMarginPercent = new FloatValues(this.currentTopMarginPercent(), n);
    }
    
    public void topMarginPercentBy(final float n) {
        this.topMarginPercent = new FloatValues(this.currentTopMarginPercent(), this.currentTopMarginPercent() + n);
    }
    
    public void verticalMarginPercent(final float n) {
        this.topMarginPercent(n);
        this.bottomMarginPercent(n);
    }
    
    public void verticalMarginPercentBy(final float n) {
        this.topMarginPercentBy(n);
        this.bottomMarginPercentBy(n);
    }
    
    public void widthPercent(final float n) {
        this.widthPercent = new FloatValues(this.currentWidthPercent(), n);
    }
    
    public void widthPercentBy(final float n) {
        this.widthPercent = new FloatValues(this.currentWidthPercent(), this.currentWidthPercent() + n);
    }
}
