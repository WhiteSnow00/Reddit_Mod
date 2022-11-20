// 
// Decompiled by Procyon v0.6.0
// 

package y8;

import com.bumptech.glide.load.EncodeStrategy;
import r8.m;
import p8.g;
import java.io.File;
import android.graphics.Bitmap;
import s8.d;
import android.graphics.drawable.BitmapDrawable;
import p8.i;

public final class b implements i<BitmapDrawable>
{
    public final d f;
    public final i<Bitmap> g;
    
    public b(final d f, final c g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final boolean g(final Object o, final File file, final g g) {
        return this.g.g((m<Bitmap>)new e(this.f, ((m)o).get().getBitmap()), file, g);
    }
    
    @Override
    public final EncodeStrategy i(final g g) {
        return this.g.i(g);
    }
}
