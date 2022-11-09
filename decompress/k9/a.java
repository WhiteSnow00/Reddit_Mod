// 
// Decompiled by Procyon v0.6.0
// 

package k9;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import l9.j;
import p8.d;

public final class a implements d
{
    public final int a;
    public final d b;
    
    public a(final int a, final d b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof a;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final a a = (a)o;
            b3 = b2;
            if (this.a == a.a) {
                b3 = b2;
                if (this.b.equals(a.b)) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        return j.g(this.a, this.b);
    }
    
    @Override
    public final void updateDiskCacheKey(final MessageDigest messageDigest) {
        this.b.updateDiskCacheKey(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.a).array());
    }
}
