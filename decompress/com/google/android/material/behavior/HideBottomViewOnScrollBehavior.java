// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.behavior;

import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import t4.d;
import ze.a;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout$c;
import android.view.View;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout$c<V>
{
    public int a;
    public int b;
    public int c;
    public ViewPropertyAnimator d;
    
    public HideBottomViewOnScrollBehavior() {
        this.a = 0;
        this.b = 2;
        this.c = 0;
    }
    
    public HideBottomViewOnScrollBehavior(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = 0;
        this.b = 2;
        this.c = 0;
    }
    
    public boolean h(final CoordinatorLayout coordinatorLayout, final V v, final int n) {
        this.a = v.getMeasuredHeight() + ((ViewGroup$MarginLayoutParams)v.getLayoutParams()).bottomMargin;
        return false;
    }
    
    public final void m(final CoordinatorLayout coordinatorLayout, final View view, final int n, final int n2, final int n3, final int[] array) {
        if (n > 0) {
            if (this.b != 1) {
                final ViewPropertyAnimator d = this.d;
                if (d != null) {
                    d.cancel();
                    view.clearAnimation();
                }
                this.b = 1;
                this.v(view, this.a + this.c, 175L, ze.a.c);
            }
        }
        else if (n < 0) {
            if (this.b != 2) {
                final ViewPropertyAnimator d2 = this.d;
                if (d2 != null) {
                    d2.cancel();
                    view.clearAnimation();
                }
                this.b = 2;
                this.v(view, 0, 225L, ze.a.d);
            }
        }
    }
    
    public boolean r(final CoordinatorLayout coordinatorLayout, final V v, final View view, final View view2, final int n, final int n2) {
        return n == 2;
    }
    
    public final void v(final View view, final int n, final long duration, final d interpolator) {
        this.d = view.animate().translationY((float)n).setInterpolator((TimeInterpolator)interpolator).setDuration(duration).setListener((Animator$AnimatorListener)new cf.a(this));
    }
}
