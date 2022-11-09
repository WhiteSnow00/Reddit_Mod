// 
// Decompiled by Procyon v0.6.0
// 

package r5;

import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.view.animation.Animation;

public final class g extends Animation
{
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ SwipeRefreshLayout h;
    
    public g(final SwipeRefreshLayout h, final int f, final int g) {
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    public final void applyTransformation(final float n, final Transformation transformation) {
        final d e = this.h.E;
        final int f = this.f;
        e.setAlpha((int)((this.g - f) * n + f));
    }
}
