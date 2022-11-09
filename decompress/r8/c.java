// 
// Decompiled by Procyon v0.6.0
// 

package r8;

import java.security.MessageDigest;
import p8.d;

public final class c implements d
{
    public final d a;
    public final d b;
    
    public c(final d a, final d b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof c;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final c c = (c)o;
            b3 = b2;
            if (this.a.equals(c.a)) {
                b3 = b2;
                if (this.b.equals(c.b)) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("DataCacheKey{sourceKey=");
        k.append(this.a);
        k.append(", signature=");
        k.append(this.b);
        k.append('}');
        return k.toString();
    }
    
    @Override
    public final void updateDiskCacheKey(final MessageDigest messageDigest) {
        this.a.updateDiskCacheKey(messageDigest);
        this.b.updateDiskCacheKey(messageDigest);
    }
}
