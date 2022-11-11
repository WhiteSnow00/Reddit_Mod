// 
// Decompiled by Procyon v0.6.0
// 

package z92;

import android.animation.Animator;
import hg2.j;
import rg2.a;
import android.animation.AnimatorListenerAdapter;

public final class e extends AnimatorListenerAdapter
{
    public final /* synthetic */ a<j> a;
    
    public e(final a<j> a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        sg2.e.f((Object)animator, "animation");
        this.a.invoke();
    }
}
