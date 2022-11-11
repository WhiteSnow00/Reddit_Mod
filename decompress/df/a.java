// 
// Decompiled by Procyon v0.6.0
// 

package df;

import tf.f;
import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class a implements ValueAnimator$AnimatorUpdateListener
{
    public final /* synthetic */ BottomSheetBehavior a;
    
    public a(final BottomSheetBehavior a) {
        this.a = a;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        final float floatValue = (float)valueAnimator.getAnimatedValue();
        final f i = this.a.i;
        if (i != null) {
            i.m(floatValue);
        }
    }
}
