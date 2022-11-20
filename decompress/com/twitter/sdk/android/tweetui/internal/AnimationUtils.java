// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.Animator$AnimatorListener;
import android.view.ViewPropertyAnimator;
import android.view.View;

class AnimationUtils
{
    public AnimationUtils() {
    }
    
    public static ViewPropertyAnimator fadeIn(final View view, final int n) {
        if (view.getVisibility() != 0) {
            view.setAlpha(0.0f);
            view.setVisibility(0);
        }
        view.clearAnimation();
        final ViewPropertyAnimator animate = view.animate();
        animate.alpha(1.0f).setDuration((long)n).setListener((Animator$AnimatorListener)null);
        return animate;
    }
    
    public static ViewPropertyAnimator fadeOut(final View view, final int n) {
        if (view.getVisibility() == 0) {
            view.clearAnimation();
            final ViewPropertyAnimator animate = view.animate();
            animate.alpha(0.0f).setDuration((long)n).setListener((Animator$AnimatorListener)new AnimatorListenerAdapter(view) {
                public final View val$from;
                
                public void onAnimationEnd(final Animator animator) {
                    this.val$from.setVisibility(4);
                    this.val$from.setAlpha(1.0f);
                }
            });
            return animate;
        }
        return null;
    }
}
