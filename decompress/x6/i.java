// 
// Decompiled by Procyon v0.6.0
// 

package x6;

import r6.f;
import com.airbnb.lottie.LottieDrawable;
import w6.d;
import w6.a;
import android.graphics.Path$FillType;

public final class i implements b
{
    public final boolean a;
    public final Path$FillType b;
    public final String c;
    public final a d;
    public final d e;
    public final boolean f;
    
    public i(final String c, final boolean a, final Path$FillType b, final a d, final d e, final boolean f) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final r6.b a(final LottieDrawable lottieDrawable, final com.airbnb.lottie.model.layer.a a) {
        return (r6.b)new f(lottieDrawable, a, this);
    }
    
    @Override
    public final String toString() {
        return d.n(a.t("ShapeFill{color=, fillEnabled="), this.a, '}');
    }
}
