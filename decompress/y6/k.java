// 
// Decompiled by Procyon v0.6.0
// 

package y6;

import s6.q;
import com.airbnb.lottie.LottieDrawable;
import x6.a;

public final class k implements b
{
    public final String a;
    public final int b;
    public final a c;
    public final boolean d;
    
    public k(final String a, final int b, final a c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final s6.b a(final LottieDrawable lottieDrawable, final com.airbnb.lottie.model.layer.a a) {
        return (s6.b)new q(lottieDrawable, a, this);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("ShapePath{name=");
        k.append(this.a);
        k.append(", index=");
        return d.k(k, this.b, '}');
    }
}
