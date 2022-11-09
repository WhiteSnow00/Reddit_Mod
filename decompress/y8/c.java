// 
// Decompiled by Procyon v0.6.0
// 

package y8;

import java.io.IOException;
import android.util.Log;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder;
import x8.a;
import android.graphics.ImageDecoder$Source;
import s8.e;
import android.graphics.Bitmap;
import x8.b;

public final class c extends b<Bitmap>
{
    public final e b;
    
    public c() {
        this.b = new e();
    }
    
    @Override
    public final d d(final ImageDecoder$Source imageDecoder$Source, final int n, final int n2, final a a) throws IOException {
        final Bitmap decodeBitmap = ImageDecoder.decodeBitmap(imageDecoder$Source, a);
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            final StringBuilder k = a.k("Decoded [");
            k.append(decodeBitmap.getWidth());
            k.append("x");
            k.append(decodeBitmap.getHeight());
            k.append("] for [");
            k.append(n);
            k.append("x");
            k.append(n2);
            k.append("]");
            Log.v("BitmapImageDecoder", k.toString());
        }
        return new d((s8.d)this.b, decodeBitmap);
    }
}
