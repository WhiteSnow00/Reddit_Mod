// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.ObjectAnimator;
import android.animation.Animator;
import com.bytedance.covode.number.Covode;
import android.view.View;
import android.animation.AnimatorSet;

public final class 1wj extends F5g implements SRU<Float, Float, Long, AnimatorSet>
{
    public final /* synthetic */ View LIZ;
    
    static {
        Covode.recordClassIndex(7547);
    }
    
    public 1wj(final View liz) {
        this.LIZ = liz;
        super(3);
    }
    
    public final AnimatorSet LIZ(final float n, final float n2, final long duration) {
        final AnimatorSet set = new AnimatorSet();
        set.playTogether(new Animator[] { (Animator)ObjectAnimator.ofFloat((Object)this.LIZ, View.ALPHA, new float[] { n, n2 }) });
        set.setDuration(duration);
        return set;
    }
}
