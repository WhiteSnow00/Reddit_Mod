// 
// Decompiled by Procyon v0.6.0
// 

package c9;

import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import o8.g;
import q8.l;
import android.graphics.Bitmap$CompressFormat;
import android.graphics.Bitmap;

public final class a implements b<Bitmap, byte[]>
{
    public final Bitmap$CompressFormat f;
    public final int g;
    
    public a() {
        final Bitmap$CompressFormat jpeg = Bitmap$CompressFormat.JPEG;
        this.f = jpeg;
        this.g = 100;
    }
    
    @Override
    public final l<byte[]> i(final l<Bitmap> l, final g g) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap)l.get()).compress(this.f, this.g, (OutputStream)byteArrayOutputStream);
        l.recycle();
        return (l<byte[]>)new y8.b(byteArrayOutputStream.toByteArray());
    }
}
