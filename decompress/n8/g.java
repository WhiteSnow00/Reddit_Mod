// 
// Decompiled by Procyon v0.6.0
// 

package n8;

import ml0.a;
import q8.l;
import java.io.IOException;
import com.bumptech.glide.integration.webp.WebpHeaderParser;
import r8.b;
import java.nio.ByteBuffer;
import o8.f;
import java.io.InputStream;
import o8.h;

public final class g implements h<InputStream, k>
{
    public static final f<Boolean> c;
    public final h<ByteBuffer, k> a;
    public final b b;
    
    static {
        c = f.a(Boolean.FALSE, "com.bumptech.glide.integration.webp.decoder.StreamWebpDecoder.DisableAnimation");
    }
    
    public g(final d a, final b b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean a(final Object o, final o8.g g) throws IOException {
        final InputStream inputStream = (InputStream)o;
        final boolean booleanValue = g.a(g.c);
        boolean b = false;
        if (!booleanValue) {
            if (WebpHeaderParser.b(inputStream, this.b) == WebpHeaderParser.WebpImageType.WEBP_EXTENDED_ANIMATED) {
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public final l b(final Object o, final int n, final int n2, final o8.g g) throws IOException {
        final byte[] u = ml0.a.U((InputStream)o);
        l b;
        if (u == null) {
            b = null;
        }
        else {
            b = this.a.b(ByteBuffer.wrap(u), n, n2, g);
        }
        return b;
    }
}
