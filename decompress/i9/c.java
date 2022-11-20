// 
// Decompiled by Procyon v0.6.0
// 

package i9;

import android.graphics.drawable.Drawable;

public abstract class c<T> implements j<T>
{
    public final int f;
    public final int g;
    public h9.c h;
    
    public c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
    
    public c(final int f, final int g) {
        if (l9.j.i(f, g)) {
            this.f = f;
            this.g = g;
            return;
        }
        throw new IllegalArgumentException(b.i("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", f, " and height: ", g));
    }
    
    @Override
    public final void b(final h9.c h) {
        this.h = h;
    }
    
    @Override
    public final void e(final i i) {
    }
    
    @Override
    public void f(final Drawable drawable) {
    }
    
    @Override
    public final void g(final i i) {
        i.b(this.f, this.g);
    }
    
    @Override
    public final h9.c getRequest() {
        return this.h;
    }
    
    @Override
    public void h(final Drawable drawable) {
    }
    
    public final void onDestroy() {
    }
    
    public final void onStart() {
    }
    
    public final void onStop() {
    }
}
