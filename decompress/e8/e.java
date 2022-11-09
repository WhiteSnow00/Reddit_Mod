// 
// Decompiled by Procyon v0.6.0
// 

package e8;

import java.util.Collection;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import com.bluelinelabs.conductor.c;

public final class e extends a
{
    public e() {
    }
    
    public e(final long n) {
        super(n);
    }
    
    public e(final long n, final boolean b) {
        super(n, b);
    }
    
    public e(final boolean b) {
        super(b);
    }
    
    public final c c() {
        return (c)new e(super.i, super.j);
    }
    
    public final AnimatorSet o(final ViewGroup viewGroup, final View view, final View view2, final boolean b, final boolean b2) {
        final AnimatorSet set = new AnimatorSet();
        final ArrayList list = new ArrayList();
        if (b && view2 != null) {
            list.add(ObjectAnimator.ofFloat((Object)view2, View.TRANSLATION_Y, new float[] { (float)view2.getHeight(), 0.0f }));
        }
        else if (!b && view != null) {
            list.add(ObjectAnimator.ofFloat((Object)view, View.TRANSLATION_Y, new float[] { (float)view.getHeight() }));
        }
        set.playTogether((Collection)list);
        return set;
    }
    
    public final void q(final View view) {
    }
}
