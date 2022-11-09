// 
// Decompiled by Procyon v0.6.0
// 

package kf;

import android.animation.Animator;
import android.view.ViewAnimationUtils;
import android.view.View;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;

public final class b
{
    public static AnimatorSet a(final d d, final float n, final float n2, final float n3) {
        final ObjectAnimator ofObject = ObjectAnimator.ofObject((Object)d, (Property)kf.d.b.a, (TypeEvaluator)d.a.b, (Object[])new d.d[] { new d.d(n, n2, n3) });
        final d.d revealInfo = d.getRevealInfo();
        if (revealInfo != null) {
            final Animator circularReveal = ViewAnimationUtils.createCircularReveal((View)d, (int)n, (int)n2, revealInfo.c, n3);
            final AnimatorSet set = new AnimatorSet();
            set.playTogether(new Animator[] { (Animator)ofObject, circularReveal });
            return set;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }
}
