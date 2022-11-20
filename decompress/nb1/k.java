// 
// Decompiled by Procyon v0.6.0
// 

package nb1;

import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import t5.t;
import t5.g0;
import t5.d;
import ng2.e;
import t5.m;
import android.view.ViewGroup;
import android.animation.TimeInterpolator;
import s4.c;
import android.animation.TypeEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.animation.RectEvaluator;
import f8.n;

public final class k extends n
{
    public static final RectEvaluator m;
    public boolean l;
    
    static {
        new k$a();
        m = new RectEvaluator();
    }
    
    public static final ObjectAnimator q(final k k, final View view, final Rect rect, final Rect rect2) {
        k.getClass();
        final ObjectAnimator ofObject = ObjectAnimator.ofObject((Object)view, "clipBounds", (TypeEvaluator)k.m, new Object[] { rect, rect2 });
        ((Animator)ofObject).setInterpolator((TimeInterpolator)new c());
        return ofObject;
    }
    
    public final com.bluelinelabs.conductor.c c() {
        return (com.bluelinelabs.conductor.c)new k();
    }
    
    public final void g(final com.bluelinelabs.conductor.c c) {
        super.i = true;
        this.l = true;
    }
    
    public final void n(final ViewGroup viewGroup, final View view, final View view2, final m m, final boolean b) {
        e.f((Object)viewGroup, "container");
        if (view != null && view.getParent() == viewGroup) {
            if (m != null) {
                if (!b && (!b || !this.l)) {
                    viewGroup.removeView(view);
                }
            }
            else if (!b || !this.l) {
                viewGroup.removeView(view);
            }
        }
        if (view2 != null && view2.getParent() == null) {
            viewGroup.addView(view2);
        }
    }
    
    public final m o(final ViewGroup viewGroup, final View view, View view2, final boolean b) {
        if (!b) {
            view2 = view;
        }
        if (view2 == null) {
            return (m)new d();
        }
        final g0 g0 = new g0(this) {
            public final k G;
            
            public final Animator M(final ViewGroup viewGroup, final View view, final t t, final t t2) {
                e.f((Object)view, "view");
                final k g = this.G;
                Rect clipBounds;
                if ((clipBounds = view.getClipBounds()) == null) {
                    clipBounds = new Rect(0, 0, view.getWidth(), 0);
                }
                final RectEvaluator m = k.m;
                final ObjectAnimator q = k.q(g, view, clipBounds, k$a.a(view));
                ((Animator)q).addListener((Animator$AnimatorListener)new k$c$a(view, view));
                return (Animator)q;
            }
            
            public final Animator N(final ViewGroup viewGroup, final View view, final t t) {
                final k g = this.G;
                Rect rect;
                if ((rect = view.getClipBounds()) == null) {
                    final RectEvaluator m = k.m;
                    rect = k$a.a(view);
                }
                return (Animator)k.q(g, view, rect, new Rect(0, 0, view.getWidth(), 0));
            }
        };
        ((m)g0).b(view2);
        if (b) {
            ((m)g0).a((m.d)new k$b(this, viewGroup, view, viewGroup, view));
        }
        return (m)g0;
    }
}
