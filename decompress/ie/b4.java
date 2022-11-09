// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.security.GeneralSecurityException;

public final class b4 extends ThreadLocal
{
    public final /* synthetic */ int a;
    
    public final Object initialValue() {
        switch (this.a) {
            case 1: {
                try {
                    return u9.e.a("AES/GCM-SIV/NoPadding");
                }
                catch (final GeneralSecurityException ex) {
                    throw new IllegalStateException(ex);
                }
            }
            case 0: {
                try {
                    return u9.e.a("AES/GCM/NoPadding");
                }
                catch (final GeneralSecurityException ex2) {
                    throw new IllegalStateException(ex2);
                }
                break;
            }
        }
        try {
            return u9.e.a("AES/CTR/NOPADDING");
        }
        catch (final GeneralSecurityException ex3) {
            throw new IllegalStateException(ex3);
        }
    }
}
