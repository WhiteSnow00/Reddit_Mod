// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Objects;
import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class 0Y8 implements ValueAnimator$AnimatorUpdateListener
{
    public final /* synthetic */ 0YK LIZ;
    
    static {
        Covode.recordClassIndex(5217);
    }
    
    public 0Y8(final 0YK liz) {
        this.LIZ = liz;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        CTM.LIZ((Object)valueAnimator);
        final Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this.LIZ.LJJIJIIJIL.LIZ.LIZJ((int)animatedValue, (int)GlD.LIZ((float)1GN.LJI));
    }
}
