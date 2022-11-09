// 
// Decompiled by Procyon v0.6.0
// 

package y8;

import java.io.IOException;
import android.graphics.ImageDecoder;
import r8.l;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import p8.h;

public final class g implements h<ByteBuffer, Bitmap>
{
    public final c a;
    
    public g() {
        this.a = new c();
    }
    
    @Override
    public final l a(final Object o, final int n, final int n2, final p8.g g) throws IOException {
        return this.a.c(ImageDecoder.createSource((ByteBuffer)o), n, n2, g);
    }
}
