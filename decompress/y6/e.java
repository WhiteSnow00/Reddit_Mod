// 
// Decompiled by Procyon v0.6.0
// 

package y6;

import s6.n;
import com.airbnb.lottie.model.layer.a;
import com.airbnb.lottie.LottieDrawable;
import android.graphics.PointF;
import x6.j;

public final class e implements b
{
    public final String a;
    public final j<PointF, PointF> b;
    public final j<PointF, PointF> c;
    public final x6.b d;
    public final boolean e;
    
    public e(final String a, final j b, final x6.e c, final x6.b d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final s6.b a(final LottieDrawable lottieDrawable, final a a) {
        return (s6.b)new n(lottieDrawable, a, this);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("RectangleShape{position=");
        k.append(this.b);
        k.append(", size=");
        k.append(this.c);
        k.append('}');
        return k.toString();
    }
}
