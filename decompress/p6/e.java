// 
// Decompiled by Procyon v0.6.0
// 

package p6;

import com.airbnb.lottie.LottieAnimationView;

public final class e implements f0
{
    public final LottieAnimationView a;
    
    public e(final LottieAnimationView a) {
        this.a = a;
    }
    
    @Override
    public final void onResult(final Object o) {
        this.a.setComposition((h)o);
    }
}
