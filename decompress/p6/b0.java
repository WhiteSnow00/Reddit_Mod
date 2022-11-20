// 
// Decompiled by Procyon v0.6.0
// 

package p6;

import c7.c;
import v6.d;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieDrawable$b;

public final class b0 implements LottieDrawable$b
{
    public final LottieDrawable a;
    public final d b;
    public final Object c;
    public final c d;
    
    public b0(final LottieDrawable a, final d b, final Object c, final c d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void run() {
        this.a.a(this.b, this.c, this.d);
    }
}
