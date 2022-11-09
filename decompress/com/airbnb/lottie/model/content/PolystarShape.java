// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.lottie.model.content;

import s6.m;
import com.airbnb.lottie.model.layer.a;
import com.airbnb.lottie.LottieDrawable;
import android.graphics.PointF;
import x6.j;
import y6.b;

public final class PolystarShape implements b
{
    public final String a;
    public final PolystarShape.PolystarShape$Type b;
    public final x6.b c;
    public final j<PointF, PointF> d;
    public final x6.b e;
    public final x6.b f;
    public final x6.b g;
    public final x6.b h;
    public final x6.b i;
    public final boolean j;
    public final boolean k;
    
    public PolystarShape(final String a, final PolystarShape.PolystarShape$Type b, final x6.b c, final j<PointF, PointF> d, final x6.b e, final x6.b f, final x6.b g, final x6.b h, final x6.b i, final boolean j, final boolean k) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public final s6.b a(final LottieDrawable lottieDrawable, final a a) {
        return (s6.b)new m(lottieDrawable, a, this);
    }
}
