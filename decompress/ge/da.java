// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import java.security.SecureRandom;

public final class da
{
    public static final ca a;
    
    static {
        a = new ca();
    }
    
    public static byte[] a(final int n) {
        final byte[] array = new byte[n];
        da.a.get().nextBytes(array);
        return array;
    }
}
