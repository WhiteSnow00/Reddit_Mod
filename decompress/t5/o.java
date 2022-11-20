// 
// Decompiled by Procyon v0.6.0
// 

package t5;

import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class o extends AnimatorListenerAdapter
{
    public final m a;
    
    public o(final m a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.n();
        animator.removeListener((Animator$AnimatorListener)this);
    }
}
