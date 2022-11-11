// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.floatingactionbutton;

import of.k;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class c extends AnimatorListenerAdapter
{
    public final /* synthetic */ boolean a;
    public final /* synthetic */ d.f b;
    public final /* synthetic */ d c;
    
    public c(final d c, final boolean a, final a b) {
        this.c = c;
        this.a = a;
        this.b = (d.f)b;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final d c = this.c;
        c.t = 0;
        c.n = null;
        final d.f b = this.b;
        if (b != null) {
            ((a)b).a.b();
        }
    }
    
    public final void onAnimationStart(final Animator n) {
        ((k)this.c.x).b(0, this.a);
        final d c = this.c;
        c.t = 2;
        c.n = n;
    }
}
