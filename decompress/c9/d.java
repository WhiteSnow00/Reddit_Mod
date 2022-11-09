// 
// Decompiled by Procyon v0.6.0
// 

package c9;

import android.graphics.Bitmap;
import i9.j;
import android.graphics.drawable.Drawable;
import a9.b;

public final class d extends b<c>
{
    public d(final c c) {
        super((Drawable)c);
    }
    
    public final void a() {
        ((c)super.f).f.a.l.prepareToDraw();
    }
    
    public final Class<c> getResourceClass() {
        return c.class;
    }
    
    public final int getSize() {
        final f a = ((c)super.f).f.a;
        return a.a.c() + a.o;
    }
    
    public final void recycle() {
        ((c)super.f).stop();
        final c c = (c)super.f;
        c.i = true;
        final f a = c.f.a;
        a.c.clear();
        final Bitmap l = a.l;
        if (l != null) {
            a.e.put(l);
            a.l = null;
        }
        a.f = false;
        final f$a i = a.i;
        if (i != null) {
            a.d.clear((j)i);
            a.i = null;
        }
        final f$a k = a.k;
        if (k != null) {
            a.d.clear((j)k);
            a.k = null;
        }
        final f$a n = a.n;
        if (n != null) {
            a.d.clear((j)n);
            a.n = null;
        }
        a.a.clear();
        a.j = true;
    }
}
