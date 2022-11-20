// 
// Decompiled by Procyon v0.6.0
// 

package bf;

import android.animation.Animator;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import android.animation.AnimatorListenerAdapter;

public final class a extends AnimatorListenerAdapter
{
    public final HideBottomViewOnScrollBehavior a;
    
    public a(final HideBottomViewOnScrollBehavior a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.d = null;
    }
}
