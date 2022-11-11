// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import aa1.a;
import javax.crypto.spec.SecretKeySpec;
import od.z1;

public final class b4
{
    public static final z1 c;
    public final SecretKeySpec a;
    public final boolean b;
    
    static {
        c = new z1(1);
    }
    
    public b4(final byte[] array, final boolean b) throws GeneralSecurityException {
        if (aa1.a.s1(2)) {
            fa.b(array.length);
            this.a = new SecretKeySpec(array, "AES");
            this.b = b;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
    
    public final byte[] a(final byte[] array, final byte[] array2) throws GeneralSecurityException {
        final int length = array.length;
        final int n = 12;
        if (length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        final boolean b = this.b;
        int n2;
        if (!b) {
            n2 = 16;
        }
        else {
            n2 = 28;
        }
        final int length2 = array2.length;
        if (length2 < n2) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (b && !ByteBuffer.wrap(array).equals(ByteBuffer.wrap(array2, 0, 12))) {
            throw new GeneralSecurityException("iv does not match prepended iv");
        }
        AlgorithmParameterSpec algorithmParameterSpec = null;
        Label_0143: {
            if (ea.a()) {
                int int1;
                try {
                    int1 = Class.forName("android.os.Build$VERSION").getDeclaredField("SDK_INT").getInt(null);
                }
                catch (final ClassNotFoundException | NoSuchFieldException | IllegalAccessException ex) {
                    int1 = -1;
                }
                if (int1 <= 19) {
                    algorithmParameterSpec = new IvParameterSpec(array, 0, 12);
                    break Label_0143;
                }
            }
            algorithmParameterSpec = new GCMParameterSpec(128, array, 0, 12);
        }
        final z1 c = b4.c;
        ((ThreadLocal<Cipher>)c).get().init(2, this.a, algorithmParameterSpec);
        final boolean b2 = this.b;
        int n3 = n;
        if (!b2) {
            n3 = 0;
        }
        int n4 = length2;
        if (b2) {
            n4 = length2 - 12;
        }
        return ((ThreadLocal<Cipher>)c).get().doFinal(array2, n3, n4);
    }
}
