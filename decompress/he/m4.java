// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.GCMParameterSpec;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

public final class m4 implements e2
{
    public static final l4 b;
    public final SecretKeySpec a;
    
    static {
        b = new l4(0);
    }
    
    public m4(final byte[] array) throws GeneralSecurityException {
        ea.b(array.length);
        this.a = new SecretKeySpec(array, "AES");
    }
    
    public final byte[] a(final byte[] array, final byte[] array2) throws GeneralSecurityException {
        if (array.length >= 28) {
            AlgorithmParameterSpec algorithmParameterSpec;
            try {
                Class.forName("javax.crypto.spec.GCMParameterSpec");
                algorithmParameterSpec = new GCMParameterSpec(128, array, 0, 12);
            }
            catch (final ClassNotFoundException ex) {
                if (!da.a()) {
                    throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
                }
                algorithmParameterSpec = new IvParameterSpec(array, 0, 12);
            }
            final l4 b = m4.b;
            ((ThreadLocal<Cipher>)b).get().init(2, this.a, algorithmParameterSpec);
            return ((ThreadLocal<Cipher>)b).get().doFinal(array, 12, array.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
    
    public final byte[] b(final byte[] array, final byte[] array2) throws GeneralSecurityException {
        throw null;
    }
}
