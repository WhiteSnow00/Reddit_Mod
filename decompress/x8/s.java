// 
// Decompiled by Procyon v0.6.0
// 

package x8;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import al0.f0;
import k9.j;
import android.graphics.Paint;
import android.graphics.Bitmap;
import ml0.a;
import o8.d;

public final class s extends e
{
    public static final byte[] b;
    public final int a;
    
    static {
        b = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(d.c);
    }
    
    public s(final int a) {
        ml0.a.i(a > 0, "roundingRadius must be greater than 0.");
        this.a = a;
    }
    
    public final Bitmap a(final r8.d d, final Bitmap bitmap, int a, final int n) {
        a = this.a;
        final Paint a2 = v.a;
        a.i(a > 0, "roundingRadius must be greater than 0.");
        return v.i(d, bitmap, (v.a)new t(a));
    }
    
    public final boolean equals(final Object o) {
        final boolean b = o instanceof s;
        boolean b2 = false;
        if (b) {
            final s s = (s)o;
            b2 = b2;
            if (this.a == s.a) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public final int hashCode() {
        final int a = this.a;
        final char[] a2 = j.a;
        return f0.a(a, 527, 31, -569625254);
    }
    
    public final void updateDiskCacheKey(final MessageDigest messageDigest) {
        messageDigest.update(s.b);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.a).array());
    }
}
