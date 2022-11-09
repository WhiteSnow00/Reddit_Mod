// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.Animator;
import com.bytedance.covode.number.Covode;
import android.animation.AnimatorSet;

public final class 1wl extends F5g implements QgG<AnimatorSet>
{
    public final /* synthetic */ 1wi LIZ;
    
    static {
        Covode.recordClassIndex(7549);
    }
    
    public 1wl(final 1wi liz) {
        this.LIZ = liz;
        super(0);
    }
    
    public final AnimatorSet LIZ() {
        final AnimatorSet set = new AnimatorSet();
        set.playSequentially(new Animator[] { (Animator)this.LIZ.LIZ(0.0f, 1.25f, 240L), (Animator)this.LIZ.LIZ(1.25f, 0.9f, 200L), (Animator)this.LIZ.LIZ(0.9f, 1.0f, 120L) });
        return set;
    }
}
