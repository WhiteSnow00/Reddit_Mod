// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.util.Log;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.animation.AnimatorListenerAdapter;

public final class f extends AnimatorListenerAdapter
{
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ SpecialEffectsController.Operation d;
    public final /* synthetic */ d.b e;
    
    public f(final ViewGroup a, final View b, final boolean c, final SpecialEffectsController.Operation d, final d.b e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.endViewTransition(this.b);
        if (this.c) {
            this.d.a.applyState(this.b);
        }
        ((d.c)this.e).a();
        if (d0.M(2)) {
            final StringBuilder k = a.k("Animator from operation ");
            k.append(this.d);
            k.append(" has ended.");
            Log.v("FragmentManager", k.toString());
        }
    }
}
