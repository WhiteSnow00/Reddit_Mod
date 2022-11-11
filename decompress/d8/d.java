// 
// Decompiled by Procyon v0.6.0
// 

package d8;

import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import com.bluelinelabs.conductor.b;
import android.view.ViewGroup;
import android.view.View$OnAttachStateChangeListener;
import com.bluelinelabs.conductor.c;

public class d extends c implements View$OnAttachStateChangeListener
{
    public boolean i;
    public boolean j;
    public ViewGroup k;
    public c l;
    
    public d() {
        this(true);
    }
    
    public d(final boolean i) {
        this.i = i;
    }
    
    @Override
    public final void b() {
        final c l = this.l;
        if (l != null) {
            ((com.bluelinelabs.conductor.b)l).a();
            this.l = null;
            ((View)this.k).removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
            this.k = null;
        }
    }
    
    @Override
    public final c c() {
        return new d(this.i);
    }
    
    @Override
    public final boolean f() {
        return true;
    }
    
    @Override
    public final void g(final c c) {
        this.j = true;
    }
    
    @Override
    public final void h(final ViewGroup k, final View view, final View view2, final boolean b, final com.bluelinelabs.conductor.b l) {
        if (!this.j) {
            if (view != null && (!b || this.i)) {
                k.removeView(view);
            }
            if (view2 != null && view2.getParent() == null) {
                k.addView(view2);
            }
        }
        if (((View)k).getWindowToken() != null) {
            l.a();
        }
        else {
            this.l = (c)l;
            ((View)(this.k = k)).addOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        }
    }
    
    @Override
    public final boolean i() {
        return this.i;
    }
    
    @Override
    public final void j(final Bundle bundle) {
        this.i = ((BaseBundle)bundle).getBoolean("SimpleSwapChangeHandler.removesFromViewOnPush");
    }
    
    @Override
    public final void k(final Bundle bundle) {
        ((BaseBundle)bundle).putBoolean("SimpleSwapChangeHandler.removesFromViewOnPush", this.i);
    }
    
    public final void onViewAttachedToWindow(final View view) {
        view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        final c l = this.l;
        if (l != null) {
            ((com.bluelinelabs.conductor.b)l).a();
            this.l = null;
            this.k = null;
        }
    }
    
    public final void onViewDetachedFromWindow(final View view) {
    }
}
