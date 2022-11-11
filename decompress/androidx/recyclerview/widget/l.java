// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.animation.AnimatorListenerAdapter;

public final class l extends AnimatorListenerAdapter
{
    public final /* synthetic */ h.d a;
    public final /* synthetic */ ViewPropertyAnimator b;
    public final /* synthetic */ View c;
    public final /* synthetic */ h d;
    
    public l(final h d, final h.d a, final ViewPropertyAnimator b, final View c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.b.setListener((Animator$AnimatorListener)null);
        this.c.setAlpha(1.0f);
        this.c.setTranslationX(0.0f);
        this.c.setTranslationY(0.0f);
        ((RecyclerView$l)this.d).h(this.a.a);
        this.d.r.remove(this.a.a);
        this.d.s();
    }
    
    public final void onAnimationStart(final Animator animator) {
        final h d = this.d;
        final RecyclerView$f0 a = this.a.a;
        d.getClass();
    }
}
