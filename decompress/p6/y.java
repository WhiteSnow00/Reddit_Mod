// 
// Decompiled by Procyon v0.6.0
// 

package p6;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieDrawable$b;

public final class y implements LottieDrawable$b
{
    public final int a;
    public final LottieDrawable b;
    
    public y(final LottieDrawable b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void run() {
        switch (this.a) {
            default: {
                this.b.i();
                return;
            }
            case 0: {
                this.b.k();
            }
        }
    }
}
