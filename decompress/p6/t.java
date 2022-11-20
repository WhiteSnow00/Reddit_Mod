// 
// Decompiled by Procyon v0.6.0
// 

package p6;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieDrawable$b;

public final class t implements LottieDrawable$b
{
    public final LottieDrawable a;
    public final int b;
    public final int c;
    
    public t(final LottieDrawable a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void run() {
        this.a.q(this.b, this.c);
    }
}
