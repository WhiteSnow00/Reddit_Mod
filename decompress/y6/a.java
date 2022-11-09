// 
// Decompiled by Procyon v0.6.0
// 

package y6;

import com.airbnb.lottie.LottieDrawable;
import x6.e;
import android.graphics.PointF;
import x6.j;

public final class a implements b
{
    public final String a;
    public final j<PointF, PointF> b;
    public final e c;
    public final boolean d;
    public final boolean e;
    
    public a(final String a, final j<PointF, PointF> b, final e c, final boolean d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final s6.b a(final LottieDrawable lottieDrawable, final com.airbnb.lottie.model.layer.a a) {
        return (s6.b)new s6.e(lottieDrawable, a, this);
    }
}
