// 
// Decompiled by Procyon v0.6.0
// 

package h9;

import g9.c;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;

public final class k implements View$OnAttachStateChangeListener
{
    public final /* synthetic */ l f;
    
    public k(final l f) {
        this.f = f;
    }
    
    public final void onViewAttachedToWindow(final View view) {
        final c request = this.f.getRequest();
        if (request != null && request.c()) {
            request.j();
        }
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        final l f = this.f;
        final c request = f.getRequest();
        if (request != null) {
            f.j = true;
            request.clear();
            f.j = false;
        }
    }
}
