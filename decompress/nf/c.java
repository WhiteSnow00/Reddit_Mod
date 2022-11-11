// 
// Decompiled by Procyon v0.6.0
// 

package nf;

import android.view.View;
import com.google.android.material.floatingactionbutton.d;
import android.view.ViewTreeObserver$OnPreDrawListener;

public final class c implements ViewTreeObserver$OnPreDrawListener
{
    public final /* synthetic */ d f;
    
    public c(final d f) {
        this.f = f;
    }
    
    public final boolean onPreDraw() {
        final d f = this.f;
        final float rotation = ((View)f.x).getRotation();
        if (f.q != rotation) {
            f.q = rotation;
            f.o();
        }
        return true;
    }
}
