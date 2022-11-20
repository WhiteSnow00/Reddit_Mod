// 
// Decompiled by Procyon v0.6.0
// 

package x8;

import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import p8.f;
import com.bumptech.glide.load.resource.bitmap.a;
import com.bumptech.glide.load.DecodeFormat;
import y8.e;
import java.io.IOException;
import r8.m;
import p8.g;
import y8.p;
import android.graphics.ImageDecoder$Source;
import p8.h;

public abstract class b<T> implements h<ImageDecoder$Source, T>
{
    public final p a;
    
    public b() {
        if (p.j == null) {
            synchronized (p.class) {
                if (p.j == null) {
                    p.j = new p();
                }
            }
        }
        this.a = p.j;
    }
    
    @Override
    public final /* bridge */ m a(final Object o, final int n, final int n2, final g g) throws IOException {
        return (m)this.c((ImageDecoder$Source)o, n, n2, g);
    }
    
    @Override
    public final /* bridge */ boolean b(final Object o, final g g) throws IOException {
        final ImageDecoder$Source imageDecoder$Source = (ImageDecoder$Source)o;
        return true;
    }
    
    public final e c(final ImageDecoder$Source imageDecoder$Source, final int n, final int n2, final g g) throws IOException {
        final DecodeFormat decodeFormat = g.a((f<DecodeFormat>)com.bumptech.glide.load.resource.bitmap.a.f);
        final DownsampleStrategy downsampleStrategy = g.a((f<DownsampleStrategy>)DownsampleStrategy.h);
        final f j = com.bumptech.glide.load.resource.bitmap.a.j;
        return this.d(imageDecoder$Source, n, n2, new x8.a(this, n, n2, g.a((f<Object>)j) != null && g.a((f<Boolean>)j), decodeFormat, downsampleStrategy, g.a((f<PreferredColorSpace>)com.bumptech.glide.load.resource.bitmap.a.g)));
    }
    
    public abstract e d(final ImageDecoder$Source p0, final int p1, final int p2, final x8.a p3) throws IOException;
}
