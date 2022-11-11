// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.view.ViewPropertyAnimator;
import android.view.View;
import android.animation.AnimatorListenerAdapter;

public final class j extends AnimatorListenerAdapter
{
    public final /* synthetic */ RecyclerView$f0 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ h d;
    
    public j(final View b, final ViewPropertyAnimator c, final h d, final RecyclerView$f0 a) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        this.b.setAlpha(1.0f);
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.c.setListener((Animator$AnimatorListener)null);
        ((RecyclerView$l)this.d).h(this.a);
        this.d.o.remove(this.a);
        this.d.s();
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.d.getClass();
    }
}
