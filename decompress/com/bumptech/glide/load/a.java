// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load;

import java.io.IOException;
import java.io.InputStream;

public final class a implements d$a
{
    public final InputStream a;
    
    public a(final InputStream a) {
        this.a = a;
    }
    
    public final ImageHeaderParser$ImageType a(final ImageHeaderParser imageHeaderParser) throws IOException {
        try {
            return imageHeaderParser.a(this.a);
        }
        finally {
            this.a.reset();
        }
    }
}
