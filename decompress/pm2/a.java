// 
// Decompiled by Procyon v0.6.0
// 

package pm2;

import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public final class a
{
    public static byte[] a(final InputStream inputStream) throws IOException {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final byte[] array = new byte[4096];
        while (true) {
            final int read = inputStream.read(array, 0, 4096);
            if (read < 0) {
                break;
            }
            byteArrayOutputStream.write(array, 0, read);
        }
        return byteArrayOutputStream.toByteArray();
    }
    
    public static int b(final InputStream inputStream, final byte[] array, final int n) throws IOException {
        int i;
        int read;
        for (i = 0; i < n; i += read) {
            read = inputStream.read(array, 0 + i, n - i);
            if (read < 0) {
                break;
            }
        }
        return i;
    }
}
