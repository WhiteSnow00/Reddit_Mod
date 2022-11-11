// 
// Decompiled by Procyon v0.6.0
// 

package x8;

import java.security.MessageDigest;
import android.graphics.Bitmap;
import o8.d;

public final class n extends e
{
    public static final byte[] a;
    
    static {
        a = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(d.c);
    }
    
    public final Bitmap a(final r8.d d, final Bitmap bitmap, final int n, final int n2) {
        return v.c(d, bitmap, n, n2);
    }
    
    public final boolean equals(final Object o) {
        return o instanceof n;
    }
    
    public final int hashCode() {
        return 1572326941;
    }
    
    public final void updateDiskCacheKey(final MessageDigest messageDigest) {
        messageDigest.update(n.a);
    }
}
