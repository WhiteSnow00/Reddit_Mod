// 
// Decompiled by Procyon v0.6.0
// 

package r5;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class b implements ValueAnimator$AnimatorUpdateListener
{
    public final /* synthetic */ d.a a;
    public final /* synthetic */ d b;
    
    public b(final d b, final d.a a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        final float floatValue = (float)valueAnimator.getAnimatedValue();
        final d b = this.b;
        final d.a a = this.a;
        b.getClass();
        d.d(floatValue, a);
        this.b.a(floatValue, this.a, false);
        this.b.invalidateSelf();
    }
}
