// 
// Decompiled by Procyon v0.6.0
// 

package x3;

import android.view.View;
import android.view.ViewTreeObserver$OnPreDrawListener;

public final class d implements ViewTreeObserver$OnPreDrawListener
{
    public final /* synthetic */ c.a f;
    public final /* synthetic */ View g;
    
    public d(final c.a f, final View g) {
        this.f = f;
        this.g = g;
    }
    
    public final boolean onPreDraw() {
        if (this.f.b.a()) {
            return false;
        }
        this.g.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        return true;
    }
}
