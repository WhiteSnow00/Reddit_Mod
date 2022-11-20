// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load;

import java.io.IOException;
import java.nio.ByteBuffer;

public final class b implements d$a
{
    public final ByteBuffer a;
    
    public b(final ByteBuffer a) {
        this.a = a;
    }
    
    public final ImageHeaderParser$ImageType a(final ImageHeaderParser imageHeaderParser) throws IOException {
        return imageHeaderParser.c(this.a);
    }
}
