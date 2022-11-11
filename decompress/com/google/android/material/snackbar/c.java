// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.snackbar;

import android.view.View;
import android.os.Handler;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class c implements ValueAnimator$AnimatorUpdateListener
{
    public final /* synthetic */ BaseTransientBottomBar a;
    
    public c(final BaseTransientBottomBar a, final int n) {
        this.a = a;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        final int intValue = (int)valueAnimator.getAnimatedValue();
        final Handler n = BaseTransientBottomBar.n;
        ((View)this.a.c).setTranslationY((float)intValue);
    }
}
