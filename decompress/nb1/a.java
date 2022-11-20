// 
// Decompiled by Procyon v0.6.0
// 

package nb1;

import android.transition.Transition;
import android.transition.Transition$TransitionListener;
import com.reddit.screen.widget.ScreenContainerView;
import android.view.View;
import android.view.ViewGroup;
import com.bluelinelabs.conductor.c;
import ng2.e;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.content.Context;

public final class a extends j
{
    public static final int m = 0;
    
    static {
        new a.a$a();
    }
    
    public static Interpolator p(final Context context) {
        final Interpolator loadInterpolator = AnimationUtils.loadInterpolator(context, 2130771998);
        e.e((Object)loadInterpolator, "loadInterpolator(context\u2026m.fast_out_extra_slow_in)");
        return loadInterpolator;
    }
    
    public final c c() {
        return (c)new a();
    }
    
    public final d o(final ViewGroup viewGroup, final View view, final View view2, final boolean b) {
        if (viewGroup instanceof ScreenContainerView) {
            final d d = new d(b, this);
            if (view != null) {
                ((Transition)d).addTarget(view);
            }
            if (view2 != null) {
                ((Transition)d).addTarget(view2);
            }
            if (b && view2 != null) {
                ((Transition)d).addListener((Transition$TransitionListener)new nb1.c(viewGroup, view2, viewGroup, view2, viewGroup, view2));
            }
            return d;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
