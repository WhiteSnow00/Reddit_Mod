// 
// Decompiled by Procyon v0.6.0
// 

package rm2;

import java.security.Security;
import java.security.PrivilegedAction;

public final class e implements PrivilegedAction
{
    public final /* synthetic */ String a;
    
    public e(final String a) {
        this.a = a;
    }
    
    @Override
    public final Object run() {
        return Security.getProperty(this.a);
    }
}
