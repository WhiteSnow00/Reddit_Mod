// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.util.Arrays;
import java.security.InvalidKeyException;

public final class j4 extends g4
{
    public j4(final byte[] array, final int n) throws InvalidKeyException {
        super(array, n);
    }
    
    public final int a() {
        return 24;
    }
    
    public final int[] b(final int n, final int[] array) {
        final int length = array.length;
        if (length == 6) {
            final int[] array2 = new int[16];
            final int[] a = super.a;
            final int[] array3 = new int[16];
            final int[] a2 = c4.a;
            System.arraycopy(a2, 0, array3, 0, a2.length);
            System.arraycopy(a, 0, array3, a2.length, 8);
            array3[12] = array[0];
            array3[13] = array[1];
            array3[14] = array[2];
            array3[15] = array[3];
            c4.b(array3);
            array3[4] = array3[12];
            array3[5] = array3[13];
            array3[6] = array3[14];
            array3[7] = array3[15];
            final int[] copy = Arrays.copyOf(array3, 8);
            System.arraycopy(a2, 0, array2, 0, a2.length);
            System.arraycopy(copy, 0, array2, a2.length, 8);
            array2[12] = n;
            array2[13] = 0;
            array2[14] = array[4];
            array2[15] = array[5];
            return array2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", length * 32));
    }
}
