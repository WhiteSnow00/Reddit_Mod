// 
// Decompiled by Procyon v0.6.0
// 

package y6;

import s6.o;
import com.airbnb.lottie.model.layer.a;
import com.airbnb.lottie.LottieDrawable;
import x6.i;

public final class f implements b
{
    public final String a;
    public final x6.b b;
    public final x6.b c;
    public final i d;
    public final boolean e;
    
    public f(final String a, final x6.b b, final x6.b c, final i d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final s6.b a(final LottieDrawable lottieDrawable, final a a) {
        return (s6.b)new o(lottieDrawable, a, this);
    }
}
