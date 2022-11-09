// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import kotlin.jvm.internal.n;
import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import android.view.ViewGroup;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class 0vq implements ValueAnimator$AnimatorUpdateListener
{
    public final /* synthetic */ ViewGroup LIZ;
    
    static {
        Covode.recordClassIndex(9761);
    }
    
    public 0vq(final ViewGroup liz) {
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
            GTi.LIZIZ((View)this.LIZ, (int)(float)n);
        }
    }
}
