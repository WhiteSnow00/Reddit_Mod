// 
// Decompiled by Procyon v0.6.0
// 

package o8;

import android.graphics.Bitmap;
import i9.j;
import android.graphics.drawable.Drawable;
import a9.b;

public final class m extends b<k>
{
    public m(final k k) {
        super((Drawable)k);
    }
    
    public final void a() {
        ((k)super.f).f.a.l.prepareToDraw();
    }
    
    public final Class<k> getResourceClass() {
        return k.class;
    }
    
    public final int getSize() {
        final n a = ((k)super.f).f.a;
        return a.a.c() + a.o;
    }
    
    public final void recycle() {
        ((k)super.f).stop();
        final k k = (k)super.f;
        k.i = true;
        final n a = k.f.a;
        a.c.clear();
        final Bitmap l = a.l;
        if (l != null) {
            a.e.put(l);
            a.l = null;
        }
        a.f = false;
        final n.a i = a.i;
        if (i != null) {
            a.d.clear((j)i);
            a.i = null;
        }
        final n.a j = a.k;
        if (j != null) {
            a.d.clear((j)j);
            a.k = null;
        }
        final n.a n = a.n;
        if (n != null) {
            a.d.clear((j)n);
            a.n = null;
        }
        a.a.clear();
        a.j = true;
    }
}
