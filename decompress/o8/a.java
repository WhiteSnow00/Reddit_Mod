// 
// Decompiled by Procyon v0.6.0
// 

package o8;

import java.io.IOException;
import com.bumptech.glide.integration.webp.decoder.WebpFrameCacheStrategy;
import eg.n0;
import com.bumptech.glide.integration.webp.WebpImage;
import java.nio.ByteBuffer;
import s8.d;
import s8.b;
import p8.f;

public final class a
{
    public static final f<Boolean> d;
    public final b a;
    public final d b;
    public final c9.b c;
    
    static {
        d = f.a(Boolean.FALSE, "com.bumptech.glide.integration.webp.decoder.AnimatedWebpBitmapDecoder.DisableBitmap");
    }
    
    public a(final b a, final d b) {
        this.a = a;
        this.b = b;
        this.c = new c9.b(a, b);
    }
    
    public final y8.d a(ByteBuffer byteBuffer, int s, final int n) throws IOException {
        final int remaining = byteBuffer.remaining();
        final byte[] array = new byte[remaining];
        byteBuffer.get(array, 0, remaining);
        final WebpImage create = WebpImage.create(array);
        s = n0.S(create.getWidth(), create.getHeight(), s, n);
        byteBuffer = (ByteBuffer)new i(this.c, create, byteBuffer, s, WebpFrameCacheStrategy.b);
        try {
            ((i)byteBuffer).a();
            return y8.d.b(this.b, ((i)byteBuffer).getNextFrame());
        }
        finally {
            ((i)byteBuffer).clear();
        }
    }
}
