// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;

public class u9 implements w9
{
    public static String b(final int n) {
        if (n == 2) {
            return "KEM_UNKNOWN";
        }
        if (n == 3) {
            return "DHKEM_X25519_HKDF_SHA256";
        }
        if (n == 4) {
            return "DHKEM_P256_HKDF_SHA256";
        }
        if (n == 5) {
            return "DHKEM_P384_HKDF_SHA384";
        }
        if (n != 6) {
            return "UNRECOGNIZED";
        }
        return "DHKEM_P521_HKDF_SHA512";
    }
    
    public /* bridge */ Object a(final String s, final Provider provider) throws GeneralSecurityException {
        KeyFactory keyFactory;
        if (provider == null) {
            keyFactory = KeyFactory.getInstance(s);
        }
        else {
            keyFactory = KeyFactory.getInstance(s, provider);
        }
        return keyFactory;
    }
}
