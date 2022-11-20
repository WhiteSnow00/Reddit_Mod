// 
// Decompiled by Procyon v0.6.0
// 

package p6;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieDrawable$b;

public final class v implements LottieDrawable$b
{
    public final LottieDrawable a;
    public final int b;
    
    public v(final LottieDrawable a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final void run() {
        this.a.s(this.b);
    }
}
