// 
// Decompiled by Procyon v0.6.0
// 

package d9;

import z8.b;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import p8.g;
import r8.m;
import android.graphics.Bitmap$CompressFormat;
import android.graphics.Bitmap;

public final class a implements c<Bitmap, byte[]>
{
    public final Bitmap$CompressFormat f;
    public final int g;
    
    public a() {
        final Bitmap$CompressFormat jpeg = Bitmap$CompressFormat.JPEG;
        this.f = jpeg;
        this.g = 100;
    }
    
    public final m<byte[]> f(final m<Bitmap> m, final g g) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m.get().compress(this.f, this.g, (OutputStream)byteArrayOutputStream);
        m.recycle();
        return new b(byteArrayOutputStream.toByteArray());
    }
}
