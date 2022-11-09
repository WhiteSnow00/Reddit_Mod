// 
// Decompiled by Procyon v0.6.0
// 

package wf;

import android.animation.Animator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import android.animation.AnimatorListenerAdapter;

public final class a extends AnimatorListenerAdapter
{
    public final /* synthetic */ BaseTransientBottomBar a;
    
    public a(final BaseTransientBottomBar a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.d();
    }
}
