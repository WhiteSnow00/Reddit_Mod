// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Objects;
import kotlin.jvm.internal.n;
import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class 0nt implements ValueAnimator$AnimatorUpdateListener
{
    public final /* synthetic */ 0oD LIZ;
    
    static {
        Covode.recordClassIndex(7958);
    }
    
    public 0nt(final 0oD liz) {
        this.LIZ = liz;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        final 0oq 0oq = (0oq)this.LIZ.LIZIZ(2131365409);
        n.LIZIZ((Object)valueAnimator, "");
        final Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        0oq.LIZ((float)animatedValue);
        final 0oq 0oq2 = (0oq)this.LIZ.LIZIZ(2131365410);
        final Object animatedValue2 = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        0oq2.LIZ((float)animatedValue2);
    }
}
