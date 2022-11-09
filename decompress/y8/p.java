// 
// Decompiled by Procyon v0.6.0
// 

package y8;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;
import java.io.ByteArrayOutputStream;
import l9.a;
import r8.l;
import p8.g;
import android.graphics.Bitmap;
import java.io.InputStream;
import p8.h;

public final class p implements h<InputStream, Bitmap>
{
    public final c a;
    
    public p() {
        this.a = new c();
    }
    
    @Override
    public final l a(final Object o, final int n, final int n2, final g g) throws IOException {
        final InputStream inputStream = (InputStream)o;
        final AtomicReference<byte[]> a = l9.a.a;
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] array;
        if ((array = l9.a.a.getAndSet(null)) == null) {
            array = new byte[16384];
        }
        while (true) {
            final int read = inputStream.read(array);
            if (read < 0) {
                break;
            }
            byteArrayOutputStream.write(array, 0, read);
        }
        l9.a.a.set(array);
        final byte[] byteArray = byteArrayOutputStream.toByteArray();
        return this.a.c(ImageDecoder.createSource((ByteBuffer)ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0)), n, n2, g);
    }
}
