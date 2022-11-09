// 
// Decompiled by Procyon v0.6.0
// 

package r5;

import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.view.animation.Animation;

public final class f extends Animation
{
    public final /* synthetic */ SwipeRefreshLayout f;
    
    public f(final SwipeRefreshLayout f) {
        this.f = f;
    }
    
    public final void applyTransformation(final float n, final Transformation transformation) {
        this.f.setAnimationProgress(1.0f - n);
    }
}
