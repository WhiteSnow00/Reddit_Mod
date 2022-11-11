// 
// Decompiled by Procyon v0.6.0
// 

package j9;

import java.security.MessageDigest;
import ml0.a;

public final class d implements o8.d
{
    public final Object a;
    
    public d(final Object a) {
        ml0.a.l(a);
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof d && this.a.equals(((d)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return wu.a.b(a.r("ObjectKey{object="), this.a, '}');
    }
    
    @Override
    public final void updateDiskCacheKey(final MessageDigest messageDigest) {
        messageDigest.update(this.a.toString().getBytes(o8.d.c));
    }
}
