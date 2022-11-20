// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.security.InvalidKeyException;
import java.security.GeneralSecurityException;

public final class k4 extends i4
{
    public k4(final byte[] array) throws GeneralSecurityException {
        super(array);
    }
    
    public final g4 a(final int n, final byte[] array) throws InvalidKeyException {
        return new j4(array, n);
    }
}
