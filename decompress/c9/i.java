// 
// Decompiled by Procyon v0.6.0
// 

package c9;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.d;
import java.io.IOException;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import r8.l;
import p8.g;
import s8.b;
import java.nio.ByteBuffer;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.List;
import java.io.InputStream;
import p8.h;

public final class i implements h<InputStream, c>
{
    public final List<ImageHeaderParser> a;
    public final h<ByteBuffer, c> b;
    public final b c;
    
    public i(final List a, final a b, final b c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final l a(final Object o, final int n, final int n2, final g g) throws IOException {
        final InputStream inputStream = (InputStream)o;
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        final l l = null;
        byte[] byteArray;
        try {
            final byte[] array = new byte[16384];
            while (true) {
                final int read = inputStream.read(array);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(array, 0, read);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        }
        catch (final IOException ex) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", (Throwable)ex);
            }
            byteArray = null;
        }
        l<c> a;
        if (byteArray == null) {
            a = l;
        }
        else {
            a = this.b.a(ByteBuffer.wrap(byteArray), n, n2, g);
        }
        return a;
    }
    
    @Override
    public final boolean b(final Object o, final g g) throws IOException {
        final InputStream inputStream = (InputStream)o;
        return !(boolean)g.a(c9.h.b) && d.b(this.c, inputStream, (List)this.a) == ImageHeaderParser$ImageType.GIF;
    }
}
