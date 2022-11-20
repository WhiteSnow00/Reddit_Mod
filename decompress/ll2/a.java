// 
// Decompiled by Procyon v0.6.0
// 

package ll2;

import java.security.PrivilegedAction;

public final class a implements PrivilegedAction
{
    public final String a;
    
    public a(final String a) {
        this.a = a;
    }
    
    @Override
    public final Object run() {
        try {
            return Class.forName(this.a);
        }
        catch (final Exception ex) {
            return null;
        }
    }
}
