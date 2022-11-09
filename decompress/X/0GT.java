// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class 0GT implements ValueAnimator$AnimatorUpdateListener
{
    public final /* synthetic */ 0GW.a LIZ;
    public final /* synthetic */ 0GW LIZIZ;
    
    static {
        Covode.recordClassIndex(1750);
    }
    
    public 0GT(final 0GW liziz, final 0GW.a liz) {
        this.LIZIZ = liziz;
        this.LIZ = liz;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        final float floatValue = (float)valueAnimator.getAnimatedValue();
        this.LIZIZ.LIZ(floatValue, this.LIZ);
        this.LIZIZ.LIZ(floatValue, this.LIZ, false);
        this.LIZIZ.invalidateSelf();
    }
}
