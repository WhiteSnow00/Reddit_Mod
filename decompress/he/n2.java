// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.util.Set;
import java.security.GeneralSecurityException;

public final class n2 implements p2
{
    public final f6 a;
    
    public n2(final f6 a) {
        this.a = a;
    }
    
    public final k2 a(final Class clazz) throws GeneralSecurityException {
        try {
            return (k2)new m2(this.a, clazz);
        }
        catch (final IllegalArgumentException ex) {
            throw new GeneralSecurityException("Primitive type not supported", ex);
        }
    }
    
    public final k2 r() {
        final f6 a = this.a;
        return (k2)new m2(a, a.c);
    }
    
    public final Class s() {
        return this.a.getClass();
    }
    
    public final Set t() {
        return this.a.b.keySet();
    }
    
    public final Class u() {
        return null;
    }
}
