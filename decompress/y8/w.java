// 
// Decompiled by Procyon v0.6.0
// 

package y8;

import l9.j;
import java.io.IOException;
import r8.l;
import p8.g;
import android.graphics.Bitmap;
import p8.h;

public final class w implements h<Bitmap, Bitmap>
{
    @Override
    public final l a(final Object o, final int n, final int n2, final g g) throws IOException {
        return new a((Bitmap)o);
    }
    
    public static final class a implements l<Bitmap>
    {
        public final Bitmap f;
        
        public a(final Bitmap f) {
            this.f = f;
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
        }
    }
}
