// 
// Decompiled by Procyon v0.6.0
// 

package t92;

import android.animation.Animator;
import cg2.j;
import mg2.a;
import android.animation.AnimatorListenerAdapter;

public final class e extends AnimatorListenerAdapter
{
    public final a<j> a;
    
    public e(final a<j> a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        ng2.e.f((Object)animator, "animation");
        this.a.invoke();
    }
}
