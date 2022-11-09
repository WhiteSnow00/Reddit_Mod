// 
// Decompiled by Procyon v0.6.0
// 

package y8;

import ag0.a;
import com.bumptech.glide.c;
import r8.l;
import android.content.Context;
import s8.d;
import android.graphics.Bitmap;
import p8.j;

public abstract class e implements j<Bitmap>
{
    public abstract Bitmap a(final d p0, final Bitmap p1, final int p2, final int p3);
    
    public final l<Bitmap> transform(final Context context, l<Bitmap> b, int height, final int n) {
        if (l9.j.i(height, n)) {
            final d f = c.b(context).f;
            final Bitmap bitmap = b.get();
            int width;
            if ((width = height) == Integer.MIN_VALUE) {
                width = bitmap.getWidth();
            }
            if ((height = n) == Integer.MIN_VALUE) {
                height = bitmap.getHeight();
            }
            final Bitmap a = this.a(f, bitmap, width, height);
            if (!bitmap.equals(a)) {
                b = y8.d.b(f, a);
            }
            return b;
        }
        throw new IllegalArgumentException(a.n("Cannot apply transformation on width: ", height, " or height: ", n, " less than or equal to zero and not Target.SIZE_ORIGINAL"));
    }
}
