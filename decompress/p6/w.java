// 
// Decompiled by Procyon v0.6.0
// 

package p6;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieDrawable$b;

public final class w implements LottieDrawable$b
{
    public final LottieDrawable a;
    public final float b;
    
    public w(final LottieDrawable a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    public final void run() {
        this.a.u(this.b);
    }
}
