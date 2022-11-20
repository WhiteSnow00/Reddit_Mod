// 
// Decompiled by Procyon v0.6.0
// 

package he;

import javax.crypto.Cipher;
import java.security.MessageDigest;
import java.security.Provider;

public class t9 implements w9
{
    public final int a;
    
    public t9(final int n) {
        this.a = 0;
    }
    
    public final /* bridge */ Object a(final String s, final Provider provider) {
        switch (this.a) {
            default: {
                MessageDigest messageDigest;
                if (provider == null) {
                    messageDigest = MessageDigest.getInstance(s);
                }
                else {
                    messageDigest = MessageDigest.getInstance(s, provider);
                }
                return messageDigest;
            }
            case 0: {
                Cipher cipher;
                if (provider == null) {
                    cipher = Cipher.getInstance(s);
                }
                else {
                    cipher = Cipher.getInstance(s, provider);
                }
                return cipher;
            }
        }
    }
}
