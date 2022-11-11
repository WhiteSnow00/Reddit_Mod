// 
// Decompiled by Procyon v0.6.0
// 

package n8;

import java.io.IOException;
import com.bumptech.glide.integration.webp.decoder.WebpFrameCacheStrategy;
import com.bumptech.glide.integration.webp.WebpImage;
import java.nio.ByteBuffer;
import r8.d;
import r8.b;
import o8.f;

public final class a
{
    public static final f<Boolean> d;
    public final b a;
    public final d b;
    public final b9.b c;
    
    static {
        d = f.a(Boolean.FALSE, "com.bumptech.glide.integration.webp.decoder.AnimatedWebpBitmapDecoder.DisableBitmap");
    }
    
    public a(final b a, final d b) {
        this.a = a;
        this.b = b;
        this.c = new b9.b(a, b);
    }
    
    public final x8.d a(ByteBuffer byteBuffer, int n, final int n2) throws IOException {
        final int remaining = byteBuffer.remaining();
        final byte[] array = new byte[remaining];
        byteBuffer.get(array, 0, remaining);
        final WebpImage create = WebpImage.create(array);
        n = ml0.a.N(create.getWidth(), create.getHeight(), n, n2);
        byteBuffer = (ByteBuffer)new i(this.c, create, byteBuffer, n, WebpFrameCacheStrategy.b);
        try {
            ((i)byteBuffer).a();
            return x8.d.b(this.b, ((i)byteBuffer).getNextFrame());
        }
        finally {
            ((i)byteBuffer).clear();
        }
    }
}
