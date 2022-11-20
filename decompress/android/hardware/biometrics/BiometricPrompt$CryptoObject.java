// 
// Decompiled by Procyon v0.6.0
// 

package android.hardware.biometrics;

import javax.crypto.Mac;
import javax.crypto.Cipher;
import java.security.Signature;
import android.annotation.NonNull;
import android.security.identity.IdentityCredential;

public final class BiometricPrompt$CryptoObject
{
    static {
        throw new NoClassDefFoundError();
    }
    
    @Deprecated
    public BiometricPrompt$CryptoObject(@NonNull final IdentityCredential identityCredential) {
    }
    
    public BiometricPrompt$CryptoObject(@NonNull final Signature signature) {
    }
    
    public BiometricPrompt$CryptoObject(@NonNull final Cipher cipher) {
    }
    
    public BiometricPrompt$CryptoObject(@NonNull final Mac mac) {
    }
    
    public native Cipher getCipher();
    
    public native Mac getMac();
    
    public native Signature getSignature();
}
