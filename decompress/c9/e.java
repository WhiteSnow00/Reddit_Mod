// 
// Decompiled by Procyon v0.6.0
// 

package c9;

import java.security.MessageDigest;
import y8.d;
import r8.l;
import android.content.Context;
import ng.f0;
import android.graphics.Bitmap;
import p8.j;

public final class e implements j<c>
{
    public final j<Bitmap> a;
    
    public e(final j<Bitmap> a) {
        f0.a2(a);
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof e && this.a.equals(((e)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final l<c> transform(final Context context, final l<c> l, final int n, final int n2) {
        final c c = l.get();
        final d d = new d(com.bumptech.glide.c.b(context).f, c.f.a.l);
        final l transform = this.a.transform(context, (l)d, n, n2);
        if (!d.equals(transform)) {
            d.recycle();
        }
        c.f.a.c((j)this.a, (Bitmap)transform.get());
        return l;
    }
    
    public final void updateDiskCacheKey(final MessageDigest messageDigest) {
        ((p8.d)this.a).updateDiskCacheKey(messageDigest);
    }
}
