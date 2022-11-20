// 
// Decompiled by Procyon v0.6.0
// 

package x6;

import com.airbnb.lottie.LottieDrawable;
import w6.e;
import android.graphics.PointF;
import w6.i;

public final class a implements b
{
    public final String a;
    public final i<PointF, PointF> b;
    public final e c;
    public final boolean d;
    public final boolean e;
    
    public a(final String a, final i<PointF, PointF> b, final e c, final boolean d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final r6.b a(final LottieDrawable lottieDrawable, final com.airbnb.lottie.model.layer.a a) {
        return (r6.b)new r6.e(lottieDrawable, a, this);
    }
}
