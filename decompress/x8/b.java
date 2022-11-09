// 
// Decompiled by Procyon v0.6.0
// 

package x8;

import p8.f;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.a;
import com.bumptech.glide.load.DecodeFormat;
import y8.d;
import java.io.IOException;
import r8.l;
import p8.g;
import y8.o;
import android.graphics.ImageDecoder$Source;
import p8.h;

public abstract class b<T> implements h<ImageDecoder$Source, T>
{
    public final o a;
    
    public b() {
        if (o.j == null) {
            synchronized (o.class) {
                if (o.j == null) {
                    o.j = new o();
                }
            }
        }
        this.a = o.j;
    }
    
    public final d c(final ImageDecoder$Source imageDecoder$Source, final int n, final int n2, final g g) throws IOException {
        final DecodeFormat decodeFormat = (DecodeFormat)g.a(com.bumptech.glide.load.resource.bitmap.a.f);
        final DownsampleStrategy downsampleStrategy = (DownsampleStrategy)g.a(DownsampleStrategy.h);
        final f j = com.bumptech.glide.load.resource.bitmap.a.j;
        return this.d(imageDecoder$Source, n, n2, new x8.a(this, n, n2, g.a(j) != null && (boolean)g.a(j), decodeFormat, downsampleStrategy, (PreferredColorSpace)g.a(com.bumptech.glide.load.resource.bitmap.a.g)));
    }
    
    public abstract d d(final ImageDecoder$Source p0, final int p1, final int p2, final x8.a p3) throws IOException;
}
