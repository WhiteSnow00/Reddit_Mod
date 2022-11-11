// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.Animator;
import com.bytedance.covode.number.Covode;
import android.animation.AnimatorSet;

public final class 1wn extends F5g implements QgG<AnimatorSet>
{
    public final /* synthetic */ 1wj LIZ;
    
    static {
        Covode.recordClassIndex(7551);
    }
    
    public 1wn(final 1wj liz) {
        this.LIZ = liz;
        super(0);
    }
    
    public final AnimatorSet LIZ() {
        final AnimatorSet set = new AnimatorSet();
        set.playSequentially(new Animator[] { (Animator)this.LIZ.LIZ(0.0f, 1.0f, 120L), (Animator)this.LIZ.LIZ(1.0f, 1.0f, 680L), (Animator)this.LIZ.LIZ(1.0f, 1.0f, 200L) });
        return set;
    }
}
