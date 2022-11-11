// 
// Decompiled by Procyon v0.6.0
// 

package n8;

import com.bumptech.glide.c;
import com.bumptech.glide.integration.webp.decoder.WebpFrameCacheStrategy;
import ml0.a;
import com.bumptech.glide.integration.webp.WebpImage;
import q8.l;
import java.io.IOException;
import com.bumptech.glide.integration.webp.WebpHeaderParser$b;
import com.bumptech.glide.integration.webp.WebpHeaderParser;
import o8.g;
import b9.b;
import android.content.Context;
import o8.f;
import java.nio.ByteBuffer;
import o8.h;

public final class d implements h<ByteBuffer, k>
{
    public static final f<Boolean> d;
    public final Context a;
    public final r8.d b;
    public final b c;
    
    static {
        d = f.a(Boolean.FALSE, "com.bumptech.glide.integration.webp.decoder.ByteBufferWebpDecoder.DisableAnimation");
    }
    
    public d(final Context context, final r8.b b, final r8.d b2) {
        this.a = context.getApplicationContext();
        this.b = b2;
        this.c = new b(b, b2);
    }
    
    @Override
    public final boolean a(final Object o, final g g) throws IOException {
        final ByteBuffer byteBuffer = (ByteBuffer)o;
        final boolean booleanValue = g.a(n8.d.d);
        boolean b = false;
        if (!booleanValue) {
            WebpHeaderParser.WebpImageType webpImageType;
            if (byteBuffer == null) {
                webpImageType = WebpHeaderParser.WebpImageType.NONE_WEBP;
            }
            else {
                webpImageType = WebpHeaderParser.a((WebpHeaderParser.c)new WebpHeaderParser$b(byteBuffer));
            }
            if (webpImageType == WebpHeaderParser.WebpImageType.WEBP_EXTENDED_ANIMATED) {
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public final l b(final Object o, final int n, final int n2, final g g) throws IOException {
        final ByteBuffer byteBuffer = (ByteBuffer)o;
        final int remaining = byteBuffer.remaining();
        final byte[] array = new byte[remaining];
        byteBuffer.get(array, 0, remaining);
        final WebpImage create = WebpImage.create(array);
        final i i = new i(this.c, create, byteBuffer, ml0.a.N(create.getWidth(), create.getHeight(), n, n2), g.a(m.r));
        i.a();
        return (l)new n8.l(new k(new k.a(this.b, new m(com.bumptech.glide.c.b(this.a), i, n, n2, w8.d.a, i.getNextFrame()))));
    }
}
