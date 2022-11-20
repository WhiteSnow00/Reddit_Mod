// 
// Decompiled by Procyon v0.6.0
// 

package y8;

import b5.k;
import com.bumptech.glide.b;
import r8.m;
import android.content.Context;
import s8.d;
import android.graphics.Bitmap;
import p8.j;

public abstract class f implements j<Bitmap>
{
    public abstract Bitmap a(final s8.d p0, final Bitmap p1, final int p2, final int p3);
    
    @Override
    public final m<Bitmap> transform(final Context context, m<Bitmap> b, int height, final int n) {
        if (l9.j.i(height, n)) {
            final s8.d f = b.b(context).f;
            final Bitmap bitmap = ((m<Bitmap>)b).get();
            int width;
            if ((width = height) == Integer.MIN_VALUE) {
                width = bitmap.getWidth();
            }
            if ((height = n) == Integer.MIN_VALUE) {
                height = bitmap.getHeight();
            }
            final Bitmap a = this.a(f, bitmap, width, height);
            if (!bitmap.equals(a)) {
                b = e.b(f, a);
            }
            return (m<Bitmap>)b;
        }
        throw new IllegalArgumentException(k.j("Cannot apply transformation on width: ", height, " or height: ", n, " less than or equal to zero and not Target.SIZE_ORIGINAL"));
    }
}
