// 
// Decompiled by Procyon v0.6.0
// 

package a4;

import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.ViewPropertyAnimator;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;
import android.view.View;
import java.lang.ref.WeakReference;

public final class t1
{
    public final WeakReference<View> a;
    
    public t1(final View view) {
        this.a = new WeakReference<View>(view);
    }
    
    public final void a(final float n) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().alpha(n);
        }
    }
    
    public final void b() {
        final View view = this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }
    
    public final void c(final long duration) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().setDuration(duration);
        }
    }
    
    public final void d(final Interpolator interpolator) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().setInterpolator((TimeInterpolator)interpolator);
        }
    }
    
    public final void e(final u1 u1) {
        final View view = this.a.get();
        if (view != null) {
            if (u1 != null) {
                view.animate().setListener((Animator$AnimatorListener)new s1(u1, view));
            }
            else {
                view.animate().setListener((Animator$AnimatorListener)null);
            }
        }
    }
    
    public final void f(final long startDelay) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().setStartDelay(startDelay);
        }
    }
    
    public final void g() {
        final View view = this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }
    
    public final void h(final float n) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().translationY(n);
        }
    }
    
    public static final class a
    {
        public static ViewPropertyAnimator a(final ViewPropertyAnimator viewPropertyAnimator, final ValueAnimator$AnimatorUpdateListener updateListener) {
            return viewPropertyAnimator.setUpdateListener(updateListener);
        }
    }
}
