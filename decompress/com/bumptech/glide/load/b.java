// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load;

import java.io.IOException;
import java.nio.ByteBuffer;

public final class b implements a
{
    public final /* synthetic */ ByteBuffer a;
    
    public b(final ByteBuffer a) {
        this.a = a;
    }
    
    @Override
    public final ImageHeaderParser.ImageType a(final ImageHeaderParser imageHeaderParser) throws IOException {
        return imageHeaderParser.b(this.a);
    }
}
