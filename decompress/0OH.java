// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.Animator;
import com.bytedance.covode.number.Covode;
import android.animation.Animator$AnimatorListener;

public final class 0oh implements Animator$AnimatorListener
{
    public final /* synthetic */ QgG LIZ;
    public final /* synthetic */ QgG LIZIZ;
    
    static {
        Covode.recordClassIndex(8016);
    }
    
    public 0oh(final QgG liz, final QgG liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final void onAnimationCancel(final Animator animator) {
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final QgG liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.invoke();
        }
    }
    
    public final void onAnimationRepeat(final Animator animator) {
    }
    
    public final void onAnimationStart(final Animator animator) {
        final QgG liz = this.LIZ;
        if (liz != null) {
            liz.invoke();
        }
    }
}
