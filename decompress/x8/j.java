// 
// Decompiled by Procyon v0.6.0
// 

package x8;

import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Bitmap;
import o8.d;

public final class j extends e
{
    public static final byte[] a;
    
    static {
        a = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(d.c);
    }
    
    public final Bitmap a(final r8.d d, final Bitmap bitmap, int height, int min) {
        final Paint a = v.a;
        min = Math.min(height, min);
        final float n = (float)min;
        final float n2 = n / 2.0f;
        final int width = bitmap.getWidth();
        height = bitmap.getHeight();
        final float n3 = (float)width;
        final float n4 = n / n3;
        final float n5 = (float)height;
        final float max = Math.max(n4, n / n5);
        final float n6 = n3 * max;
        final float n7 = max * n5;
        final float n8 = (n - n6) / 2.0f;
        final float n9 = (n - n7) / 2.0f;
        final RectF rectF = new RectF(n8, n9, n6 + n8, n7 + n9);
        final Bitmap d2 = v.d(d, bitmap);
        final Bitmap value = d.get(min, min, v.e(bitmap));
        value.setHasAlpha(true);
        final Lock d3 = v.d;
        d3.lock();
        try {
            final Canvas canvas = new Canvas(value);
            canvas.drawCircle(n2, n2, n2, v.b);
            canvas.drawBitmap(d2, (Rect)null, rectF, v.c);
            canvas.setBitmap((Bitmap)null);
            d3.unlock();
            if (!d2.equals(bitmap)) {
                d.put(d2);
            }
            return value;
        }
        finally {
            v.d.unlock();
        }
    }
    
    public final boolean equals(final Object o) {
        return o instanceof j;
    }
    
    public final int hashCode() {
        return 1101716364;
    }
    
    public final void updateDiskCacheKey(final MessageDigest messageDigest) {
        messageDigest.update(j.a);
    }
}
