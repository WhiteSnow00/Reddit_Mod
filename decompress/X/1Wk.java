// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.Animator;
import com.bytedance.covode.number.Covode;
import android.animation.AnimatorSet;

public final class 1wk extends F5g implements QgG<AnimatorSet>
{
    public final /* synthetic */ 1wi LIZ;
    
    static {
        Covode.recordClassIndex(7548);
    }
    
    public 1wk(final 1wi liz) {
        this.LIZ = liz;
        super(0);
    }
    
    public final AnimatorSet LIZ() {
        final AnimatorSet set = new AnimatorSet();
        set.playSequentially(new Animator[] { (Animator)this.LIZ.LIZ(0.0f, 0.9f, 120L), (Animator)this.LIZ.LIZ(0.9f, 1.25f, 520L), (Animator)this.LIZ.LIZ(1.25f, 0.6f, 160L), (Animator)this.LIZ.LIZ(0.6f, 1.1f, 120L), (Animator)this.LIZ.LIZ(1.1f, 0.9f, 120L), (Animator)this.LIZ.LIZ(0.9f, 1.0f, 80L) });
        return set;
    }
}
