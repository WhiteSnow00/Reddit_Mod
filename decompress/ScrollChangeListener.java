// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.contrib.viewpropertyobjectanimator;

import android.animation.ValueAnimator;
import android.view.View;
import android.animation.ValueAnimator$AnimatorUpdateListener;

class ScrollChangeListener extends ChangeUpdateListener implements ValueAnimator$AnimatorUpdateListener
{
    private IntValues scrollX;
    private IntValues scrollY;
    
    public ScrollChangeListener(final View view) {
        super(view);
    }
    
    private int currentScrollX() {
        int scrollX;
        if (this.hasView()) {
            scrollX = super.viewRef.get().getScrollX();
        }
        else {
            scrollX = 0;
        }
        return scrollX;
    }
    
    private int currentScrollY() {
        int scrollY;
        if (this.hasView()) {
            scrollY = super.viewRef.get().getScrollY();
        }
        else {
            scrollY = 0;
        }
        return scrollY;
    }
    
    public void onAnimationUpdate(final ValueAnimator valueAnimator) {
        if (this.hasView()) {
            final float animatedFraction = valueAnimator.getAnimatedFraction();
            int currentScrollX = this.currentScrollX();
            int currentScrollY = this.currentScrollY();
            final IntValues scrollX = this.scrollX;
            if (scrollX != null) {
                currentScrollX = (int)this.calculateAnimatedValue((float)scrollX.from, (float)scrollX.to, animatedFraction);
            }
            final IntValues scrollY = this.scrollY;
            if (scrollY != null) {
                currentScrollY = (int)this.calculateAnimatedValue((float)scrollY.from, (float)scrollY.to, animatedFraction);
            }
            super.viewRef.get().scrollTo(currentScrollX, currentScrollY);
        }
    }
    
    public void scrollX(final int n) {
        this.scrollX = new IntValues(this.currentScrollX(), n);
    }
    
    public void scrollXBy(final int n) {
        this.scrollX = new IntValues(this.currentScrollX(), this.currentScrollX() + n);
    }
    
    public void scrollY(final int n) {
        this.scrollY = new IntValues(this.currentScrollY(), n);
    }
    
    public void scrollYBy(final int n) {
        this.scrollY = new IntValues(this.currentScrollY(), this.currentScrollY() + n);
    }
}
