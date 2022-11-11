// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.Animator;
import com.bytedance.covode.number.Covode;

public final class 1dm extends 0z6
{
    public final /* synthetic */ 0zC LIZ;
    
    static {
        Covode.recordClassIndex(10487);
    }
    
    public 1dm(final 0zC liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void onAnimationEnd(final Animator animator) {
        super.onAnimationEnd(animator);
        this.LIZ.LJFF();
        this.LIZ.Q_();
        final 0zC liz = this.LIZ;
        if (liz instanceof 0zD) {
            ((0zD)liz).LJI();
        }
    }
}
