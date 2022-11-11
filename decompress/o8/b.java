// 
// Decompiled by Procyon v0.6.0
// 

package o8;

import java.io.IOException;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;

public final class b
{
    public final /* synthetic */ InputStream a;
    public final /* synthetic */ r8.b b;
    
    public b(final InputStream a, final r8.b b) {
        this.a = a;
        this.b = b;
    }
    
    public final int a(final ImageHeaderParser imageHeaderParser) throws IOException {
        try {
            return imageHeaderParser.c(this.a, this.b);
        }
        finally {
            this.a.reset();
        }
    }
}
