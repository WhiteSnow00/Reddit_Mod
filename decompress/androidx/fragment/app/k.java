// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

public final class k implements Runnable
{
    public final /* synthetic */ u0 f;
    public final /* synthetic */ View g;
    public final /* synthetic */ Rect h;
    
    public k(final u0 f, final View g, final Rect h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void run() {
        final u0 f = this.f;
        final View g = this.g;
        final Rect h = this.h;
        f.getClass();
        u0.g(h, g);
    }
}
