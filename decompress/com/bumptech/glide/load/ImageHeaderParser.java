// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load;

import r8.b;
import java.nio.ByteBuffer;
import java.io.IOException;
import java.io.InputStream;

public interface ImageHeaderParser
{
    ImageType a(final InputStream p0) throws IOException;
    
    ImageType b(final ByteBuffer p0) throws IOException;
    
    int c(final InputStream p0, final b p1) throws IOException;
    
    public enum ImageType
    {
        GIF(true), 
        JPEG(false), 
        PNG(false), 
        PNG_A(true), 
        RAW(false), 
        UNKNOWN(false), 
        WEBP(false), 
        WEBP_A(true);
        
        private final boolean hasAlpha;
        
        private ImageType(final boolean hasAlpha) {
            this.hasAlpha = hasAlpha;
        }
        
        public boolean hasAlpha() {
            return this.hasAlpha;
        }
    }
}
