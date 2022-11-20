// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.Provider;

public final class p6 implements w9
{
    public final /* bridge */ Object a(final String s, final Provider provider) throws GeneralSecurityException {
        KeyPairGenerator keyPairGenerator;
        if (provider == null) {
            keyPairGenerator = KeyPairGenerator.getInstance(s);
        }
        else {
            keyPairGenerator = KeyPairGenerator.getInstance(s, provider);
        }
        return keyPairGenerator;
    }
}
