// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import android.view.View;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class 0vp implements ValueAnimator$AnimatorUpdateListener
{
    public final /* synthetic */ View LIZ;
    
    static {
        Covode.recordClassIndex(9760);
    }
    
    public 0vp(final View liz) {
        this.LIZ = liz;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        n.LIZIZ((Object)valueAnimator, "");
        Object animatedValue;
        if (!((animatedValue = valueAnimator.getAnimatedValue()) instanceof Float)) {
            animatedValue = null;
        }
        final Float n = (Float)animatedValue;
        if (n != null) {
            this.LIZ.setAlpha((float)n);
        }
    }
}
