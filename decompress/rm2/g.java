// 
// Decompiled by Procyon v0.6.0
// 

package rm2;

import java.security.AccessControlException;
import java.util.Map;
import java.security.PrivilegedAction;
import java.security.AccessController;

public final class g
{
    public static final ThreadLocal a;
    
    static {
        a = new ThreadLocal();
    }
    
    public static boolean a(String s) {
        try {
            final String s2 = AccessController.doPrivileged((PrivilegedAction<String>)new e(s));
            if (s2 != null) {
                s = s2;
            }
            else {
                final Map map = g.a.get();
                if (map != null) {
                    final String s3 = (String)map.get(s);
                    if (s3 != null) {
                        s = s3;
                        return "true".equalsIgnoreCase(s);
                    }
                }
                s = AccessController.doPrivileged((PrivilegedAction<String>)new f(s));
            }
            return "true".equalsIgnoreCase(s);
        }
        catch (final AccessControlException ex) {
            return false;
        }
    }
}
