// 
// Decompiled by Procyon v0.6.0
// 

package x6;

import r6.q;
import com.airbnb.lottie.model.layer.a;
import com.airbnb.lottie.LottieDrawable;
import w6.c;

public final class k implements b
{
    public final String a;
    public final int b;
    public final c c;
    public final boolean d;
    
    public k(final String a, final int b, final c c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final r6.b a(final LottieDrawable lottieDrawable, final a a) {
        return (r6.b)new q(lottieDrawable, a, this);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("ShapePath{name=");
        t.append(this.a);
        t.append(", index=");
        return d.j(t, this.b, '}');
    }
}
