// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.lottie.model.content;

import s6.t;
import com.airbnb.lottie.model.layer.a;
import com.airbnb.lottie.LottieDrawable;
import y6.b;

public final class ShapeTrimPath implements b
{
    public final ShapeTrimPath.ShapeTrimPath$Type a;
    public final x6.b b;
    public final x6.b c;
    public final x6.b d;
    public final boolean e;
    
    public ShapeTrimPath(final String s, final ShapeTrimPath.ShapeTrimPath$Type a, final x6.b b, final x6.b c, final x6.b d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final s6.b a(final LottieDrawable lottieDrawable, final a a) {
        return (s6.b)new t(a, this);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("Trim Path: {start: ");
        k.append(this.b);
        k.append(", end: ");
        k.append(this.c);
        k.append(", offset: ");
        k.append(this.d);
        k.append("}");
        return k.toString();
    }
}
