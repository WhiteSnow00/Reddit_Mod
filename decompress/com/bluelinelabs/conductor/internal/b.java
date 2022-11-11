// 
// Decompiled by Procyon v0.6.0
// 

package com.bluelinelabs.conductor.internal;

import android.view.View;
import android.view.View$OnAttachStateChangeListener;

public final class b implements View$OnAttachStateChangeListener
{
    public boolean f;
    public final /* synthetic */ ViewAttachHandler.b g;
    public final /* synthetic */ ViewAttachHandler h;
    
    public b(final ViewAttachHandler h, final ViewAttachHandler$a g) {
        this.h = h;
        this.g = (ViewAttachHandler.b)g;
        this.f = false;
    }
    
    public final void onViewAttachedToWindow(final View view) {
        if (!this.f && this.h.k != null) {
            this.f = true;
            final ViewAttachHandler a = ((ViewAttachHandler$a)this.g).a;
            a.g = true;
            a.b();
            view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
            this.h.k = null;
        }
    }
    
    public final void onViewDetachedFromWindow(final View view) {
    }
}
