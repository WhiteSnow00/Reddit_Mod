// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.lottie.model.content;

import r6.h;
import com.airbnb.lottie.LottieDrawable;
import java.util.ArrayList;
import java.util.List;
import w6.e;
import w6.d;
import w6.c;
import x6.b;

public final class a implements b
{
    public final String a;
    public final GradientType b;
    public final c c;
    public final d d;
    public final e e;
    public final e f;
    public final w6.b g;
    public final ShapeStroke$LineCapType h;
    public final ShapeStroke$LineJoinType i;
    public final float j;
    public final List<w6.b> k;
    public final w6.b l;
    public final boolean m;
    
    public a(final String a, final GradientType b, final c c, final d d, final e e, final e f, final w6.b g, final ShapeStroke$LineCapType h, final ShapeStroke$LineJoinType i, final float j, final ArrayList k, final w6.b l, final boolean m) {
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
        this.l = l;
        this.m = m;
    }
    
    public final r6.b a(final LottieDrawable lottieDrawable, final com.airbnb.lottie.model.layer.a a) {
        return (r6.b)new h(lottieDrawable, a, this);
    }
}
