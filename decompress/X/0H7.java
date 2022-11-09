// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.n;
import android.animation.Animator;
import com.bytedance.covode.number.Covode;
import android.animation.AnimatorListenerAdapter;

public final class 0h7 extends AnimatorListenerAdapter
{
    static {
        Covode.recordClassIndex(6325);
    }
    
    public final void onAnimationEnd(final Animator animator) {
        super.onAnimationEnd(animator);
        final LiveEffect lj = 1K3.LJ;
        if (lj != null && !lj.isNone()) {
            final 1im liz = 1K3.LIZ;
            final String liziz = 1K3.LIZIZ;
            n.LIZIZ((Object)liziz, "");
            liz.LIZJ(liziz, lj);
        }
    }
}
