// 
// Decompiled by Procyon v0.6.0
// 

package r5;

import android.animation.Animator;
import android.animation.Animator$AnimatorListener;

public final class c implements Animator$AnimatorListener
{
    public final /* synthetic */ d.a a;
    public final /* synthetic */ d b;
    
    public c(final d b, final d.a a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
    }
    
    public final void onAnimationEnd(final Animator animator) {
    }
    
    public final void onAnimationRepeat(final Animator animator) {
        this.b.a(1.0f, this.a, true);
        final d.a a = this.a;
        a.k = a.e;
        a.l = a.f;
        a.m = a.g;
        a.a((a.j + 1) % a.i.length);
        final d b = this.b;
        if (b.k) {
            b.k = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            final d.a a2 = this.a;
            if (a2.n) {
                a2.n = false;
            }
        }
        else {
            ++b.j;
        }
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.b.j = 0.0f;
    }
}
