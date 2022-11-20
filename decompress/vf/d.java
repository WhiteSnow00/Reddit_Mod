// 
// Decompiled by Procyon v0.6.0
// 

package vf;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;
import android.animation.Animator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import android.animation.AnimatorListenerAdapter;

public final class d extends AnimatorListenerAdapter
{
    public final BaseTransientBottomBar a;
    
    public d(final BaseTransientBottomBar a, final int n) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.c();
    }
    
    public final void onAnimationStart(final Animator animator) {
        final SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout)this.a.d;
        ((View)snackbarContentLayout.f).setAlpha(1.0f);
        final ViewPropertyAnimator alpha = ((View)snackbarContentLayout.f).animate().alpha(0.0f);
        final long n = 180;
        final ViewPropertyAnimator setDuration = alpha.setDuration(n);
        final long n2 = 0;
        setDuration.setStartDelay(n2).start();
        if (((View)snackbarContentLayout.g).getVisibility() == 0) {
            ((View)snackbarContentLayout.g).setAlpha(1.0f);
            ((View)snackbarContentLayout.g).animate().alpha(0.0f).setDuration(n).setStartDelay(n2).start();
        }
    }
}
