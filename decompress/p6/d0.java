// 
// Decompiled by Procyon v0.6.0
// 

package p6;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieDrawable$b;

public final class d0 implements LottieDrawable$b
{
    public final LottieDrawable a;
    public final int b;
    
    public d0(final LottieDrawable a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final void run() {
        this.a.m(this.b);
    }
}
