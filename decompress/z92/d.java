// 
// Decompiled by Procyon v0.6.0
// 

package z92;

import sg2.e;
import android.animation.Animator;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup;
import android.view.View;
import android.animation.AnimatorListenerAdapter;

public final class d extends AnimatorListenerAdapter
{
    public final /* synthetic */ View a;
    public final /* synthetic */ ViewGroup b;
    
    public d(final ViewGroup b, final ConstraintLayout a) {
        this.a = (View)a;
        this.b = b;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        e.f((Object)animator, "animation");
        if (e.a((Object)this.a.getParent(), (Object)this.b)) {
            this.b.removeView(this.a);
        }
    }
}
