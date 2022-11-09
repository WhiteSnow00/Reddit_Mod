// 
// Decompiled by Procyon v0.6.0
// 

package u5;

import j0.i;
import android.animation.Animator;
import j0.b;
import android.animation.AnimatorListenerAdapter;

public final class n extends AnimatorListenerAdapter
{
    public final /* synthetic */ b a;
    public final /* synthetic */ m b;
    
    public n(final m b, final b a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        ((i)this.a).remove((Object)animator);
        this.b.s.remove(animator);
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.b.s.add(animator);
    }
}
