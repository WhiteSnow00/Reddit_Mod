// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.lottie.model.content;

import r6.t;
import com.airbnb.lottie.model.layer.a;
import com.airbnb.lottie.LottieDrawable;
import x6.b;

public final class ShapeTrimPath implements b
{
    public final ShapeTrimPath.ShapeTrimPath$Type a;
    public final w6.b b;
    public final w6.b c;
    public final w6.b d;
    public final boolean e;
    
    public ShapeTrimPath(final String s, final ShapeTrimPath.ShapeTrimPath$Type a, final w6.b b, final w6.b c, final w6.b d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final r6.b a(final LottieDrawable lottieDrawable, final a a) {
        return new t(a, this);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("Trim Path: {start: ");
        t.append(this.b);
        t.append(", end: ");
        t.append(this.c);
        t.append(", offset: ");
        t.append(this.d);
        t.append("}");
        return t.toString();
    }
}
