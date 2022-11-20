// 
// Decompiled by Procyon v0.6.0
// 

package p6;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieDrawable$b;

public final class u implements LottieDrawable$b
{
    public final LottieDrawable a;
    public final String b;
    
    public u(final LottieDrawable a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final void run() {
        this.a.r(this.b);
    }
}
