// 
// Decompiled by Procyon v0.6.0
// 

package x3;

import android.view.View;
import android.view.ViewTreeObserver$OnPreDrawListener;

public final class b implements ViewTreeObserver$OnPreDrawListener
{
    public final /* synthetic */ c.b f;
    public final /* synthetic */ View g;
    
    public b(final c.b f, final View g) {
        this.f = f;
        this.g = g;
    }
    
    public final boolean onPreDraw() {
        if (this.f.b.a()) {
            return false;
        }
        this.g.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        this.f.getClass();
        return true;
    }
}
