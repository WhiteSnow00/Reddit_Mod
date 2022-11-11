// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.animation.AnimatorListenerAdapter;

public final class i extends AnimatorListenerAdapter
{
    public final /* synthetic */ RecyclerView$f0 a;
    public final /* synthetic */ ViewPropertyAnimator b;
    public final /* synthetic */ View c;
    public final /* synthetic */ h d;
    
    public i(final View c, final ViewPropertyAnimator b, final h d, final RecyclerView$f0 a) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.b.setListener((Animator$AnimatorListener)null);
        this.c.setAlpha(1.0f);
        ((RecyclerView$l)this.d).h(this.a);
        this.d.q.remove(this.a);
        this.d.s();
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.d.getClass();
    }
}
