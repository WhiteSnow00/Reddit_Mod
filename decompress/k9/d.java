// 
// Decompiled by Procyon v0.6.0
// 

package k9;

import java.security.MessageDigest;
import t5.w;
import ah0.b;

public final class d implements p8.d
{
    public final Object a;
    
    public d(final Object a) {
        b.F(a);
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
        return w.h(a.t("ObjectKey{object="), this.a, '}');
    }
    
    @Override
    public final void updateDiskCacheKey(final MessageDigest messageDigest) {
        messageDigest.update(this.a.toString().getBytes(p8.d.c));
    }
}
