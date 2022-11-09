// 
// Decompiled by Procyon v0.6.0
// 

package wf;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;
import android.animation.Animator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import android.animation.AnimatorListenerAdapter;

public final class c extends AnimatorListenerAdapter
{
    public final /* synthetic */ BaseTransientBottomBar a;
    
    public c(final BaseTransientBottomBar a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.d();
    }
    
    public final void onAnimationStart(final Animator animator) {
        final SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout)this.a.d;
        ((View)snackbarContentLayout.f).setAlpha(0.0f);
        final ViewPropertyAnimator alpha = ((View)snackbarContentLayout.f).animate().alpha(1.0f);
        final long n = 180;
        final ViewPropertyAnimator setDuration = alpha.setDuration(n);
        final long n2 = 70;
        setDuration.setStartDelay(n2).start();
        if (((View)snackbarContentLayout.g).getVisibility() == 0) {
            ((View)snackbarContentLayout.g).setAlpha(0.0f);
            ((View)snackbarContentLayout.g).animate().alpha(1.0f).setDuration(n).setStartDelay(n2).start();
        }
    }
}
