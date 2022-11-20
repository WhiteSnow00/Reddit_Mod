// 
// Decompiled by Procyon v0.6.0
// 

package i9;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.graphics.drawable.Drawable;
import h9.c;
import ah0.b;
import android.view.View;

public abstract class d<T extends View, Z> implements j<Z>
{
    public final d.d$a f;
    public final T g;
    
    public d(final T g) {
        b.F((Object)g);
        this.g = g;
        this.f = new d.d$a((View)g);
    }
    
    public abstract void a();
    
    @Override
    public final void b(final c c) {
        this.g.setTag(2131429236, (Object)c);
    }
    
    @Override
    public final void c(final Drawable drawable) {
        final d.d$a f = this.f;
        final ViewTreeObserver viewTreeObserver = f.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)f.c);
        }
        f.c = null;
        f.b.clear();
        this.a();
    }
    
    @Override
    public final void e(final i i) {
        this.f.b.remove(i);
    }
    
    @Override
    public final void f(final Drawable drawable) {
    }
    
    @Override
    public final void g(final i i) {
        final d.d$a f = this.f;
        final int c = f.c();
        final int b = f.b();
        final boolean b2 = false;
        final boolean b3 = c > 0 || c == Integer.MIN_VALUE;
        int n = b2 ? 1 : 0;
        if (b3) {
            final boolean b4 = b > 0 || b == Integer.MIN_VALUE;
            n = (b2 ? 1 : 0);
            if (b4) {
                n = 1;
            }
        }
        if (n != 0) {
            i.b(c, b);
        }
        else {
            if (!f.b.contains(i)) {
                f.b.add(i);
            }
            if (f.c == null) {
                f.a.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)(f.c = new d$a$a(f)));
            }
        }
    }
    
    @Override
    public final c getRequest() {
        final Object tag = this.g.getTag(2131429236);
        if (tag == null) {
            return null;
        }
        if (tag instanceof c) {
            return (c)tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }
    
    public final void onDestroy() {
    }
    
    public final void onStart() {
    }
    
    public final void onStop() {
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("Target for: ");
        t.append(this.g);
        return t.toString();
    }
}
