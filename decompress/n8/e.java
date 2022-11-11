// 
// Decompiled by Procyon v0.6.0
// 

package n8;

import java.nio.ByteBuffer;
import q8.l;
import java.io.IOException;
import com.bumptech.glide.integration.webp.WebpHeaderParser;
import o8.g;
import android.graphics.Bitmap;
import java.io.InputStream;
import o8.h;

public final class e implements h<InputStream, Bitmap>
{
    public final a a;
    
    public e(final a a) {
        this.a = a;
    }
    
    @Override
    public final boolean a(final Object o, final g g) throws IOException {
        final InputStream inputStream = (InputStream)o;
        final a a = this.a;
        a.getClass();
        final boolean booleanValue = g.a(n8.a.d);
        boolean b = false;
        if (!booleanValue) {
            if (WebpHeaderParser.b(inputStream, a.a) == WebpHeaderParser.WebpImageType.WEBP_EXTENDED_ANIMATED) {
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public final l b(final Object o, final int n, final int n2, final g g) throws IOException {
        final InputStream inputStream = (InputStream)o;
        final a a = this.a;
        a.getClass();
        final byte[] u = ml0.a.U(inputStream);
        Object a2;
        if (u == null) {
            a2 = null;
        }
        else {
            a2 = a.a(ByteBuffer.wrap(u), n, n2);
        }
        return (l)a2;
    }
}
