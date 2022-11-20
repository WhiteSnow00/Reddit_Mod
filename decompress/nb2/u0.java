// 
// Decompiled by Procyon v0.6.0
// 

package nb2;

import android.animation.ValueAnimator;
import com.reddit.widgets.UpdatingAwardStatView;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class u0 implements ValueAnimator$AnimatorUpdateListener
{
    public final UpdatingAwardStatView a;
    public final String b;
    
    public u0(final UpdatingAwardStatView a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        UpdatingAwardStatView.o(this.a, this.b, valueAnimator);
    }
}
