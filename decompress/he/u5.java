// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import android.util.Log;
import java.security.ProviderException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import javax.crypto.SecretKey;

public final class u5 implements e2
{
    public final SecretKey a;
    
    public u5(final String s, final KeyStore keyStore) throws GeneralSecurityException {
        final SecretKey a = (SecretKey)keyStore.getKey(s, null);
        this.a = a;
        if (a != null) {
            return;
        }
        throw new InvalidKeyException("Keystore cannot load the key with ID: ".concat(String.valueOf(s)));
    }
    
    public final byte[] a(final byte[] array, final byte[] array2) throws GeneralSecurityException {
        byte[] c = null;
        try {
            c = this.c(array, array2);
            return c;
        }
        catch (final GeneralSecurityException c) {}
        catch (final ProviderException ex) {}
        Log.w("u5", "encountered a potentially transient KeyStore error, will wait and retry", (Throwable)(Object)c);
        final long n = (int)(Math.random() * 100.0);
        try {
            Thread.sleep(n);
            return this.c(array, array2);
        }
        catch (final InterruptedException ex2) {
            return this.c(array, array2);
        }
    }
    
    public final byte[] b(final byte[] array, final byte[] array2) throws GeneralSecurityException {
        byte[] d = null;
        try {
            d = this.d(array, array2);
            return d;
        }
        catch (final GeneralSecurityException d) {}
        catch (final ProviderException ex) {}
        Log.w("u5", "encountered a potentially transient KeyStore error, will wait and retry", (Throwable)(Object)d);
        final long n = (int)(Math.random() * 100.0);
        try {
            Thread.sleep(n);
            return this.d(array, array2);
        }
        catch (final InterruptedException ex2) {
            return this.d(array, array2);
        }
    }
    
    public final byte[] c(final byte[] array, final byte[] array2) throws GeneralSecurityException {
        final int length = array.length;
        if (length >= 28) {
            final GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(128, array, 0, 12);
            final Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(2, this.a, gcmParameterSpec);
            instance.updateAAD(array2);
            return instance.doFinal(array, 12, length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
    
    public final byte[] d(final byte[] array, final byte[] array2) throws GeneralSecurityException {
        final int length = array.length;
        if (length <= 2147483619) {
            final byte[] array3 = new byte[length + 28];
            final Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(1, this.a);
            instance.updateAAD(array2);
            instance.doFinal(array, 0, length, array3, 12);
            System.arraycopy(instance.getIV(), 0, array3, 0, 12);
            return array3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
