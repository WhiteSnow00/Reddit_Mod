// 
// Decompiled by Procyon v0.6.0
// 

package p6;

import android.view.View;
import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

public final class d implements Callable
{
    public final LottieAnimationView f;
    public final int g;
    
    public d(final LottieAnimationView f, final int g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final Object call() {
        final LottieAnimationView f = this.f;
        final int g = this.g;
        i0<h> i0;
        if (f.s) {
            final Context context = ((View)f).getContext();
            i0 = r.g(context, g, r.j(g, context));
        }
        else {
            i0 = r.g(((View)f).getContext(), g, null);
        }
        return i0;
    }
}
