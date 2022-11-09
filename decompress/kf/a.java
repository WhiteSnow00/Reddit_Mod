// 
// Decompiled by Procyon v0.6.0
// 

package kf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class a extends AnimatorListenerAdapter
{
    public final /* synthetic */ d a;
    
    public a(final d a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.a();
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.a.b();
    }
}
