// 
// Decompiled by Procyon v0.6.0
// 

package t5;

import android.animation.Animator;
import j0.b;
import android.animation.AnimatorListenerAdapter;

public final class n extends AnimatorListenerAdapter
{
    public final b a;
    public final m b;
    
    public n(final m b, final b a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.remove((Object)animator);
        this.b.s.remove(animator);
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.b.s.add(animator);
    }
}
