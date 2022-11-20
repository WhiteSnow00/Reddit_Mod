// 
// Decompiled by Procyon v0.6.0
// 

package a9;

import android.graphics.Bitmap;
import i9.j;
import c9.e;
import c9.c;
import android.graphics.drawable.Drawable;

public final class d extends b
{
    public final int g;
    
    public d(final int g, final Drawable drawable) {
        this.g = g;
        super(drawable);
    }
    
    public final void a() {
        switch (this.g) {
            default: {
                super.a();
                return;
            }
            case 1: {
                ((c)super.f).f.a.l.prepareToDraw();
            }
        }
    }
    
    public final Class getResourceClass() {
        switch (this.g) {
            default: {
                return c.class;
            }
            case 0: {
                return super.f.getClass();
            }
        }
    }
    
    public final int getSize() {
        switch (this.g) {
            default: {
                final e a = ((c)super.f).f.a;
                return a.a.c() + a.o;
            }
            case 0: {
                return Math.max(1, super.f.getIntrinsicHeight() * super.f.getIntrinsicWidth() * 4);
            }
        }
    }
    
    public final void recycle() {
        switch (this.g) {
            default: {
                ((c)super.f).stop();
                final c c = (c)super.f;
                c.i = true;
                final e a = c.f.a;
                a.c.clear();
                final Bitmap l = a.l;
                if (l != null) {
                    a.e.put(l);
                    a.l = null;
                }
                a.f = false;
                final e.e$a i = a.i;
                if (i != null) {
                    a.d.clear((j<?>)i);
                    a.i = null;
                }
                final e.e$a k = a.k;
                if (k != null) {
                    a.d.clear((j<?>)k);
                    a.k = null;
                }
                final e.e$a n = a.n;
                if (n != null) {
                    a.d.clear((j<?>)n);
                    a.n = null;
                }
                a.a.clear();
                a.j = true;
            }
            case 0: {}
        }
    }
}
