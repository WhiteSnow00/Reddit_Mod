// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.contrib.viewpropertyobjectanimator;

import android.animation.ValueAnimator;
import android.view.View;
import android.animation.ValueAnimator$AnimatorUpdateListener;

class PaddingChangeListener extends ChangeUpdateListener implements ValueAnimator$AnimatorUpdateListener
{
    private IntValues bottomPadding;
    private IntValues leftPadding;
    private IntValues rightPadding;
    private IntValues topPadding;
    
    public PaddingChangeListener(final View view) {
        super(view);
    }
    
    private int currentBottomPadding() {
        int paddingBottom;
        if (this.hasView()) {
            paddingBottom = super.viewRef.get().getPaddingBottom();
        }
        else {
            paddingBottom = 0;
        }
        return paddingBottom;
    }
    
    private int currentLeftPadding() {
        int paddingLeft;
        if (this.hasView()) {
            paddingLeft = super.viewRef.get().getPaddingLeft();
        }
        else {
            paddingLeft = 0;
        }
        return paddingLeft;
    }
    
    private int currentRightPadding() {
        int paddingRight;
        if (this.hasView()) {
            paddingRight = super.viewRef.get().getPaddingRight();
        }
        else {
            paddingRight = 0;
        }
        return paddingRight;
    }
    
    private int currentTopPadding() {
        int paddingTop;
        if (this.hasView()) {
            paddingTop = super.viewRef.get().getPaddingTop();
        }
        else {
            paddingTop = 0;
        }
        return paddingTop;
    }
    
    public void bottomPadding(final int n) {
        this.bottomPadding = new IntValues(this.currentBottomPadding(), n);
    }
    
    public void bottomPaddingBy(final int n) {
        this.bottomPadding = new IntValues(this.currentBottomPadding(), this.currentBottomPadding() + n);
    }
    
    public void horizontalPadding(final int n) {
        this.leftPadding(n);
        this.rightPadding(n);
    }
    
    public void horizontalPaddingBy(final int n) {
        this.leftPaddingBy(n);
        this.rightPaddingBy(n);
    }
    
    public void leftPadding(final int n) {
        this.leftPadding = new IntValues(this.currentLeftPadding(), n);
    }
    
    public void leftPaddingBy(final int n) {
        this.leftPadding = new IntValues(this.currentLeftPadding(), this.currentLeftPadding() + n);
    }
    
    public void onAnimationUpdate(final ValueAnimator valueAnimator) {
        if (this.hasView()) {
            final float animatedFraction = valueAnimator.getAnimatedFraction();
            int currentLeftPadding = this.currentLeftPadding();
            int currentTopPadding = this.currentTopPadding();
            int currentRightPadding = this.currentRightPadding();
            int currentBottomPadding = this.currentBottomPadding();
            final IntValues leftPadding = this.leftPadding;
            if (leftPadding != null) {
                currentLeftPadding = (int)this.calculateAnimatedValue((float)leftPadding.from, (float)leftPadding.to, animatedFraction);
            }
            final IntValues topPadding = this.topPadding;
            if (topPadding != null) {
                currentTopPadding = (int)this.calculateAnimatedValue((float)topPadding.from, (float)topPadding.to, animatedFraction);
            }
            final IntValues rightPadding = this.rightPadding;
            if (rightPadding != null) {
                currentRightPadding = (int)this.calculateAnimatedValue((float)rightPadding.from, (float)rightPadding.to, animatedFraction);
            }
            final IntValues bottomPadding = this.bottomPadding;
            if (bottomPadding != null) {
                currentBottomPadding = (int)this.calculateAnimatedValue((float)bottomPadding.from, (float)bottomPadding.to, animatedFraction);
            }
            super.viewRef.get().setPadding(currentLeftPadding, currentTopPadding, currentRightPadding, currentBottomPadding);
        }
    }
    
    public void padding(final int n) {
        this.leftPadding(n);
        this.topPadding(n);
        this.bottomPadding(n);
        this.rightPadding(n);
    }
    
    public void paddingBy(final int n) {
        this.leftPaddingBy(n);
        this.topPaddingBy(n);
        this.bottomPaddingBy(n);
        this.rightPaddingBy(n);
    }
    
    public void rightPadding(final int n) {
        this.rightPadding = new IntValues(this.currentRightPadding(), n);
    }
    
    public void rightPaddingBy(final int n) {
        this.rightPadding = new IntValues(this.currentRightPadding(), this.currentRightPadding() + n);
    }
    
    public void topPadding(final int n) {
        this.topPadding = new IntValues(this.currentTopPadding(), n);
    }
    
    public void topPaddingBy(final int n) {
        this.topPadding = new IntValues(this.currentTopPadding(), this.currentTopPadding() + n);
    }
    
    public void verticalPadding(final int n) {
        this.topPadding(n);
        this.bottomPadding(n);
    }
    
    public void verticalPaddingBy(final int n) {
        this.topPaddingBy(n);
        this.bottomPaddingBy(n);
    }
}
