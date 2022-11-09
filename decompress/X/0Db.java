// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.Animator;
import com.bytedance.covode.number.Covode;
import android.animation.AnimatorListenerAdapter;

public final class 0Db extends AnimatorListenerAdapter
{
    public final /* synthetic */ 13j LIZ;
    public final /* synthetic */ 0Dg LIZIZ;
    
    static {
        Covode.recordClassIndex(1450);
    }
    
    public 0Db(final 0Dg liziz, final 13j liz) {
        this.LIZIZ = liziz;
        this.LIZ = liz;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.LIZ.remove(animator);
        this.LIZIZ.LJIIJJI.remove(animator);
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.LIZIZ.LJIIJJI.add(animator);
    }
}
