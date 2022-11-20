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

public final class d extends b<Bitmap>
{
    public final e b;
    
    public d() {
        this.b = new e();
    }
    
    @Override
    public final y8.e d(final ImageDecoder$Source imageDecoder$Source, final int n, final int n2, final a a) throws IOException {
        final Bitmap decodeBitmap = ImageDecoder.decodeBitmap(imageDecoder$Source, a);
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            final StringBuilder t = a.t("Decoded [");
            t.append(decodeBitmap.getWidth());
            t.append("x");
            t.append(decodeBitmap.getHeight());
            t.append("] for [");
            t.append(n);
            t.append("x");
            t.append(n2);
            t.append("]");
            Log.v("BitmapImageDecoder", t.toString());
        }
        return new y8.e((s8.d)this.b, decodeBitmap);
    }
}
