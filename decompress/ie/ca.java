// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

public final class ca extends ThreadLocal
{
    public final /* synthetic */ da a;
    
    public ca(final da a) {
        this.a = a;
    }
    
    public final Object initialValue() {
        try {
            final Mac mac = (Mac)u9.f.a(this.a.g);
            mac.init(this.a.h);
            return mac;
        }
        catch (final GeneralSecurityException ex) {
            throw new IllegalStateException(ex);
        }
    }
}
