// 
// Decompiled by Procyon v0.6.0
// 

package x6;

import r6.g;
import com.airbnb.lottie.model.layer.a;
import com.airbnb.lottie.LottieDrawable;
import w6.e;
import w6.c;
import android.graphics.Path$FillType;
import com.airbnb.lottie.model.content.GradientType;

public final class d implements b
{
    public final GradientType a;
    public final Path$FillType b;
    public final c c;
    public final w6.d d;
    public final e e;
    public final e f;
    public final String g;
    public final boolean h;
    
    public d(final String g, final GradientType a, final Path$FillType b, final c c, final w6.d d, final e e, final e f, final boolean h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final r6.b a(final LottieDrawable lottieDrawable, final a a) {
        return (r6.b)new g(lottieDrawable, a, this);
    }
}
