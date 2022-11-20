// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.util.Set;
import java.security.GeneralSecurityException;

public final class o2 implements p2
{
    public final o6 a;
    public final f6 b;
    
    public o2(final o6 a, final u3 b) {
        this.a = a;
        this.b = b;
    }
    
    public final k2 a(final Class clazz) throws GeneralSecurityException {
        try {
            return (k2)new g3(this.a, this.b, clazz);
        }
        catch (final IllegalArgumentException ex) {
            throw new GeneralSecurityException("Primitive type not supported", ex);
        }
    }
    
    public final k2 r() {
        final o6 a = this.a;
        return (k2)new g3(a, this.b, a.c);
    }
    
    public final Class s() {
        return this.a.getClass();
    }
    
    public final Set t() {
        return this.a.b.keySet();
    }
    
    public final Class u() {
        return this.b.getClass();
    }
}
