// 
// Decompiled by Procyon v0.6.0
// 

package vf;

import android.animation.Animator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import android.animation.AnimatorListenerAdapter;

public final class b extends AnimatorListenerAdapter
{
    public final BaseTransientBottomBar a;
    
    public b(final BaseTransientBottomBar a, final int n) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.c();
    }
}
