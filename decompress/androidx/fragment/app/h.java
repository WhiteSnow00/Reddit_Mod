// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.util.Log;
import android.view.animation.Animation;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation$AnimationListener;

public final class h implements Animation$AnimationListener
{
    public final /* synthetic */ SpecialEffectsController.Operation a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ View c;
    public final /* synthetic */ d.b d;
    
    public h(final View c, final ViewGroup b, final d.b d, final SpecialEffectsController.Operation a) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void onAnimationEnd(final Animation animation) {
        ((View)this.b).post((Runnable)new Runnable() {
            @Override
            public final void run() {
                final h f = h.this;
                f.b.endViewTransition(f.c);
                ((d.c)h.this.d).a();
            }
        });
        if (d0.M(2)) {
            final StringBuilder k = a.k("Animation from operation ");
            k.append(this.a);
            k.append(" has ended.");
            Log.v("FragmentManager", k.toString());
        }
    }
    
    public final void onAnimationRepeat(final Animation animation) {
    }
    
    public final void onAnimationStart(final Animation animation) {
        if (d0.M(2)) {
            final StringBuilder k = a.k("Animation from operation ");
            k.append(this.a);
            k.append(" has reached onAnimationStart.");
            Log.v("FragmentManager", k.toString());
        }
    }
}
