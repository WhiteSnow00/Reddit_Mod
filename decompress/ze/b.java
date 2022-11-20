// 
// Decompiled by Procyon v0.6.0
// 

package ze;

import android.animation.ValueAnimator;
import uf.f;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class b implements ValueAnimator$AnimatorUpdateListener
{
    public final f a;
    
    public b(final f a) {
        this.a = a;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        this.a.k((float)valueAnimator.getAnimatedValue());
    }
}
