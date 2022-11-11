// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Objects;
import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class 0mL implements ValueAnimator$AnimatorUpdateListener
{
    public final /* synthetic */ 1Pc LIZ;
    
    static {
        Covode.recordClassIndex(7543);
    }
    
    public 0mL(final 1Pc liz) {
        this.LIZ = liz;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        final Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this.LIZ.LIZ.setBackgroundColor((int)animatedValue);
    }
}
