// 
// Decompiled by Procyon v0.6.0
// 

package p6;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieDrawable$b;

public final class s implements LottieDrawable$b
{
    public final LottieDrawable a;
    public final float b;
    
    public s(final LottieDrawable a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    public final void run() {
        this.a.v(this.b);
    }
}
