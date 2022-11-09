// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.Animator$AnimatorListener;
import bg.a;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.animation.AnimatorSet;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior
{
    public AnimatorSet b;
    
    public ExpandableTransformationBehavior() {
    }
    
    public ExpandableTransformationBehavior(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    @Override
    public void v(final View view, final View view2, final boolean b, final boolean b2) {
        final AnimatorSet b3 = this.b;
        final boolean b4 = b3 != null;
        if (b4) {
            b3.cancel();
        }
        ((Animator)(this.b = this.w(view, view2, b, b4))).addListener((Animator$AnimatorListener)new a(this));
        this.b.start();
        if (!b2) {
            this.b.end();
        }
    }
    
    public abstract AnimatorSet w(final View p0, final View p1, final boolean p2, final boolean p3);
}
