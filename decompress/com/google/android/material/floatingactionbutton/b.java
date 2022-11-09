// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class b extends AnimatorListenerAdapter
{
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ d.f c;
    public final /* synthetic */ d d;
    
    public b(final d d, final boolean b, final a c) {
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        this.a = true;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final d d = this.d;
        d.t = 0;
        d.n = null;
        if (!this.a) {
            final FloatingActionButton x = d.x;
            final boolean b = this.b;
            int n;
            if (b) {
                n = 8;
            }
            else {
                n = 4;
            }
            x.b(n, b);
            final d.f c = this.c;
            if (c != null) {
                final a a = (a)c;
                a.a.a(a.b);
            }
        }
    }
    
    public final void onAnimationStart(final Animator n) {
        this.d.x.b(0, this.b);
        final d d = this.d;
        d.t = 1;
        d.n = n;
        this.a = false;
    }
}
