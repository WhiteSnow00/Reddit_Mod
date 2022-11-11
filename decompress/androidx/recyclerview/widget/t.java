// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class t implements ValueAnimator$AnimatorUpdateListener
{
    public final /* synthetic */ r.f a;
    
    public t(final r.f a) {
        this.a = a;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        this.a.m = valueAnimator.getAnimatedFraction();
    }
}
