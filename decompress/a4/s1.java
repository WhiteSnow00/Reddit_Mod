// 
// Decompiled by Procyon v0.6.0
// 

package a4;

import android.animation.Animator;
import android.view.View;
import android.animation.AnimatorListenerAdapter;

public final class s1 extends AnimatorListenerAdapter
{
    public final /* synthetic */ u1 a;
    public final /* synthetic */ View b;
    
    public s1(final u1 a, final View b) {
        this.a = a;
        this.b = b;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        this.a.a(this.b);
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.o();
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.a.e();
    }
}
