// 
// Decompiled by Procyon v0.6.0
// 

package w8;

import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import o8.f;
import com.bumptech.glide.load.resource.bitmap.a;
import com.bumptech.glide.load.DecodeFormat;
import x8.d;
import q8.l;
import java.io.IOException;
import o8.g;
import x8.o;
import android.graphics.ImageDecoder$Source;
import o8.h;

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
        final DecodeFormat decodeFormat = g.a((f<DecodeFormat>)com.bumptech.glide.load.resource.bitmap.a.f);
        final DownsampleStrategy downsampleStrategy = g.a(DownsampleStrategy.h);
        final f j = com.bumptech.glide.load.resource.bitmap.a.j;
        return this.d(imageDecoder$Source, n, n2, new w8.a(this, n, n2, g.a((f<Object>)j) != null && g.a((f<Boolean>)j), decodeFormat, downsampleStrategy, g.a((f<PreferredColorSpace>)com.bumptech.glide.load.resource.bitmap.a.g)));
    }
    
    public abstract d d(final ImageDecoder$Source p0, final int p1, final int p2, final w8.a p3) throws IOException;
}
