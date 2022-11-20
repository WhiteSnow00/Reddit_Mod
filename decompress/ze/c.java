// 
// Decompiled by Procyon v0.6.0
// 

package ze;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class c implements ValueAnimator$AnimatorUpdateListener
{
    public final CollapsingToolbarLayout a;
    
    public c(final CollapsingToolbarLayout a) {
        this.a = a;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        this.a.setScrimAlpha((int)valueAnimator.getAnimatedValue());
    }
}
