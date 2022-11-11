// 
// Decompiled by Procyon v0.6.0
// 

package rm2;

import java.security.PrivilegedAction;

public final class f implements PrivilegedAction
{
    public final /* synthetic */ String a;
    
    public f(final String a) {
        this.a = a;
    }
    
    @Override
    public final Object run() {
        return System.getProperty(this.a);
    }
}
