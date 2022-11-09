// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.snackbar;

import android.view.View;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class b implements ValueAnimator$AnimatorUpdateListener
{
    public final /* synthetic */ BaseTransientBottomBar a;
    
    public b(final BaseTransientBottomBar a) {
        this.a = a;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        final float floatValue = (float)valueAnimator.getAnimatedValue();
        ((View)this.a.c).setScaleX(floatValue);
        ((View)this.a.c).setScaleY(floatValue);
    }
}
