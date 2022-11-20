// 
// Decompiled by Procyon v0.6.0
// 

package nb1;

import android.view.animation.AccelerateInterpolator;
import android.animation.Animator$AnimatorListener;
import cg2.j;
import android.view.animation.DecelerateInterpolator;
import android.animation.AnimatorSet;
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

public final class l extends n
{
    public static final RectEvaluator m;
    public boolean l;
    
    static {
        new l$a();
        m = new RectEvaluator();
    }
    
    public static final ObjectAnimator q(final l l, final View view, final Rect rect, final Rect rect2) {
        l.getClass();
        final ObjectAnimator ofObject = ObjectAnimator.ofObject((Object)view, "clipBounds", (TypeEvaluator)l.m, new Object[] { rect, rect2 });
        ((Animator)ofObject).setInterpolator((TimeInterpolator)new c());
        return ofObject;
    }
    
    public final com.bluelinelabs.conductor.c c() {
        return (com.bluelinelabs.conductor.c)new l();
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
        final g0 g0 = new g0(((View)viewGroup).getResources().getDimension(2131166625), this) {
            public final float G;
            public final l H;
            
            public final Animator M(final ViewGroup viewGroup, final View view, final t t, final t t2) {
                e.f((Object)view, "view");
                final RectEvaluator m = nb1.l.m;
                final Object tag = view.getTag(2131431889);
                Integer n;
                if (tag instanceof Integer) {
                    n = (Integer)tag;
                }
                else {
                    n = null;
                }
                int intValue;
                if (n != null) {
                    intValue = n;
                }
                else {
                    intValue = 0;
                }
                final AnimatorSet set = new AnimatorSet();
                final float g = this.G;
                final l h = this.H;
                final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)view, View.TRANSLATION_Z, new float[] { g });
                ((Animator)ofFloat).setInterpolator((TimeInterpolator)new DecelerateInterpolator(8.0f));
                final j a = j.a;
                Rect clipBounds;
                if ((clipBounds = view.getClipBounds()) == null) {
                    clipBounds = new Rect(0, 0, view.getWidth(), intValue);
                }
                final ObjectAnimator q = nb1.l.q(h, view, clipBounds, l$a.a(view));
                ((Animator)q).addListener((Animator$AnimatorListener)new l$c$a(view, view));
                set.playTogether(new Animator[] { (Animator)ofFloat, (Animator)q });
                return (Animator)set;
            }
            
            public final Animator N(final ViewGroup viewGroup, final View view, final t t) {
                final RectEvaluator m = nb1.l.m;
                final Object tag = view.getTag(2131431889);
                Integer n;
                if (tag instanceof Integer) {
                    n = (Integer)tag;
                }
                else {
                    n = null;
                }
                int intValue;
                if (n != null) {
                    intValue = n;
                }
                else {
                    intValue = 0;
                }
                final AnimatorSet set = new AnimatorSet();
                final float g = this.G;
                final l h = this.H;
                final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)view, View.TRANSLATION_Z, new float[] { g, 0.0f });
                ((Animator)ofFloat).setInterpolator((TimeInterpolator)new AccelerateInterpolator(8.0f));
                final j a = j.a;
                Rect rect;
                if ((rect = view.getClipBounds()) == null) {
                    rect = l$a.a(view);
                }
                set.playTogether(new Animator[] { (Animator)ofFloat, (Animator)nb1.l.q(h, view, rect, new Rect(0, 0, view.getWidth(), intValue)) });
                return (Animator)set;
            }
        };
        ((m)g0).b(view2);
        if (b) {
            ((m)g0).a((m.d)new l$b(this, viewGroup, view, viewGroup, view));
        }
        return (m)g0;
    }
}
