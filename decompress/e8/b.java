// 
// Decompiled by Procyon v0.6.0
// 

package e8;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import com.bluelinelabs.conductor.c;

public final class b extends a
{
    public b() {
    }
    
    public b(final long n) {
        super(n);
    }
    
    public b(final long n, final boolean b) {
        super(n, b);
    }
    
    public b(final boolean b) {
        super(b);
    }
    
    public final c c() {
        return (c)new b(super.i, super.j);
    }
    
    public final AnimatorSet o(final ViewGroup viewGroup, final View view, final View view2, final boolean b, final boolean b2) {
        final AnimatorSet set = new AnimatorSet();
        if (view2 != null) {
            float alpha;
            if (b2) {
                alpha = 0.0f;
            }
            else {
                alpha = view2.getAlpha();
            }
            set.play((Animator)ObjectAnimator.ofFloat((Object)view2, View.ALPHA, new float[] { alpha, 1.0f }));
        }
        if (view != null && (!b || super.j)) {
            set.play((Animator)ObjectAnimator.ofFloat((Object)view, View.ALPHA, new float[] { 0.0f }));
        }
        return set;
    }
    
    public final void q(final View view) {
        view.setAlpha(1.0f);
    }
}
