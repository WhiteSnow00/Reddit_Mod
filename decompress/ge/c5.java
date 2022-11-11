// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Mac;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.io.Serializable;

public final class c5
{
    public Serializable a = a;
    
    public final byte[] a() throws GeneralSecurityException {
        final String s = (String)this.a;
        final int hashCode = s.hashCode();
        int n = 0;
        Label_0078: {
            if (hashCode != 984523022) {
                if (hashCode != 984524074) {
                    if (hashCode == 984525777) {
                        if (s.equals("HmacSha512")) {
                            n = 2;
                            break Label_0078;
                        }
                    }
                }
                else if (s.equals("HmacSha384")) {
                    n = 1;
                    break Label_0078;
                }
            }
            else if (s.equals("HmacSha256")) {
                n = 0;
                break Label_0078;
            }
            n = -1;
        }
        if (n == 0) {
            return n5.f;
        }
        if (n == 1) {
            return n5.g;
        }
        if (n == 2) {
            return n5.h;
        }
        throw new GeneralSecurityException("Could not determine HPKE KDF ID");
    }
    
    public final byte[] b(byte[] doFinal, final int n, final byte[] array) throws GeneralSecurityException {
        final Mac mac = (Mac)r9.f.a((String)this.a);
        if (n <= mac.getMacLength() * 255) {
            final byte[] array2 = new byte[n];
            mac.init(new SecretKeySpec(doFinal, (String)this.a));
            doFinal = new byte[0];
            int n2 = 1;
            int n3 = 0;
            while (true) {
                mac.update(doFinal);
                mac.update(array);
                mac.update((byte)n2);
                doFinal = mac.doFinal();
                final int length = doFinal.length;
                final int n4 = n3 + length;
                if (n4 >= n) {
                    break;
                }
                System.arraycopy(doFinal, 0, array2, n3, length);
                ++n2;
                n3 = n4;
            }
            System.arraycopy(doFinal, 0, array2, n3, n - n3);
            return array2;
        }
        throw new GeneralSecurityException("size too large");
    }
    
    public final byte[] c(final byte[] array, final byte[] array2) throws GeneralSecurityException {
        final Mac mac = (Mac)r9.f.a((String)this.a);
        if (array2 != null && array2.length != 0) {
            mac.init(new SecretKeySpec(array2, (String)this.a));
        }
        else {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], (String)this.a));
        }
        return mac.doFinal(array);
    }
}
