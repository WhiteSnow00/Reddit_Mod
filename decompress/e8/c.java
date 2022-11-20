// 
// Decompiled by Procyon v0.6.0
// 

package e8;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;

public final class c extends a
{
    public c() {
    }
    
    public c(final long n) {
        super(n);
    }
    
    public c(final long n, final boolean b) {
        super(n, b);
    }
    
    public c(final boolean b) {
        super(b);
    }
    
    public final com.bluelinelabs.conductor.c c() {
        return (com.bluelinelabs.conductor.c)new c(super.i, super.j);
    }
    
    public final AnimatorSet o(final ViewGroup viewGroup, final View view, final View view2, final boolean b, final boolean b2) {
        final AnimatorSet set = new AnimatorSet();
        if (b) {
            if (view != null) {
                set.play((Animator)ObjectAnimator.ofFloat((Object)view, View.TRANSLATION_X, new float[] { (float)(-view.getWidth()) }));
            }
            if (view2 != null) {
                set.play((Animator)ObjectAnimator.ofFloat((Object)view2, View.TRANSLATION_X, new float[] { (float)view2.getWidth(), 0.0f }));
            }
        }
        else {
            if (view != null) {
                set.play((Animator)ObjectAnimator.ofFloat((Object)view, View.TRANSLATION_X, new float[] { (float)view.getWidth() }));
            }
            if (view2 != null) {
                float translationX;
                if (view != null) {
                    translationX = view.getTranslationX();
                }
                else {
                    translationX = 0.0f;
                }
                set.play((Animator)ObjectAnimator.ofFloat((Object)view2, View.TRANSLATION_X, new float[] { translationX - view2.getWidth(), 0.0f }));
            }
        }
        return set;
    }
    
    public final void q(final View view) {
        view.setTranslationX(0.0f);
    }
}
