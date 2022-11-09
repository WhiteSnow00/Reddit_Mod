// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.security.GeneralSecurityException;

public final class h9 extends ThreadLocal
{
    public final Object initialValue() {
        try {
            return u9.e.a("AES/CTR/NoPadding");
        }
        catch (final GeneralSecurityException ex) {
            throw new IllegalStateException(ex);
        }
    }
}
