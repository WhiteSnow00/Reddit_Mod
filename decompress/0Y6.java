// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.ValueAnimator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import android.animation.ObjectAnimator;
import kotlin.jvm.internal.n;
import android.animation.Animator;
import com.bytedance.covode.number.Covode;
import android.animation.Animator$AnimatorListener;

public final class 0Y6 implements Animator$AnimatorListener
{
    public final /* synthetic */ 0YK LIZ;
    
    static {
        Covode.recordClassIndex(5215);
    }
    
    public 0Y6(final 0YK liz) {
        this.LIZ = liz;
    }
    
    public final void onAnimationCancel(final Animator animator) {
    }
    
    public final void onAnimationEnd(final Animator animator) {
        0YK.LIZ(this.LIZ);
        this.LIZ.LJJIJIIJIL.LIZJ();
        final 0YK liz = this.LIZ;
        final 1Fc liz2 = liz.LJJIIZ.LIZ;
        n.LIZIZ((Object)liz2, "");
        final int ljjiij = liz2.LJJIIJ;
        final int ljiilliil = this.LIZ.LJIILLIIL;
        final 1Fc liz3 = this.LIZ.LJJIIZ.LIZ;
        n.LIZIZ((Object)liz3, "");
        liz.LIZ(ljjiij - ljiilliil, liz3.LJJIIJZLJL);
        final 0YK liz4 = this.LIZ;
        final int width = liz4.LIZLLL.getLayoutParams().width;
        final ValueAnimator ofInt = ObjectAnimator.ofInt(new int[] { 0, liz4.LIZLLL.getMeasuredWidth() });
        n.LIZIZ((Object)ofInt, "");
        ofInt.setInterpolator((TimeInterpolator)new LinearInterpolator());
        ofInt.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new 0Y8(liz4));
        ofInt.addListener((Animator$AnimatorListener)new 0Y9(width));
        final ValueAnimator ofFloat = ObjectAnimator.ofFloat(new float[] { 0.0f, 1.0f });
        n.LIZIZ((Object)ofFloat, "");
        ofFloat.setInterpolator((TimeInterpolator)new LinearInterpolator());
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new 0YA(liz4));
        final AnimatorSet set = new AnimatorSet();
        set.setDuration(100L);
        set.playTogether(new Animator[] { (Animator)ofInt, (Animator)ofFloat });
        set.start();
    }
    
    public final void onAnimationRepeat(final Animator animator) {
    }
    
    public final void onAnimationStart(final Animator animator) {
    }
}
