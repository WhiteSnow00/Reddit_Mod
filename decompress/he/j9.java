// 
// Decompiled by Procyon v0.6.0
// 

package he;

import javax.crypto.AEADBadTagException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import java.security.InvalidKeyException;
import aq2.a;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;

public final class j9 implements h2
{
    public static final List c;
    public static final byte[] d;
    public final y9 a;
    public final byte[] b;
    
    static {
        c = Arrays.asList(64);
        d = new byte[16];
    }
    
    public j9(final byte[] array) throws GeneralSecurityException {
        if (!fa.d(1)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        final List c = j9.c;
        final int length = array.length;
        if (c.contains(length)) {
            final int n = length >> 1;
            final byte[] copyOfRange = Arrays.copyOfRange(array, 0, n);
            this.b = Arrays.copyOfRange(array, n, length);
            this.a = new y9(copyOfRange);
            return;
        }
        throw new InvalidKeyException(aq2.a.l("invalid key size: ", length, " bytes; key must have 64 bytes"));
    }
    
    public final byte[] a(byte[] doFinal, byte[] array) throws GeneralSecurityException {
        final int length = doFinal.length;
        if (length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        final Cipher cipher = (Cipher)s9.e.a("AES/CTR/NoPadding");
        final int n = 0;
        final byte[] copyOfRange = Arrays.copyOfRange(doFinal, 0, 16);
        final byte[] array2 = copyOfRange.clone();
        array2[8] &= 0x7F;
        array2[12] &= 0x7F;
        cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(array2));
        final byte[] copyOfRange2 = Arrays.copyOfRange(doFinal, 16, length);
        final byte[] array3 = doFinal = cipher.doFinal(copyOfRange2);
        if (copyOfRange2.length == 0 && (doFinal = array3) == null) {
            doFinal = array3;
            if (da.a()) {
                doFinal = new byte[0];
            }
        }
        final byte[][] array4 = { array, doFinal };
        array = this.a.a(16, j9.d);
        for (int i = 0; i <= 0; ++i) {
            byte[] array5;
            if ((array5 = array4[i]) == null) {
                array5 = new byte[0];
            }
            array = g2.k(g2.h(array), this.a.a(16, array5));
        }
        final byte[] array6 = array4[1];
        final int length2 = array6.length;
        byte[] k;
        if (length2 >= 16) {
            final int length3 = array.length;
            if (length2 < length3) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            final byte[] copy = Arrays.copyOf(array6, length2);
            int n2 = n;
            while (true) {
                k = copy;
                if (n2 >= array.length) {
                    break;
                }
                final int n3 = length2 - length3 + n2;
                copy[n3] ^= array[n2];
                ++n2;
            }
        }
        else {
            final int length4 = array6.length;
            if (length4 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            final byte[] copy2 = Arrays.copyOf(array6, 16);
            copy2[length4] = -128;
            k = g2.k(copy2, g2.h(array));
        }
        if (g2.g(copyOfRange, this.a.a(16, k))) {
            return doFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }
}
