// 
// Decompiled by Procyon v0.6.0
// 

package nb2;

import com.reddit.ui.ViewUtilKt;
import ng2.e;
import android.animation.Animator;
import android.view.View;
import android.animation.Animator$AnimatorListener;

public final class v0 implements Animator$AnimatorListener
{
    public final View a;
    
    public v0(final View a) {
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        e.f((Object)animator, "animator");
    }
    
    public final void onAnimationEnd(final Animator animator) {
        e.f((Object)animator, "animator");
        ViewUtilKt.e(this.a);
    }
    
    public final void onAnimationRepeat(final Animator animator) {
        e.f((Object)animator, "animator");
    }
    
    public final void onAnimationStart(final Animator animator) {
        e.f((Object)animator, "animator");
    }
}
