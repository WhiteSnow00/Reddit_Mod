// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.io.OutputStream;
import java.io.InputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.channels.Channels;
import android.os.Build$VERSION;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import com.bytedance.covode.number.Covode;

public final class 0Fp
{
    static {
        Covode.recordClassIndex(1681);
    }
    
    public static void LIZ(final ReadableByteChannel readableByteChannel, final FileChannel fileChannel) {
        try {
            if (Build$VERSION.SDK_INT > 23) {
                fileChannel.transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
            }
            else {
                final InputStream inputStream = Channels.newInputStream(readableByteChannel);
                final OutputStream outputStream = Channels.newOutputStream(fileChannel);
                final byte[] array = new byte[4096];
                while (true) {
                    final int read = inputStream.read(array);
                    if (read <= 0) {
                        break;
                    }
                    outputStream.write(array, 0, read);
                }
            }
            fileChannel.force(false);
        }
        finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }
}
