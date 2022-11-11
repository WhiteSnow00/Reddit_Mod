// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.Animator;
import com.bytedance.covode.number.Covode;
import android.animation.Animator$AnimatorListener;

public final class 0og implements Animator$AnimatorListener
{
    public final /* synthetic */ 0oi LIZ;
    
    static {
        Covode.recordClassIndex(8015);
    }
    
    public 0og(final 0oi liz) {
        this.LIZ = liz;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        this.LIZ.setVisibility(8);
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.LIZ.setVisibility(8);
    }
    
    public final void onAnimationRepeat(final Animator animator) {
        this.LIZ.setVisibility(0);
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.LIZ.setVisibility(0);
    }
}
