// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.util.Iterator;
import java.security.GeneralSecurityException;
import java.util.logging.Level;
import java.util.Arrays;

public final class x4 implements i2
{
    public final a3 a;
    
    public x4(final a3 a) {
        this.a = a;
    }
    
    public final byte[] a(final byte[] array) throws GeneralSecurityException {
        final int length = array.length;
        if (length > 5) {
            final byte[] copyOfRange = Arrays.copyOfRange(array, 0, 5);
            final byte[] copyOfRange2 = Arrays.copyOfRange(array, 5, length);
            for (final b3 b3 : this.a.a(copyOfRange)) {
                try {
                    return ((i2)b3.a).a(copyOfRange2);
                }
                catch (final GeneralSecurityException ex) {
                    y4.a.logp(Level.INFO, "com.google.crypto.tink.hybrid.HybridDecryptWrapper$WrappedHybridDecrypt", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(String.valueOf(ex.toString())));
                    continue;
                }
                break;
            }
        }
        final Iterator iterator2 = this.a.a(fa.a).iterator();
        while (true) {
            Label_0166: {
                if (!iterator2.hasNext()) {
                    break Label_0166;
                }
                final b3 b4 = (b3)iterator2.next();
                try {
                    return ((i2)b4.a).a(array);
                    throw new GeneralSecurityException("decryption failed");
                }
                catch (final GeneralSecurityException ex2) {}
            }
        }
    }
}
