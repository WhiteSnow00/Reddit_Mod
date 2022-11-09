// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;

public abstract class e4
{
    public int[] a;
    public final int b;
    
    public e4(final byte[] array, final int b) throws InvalidKeyException {
        if (array.length == 32) {
            this.a = a4.c(array);
            this.b = b;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }
    
    public abstract int a();
    
    public abstract int[] b(final int p0, final int[] p1);
    
    public final ByteBuffer c(int i, final byte[] array) {
        final int[] b = this.b(i, a4.c(array));
        final int[] array2 = b.clone();
        a4.b(array2);
        for (i = 0; i < 16; ++i) {
            b[i] += array2[i];
        }
        final ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b, 0, 16);
        return order;
    }
}
