// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import kotlin.jvm.internal.n;
import android.animation.Animator;
import com.bytedance.covode.number.Covode;
import java.util.List;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.animation.Animator$AnimatorListener;

public final class 0wn implements Animator$AnimatorListener
{
    public final /* synthetic */ ConstraintLayout LIZ;
    public final /* synthetic */ List LIZIZ;
    public final /* synthetic */ 28c LIZJ;
    
    static {
        Covode.recordClassIndex(10150);
    }
    
    public 0wn(final ConstraintLayout liz, final List liziz, final 28c lizj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    public final void onAnimationCancel(final Animator animator) {
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final ConstraintLayout liz = this.LIZ;
        n.LIZIZ((Object)liz, "");
        liz.setVisibility(8);
        final Iterator iterator = this.LIZIZ.iterator();
        while (iterator.hasNext()) {
            ((1Sk)iterator.next()).LIZLLL();
        }
        this.LIZJ.LJIJJ = null;
    }
    
    public final void onAnimationRepeat(final Animator animator) {
    }
    
    public final void onAnimationStart(final Animator animator) {
        final Iterator iterator = this.LIZIZ.iterator();
        while (iterator.hasNext()) {
            ((1Sk)iterator.next()).LIZJ();
        }
    }
}
