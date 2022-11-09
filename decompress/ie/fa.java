// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.security.SecureRandom;
import qd.z1;

public final class fa
{
    public static final z1 a;
    
    static {
        a = new z1(1);
    }
    
    public static byte[] a(final int n) {
        final byte[] array = new byte[n];
        ((ThreadLocal<SecureRandom>)fa.a).get().nextBytes(array);
        return array;
    }
}
