// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import java.security.GeneralSecurityException;

public final class g9 extends ThreadLocal
{
    public final Object initialValue() {
        try {
            return r9.e.a("AES/CTR/NoPadding");
        }
        catch (final GeneralSecurityException ex) {
            throw new IllegalStateException(ex);
        }
    }
}
