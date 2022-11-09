// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.tabs;

import java.util.WeakHashMap;
import android.view.animation.LinearInterpolator;
import android.view.View;
import a4.p0;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class a implements ValueAnimator$AnimatorUpdateListener
{
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ TabLayout.f c;
    
    public a(final TabLayout.f c, final int a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        final float animatedFraction = valueAnimator.getAnimatedFraction();
        final TabLayout.f c = this.c;
        final int n = c.n;
        final int a = this.a;
        final LinearInterpolator a2 = ze.a.a;
        final int k = Math.round((a - n) * animatedFraction) + n;
        final int o = this.c.o;
        final int l = Math.round(animatedFraction * (this.b - o)) + o;
        if (k != c.k || l != c.l) {
            c.k = k;
            c.l = l;
            final WeakHashMap a3 = p0.a;
            p0.d.k((View)c);
        }
    }
}
