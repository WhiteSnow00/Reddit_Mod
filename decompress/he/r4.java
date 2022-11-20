// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.util.Iterator;
import java.security.GeneralSecurityException;
import java.util.logging.Level;
import java.util.Arrays;
import a01.a;

public final class r4 implements h2
{
    public final a3 a;
    
    public r4(final a3 a) {
        this.a = a;
        if (a.d.a.isEmpty() ^ true) {
            Object c;
            if ((c = h6.b.a.get()) == null) {
                c = h6.c;
            }
            a01.a.e0(a);
            ((e7)c).zza();
            ((e7)c).zza();
        }
    }
    
    public final byte[] a(final byte[] array, final byte[] array2) throws GeneralSecurityException {
        final int length = array.length;
        if (length > 5) {
            final byte[] copy = Arrays.copyOf(array, 5);
            final byte[] copyOfRange = Arrays.copyOfRange(array, 5, length);
            for (final b3 b3 : this.a.a(copy)) {
                try {
                    final byte[] a = ((h2)b3.a).a(copyOfRange, array2);
                    final int length2 = copyOfRange.length;
                    return a;
                }
                catch (final GeneralSecurityException ex) {
                    s4.a.logp(Level.INFO, "com.google.crypto.tink.daead.DeterministicAeadWrapper$WrappedDeterministicAead", "decryptDeterministically", "ciphertext prefix matches a key, but cannot decrypt: ".concat(ex.toString()));
                    continue;
                }
                break;
            }
        }
        final Iterator iterator2 = this.a.a(fa.a).iterator();
        while (true) {
            Label_0173: {
                if (!iterator2.hasNext()) {
                    break Label_0173;
                }
                final b3 b4 = (b3)iterator2.next();
                try {
                    return ((h2)b4.a).a(array, array2);
                    throw new GeneralSecurityException("decryption failed");
                }
                catch (final GeneralSecurityException ex2) {}
            }
        }
    }
}
