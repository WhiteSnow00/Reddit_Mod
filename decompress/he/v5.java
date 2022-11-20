// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.util.Locale;
import android.util.Log;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.security.GeneralSecurityException;
import java.io.IOException;
import java.security.KeyStore;

public final class v5 implements x2
{
    public KeyStore a;
    
    public v5() throws GeneralSecurityException {
        KeyStore instance = null;
        try {
            instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load(null);
            this.a = instance;
            return;
        }
        catch (final IOException instance) {}
        catch (final GeneralSecurityException ex) {}
        throw new IllegalStateException((Throwable)instance);
    }
    
    public final u5 a(final String s) throws GeneralSecurityException {
        synchronized (this) {
            final u5 u5 = new u5(ea.a(s), this.a);
            final byte[] a = ca.a(10);
            final byte[] array = new byte[0];
            if (Arrays.equals(a, u5.a(u5.b(a, array), array))) {
                return u5;
            }
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
    }
    
    public final boolean b(String a) throws GeneralSecurityException {
        monitorenter(this);
        try {
            a = ea.a((String)a);
            try {
                return this.a.containsAlias((String)a);
            }
            catch (final NullPointerException ex) {
                Log.w("v5", "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
                try {
                    Thread.sleep(20L);
                    (this.a = KeyStore.getInstance("AndroidKeyStore")).load(null);
                    return this.a.containsAlias((String)a);
                }
                catch (final IOException ex2) {
                    throw new GeneralSecurityException(ex2);
                }
                catch (final InterruptedException ex3) {}
            }
        }
        finally {}
    }
    
    public final boolean i(final String s) {
        synchronized (this) {
            return s.toLowerCase(Locale.US).startsWith("android-keystore://");
        }
    }
}
