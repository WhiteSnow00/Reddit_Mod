// 
// Decompiled by Procyon v0.6.0
// 

package rm2;

import java.math.BigInteger;

public final class b
{
    public static final BigInteger a;
    public static final BigInteger b;
    
    static {
        a = BigInteger.valueOf(0L);
        b = BigInteger.valueOf(1L);
        BigInteger.valueOf(2L);
        BigInteger.valueOf(3L);
        new BigInteger("8138e8a0fcf3a4e84a771d40fd305d7f4aa59306d7251de54d98af8fe95729a1f73d893fa424cd2edc8636a6c3285e022b0e3866a565ae8108eed8591cd4fe8d2ce86165a978d719ebf647f362d33fca29cd179fb42401cbaf3df0c614056f9c8f3cfd51e474afb6bc6974f78db8aba8e9e517fded658591ab7502bd41849462f", 16);
        BigInteger.valueOf(743L).bitLength();
    }
    
    public static BigInteger a(final int n, final int n2, final byte[] array) {
        if (n == 0) {
            final byte[] array2 = array;
            if (n2 == array.length) {
                return new BigInteger(1, array2);
            }
        }
        final byte[] array2 = new byte[n2];
        System.arraycopy(array, n, array2, 0, n2);
        return new BigInteger(1, array2);
    }
}
