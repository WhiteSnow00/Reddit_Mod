// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import android.animation.Animator;
import com.bytedance.covode.number.Covode;
import android.animation.AnimatorListenerAdapter;

public final class 0pl extends AnimatorListenerAdapter
{
    public final /* synthetic */ 1SX LIZ;
    
    static {
        Covode.recordClassIndex(8217);
    }
    
    public 0pl(final 1SX liz) {
        this.LIZ = liz;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        super.onAnimationEnd(animator);
        GTi.LIZ((View)this.LIZ, false);
    }
}
