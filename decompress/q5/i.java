// 
// Decompiled by Procyon v0.6.0
// 

package q5;

import android.animation.ValueAnimator;
import ng2.e;
import p6.h;
import com.airbnb.lottie.LottieDrawable;
import p6.f0;

public final class i implements f0
{
    public final LottieDrawable a;
    
    public i(final LottieDrawable a) {
        this.a = a;
    }
    
    @Override
    public final void onResult(final Object o) {
        final LottieDrawable a = this.a;
        final h h = (h)o;
        e.f((Object)a, "$drawable");
        a.l(h);
        ((ValueAnimator)a.g).setRepeatCount(-1);
        a.i();
    }
}
