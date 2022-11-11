// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.bytedance.covode.number.Covode;

public final class 1wp extends F5g implements QgG<2P9>
{
    public final /* synthetic */ 0mM LIZ;
    public final /* synthetic */ 1wh LIZIZ;
    public final /* synthetic */ 1wl LIZJ;
    public final /* synthetic */ 1wn LIZLLL;
    
    static {
        Covode.recordClassIndex(7553);
    }
    
    public 1wp(final 0mM liz, final 1wh liziz, final 1wl lizj, final 1wn lizlll) {
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
