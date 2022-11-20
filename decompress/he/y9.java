// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.util.Arrays;
import java.security.InvalidAlgorithmParameterException;
import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class y9 implements i7
{
    public final SecretKeySpec a;
    public final byte[] b;
    public final byte[] c;
    
    public y9(byte[] h) throws GeneralSecurityException {
        ea.b(h.length);
        final SecretKeySpec a = new SecretKeySpec(h, "AES");
        this.a = a;
        if (fa.d(1)) {
            final Cipher cipher = (Cipher)s9.e.a("AES/ECB/NoPadding");
            cipher.init(1, a);
            h = g2.h(cipher.doFinal(new byte[16]));
            this.b = h;
            this.c = g2.h(h);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }
    
    public final byte[] a(final int n, final byte[] array) throws GeneralSecurityException {
        if (n > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (fa.d(1)) {
            final Cipher cipher = (Cipher)s9.e.a("AES/ECB/NoPadding");
            cipher.init(1, this.a);
            final int length = array.length;
            final int max = Math.max(1, (int)Math.ceil(length / 16.0));
            byte[] array2;
            if (max * 16 == length) {
                array2 = g2.l(array, (max - 1) * 16, 0, 16, this.b);
            }
            else {
                final byte[] copyOfRange = Arrays.copyOfRange(array, (max - 1) * 16, length);
                final int length2 = copyOfRange.length;
                if (length2 >= 16) {
                    throw new IllegalArgumentException("x must be smaller than a block.");
                }
                final byte[] copy = Arrays.copyOf(copyOfRange, 16);
                copy[length2] = -128;
                array2 = g2.k(copy, this.c);
            }
            byte[] doFinal = new byte[16];
            for (int i = 0; i < max - 1; ++i) {
                doFinal = cipher.doFinal(g2.l(doFinal, 0, i * 16, 16, array));
            }
            return Arrays.copyOf(cipher.doFinal(g2.k(array2, doFinal)), n);
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }
}
