// 
// Decompiled by Procyon v0.6.0
// 

package y8;

import java.security.MessageDigest;
import s8.d;
import com.bumptech.glide.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import p8.j;

public final class l implements j<Drawable>
{
    public final j<Bitmap> a;
    public final boolean b;
    
    public l(final j<Bitmap> a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof l && this.a.equals(((l)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final r8.l<Drawable> transform(final Context context, final r8.l<Drawable> l, final int n, final int n2) {
        final d f = c.b(context).f;
        final Drawable drawable = l.get();
        final y8.d a = k.a(f, drawable, n, n2);
        if (a == null) {
            if (!this.b) {
                return l;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Unable to convert ");
            sb.append(drawable);
            sb.append(" to a Bitmap");
            throw new IllegalArgumentException(sb.toString());
        }
        else {
            final r8.l transform = this.a.transform(context, (r8.l)a, n, n2);
            if (transform.equals(a)) {
                transform.recycle();
                return l;
            }
            return (r8.l<Drawable>)new q(context.getResources(), transform);
        }
    }
    
    public final void updateDiskCacheKey(final MessageDigest messageDigest) {
        ((p8.d)this.a).updateDiskCacheKey(messageDigest);
    }
}
