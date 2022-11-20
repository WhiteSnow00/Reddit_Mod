// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.security.GeneralSecurityException;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class r9 implements e2
{
    public final x9 a;
    public final z2 b;
    public final int c;
    
    public r9(final x9 a, final z2 b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final byte[] a(byte[] copyOfRange, final byte[] array) throws GeneralSecurityException {
        final int length = copyOfRange.length;
        final int c = this.c;
        if (length >= c) {
            final byte[] copyOfRange2 = Arrays.copyOfRange(copyOfRange, 0, length - c);
            copyOfRange = Arrays.copyOfRange(copyOfRange, length - this.c, length);
            this.b.a(copyOfRange, g2.j(new byte[][] { array, copyOfRange2, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8) }));
            return this.a.a(copyOfRange2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
    
    public final byte[] b(final byte[] array, final byte[] array2) throws GeneralSecurityException {
        throw null;
    }
}
