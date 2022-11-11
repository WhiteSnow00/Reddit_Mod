// 
// Decompiled by Procyon v0.6.0
// 

package x8;

import java.security.MessageDigest;
import android.graphics.Paint;
import android.util.Log;
import android.graphics.Bitmap;
import o8.d;

public final class i extends e
{
    public static final byte[] a;
    
    static {
        a = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(d.c);
    }
    
    public final Bitmap a(final r8.d d, final Bitmap bitmap, final int n, final int n2) {
        final Paint a = v.a;
        Bitmap c;
        if (bitmap.getWidth() <= n && bitmap.getHeight() <= n2) {
            c = bitmap;
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
                c = bitmap;
            }
        }
        else {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            c = v.c(d, bitmap, n, n2);
        }
        return c;
    }
    
    public final boolean equals(final Object o) {
        return o instanceof i;
    }
    
    public final int hashCode() {
        return -670243078;
    }
    
    public final void updateDiskCacheKey(final MessageDigest messageDigest) {
        messageDigest.update(i.a);
    }
}
