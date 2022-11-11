// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.bytedance.covode.number.Covode;

public final class 1wo extends F5g implements QgG<2P9>
{
    public final /* synthetic */ 0mM LIZ;
    public final /* synthetic */ 1wh LIZIZ;
    public final /* synthetic */ 1wk LIZJ;
    public final /* synthetic */ 1wm LIZLLL;
    
    static {
        Covode.recordClassIndex(7552);
    }
    
    public 1wo(final 0mM liz, final 1wh liziz, final 1wk lizj, final 1wm lizlll) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        super(0);
    }
    
    public final void LIZ() {
        this.LIZIZ.LIZ();
        this.LIZ.LIZ = new AnimatorSet();
        final AnimatorSet liz = this.LIZJ.LIZ();
        final AnimatorSet liz2 = this.LIZLLL.LIZ();
        final AnimatorSet liz3 = this.LIZ.LIZ;
        if (liz3 != null) {
            liz3.playTogether(new Animator[] { (Animator)liz, (Animator)liz2 });
        }
        final AnimatorSet liz4 = this.LIZ.LIZ;
        if (liz4 != null) {
            liz4.start();
        }
    }
}
