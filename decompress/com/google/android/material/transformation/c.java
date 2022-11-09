// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.transformation;

import android.animation.Animator;
import kf.d;
import android.animation.AnimatorListenerAdapter;

public final class c extends AnimatorListenerAdapter
{
    public final /* synthetic */ d a;
    
    public c(final d a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final d.d revealInfo = this.a.getRevealInfo();
        revealInfo.c = Float.MAX_VALUE;
        this.a.setRevealInfo(revealInfo);
    }
}
