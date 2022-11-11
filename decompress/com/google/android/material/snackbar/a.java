// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.snackbar;

import android.view.View;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class a implements ValueAnimator$AnimatorUpdateListener
{
    public final /* synthetic */ BaseTransientBottomBar a;
    
    public a(final BaseTransientBottomBar a) {
        this.a = a;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        ((View)this.a.c).setAlpha((float)valueAnimator.getAnimatedValue());
    }
}
