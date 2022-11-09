// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.transformation;

import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import mk2.e;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import android.animation.AnimatorSet;
import android.view.MotionEvent;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.content.Context;
import ze.h;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior
{
    public final h c;
    public final h d;
    
    public FabTransformationScrimBehavior() {
        this.c = new h(75L);
        this.d = new h(0L);
    }
    
    public FabTransformationScrimBehavior(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = new h(75L);
        this.d = new h(0L);
    }
    
    @Override
    public final boolean b(final CoordinatorLayout coordinatorLayout, final View view, final View view2) {
        return view2 instanceof FloatingActionButton;
    }
    
    public final boolean u(final CoordinatorLayout coordinatorLayout, final View view, final MotionEvent motionEvent) {
        return false;
    }
    
    @Override
    public final AnimatorSet w(final View view, final View view2, final boolean b, final boolean b2) {
        final ArrayList list = new ArrayList();
        new ArrayList();
        h h;
        if (b) {
            h = this.c;
        }
        else {
            h = this.d;
        }
        ObjectAnimator objectAnimator;
        if (b) {
            if (!b2) {
                view2.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat((Object)view2, View.ALPHA, new float[] { 1.0f });
        }
        else {
            objectAnimator = ObjectAnimator.ofFloat((Object)view2, View.ALPHA, new float[] { 0.0f });
        }
        h.a((Animator)objectAnimator);
        list.add(objectAnimator);
        final AnimatorSet set = new AnimatorSet();
        e.J(set, list);
        ((Animator)set).addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public final void onAnimationEnd(final Animator animator) {
                if (!b) {
                    view2.setVisibility(4);
                }
            }
            
            public final void onAnimationStart(final Animator animator) {
                if (b) {
                    view2.setVisibility(0);
                }
            }
        });
        return set;
    }
}
