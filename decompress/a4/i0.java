// 
// Decompiled by Procyon v0.6.0
// 

package a4;

import android.view.ViewTreeObserver;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewTreeObserver$OnPreDrawListener;

public final class i0 implements ViewTreeObserver$OnPreDrawListener, View$OnAttachStateChangeListener
{
    public final View f;
    public ViewTreeObserver g;
    public final Runnable h;
    
    public i0(final View f, final Runnable h) {
        this.f = f;
        this.g = f.getViewTreeObserver();
        this.h = h;
    }
    
    public static void a(final View view, final Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable != null) {
            final i0 i0 = new i0(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)i0);
            view.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)i0);
            return;
        }
        throw new NullPointerException("runnable == null");
    }
    
    public final void b() {
        if (this.g.isAlive()) {
            this.g.removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        }
        else {
            this.f.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        }
        this.f.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
    }
    
    public final boolean onPreDraw() {
        this.b();
        this.h.run();
        return true;
    }
    
    public final void onViewAttachedToWindow(final View view) {
        this.g = view.getViewTreeObserver();
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        this.b();
    }
}
