// 
// Decompiled by Procyon v0.6.0
// 

package ag;

import android.animation.Animator;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import android.animation.AnimatorListenerAdapter;

public final class a extends AnimatorListenerAdapter
{
    public final ExpandableTransformationBehavior a;
    
    public a(final ExpandableTransformationBehavior a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.b = null;
    }
}
