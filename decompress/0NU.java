// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.Animator;
import com.bytedance.covode.number.Covode;
import android.animation.AnimatorListenerAdapter;

public final class 0nu extends AnimatorListenerAdapter
{
    public final /* synthetic */ 0oD LIZ;
    
    static {
        Covode.recordClassIndex(7959);
    }
    
    public 0nu(final 0oD liz) {
        this.LIZ = liz;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        super.onAnimationEnd(animator);
        this.LIZ.LJI();
    }
}
