// 
// Decompiled by Procyon v0.6.0
// 

package y8;

import l9.j;
import r8.i;
import android.graphics.Bitmap;
import r8.l;

public final class d implements l<Bitmap>, i
{
    public final Bitmap f;
    public final s8.d g;
    
    public d(final s8.d g, final Bitmap f) {
        if (f == null) {
            throw new NullPointerException("Bitmap must not be null");
        }
        this.f = f;
        if (g != null) {
            this.g = g;
            return;
        }
        throw new NullPointerException("BitmapPool must not be null");
    }
    
    public static d b(final s8.d d, final Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new d(d, bitmap);
    }
    
    @Override
    public final void a() {
        this.f.prepareToDraw();
    }
    
    @Override
    public final Object get() {
        return this.f;
    }
    
    @Override
    public final Class<Bitmap> getResourceClass() {
        return Bitmap.class;
    }
    
    @Override
    public final int getSize() {
        return j.d(this.f);
    }
    
    @Override
    public final void recycle() {
        this.g.put(this.f);
    }
}
