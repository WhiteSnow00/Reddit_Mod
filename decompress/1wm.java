// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.Animator;
import com.bytedance.covode.number.Covode;
import android.animation.AnimatorSet;

public final class 1wm extends F5g implements QgG<AnimatorSet>
{
    public final /* synthetic */ 1wj LIZ;
    
    static {
        Covode.recordClassIndex(7550);
    }
    
    public 1wm(final 1wj liz) {
        this.LIZ = liz;
        super(0);
    }
    
    public final AnimatorSet LIZ() {
        final AnimatorSet set = new AnimatorSet();
        set.playSequentially(new Animator[] { (Animator)this.LIZ.LIZ(0.0f, 1.0f, 120L), (Animator)this.LIZ.LIZ(1.0f, 1.0f, 1320L), (Animator)this.LIZ.LIZ(1.0f, 1.0f, 880L) });
        return set;
    }
}
