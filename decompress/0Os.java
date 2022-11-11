// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup;
import android.view.View;
import android.animation.Animator;
import com.bytedance.covode.number.Covode;
import android.animation.Animator$AnimatorListener;

public final class 0oS implements Animator$AnimatorListener
{
    public final /* synthetic */ 1Rc LIZ;
    public final /* synthetic */ QgG LIZIZ;
    
    static {
        Covode.recordClassIndex(7996);
    }
    
    public 0oS(final 1Rc liz, final QgG liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        CTM.LIZ((Object)animator);
    }
    
    public final void onAnimationEnd(final Animator animator) {
        CTM.LIZ((Object)animator);
        if (this.LIZ.LIZ) {
            final ViewGroup lizj = this.LIZ.LIZJ;
            if (lizj != null) {
                lizj.setAlpha(1.0f);
            }
            final ViewGroup lizj2 = this.LIZ.LIZJ;
            if (lizj2 != null) {
                lizj2.setVisibility(8);
            }
            final 1Rc liz = this.LIZ;
            liz.LIZ((View)liz.LJI, 0);
            this.LIZIZ.invoke();
        }
    }
    
    public final void onAnimationRepeat(final Animator animator) {
        CTM.LIZ((Object)animator);
    }
    
    public final void onAnimationStart(final Animator animator) {
        CTM.LIZ((Object)animator);
    }
}
