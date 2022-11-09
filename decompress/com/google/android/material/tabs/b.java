// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class b extends AnimatorListenerAdapter
{
    public final /* synthetic */ int a;
    public final /* synthetic */ TabLayout.f b;
    
    public b(final TabLayout.f b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final TabLayout.f b = this.b;
        b.i = this.a;
        b.j = 0.0f;
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.b.i = this.a;
    }
}
