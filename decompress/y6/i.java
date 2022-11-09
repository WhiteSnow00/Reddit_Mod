// 
// Decompiled by Procyon v0.6.0
// 

package y6;

import androidx.appcompat.widget.s0;
import s6.f;
import com.airbnb.lottie.LottieDrawable;
import x6.d;
import x6.a;
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
    
    public final s6.b a(final LottieDrawable lottieDrawable, final com.airbnb.lottie.model.layer.a a) {
        return (s6.b)new f(lottieDrawable, a, this);
    }
    
    @Override
    public final String toString() {
        return s0.o(a.k("ShapeFill{color=, fillEnabled="), this.a, '}');
    }
}
