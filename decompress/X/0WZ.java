// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import android.animation.Animator;
import com.bytedance.covode.number.Covode;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.animation.Animator$AnimatorListener;

public final class 0wz implements Animator$AnimatorListener
{
    public final /* synthetic */ ConstraintLayout LIZ;
    public final /* synthetic */ 28m LIZIZ;
    
    static {
        Covode.recordClassIndex(10195);
    }
    
    public 0wz(final ConstraintLayout liz, final 28m liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final void onAnimationCancel(final Animator animator) {
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final ConstraintLayout liz = this.LIZ;
        n.LIZIZ((Object)liz, "");
        liz.setVisibility(8);
        this.LIZIZ.LJIILL = null;
    }
    
    public final void onAnimationRepeat(final Animator animator) {
    }
    
    public final void onAnimationStart(final Animator animator) {
    }
}
