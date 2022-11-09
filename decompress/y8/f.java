// 
// Decompiled by Procyon v0.6.0
// 

package y8;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import com.bumptech.glide.load.resource.bitmap.a$b;
import com.bumptech.glide.load.resource.bitmap.b;
import java.io.InputStream;
import com.bumptech.glide.load.resource.bitmap.b$a;
import r8.l;
import p8.g;
import com.bumptech.glide.load.resource.bitmap.a;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import p8.h;

public final class f implements h<ByteBuffer, Bitmap>
{
    public final a a;
    
    public f(final a a) {
        this.a = a;
    }
    
    @Override
    public final l a(final Object o, final int n, final int n2, final g g) throws IOException {
        final ByteBuffer byteBuffer = (ByteBuffer)o;
        final AtomicReference<byte[]> a = l9.a.a;
        final l9.a.a a2 = new l9.a.a(byteBuffer);
        final a a3 = this.a;
        return a3.a((b)new b$a(a3.c, (InputStream)a2, a3.d), n, n2, g, (a$b)com.bumptech.glide.load.resource.bitmap.a.l);
    }
    
    @Override
    public final boolean b(final Object o, final g g) throws IOException {
        final ByteBuffer byteBuffer = (ByteBuffer)o;
        this.a.getClass();
        return true;
    }
}
