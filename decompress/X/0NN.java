// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.Animator;
import com.bytedance.covode.number.Covode;
import android.animation.Animator$AnimatorListener;

public final class 0nn implements Animator$AnimatorListener
{
    public final /* synthetic */ 0no LIZ;
    
    static {
        Covode.recordClassIndex(7938);
    }
    
    public 0nn(final 0no liz) {
        this.LIZ = liz;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        CTM.LIZ((Object)animator);
    }
    
    public final void onAnimationEnd(final Animator animator) {
        CTM.LIZ((Object)animator);
        this.LIZ.getMMvpImageView().setVisibility(8);
        final 0no.a lizlll = this.LIZ.LIZLLL;
        if (lizlll != null) {
            lizlll.LIZ(true);
        }
        this.LIZ.LIZIZ = true;
    }
    
    public final void onAnimationRepeat(final Animator animator) {
        CTM.LIZ((Object)animator);
    }
    
    public final void onAnimationStart(final Animator animator) {
        CTM.LIZ((Object)animator);
    }
}
