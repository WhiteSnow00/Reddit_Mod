// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.transformation;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import kf.d;
import android.animation.AnimatorListenerAdapter;

public final class b extends AnimatorListenerAdapter
{
    public final /* synthetic */ d a;
    public final /* synthetic */ Drawable b;
    
    public b(final d a, final Drawable b) {
        this.a = a;
        this.b = b;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.setCircularRevealOverlayDrawable(null);
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.a.setCircularRevealOverlayDrawable(this.b);
    }
}
