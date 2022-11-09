// 
// Decompiled by Procyon v0.6.0
// 

package cb;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataSink;
import org.chromium.net.UploadDataProvider;

public final class a extends UploadDataProvider
{
    public final byte[] f;
    public int g;
    
    public a(final byte[] f) {
        this.f = f;
    }
    
    public final long getLength() {
        return this.f.length;
    }
    
    public final void read(final UploadDataSink uploadDataSink, final ByteBuffer byteBuffer) throws IOException {
        final int min = Math.min(byteBuffer.remaining(), this.f.length - this.g);
        byteBuffer.put(this.f, this.g, min);
        this.g += min;
        uploadDataSink.onReadSucceeded(false);
    }
    
    public final void rewind(final UploadDataSink uploadDataSink) throws IOException {
        this.g = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
