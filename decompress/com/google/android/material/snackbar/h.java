// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.snackbar;

import android.view.View;
import android.view.ViewGroup$LayoutParams;
import uf.c;
import android.view.ViewGroup$MarginLayoutParams;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import xe.a;
import android.animation.ValueAnimator;

public final class h implements Runnable
{
    public final /* synthetic */ BaseTransientBottomBar f;
    
    public h(final BaseTransientBottomBar f) {
        this.f = f;
    }
    
    @Override
    public final void run() {
        final BaseTransientBottomBar.g c = this.f.c;
        if (c == null) {
            return;
        }
        ((View)c).setVisibility(0);
        if (this.f.c.getAnimationMode() == 1) {
            final BaseTransientBottomBar f = this.f;
            f.getClass();
            final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
            ofFloat.setInterpolator((TimeInterpolator)a.a);
            ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new com.google.android.material.snackbar.a(f));
            final ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[] { 0.8f, 1.0f });
            ofFloat2.setInterpolator((TimeInterpolator)a.d);
            ofFloat2.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new b(f));
            final AnimatorSet set = new AnimatorSet();
            set.playTogether(new Animator[] { (Animator)ofFloat, (Animator)ofFloat2 });
            set.setDuration(150L);
            ((Animator)set).addListener((Animator$AnimatorListener)new uf.a(f));
            set.start();
        }
        else {
            final BaseTransientBottomBar f2 = this.f;
            final int height = ((View)f2.c).getHeight();
            final ViewGroup$LayoutParams layoutParams = ((View)f2.c).getLayoutParams();
            int n = height;
            if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                n = height + ((ViewGroup$MarginLayoutParams)layoutParams).bottomMargin;
            }
            ((View)f2.c).setTranslationY((float)n);
            final ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(new int[] { n, 0 });
            valueAnimator.setInterpolator((TimeInterpolator)a.b);
            valueAnimator.setDuration(250L);
            ((Animator)valueAnimator).addListener((Animator$AnimatorListener)new c(f2));
            valueAnimator.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new com.google.android.material.snackbar.c(f2, n));
            valueAnimator.start();
        }
    }
}
