// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Objects;
import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class 0jg implements ValueAnimator$AnimatorUpdateListener
{
    public final /* synthetic */ ConstraintProperty LIZ;
    
    static {
        Covode.recordClassIndex(6946);
    }
    
    public 0jg(final ConstraintProperty liz) {
        this.LIZ = liz;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        CTM.LIZ((Object)valueAnimator);
        final ConstraintProperty liz = this.LIZ;
        final Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        liz.alpha((float)animatedValue);
    }
}