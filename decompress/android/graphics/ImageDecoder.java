// 
// Decompiled by Procyon v0.6.0
// 

package android.graphics;

import android.annotation.Nullable;
import java.io.IOException;
import android.annotation.NonNull;
import java.nio.ByteBuffer;

public final class ImageDecoder implements AutoCloseable
{
    static {
        throw new NoClassDefFoundError();
    }
    
    @NonNull
    public static native ImageDecoder$Source createSource(@NonNull final ByteBuffer p0);
    
    @NonNull
    public static native Bitmap decodeBitmap(@NonNull final ImageDecoder$Source p0, @NonNull final ImageDecoder$OnHeaderDecodedListener p1) throws IOException;
    
    public native void setAllocator(final int p0);
    
    public native void setMemorySizePolicy(final int p0);
    
    public native void setOnPartialImageListener(@Nullable final ImageDecoder$OnPartialImageListener p0);
    
    public native void setTargetColorSpace(final ColorSpace p0);
    
    public native void setTargetSize(final int p0, final int p1);
}
