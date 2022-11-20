// 
// Decompiled by Procyon v0.6.0
// 

package y8;

import java.security.MessageDigest;
import s8.d;
import com.bumptech.glide.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import p8.j;

public final class m implements j<Drawable>
{
    public final j<Bitmap> a;
    public final boolean b;
    
    public m(final j<Bitmap> a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof m && this.a.equals(((m)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final r8.m<Drawable> transform(final Context context, final r8.m<Drawable> m, final int n, final int n2) {
        final s8.d f = com.bumptech.glide.b.b(context).f;
        final Drawable drawable = m.get();
        final e a = l.a(f, drawable, n, n2);
        if (a == null) {
            if (!this.b) {
                return m;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Unable to convert ");
            sb.append(drawable);
            sb.append(" to a Bitmap");
            throw new IllegalArgumentException(sb.toString());
        }
        else {
            final r8.m<Bitmap> transform = this.a.transform(context, (r8.m<Bitmap>)a, n, n2);
            if (transform.equals(a)) {
                transform.recycle();
                return m;
            }
            return (r8.m<Drawable>)new r(context.getResources(), (r8.m)transform);
        }
    }
    
    @Override
    public final void updateDiskCacheKey(final MessageDigest messageDigest) {
        this.a.updateDiskCacheKey(messageDigest);
    }
}
