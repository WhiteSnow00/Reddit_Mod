// 
// Decompiled by Procyon v0.6.0
// 

package y8;

import ng.f0;
import android.graphics.Bitmap;
import android.content.res.Resources;
import r8.i;
import android.graphics.drawable.BitmapDrawable;
import r8.l;

public final class q implements l<BitmapDrawable>, i
{
    public final Resources f;
    public final l<Bitmap> g;
    
    public q(final Resources f, final l<Bitmap> g) {
        f0.a2(f);
        this.f = f;
        f0.a2(g);
        this.g = g;
    }
    
    @Override
    public final void a() {
        final l<Bitmap> g = this.g;
        if (g instanceof i) {
            ((i)g).a();
        }
    }
    
    @Override
    public final Object get() {
        return new BitmapDrawable(this.f, (Bitmap)this.g.get());
    }
    
    @Override
    public final Class<BitmapDrawable> getResourceClass() {
        return BitmapDrawable.class;
    }
    
    @Override
    public final int getSize() {
        return this.g.getSize();
    }
    
    @Override
    public final void recycle() {
        this.g.recycle();
    }
}
