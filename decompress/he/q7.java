// 
// Decompiled by Procyon v0.6.0
// 

package he;

import javax.crypto.KeyAgreement;
import java.security.Signature;
import java.security.Provider;

public class q7 implements w9
{
    public final int a;
    
    public q7() {
        this.a = 0;
    }
    
    public q7(final int n) {
        this.a = 3;
    }
    
    public q7(final Object o) {
        this.a = 1;
    }
    
    public final /* bridge */ Object a(final String s, final Provider provider) {
        switch (this.a) {
            default: {
                Signature signature;
                if (provider == null) {
                    signature = Signature.getInstance(s);
                }
                else {
                    signature = Signature.getInstance(s, provider);
                }
                return signature;
            }
            case 1: {
                KeyAgreement keyAgreement;
                if (provider == null) {
                    keyAgreement = KeyAgreement.getInstance(s);
                }
                else {
                    keyAgreement = KeyAgreement.getInstance(s, provider);
                }
                return keyAgreement;
            }
        }
    }
}
