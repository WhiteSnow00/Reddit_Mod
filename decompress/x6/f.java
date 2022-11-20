// 
// Decompiled by Procyon v0.6.0
// 

package x6;

import r6.o;
import com.airbnb.lottie.model.layer.a;
import com.airbnb.lottie.LottieDrawable;
import w6.h;

public final class f implements b
{
    public final String a;
    public final w6.b b;
    public final w6.b c;
    public final h d;
    public final boolean e;
    
    public f(final String a, final w6.b b, final w6.b c, final h d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final r6.b a(final LottieDrawable lottieDrawable, final a a) {
        return (r6.b)new o(lottieDrawable, a, this);
    }
}
