// 
// Decompiled by Procyon v0.6.0
// 

package x6;

import r6.n;
import com.airbnb.lottie.model.layer.a;
import com.airbnb.lottie.LottieDrawable;
import android.graphics.PointF;
import w6.i;

public final class e implements b
{
    public final String a;
    public final i<PointF, PointF> b;
    public final i<PointF, PointF> c;
    public final w6.b d;
    public final boolean e;
    
    public e(final String a, final i b, final w6.e c, final w6.b d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final r6.b a(final LottieDrawable lottieDrawable, final a a) {
        return (r6.b)new n(lottieDrawable, a, this);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("RectangleShape{position=");
        t.append(this.b);
        t.append(", size=");
        t.append(this.c);
        t.append('}');
        return t.toString();
    }
}
