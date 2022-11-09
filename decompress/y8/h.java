// 
// Decompiled by Procyon v0.6.0
// 

package y8;

import java.security.MessageDigest;
import android.graphics.Bitmap;
import p8.d;

public final class h extends e
{
    public static final byte[] a;
    
    static {
        a = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(d.c);
    }
    
    @Override
    public final Bitmap a(final s8.d d, final Bitmap bitmap, final int n, final int n2) {
        return v.b(d, bitmap, n, n2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof h;
    }
    
    @Override
    public final int hashCode() {
        return -599754482;
    }
    
    public final void updateDiskCacheKey(final MessageDigest messageDigest) {
        messageDigest.update(h.a);
    }
}
