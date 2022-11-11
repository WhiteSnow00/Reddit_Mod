// 
// Decompiled by Procyon v0.6.0
// 

package lm2;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.X509EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import ok2.q;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.KeySpec;
import org.bouncycastle.pqc.jcajce.provider.qtesla.BCqTESLAPublicKey;
import java.security.PublicKey;
import java.io.IOException;
import org.bouncycastle.pqc.jcajce.provider.qtesla.BCqTESLAPrivateKey;
import java.security.PrivateKey;
import ql2.b;
import java.security.KeyFactorySpi;

public final class a extends KeyFactorySpi implements b
{
    @Override
    public final PrivateKey a(final xk2.b b) throws IOException {
        return (PrivateKey)new BCqTESLAPrivateKey(b);
    }
    
    @Override
    public final PublicKey b(final bl2.b b) throws IOException {
        return (PublicKey)new BCqTESLAPublicKey(b);
    }
    
    public final PrivateKey engineGeneratePrivate(final KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            final byte[] encoded = ((PKCS8EncodedKeySpec)keySpec).getEncoded();
            try {
                return (PrivateKey)new BCqTESLAPrivateKey(xk2.b.k((Object)q.o(encoded)));
            }
            catch (final Exception ex) {
                throw new InvalidKeySpecException(ex.toString());
            }
        }
        final StringBuilder r = a.r("Unsupported key specification: ");
        r.append(keySpec.getClass());
        r.append(".");
        throw new InvalidKeySpecException(r.toString());
    }
    
    public final PublicKey engineGeneratePublic(final KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            final byte[] encoded = ((X509EncodedKeySpec)keySpec).getEncoded();
            try {
                return (PublicKey)new BCqTESLAPublicKey(bl2.b.k((Object)encoded));
            }
            catch (final Exception ex) {
                throw new InvalidKeySpecException(ex.toString());
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unknown key specification: ");
        sb.append(keySpec);
        sb.append(".");
        throw new InvalidKeySpecException(sb.toString());
    }
    
    public final KeySpec engineGetKeySpec(final Key key, final Class clazz) throws InvalidKeySpecException {
        if (key instanceof BCqTESLAPrivateKey) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(clazz)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        }
        else {
            if (!(key instanceof BCqTESLAPublicKey)) {
                final StringBuilder r = a.r("Unsupported key type: ");
                r.append(key.getClass());
                r.append(".");
                throw new InvalidKeySpecException(r.toString());
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(clazz)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unknown key specification: ");
        sb.append(clazz);
        sb.append(".");
        throw new InvalidKeySpecException(sb.toString());
    }
    
    public final Key engineTranslateKey(final Key key) throws InvalidKeyException {
        if (!(key instanceof BCqTESLAPrivateKey) && !(key instanceof BCqTESLAPublicKey)) {
            throw new InvalidKeyException("Unsupported key type");
        }
        return key;
    }
}
