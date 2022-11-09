// 
// Decompiled by Procyon v0.6.0
// 

package y8;

import java.nio.ByteBuffer;
import java.io.IOException;
import q4.a;
import s8.b;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import com.bumptech.glide.load.ImageHeaderParser;

public final class m implements ImageHeaderParser
{
    public final ImageHeaderParser$ImageType a(final InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
    
    public final int b(final InputStream inputStream, final b b) throws IOException {
        int j;
        if ((j = new a(inputStream).j(1, "Orientation")) == 0) {
            j = -1;
        }
        return j;
    }
    
    public final ImageHeaderParser$ImageType c(final ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
