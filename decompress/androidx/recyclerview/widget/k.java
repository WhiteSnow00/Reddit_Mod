// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.view.ViewPropertyAnimator;
import android.view.View;
import android.animation.AnimatorListenerAdapter;

public final class k extends AnimatorListenerAdapter
{
    public final /* synthetic */ RecyclerView$f0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewPropertyAnimator e;
    public final /* synthetic */ h f;
    
    public k(final h f, final RecyclerView$f0 a, final int b, final View c, final int d, final ViewPropertyAnimator e) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        if (this.b != 0) {
            this.c.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            this.c.setTranslationY(0.0f);
        }
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.e.setListener((Animator$AnimatorListener)null);
        ((RecyclerView$l)this.f).h(this.a);
        this.f.p.remove(this.a);
        this.f.s();
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.f.getClass();
    }
}
