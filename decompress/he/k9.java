// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.util.Arrays;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class k9 implements e2
{
    public final h4 a;
    
    public k9(final byte[] array) throws GeneralSecurityException {
        this.a = new h4(array);
    }
    
    public final byte[] a(final byte[] array, final byte[] array2) throws GeneralSecurityException {
        final int length = array.length;
        if (length >= 28) {
            return ((i4)this.a).b(ByteBuffer.wrap(array, 12, length - 12), Arrays.copyOf(array, 12), array2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
    
    public final byte[] b(final byte[] array, final byte[] array2) throws GeneralSecurityException {
        throw null;
    }
}
