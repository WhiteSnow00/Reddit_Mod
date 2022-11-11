// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import java.nio.IntBuffer;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;

public final class a4
{
    public static final int[] a;
    
    static {
        a = c(new byte[] { 101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107 });
    }
    
    public static void a(int n, final int n2, final int n3, final int n4, final int[] array) {
        final int n5 = array[n] + array[n2];
        array[n] = n5;
        final int n6 = n5 ^ array[n4];
        final int n7 = n6 >>> -16 | n6 << 16;
        array[n4] = n7;
        final int n8 = array[n3] + n7;
        array[n3] = n8;
        final int n9 = array[n2] ^ n8;
        final int n10 = n9 >>> -12 | n9 << 12;
        array[n2] = n10;
        final int n11 = array[n] + n10;
        array[n] = n11;
        n = (array[n4] ^ n11);
        n = (n >>> -8 | n << 8);
        array[n4] = n;
        n += array[n3];
        array[n3] = n;
        n ^= array[n2];
        array[n2] = (n >>> -7 | n << 7);
    }
    
    public static void b(final int[] array) {
        for (int i = 0; i < 10; ++i) {
            a(0, 4, 8, 12, array);
            a(1, 5, 9, 13, array);
            a(2, 6, 10, 14, array);
            a(3, 7, 11, 15, array);
            a(0, 5, 10, 15, array);
            a(1, 6, 11, 12, array);
            a(2, 7, 8, 13, array);
            a(3, 4, 9, 14, array);
        }
    }
    
    public static int[] c(final byte[] array) {
        final IntBuffer intBuffer = ByteBuffer.wrap(array).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        final int[] array2 = new int[intBuffer.remaining()];
        intBuffer.get(array2);
        return array2;
    }
}
