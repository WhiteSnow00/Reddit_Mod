// 
// Decompiled by Procyon v0.6.0
// 

package jm2;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.X509EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import kk2.q;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.KeySpec;
import org.bouncycastle.pqc.jcajce.provider.sphincs.BCSphincs256PublicKey;
import java.security.PublicKey;
import java.io.IOException;
import org.bouncycastle.pqc.jcajce.provider.sphincs.BCSphincs256PrivateKey;
import java.security.PrivateKey;
import ml2.b;
import java.security.KeyFactorySpi;

public final class a extends KeyFactorySpi implements b
{
    @Override
    public final PrivateKey a(final tk2.b b) throws IOException {
        return new BCSphincs256PrivateKey(b);
    }
    
    @Override
    public final PublicKey b(final xk2.b b) throws IOException {
        return new BCSphincs256PublicKey(b);
    }
    
    public final PrivateKey engineGeneratePrivate(final KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            final byte[] encoded = ((PKCS8EncodedKeySpec)keySpec).getEncoded();
            try {
                return new BCSphincs256PrivateKey(tk2.b.i((Object)q.o(encoded)));
            }
            catch (final Exception ex) {
                throw new InvalidKeySpecException(ex.toString());
            }
        }
        final StringBuilder t = a.t("Unsupported key specification: ");
        t.append(keySpec.getClass());
        t.append(".");
        throw new InvalidKeySpecException(t.toString());
    }
    
    public final PublicKey engineGeneratePublic(final KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            final byte[] encoded = ((X509EncodedKeySpec)keySpec).getEncoded();
            try {
                return new BCSphincs256PublicKey(xk2.b.i((Object)encoded));
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
        if (key instanceof BCSphincs256PrivateKey) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(clazz)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        }
        else {
            if (!(key instanceof BCSphincs256PublicKey)) {
                final StringBuilder t = a.t("Unsupported key type: ");
                t.append(key.getClass());
                t.append(".");
                throw new InvalidKeySpecException(t.toString());
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
        if (!(key instanceof BCSphincs256PrivateKey) && !(key instanceof BCSphincs256PublicKey)) {
            throw new InvalidKeyException("Unsupported key type");
        }
        return key;
    }
}
