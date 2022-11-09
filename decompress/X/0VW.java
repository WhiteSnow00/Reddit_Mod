// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.Animator;
import com.bytedance.covode.number.Covode;
import android.view.View;
import android.animation.Animator$AnimatorListener;

public final class 0vw implements Animator$AnimatorListener
{
    public final /* synthetic */ View LIZ;
    
    static {
        Covode.recordClassIndex(9842);
    }
    
    public 0vw(final View liz) {
        this.LIZ = liz;
    }
    
    public final void onAnimationCancel(final Animator animator) {
    }
    
    public final void onAnimationEnd(final Animator animator) {
    }
    
    public final void onAnimationRepeat(final Animator animator) {
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.LIZ.setVisibility(0);
    }
}
