// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.lottie.model.content;

import s6.s;
import com.airbnb.lottie.LottieDrawable;
import java.util.ArrayList;
import x6.d;
import x6.a;
import java.util.List;
import y6.b;

public final class ShapeStroke implements b
{
    public final String a;
    public final x6.b b;
    public final List<x6.b> c;
    public final a d;
    public final d e;
    public final x6.b f;
    public final ShapeStroke.ShapeStroke$LineCapType g;
    public final ShapeStroke.ShapeStroke$LineJoinType h;
    public final float i;
    public final boolean j;
    
    public ShapeStroke(final String a, final x6.b b, final ArrayList c, final a d, final d e, final x6.b f, final ShapeStroke.ShapeStroke$LineCapType g, final ShapeStroke.ShapeStroke$LineJoinType h, final float i, final boolean j) {
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
    }
    
    public final s6.b a(final LottieDrawable lottieDrawable, final com.airbnb.lottie.model.layer.a a) {
        return (s6.b)new s(lottieDrawable, a, this);
    }
}
