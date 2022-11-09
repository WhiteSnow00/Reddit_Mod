// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Objects;
import kotlin.jvm.internal.n;
import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class 0h6 implements ValueAnimator$AnimatorUpdateListener
{
    public static final 0h6 LIZ;
    
    static {
        Covode.recordClassIndex(6324);
        LIZ = new 0h6();
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        n.LIZIZ((Object)valueAnimator, "");
        final Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        1K3.LJIIJ.LIZ(((Float)animatedValue).floatValue());
    }
}
